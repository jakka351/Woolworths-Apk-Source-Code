package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.CpuMetricReading;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ CpuGaugeCollector e;
    public final /* synthetic */ Timer f;

    public /* synthetic */ a(CpuGaugeCollector cpuGaugeCollector, Timer timer, int i) {
        this.d = i;
        this.e = cpuGaugeCollector;
        this.f = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Timer timer = this.f;
        CpuGaugeCollector cpuGaugeCollector = this.e;
        switch (i) {
            case 0:
                AndroidLogger androidLogger = CpuGaugeCollector.g;
                CpuMetricReading cpuMetricReadingF = cpuGaugeCollector.f(timer);
                if (cpuMetricReadingF != null) {
                    cpuGaugeCollector.f15712a.add(cpuMetricReadingF);
                    break;
                }
                break;
            default:
                AndroidLogger androidLogger2 = CpuGaugeCollector.g;
                CpuMetricReading cpuMetricReadingF2 = cpuGaugeCollector.f(timer);
                if (cpuMetricReadingF2 != null) {
                    cpuGaugeCollector.f15712a.add(cpuMetricReadingF2);
                    break;
                }
                break;
        }
    }
}
