package kotlinx.coroutines.rx2;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes7.dex */
public final /* synthetic */ class d implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                Disposable disposable = (Disposable) ((AtomicReference) this.e).getAndSet(EmptyDisposable.d);
                if (disposable != null) {
                    disposable.dispose();
                }
                break;
            default:
                ((Runnable) this.e).run();
                break;
        }
        return Unit.f24250a;
    }
}
