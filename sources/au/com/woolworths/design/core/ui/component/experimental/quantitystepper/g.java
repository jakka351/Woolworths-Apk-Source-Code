package au.com.woolworths.design.core.ui.component.experimental.quantitystepper;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import au.com.woolworths.design.core.ui.component.experimental.quantitystepper.QuantityStepperSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ double e;
    public final /* synthetic */ double f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ double i;
    public final /* synthetic */ FocusRequester j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ Function0 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Modifier o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ g(double d, double d2, String str, String str2, double d3, FocusRequester focusRequester, Function1 function1, Function1 function12, Function0 function0, boolean z, Modifier modifier, String str3, int i, int i2) {
        QuantityStepperSpec.Variant[] variantArr = QuantityStepperSpec.Variant.d;
        QuantityStepperSpec.Size size = QuantityStepperSpec.Size.e;
        this.e = d;
        this.f = d2;
        this.g = str;
        this.h = str2;
        this.i = d3;
        this.j = focusRequester;
        this.k = function1;
        this.l = function12;
        this.m = function0;
        this.n = z;
        this.o = modifier;
        this.p = str3;
        this.q = i;
        this.r = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        int i2 = this.q;
        switch (i) {
            case 0:
                QuantityStepperSpec.Variant[] variantArr = QuantityStepperSpec.Variant.d;
                QuantityStepperSpec.Size size = QuantityStepperSpec.Size.e;
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(i2 | 1);
                QuantityStepperKt.a(this.e, this.f, this.i, iA, this.r, (Composer) obj, this.o, this.j, this.g, this.h, this.p, this.m, this.k, this.l, this.n);
                break;
            default:
                QuantityStepperSpec.Variant[] variantArr2 = QuantityStepperSpec.Variant.d;
                QuantityStepperSpec.Size size2 = QuantityStepperSpec.Size.e;
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(i2 | 1);
                int iA3 = RecomposeScopeImplKt.a(this.r);
                QuantityStepperKt.c(this.e, this.f, this.i, iA2, iA3, (Composer) obj, this.o, this.j, this.g, this.h, this.p, this.m, this.k, this.l, this.n);
                break;
        }
        return unit;
    }

    public /* synthetic */ g(double d, double d2, String str, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, double d3, String str2, FocusRequester focusRequester, String str3, boolean z, int i, int i2) {
        QuantityStepperSpec.Variant[] variantArr = QuantityStepperSpec.Variant.d;
        QuantityStepperSpec.Size size = QuantityStepperSpec.Size.e;
        this.e = d;
        this.f = d2;
        this.g = str;
        this.k = function1;
        this.l = function12;
        this.m = function0;
        this.o = modifier;
        this.i = d3;
        this.h = str2;
        this.j = focusRequester;
        this.p = str3;
        this.n = z;
        this.q = i;
        this.r = i2;
    }
}
