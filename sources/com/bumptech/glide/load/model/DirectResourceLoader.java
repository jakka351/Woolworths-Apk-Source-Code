package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.drawable.DrawableDecoderCompat;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class DirectResourceLoader<DataT> implements ModelLoader<Integer, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13849a;
    public final Object b;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<Integer, AssetFileDescriptor>, ResourceOpener<AssetFileDescriptor> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13850a;

        public AssetFileDescriptorFactory(Context context) {
            this.f13850a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Class a() {
            return AssetFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final void b(Object obj) throws IOException {
            ((AssetFileDescriptor) obj).close();
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Object c(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResourceFd(i);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f13850a, this);
        }
    }

    public static final class DrawableFactory implements ModelLoaderFactory<Integer, Drawable>, ResourceOpener<Drawable> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13851a;

        public DrawableFactory(Context context) {
            this.f13851a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Class a() {
            return Drawable.class;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final /* bridge */ /* synthetic */ void b(Object obj) {
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Object c(int i, Resources.Theme theme, Resources resources) {
            return DrawableDecoderCompat.a(this.f13851a, i, theme);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f13851a, this);
        }
    }

    public static final class InputStreamFactory implements ModelLoaderFactory<Integer, InputStream>, ResourceOpener<InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13852a;

        public InputStreamFactory(Context context) {
            this.f13852a = context;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final void b(Object obj) throws IOException {
            ((InputStream) obj).close();
        }

        @Override // com.bumptech.glide.load.model.DirectResourceLoader.ResourceOpener
        public final Object c(int i, Resources.Theme theme, Resources resources) {
            return resources.openRawResource(i);
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DirectResourceLoader(this.f13852a, this);
        }
    }

    /* loaded from: classes4.dex */
    public static final class ResourceDataFetcher<DataT> implements DataFetcher<DataT> {
        public final Resources.Theme d;
        public final Resources e;
        public final ResourceOpener f;
        public final int g;
        public Object h;

        public ResourceDataFetcher(Resources.Theme theme, Resources resources, ResourceOpener resourceOpener, int i) {
            this.d = theme;
            this.e = resources;
            this.f = resourceOpener;
            this.g = i;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.f.a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            Object obj = this.h;
            if (obj != null) {
                try {
                    this.f.b(obj);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource c() {
            return DataSource.d;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void d(Priority priority, DataFetcher.DataCallback dataCallback) {
            try {
                Object objC = this.f.c(this.g, this.d, this.e);
                this.h = objC;
                dataCallback.e(objC);
            } catch (Resources.NotFoundException e) {
                dataCallback.f(e);
            }
        }
    }

    public interface ResourceOpener<DataT> {
        Class a();

        void b(Object obj);

        Object c(int i, Resources.Theme theme, Resources resources);
    }

    public DirectResourceLoader(Context context, ResourceOpener resourceOpener) {
        this.f13849a = context.getApplicationContext();
        this.b = resourceOpener;
    }

    public static ModelLoaderFactory c(Context context) {
        return new AssetFileDescriptorFactory(context);
    }

    public static ModelLoaderFactory d(Context context) {
        return new DrawableFactory(context);
    }

    public static ModelLoaderFactory e(Context context) {
        return new InputStreamFactory(context);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener, java.lang.Object] */
    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Integer num = (Integer) obj;
        Resources.Theme theme = (Resources.Theme) options.b(ResourceDrawableDecoder.b);
        return new ModelLoader.LoadData(new ObjectKey(num), new ResourceDataFetcher(theme, theme != null ? theme.getResources() : this.f13849a.getResources(), this.b, num.intValue()));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
