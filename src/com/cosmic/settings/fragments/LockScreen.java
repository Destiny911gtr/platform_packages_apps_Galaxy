/*
 * Copyright (C) 2016-2017 Cosmic OS Android Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cosmic.settings.fragments;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import android.content.Intent;

public class LockScreen extends SettingsPreferenceFragment {

      public static void reset(Context mContext) {
            ContentResolver resolver = mContext.getContentResolver();
            Settings.System.putInt(resolver,
                 Settings.System.DOUBLE_TAP_SLEEP_LOCKSCREEN, 0);
      }
}
