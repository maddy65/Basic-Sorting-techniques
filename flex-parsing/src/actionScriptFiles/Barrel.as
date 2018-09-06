/**
 * Weapon - Projectile Gun - Multi Barrel
 * Barrel Class
 * ---------------------
 * VERSION: 1.0
 * DATE: 8/16/2011
 * AS3
 * UPDATES AND DOCUMENTATION AT: http://www.FreeActionScript.com
 **/
package com.freeactionscript.weaponsystem.components
{
	import flash.display.DisplayObjectContainer;
	import flash.display.Sprite;
	
	public class Barrel extends Sprite
	{
		// settings
		private var _skin:DisplayObjectContainer;
		private var _relativeX:Number;
		private var _relativeY:Number;
		private var _length:Number
		
		/**
		 * Barrel Constructor
		 * @param	skin	Skin movieclip
		 * @param	x	Relative X position of the barrel from anchor
		 * @param	y	Relative Y position of the barrel from anchor
		 * @param	length	Barrel length in pixels
		 */
		public function Barrel(skin:DisplayObjectContainer, x:Number, y:Number, length:Number) 
		{
			this.skin = skin;
			this.relativeX = x;
			this.relativeY = y
			this.length = length;
			
			addChild(skin);
		}
		
		//////////////////////////////////////
		// Getters & Setters
		//////////////////////////////////////
		
		public function get relativeX():Number 
		{
			return _relativeX;
		}
		
		public function set relativeX(value:Number):void 
		{
			_relativeX = value;
		}
		
		public function get relativeY():Number 
		{
			return _relativeY;
		}
		
		public function set relativeY(value:Number):void 
		{
			_relativeY = value;
		}
		
		public function get length():Number 
		{
			return _length;
		}
		
		public function set length(value:Number):void 
		{
			_length = value;
		}
		
		public function get skin():DisplayObjectContainer 
		{
			return _skin;
		}
		
		public function set skin(value:DisplayObjectContainer):void 
		{
			_skin = value;
		}
		
	}

}