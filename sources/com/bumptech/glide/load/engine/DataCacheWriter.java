package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

/* loaded from: classes4.dex */
class DataCacheWriter<DataType> implements DiskCache.Writer {

    /* renamed from: a, reason: collision with root package name */
    public final Encoder f13796a;
    public final Object b;
    public final Options c;

    public DataCacheWriter(Encoder encoder, Object obj, Options options) {
        this.f13796a = encoder;
        this.b = obj;
        this.c = options;
    }

    @Override // com.bumptech.glide.load.engine.cache.DiskCache.Writer
    public final boolean a(File file) {
        return this.f13796a.a(this.b, file, this.c);
    }
}
