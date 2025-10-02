package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class LocalUriFetcher<T> implements DataFetcher<T> {
    public final Uri d;
    public final ContentResolver e;
    public Object f;

    public LocalUriFetcher(ContentResolver contentResolver, Uri uri) {
        this.e = contentResolver;
        this.d = uri;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() {
        Object obj = this.f;
        if (obj != null) {
            try {
                e(obj);
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
            Object objF = f(this.e, this.d);
            this.f = objF;
            dataCallback.e(objF);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            dataCallback.f(e);
        }
    }

    public abstract void e(Object obj);

    public abstract Object f(ContentResolver contentResolver, Uri uri);
}
