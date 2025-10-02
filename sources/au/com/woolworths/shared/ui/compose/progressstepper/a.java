package au.com.woolworths.shared.ui.compose.progressstepper;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.shop.cart.ui.cart.CartProductPromoInfoKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ a(long j, int i, String str, String str2, boolean z, Modifier modifier, int i2) {
        this.e = j;
        this.f = i;
        this.j = str;
        this.k = str2;
        this.g = z;
        this.h = modifier;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                ProgressStepperBarKt.c(this.h, this.e, (ProgressStepType) this.j, this.g, (Function0) this.k, (Composer) obj, RecomposeScopeImplKt.a(this.f | 1), this.i);
                break;
            default:
                ((Integer) obj2).getClass();
                CartProductPromoInfoKt.a(this.e, this.f, (String) this.j, (String) this.k, this.g, this.h, (Composer) obj, RecomposeScopeImplKt.a(this.i | 1));
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(Modifier modifier, long j, ProgressStepType progressStepType, boolean z, Function0 function0, int i, int i2) {
        this.h = modifier;
        this.e = j;
        this.j = progressStepType;
        this.g = z;
        this.k = function0;
        this.f = i;
        this.i = i2;
    }
}
