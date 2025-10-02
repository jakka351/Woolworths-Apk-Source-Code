package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public class MultiModelLoaderFactory {
    public static final Factory e = new Factory();
    public static final ModelLoader f = new EmptyModelLoader();
    public final Pools.Pool d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13867a = new ArrayList();
    public final HashSet c = new HashSet();
    public final Factory b = e;

    public static class EmptyModelLoader implements ModelLoader<Object, Object> {
        @Override // com.bumptech.glide.load.model.ModelLoader
        public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
            return null;
        }

        @Override // com.bumptech.glide.load.model.ModelLoader
        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class Entry<Model, Data> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f13868a;
        public final Class b;
        public final ModelLoaderFactory c;

        public Entry(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
            this.f13868a = cls;
            this.b = cls2;
            this.c = modelLoaderFactory;
        }
    }

    public static class Factory {
    }

    public MultiModelLoaderFactory(Pools.Pool pool) {
        this.d = pool;
    }

    public final synchronized void a(Class cls, Class cls2, ModelLoaderFactory modelLoaderFactory) {
        Entry entry = new Entry(cls, cls2, modelLoaderFactory);
        ArrayList arrayList = this.f13867a;
        arrayList.add(arrayList.size(), entry);
    }

    public final synchronized ModelLoader b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f13867a.iterator();
            boolean z = false;
            while (true) {
                boolean z2 = true;
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (this.c.contains(entry)) {
                    z = true;
                } else {
                    if (!entry.f13868a.isAssignableFrom(cls) || !entry.b.isAssignableFrom(cls2)) {
                        z2 = false;
                    }
                    if (z2) {
                        this.c.add(entry);
                        arrayList.add(entry.c.d(this));
                        this.c.remove(entry);
                    }
                }
            }
            if (arrayList.size() > 1) {
                Factory factory = this.b;
                Pools.Pool pool = this.d;
                factory.getClass();
                return new MultiModelLoader(arrayList, pool);
            }
            if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            }
            if (!z) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return f;
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f13867a.iterator();
            while (it.hasNext()) {
                Entry entry = (Entry) it.next();
                if (!this.c.contains(entry) && entry.f13868a.isAssignableFrom(cls)) {
                    this.c.add(entry);
                    arrayList.add(entry.c.d(this));
                    this.c.remove(entry);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f13867a.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (!arrayList.contains(entry.b) && entry.f13868a.isAssignableFrom(cls)) {
                arrayList.add(entry.b);
            }
        }
        return arrayList;
    }

    public final synchronized ArrayList e() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f13867a.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (entry.f13868a.isAssignableFrom(GlideUrl.class) && entry.b.isAssignableFrom(InputStream.class)) {
                it.remove();
                arrayList.add(entry.c);
            }
        }
        return arrayList;
    }
}
