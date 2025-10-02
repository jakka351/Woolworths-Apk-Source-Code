package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Preconditions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public interface ModelLoader<Model, Data> {

    /* loaded from: classes4.dex */
    public static class LoadData<Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Key f13862a;
        public final List b;
        public final DataFetcher c;

        public LoadData(Key key, DataFetcher dataFetcher) {
            List list = Collections.EMPTY_LIST;
            Preconditions.c(key, "Argument must not be null");
            this.f13862a = key;
            Preconditions.c(list, "Argument must not be null");
            this.b = list;
            Preconditions.c(dataFetcher, "Argument must not be null");
            this.c = dataFetcher;
        }
    }

    LoadData a(Object obj, int i, int i2, Options options);

    boolean b(Object obj);
}
