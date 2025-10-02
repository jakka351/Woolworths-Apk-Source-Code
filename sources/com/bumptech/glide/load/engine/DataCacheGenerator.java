package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.util.List;

/* loaded from: classes4.dex */
class DataCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    public final List d;
    public final DecodeHelper e;
    public final DataFetcherGenerator.FetcherReadyCallback f;
    public int g = -1;
    public Key h;
    public List i;
    public int j;
    public volatile ModelLoader.LoadData k;
    public File l;

    public DataCacheGenerator(List list, DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.d = list;
        this.e = decodeHelper;
        this.f = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean a() {
        while (true) {
            List list = this.i;
            boolean z = false;
            if (list != null && this.j < list.size()) {
                this.k = null;
                while (!z && this.j < this.i.size()) {
                    List list2 = this.i;
                    int i = this.j;
                    this.j = i + 1;
                    ModelLoader modelLoader = (ModelLoader) list2.get(i);
                    File file = this.l;
                    DecodeHelper decodeHelper = this.e;
                    this.k = modelLoader.a(file, decodeHelper.e, decodeHelper.f, decodeHelper.i);
                    if (this.k != null && this.e.c(this.k.c.a()) != null) {
                        this.k.c.d(this.e.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.g + 1;
            this.g = i2;
            if (i2 >= this.d.size()) {
                return false;
            }
            Key key = (Key) this.d.get(this.g);
            DecodeHelper decodeHelper2 = this.e;
            File fileB = decodeHelper2.h.a().b(new DataCacheKey(key, decodeHelper2.n));
            this.l = fileB;
            if (fileB != null) {
                this.h = key;
                this.i = this.e.c.a().f13761a.b(fileB);
                this.j = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final void cancel() {
        ModelLoader.LoadData loadData = this.k;
        if (loadData != null) {
            loadData.c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void e(Object obj) {
        this.f.d(this.h, obj, this.k.c, DataSource.f, this.h);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void f(Exception exc) {
        this.f.b(this.h, exc, this.k.c, DataSource.f);
    }
}
