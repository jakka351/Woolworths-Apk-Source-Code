package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function3 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CancellableContinuationImpl.i;
                ((Function1) obj4).invoke((Throwable) obj);
                break;
            case 1:
                MutexImpl mutexImpl = (MutexImpl) obj4;
                MutexImpl.h.set(mutexImpl, null);
                mutexImpl.c(null);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SemaphoreAndMutexImpl.c;
                ((SemaphoreAndMutexImpl) obj4).release();
                break;
        }
        return unit;
    }

    public /* synthetic */ a(MutexImpl mutexImpl, MutexImpl.CancellableContinuationWithOwner cancellableContinuationWithOwner) {
        this.d = 1;
        this.e = mutexImpl;
    }
}
