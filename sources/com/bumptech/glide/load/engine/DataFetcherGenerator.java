package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

/* loaded from: classes4.dex */
interface DataFetcherGenerator {

    public interface FetcherReadyCallback {
        void b(Key key, Exception exc, DataFetcher dataFetcher, DataSource dataSource);

        void d(Key key, Object obj, DataFetcher dataFetcher, DataSource dataSource, Key key2);
    }

    boolean a();

    void cancel();
}
