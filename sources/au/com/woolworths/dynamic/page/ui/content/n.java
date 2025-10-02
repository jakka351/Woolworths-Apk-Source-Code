package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.buyagain.ui.composable.SearchIconButtonKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ long f;

    public /* synthetic */ n(Function0 function0, long j, int i, int i2) {
        this.d = i2;
        this.e = function0;
        this.f = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ScreenContentKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                SearchIconButtonKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
