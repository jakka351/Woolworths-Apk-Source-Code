package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.debug.internal.ConcurrentWeakMap;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.e;
                return new ConcurrentWeakMap.Entry(obj, obj2);
            default:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ConcurrentWeakMap.e;
                return obj;
        }
    }
}
