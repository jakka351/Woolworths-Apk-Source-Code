package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ Function2 k;
    public final /* synthetic */ ButtonSpec.Size l;
    public final /* synthetic */ int m;

    public /* synthetic */ c(String str, String str2, Function0 function0, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = function0;
        this.h = modifier;
        this.i = z;
        this.j = function2;
        this.k = function22;
        this.l = size;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PrimaryButtonKt.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SecondaryButtonKt.c(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
        }
        return Unit.f24250a;
    }
}
