package au.com.woolworths.design.wx.component.button;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ PaddingValues h;
    public final /* synthetic */ ComposableLambdaImpl i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ d(Function0 function0, Modifier modifier, boolean z, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2, int i3) {
        this.d = i3;
        this.e = function0;
        this.f = modifier;
        this.g = z;
        this.h = paddingValues;
        this.i = composableLambdaImpl;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                PrimaryButtonKt.b(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            case 1:
                ((Integer) obj2).getClass();
                SecondaryButtonKt.c(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
            default:
                ((Integer) obj2).getClass();
                TertiaryButtonKt.b(this.e, this.f, this.g, this.h, this.i, (Composer) obj, RecomposeScopeImplKt.a(this.j | 1), this.k);
                break;
        }
        return Unit.f24250a;
    }
}
