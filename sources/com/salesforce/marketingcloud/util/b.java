package com.salesforce.marketingcloud.util;

import android.os.Build;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17071a = "Amazon";

    private b() {
    }

    public static boolean a() {
        return Build.MANUFACTURER.equalsIgnoreCase(f17071a);
    }
}
