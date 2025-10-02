package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class zzgqq {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzgqp zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzgqp zzgqpVar = (zzgqp) it.next();
            if (zzgqpVar.zza()) {
                return zzgqpVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
