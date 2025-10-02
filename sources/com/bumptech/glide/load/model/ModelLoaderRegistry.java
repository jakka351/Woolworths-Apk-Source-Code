package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.integration.okhttp3.OkHttpUrlLoader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ModelLoaderRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final MultiModelLoaderFactory f13863a;
    public final ModelLoaderCache b;

    public static class ModelLoaderCache {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f13864a = new HashMap();

        /* loaded from: classes4.dex */
        public static class Entry<Model> {

            /* renamed from: a, reason: collision with root package name */
            public final List f13865a;

            public Entry(List list) {
                this.f13865a = list;
            }
        }
    }

    public ModelLoaderRegistry(Pools.Pool pool) {
        MultiModelLoaderFactory multiModelLoaderFactory = new MultiModelLoaderFactory(pool);
        this.b = new ModelLoaderCache();
        this.f13863a = multiModelLoaderFactory;
    }

    public final synchronized void a(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        this.f13863a.a(cls, cls2, modelLoaderFactory);
        this.b.f13864a.clear();
    }

    public final List b(Object obj) {
        List listUnmodifiableList;
        Class<?> cls = obj.getClass();
        synchronized (this) {
            ModelLoaderCache.Entry entry = (ModelLoaderCache.Entry) this.b.f13864a.get(cls);
            listUnmodifiableList = entry == null ? null : entry.f13865a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(this.f13863a.c(cls));
                if (((ModelLoaderCache.Entry) this.b.f13864a.put(cls, new ModelLoaderCache.Entry(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            ModelLoader modelLoader = (ModelLoader) listUnmodifiableList.get(i);
            if (modelLoader.b(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(modelLoader);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listUnmodifiableList);
        }
        return arrayList;
    }

    public final synchronized void c(OkHttpUrlLoader.Factory factory) {
        ArrayList arrayListE;
        MultiModelLoaderFactory multiModelLoaderFactory = this.f13863a;
        synchronized (multiModelLoaderFactory) {
            arrayListE = multiModelLoaderFactory.e();
            multiModelLoaderFactory.a(GlideUrl.class, InputStream.class, factory);
        }
        Iterator it = arrayListE.iterator();
        while (it.hasNext()) {
            ((ModelLoaderFactory) it.next()).getClass();
        }
        this.b.f13864a.clear();
    }
}
