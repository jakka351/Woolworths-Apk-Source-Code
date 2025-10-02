package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes4.dex */
public final class IntegerArrayAdapter implements ArrayAdapterInterface<int[]> {
    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int a(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final String b() {
        return "IntegerArrayPool";
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final int c() {
        return 4;
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.ArrayAdapterInterface
    public final Object newArray(int i) {
        return new int[i];
    }
}
