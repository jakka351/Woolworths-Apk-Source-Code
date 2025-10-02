package com.bumptech.glide.load.resource.bitmap;

import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;

/* loaded from: classes.dex */
public class ResourceBitmapDecoder implements ResourceDecoder<Uri, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    public final ResourceDrawableDecoder f13921a;
    public final BitmapPool b;

    public ResourceBitmapDecoder(ResourceDrawableDecoder resourceDrawableDecoder, BitmapPool bitmapPool) {
        this.f13921a = resourceDrawableDecoder;
        this.b = bitmapPool;
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final boolean a(Object obj, Options options) {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    @Override // com.bumptech.glide.load.ResourceDecoder
    public final Resource b(Object obj, int i, int i2, Options options) throws PackageManager.NameNotFoundException, NumberFormatException {
        Resource resourceC = this.f13921a.c((Uri) obj, options);
        if (resourceC == null) {
            return null;
        }
        return DrawableToBitmapConverter.a(this.b, (Drawable) ((DrawableResource) resourceC).get(), i, i2);
    }
}
