package au.com.woolworths.android.onesite.utils.coroutines;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ControlledRunner e;
    public final /* synthetic */ Deferred f;

    public /* synthetic */ a(ControlledRunner controlledRunner, Deferred deferred, int i) {
        this.d = i;
        this.e = controlledRunner;
        this.f = deferred;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Deferred deferred;
        Deferred deferred2;
        switch (this.d) {
            case 0:
                AtomicReference atomicReference = this.e.f4601a;
                do {
                    deferred = this.f;
                    if (atomicReference.compareAndSet(deferred, null)) {
                    }
                    break;
                } while (atomicReference.get() == deferred);
            default:
                AtomicReference atomicReference2 = this.e.f4601a;
                do {
                    deferred2 = this.f;
                    if (atomicReference2.compareAndSet(deferred2, null)) {
                    }
                    break;
                } while (atomicReference2.get() == deferred2);
        }
        return Unit.f24250a;
    }
}
