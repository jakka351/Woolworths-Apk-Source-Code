package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;

/* loaded from: classes.dex */
class HybridEncryptWrapper implements PrimitiveWrapper<HybridEncrypt> {

    /* loaded from: classes6.dex */
    public static class WrappedHybridEncrypt implements HybridEncrypt {
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return HybridEncrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedHybridEncrypt();
    }
}
