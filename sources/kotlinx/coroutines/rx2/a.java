package kotlinx.coroutines.rx2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DisposableHandle;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Ref.ObjectRef objectRef) {
        this.e = objectRef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                AtomicLongFieldUpdater atomicLongFieldUpdater = DispatcherScheduler.f;
                BuildersKt.c(null, null, null, new DispatcherScheduler$scheduleDirect$1$1$1((Function1) obj, null), 3);
                break;
            default:
                DisposableHandle disposableHandle = (DisposableHandle) ((Ref.ObjectRef) obj).d;
                if (disposableHandle != null) {
                    disposableHandle.dispose();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a(DispatcherScheduler dispatcherScheduler, Function1 function1) {
        this.e = function1;
    }
}
