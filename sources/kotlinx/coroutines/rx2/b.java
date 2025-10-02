package kotlinx.coroutines.rx2;

import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.rx2.DispatcherScheduler;

/* loaded from: classes7.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ DispatcherScheduler.DispatcherWorker d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ b(DispatcherScheduler.DispatcherWorker dispatcherWorker, Function1 function1) {
        this.d = dispatcherWorker;
        this.e = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        throw null;
    }
}
