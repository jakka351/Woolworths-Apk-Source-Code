package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ LifecycleOwner e;
    public final /* synthetic */ Function1 f;

    public /* synthetic */ a(LifecycleOwner lifecycleOwner, Function1 function1, int i, int i2) {
        this.d = i2;
        this.e = lifecycleOwner;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                LifecycleEffectKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(7));
                break;
            default:
                LifecycleEffectKt.c(this.e, this.f, composer, RecomposeScopeImplKt.a(7));
                break;
        }
        return Unit.f24250a;
    }
}
