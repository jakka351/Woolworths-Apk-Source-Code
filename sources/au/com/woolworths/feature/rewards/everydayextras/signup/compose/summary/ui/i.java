package au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.ui;

import androidx.compose.material.ScaffoldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayData;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayError;
import au.com.woolworths.feature.rewards.everydayextras.signup.summary.wpay.WPayLoadingState;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.feature.rewards.offers.ui.details.OfferDetailsScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ Function0 g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ i(EverydayExtrasSummaryContentItem.WpayPayment wpayPayment, WPayLoadingState wPayLoadingState, WPayData wPayData, WPayError wPayError, boolean z, Function1 function1, Function0 function0, boolean z2, Function0 function02, int i) {
        this.j = wpayPayment;
        this.k = wPayLoadingState;
        this.l = wPayData;
        this.m = wPayError;
        this.e = z;
        this.h = function1;
        this.f = function0;
        this.i = z2;
        this.g = function02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = RecomposeScopeImplKt.a(1);
                WPayPaymentUiKt.a((EverydayExtrasSummaryContentItem.WpayPayment) this.j, (WPayLoadingState) this.k, (WPayData) this.l, (WPayError) this.m, this.e, this.h, this.f, this.i, this.g, (Composer) obj, iA);
                break;
            default:
                ((Integer) obj2).getClass();
                int iA2 = RecomposeScopeImplKt.a(1);
                OfferDetailsScreenKt.b((OfferDetailsPageResponse.OfferDetailsPage) this.j, this.e, (ScaffoldState) this.k, this.f, this.g, this.h, (Function2) this.l, this.i, (Modifier) this.m, (Composer) obj, iA2);
                break;
        }
        return Unit.f24250a;
    }

    public /* synthetic */ i(OfferDetailsPageResponse.OfferDetailsPage offerDetailsPage, boolean z, ScaffoldState scaffoldState, Function0 function0, Function0 function02, Function1 function1, Function2 function2, boolean z2, Modifier modifier, int i) {
        this.j = offerDetailsPage;
        this.e = z;
        this.k = scaffoldState;
        this.f = function0;
        this.g = function02;
        this.h = function1;
        this.l = function2;
        this.i = z2;
        this.m = modifier;
    }
}
