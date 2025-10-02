package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.StreamingAead;

/* loaded from: classes.dex */
public class StreamingAeadWrapper implements PrimitiveWrapper<StreamingAead> {
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class a() {
        return StreamingAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Object b(PrimitiveSet primitiveSet) {
        return new StreamingAeadHelper(primitiveSet);
    }
}
