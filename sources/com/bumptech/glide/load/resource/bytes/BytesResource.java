package com.bumptech.glide.load.resource.bytes;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes4.dex */
public class BytesResource implements Resource<byte[]> {
    public final byte[] d;

    public BytesResource(byte[] bArr) {
        Preconditions.c(bArr, "Argument must not be null");
        this.d = bArr;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.d;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.d.length;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
    }
}
