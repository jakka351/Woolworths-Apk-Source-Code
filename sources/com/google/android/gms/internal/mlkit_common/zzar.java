package com.google.android.gms.internal.mlkit_common;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public final class zzar {
    public static int zza(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
