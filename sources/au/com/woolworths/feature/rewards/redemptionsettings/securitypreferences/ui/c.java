package au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.shop.checkout.ui.components.compose.FulfilmentWindowsEmptyUiKt;
import au.com.woolworths.shop.checkout.ui.components.compose.SectionHeaderKt;
import au.com.woolworths.shop.checkout.ui.substitution.component.ProductSectionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;

    public /* synthetic */ c(String str, String str2, int i, int i2) {
        this.d = i2;
        this.e = str;
        this.f = str2;
        this.g = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                SecurePreferenceScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 1:
                FulfilmentWindowsEmptyUiKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            case 2:
                SectionHeaderKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
            default:
                ProductSectionKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(this.g | 1));
                break;
        }
        return Unit.f24250a;
    }
}
