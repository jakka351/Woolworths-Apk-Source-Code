package au.com.woolworths.shop.checkout.ui.details;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import au.com.woolworths.sdui.common.coretag.model.CoreTagModel;
import au.com.woolworths.shop.checkout.domain.model.ApplyCheckoutPromoCodeResult;
import au.com.woolworths.shop.checkout.domain.model.CheckoutStoreCreditItem;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.substitution.component.preview.SubstitutionViewStateProvider;
import au.com.woolworths.shop.checkout.ui.summary.storecredit.StoreCreditContentProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                InsetBanner it = (InsetBanner) obj;
                Intrinsics.h(it, "it");
                return unit;
            case 1:
                EditOrderBannerView it2 = (EditOrderBannerView) obj;
                Intrinsics.h(it2, "it");
                return unit;
            case 2:
                BroadcastBannerData it3 = (BroadcastBannerData) obj;
                Intrinsics.h(it3, "it");
                return unit;
            case 3:
                BroadcastBannerData it4 = (BroadcastBannerData) obj;
                Intrinsics.h(it4, "it");
                return unit;
            case 4:
                String it5 = (String) obj;
                Intrinsics.h(it5, "it");
                return unit;
            case 5:
                String it6 = (String) obj;
                Intrinsics.h(it6, "it");
                return unit;
            case 6:
                SubstitutionPreferenceOption it7 = (SubstitutionPreferenceOption) obj;
                Intrinsics.h(it7, "it");
                return unit;
            case 7:
                BroadcastBannerData it8 = (BroadcastBannerData) obj;
                Intrinsics.h(it8, "it");
                return unit;
            case 8:
                String it9 = (String) obj;
                Object obj2 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it9, "it");
                return it9;
            case 9:
                String it10 = (String) obj;
                Object obj3 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it10, "it");
                return it10;
            case 10:
                String it11 = (String) obj;
                Object obj4 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it11, "it");
                return it11;
            case 11:
                String it12 = (String) obj;
                Object obj5 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it12, "it");
                return it12;
            case 12:
                String it13 = (String) obj;
                Object obj6 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it13, "it");
                return it13;
            case 13:
                String it14 = (String) obj;
                Object obj7 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it14, "it");
                return it14;
            case 14:
                String it15 = (String) obj;
                Object obj8 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it15, "it");
                return it15;
            case 15:
                String it16 = (String) obj;
                Object obj9 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it16, "it");
                return it16;
            case 16:
                String it17 = (String) obj;
                Object obj10 = SubstitutionViewStateProvider.f10821a;
                Intrinsics.h(it17, "it");
                return it17;
            case 17:
                String it18 = (String) obj;
                Intrinsics.h(it18, "it");
                return it18;
            case 18:
                String it19 = (String) obj;
                Intrinsics.h(it19, "it");
                return it19;
            case 19:
                String it20 = (String) obj;
                Intrinsics.h(it20, "it");
                return unit;
            case 20:
                String it21 = (String) obj;
                Intrinsics.h(it21, "it");
                return unit;
            case 21:
                ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo it22 = (ApplyCheckoutPromoCodeResult.ApplyCheckoutPromoCodeAdditionalInfo) obj;
                Intrinsics.h(it22, "it");
                return unit;
            case 22:
                CheckoutStoreCreditItem it23 = (CheckoutStoreCreditItem) obj;
                Intrinsics.h(it23, "it");
                return unit;
            case 23:
                CheckoutStoreCreditItem it24 = (CheckoutStoreCreditItem) obj;
                Intrinsics.h(it24, "it");
                return unit;
            case 24:
                StoreCreditContentProvider.TestCase it25 = (StoreCreditContentProvider.TestCase) obj;
                Intrinsics.h(it25, "it");
                return it25.d;
            case 25:
                FulfilmentSlot it26 = (FulfilmentSlot) obj;
                Intrinsics.h(it26, "it");
                return unit;
            case 26:
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                SemanticsPropertiesKt.g(semantics);
                return unit;
            case 27:
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                return unit;
            case 28:
                CoreTagModel it27 = (CoreTagModel) obj;
                Intrinsics.h(it27, "it");
                return it27.f9999a;
            default:
                CoreTagModel it28 = (CoreTagModel) obj;
                Intrinsics.h(it28, "it");
                return it28.f9999a;
        }
    }
}
