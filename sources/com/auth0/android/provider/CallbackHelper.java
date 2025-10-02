package com.auth0.android.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;

/* loaded from: classes.dex */
abstract class CallbackHelper {
    public static String a(String str, String str2, String str3) {
        if (!URLUtil.isValidUrl(str3)) {
            Log.e("CallbackHelper", "The Domain is invalid and the Callback URI will not be set. You used: ".concat(str3));
            return null;
        }
        Uri uriBuild = Uri.parse(str3).buildUpon().scheme(str).appendPath("android").appendPath(str2).appendPath("callback").build();
        Log.v("CallbackHelper", "The Callback URI is: " + uriBuild);
        return uriBuild.toString();
    }
}
