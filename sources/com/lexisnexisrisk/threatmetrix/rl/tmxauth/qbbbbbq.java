package com.lexisnexisrisk.threatmetrix.rl.tmxauth;

import android.annotation.TargetApi;
import android.security.keystore.KeyGenParameterSpec;

@TargetApi
/* loaded from: classes6.dex */
public class qbbbbbq {
    private qbbbbbq() {
    }

    public static KeyGenParameterSpec.Builder bbb0062b00620062(KeyGenParameterSpec.Builder builder, byte[] bArr) {
        return builder.setAttestationChallenge(bArr);
    }
}
