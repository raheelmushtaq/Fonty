package com.marcinorlowski.fonty.demo;

/*
 ******************************************************************************
 *
 * Copyright 2013-2017 Marcin Orlowski
 *
 * Licensed under the Apache License 2.0
 *
 ******************************************************************************
 *
 * @author Marcin Orlowski <mail@MarcinOrlowski.com>
 *
 ******************************************************************************
 */

import com.marcinorlowski.fonty.Fonty;

public class Application extends android.app.Application {

	@Override
	public void onCreate() {
		super.onCreate();

		Fonty
			.context(this)
//			.fontDir("otherFolder")
//			.typefaceFallback(false)
			.regularTypeface("Exo-Regular.ttf")
			.italicTypeface("Aramis-Italic.ttf")
			.boldTypeface("Capture_it.ttf")
			.done();
	}

}
