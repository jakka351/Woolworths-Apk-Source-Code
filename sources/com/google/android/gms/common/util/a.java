package com.google.android.gms.common.util;

import android.content.pm.ApkChecksum;
import android.location.LocationRequest;
import android.os.VibratorManager;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ LocationRequest.Builder e(long j) {
        return new LocationRequest.Builder(j);
    }

    public static /* bridge */ /* synthetic */ VibratorManager j(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* synthetic */ void m() {
    }

    public static /* bridge */ /* synthetic */ boolean t(Object obj) {
        return obj instanceof VibratorManager;
    }
}
