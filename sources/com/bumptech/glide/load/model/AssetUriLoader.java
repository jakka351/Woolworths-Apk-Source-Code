package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorAssetPathFetcher;
import com.bumptech.glide.load.data.StreamAssetPathFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class AssetUriLoader<Data> implements ModelLoader<Uri, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f13843a;
    public final Object b;

    /* loaded from: classes.dex */
    public interface AssetFetcherFactory<Data> {
        DataFetcher a(AssetManager assetManager, String str);
    }

    /* loaded from: classes.dex */
    public static class FileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor>, AssetFetcherFactory<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f13844a;

        public FileDescriptorFactory(AssetManager assetManager) {
            this.f13844a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public final DataFetcher a(AssetManager assetManager, String str) {
            return new FileDescriptorAssetPathFetcher(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f13844a, this);
        }
    }

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream>, AssetFetcherFactory<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final AssetManager f13845a;

        public StreamFactory(AssetManager assetManager) {
            this.f13845a = assetManager;
        }

        @Override // com.bumptech.glide.load.model.AssetUriLoader.AssetFetcherFactory
        public final DataFetcher a(AssetManager assetManager, String str) {
            return new StreamAssetPathFetcher(assetManager, str);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new AssetUriLoader(this.f13845a, this);
        }
    }

    public AssetUriLoader(AssetManager assetManager, AssetFetcherFactory assetFetcherFactory) {
        this.f13843a = assetManager;
        this.b = assetFetcherFactory;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.load.model.AssetUriLoader$AssetFetcherFactory, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), this.b.a(this.f13843a, uri.toString().substring(22)));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        Uri uri = (Uri) obj;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
