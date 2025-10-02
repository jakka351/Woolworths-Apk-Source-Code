package com.bumptech.glide.load.model;

import android.util.Base64;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class DataUrlLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final DataDecoder f13847a;

    /* loaded from: classes.dex */
    public interface DataDecoder<Data> {
    }

    public static final class DataUriFetcher<Data> implements DataFetcher<Data> {
        public final String d;
        public final DataDecoder e;
        public Object f;

        public DataUriFetcher(String str, DataDecoder dataDecoder) {
            this.d = str;
            this.e = dataDecoder;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() throws IOException {
            try {
                ((InputStream) this.f).close();
            } catch (IOException unused) {
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
                ByteArrayInputStream byteArrayInputStreamA = ((StreamFactory.AnonymousClass1) this.e).a(this.d);
                this.f = byteArrayInputStreamA;
                dataCallback.e(byteArrayInputStreamA);
            } catch (IllegalArgumentException e) {
                dataCallback.f(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class StreamFactory<Model> implements ModelLoaderFactory<Model, InputStream> {

        /* renamed from: a, reason: collision with root package name */
        public final DataDecoder f13848a = new AnonymousClass1();

        /* renamed from: com.bumptech.glide.load.model.DataUrlLoader$StreamFactory$1, reason: invalid class name */
        class AnonymousClass1 implements DataDecoder<InputStream> {
            public final ByteArrayInputStream a(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new DataUrlLoader(this.f13848a);
        }
    }

    public DataUrlLoader(DataDecoder dataDecoder) {
        this.f13847a = dataDecoder;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        return new ModelLoader.LoadData(new ObjectKey(obj), new DataUriFetcher(obj.toString(), this.f13847a));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        return obj.toString().startsWith("data:image");
    }
}
