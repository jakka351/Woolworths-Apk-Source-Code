package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexImpl.SelectInstanceWithOwner;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements Function3<MutexImpl, SelectInstance<?>, Object, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int andDecrement;
        MutexImpl mutexImpl = (MutexImpl) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        Unit unit = Unit.f24250a;
        if (obj3 != null) {
            while (true) {
                if (!mutexImpl.e()) {
                    break;
                }
                Object obj4 = MutexImpl.h.get(mutexImpl);
                if (obj4 != MutexKt.f24747a) {
                    if (obj4 == obj3) {
                        selectInstance.c(MutexKt.b);
                        return unit;
                    }
                }
            }
        } else {
            mutexImpl.getClass();
        }
        Intrinsics.f(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        MutexImpl.SelectInstanceWithOwner selectInstanceWithOwner = mutexImpl.new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj3);
        do {
            mutexImpl.getClass();
            do {
                andDecrement = SemaphoreAndMutexImpl.g.getAndDecrement(mutexImpl);
            } while (andDecrement > mutexImpl.f24748a);
            if (andDecrement > 0) {
                selectInstanceWithOwner.c(unit);
                return unit;
            }
        } while (!mutexImpl.d(selectInstanceWithOwner));
        return unit;
    }
}
