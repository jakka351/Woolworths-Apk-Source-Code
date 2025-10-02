package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes4.dex */
public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13858a;

    /* loaded from: classes.dex */
    public static final class Factory implements ModelLoaderFactory<Uri, File> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f13859a;

        public Factory(Context context) {
            this.f13859a = context;
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public final ModelLoader d(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.f13859a);
        }
    }

    public static class FilePathFetcher implements DataFetcher<File> {
        public static final String[] f = {"_data"};
        public final Context d;
        public final Uri e;

        public FilePathFetcher(Context context, Uri uri) {
            this.d = context;
            this.e = uri;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return File.class;
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
            Cursor cursorQuery = this.d.getContentResolver().query(this.e, f, null, null, null);
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                dataCallback.e(new File(string));
                return;
            }
            dataCallback.f(new FileNotFoundException("Failed to find file path for: " + this.e));
        }
    }

    public MediaStoreFileLoader(Context context) {
        this.f13858a = context;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), new FilePathFetcher(this.f13858a, uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        return MediaStoreUtil.a((Uri) obj);
    }
}
