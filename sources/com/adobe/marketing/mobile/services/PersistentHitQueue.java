package com.adobe.marketing.mobile.services;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class PersistentHitQueue extends HitQueuing {

    /* renamed from: a, reason: collision with root package name */
    public final DataQueue f13236a;
    public final HitProcessing b;
    public final AtomicBoolean c;
    public final ScheduledExecutorService d;
    public final AtomicBoolean e;

    public PersistentHitQueue(DataQueue dataQueue, HitProcessing hitProcessing) {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.c = new AtomicBoolean(true);
        this.e = new AtomicBoolean(false);
        if (dataQueue == null) {
            throw new IllegalArgumentException("Null value is not allowed in PersistentHitQueue Constructor.");
        }
        this.f13236a = dataQueue;
        this.b = hitProcessing;
        this.d = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public final void a() {
        this.c.set(false);
        f();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public final void b() {
        this.f13236a.clear();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public final void c() {
        e();
        this.f13236a.close();
        this.d.shutdown();
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public final boolean d(DataEntity dataEntity) {
        boolean zA = this.f13236a.a(dataEntity);
        f();
        return zA;
    }

    @Override // com.adobe.marketing.mobile.services.HitQueuing
    public final void e() {
        this.c.set(true);
    }

    public final void f() {
        if (!this.c.get() && this.e.compareAndSet(false, true)) {
            this.d.execute(new Runnable() { // from class: com.adobe.marketing.mobile.services.b
                @Override // java.lang.Runnable
                public final void run() {
                    PersistentHitQueue persistentHitQueue = this.d;
                    DataEntity dataEntityPeek = persistentHitQueue.f13236a.peek();
                    if (dataEntityPeek == null) {
                        persistentHitQueue.e.set(false);
                    } else {
                        persistentHitQueue.b.a(dataEntityPeek, new au.com.woolworths.product.details.epoxy.a(persistentHitQueue, dataEntityPeek));
                    }
                }
            });
        }
    }
}
