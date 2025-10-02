package au.com.woolworths.feature.shop.onboarding.sdui.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingHeaderData;
import au.com.woolworths.feature.shop.onboarding.sdui.data.RowData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(int i, int i2, Object obj) {
        this.d = i2;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                OnboardingSduiScreenKt.e((OnboardingHeaderData) this.e, (Composer) obj, RecomposeScopeImplKt.a(49));
                break;
            default:
                ((Integer) obj2).getClass();
                OnboardingSduiScreenKt.f((RowData) this.e, (Composer) obj, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
