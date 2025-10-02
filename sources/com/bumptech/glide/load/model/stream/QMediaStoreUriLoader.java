package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

@RequiresApi
/* loaded from: classes4.dex */
public final class QMediaStoreUriLoader<DataT> implements ModelLoader<Uri, DataT> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13891a;
    public final ModelLoader b;
    public final ModelLoader c;
    public final Class d;

    /* loaded from: classes.dex */
    public static abstract class Factory<DataT> implements ModelLoaderFactory<Uri, DataT> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13892a;
        public final Class b;

        public Factory(Context context, Class cls) {
            this.f13892a = context;
            this.b = cls;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            Class cls = this.b;
            return new QMediaStoreUriLoader(this.f13892a, multiModelLoaderFactory.b(File.class, cls), multiModelLoaderFactory.b(Uri.class, cls), cls);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class FileDescriptorFactory extends Factory<ParcelFileDescriptor> {
        public FileDescriptorFactory(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class InputStreamFactory extends Factory<InputStream> {
        public InputStreamFactory(Context context) {
            super(context, InputStream.class);
        }
    }

    public static final class QMediaStoreUriFetcher<DataT> implements DataFetcher<DataT> {
        public static final String[] n = {"_data"};
        public final Context d;
        public final ModelLoader e;
        public final ModelLoader f;
        public final Uri g;
        public final int h;
        public final int i;
        public final Options j;
        public final Class k;
        public volatile boolean l;
        public volatile DataFetcher m;

        public QMediaStoreUriFetcher(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Uri uri, int i, int i2, Options options, Class cls) {
            this.d = context.getApplicationContext();
            this.e = modelLoader;
            this.f = modelLoader2;
            this.g = uri;
            this.h = i;
            this.i = i2;
            this.j = options;
            this.k = cls;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return this.k;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            DataFetcher dataFetcher = this.m;
            if (dataFetcher != null) {
                dataFetcher.b();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource c() {
            return DataSource.d;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.l = true;
            DataFetcher dataFetcher = this.m;
            if (dataFetcher != null) {
                dataFetcher.cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void d(Priority priority, DataFetcher.DataCallback dataCallback) throws Throwable {
            try {
                DataFetcher dataFetcherE = e();
                if (dataFetcherE == null) {
                    dataCallback.f(new IllegalArgumentException("Failed to build fetcher for: " + this.g));
                } else {
                    this.m = dataFetcherE;
                    if (this.l) {
                        cancel();
                    } else {
                        dataFetcherE.d(priority, dataCallback);
                    }
                }
            } catch (FileNotFoundException e) {
                dataCallback.f(e);
            }
        }

        public final DataFetcher e() throws Throwable {
            ModelLoader.LoadData loadDataA;
            boolean zIsExternalStorageLegacy = Environment.isExternalStorageLegacy();
            Cursor cursor = null;
            Context context = this.d;
            Options options = this.j;
            int i = this.i;
            int i2 = this.h;
            if (zIsExternalStorageLegacy) {
                Uri uri = this.g;
                try {
                    Cursor cursorQuery = context.getContentResolver().query(uri, n, null, null, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                                if (TextUtils.isEmpty(string)) {
                                    throw new FileNotFoundException("File path was empty in media store for: " + uri);
                                }
                                File file = new File(string);
                                cursorQuery.close();
                                loadDataA = this.e.a(file, i2, i, options);
                            }
                        } catch (Throwable th) {
                            th = th;
                            cursor = cursorQuery;
                            if (cursor != null) {
                                cursor.close();
                            }
                            throw th;
                        }
                    }
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                Uri requireOriginal = this.g;
                boolean zA = MediaStoreUtil.a(requireOriginal);
                ModelLoader modelLoader = this.f;
                if (zA && requireOriginal.getPathSegments().contains("picker")) {
                    loadDataA = modelLoader.a(requireOriginal, i2, i, options);
                } else {
                    if (context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        requireOriginal = MediaStore.setRequireOriginal(requireOriginal);
                    }
                    loadDataA = modelLoader.a(requireOriginal, i2, i, options);
                }
            }
            if (loadDataA != null) {
                return loadDataA.c;
            }
            return null;
        }
    }

    public QMediaStoreUriLoader(Context context, ModelLoader modelLoader, ModelLoader modelLoader2, Class cls) {
        this.f13891a = context.getApplicationContext();
        this.b = modelLoader;
        this.c = modelLoader2;
        this.d = cls;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), new QMediaStoreUriFetcher(this.f13891a, this.b, this.c, uri, i, i2, options, this.d));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && MediaStoreUtil.a((Uri) obj);
    }
}
