package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class GifDrawableTransformation implements Transformation<GifDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Transformation f13940a;

    public GifDrawableTransformation(Transformation transformation) {
        Preconditions.c(transformation, "Argument must not be null");
        this.f13940a = transformation;
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i, int i2) {
        GifDrawable gifDrawable = (GifDrawable) resource.get();
        Resource bitmapResource = new BitmapResource(gifDrawable.c(), Glide.a(context).e);
        Transformation transformation = this.f13940a;
        Resource resourceA = transformation.a(context, bitmapResource, i, i2);
        if (!bitmapResource.equals(resourceA)) {
            bitmapResource.recycle();
        }
        gifDrawable.d.f13939a.j(transformation, (Bitmap) resourceA.get());
        return resource;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof GifDrawableTransformation) {
            return this.f13940a.equals(((GifDrawableTransformation) obj).f13940a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f13940a.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13940a.updateDiskCacheKey(messageDigest);
    }
}
