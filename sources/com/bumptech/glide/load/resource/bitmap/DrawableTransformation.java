package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class DrawableTransformation implements Transformation<Drawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Transformation f13912a;
    public final boolean c;

    public DrawableTransformation(Transformation transformation, boolean z) {
        this.f13912a = transformation;
        this.c = z;
    }

    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i, int i2) {
        BitmapPool bitmapPool = Glide.a(context).e;
        Drawable drawable = (Drawable) resource.get();
        BitmapResource bitmapResourceA = DrawableToBitmapConverter.a(bitmapPool, drawable, i, i2);
        if (bitmapResourceA != null) {
            Resource resourceA = this.f13912a.a(context, bitmapResourceA, i, i2);
            if (!resourceA.equals(bitmapResourceA)) {
                return LazyBitmapDrawableResource.b(context.getResources(), resourceA);
            }
            resourceA.recycle();
            return resource;
        }
        if (!this.c) {
            return resource;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof DrawableTransformation) {
            return this.f13912a.equals(((DrawableTransformation) obj).f13912a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f13912a.hashCode();
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.f13912a.updateDiskCacheKey(messageDigest);
    }
}
