package com.bumptech.glide.load.resource;

import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.io.File;

/* loaded from: classes4.dex */
public class SimpleResource<T> implements Resource<T> {
    public final Object d;

    public SimpleResource(File file) {
        Preconditions.c(file, "Argument must not be null");
        this.d = file;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Class a() {
        return this.d.getClass();
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final Object get() {
        return this.d;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final int getSize() {
        return 1;
    }

    @Override // com.bumptech.glide.load.engine.Resource
    public final void recycle() {
    }
}
