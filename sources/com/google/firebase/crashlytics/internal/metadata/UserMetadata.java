package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class UserMetadata {

    /* renamed from: a, reason: collision with root package name */
    public final MetaDataStore f15300a;
    public final CrashlyticsWorkers b;
    public String c;
    public final SerializeableKeysMap d = new SerializeableKeysMap(false);
    public final SerializeableKeysMap e = new SerializeableKeysMap(true);
    public final RolloutAssignmentList f = new RolloutAssignmentList();
    public final AtomicMarkableReference g = new AtomicMarkableReference(null, false);

    public class SerializeableKeysMap {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f15301a;
        public final AtomicReference b = new AtomicReference(null);
        public final boolean c;

        public SerializeableKeysMap(boolean z) {
            this.c = z;
            this.f15301a = new AtomicMarkableReference(new KeysMap(z ? 8192 : 1024), false);
        }

        public final void a() {
            AtomicReference atomicReference;
            b bVar = new b(this, 1);
            do {
                atomicReference = this.b;
                if (atomicReference.compareAndSet(null, bVar)) {
                    UserMetadata.this.b.b.a(bVar);
                    return;
                }
            } while (atomicReference.get() == null);
        }

        public final boolean b(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((KeysMap) this.f15301a.getReference()).b(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f15301a;
                    atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
                    a();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public UserMetadata(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) {
        this.c = str;
        this.f15300a = new MetaDataStore(fileStore);
        this.b = crashlyticsWorkers;
    }

    public static UserMetadata c(String str, FileStore fileStore, CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        List listB;
        MetaDataStore metaDataStore = new MetaDataStore(fileStore);
        UserMetadata userMetadata = new UserMetadata(str, fileStore, crashlyticsWorkers);
        ((KeysMap) userMetadata.d.f15301a.getReference()).c(metaDataStore.c(str, false));
        ((KeysMap) userMetadata.e.f15301a.getReference()).c(metaDataStore.c(str, true));
        userMetadata.g.set(metaDataStore.d(str), false);
        Logger logger = Logger.f15258a;
        File fileB = fileStore.b(str, "rollouts-state");
        if (!fileB.exists() || fileB.length() == 0) {
            MetaDataStore.g(fileB, YU.a.A("The file has a length of zero for session: ", str));
            listB = Collections.EMPTY_LIST;
        } else {
            FileInputStream fileInputStream = null;
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(fileB);
                    try {
                        listB = MetaDataStore.b(CommonUtils.i(fileInputStream2));
                        logger.b("Loaded rollouts state:\n" + listB + "\nfor session " + str, null);
                        CommonUtils.b(fileInputStream2, "Failed to close rollouts state file.");
                    } catch (Exception e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        logger.f(e, "Error deserializing rollouts state.");
                        MetaDataStore.f(fileB);
                        CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                        listB = Collections.EMPTY_LIST;
                        userMetadata.f.b(listB);
                        return userMetadata;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        CommonUtils.b(fileInputStream, "Failed to close rollouts state file.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        userMetadata.f.b(listB);
        return userMetadata;
    }

    public static String d(String str, FileStore fileStore) {
        return new MetaDataStore(fileStore).d(str);
    }

    public final Map a(Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        SerializeableKeysMap serializeableKeysMap = this.d;
        if (map.isEmpty()) {
            KeysMap keysMap = (KeysMap) serializeableKeysMap.f15301a.getReference();
            synchronized (keysMap) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(keysMap.f15290a));
            }
            return mapUnmodifiableMap2;
        }
        KeysMap keysMap2 = (KeysMap) serializeableKeysMap.f15301a.getReference();
        synchronized (keysMap2) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap2.f15290a));
        }
        HashMap map2 = new HashMap(mapUnmodifiableMap);
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strA = KeysMap.a(1024, (String) entry.getKey());
            if (map2.size() < 64 || map2.containsKey(strA)) {
                map2.put(strA, KeysMap.a(1024, (String) entry.getValue()));
            } else {
                i++;
            }
        }
        if (i > 0) {
            Logger.f15258a.f(null, "Ignored " + i + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public final Map b() {
        Map mapUnmodifiableMap;
        KeysMap keysMap = (KeysMap) this.e.f15301a.getReference();
        synchronized (keysMap) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f15290a));
        }
        return mapUnmodifiableMap;
    }

    public final void e(String str, String str2) {
        this.d.b(str, str2);
    }

    public final void f(Map map) {
        SerializeableKeysMap serializeableKeysMap = this.d;
        synchronized (serializeableKeysMap) {
            ((KeysMap) serializeableKeysMap.f15301a.getReference()).c(map);
            AtomicMarkableReference atomicMarkableReference = serializeableKeysMap.f15301a;
            atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), true);
        }
        serializeableKeysMap.a();
    }

    public final void g(String str) {
        this.e.b("com.crashlytics.version-control-info", str);
    }

    public final void h(final String str) {
        final Map mapUnmodifiableMap;
        synchronized (this.c) {
            this.c = str;
            KeysMap keysMap = (KeysMap) this.d.f15301a.getReference();
            synchronized (keysMap) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f15290a));
            }
            final List listA = this.f.a();
            this.b.b.a(new Runnable() { // from class: com.google.firebase.crashlytics.internal.metadata.a
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    UserMetadata userMetadata = this.d;
                    MetaDataStore metaDataStore = userMetadata.f15300a;
                    AtomicMarkableReference atomicMarkableReference = userMetadata.g;
                    String str2 = (String) atomicMarkableReference.getReference();
                    String str3 = str;
                    if (str2 != null) {
                        metaDataStore.j(str3, (String) atomicMarkableReference.getReference());
                    }
                    Map map = mapUnmodifiableMap;
                    if (!map.isEmpty()) {
                        metaDataStore.h(str3, map, false);
                    }
                    List list = listA;
                    if (list.isEmpty()) {
                        return;
                    }
                    metaDataStore.i(str3, list);
                }
            });
        }
    }

    public final void i(String str) {
        String strA = KeysMap.a(1024, str);
        synchronized (this.g) {
            try {
                String str2 = (String) this.g.getReference();
                if (strA == null ? str2 == null : strA.equals(str2)) {
                    return;
                }
                this.g.set(strA, true);
                this.b.b.a(new b(this, 0));
            } finally {
            }
        }
    }
}
