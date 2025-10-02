package com.google.android.gms.internal.vision;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* loaded from: classes5.dex */
public final class zzbj {

    @GuardedBy
    private static final ArrayMap<String, Uri> zza = new ArrayMap<>(0);

    public static synchronized Uri zza(String str) {
        Uri uri;
        try {
            ArrayMap<String, Uri> arrayMap = zza;
            uri = arrayMap.get(str);
            if (uri == null) {
                String strValueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(strValueOf.length() != 0 ? "content://com.google.android.gms.phenotype/".concat(strValueOf) : new String("content://com.google.android.gms.phenotype/"));
                arrayMap.put(str, uri);
            }
        } catch (Throwable th) {
            throw th;
        }
        return uri;
    }
}
