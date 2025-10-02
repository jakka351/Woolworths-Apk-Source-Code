package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.Mac;

/* loaded from: classes5.dex */
final class zzhgb extends ThreadLocal {
    final /* synthetic */ zzhgc zza;

    public zzhgb(zzhgc zzhgcVar) {
        Objects.requireNonNull(zzhgcVar);
        this.zza = zzhgcVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            zzhfo zzhfoVar = zzhfo.zzb;
            zzhgc zzhgcVar = this.zza;
            Mac mac = (Mac) zzhfoVar.zzb(zzhgcVar.zzb());
            mac.init(zzhgcVar.zzc());
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
