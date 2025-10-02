package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeyVerify;
import java.util.logging.Logger;

/* loaded from: classes.dex */
class PublicKeyVerifyWrapper implements PrimitiveWrapper<PublicKeyVerify> {

    /* loaded from: classes6.dex */
    public static class WrappedPublicKeyVerify implements PublicKeyVerify {
    }

    static {
        Logger.getLogger(PublicKeyVerifyWrapper.class.getName());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return PublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedPublicKeyVerify();
    }
}
