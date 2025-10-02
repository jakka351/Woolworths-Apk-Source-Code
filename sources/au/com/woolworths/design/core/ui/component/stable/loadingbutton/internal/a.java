package au.com.woolworths.design.core.ui.component.stable.loadingbutton.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import au.com.woolworths.design.core.ui.component.stable.button.ButtonSpec;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ButtonSpec.Size f;
    public final /* synthetic */ long g;
    public final /* synthetic */ Object h;

    public /* synthetic */ a(boolean z, Object obj, ButtonSpec.Size size, long j, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.h = obj;
        this.f = size;
        this.g = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                ButtonIconOrSpinnerKt.a(this.e, (ImageVector) this.h, this.f, this.g, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                ButtonLabelOrSpinnerKt.a(this.e, (String) this.h, this.f, this.g, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
