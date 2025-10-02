package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* loaded from: classes.dex */
public final class zzkb {
    public static final /* synthetic */ int zza = 0;

    @GuardedBy
    private static final ArrayMap zzb = new ArrayMap(0);

    public static synchronized Uri zza(String str) {
        ArrayMap arrayMap = zzb;
        Uri uri = (Uri) arrayMap.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        arrayMap.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
