package com.cisco.or.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/cisco/or/sdk/utils/Urls;", "", "sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Urls {
    public static String a(Context context) {
        SharedPreferences sharedPreferences = new SharedPrefs(context).f14054a;
        return Intrinsics.c(sharedPreferences.getString("REGION", "US"), "EU") ? "https://api.eu.openroaming.net" : Intrinsics.c(sharedPreferences.getString("REGION", "US"), "SG") ? "https://api.sg.openroaming.net" : "https://api.openroaming.net";
    }
}
