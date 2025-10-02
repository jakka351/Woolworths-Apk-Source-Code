package au.com.woolworths.design.core.ui.component.stable;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ float g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ d(Modifier modifier, long j, float f, int i, int i2, int i3) {
        this.d = i3;
        this.e = modifier;
        this.f = j;
        this.g = f;
        this.h = i;
        this.i = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(this.h | 1);
                DividerKt.b(this.g, iA, this.i, this.f, (Composer) obj, this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(this.h | 1);
                DividerKt.a(this.g, iA2, this.i, this.f, (Composer) obj, this.e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(this.h | 1);
                au.com.woolworths.design.wx.component.DividerKt.a(this.g, iA3, this.i, this.f, (Composer) obj, this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(this.h | 1);
                au.com.woolworths.design.wx.component.DividerKt.b(this.g, iA4, this.i, this.f, (Composer) obj, this.e);
                break;
        }
        return Unit.f24250a;
    }
}
