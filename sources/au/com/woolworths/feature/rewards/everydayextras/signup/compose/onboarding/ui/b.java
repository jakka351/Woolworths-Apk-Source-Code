package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.ui;

import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.summary.EverydayExtraSummaryContract;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasSubscribeFooterItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.summary.EverydayExtrasSummaryContentItem;
import au.com.woolworths.feature.rewards.everydayextras.signup.databinding.LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding;
import au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsFullPageErrorStateLegacy;
import au.com.woolworths.feature.rewards.offers.listpage.OffersListPageContract;
import au.com.woolworths.foundation.rewards.offers.model.OfferViewItem;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.rewards.base.data.EmptyStateButtonData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Intrinsics.h((EverydayExtrasSubscribeFooterItem) obj, "<unused var>");
                break;
            case 1:
                ModalBottomSheetValue it = (ModalBottomSheetValue) obj;
                Intrinsics.h(it, "it");
                break;
            case 2:
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding it2 = (LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding) obj;
                Intrinsics.h(it2, "it");
                break;
            case 3:
                String it3 = (String) obj;
                Intrinsics.h(it3, "it");
                break;
            case 4:
                String it4 = (String) obj;
                Intrinsics.h(it4, "it");
                break;
            case 5:
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding it5 = (LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding) obj;
                Intrinsics.h(it5, "it");
                break;
            case 6:
                String it6 = (String) obj;
                Intrinsics.h(it6, "it");
                break;
            case 7:
                String it7 = (String) obj;
                Intrinsics.h(it7, "it");
                break;
            case 8:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                break;
            case 9:
                EverydayExtraSummaryContract.ViewState state = (EverydayExtraSummaryContract.ViewState) obj;
                Intrinsics.h(state, "state");
                break;
            case 10:
                LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding it8 = (LayoutEverydayExtrasWpaySchemeCardInputWebViewBinding) obj;
                Intrinsics.h(it8, "it");
                break;
            case 11:
                String it9 = (String) obj;
                Intrinsics.h(it9, "it");
                break;
            case 12:
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                break;
            case 13:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                break;
            case 14:
                EverydayExtrasSummaryContentItem.WpayPayment.CardProviderIcon it10 = (EverydayExtrasSummaryContentItem.WpayPayment.CardProviderIcon) obj;
                Intrinsics.h(it10, "it");
                String str = it10.b;
                if (str == null) {
                }
                break;
            case 15:
                RewardsOfferDetailsFullPageErrorStateLegacy it11 = (RewardsOfferDetailsFullPageErrorStateLegacy) obj;
                Intrinsics.h(it11, "it");
                break;
            case 16:
                EmptyStateButtonData it12 = (EmptyStateButtonData) obj;
                Intrinsics.h(it12, "it");
                break;
            case 17:
                RewardsOfferDetailsFullPageErrorStateLegacy it13 = (RewardsOfferDetailsFullPageErrorStateLegacy) obj;
                Intrinsics.h(it13, "it");
                break;
            case 18:
                EmptyStateButtonData it14 = (EmptyStateButtonData) obj;
                Intrinsics.h(it14, "it");
                break;
            case 19:
                RewardsOfferDetailsFullPageErrorStateLegacy it15 = (RewardsOfferDetailsFullPageErrorStateLegacy) obj;
                Intrinsics.h(it15, "it");
                break;
            case 20:
                EmptyStateButtonData it16 = (EmptyStateButtonData) obj;
                Intrinsics.h(it16, "it");
                break;
            case 21:
                RewardsOfferDetailsFullPageErrorStateLegacy it17 = (RewardsOfferDetailsFullPageErrorStateLegacy) obj;
                Intrinsics.h(it17, "it");
                break;
            case 22:
                EmptyStateButtonData it18 = (EmptyStateButtonData) obj;
                Intrinsics.h(it18, "it");
                break;
            case 23:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                break;
            case 24:
                List offers = (List) obj;
                Intrinsics.h(offers, "offers");
                List list = offers;
                ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
                Iterator it19 = list.iterator();
                while (it19.hasNext()) {
                    arrayList.add(OfferViewItem.a((OfferViewItem) it19.next(), false));
                }
                break;
            case 25:
                SemanticsPropertyReceiver semantics4 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics4, "$this$semantics");
                SemanticsPropertiesKt.h(semantics4, "View", null);
                break;
            case 26:
                OffersListPageContract.ViewStateUi state2 = (OffersListPageContract.ViewStateUi) obj;
                Intrinsics.h(state2, "state");
                break;
            case 27:
                ContentCta it20 = (ContentCta) obj;
                Intrinsics.h(it20, "it");
                break;
            case 28:
                RewardsOfferData it21 = (RewardsOfferData) obj;
                Intrinsics.h(it21, "it");
                break;
            default:
                RewardsOfferData it22 = (RewardsOfferData) obj;
                Intrinsics.h(it22, "it");
                break;
        }
        return Unit.f24250a;
    }
}
