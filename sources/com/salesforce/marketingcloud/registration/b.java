package com.salesforce.marketingcloud.registration;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes6.dex */
class b implements Map<String, String> {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap<String, String> f17034a;
    private final TreeMap<String, String> b;

    public b() {
        this.f17034a = new HashMap<>();
        this.b = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String get(Object obj) {
        String str = this.b.get(obj);
        if (str != null) {
            return this.f17034a.get(str);
        }
        return null;
    }

    @Override // java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public String remove(Object obj) {
        return this.f17034a.remove(this.b.remove(obj));
    }

    @Override // java.util.Map
    public void clear() {
        this.f17034a.clear();
        this.b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f17034a.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<String, String>> entrySet() {
        return this.f17034a.entrySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f17034a.isEmpty();
    }

    @Override // java.util.Map
    @NonNull
    public Set<String> keySet() {
        return this.f17034a.keySet();
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public int size() {
        return this.f17034a.size();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<String> values() {
        return this.f17034a.values();
    }

    public b(Map<String, String> map) {
        this();
        if (map != null) {
            this.f17034a.putAll(map);
            for (String str : this.f17034a.keySet()) {
                this.b.put(str, str);
            }
        }
    }

    @Override // java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String put(String str, String str2) {
        if (str == null) {
            return null;
        }
        String str3 = this.b.get(str);
        String strRemove = str3 != null ? this.f17034a.remove(str3) : null;
        this.b.put(str, str);
        this.f17034a.put(str, str2);
        return strRemove;
    }
}
