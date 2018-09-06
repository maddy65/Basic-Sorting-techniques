/**
 * Weapon - Projectile Gun - Multi Barrel
 * Main.fla Document Class
 * ---------------------
 * VERSION: 1.0
 * DATE: 8/17/2011
 * AS3
 * UPDATES AND DOCUMENTATION AT: http://www.FreeActionScript.com
 **/
package  
{
	import com.freeactionscript.weaponsystem.QuadBarrelGun;
	import com.freeactionscript.weaponsystem.SingleBarrelGun;
	
	import flash.display.DisplayObjectContainer;
	import flash.display.MovieClip;
	import flash.events.Event;
	import flash.events.MouseEvent;
	
	public class Main extends MovieClip
	{
		// weapons
		private var _weapon1:SingleBarrelGun;
		private var _weapon2:QuadBarrelGun;
		
		// solid objects array
		private var _solidObjects:Array;
		
		/**
		 * Constructor
		 */
		public function Main() 
		{
			// populate the _solidObjects array with wall movieclips located on stage in the fla 
			_solidObjects = [wall01, wall02, wall03, wall04];
			
			// add basic listeners
			stage.addEventListener(Event.ENTER_FRAME, enterFrameHandler);
			stage.addEventListener(MouseEvent.MOUSE_DOWN, onMouseDownHandler);
			stage.addEventListener(MouseEvent.MOUSE_UP, onMouseUpHandler);
			
			// create new instances of the Weapon class			
			_weapon1 = new SingleBarrelGun();
			_weapon2 = new QuadBarrelGun();
			
			// add weapon to display list before initializing
			addChild(_weapon1);
			addChild(_weapon2);
			
			// initialize weapons
			// init(container, x, y, rotation)
			_weapon1.init(this, 175, 275, 90);
			_weapon2.init(this, 325, 275, 90);
			
			// Pass an array of solid objects to weapon. Used to test bullet collision
			_weapon1.solidObjects = _solidObjects;
			_weapon2.solidObjects = _solidObjects;
		}
		
		//////////////////////////////////////
		// Event Handlers
		//////////////////////////////////////
		
		/**
		 * Enter Frame handler
		 * @param	event	Uses Event
		 */
		private function enterFrameHandler(event:Event):void
		{
			_weapon1.update();
			_weapon2.update();
		}
		
		/**
		 * Mouse Down handler
		 * @param	e	Uses MouseEvent
		 */
		private function onMouseDownHandler(event:MouseEvent):void 
		{
			_weapon1.isFiring = true;
			_weapon2.isFiring = true;
		}
		
		/**
		 * Mouse Up handler
		 * @param	e	Uses MouseEvent
		 */
		private function onMouseUpHandler(event:MouseEvent):void 
		{
			_weapon1.isFiring = false;
			_weapon2.isFiring = false;
		}
		
	}
}