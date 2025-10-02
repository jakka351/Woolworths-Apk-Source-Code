package androidx.navigation.compose.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.EverydayExtraChoosePlanViewModel;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.ChoosePlanScreenKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFooterUiKt;
import au.com.woolworths.shop.checkout.ui.substitution.component.PreferenceOptionSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ a(int i, int i2, Object obj, boolean z) {
        this.d = i2;
        this.f = obj;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                NavComposeUtils_androidKt.a(this.e, (Function2) this.f, (Composer) obj, iA);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                ChoosePlanScreenKt.a((EverydayExtraChoosePlanViewModel) this.f, this.e, (Composer) obj, iA2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iA3 = RecomposeScopeImplKt.a(1);
                FulfilmentWindowsFooterUiKt.a((FulfilmentWindowSlotSelectionInfo) this.f, this.e, (Composer) obj, iA3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA4 = RecomposeScopeImplKt.a(1);
                PreferenceOptionSectionKt.a((String) this.f, this.e, (Composer) obj, iA4);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ a(boolean z, Function2 function2, int i) {
        this.d = 0;
        this.e = z;
        this.f = function2;
    }
}
