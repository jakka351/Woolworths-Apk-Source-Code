package com.swrve.sdk.localstorage;

import com.swrve.sdk.SwrveHelper;
import com.swrve.sdk.SwrveLogger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class SwrveMultiLayerLocalStorage {
    public static final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final LocalStorage f19088a;
    public SQLiteLocalStorage b;
    public final Object c = new Object();

    public SwrveMultiLayerLocalStorage(LocalStorage localStorage) {
        this.f19088a = localStorage;
    }

    public final long a(String str, String str2) {
        long jC;
        synchronized (d) {
            jC = this.f19088a.c(str, str2);
        }
        return jC;
    }

    public final void b() {
        LocalStorage localStorage = this.f19088a;
        SQLiteLocalStorage sQLiteLocalStorage = this.b;
        if (localStorage == sQLiteLocalStorage || !(localStorage instanceof InMemoryLocalStorage) || sQLiteLocalStorage == null) {
            return;
        }
        InMemoryLocalStorage inMemoryLocalStorage = (InMemoryLocalStorage) localStorage;
        synchronized (d) {
            HashMap map = inMemoryLocalStorage.f19084a;
            synchronized (this) {
                try {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        sQLiteLocalStorage.l((List) ((Map.Entry) it.next()).getValue());
                    }
                    map.clear();
                } finally {
                }
            }
        }
        synchronized (this.c) {
            HashMap map2 = inMemoryLocalStorage.b;
            synchronized (this) {
                try {
                    Iterator it2 = map2.entrySet().iterator();
                    while (it2.hasNext()) {
                        sQLiteLocalStorage.k((Map) ((Map.Entry) it2.next()).getValue());
                    }
                    map2.clear();
                } finally {
                }
            }
        }
    }

    public final String c(String str, String str2) {
        String str3;
        SQLiteLocalStorage sQLiteLocalStorage;
        SwrveCacheItem swrveCacheItemA;
        synchronized (this.c) {
            try {
                SwrveCacheItem swrveCacheItemA2 = this.f19088a.a(str, str2);
                str3 = swrveCacheItemA2 != null ? swrveCacheItemA2.c : null;
                if (str3 == null && (sQLiteLocalStorage = this.b) != null && (swrveCacheItemA = sQLiteLocalStorage.a(str, str2)) != null) {
                    str3 = swrveCacheItemA.c;
                    this.f19088a.b(str, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str3;
    }

    public final LinkedHashMap d(Integer num, String str) {
        LinkedHashMap linkedHashMap;
        int size;
        synchronized (d) {
            try {
                linkedHashMap = new LinkedHashMap();
                SQLiteLocalStorage sQLiteLocalStorage = this.b;
                if (sQLiteLocalStorage != null) {
                    LinkedHashMap linkedHashMapF = sQLiteLocalStorage.f(num, str);
                    size = linkedHashMapF.size();
                    if (size > 0) {
                        linkedHashMap.put(this.b, linkedHashMapF);
                    }
                } else {
                    size = 0;
                }
                if (num.intValue() - size > 0) {
                    LinkedHashMap linkedHashMapF2 = this.f19088a.f(Integer.valueOf(num.intValue() - size), str);
                    if (linkedHashMapF2.size() > 0) {
                        linkedHashMap.put(this.f19088a, linkedHashMapF2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return linkedHashMap;
    }

    public final String e(String str, String str2, String str3) {
        SQLiteLocalStorage sQLiteLocalStorage;
        String str4 = "";
        String str5 = "";
        synchronized (this.c) {
            try {
                SwrveCacheItem swrveCacheItemA = this.f19088a.a(str, str2);
                SwrveCacheItem swrveCacheItemA2 = this.f19088a.a(str, str2.concat("_SGT"));
                if (swrveCacheItemA != null && swrveCacheItemA2 != null) {
                    str4 = swrveCacheItemA.c;
                    str5 = swrveCacheItemA2.c;
                }
                if (SwrveHelper.p(str4) && (sQLiteLocalStorage = this.b) != null) {
                    SwrveCacheItem swrveCacheItemA3 = sQLiteLocalStorage.a(str, str2);
                    SwrveCacheItem swrveCacheItemA4 = this.b.a(str, str2.concat("_SGT"));
                    if (swrveCacheItemA3 != null && swrveCacheItemA4 != null) {
                        str4 = swrveCacheItemA3.c;
                        str5 = swrveCacheItemA4.c;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (SwrveHelper.p(str4)) {
            return null;
        }
        try {
            String strC = SwrveHelper.c(str4, str3);
            if (SwrveHelper.p(strC) || SwrveHelper.p(str5) || !str5.equals(strC)) {
                throw new SecurityException("Signature validation failed");
            }
            return str4;
        } catch (InvalidKeyException unused) {
            SwrveLogger.e("Computing signature failed because of an invalid key", new Object[0]);
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            SwrveLogger.e("Computing signature failed because of invalid algorithm", new Object[0]);
            return null;
        }
    }

    public final void f(String str, String str2, String str3, String str4) {
        String strC;
        SQLiteLocalStorage sQLiteLocalStorage;
        synchronized (this.c) {
            try {
                strC = SwrveHelper.c(str3, str4);
                this.f19088a.d(str, str2, str3, strC);
                sQLiteLocalStorage = this.b;
            } catch (InvalidKeyException unused) {
                SwrveLogger.e("Computing signature failed because of an invalid key", new Object[0]);
            } catch (NoSuchAlgorithmException unused2) {
                SwrveLogger.e("Computing signature failed because of invalid algorithm", new Object[0]);
                this.f19088a.b(str, str2, str3);
                SQLiteLocalStorage sQLiteLocalStorage2 = this.b;
                if (sQLiteLocalStorage2 != null) {
                    sQLiteLocalStorage2.b(str, str2, str3);
                }
            }
            if (sQLiteLocalStorage != null) {
                sQLiteLocalStorage.d(str, str2, str3, strC);
            }
        }
    }

    public final void g(String str, String str2, String str3) {
        synchronized (this.c) {
            try {
                this.f19088a.b(str, str2, str3);
                SQLiteLocalStorage sQLiteLocalStorage = this.b;
                if (sQLiteLocalStorage != null) {
                    sQLiteLocalStorage.b(str, str2, str3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
