package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class zzgkj {
    public static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    public static void zzb(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
