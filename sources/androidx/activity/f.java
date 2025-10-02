package androidx.activity;

import androidx.activity.ComponentActivity;
import androidx.activity.ComponentActivity$fullyDrawnReporter$2;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ComponentActivity.ReportFullyDrawnExecutorImpl reportFullyDrawnExecutorImpl = (ComponentActivity.ReportFullyDrawnExecutorImpl) this.e;
                Runnable runnable = reportFullyDrawnExecutorImpl.e;
                if (runnable != null) {
                    runnable.run();
                    reportFullyDrawnExecutorImpl.e = null;
                    return;
                }
                return;
            case 1:
                FullyDrawnReporter fullyDrawnReporter = (FullyDrawnReporter) this.e;
                synchronized (fullyDrawnReporter.c) {
                    fullyDrawnReporter.e = false;
                    if (fullyDrawnReporter.d == 0 && !fullyDrawnReporter.f) {
                        ((ComponentActivity$fullyDrawnReporter$2.AnonymousClass1) fullyDrawnReporter.b).invoke();
                        fullyDrawnReporter.a();
                    }
                }
                return;
            default:
                ComponentDialog.a((ComponentDialog) this.e);
                return;
        }
    }
}
