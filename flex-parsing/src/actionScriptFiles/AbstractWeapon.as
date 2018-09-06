/**
 * Weapon - Projectile Gun - Multi Barrel
 * Abstract Weapon Class
 * ---------------------
 * VERSION: 1.0
 * DATE: 8/16/2011
 * AS3
 * UPDATES AND DOCUMENTATION AT: http://www.FreeActionScript.com
 **/
package com.freeactionscript.weaponsystem
{
	import com.freeactionscript.weaponsystem.components.Barrel;
	import com.freeactionscript.weaponsystem.components.Bullet;
	import flash.display.DisplayObjectContainer;
	import flash.display.MovieClip;
	import flash.display.Sprite;
	import flash.events.TimerEvent;
	import flash.utils.Timer;
	
	///////////////////////////
	/**
	 * This is an Abstract Weapon class. Do not instantiate it directly. Extend it instead and instantiate that class. 
	 * See SingleBarrelGun.as as an example.
	 */
	///////////////////////////
	
	public class AbstractWeapon extends Sprite 
	{
		// weapon settings		
		private var _rotateSpeedMax:Number;
		private var _bulletSpeed:Number;	
		private var _maxDistance:Number;
		private var _reloadSpeed:Number;
		private var _bulletSpread:Number;
		
		// shared vars - do not edit
		private var _isLoaded:Boolean = true;		
		private var _isFiring:Boolean = false;
		private var _endX:Number;
		private var _endY:Number;
		private var _startX:Number;
		private var _startY:Number;
		private var _reloadTimer:Timer;
		
		private var _container:DisplayObjectContainer;
		private var _dx:Number;
		private var _dy:Number;
		private var _pcos:Number;
		private var _psin:Number;
		private var _trueRotation:Number;
		
		private var _tempBarrel:Barrel;
		private var _tempBullet:Bullet;
		private var _tempWall:MovieClip;
		
		private var _barrelDistance:Number;
		private var _barrelRadians:Number;
		private var _weaponRadians:Number;
		private var _totalRadians:Number;
		
		private var _weaponBarrels:Array = [];
		private var _bullets:Array = [];
		private var _solidObjects:Array = [];
		
		/////////////////////////////
		// Public API Methods
		/////////////////////////////
		
		/**
		 * Weapon Init Method
		 * @param	container	Weapon parent container
		 * @param	x	Weapon starting X position
		 * @param	y	Weapon starting Y position
		 * @param	rotation	Weapon starting rotation
		 */
		public function init(container:DisplayObjectContainer, x:Number, y:Number, rotation:Number):void
		{
			// save default settings
			this.container = container;
			this.x = x;
			this.y = y;
			this.rotation = rotation;
		}
		
		/**
		 * Use this method to create a weapon barrel and attach it
		 * to a fixed relative position of the weapon platform
		 * @param	skin	Barrel Skin (movieclip)
		 * @param	x	Relative X position of the barrel from anchor
		 * @param	y	Relative Y position of the barrel from anchor
		 * @param	length	Barrel length in pixels
		 */
		public function createBarrel(skin:DisplayObjectContainer, x:Number, y:Number, length:Number):void 
		{
			// Barrel(skin, x, y, barrelLength);
			tempBarrel = new Barrel(skin, x, y, length);
			
			_barrelDistance = getDistance(tempBarrel.relativeX, tempBarrel.relativeY);
			_barrelRadians = Math.atan2(tempBarrel.relativeY, tempBarrel.relativeX); //in radians
			
			_weaponRadians = this.rotation * Math.PI / 180;
			_totalRadians = _weaponRadians + _barrelRadians;
			
			_startX = this.x + _barrelDistance * Math.cos(_totalRadians);
			_startY = this.y + _barrelDistance * Math.sin(_totalRadians);
			
			tempBarrel.x = _startX;
			tempBarrel.y = _startY;
			
			weaponBarrels.push(tempBarrel);
			
			container.addChild(tempBarrel);
		}
		
		/**
		 * Fire weapon
		 */
		public function fire():void
		{
			// check if firing
			if (!isFiring) return;
			
			// check if reloaded
			if (!isLoaded) return;
			
			// create bullets
			createBullets();
			
			// start reload timer
			reloadTimer = new Timer(_reloadSpeed);
			reloadTimer.addEventListener(TimerEvent.TIMER, reloadTimerHandler);
			reloadTimer.start();
			
			// set reload flag to false
			isLoaded = false;
		}
		
		/**
		 * This method is used to update all weapon systems
		 */
		public function update():void
		{
			updateRotation();
			updateBullets();
			updateBarrels();
			fire();
		}
		
		////////////////////
		// Private Methods
		////////////////////
		
		/**
		 * Creates a bullet for each barrel of the weapon
		 */
		private function createBullets():void
		{
			for (var i:int = 0; i < _weaponBarrels.length; i++)
			{
				tempBarrel = _weaponBarrels[i] as Barrel;
				
				// precalculate the cos & sine
				_pcos = Math.cos(tempBarrel.rotation * Math.PI / 180);
				_psin = Math.sin(tempBarrel.rotation * Math.PI / 180);
				
				// start X & Y
				// calculate the tip of the barrel
				_startX = tempBarrel.x - tempBarrel.length * _pcos;
				_startY = tempBarrel.y - tempBarrel.length * _psin;
				
				// end X & Y
				// calculate where the bullet needs to go
				// aim 50 pixels in front of the barrel
				_endX = _startX - 50 * _pcos + Math.random() * _bulletSpread - _bulletSpread * .5;
				_endY = _startY - 50 * _psin + Math.random() * _bulletSpread - _bulletSpread * .5;
				
				// attach bullet from library
				tempBullet = new Bullet();
				
				// calculate velocity
				tempBullet.vx = (_endX - _startX) / _bulletSpeed;
				tempBullet.vy = (_endY - _startY) / _bulletSpeed;
				
				// set position
				tempBullet.x = _startX;
				tempBullet.y = _startY;
				
				// save starting location
				tempBullet.startX = _startX;
				tempBullet.startY = _startY;
				
				// set maximum allowed travel distance
				tempBullet.maxDistance = _maxDistance + tempBarrel.length;
				
				// add bullet to bullets array
				_bullets.push(tempBullet);
				
				// add to display list
				container.addChild(tempBullet);
			}
		}
		
		/**
		 * Destroys bullet
		 * @param	bullet	Takes bullet movieclip
		 */
		private function destroyBullet(bullet:Bullet):void
		{
			// loop thru _bullets array
			for (var i:int = 0; i < _bullets.length; i++)
			{
				// save a reference to current bullet
				tempBullet = _bullets[i] as Bullet;
				
				// if found bullet in array
				if (tempBullet == bullet)
				{
					// remove from array
					_bullets.splice(i, 1);
					
					// remove from display list
					bullet.parent.removeChild(bullet);
					
					// stop loop
					return;
				}
			}
		}
		
		/**
		 * Reload weapon
		 */
		private function reloadWeapon():void
		{
			isLoaded = true;
		}
		
		/**
		 * Checks for collisions between points and objects in _solidObjects
		 * @return	Collision boolean
		 */
		private function checkCollisions(testX:Number, testY:Number):Boolean
		{
			// if nothing to check against, abort
			if (solidObjects.length == 0) return false;
			
			// loop thru _solidObjects array
			for (var i:int = 0; i < _solidObjects.length; i++)
			{
				// save a reference to current object
				tempWall = _solidObjects[i] as MovieClip;
				
				// do a hit test
				if (tempWall.hitTestPoint(testX, testY, true))
				{
					return true;
					
					// stop loop
					break;
				}
			}
			return false;
		}
		
		/**
		 * Calculate player rotation 
		 */
		private function updateRotation():void
		{
			// calculate rotation based on mouse X & Y
			_dx = this.x - this.parent.mouseX;
			_dy = this.y - this.parent.mouseY;
			
			// which way to rotate
			var rotateTo:Number = getDegrees(getRadians(_dx, _dy));	
			
			// keep rotation positive, between 0 and 360 degrees
			if (rotateTo > this.rotation + 180) rotateTo -= 360;
			if (rotateTo < this.rotation - 180) rotateTo += 360;
			
			// ease rotation
			_trueRotation = (rotateTo - this.rotation) / _rotateSpeedMax;
			
			// update rotation
			this.rotation += _trueRotation;			
		}
		
		/**
		 * Updates bullets
		 */
		private function updateBullets():void
		{
			// loop thru _bullets array
			for (var i:int = 0; i < _bullets.length; i++)
			{
				// save a reference to current bullet
				tempBullet = _bullets[i] as Bullet;
				
				// update bullet position
				tempBullet.x += tempBullet.vx;
				tempBullet.y += tempBullet.vy;
				
				// check if bullet went too far
				if (getDistance(tempBullet.startX - tempBullet.x, tempBullet.startY - tempBullet.y) > tempBullet.maxDistance)
				{
					destroyBullet(tempBullet);
				}
				// check for collision with walls
				else if (checkCollisions(tempBullet.x, tempBullet.y))
				{
					destroyBullet(tempBullet);
				}
			}
		}
		
		
		/**
		 * This method is used to update the barrel position and rotation
		 */
		private function updateBarrels():void 
		{
			// loop thru all barrels
			for (var i:int = 0; i < _weaponBarrels.length; i++)
			{
				// set temp barrel reference
				tempBarrel = _weaponBarrels[i] as Barrel;
				
				// calucate position
				_barrelDistance = getDistance(tempBarrel.relativeX, tempBarrel.relativeY);
				_barrelRadians = Math.atan2(tempBarrel.relativeY, tempBarrel.relativeX);
				_weaponRadians = this.rotation * Math.PI / 180;
				_totalRadians = _weaponRadians + _barrelRadians;
				
				_startX = this.x + _barrelDistance * Math.cos(_totalRadians);
				_startY = this.y + _barrelDistance * Math.sin(_totalRadians);
				
				// set position & rotation
				tempBarrel.x = _startX;
				tempBarrel.y = _startY;				
				tempBarrel.rotation = this.rotation;
			}
		}
		
		//////////////////////////////////////
		// Event Handlers
		//////////////////////////////////////
		
		/**
		 * Reload timer
		 * @param	e	Takes TimerEvent
		 */
		private function reloadTimerHandler(e:TimerEvent):void 
		{
			// stop timer
			e.target.stop();
			
			// clear timer var
			reloadTimer = null;
			
			reloadWeapon();
		}
		
		//////////////////////////////////////
		// Getters and Setters
		//////////////////////////////////////
		
		public function get isFiring():Boolean 
		{
			return _isFiring;
		}
		
		public function set isFiring(value:Boolean):void 
		{
			_isFiring = value;
		}
		
		public function get isLoaded():Boolean 
		{
			return _isLoaded;
		}
		
		public function set isLoaded(value:Boolean):void 
		{
			_isLoaded = value;
		}
		
		public function get solidObjects():Array 
		{
			return _solidObjects;
		}
		
		public function set solidObjects(value:Array):void 
		{
			_solidObjects = value;
		}
		
		public function get container():DisplayObjectContainer 
		{
			return _container;
		}
		
		public function set container(value:DisplayObjectContainer):void 
		{
			_container = value;
		}
		
		public function get rotateSpeedMax():Number 
		{
			return _rotateSpeedMax;
		}
		
		public function set rotateSpeedMax(value:Number):void 
		{
			_rotateSpeedMax = value;
		}
		
		public function get bulletSpeed():Number 
		{
			return _bulletSpeed;
		}
		
		public function set bulletSpeed(value:Number):void 
		{
			_bulletSpeed = value;
		}
		
		public function get maxDistance():Number 
		{
			return _maxDistance;
		}
		
		public function set maxDistance(value:Number):void 
		{
			_maxDistance = value;
		}
		
		public function get reloadSpeed():Number 
		{
			return _reloadSpeed;
		}
		
		public function set reloadSpeed(value:Number):void 
		{
			_reloadSpeed = value;
		}
		
		public function get bulletSpread():Number 
		{
			return _bulletSpread;
		}
		
		public function set bulletSpread(value:Number):void 
		{
			_bulletSpread = value;
		}
		
		public function get reloadTimer():Timer 
		{
			return _reloadTimer;
		}
		
		public function set reloadTimer(value:Timer):void 
		{
			_reloadTimer = value;
		}
		
		public function get weaponBarrels():Array 
		{
			return _weaponBarrels;
		}
		
		public function set weaponBarrels(value:Array):void 
		{
			_weaponBarrels = value;
		}
		
		public function get tempBarrel():Barrel 
		{
			return _tempBarrel;
		}
		
		public function set tempBarrel(value:Barrel):void 
		{
			_tempBarrel = value;
		}
		
		public function get tempBullet():Bullet 
		{
			return _tempBullet;
		}
		
		public function set tempBullet(value:Bullet):void 
		{
			_tempBullet = value;
		}
		
		public function get tempWall():MovieClip 
		{
			return _tempWall;
		}
		
		public function set tempWall(value:MovieClip):void 
		{
			_tempWall = value;
		}
		
		//////////////////////////////////////
		// Utilities
		//////////////////////////////////////
		
		/**
		 * Get distance
		 * @param	delta_x
		 * @param	delta_y
		 * @return
		 */
		public function getDistance(delta_x:Number, delta_y:Number):Number
		{
			return Math.sqrt((delta_x*delta_x)+(delta_y*delta_y));
		}
		
		/**
		 * Get radians
		 * @param	delta_x
		 * @param	delta_y
		 * @return
		 */
		public function getRadians(delta_x:Number, delta_y:Number):Number
		{
			var r:Number = Math.atan2(delta_y, delta_x);
			
			if (delta_y < 0)
			{
				r += (2 * Math.PI);
			}
			return r;
		}
		
		/**
		 * Get degrees
		 * @param	radians	Takes radians
		 * @return	Returns degrees
		 */
		public function getDegrees(radians:Number):Number
		{
			return Math.floor(radians/(Math.PI/180));
		}
	}
}