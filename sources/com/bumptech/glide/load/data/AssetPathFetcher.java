package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class AssetPathFetcher<T> implements DataFetcher<T> {
    public final String d;
    public final AssetManager e;
    public Object f;

    public AssetPathFetcher(AssetManager assetManager, String str) {
        this.e = assetManager;
        this.d = str;
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    public final void b() {
        Object obj = this.f;
        if (obj == null) {
            return;
        }
        try {
            e(obj);
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
            Object objF = f(this.e, this.d);
            this.f = objF;
            dataCallback.e(objF);
        } catch (IOException e) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e);
            }
            dataCallback.f(e);
        }
    }

    public abstract void e(Object obj);

    public abstract Object f(AssetManager assetManager, String str);
}
