package com.dynatrace.android.ragetap.detection;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class RageTapDetector {
    public static final String m;

    /* renamed from: a, reason: collision with root package name */
    public final List f14173a;
    public final ScheduledExecutorService b;
    public final TimeLineProvider d;
    public Session e;
    public RageTapRules f;
    public ScheduledFuture j;
    public long k;
    public TapData g = null;
    public TapData h = null;
    public int i = 0;
    public boolean l = false;
    public final Runnable c = new Runnable() { // from class: com.dynatrace.android.ragetap.detection.RageTapDetector.1
        @Override // java.lang.Runnable
        public final void run() {
            RageTapDetector rageTapDetector = RageTapDetector.this;
            synchronized (rageTapDetector) {
                try {
                    if (rageTapDetector.g == null) {
                        return;
                    }
                    long jA = rageTapDetector.d.a();
                    RageTapRules rageTapRules = rageTapDetector.f;
                    TapData tapData = rageTapDetector.h;
                    rageTapRules.getClass();
                    if (jA - tapData.b.c > ((long) rageTapRules.f14174a.c)) {
                        if (Global.f14077a) {
                            Utility.h(RageTapDetector.m, "timespan difference exceeded");
                        }
                        rageTapDetector.a();
                    } else {
                        ScheduledFuture scheduledFuture = rageTapDetector.j;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        rageTapDetector.j = rageTapDetector.b.schedule(rageTapDetector.c, rageTapDetector.k, TimeUnit.MILLISECONDS);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    };

    static {
        boolean z = Global.f14077a;
        m = "dtxRageTapDetector";
    }

    public RageTapDetector(ArrayList arrayList, ScheduledExecutorService scheduledExecutorService, TimeLineProvider timeLineProvider) {
        this.f14173a = Collections.unmodifiableList(arrayList);
        this.b = scheduledExecutorService;
        this.d = timeLineProvider;
    }

    public final synchronized void a() {
        b(true);
    }

    public final void b(boolean z) {
        if (this.l) {
            RageTapRules rageTapRules = this.f;
            int i = this.i;
            if (i >= rageTapRules.f14174a.d) {
                RageTap rageTap = new RageTap(this.g, this.h, i);
                if (Global.f14077a) {
                    Utility.h(m, "rage tap detected: " + rageTap);
                }
                Iterator it = this.f14173a.iterator();
                while (it.hasNext()) {
                    ((RageTapListener) it.next()).a(rageTap, z);
                }
            }
            ScheduledFuture scheduledFuture = this.j;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.j = null;
            }
            this.g = null;
            this.h = null;
            this.i = 0;
        }
    }

    public final void c(TapData tapData) {
        if (this.e.f14113a <= tapData.f14175a.c) {
            this.g = tapData;
            this.h = tapData;
            this.i = 1;
            return;
        }
        if (Global.f14077a) {
            Utility.h(m, "discard tap because it partially occurred outside of the session");
        }
        ScheduledFuture scheduledFuture = this.j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.j = null;
        }
        this.g = null;
        this.h = null;
        this.i = 0;
    }
}
