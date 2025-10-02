package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeySign;

/* loaded from: classes.dex */
public class PublicKeySignWrapper implements PrimitiveWrapper<PublicKeySign> {

    /* loaded from: classes6.dex */
    public static class WrappedPublicKeySign implements PublicKeySign {
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return PublicKeySign.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedPublicKeySign();
    }
}
