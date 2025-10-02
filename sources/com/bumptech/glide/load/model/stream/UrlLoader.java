package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes4.dex */
public class UrlLoader implements ModelLoader<URL, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final ModelLoader f13893a;

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<URL, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlLoader(multiModelLoaderFactory.b(GlideUrl.class, InputStream.class));
        }
    }

    public UrlLoader(ModelLoader modelLoader) {
        this.f13893a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        return this.f13893a.a(new GlideUrl((URL) obj), i, i2, options);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
