package com.bumptech.glide.load.model;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.AssetFileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.FileDescriptorLocalUriFetcher;
import com.bumptech.glide.load.data.StreamLocalUriFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public class UriLoader<Data> implements ModelLoader<Uri, Data> {
    public static final Set b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a, reason: collision with root package name */
    public final Object f13880a;

    /* loaded from: classes.dex */
    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Uri, AssetFileDescriptor>, LocalUriFetcherFactory<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f13881a;

        public AssetFileDescriptorFactory(ContentResolver contentResolver) {
            this.f13881a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public final DataFetcher a(Uri uri) {
            return new AssetFileDescriptorLocalUriFetcher(this.f13881a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    /* loaded from: classes.dex */
    public static class FileDescriptorFactory implements ModelLoaderFactory<Uri, ParcelFileDescriptor>, LocalUriFetcherFactory<ParcelFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f13882a;

        public FileDescriptorFactory(ContentResolver contentResolver) {
            this.f13882a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public final DataFetcher a(Uri uri) {
            return new FileDescriptorLocalUriFetcher(this.f13882a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    /* loaded from: classes.dex */
    public interface LocalUriFetcherFactory<Data> {
        DataFetcher a(Uri uri);
    }

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<Uri, InputStream>, LocalUriFetcherFactory<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final ContentResolver f13883a;

        public StreamFactory(ContentResolver contentResolver) {
            this.f13883a = contentResolver;
        }

        @Override // com.bumptech.glide.load.model.UriLoader.LocalUriFetcherFactory
        public final DataFetcher a(Uri uri) {
            return new StreamLocalUriFetcher(this.f13883a, uri);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new UriLoader(this);
        }
    }

    public UriLoader(LocalUriFetcherFactory localUriFetcherFactory) {
        this.f13880a = localUriFetcherFactory;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.bumptech.glide.load.model.UriLoader$LocalUriFetcherFactory, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), this.f13880a.a(uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        return b.contains(((Uri) obj).getScheme());
    }
}
