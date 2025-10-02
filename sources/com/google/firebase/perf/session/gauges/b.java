package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.AndroidMemoryReading;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ MemoryGaugeCollector e;
    public final /* synthetic */ Timer f;

    public /* synthetic */ b(MemoryGaugeCollector memoryGaugeCollector, Timer timer, int i) {
        this.d = i;
        this.e = memoryGaugeCollector;
        this.f = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Timer timer = this.f;
        MemoryGaugeCollector memoryGaugeCollector = this.e;
        switch (i) {
            case 0:
                AndroidLogger androidLogger = MemoryGaugeCollector.f;
                AndroidMemoryReading androidMemoryReadingF = memoryGaugeCollector.f(timer);
                if (androidMemoryReadingF != null) {
                    memoryGaugeCollector.b.add(androidMemoryReadingF);
                    break;
                }
                break;
            default:
                AndroidLogger androidLogger2 = MemoryGaugeCollector.f;
                AndroidMemoryReading androidMemoryReadingF2 = memoryGaugeCollector.f(timer);
                if (androidMemoryReadingF2 != null) {
                    memoryGaugeCollector.b.add(androidMemoryReadingF2);
                    break;
                }
                break;
        }
    }
}
