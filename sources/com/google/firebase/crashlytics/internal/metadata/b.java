package com.google.firebase.crashlytics.internal.metadata;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        boolean z;
        String str;
        switch (this.d) {
            case 0:
                UserMetadata userMetadata = (UserMetadata) this.e;
                synchronized (userMetadata.g) {
                    try {
                        z = false;
                        if (userMetadata.g.isMarked()) {
                            str = (String) userMetadata.g.getReference();
                            userMetadata.g.set(str, false);
                            z = true;
                        } else {
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    userMetadata.f15300a.j(userMetadata.c, str);
                    return;
                }
                return;
            default:
                UserMetadata.SerializeableKeysMap serializeableKeysMap = (UserMetadata.SerializeableKeysMap) this.e;
                Map mapUnmodifiableMap = null;
                serializeableKeysMap.b.set(null);
                synchronized (serializeableKeysMap) {
                    if (serializeableKeysMap.f15301a.isMarked()) {
                        KeysMap keysMap = (KeysMap) serializeableKeysMap.f15301a.getReference();
                        synchronized (keysMap) {
                            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(keysMap.f15290a));
                        }
                        AtomicMarkableReference atomicMarkableReference = serializeableKeysMap.f15301a;
                        atomicMarkableReference.set((KeysMap) atomicMarkableReference.getReference(), false);
                    }
                }
                if (mapUnmodifiableMap != null) {
                    UserMetadata userMetadata2 = serializeableKeysMap.d;
                    userMetadata2.f15300a.h(userMetadata2.c, mapUnmodifiableMap, serializeableKeysMap.c);
                    return;
                }
                return;
        }
    }
}
