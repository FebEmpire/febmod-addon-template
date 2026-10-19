package com.example.febmod.addon

import com.feb.mod.addon.AddonContext
import com.feb.mod.addon.FebAddon
import com.feb.mod.ui.gui.FebModGui
import com.feb.mod.ui.gui.tabs.FebTab
import net.minecraft.resources.Identifier
import org.slf4j.LoggerFactory

class FebmodAddonTemplate : FebAddon {

	companion object {
		const val MOD_ID = "febmod-addon-template"
	}

	private val LOGGER = LoggerFactory.getLogger(MOD_ID)

	override fun initialize(context: AddonContext) {
		LOGGER.info("FebMod addon initialized!")
	}

	override fun createTab(screen: FebModGui): FebTab {
		// Return your addon's tab here
		TODO("Create your addon tab")
	}

	override fun unload() {
		LOGGER.info("FebMod addon unloaded")
	}

	fun id(path: String): Identifier =
		Identifier.fromNamespaceAndPath(MOD_ID, path)
}