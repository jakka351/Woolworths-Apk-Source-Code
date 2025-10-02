package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {
    public final CrashlyticsOriginAnalyticsEventLogger d;
    public final Object e;
    public CountDownLatch f;

    public BlockingAnalyticsEventLogger(CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.e = new Object();
        this.d = crashlyticsOriginAnalyticsEventLogger;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public final void b(Bundle bundle, String str) {
        CountDownLatch countDownLatch = this.f;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void c(Bundle bundle) {
        synchronized (this.e) {
            try {
                Logger logger = Logger.f15258a;
                logger.e("Logging event _ae to Firebase Analytics with params " + bundle);
                this.f = new CountDownLatch(1);
                this.d.c(bundle);
                logger.e("Awaiting app exception callback from Analytics...");
                try {
                    if (this.f.await(500, TimeUnit.MILLISECONDS)) {
                        logger.e("App exception callback received from Analytics listener.");
                    } else {
                        logger.f(null, "Timeout exceeded while awaiting app exception callback from Analytics listener.");
                    }
                } catch (InterruptedException unused) {
                    Logger.f15258a.c(null, "Interrupted while awaiting app exception callback from Analytics listener.");
                }
                this.f = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
