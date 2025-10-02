package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;

/* loaded from: classes.dex */
public class BitmapDrawableDecoder<DataType> implements ResourceDecoder<DataType, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final ResourceDecoder f13896a;
    public final Resources b;

    public BitmapDrawableDecoder(Resources resources, ResourceDecoder resourceDecoder) {
        this.b = resources;
        this.f13896a = resourceDecoder;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return this.f13896a.a(obj, options);
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) {
        return LazyBitmapDrawableResource.b(this.b, this.f13896a.b(obj, i, i2, options));
    }
}
