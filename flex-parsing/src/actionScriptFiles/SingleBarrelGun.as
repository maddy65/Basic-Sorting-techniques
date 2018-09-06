/**
 * Weapon - Projectile Gun - Multi Barrel
 * Single Barrel Example
 * ---------------------
 * VERSION: 1.0
 * DATE: 8/16/2011
 * AS3
 * UPDATES AND DOCUMENTATION AT: http://www.FreeActionScript.com
 **/
package com.freeactionscript.weaponsystem  
{
	import flash.display.DisplayObjectContainer;
	
	public class SingleBarrelGun extends AbstractWeapon 
	{
		override public function init(container:DisplayObjectContainer, x:Number, y:Number, rotation:Number):void
		{
			// default settings
			super.x = x;
			super.y = y;
			super.rotation = rotation;
			super.container = container;
			
			// add weapon skin
			// WeaponSingleSkin is a movieclip linked in the fla library
			addChild(new WeaponSingleSkin());
			
			// create weapon barrels
			// BarrelOneSkin is a movieclip linked in the fla library
			// createBarrel(skin, x, y, length) 
			super.createBarrel(new BarrelOneSkin(), -5, 0, 10)
			
			// set gun parameters
			rotateSpeedMax = 5;
			bulletSpeed = 10;
			maxDistance = 200; // pixels
			reloadSpeed = 250; // milliseconds
			bulletSpread = 5; // pixels
			
		}
	}

}