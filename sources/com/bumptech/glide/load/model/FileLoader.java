package com.bumptech.glide.load.model;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public class FileLoader<Data> implements ModelLoader<File, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final FileOpener f13853a;

    /* loaded from: classes.dex */
    public static class Factory<Data> implements ModelLoaderFactory<File, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final FileOpener f13854a;

        public Factory(FileOpener fileOpener) {
            this.f13854a = fileOpener;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new FileLoader(this.f13854a);
        }
    }

    /* loaded from: classes.dex */
    public static class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {

        /* renamed from: com.bumptech.glide.load.model.FileLoader$FileDescriptorFactory$1, reason: invalid class name */
        class AnonymousClass1 implements FileOpener<ParcelFileDescriptor> {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Class a() {
                return ParcelFileDescriptor.class;
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final void b(Object obj) throws IOException {
                ((ParcelFileDescriptor) obj).close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Object c(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public FileDescriptorFactory() {
            super(new AnonymousClass1());
        }
    }

    public static final class FileFetcher<Data> implements DataFetcher<Data> {
        public final File d;
        public final FileOpener e;
        public Object f;

        public FileFetcher(File file, FileOpener fileOpener) {
            this.d = file;
            this.e = fileOpener;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.e.a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            Object obj = this.f;
            if (obj != null) {
                try {
                    this.e.b(obj);
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
                Object objC = this.e.c(this.d);
                this.f = objC;
                dataCallback.e(objC);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                dataCallback.f(e);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface FileOpener<Data> {
        Class a();

        void b(Object obj);

        Object c(File file);
    }

    /* loaded from: classes.dex */
    public static class StreamFactory extends Factory<InputStream> {

        /* renamed from: com.bumptech.glide.load.model.FileLoader$StreamFactory$1, reason: invalid class name */
        class AnonymousClass1 implements FileOpener<InputStream> {
            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Class a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final void b(Object obj) throws IOException {
                ((InputStream) obj).close();
            }

            @Override // com.bumptech.glide.load.model.FileLoader.FileOpener
            public final Object c(File file) {
                return new FileInputStream(file);
            }
        }

        public StreamFactory() {
            super(new AnonymousClass1());
        }
    }

    public FileLoader(FileOpener fileOpener) {
        this.f13853a = fileOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        File file = (File) obj;
        return new ModelLoader.LoadData(new ObjectKey(file), new FileFetcher(file, this.f13853a));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
