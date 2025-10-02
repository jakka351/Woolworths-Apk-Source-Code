package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class HybridDecryptWrapper implements PrimitiveWrapper<HybridDecrypt> {

    /* loaded from: classes6.dex */
    public static class WrappedHybridDecrypt implements HybridDecrypt {
    }

    static {
        Logger.getLogger(HybridDecryptWrapper.class.getName());
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return HybridDecrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new WrappedHybridDecrypt();
    }
}
