package com.github.piasy.biv.loader;

import android.net.Uri;
import androidx.annotation.UiThread;
import java.io.File;

/* loaded from: classes.dex */
public interface ImageLoader {

    @UiThread
    /* loaded from: classes4.dex */
    public interface Callback {
        void onCacheHit(int i, File file);

        void onCacheMiss(int i, File file);

        void onFail(Exception exc);

        void onFinish();

        void onProgress(int i);

        void onStart();

        void onSuccess(File file);
    }

    void a(int i, Uri uri, Callback callback);

    void b(int i);
}
