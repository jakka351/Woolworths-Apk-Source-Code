package au.com.woolworths.design.wx.component.button;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ PaddingValues j;
    public final /* synthetic */ String k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ e(String str, Function0 function0, Modifier modifier, boolean z, boolean z2, PaddingValues paddingValues, String str2, int i, int i2, int i3) {
        this.d = i3;
        this.e = str;
        this.f = function0;
        this.g = modifier;
        this.h = z;
        this.i = z2;
        this.j = paddingValues;
        this.k = str2;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                SecondaryButtonKt.b(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1), this.m);
                break;
            default:
                ((Integer) obj2).getClass();
                TertiaryButtonKt.a(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, RecomposeScopeImplKt.a(this.l | 1), this.m);
                break;
        }
        return Unit.f24250a;
    }
}
