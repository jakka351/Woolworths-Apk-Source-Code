package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;

/* loaded from: classes4.dex */
public final class LazyBitmapDrawableResource implements Resource<BitmapDrawable>, Initializable {
    public final Resources d;
    public final Resource e;

    public LazyBitmapDrawableResource(Resources resources, Resource resource) {
        Preconditions.c(resources, "Argument must not be null");
        this.d = resources;
        Preconditions.c(resource, "Argument must not be null");
        this.e = resource;
    }

    public static LazyBitmapDrawableResource b(Resources resources, Resource resource) {
        if (resource == null) {
            return null;
        }
        return new LazyBitmapDrawableResource(resources, resource);
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return new BitmapDrawable(this.d, (Bitmap) this.e.get());
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return this.e.getSize();
    }

    @Override // com.bumptech.glide.load.engine.Initializable
    public final void initialize() {
        Resource resource = this.e;
        if (resource instanceof Initializable) {
            ((Initializable) resource).initialize();
        }
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
        this.e.recycle();
    }
}
