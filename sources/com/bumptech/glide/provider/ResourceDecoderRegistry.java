package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class ResourceDecoderRegistry {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13966a = new ArrayList();
    public final HashMap b = new HashMap();

    public static class Entry<T, R> {

        /* renamed from: a, reason: collision with root package name */
        public final Class f13967a;
        public final Class b;
        public final ResourceDecoder c;

        public Entry(Class cls, Class cls2, ResourceDecoder resourceDecoder) {
            this.f13967a = cls;
            this.b = cls2;
            this.c = resourceDecoder;
        }
    }

    public final synchronized void a(ResourceDecoder resourceDecoder, Class cls, Class cls2, String str) {
        c(str).add(new Entry(cls, cls2, resourceDecoder));
    }

    public final synchronized ArrayList b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f13966a.iterator();
        while (it.hasNext()) {
            List<Entry> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (Entry entry : list) {
                    if (entry.f13967a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.b)) {
                        arrayList.add(entry.c);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized List c(String str) {
        List arrayList;
        try {
            if (!this.f13966a.contains(str)) {
                this.f13966a.add(str);
            }
            arrayList = (List) this.b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.b.put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f13966a.iterator();
        while (it.hasNext()) {
            List<Entry> list = (List) this.b.get((String) it.next());
            if (list != null) {
                for (Entry entry : list) {
                    if ((entry.f13967a.isAssignableFrom(cls) && cls2.isAssignableFrom(entry.b)) && !arrayList.contains(entry.b)) {
                        arrayList.add(entry.b);
                    }
                }
            }
        }
        return arrayList;
    }
}
