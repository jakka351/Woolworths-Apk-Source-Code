package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

/* loaded from: classes.dex */
public final class UnitBitmapDecoder implements ResourceDecoder<Bitmap, Bitmap> {

    /* loaded from: classes4.dex */
    public static final class NonOwnedBitmapResource implements Resource<Bitmap> {
        public final Bitmap d;

        public NonOwnedBitmapResource(Bitmap bitmap) {
            this.d = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Class a() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final Object get() {
            return this.d;
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final int getSize() {
            return Util.c(this.d);
        }

        @Override // com.bumptech.glide.load.engine.Resource
        public final void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final /* bridge */ /* synthetic */ boolean a(Object obj, Options options) {
        return true;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) {
        return new NonOwnedBitmapResource((Bitmap) obj);
    }
}
