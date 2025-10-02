package au.com.woolworths.design.core.ui.component.stable.button;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ Function2 i;
    public final /* synthetic */ Function2 j;
    public final /* synthetic */ ButtonSpec.Size k;
    public final /* synthetic */ Function2 l;
    public final /* synthetic */ int m;

    public /* synthetic */ e(String str, Function0 function0, Modifier modifier, boolean z, Function2 function2, Function2 function22, ButtonSpec.Size size, Function2 function23, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = function2;
        this.j = function22;
        this.k = size;
        this.l = function23;
        this.m = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PrimaryButtonKt.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                SecondaryButtonKt.d(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, RecomposeScopeImplKt.a(this.m | 1));
                break;
        }
        return Unit.f24250a;
    }
}
