package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes.dex */
public class BitmapDrawableTranscoder implements ResourceTranscoder<Bitmap, BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f13946a;

    public BitmapDrawableTranscoder(@NonNull Context context) {
        this(context.getResources());
    }

    @Override // com.bumptech.glide.load.resource.transcode.ResourceTranscoder
    public final Resource a(Resource resource, Options options) {
        return LazyBitmapDrawableResource.b(this.f13946a, resource);
    }

    public BitmapDrawableTranscoder(Resources resources) {
        Preconditions.c(resources, "Argument must not be null");
        this.f13946a = resources;
    }
}
