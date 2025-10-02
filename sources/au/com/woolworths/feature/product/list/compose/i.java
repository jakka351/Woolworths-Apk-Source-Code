package au.com.woolworths.feature.product.list.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.geometry.Rect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Rect e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ float g;
    public final /* synthetic */ float h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ ComposableLambdaImpl j;

    public /* synthetic */ i(Rect rect, Function0 function0, float f, float f2, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.d = i2;
        switch (i2) {
            case 1:
                au.com.woolworths.feature.product.list.legacy.compose.CoachMarkPopupDirection[] coachMarkPopupDirectionArr = au.com.woolworths.feature.product.list.legacy.compose.CoachMarkPopupDirection.d;
                break;
            default:
                CoachMarkPopupDirection[] coachMarkPopupDirectionArr2 = CoachMarkPopupDirection.d;
                break;
        }
        this.e = rect;
        this.f = function0;
        this.g = f;
        this.h = f2;
        this.i = z;
        this.j = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                CoachMarkPopupDirection[] coachMarkPopupDirectionArr = CoachMarkPopupDirection.d;
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1772593);
                CoachMarkKt.a(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA);
                break;
            default:
                au.com.woolworths.feature.product.list.legacy.compose.CoachMarkPopupDirection[] coachMarkPopupDirectionArr2 = au.com.woolworths.feature.product.list.legacy.compose.CoachMarkPopupDirection.d;
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1772593);
                au.com.woolworths.feature.product.list.legacy.compose.CoachMarkKt.a(this.e, this.f, this.g, this.h, this.i, this.j, (Composer) obj, iA2);
                break;
        }
        return unit;
    }
}
