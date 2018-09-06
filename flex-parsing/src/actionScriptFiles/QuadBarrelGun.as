/**
 * Weapon - Projectile Gun - Multi Barrel
 * Quad Barrel Gun Example
 * ---------------------
 * VERSION: 1.0
 * DATE: 8/16/2011
 * AS3
 * UPDATES AND DOCUMENTATION AT: http://www.FreeActionScript.com
 **/
package com.freeactionscript.weaponsystem
{
	import flash.display.DisplayObjectContainer;
	
	public class QuadBarrelGun extends AbstractWeapon 
	{
		override public function init(container:DisplayObjectContainer, x:Number, y:Number, rotation:Number):void
		{
			// default settings
			super.x = x;
			super.y = y;
			super.rotation = rotation;
			super.container = container;
			
			// add weapon skin
			// WeaponQuadSkin is a movieclip linked in the fla library
			addChild(new WeaponQuadSkin());
			
			// create weapon barrels
			// BarrelTwoSkin is a movieclip linked in the fla library
			// createBarrel(skin, x, y, length) 
			super.createBarrel(new BarrelTwoSkin(), 0, -20, 10)
			super.createBarrel(new BarrelTwoSkin(), 0, -10, 10)
			super.createBarrel(new BarrelTwoSkin(), 0, 10, 10)
			super.createBarrel(new BarrelTwoSkin(), 0, 20, 10)
			
			// set gun parameters
			rotateSpeedMax = 20;
			bulletSpeed = 20;
			maxDistance = 200; // pixels
			reloadSpeed = 250; // milliseconds
			bulletSpread = 5; // pixels
		}
	}

}