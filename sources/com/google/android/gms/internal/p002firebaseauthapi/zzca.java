package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class zzca {
    private static final CopyOnWriteArrayList<zzbx> zza = new CopyOnWriteArrayList<>();

    public static zzbx zza(String str) throws GeneralSecurityException {
        Iterator<zzbx> it = zza.iterator();
        while (it.hasNext()) {
            zzbx next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(a.A("No KMS client does support: ", str));
    }
}
