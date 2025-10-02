package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;

/* loaded from: classes5.dex */
public final class zzaai {
    public static String zza(String str, String str2) {
        if (str2.toLowerCase(Locale.US).startsWith(str)) {
            return str2.substring(str.length());
        }
        throw new IllegalArgumentException(a.A("key URI must start with ", str));
    }

    public static void zza(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i << 3)));
        }
    }
}
