package com.swrve.sdk.localstorage;

import com.swrve.sdk.SwrveLogger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class InMemoryLocalStorage implements LocalStorage {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f19084a;
    public HashMap b;

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized SwrveCacheItem a(String str, String str2) {
        Map map;
        try {
            map = (Map) this.b.get(str);
            if (map == null) {
                map = new HashMap();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (SwrveCacheItem) map.get(str2);
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized void b(String str, String str2, String str3) {
        try {
            if (str == null || str2 == null || str3 == null) {
                SwrveLogger.d("Cannot set null value in cache entry for userId:%s category:%s rawData:%s.", str, str2, str3);
            } else {
                Iterator it = this.b.entrySet().iterator();
                int size = 0;
                while (it.hasNext()) {
                    size += ((Map) ((Map.Entry) it.next()).getValue()).size();
                }
                if (size >= 2000) {
                    SwrveLogger.h("The number of In Memory cache items has reached its limit. Cannot store anymore until a new session.", new Object[0]);
                } else {
                    Map map = (Map) this.b.get(str);
                    if (map == null) {
                        map = new HashMap();
                    }
                    SwrveCacheItem swrveCacheItem = (SwrveCacheItem) map.get(str2);
                    if (swrveCacheItem == null) {
                        swrveCacheItem = new SwrveCacheItem(str, str2, str3);
                    } else {
                        swrveCacheItem.f19086a = str;
                        swrveCacheItem.b = str2;
                        swrveCacheItem.c = str3;
                    }
                    map.put(str2, swrveCacheItem);
                    this.b.put(str, map);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized long c(String str, String str2) {
        long j;
        try {
            if (str == null || str2 == null) {
                SwrveLogger.d("Cannot set null value for event in userId:%s eventJSON:%s", str, str2);
            } else {
                Iterator it = this.f19084a.entrySet().iterator();
                int size = 0;
                while (it.hasNext()) {
                    size += ((List) ((Map.Entry) it.next()).getValue()).size();
                }
                if (size >= 2000) {
                    SwrveLogger.h("The number of In Memory event items has reached its limit. Cannot store anymore until a new session.", new Object[0]);
                } else {
                    List arrayList = (List) this.f19084a.get(str);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    SwrveEventItem swrveEventItem = new SwrveEventItem();
                    j = SwrveEventItem.d;
                    SwrveEventItem.d = 1 + j;
                    swrveEventItem.f19087a = j;
                    swrveEventItem.c = str;
                    swrveEventItem.b = str2;
                    arrayList.add(swrveEventItem);
                    this.f19084a.put(str, arrayList);
                }
            }
            j = 0;
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized void d(String str, String str2, String str3, String str4) {
        b(str, str2, str3);
        b(str, str2.concat("_SGT"), str4);
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized void e(String str, Set set) {
        Iterator it = ((List) this.f19084a.get(str)).iterator();
        while (it.hasNext()) {
            if (set.contains(Long.valueOf(((SwrveEventItem) it.next()).f19087a))) {
                it.remove();
            }
        }
    }

    @Override // com.swrve.sdk.localstorage.LocalStorage
    public final synchronized LinkedHashMap f(Integer num, String str) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        List list = (List) this.f19084a.get(str);
        if (list != null && list.size() > 0) {
            Iterator it = list.iterator();
            for (int iIntValue = num.intValue(); it.hasNext() && iIntValue > 0; iIntValue--) {
                SwrveEventItem swrveEventItem = (SwrveEventItem) it.next();
                linkedHashMap.put(Long.valueOf(swrveEventItem.f19087a), swrveEventItem.b);
            }
        }
        return linkedHashMap;
    }
}
