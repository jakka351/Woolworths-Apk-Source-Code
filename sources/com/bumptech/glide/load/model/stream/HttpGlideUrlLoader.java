package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class HttpGlideUrlLoader implements ModelLoader<GlideUrl, InputStream> {
    public static final Option b = Option.a(2500, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout");

    /* renamed from: a, reason: collision with root package name */
    public final ModelCache f13885a;

    /* loaded from: classes.dex */
    public static class Factory implements ModelLoaderFactory<GlideUrl, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ModelCache f13886a = new ModelCache();

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new HttpGlideUrlLoader(this.f13886a);
        }
    }

    public HttpGlideUrlLoader(ModelCache modelCache) {
        this.f13885a = modelCache;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        GlideUrl glideUrl = (GlideUrl) obj;
        ModelCache modelCache = this.f13885a;
        if (modelCache != null) {
            GlideUrl glideUrl2 = (GlideUrl) modelCache.a(glideUrl);
            if (glideUrl2 == null) {
                modelCache.b(glideUrl, glideUrl);
            } else {
                glideUrl = glideUrl2;
            }
        }
        return new ModelLoader.LoadData(glideUrl, new HttpUrlFetcher(glideUrl, ((Integer) options.b(b)).intValue()));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
