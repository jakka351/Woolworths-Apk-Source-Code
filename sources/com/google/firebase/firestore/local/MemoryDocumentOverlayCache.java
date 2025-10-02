package com.google.firebase.firestore.local;

import com.google.firebase.firestore.model.DocumentKey;
import com.google.firebase.firestore.model.ResourcePath;
import com.google.firebase.firestore.model.mutation.Mutation;
import com.google.firebase.firestore.model.mutation.Overlay;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes6.dex */
public class MemoryDocumentOverlayCache implements DocumentOverlayCache {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f15494a = new TreeMap();
    public final HashMap b = new HashMap();

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final HashMap a(TreeSet treeSet) {
        HashMap map = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            DocumentKey documentKey = (DocumentKey) it.next();
            Overlay overlay = (Overlay) this.f15494a.get(documentKey);
            if (overlay != null) {
                map.put(documentKey, overlay);
            }
        }
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final HashMap b(ResourcePath resourcePath, int i) {
        HashMap map = new HashMap();
        int size = resourcePath.d.size() + 1;
        for (Overlay overlay : this.f15494a.tailMap(new DocumentKey((ResourcePath) resourcePath.a(""))).values()) {
            DocumentKey documentKey = overlay.c().f15543a;
            if (!resourcePath.m(documentKey.d)) {
                break;
            }
            if (documentKey.d.d.size() == size && overlay.b() > i) {
                map.put(overlay.c().f15543a, overlay);
            }
        }
        return map;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final void c(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.b;
        if (map.containsKey(numValueOf)) {
            Set set = (Set) map.get(Integer.valueOf(i));
            map.remove(Integer.valueOf(i));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f15494a.remove((DocumentKey) it.next());
            }
        }
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final HashMap d(int i, int i2, String str) {
        TreeMap treeMap = new TreeMap();
        for (Overlay overlay : this.f15494a.values()) {
            if (overlay.c().f15543a.d.f(r3.d.size() - 2).equals(str) && overlay.b() > i) {
                Map map = (Map) treeMap.get(Integer.valueOf(overlay.b()));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(overlay.b()), map);
                }
                map.put(overlay.c().f15543a, overlay);
            }
        }
        HashMap map2 = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            map2.putAll((Map) it.next());
            if (map2.size() >= i2) {
                break;
            }
        }
        return map2;
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final void e(int i, HashMap map) {
        for (Map.Entry entry : map.entrySet()) {
            Mutation mutation = (Mutation) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (mutation == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            DocumentKey documentKey = mutation.f15543a;
            TreeMap treeMap = this.f15494a;
            Overlay overlay = (Overlay) treeMap.get(documentKey);
            HashMap map2 = this.b;
            if (overlay != null) {
                ((Set) map2.get(Integer.valueOf(overlay.b()))).remove(documentKey);
            }
            treeMap.put(documentKey, Overlay.a(i, mutation));
            if (map2.get(Integer.valueOf(i)) == null) {
                map2.put(Integer.valueOf(i), new HashSet());
            }
            ((Set) map2.get(Integer.valueOf(i))).add(documentKey);
        }
    }

    @Override // com.google.firebase.firestore.local.DocumentOverlayCache
    public final Overlay f(DocumentKey documentKey) {
        return (Overlay) this.f15494a.get(documentKey);
    }
}
