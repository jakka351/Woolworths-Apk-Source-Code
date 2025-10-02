package com.bumptech.glide.load.engine;

import androidx.constraintlayout.core.state.a;
import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DecodeJob;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.UnitTransformation;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.util.MultiClassKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class DecodeHelper<Transcode> {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13797a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public GlideContext c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public DecodeJob.DiskCacheProvider h;
    public Options i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public Key n;
    public Priority o;
    public DiskCacheStrategy p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData loadData = (ModelLoader.LoadData) arrayListB.get(i);
                Key key = loadData.f13862a;
                List list = loadData.b;
                if (!arrayList.contains(key)) {
                    arrayList.add(loadData.f13862a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.f13797a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            Registry registryA = this.c.a();
            List listB = registryA.f13761a.b(this.d);
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                ModelLoader.LoadData loadDataA = ((ModelLoader) listB.get(i)).a(this.d, this.e, this.f, this.i);
                if (loadDataA != null) {
                    arrayList.add(loadDataA);
                }
            }
        }
        return arrayList;
    }

    public final LoadPath c(Class cls) {
        LoadPath loadPath;
        Class cls2;
        Class cls3;
        Class cls4;
        Class cls5 = cls;
        Registry registryA = this.c.a();
        Class cls6 = this.g;
        Class cls7 = this.k;
        LoadPathCache loadPathCache = registryA.i;
        LoadPath loadPath2 = null;
        MultiClassKey multiClassKey = (MultiClassKey) loadPathCache.b.getAndSet(null);
        if (multiClassKey == null) {
            multiClassKey = new MultiClassKey();
        }
        multiClassKey.a(cls5, cls6, cls7);
        synchronized (loadPathCache.f13964a) {
            loadPath = (LoadPath) loadPathCache.f13964a.get(multiClassKey);
        }
        loadPathCache.b.set(multiClassKey);
        registryA.i.getClass();
        if (LoadPathCache.c.equals(loadPath)) {
            return null;
        }
        if (loadPath != null) {
            return loadPath;
        }
        TranscoderRegistry transcoderRegistry = registryA.f;
        ArrayList arrayList = new ArrayList();
        ResourceDecoderRegistry resourceDecoderRegistry = registryA.c;
        Iterator it = resourceDecoderRegistry.d(cls5, cls6).iterator();
        while (it.hasNext()) {
            Class cls8 = (Class) it.next();
            Iterator it2 = transcoderRegistry.b(cls8, cls7).iterator();
            while (it2.hasNext()) {
                Class cls9 = (Class) it2.next();
                arrayList.add(new DecodePath(cls5, cls8, cls9, resourceDecoderRegistry.b(cls5, cls8), transcoderRegistry.a(cls8, cls9), registryA.j));
                cls5 = cls;
            }
            cls5 = cls;
        }
        if (arrayList.isEmpty()) {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
        } else {
            cls2 = cls;
            cls3 = cls6;
            cls4 = cls7;
            loadPath2 = new LoadPath(cls2, cls3, cls4, arrayList, registryA.j);
        }
        LoadPathCache loadPathCache2 = registryA.i;
        synchronized (loadPathCache2.f13964a) {
            loadPathCache2.f13964a.put(new MultiClassKey(cls2, cls3, cls4), loadPath2 != null ? loadPath2 : LoadPathCache.c);
        }
        return loadPath2;
    }

    public final Transformation d(Class cls) {
        Transformation transformation = (Transformation) this.j.get(cls);
        if (transformation == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    transformation = (Transformation) entry.getValue();
                    break;
                }
            }
        }
        if (transformation != null) {
            return transformation;
        }
        if (this.j.isEmpty() && this.q) {
            throw new IllegalArgumentException(a.e(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods."));
        }
        return UnitTransformation.f13895a;
    }
}
