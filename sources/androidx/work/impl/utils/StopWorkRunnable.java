package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkerWrapper;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/utils/StopWorkRunnable;", "Ljava/lang/Runnable;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class StopWorkRunnable implements Runnable {
    public final Processor d;
    public final StartStopToken e;
    public final boolean f;
    public final int g;

    public StopWorkRunnable(Processor processor, StartStopToken token, boolean z, int i) {
        Intrinsics.h(processor, "processor");
        Intrinsics.h(token, "token");
        this.d = processor;
        this.e = token;
        this.f = z;
        this.g = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zD;
        WorkerWrapper workerWrapperB;
        if (this.f) {
            Processor processor = this.d;
            StartStopToken startStopToken = this.e;
            int i = this.g;
            processor.getClass();
            String str = startStopToken.f3931a.f3985a;
            synchronized (processor.k) {
                workerWrapperB = processor.b(str);
            }
            zD = Processor.d(str, workerWrapperB, i);
        } else {
            Processor processor2 = this.d;
            StartStopToken startStopToken2 = this.e;
            int i2 = this.g;
            processor2.getClass();
            String str2 = startStopToken2.f3931a.f3985a;
            synchronized (processor2.k) {
                try {
                    if (processor2.f.get(str2) != null) {
                        Logger.e().a(Processor.l, "Ignored stopWork. WorkerWrapper " + str2 + " is in foreground");
                    } else {
                        Set set = (Set) processor2.h.get(str2);
                        if (set != null && set.contains(startStopToken2)) {
                            zD = Processor.d(str2, processor2.b(str2), i2);
                        }
                    }
                    zD = false;
                } finally {
                }
            }
        }
        Logger.e().a(Logger.g("StopWorkRunnable"), "StopWorkRunnable for " + this.e.f3931a.f3985a + "; Processor.stopWork = " + zD);
    }
}
