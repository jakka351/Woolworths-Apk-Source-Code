package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteArrayLoader<Data> implements ModelLoader<byte[], Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Converter f13846a;

    /* loaded from: classes.dex */
    public static class ByteBufferFactory implements ModelLoaderFactory<byte[], ByteBuffer> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new Converter<ByteBuffer>() { // from class: com.bumptech.glide.load.model.ByteArrayLoader.ByteBufferFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public final Class a() {
                    return ByteBuffer.class;
                }

                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public final Object b(byte[] bArr) {
                    return ByteBuffer.wrap(bArr);
                }
            });
        }
    }

    public interface Converter<Data> {
        Class a();

        Object b(byte[] bArr);
    }

    public static class Fetcher<Data> implements DataFetcher<Data> {
        public final byte[] d;
        public final Converter e;

        public Fetcher(byte[] bArr, Converter converter) {
            this.d = bArr;
            this.e = converter;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.e.a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
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
            dataCallback.e(this.e.b(this.d));
        }
    }

    /* loaded from: classes.dex */
    public static class StreamFactory implements ModelLoaderFactory<byte[], InputStream> {
        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteArrayLoader(new Converter<InputStream>() { // from class: com.bumptech.glide.load.model.ByteArrayLoader.StreamFactory.1
                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public final Class a() {
                    return InputStream.class;
                }

                @Override // com.bumptech.glide.load.model.ByteArrayLoader.Converter
                public final Object b(byte[] bArr) {
                    return new ByteArrayInputStream(bArr);
                }
            });
        }
    }

    public ByteArrayLoader(Converter converter) {
        this.f13846a = converter;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        byte[] bArr = (byte[]) obj;
        return new ModelLoader.LoadData(new ObjectKey(bArr), new Fetcher(bArr, this.f13846a));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
