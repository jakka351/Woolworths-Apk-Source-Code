package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class UrlUriLoader<Data> implements ModelLoader<Uri, Data> {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a, reason: collision with root package name */
    public final ModelLoader f13884a;

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UrlUriLoader(multiModelLoaderFactory.b(GlideUrl.class, InputStream.class));
        }
    }

    public UrlUriLoader(ModelLoader modelLoader) {
        this.f13884a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        return this.f13884a.a(new GlideUrl(((Uri) obj).toString(), Headers.f13855a), i, i2, options);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
