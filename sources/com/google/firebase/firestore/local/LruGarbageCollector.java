package com.google.firebase.firestore.local;

import com.google.firebase.firestore.util.AsyncQueue;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public class LruGarbageCollector {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Object f15491a;

    public class GCScheduler implements Scheduler {

        /* renamed from: a, reason: collision with root package name */
        public final AsyncQueue f15492a;
        public final LocalStore b;
        public boolean c = false;

        public GCScheduler(AsyncQueue asyncQueue, LocalStore localStore) {
            this.f15492a = asyncQueue;
            this.b = localStore;
        }

        @Override // com.google.firebase.firestore.local.Scheduler
        public final void start() {
            this.f15492a.a(AsyncQueue.TimerId.j, this.c ? LruGarbageCollector.c : LruGarbageCollector.b, new r(this, 2));
        }
    }

    public static class Params {
    }

    public static class Results {
    }

    public static class RollingSequenceNumberBuffer {
        public static final a c = new a(2);

        /* renamed from: a, reason: collision with root package name */
        public final PriorityQueue f15493a;
        public final int b;

        public RollingSequenceNumberBuffer(int i) {
            this.b = i;
            this.f15493a = new PriorityQueue(i, c);
        }

        public final void a(Long l) {
            PriorityQueue priorityQueue = this.f15493a;
            if (priorityQueue.size() < this.b) {
                priorityQueue.add(l);
                return;
            }
            if (l.longValue() < ((Long) priorityQueue.peek()).longValue()) {
                priorityQueue.poll();
                priorityQueue.add(l);
            }
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        b = timeUnit.toMillis(1L);
        c = timeUnit.toMillis(5L);
    }

    public LruGarbageCollector(LruDelegate lruDelegate, Params params) {
        this.f15491a = lruDelegate;
    }
}
