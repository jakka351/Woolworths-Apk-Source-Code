package io.reactivex.internal.schedulers;

import io.reactivex.Scheduler;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class NewThreadScheduler extends Scheduler {
    public static final RxThreadFactory g = new RxThreadFactory("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory f = g;

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new NewThreadWorker(this.f);
    }
}
