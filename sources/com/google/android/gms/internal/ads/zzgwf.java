package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes5.dex */
public final class zzgwf extends zzgwg {
    public zzgwf(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwg
    public final zzgwe zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgwd(bArr, i);
    }
}
