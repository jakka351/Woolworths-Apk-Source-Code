package com.google.android.gms.internal.vision;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* loaded from: classes5.dex */
public final class zzu {
    public static boolean zza(Context context, String str) {
        return DynamiteModule.getLocalVersion(context, str) > DynamiteModule.getRemoteVersion(context, "com.google.android.gms.vision.dynamite");
    }
}
