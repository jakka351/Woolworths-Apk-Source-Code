package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraChoosePlanBottomSheetViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(Object obj, Function1 function1, int i, int i2) {
        this.d = i2;
        this.f = obj;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                ChangePlanModalBottomSheetKt.b((EverydayExtraChoosePlanBottomSheetViewModel) this.f, this.e, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                SelectedPlanUiKt.a((EverydayExtrasSummaryContentItem.SelectedPlan) this.f, this.e, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }
}
