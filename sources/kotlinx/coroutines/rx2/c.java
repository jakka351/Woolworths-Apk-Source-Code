package kotlinx.coroutines.rx2;

import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes7.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ Disposable d;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.d.dispose();
        return Unit.f24250a;
    }
}
