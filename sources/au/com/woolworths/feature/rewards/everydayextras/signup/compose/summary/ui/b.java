package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                float f = ChangePlanModalBottomSheetKt.f6138a;
                break;
            case 1:
                ((Function1) obj2).invoke(((EverydayExtrasSummaryContentItem.SelectedPlan) obj).f.d);
                break;
            default:
                Function0 function0 = (Function0) obj;
                if (((WPayLoadingState) obj2) == WPayLoadingState.f) {
                    function0.invoke();
                    break;
                }
                break;
        }
        return unit;
    }
}
