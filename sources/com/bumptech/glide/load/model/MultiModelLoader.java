package com.bumptech.glide.load.model;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
class MultiModelLoader<Model, Data> implements ModelLoader<Model, Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13866a;
    public final Pools.Pool b;

    public static class MultiFetcher<Data> implements DataFetcher<Data>, DataFetcher.DataCallback<Data> {
        public final ArrayList d;
        public final Pools.Pool e;
        public int f;
        public Priority g;
        public DataFetcher.DataCallback h;
        public List i;
        public boolean j;

        public MultiFetcher(ArrayList arrayList, Pools.Pool pool) {
            this.e = pool;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.d = arrayList;
            this.f = 0;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class a() {
            return ((DataFetcher) this.d.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void b() {
            List list = this.i;
            if (list != null) {
                this.e.b(list);
            }
            this.i = null;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((DataFetcher) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final DataSource c() {
            return ((DataFetcher) this.d.get(0)).c();
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            this.j = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((DataFetcher) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void d(Priority priority, DataFetcher.DataCallback dataCallback) {
            this.g = priority;
            this.h = dataCallback;
            this.i = (List) this.e.a();
            ((DataFetcher) this.d.get(this.f)).d(priority, this);
            if (this.j) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public final void e(Object obj) {
            if (obj != null) {
                this.h.e(obj);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher.DataCallback
        public final void f(Exception exc) {
            List list = this.i;
            Preconditions.c(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        public final void g() {
            if (this.j) {
                return;
            }
            if (this.f < this.d.size() - 1) {
                this.f++;
                d(this.g, this.h);
            } else {
                Preconditions.b(this.i);
                this.h.f(new GlideException("Fetch failed", new ArrayList(this.i)));
            }
        }
    }

    public MultiModelLoader(ArrayList arrayList, Pools.Pool pool) {
        this.f13866a = arrayList;
        this.b = pool;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData a(Object obj, int i, int i2, Options options) {
        ModelLoader.LoadData loadDataA;
        ArrayList arrayList = this.f13866a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        Key key = null;
        for (int i3 = 0; i3 < size; i3++) {
            ModelLoader modelLoader = (ModelLoader) arrayList.get(i3);
            if (modelLoader.b(obj) && (loadDataA = modelLoader.a(obj, i, i2, options)) != null) {
                key = loadDataA.f13862a;
                arrayList2.add(loadDataA.c);
            }
        }
        if (arrayList2.isEmpty() || key == null) {
            return null;
        }
        return new ModelLoader.LoadData(key, new MultiFetcher(arrayList2, this.b));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean b(Object obj) {
        Iterator it = this.f13866a.iterator();
        while (it.hasNext()) {
            if (((ModelLoader) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f13866a.toArray()) + '}';
    }
}
