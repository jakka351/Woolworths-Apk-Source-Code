package au.com.woolworths.design.core.ui.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ComposableLambdaImpl e;
    public final /* synthetic */ int f;

    public /* synthetic */ b(ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = i2;
        this.e = composableLambdaImpl;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CoreThemeKt.c(RecomposeScopeImplKt.a(this.f | 1), composer, this.e);
                break;
            default:
                ThemeKt.b(RecomposeScopeImplKt.a(this.f | 1), composer, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
