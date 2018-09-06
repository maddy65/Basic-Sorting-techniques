/**
 * Weapon - Projectile Gun - Multi Barrel
 * Bullet Class
 * ---------------------
 * VERSION: 1.0
 * DATE: 8/16/2011
 * AS3
 * UPDATES AND DOCUMENTATION AT: http://www.FreeActionScript.com
 **/
package com.freeactionscript.weaponsystem.components
{
	import flash.display.Sprite;
	
	public class Bullet extends Sprite
	{
		// settings
		private var _startX:Number;
		private var _startY:Number;
		private var _vx:Number;
		private var _vy:Number;
		private var _maxDistance:Number;
		
		/**
		 * Constructor
		 */
		public function Bullet() 
		{
			
		}
		
		//////////////////////////////////////
		// Getters & Setters
		//////////////////////////////////////
		
		public function get startX():Number 
		{
			return _startX;
		}
		
		public function set startX(value:Number):void 
		{
			_startX = value;
		}
		
		public function get startY():Number 
		{
			return _startY;
		}
		
		public function set startY(value:Number):void 
		{
			_startY = value;
		}
		
		public function get maxDistance():Number 
		{
			return _maxDistance;
		}
		
		public function set maxDistance(value:Number):void 
		{
			_maxDistance = value;
		}
		
		public function get vx():Number 
		{
			return _vx;
		}
		
		public function set vx(value:Number):void 
		{
			_vx = value;
		}
		
		public function get vy():Number 
		{
			return _vy;
		}
		
		public function set vy(value:Number):void 
		{
			_vy = value;
		}
		
	}

}