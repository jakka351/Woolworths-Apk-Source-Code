package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class IndexBackfiller {
    public static final long f = TimeUnit.SECONDS.toMillis(15);
    public static final long g = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: a, reason: collision with root package name */
    public final Scheduler f15481a;
    public final Persistence b;
    public final b c;
    public final b d;
    public final int e;

    public class Scheduler implements com.google.firebase.firestore.local.Scheduler {

        /* renamed from: a, reason: collision with root package name */
        public final AsyncQueue f15482a;

        public Scheduler(AsyncQueue asyncQueue) {
            this.f15482a = asyncQueue;
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public final void start() {
            this.f15482a.a(AsyncQueue.TimerId.l, IndexBackfiller.f, new r(this, 1));
        }
    }

    public IndexBackfiller(Persistence persistence, AsyncQueue asyncQueue, LocalStore localStore) {
        b bVar = new b(localStore, 1);
        b bVar2 = new b(localStore, 0);
        this.e = 50;
        this.b = persistence;
        this.f15481a = new Scheduler(asyncQueue);
        this.c = bVar;
        this.d = bVar2;
    }
}
