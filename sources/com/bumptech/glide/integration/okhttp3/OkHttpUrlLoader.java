package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* loaded from: classes4.dex */
public class OkHttpUrlLoader implements ModelLoader<GlideUrl, InputStream> {

    /* renamed from: a, reason: collision with root package name */
    public final Call.Factory f13773a;

    /* loaded from: classes.dex */
    public static class Factory implements ModelLoaderFactory<GlideUrl, InputStream> {
        public static volatile OkHttpClient b;

        /* renamed from: a, reason: collision with root package name */
        public final Call.Factory f13774a;

        public Factory(Call.Factory factory) {
            this.f13774a = factory;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new OkHttpUrlLoader(this.f13774a);
        }
    }

    public OkHttpUrlLoader(Call.Factory factory) {
        this.f13773a = factory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        GlideUrl glideUrl = (GlideUrl) obj;
        return new ModelLoader.LoadData(glideUrl, new OkHttpStreamFetcher(this.f13773a, glideUrl));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
