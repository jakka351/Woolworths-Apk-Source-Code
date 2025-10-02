package com.bumptech.glide.load.engine;

import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.DataFetcherGenerator;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.util.MultiClassKey;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class ResourceCacheGenerator implements DataFetcherGenerator, DataFetcher.DataCallback<Object> {
    public final DataFetcherGenerator.FetcherReadyCallback d;
    public final DecodeHelper e;
    public int f;
    public int g = -1;
    public Key h;
    public List i;
    public int j;
    public volatile ModelLoader.LoadData k;
    public File l;
    public ResourceCacheKey m;

    public ResourceCacheGenerator(DecodeHelper decodeHelper, DataFetcherGenerator.FetcherReadyCallback fetcherReadyCallback) {
        this.e = decodeHelper;
        this.d = fetcherReadyCallback;
    }

    @Override // com.bumptech.glide.load.engine.DataFetcherGenerator
    public final boolean a() {
        List list;
        ArrayList arrayListD;
        ArrayList arrayListA = this.e.a();
        boolean z = false;
        if (!arrayListA.isEmpty()) {
            DecodeHelper decodeHelper = this.e;
            Registry registryA = decodeHelper.c.a();
            Class<?> cls = decodeHelper.d.getClass();
            Class cls2 = decodeHelper.g;
            Class cls3 = decodeHelper.k;
            ModelToResourceClassCache modelToResourceClassCache = registryA.h;
            MultiClassKey multiClassKey = (MultiClassKey) modelToResourceClassCache.f13965a.getAndSet(null);
            if (multiClassKey == null) {
                multiClassKey = new MultiClassKey(cls, cls2, cls3);
            } else {
                multiClassKey.a(cls, cls2, cls3);
            }
            synchronized (modelToResourceClassCache.b) {
                list = (List) modelToResourceClassCache.b.get(multiClassKey);
            }
            modelToResourceClassCache.f13965a.set(multiClassKey);
            List list2 = list;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                ModelLoaderRegistry modelLoaderRegistry = registryA.f13761a;
                synchronized (modelLoaderRegistry) {
                    arrayListD = modelLoaderRegistry.f13863a.d(cls);
                }
                Iterator it = arrayListD.iterator();
                while (it.hasNext()) {
                    Iterator it2 = registryA.c.d((Class) it.next(), cls2).iterator();
                    while (it2.hasNext()) {
                        Class cls4 = (Class) it2.next();
                        if (!registryA.f.b(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                            arrayList.add(cls4);
                        }
                    }
                }
                ModelToResourceClassCache modelToResourceClassCache2 = registryA.h;
                List listUnmodifiableList = Collections.unmodifiableList(arrayList);
                synchronized (modelToResourceClassCache2.b) {
                    modelToResourceClassCache2.b.put(new MultiClassKey(cls, cls2, cls3), listUnmodifiableList);
                }
                list2 = arrayList;
            }
            if (!list2.isEmpty()) {
                while (true) {
                    List list3 = this.i;
                    if (list3 != null && this.j < list3.size()) {
                        this.k = null;
                        while (!z && this.j < this.i.size()) {
                            List list4 = this.i;
                            int i = this.j;
                            this.j = i + 1;
                            ModelLoader modelLoader = (ModelLoader) list4.get(i);
                            File file = this.l;
                            DecodeHelper decodeHelper2 = this.e;
                            this.k = modelLoader.a(file, decodeHelper2.e, decodeHelper2.f, decodeHelper2.i);
                            if (this.k != null && this.e.c(this.k.c.a()) != null) {
                                this.k.c.d(this.e.o, this);
                                z = true;
                            }
                        }
                        return z;
                    }
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 >= list2.size()) {
                        int i3 = this.f + 1;
                        this.f = i3;
                        if (i3 >= arrayListA.size()) {
                            break;
                        }
                        this.g = 0;
                    }
                    Key key = (Key) arrayListA.get(this.f);
                    Class cls5 = (Class) list2.get(this.g);
                    Transformation transformationD = this.e.d(cls5);
                    DecodeHelper decodeHelper3 = this.e;
                    this.m = new ResourceCacheKey(decodeHelper3.c.f13758a, key, decodeHelper3.n, decodeHelper3.e, decodeHelper3.f, transformationD, cls5, decodeHelper3.i);
                    File fileB = decodeHelper3.h.a().b(this.m);
                    this.l = fileB;
                    if (fileB != null) {
                        this.h = key;
                        this.i = this.e.c.a().f13761a.b(fileB);
                        this.j = 0;
                    }
                }
            } else if (!File.class.equals(this.e.k)) {
                throw new IllegalStateException("Failed to find any load path from " + this.e.d.getClass() + " to " + this.e.k);
            }
        }
        return false;
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
        this.d.d(this.h, obj, this.k.c, DataSource.g, this.m);
    }

    @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
    public final void f(Exception exc) {
        ((DecodeJob) this.d).b(this.m, exc, this.k.c, DataSource.g);
    }
}
