package au.com.woolworths.feature.shop.account.ui.details.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.shop.editorder.review.components.CmoReviewOtherScreenKt;
import au.com.woolworths.feature.shop.product.availability.ui.ProductAvailabilityScreenKt;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.shop.checkout.ui.substitution.component.SubstitutionErrorScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ FullPageMessage.Error e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ c(FullPageMessage.Error error, Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = error;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AccountDetailsOtherScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                CmoReviewOtherScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            case 2:
                ProductAvailabilityScreenKt.b(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
            default:
                SubstitutionErrorScreenKt.a(this.e, this.f, composer, RecomposeScopeImplKt.a(1));
                break;
        }
        return Unit.f24250a;
    }
}
