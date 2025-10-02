package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final /* synthetic */ class d implements DelegatingScheduledFuture.Resolver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15244a;
    public final /* synthetic */ DelegatingScheduledExecutorService b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ d(DelegatingScheduledExecutorService delegatingScheduledExecutorService, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f15244a = i;
        this.b = delegatingScheduledExecutorService;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
    public final ScheduledFuture a(DelegatingScheduledFuture.AnonymousClass1 anonymousClass1) {
        switch (this.f15244a) {
            case 0:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.b;
                return delegatingScheduledExecutorService.e.scheduleAtFixedRate(new f(delegatingScheduledExecutorService, this.c, anonymousClass1, 0), this.d, this.e, this.f);
            default:
                DelegatingScheduledExecutorService delegatingScheduledExecutorService2 = this.b;
                return delegatingScheduledExecutorService2.e.scheduleWithFixedDelay(new f(delegatingScheduledExecutorService2, this.c, anonymousClass1, 2), this.d, this.e, this.f);
        }
    }
}
