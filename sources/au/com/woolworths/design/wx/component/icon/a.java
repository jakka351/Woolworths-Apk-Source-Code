package au.com.woolworths.design.wx.component.icon;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.woolworths.shop.product.ui.boost.InfinitePulsingDotKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;

    public /* synthetic */ a(Modifier modifier, long j, int i, int i2) {
        this.d = i2;
        this.e = modifier;
        this.f = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AnimatedIconKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(433));
                break;
            default:
                InfinitePulsingDotKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
