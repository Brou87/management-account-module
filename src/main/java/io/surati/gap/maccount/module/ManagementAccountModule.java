/*
 * Copyright (c) 2022 Surati

 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to read
 * the Software only. Permissions is hereby NOT GRANTED to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software.
	
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package io.surati.gap.maccount.module;

import io.surati.gap.admin.base.api.Module;
import io.surati.gap.web.base.menu.DashboardMenu;
import io.surati.gap.web.base.menu.Menu;
import io.surati.gap.web.base.menu.SimpleMenu;
import io.surati.gap.web.base.menu.SimpleSubmenu;
import org.cactoos.iterable.IterableOf;

/**
 * Admin module.
 *
 * @since 0.1
 */
public enum ManagementAccountModule implements Module {

	MANAGEMENT_ACCOUNT(
		"Compte de gestion",
		"Ce module sert à suivre l'exécution des paiements."
	);

	public static void setup() {
		for (final Module mod : ManagementAccountModule.values()) {
			Module.VALUES.add(mod);
			Module.BY_CODE.put(mod.code(), mod);
		}
		for (final DashboardMenu dmenu : ManagementAccountDashboardMenu.values()) {
			DashboardMenu.VALUES.add(dmenu);
		}
		Menu.VALUES.add(
			new SimpleMenu(
				700,
				"lnr-diamond",
				"Compte de gestion",
				"bg-success",
				"Suivie de l'exécution des paiements",
				new IterableOf<>(
					new SimpleSubmenu(
						1, "lnr-pointer-left", "Documents non fractionnés à enliasser", "/maccount/document-to-bundle/entire/list",
						new IterableOf<>(
							ManagementAccountAccess.VISUALISER_DOCUMENTS_A_ENLIASER
						),
						false
					),
					new SimpleSubmenu(
						2, "lnr-pointer-left", "Documents fractionnés à enliasser", "/maccount/document-to-bundle/partial/list",
						new IterableOf<>(
							ManagementAccountAccess.VISUALISER_DOCUMENTS_A_ENLIASER
						),
						false
					),
					new SimpleSubmenu(
						3, "lnr-book", "Configurer les liasses", "/maccount/bundle",
						new IterableOf<>(
							ManagementAccountAccess.CONFIGURER_LIASSES
						),
						true
					),
					new SimpleSubmenu(
						4, "lnr-book", "Configurer les titres", "/maccount/title",
						new IterableOf<>(
							ManagementAccountAccess.CONFIGURER_TITRES
						),
						false
					),
					new SimpleSubmenu(
						5, "lnr-book", "Configurer les sections", "/maccount/section",
						new IterableOf<>(
							ManagementAccountAccess.CONFIGURER_SECTIONS
						),
						false
					),
					new SimpleSubmenu(
						6, "lnr-book", "Configurer les seuils d'enliassement", "/maccount/bundle-threshold/view",
						new IterableOf<>(
							ManagementAccountAccess.CONFIGURER_SEUILS_ENLIASSEMENT
						),
						false
					)
				)
			)
		);
	}

	/**
	 * Title of access.
	 */
	private String title;

	/**
	 * Description.
	 */
	private String description;

	/**
	 * Ctor.
	 * @param title Title
	 * @param description Description
	 */
	ManagementAccountModule(final String title, final String description) {
		this.title = title;
		this.description = description;
	}
	
	/**
	 * Get title.
	 * @return Title
	 */
	@Override
	public String title() {
		return this.title;
	}

	/**
	 * Get description.
	 * @return Description
	 */
	@Override
	public String description() {
		return this.description;
	}

	/**
	 * Get Code.
	 * @return Code
	 */
	public String code() {
		return this.name();
	}
	
	@Override
	public String toString() {
		return this.title;
	}
}
