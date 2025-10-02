package com.bumptech.glide.util;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class LruCache<T, Y> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f13986a = new LinkedHashMap(100, 0.75f, true);
    public final long b;
    public long c;
    public long d;

    /* loaded from: classes4.dex */
    public static final class Entry<Y> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13987a;
        public final int b;

        public Entry(Object obj, int i) {
            this.f13987a = obj;
            this.b = i;
        }
    }

    public LruCache(long j) {
        this.b = j;
        this.c = j;
    }

    public final void b() {
        k(0L);
    }

    public final synchronized void c(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Multiplier must be >= 0");
        }
        long jRound = Math.round(this.b * f);
        this.c = jRound;
        k(jRound);
    }

    public /* bridge */ /* synthetic */ Resource d(Key key, Resource resource) {
        return (Resource) j(key, resource);
    }

    public Resource f(Key key) {
        Object obj;
        synchronized (this) {
            Entry entry = (Entry) this.f13986a.remove(key);
            if (entry == null) {
                obj = null;
            } else {
                this.d -= entry.b;
                obj = entry.f13987a;
            }
        }
        return (Resource) obj;
    }

    public final synchronized Object g(Object obj) {
        Entry entry;
        entry = (Entry) this.f13986a.get(obj);
        return entry != null ? entry.f13987a : null;
    }

    public int h(Object obj) {
        return 1;
    }

    public void i(Object obj, Object obj2) {
    }

    public final synchronized Object j(Object obj, Object obj2) {
        int iH = h(obj2);
        long j = iH;
        if (j >= this.c) {
            i(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.d += j;
        }
        Entry entry = (Entry) this.f13986a.put(obj, obj2 == null ? null : new Entry(obj2, iH));
        if (entry != null) {
            this.d -= entry.b;
            if (!entry.f13987a.equals(obj2)) {
                i(obj, entry.f13987a);
            }
        }
        k(this.c);
        return entry != null ? entry.f13987a : null;
    }

    public final synchronized void k(long j) {
        while (this.d > j) {
            Iterator it = this.f13986a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Entry entry2 = (Entry) entry.getValue();
            this.d -= entry2.b;
            Object key = entry.getKey();
            it.remove();
            i(key, entry2.f13987a);
        }
    }
}
