/*
 * ConnectBot: simple, powerful, open-source SSH client for Android
 * Copyright 2017 Kenny Root, Jeffrey Sharkey
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.connectbot.util;

//import com.google.android.gms.security.ProviderInstaller;

import android.content.Context;
import android.content.Intent;

/**
 * Created by kenny on 3/2/17.
 */

public final class ProviderLoader {
	public static void load(Context context, ProviderLoaderListener listener) {
//		ProviderInstaller.installIfNeededAsync(context, new ProviderInstallListenerWrapper(listener));
	}

//	private static class ProviderInstallListenerWrapper implements ProviderInstaller.ProviderInstallListener {
//		private final ProviderLoaderListener mListener;
//
//		public ProviderInstallListenerWrapper(ProviderLoaderListener listener) {
//			mListener = listener;
//		}
//
//		@Override
//		public void onProviderInstalled() {
//			mListener.onProviderLoaderSuccess();
//		}
//
//		@Override
//		public void onProviderInstallFailed(int i, Intent intent) {
//			mListener.onProviderLoaderError();
//		}
//	}
}
