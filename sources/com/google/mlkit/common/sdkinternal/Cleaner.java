package com.google.mlkit.common.sdkinternal;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class Cleaner {

    /* renamed from: a, reason: collision with root package name */
    public final ReferenceQueue f15978a = new ReferenceQueue();
    public final Set b = Collections.synchronizedSet(new HashSet());

    /* loaded from: classes6.dex */
    public interface Cleanable {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.mlkit.common.sdkinternal.zza] */
    public static Cleaner a() {
        Cleaner cleaner = new Cleaner();
        ?? r1 = new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zza
            @Override // java.lang.Runnable
            public final void run() {
            }
        };
        final ReferenceQueue referenceQueue = cleaner.f15978a;
        final Set set = cleaner.b;
        set.add(new zzd(cleaner, referenceQueue, set, r1));
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzb
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        zzd zzdVar = (zzd) referenceQueue2.remove();
                        if (zzdVar.d.remove(zzdVar)) {
                            zzdVar.clear();
                            zzdVar.e.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return cleaner;
    }
}
