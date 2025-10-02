package androidx.work.impl;

import android.content.Context;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.CancelWorkRunnable;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.transport.TransportManager;
import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.TraceMetric;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ b(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        switch (this.d) {
            case 0:
                Processor processor = (Processor) this.e;
                ListenableFuture listenableFuture = (ListenableFuture) this.f;
                WorkerWrapper workerWrapper = (WorkerWrapper) this.g;
                String str = Processor.l;
                try {
                    zBooleanValue = ((Boolean) listenableFuture.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                    zBooleanValue = true;
                }
                synchronized (processor.k) {
                    try {
                        WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workerWrapper.f3941a);
                        String str2 = workGenerationalIdA.f3985a;
                        if (processor.c(str2) == workerWrapper) {
                            processor.b(str2);
                        }
                        Logger.e().a(Processor.l, processor.getClass().getSimpleName() + " " + str2 + " executed; reschedule = " + zBooleanValue);
                        Iterator it = processor.j.iterator();
                        while (it.hasNext()) {
                            ((ExecutionListener) it.next()).d(workGenerationalIdA, zBooleanValue);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((WorkLauncherImpl) this.e).f3938a.g((StartStopToken) this.f, (WorkerParameters.RuntimeExtras) this.g);
                return;
            case 2:
                WorkDatabase workDatabase = (WorkDatabase) this.e;
                String str3 = (String) this.f;
                WorkManagerImpl workManagerImpl = (WorkManagerImpl) this.g;
                Iterator it2 = workDatabase.z().h(str3).iterator();
                while (it2.hasNext()) {
                    CancelWorkRunnable.a(workManagerImpl, (String) it2.next());
                }
                return;
            case 3:
                ((SessionManager) this.e).lambda$setApplicationContext$0((Context) this.f, (PerfSession) this.g);
                return;
            case 4:
                ((GaugeManager) this.e).lambda$stopCollectingGauges$3((String) this.f, (ApplicationProcessState) this.g);
                return;
            case 5:
                TransportManager transportManager = (TransportManager) this.e;
                TraceMetric traceMetric = (TraceMetric) this.f;
                ApplicationProcessState applicationProcessState = (ApplicationProcessState) this.g;
                AndroidLogger androidLogger = TransportManager.u;
                PerfMetric.Builder builderR = PerfMetric.R();
                builderR.p();
                PerfMetric.N((PerfMetric) builderR.e, traceMetric);
                transportManager.d(builderR, applicationProcessState);
                return;
            default:
                TransportManager transportManager2 = (TransportManager) this.e;
                NetworkRequestMetric networkRequestMetric = (NetworkRequestMetric) this.f;
                ApplicationProcessState applicationProcessState2 = (ApplicationProcessState) this.g;
                AndroidLogger androidLogger2 = TransportManager.u;
                transportManager2.getClass();
                PerfMetric.Builder builderR2 = PerfMetric.R();
                builderR2.p();
                PerfMetric.O((PerfMetric) builderR2.e, networkRequestMetric);
                transportManager2.d(builderR2, applicationProcessState2);
                return;
        }
    }
}
