package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class StringLoader<Data> implements ModelLoader<String, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ModelLoader f13877a;

    /* loaded from: classes.dex */
    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<String, AssetFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class FileDescriptorFactory implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<String, InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.b(Uri.class, InputStream.class));
        }
    }

    public StringLoader(ModelLoader modelLoader) {
        this.f13877a = modelLoader;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uriFromFile;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uriFromFile = null;
        } else if (str.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str));
        } else {
            Uri uri = Uri.parse(str);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
        }
        if (uriFromFile != null) {
            ModelLoader modelLoader = this.f13877a;
            if (modelLoader.b(uriFromFile)) {
                return modelLoader.a(uriFromFile, i, i2, options);
            }
        }
        return null;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
