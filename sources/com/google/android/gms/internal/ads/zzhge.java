package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes5.dex */
public final class zzhge {
    public static void zza(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
    }
}
