package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;

@Immutable
/* loaded from: classes6.dex */
public class PrfImpl implements Prf {
    public static PrfImpl a(HkdfStreamingPrf hkdfStreamingPrf) {
        return new PrfImpl();
    }
}
