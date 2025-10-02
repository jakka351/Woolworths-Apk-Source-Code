package au.com.woolworths.shop.checkout.ui.substitution;

import au.com.woolworths.feature.shop.banners.broadcastbanner.BannerDismissInteractor;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutSubstitutionActions;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SubstitutionActivity$onCreate$2$1$6$1 extends FunctionReferenceImpl implements Function1<BroadcastBannerData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object objA;
        BroadcastBannerData p0 = (BroadcastBannerData) obj;
        Intrinsics.h(p0, "p0");
        SubstitutionViewModel substitutionViewModel = (SubstitutionViewModel) this.receiver;
        substitutionViewModel.getClass();
        BannerDismissInteractor bannerDismissInteractor = substitutionViewModel.f;
        String bannerId = p0.getBannerId();
        if (bannerId != null) {
            bannerDismissInteractor.b(bannerId);
        }
        String analyticsLabel = p0.getAnalyticsLabel();
        if (analyticsLabel != null) {
            substitutionViewModel.g.c(new CheckoutSubstitutionActions.CheaperBannerClick(analyticsLabel));
        }
        MutableStateFlow mutableStateFlow = substitutionViewModel.j;
        do {
            value = mutableStateFlow.getValue();
            objA = (SubstitutionContract.ViewState) value;
            if (objA instanceof SubstitutionContract.ViewState.Content) {
                SubstitutionContract.ViewState.Content content = (SubstitutionContract.ViewState.Content) objA;
                BroadcastBannerData broadcastBannerData = content.f10815a.b.f10658a;
                objA = SubstitutionContract.ViewState.Content.a(content, null, null, null, broadcastBannerData != null ? bannerDismissInteractor.a(broadcastBannerData) : false, 15);
            }
        } while (!mutableStateFlow.d(value, objA));
        return Unit.f24250a;
    }
}
