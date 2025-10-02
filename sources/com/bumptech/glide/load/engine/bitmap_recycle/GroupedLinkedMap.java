package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
class GroupedLinkedMap<K extends Poolable, V> {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedEntry f13819a = new LinkedEntry(null);
    public final HashMap b = new HashMap();

    public static class LinkedEntry<K, V> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13820a;
        public ArrayList b;
        public LinkedEntry d = this;
        public LinkedEntry c = this;

        public LinkedEntry(Object obj) {
            this.f13820a = obj;
        }
    }

    public final Object a(Poolable poolable) {
        HashMap map = this.b;
        LinkedEntry linkedEntry = (LinkedEntry) map.get(poolable);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry(poolable);
            map.put(poolable, linkedEntry);
        } else {
            poolable.a();
        }
        LinkedEntry linkedEntry2 = linkedEntry.d;
        linkedEntry2.c = linkedEntry.c;
        linkedEntry.c.d = linkedEntry2;
        LinkedEntry linkedEntry3 = this.f13819a;
        linkedEntry.d = linkedEntry3;
        LinkedEntry linkedEntry4 = linkedEntry3.c;
        linkedEntry.c = linkedEntry4;
        linkedEntry4.d = linkedEntry;
        linkedEntry.d.c = linkedEntry;
        ArrayList arrayList = linkedEntry.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return linkedEntry.b.remove(size - 1);
        }
        return null;
    }

    public final void b(Poolable poolable, Object obj) {
        HashMap map = this.b;
        LinkedEntry linkedEntry = (LinkedEntry) map.get(poolable);
        if (linkedEntry == null) {
            linkedEntry = new LinkedEntry(poolable);
            linkedEntry.d = linkedEntry;
            LinkedEntry linkedEntry2 = this.f13819a;
            linkedEntry.d = linkedEntry2.d;
            linkedEntry.c = linkedEntry2;
            linkedEntry2.d = linkedEntry;
            linkedEntry.d.c = linkedEntry;
            map.put(poolable, linkedEntry);
        } else {
            poolable.a();
        }
        if (linkedEntry.b == null) {
            linkedEntry.b = new ArrayList();
        }
        linkedEntry.b.add(obj);
    }

    public final Object c() {
        LinkedEntry linkedEntry = this.f13819a;
        LinkedEntry linkedEntry2 = linkedEntry.d;
        while (true) {
            boolean zEquals = linkedEntry2.equals(linkedEntry);
            Object obj = linkedEntry2.f13820a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = linkedEntry2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? linkedEntry2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            LinkedEntry linkedEntry3 = linkedEntry2.d;
            linkedEntry3.c = linkedEntry2.c;
            linkedEntry2.c.d = linkedEntry3;
            this.b.remove(obj);
            ((Poolable) obj).a();
            linkedEntry2 = linkedEntry2.d;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        LinkedEntry linkedEntry = this.f13819a;
        LinkedEntry linkedEntry2 = linkedEntry.c;
        boolean z = false;
        while (!linkedEntry2.equals(linkedEntry)) {
            sb.append('{');
            sb.append(linkedEntry2.f13820a);
            sb.append(':');
            ArrayList arrayList = linkedEntry2.b;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            linkedEntry2 = linkedEntry2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
