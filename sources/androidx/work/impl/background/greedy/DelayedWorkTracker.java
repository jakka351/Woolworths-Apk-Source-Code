package androidx.work.impl.background.greedy;

import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.SystemClock;
import androidx.work.impl.DefaultRunnableScheduler;
import java.util.HashMap;

@RestrictTo
/* loaded from: classes.dex */
public class DelayedWorkTracker {
    public static final String e = Logger.g("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    public final GreedyScheduler f3947a;
    public final RunnableScheduler b;
    public final Clock c;
    public final HashMap d = new HashMap();

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, DefaultRunnableScheduler defaultRunnableScheduler, SystemClock systemClock) {
        this.f3947a = greedyScheduler;
        this.b = defaultRunnableScheduler;
        this.c = systemClock;
    }
}
