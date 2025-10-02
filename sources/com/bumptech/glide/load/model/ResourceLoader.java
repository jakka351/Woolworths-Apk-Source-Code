package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class ResourceLoader<Data> implements ModelLoader<Integer, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ModelLoader f13869a;
    public final Resources b;

    /* loaded from: classes.dex */
    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f13870a;

        public AssetFileDescriptorFactory(Resources resources) {
            this.f13870a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f13870a, multiModelLoaderFactory.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    @Deprecated
    public static class FileDescriptorFactory implements ModelLoaderFactory<Integer, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(null, multiModelLoaderFactory.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<Integer, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f13871a;

        public StreamFactory(Resources resources) {
            this.f13871a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f13871a, multiModelLoaderFactory.b(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class UriFactory implements ModelLoaderFactory<Integer, Uri> {

        /* renamed from: a, reason: collision with root package name */
        public final Resources f13872a;

        public UriFactory(Resources resources) {
            this.f13872a = resources;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ResourceLoader(this.f13872a, UnitModelLoader.f13878a);
        }
    }

    public ResourceLoader(Resources resources, ModelLoader modelLoader) {
        this.b = resources;
        this.f13869a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uri;
        Integer num = (Integer) obj;
        Resources resources = this.b;
        try {
            uri = Uri.parse("android.resource://" + resources.getResourcePackageName(num.intValue()) + '/' + resources.getResourceTypeName(num.intValue()) + '/' + resources.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.f13869a.a(uri, i, i2, options);
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
