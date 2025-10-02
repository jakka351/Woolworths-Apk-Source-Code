package com.swrve.sdk;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class SwrveIntentHelper {
    public static Intent a(Bundle bundle, String str) {
        Intent data = null;
        try {
            data = new Intent("android.intent.action.VIEW").setData(Uri.parse(str));
            if (bundle != null) {
                data.putExtras(bundle);
            }
            data.addFlags(335609856);
            return data;
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: could not get deeplink intent uri:%s", e, str);
            return data;
        }
    }
}
