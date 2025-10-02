package au.com.woolworths.design.core.ui.component.stable.corerow.impl;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ int f;

    public /* synthetic */ a(int i, int i2, Function2 function2) {
        this.d = i2;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                CoreRowImplKt.c(RecomposeScopeImplKt.a(this.f | 1), composer, this.e);
                break;
            default:
                CoreRowImplKt.d(RecomposeScopeImplKt.a(this.f | 1), composer, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
