package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes4.dex */
public final class ByteArrayAdapter implements ArrayAdapterInterface<byte[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int a(Object obj) {
        return ((byte[]) obj).length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final String b() {
        return "ByteArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int c() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final Object newArray(int i) {
        return new byte[i];
    }
}
