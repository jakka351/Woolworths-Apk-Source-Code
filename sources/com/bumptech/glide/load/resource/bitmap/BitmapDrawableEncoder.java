package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

/* loaded from: classes.dex */
public class BitmapDrawableEncoder implements ResourceEncoder<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final BitmapPool f13897a;
    public final BitmapEncoder b;

    public BitmapDrawableEncoder(BitmapPool bitmapPool, BitmapEncoder bitmapEncoder) {
        this.f13897a = bitmapPool;
        this.b = bitmapEncoder;
    }

    @Override // com.bumptech.glide.load.Encoder
    public final boolean a(Object obj, File file, Options options) {
        return this.b.a(new BitmapResource(((BitmapDrawable) ((Resource) obj).get()).getBitmap(), this.f13897a), file, options);
    }

    @Override // com.bumptech.glide.load.ResourceEncoder
    public final EncodeStrategy b(Options options) {
        return EncodeStrategy.e;
    }
}
