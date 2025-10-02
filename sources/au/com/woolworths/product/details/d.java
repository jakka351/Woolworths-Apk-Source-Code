package au.com.woolworths.product.details;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.network.Component;
import au.com.woolworths.android.onesite.utils.Locales;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.foundation.shop.banners.broadcastbanner.data.BroadcastBannerData;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.details.ProductDetailsContract;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.RewardsOfferInfo;
import au.com.woolworths.scanandgo.ScanAndGoInteractor;
import au.com.woolworths.scanandgo.data.ScanAndGoUserData;
import au.com.woolworths.sdui.legacy.banner.InlineErrorDesign;
import au.com.woolworths.shop.addtolist.databinding.ItemColorSwatchBinding;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity;
import au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListContract;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import au.com.woolworths.shop.aem.components.model.contentcard.FullWidthImageCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardData;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardPriceInfo;
import au.com.woolworths.shop.aem.components.model.offercard.OfferCardVariant;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragmentArgs;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel;
import au.com.woolworths.shop.cart.ui.quickadd.QuickAddOfferViewModel;
import au.com.woolworths.shop.checkout.ItemCheckoutFulfilmentWindowsOptionBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutPromotionDiscountBindingModel_;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutMarketProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionDiscountItem;
import au.com.woolworths.shop.checkout.domain.model.CheckoutPromotionDiscounts;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.domain.model.MarketSellerGroup;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionPreferenceOption;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentSlot;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutAnalyticsExtKt;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutProductsActions;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutFulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.components.ItemCheckoutProductsSubstitution;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutSummaryEpoxyController;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsFragment;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import au.com.woolworths.shop.checkout.ui.product.CheckoutProductViewModel;
import au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragment;
import au.com.woolworths.shop.checkout.ui.shopperNote.ShopperNoteFragmentArgs;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionActivity;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionContract;
import au.com.woolworths.shop.checkout.ui.substitution.SubstitutionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmation.ConfirmationContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.ConfirmSubscriptionViewModel;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionContract;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionEpoxyControllerOld;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpSummary;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribe;
import au.com.woolworths.shop.deliveryunlimited.signup.databinding.ActivityDeliveryUnlimitedSignupLandingBinding;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingContract;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingEpoxyController;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentViewModel;
import au.com.woolworths.shop.lists.data.database.ProductDao_Impl;
import au.com.woolworths.shop.lists.ui.details.models.ListDetailsTotalOverview;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import com.airbnb.epoxy.EpoxyController;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes4.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        RewardsOfferInfo rewardsOfferInfo;
        ArrayList arrayList;
        Object value;
        Object objA;
        DeliveryUnlimitedSignUpSummary summary;
        int i = this.d;
        int i2 = 0;
        AttributeSet attributeSet = null;
        Unit unit = Unit.f24250a;
        ?? r13 = this.e;
        switch (i) {
            case 0:
                ProductDetailsViewModel productDetailsViewModel = (ProductDetailsViewModel) r13;
                List list2 = (List) obj;
                MutableLiveData mutableLiveData = productDetailsViewModel.o;
                ProductCard productCardC = ProductDetailsContractKt.c((ProductDetailsContract.ViewState) mutableLiveData.e());
                String d = (productCardC == null || (rewardsOfferInfo = productCardC.getRewardsOfferInfo()) == null) ? null : rewardsOfferInfo.getD();
                if (d != null) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (Intrinsics.c(((BasicRewardsOfferStatusData) next).getD(), d)) {
                                attributeSet = next;
                            }
                        }
                    }
                    BasicRewardsOfferStatusData basicRewardsOfferStatusData = (BasicRewardsOfferStatusData) attributeSet;
                    if (basicRewardsOfferStatusData == null || basicRewardsOfferStatusData.getN() != RewardsOfferStatus.ACTIVATED) {
                        ProductDetailsContract.ViewState viewState = (ProductDetailsContract.ViewState) mutableLiveData.e();
                        if (viewState != null && (list = viewState.f9310a) != null) {
                            ProductDetailsViewModel.w6(productDetailsViewModel, mutableLiveData, ProductAnalyticsExtKt.i(list, list2), null, null, null, 29);
                        }
                    } else {
                        productDetailsViewModel.q6();
                    }
                }
                return unit;
            case 1:
                MatchResult match = (MatchResult) obj;
                Intrinsics.h(match, "match");
                List listC = match.c();
                String str = (String) listC.get(0);
                StringBuilder sb = new StringBuilder();
                sb.append((String) listC.get(1));
                sb.append(" ");
                String lowerCase = ((String) listC.get(2)).toLowerCase(Locales.a());
                Intrinsics.g(lowerCase, "toLowerCase(...)");
                String str2 = (String) r13.get(lowerCase);
                if (str2 != null) {
                    lowerCase = str2;
                }
                sb.append(lowerCase);
                boolean zF = new Regex("([\\d][\\d]+|[2-9]).*").f(str);
                if (!StringsKt.D(lowerCase) && zF) {
                    sb.append("s");
                }
                return sb.toString();
            case 2:
                ScanAndGoInteractor scanAndGoInteractor = (ScanAndGoInteractor) r13;
                scanAndGoInteractor.a((ScanAndGoUserData) ((Component) obj).b());
                scanAndGoInteractor.f9981a.c.b("");
                return unit;
            case 3:
                DrawScope drawBehind = (DrawScope) obj;
                Intrinsics.h(drawBehind, "$this$drawBehind");
                float fT1 = drawBehind.T1(1);
                float fIntBitsToFloat = Float.intBitsToFloat((int) (drawBehind.h() & 4294967295L)) - (fT1 / 2);
                drawBehind.b1(((InlineErrorDesign) r13).f, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawBehind.h() >> 32))) << 32) | (4294967295L & Float.floatToRawIntBits(fIntBitsToFloat)), fT1, (464 & 16) != 0 ? 0 : 0, (464 & 32) != 0 ? null : null, 3);
                return unit;
            case 4:
                KeyframesSpec.KeyframesSpecConfig keyframes = (KeyframesSpec.KeyframesSpecConfig) obj;
                Intrinsics.h(keyframes, "$this$keyframes");
                keyframes.f765a = 3200;
                keyframes.a(1800, new Dp(0));
                keyframes.a(3200, new Dp(((BoxWithConstraintsScope) r13).f()));
                return unit;
            case 5:
                CreateUpdateShoppingListContract.ViewState viewState2 = (CreateUpdateShoppingListContract.ViewState) obj;
                ArrayList arrayList2 = ((CreateUpdateShoppingListActivity) r13).z;
                if (arrayList2 == null) {
                    Intrinsics.p("swatchBindings");
                    throw null;
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ItemColorSwatchBinding itemColorSwatchBinding = (ItemColorSwatchBinding) it2.next();
                    itemColorSwatchBinding.N(itemColorSwatchBinding.C == viewState2.b.getColor());
                }
                return unit;
            case 6:
                OfferCardData offerCardData = (OfferCardData) r13;
                SemanticsPropertyReceiver semantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics, "$this$semantics");
                StringBuilder sb2 = new StringBuilder();
                ImageWithAltText imageWithAltText = offerCardData.h;
                String str3 = offerCardData.e;
                if (imageWithAltText != null) {
                    sb2.append(imageWithAltText.b);
                    sb2.append(", ");
                }
                if (!StringsKt.D(str3) && offerCardData.l != OfferCardVariant.f) {
                    sb2.append(str3);
                    sb2.append(", ");
                }
                String str4 = offerCardData.f;
                if (str4 != null) {
                    sb2.append(str4);
                    sb2.append(", ");
                }
                OfferCardPriceInfo offerCardPriceInfo = offerCardData.k;
                if (offerCardPriceInfo != null) {
                    String str5 = offerCardPriceInfo.c;
                    if (str5 != null) {
                        sb2.append(str5);
                        sb2.append(" ");
                    }
                    String str6 = offerCardPriceInfo.d;
                    if (str6 != null) {
                        sb2.append(str6);
                        sb2.append(" ");
                    }
                    String str7 = offerCardPriceInfo.f10176a;
                    if (str7 != null) {
                        sb2.append("$");
                    } else {
                        str7 = "$0";
                    }
                    sb2.append(str7);
                    String str8 = offerCardPriceInfo.b;
                    if (str8 != null) {
                        sb2.append(".");
                        sb2.append(str8);
                    }
                    sb2.append(" ");
                    String str9 = offerCardPriceInfo.e;
                    if (str9 != null) {
                        if (str9.equals("ea")) {
                            str9 = "each";
                        }
                        sb2.append(str9);
                    }
                }
                SemanticsPropertiesKt.k(semantics, sb2.toString());
                return unit;
            case 7:
                FullWidthImageCardData fullWidthImageCardData = (FullWidthImageCardData) r13;
                SemanticsPropertyReceiver clearAndSetSemantics = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(clearAndSetSemantics, "$this$clearAndSetSemantics");
                String str10 = fullWidthImageCardData.d;
                if (str10 == null) {
                    str10 = fullWidthImageCardData.c;
                }
                SemanticsPropertiesKt.k(clearAndSetSemantics, str10);
                return unit;
            case 8:
                ProductReviewAlternativeFragment productReviewAlternativeFragment = (ProductReviewAlternativeFragment) r13;
                Intrinsics.h((SavedStateHandle) obj, "it");
                ProductReviewAlternativeViewModel.Factory factory = productReviewAlternativeFragment.i;
                if (factory != null) {
                    return factory.a(((ProductReviewAlternativeFragmentArgs) productReviewAlternativeFragment.j.getD()).f10507a);
                }
                Intrinsics.p("viewModelFactory");
                throw null;
            case 9:
                Event it3 = (Event) obj;
                int i3 = QuickAddOfferViewModel.p;
                Intrinsics.h(it3, "it");
                ((QuickAddOfferViewModel) r13).g.g(it3);
                return unit;
            case 10:
                ItemCheckoutFulfilmentWindows itemCheckoutFulfilmentWindows = (ItemCheckoutFulfilmentWindows) r13;
                EpoxyController withModels = (EpoxyController) obj;
                int i4 = ItemCheckoutFulfilmentWindows.i;
                Intrinsics.h(withModels, "$this$withModels");
                for (Object obj2 : itemCheckoutFulfilmentWindows.getFulfilmentWindows().e) {
                    int i5 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    ItemCheckoutFulfilmentWindowsOptionBindingModel_ itemCheckoutFulfilmentWindowsOptionBindingModel_ = new ItemCheckoutFulfilmentWindowsOptionBindingModel_();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.M("fulfilment_windows_option_#" + i2);
                    FulfilmentWindows fulfilmentWindows = itemCheckoutFulfilmentWindows.getFulfilmentWindows();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.t();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.n = fulfilmentWindows;
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.t();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.o = (FulfilmentWindowsOption) obj2;
                    String title = itemCheckoutFulfilmentWindows.getTitle();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.t();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.p = title;
                    FulfilmentWindowsListener fulfilmentWindowsListener = itemCheckoutFulfilmentWindows.listener;
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.t();
                    itemCheckoutFulfilmentWindowsOptionBindingModel_.q = fulfilmentWindowsListener;
                    withModels.add(itemCheckoutFulfilmentWindowsOptionBindingModel_);
                    i2 = i5;
                }
                return unit;
            case 11:
                int iIntValue = ((Integer) obj).intValue();
                ImageView imageView = ((ItemCheckoutProductsSubstitution.ViewHolder) r13).c;
                if (imageView != null) {
                    imageView.setImageResource(iIntValue);
                    return unit;
                }
                Intrinsics.p("substitutionImageView");
                throw null;
            case 12:
                EpoxyController withModels2 = (EpoxyController) obj;
                Intrinsics.h(withModels2, "$this$withModels");
                for (CheckoutPromotionDiscountItem checkoutPromotionDiscountItem : ((CheckoutPromotionDiscounts) r13).f10579a) {
                    ItemCheckoutPromotionDiscountBindingModel_ itemCheckoutPromotionDiscountBindingModel_ = new ItemCheckoutPromotionDiscountBindingModel_();
                    itemCheckoutPromotionDiscountBindingModel_.q("item_checkout_discount_item", checkoutPromotionDiscountItem.f10578a, checkoutPromotionDiscountItem.b);
                    itemCheckoutPromotionDiscountBindingModel_.t();
                    itemCheckoutPromotionDiscountBindingModel_.n = checkoutPromotionDiscountItem;
                    withModels2.add(itemCheckoutPromotionDiscountBindingModel_);
                }
                return unit;
            case 13:
                Function0 dismiss = (Function0) obj;
                Intrinsics.h(dismiss, "dismiss");
                ((CheckoutContentFragment) r13).I1().c(CheckoutDetailsActions.IdVerificationNotNow.e);
                dismiss.invoke();
                return unit;
            case 14:
                Context context = (Context) obj;
                Intrinsics.h(context, "context");
                EditOrderBannerView editOrderBannerView = new EditOrderBannerView(context, attributeSet, 6, i2);
                editOrderBannerView.setEvenHandler((EditOrderEventHandler) r13);
                return editOrderBannerView;
            case 15:
                BroadcastBannerData it4 = (BroadcastBannerData) obj;
                Intrinsics.h(it4, "it");
                ((CheckoutProductEpoxyController) r13).onSubstitutionOnboardingBannerDismiss(it4);
                return unit;
            case 16:
                return CheckoutSummaryEpoxyController.buildUi$lambda$9$lambda$8((CheckoutSummaryEpoxyController) r13, (String) obj);
            case 17:
                ((FulfilmentWindowsFragment) r13).I1().u6(((Integer) obj).intValue(), null);
                return unit;
            case 18:
                CheckoutProductViewModel checkoutProductViewModel = (CheckoutProductViewModel) r13;
                Checkout checkout = (Checkout) obj;
                CheckoutProductsActions.DataLoaded dataLoaded = CheckoutProductsActions.DataLoaded.e;
                Intrinsics.h(checkout, "<this>");
                List list3 = checkout.b;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list3) {
                    if (obj3 instanceof CheckoutProducts) {
                        ArrayList arrayList4 = ((CheckoutProducts) obj3).e;
                        arrayList = new ArrayList(CollectionsKt.s(arrayList4, 10));
                        Iterator it5 = arrayList4.iterator();
                        while (it5.hasNext()) {
                            arrayList.add(CheckoutAnalyticsExtKt.b((CheckoutProduct) it5.next()));
                        }
                    } else if (obj3 instanceof CheckoutMarketProducts) {
                        ArrayList<MarketSellerGroup> arrayList5 = ((CheckoutMarketProducts) obj3).c;
                        arrayList = new ArrayList();
                        for (MarketSellerGroup marketSellerGroup : arrayList5) {
                            ArrayList arrayList6 = marketSellerGroup.c;
                            ArrayList arrayList7 = new ArrayList(CollectionsKt.s(arrayList6, 10));
                            Iterator it6 = arrayList6.iterator();
                            while (it6.hasNext()) {
                                arrayList7.add(CheckoutAnalyticsExtKt.c((MarketProductRow) it6.next(), marketSellerGroup.f10621a, marketSellerGroup.b));
                            }
                            CollectionsKt.h(arrayList7, arrayList);
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        arrayList3.add(arrayList);
                    }
                }
                checkoutProductViewModel.E6(dataLoaded, ProductTrackingValueKt.a(CollectionsKt.G(arrayList3)));
                return unit;
            case 19:
                ShopperNoteFragment shopperNoteFragment = (ShopperNoteFragment) r13;
                String newText = (String) obj;
                Intrinsics.h(newText, "newText");
                CheckoutProductViewModel checkoutProductViewModel2 = (CheckoutProductViewModel) shopperNoteFragment.d.getD();
                NavArgsLazy navArgsLazy = shopperNoteFragment.f;
                checkoutProductViewModel2.J6(((ShopperNoteFragmentArgs) navArgsLazy.getD()).f10810a.h, ((ShopperNoteFragmentArgs) navArgsLazy.getD()).f10810a.i, newText);
                return unit;
            case 20:
                SubstitutionPreferenceOption it7 = (SubstitutionPreferenceOption) obj;
                Intrinsics.h(it7, "it");
                SubstitutionViewModel substitutionViewModelN4 = ((SubstitutionActivity) r13).N4();
                String str11 = it7.f10666a;
                MutableStateFlow mutableStateFlow = substitutionViewModelN4.j;
                do {
                    value = mutableStateFlow.getValue();
                    Object obj4 = (SubstitutionContract.ViewState) value;
                    boolean z = obj4 instanceof SubstitutionContract.ViewState.Content;
                    objA = obj4;
                    if (z) {
                        SubstitutionContract.ViewState.Content content = (SubstitutionContract.ViewState.Content) obj4;
                        boolean zC = Intrinsics.c(content.b, str11);
                        objA = content;
                        if (!zC) {
                            objA = SubstitutionContract.ViewState.Content.a(content, str11, substitutionViewModelN4.s6(content, str11, content.d), null, false, 25);
                        }
                    }
                } while (!mutableStateFlow.d(value, objA));
                return unit;
            case 21:
                ((HorizontalSelectorViewListener) r13).z2(((Integer) obj).intValue());
                return unit;
            case 22:
                FulfilmentSlot fulfilmentSlot = (FulfilmentSlot) r13;
                SemanticsPropertyReceiver semantics2 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics2, "$this$semantics");
                String strM = CollectionsKt.M(fulfilmentSlot.j, ",", null, null, new au.com.woolworths.shop.checkout.ui.details.d(28), 30);
                String str12 = fulfilmentSlot.b;
                String str13 = fulfilmentSlot.c;
                String str14 = str13 != null ? str13 : "";
                String str15 = fulfilmentSlot.d;
                String strM2 = CollectionsKt.M(fulfilmentSlot.i, ",", null, null, new au.com.woolworths.shop.checkout.ui.details.d(29), 30);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strM);
                sb3.append(", ");
                sb3.append(str12);
                sb3.append(", ");
                sb3.append(str14);
                SemanticsPropertiesKt.k(semantics2, androidx.constraintlayout.core.state.a.l(sb3, ", ", str15, ", ", strM2));
                return unit;
            case 23:
                ((ConfirmationActivity) r13).z.setData(((ConfirmationContract.ViewState) obj).b);
                return unit;
            case 24:
                int i6 = ConfirmSubscriptionActivity.B;
                ConfirmSubscriptionViewModel confirmSubscriptionViewModelO4 = ((ConfirmSubscriptionActivity) r13).O4();
                ConfirmSubscriptionViewModel.s6(confirmSubscriptionViewModelO4, confirmSubscriptionViewModelO4.j, false, ((Boolean) obj).booleanValue() ? StatefulButtonState.d : StatefulButtonState.f, null, 13);
                return unit;
            case 25:
                ((ConfirmSubscriptionTermsAndConditionEpoxyControllerOld) ((ConfirmSubscriptionTermsAndConditionBottomSheetFragmentOld) r13).l.getD()).setData((ConfirmSubscriptionTermsAndConditionContract.ViewState) obj);
                return unit;
            case 26:
                DeliveryUnlimitedSignUpLandingActivity deliveryUnlimitedSignUpLandingActivity = (DeliveryUnlimitedSignUpLandingActivity) r13;
                DeliveryUnlimitedSignUpLandingContract.ViewState viewState3 = (DeliveryUnlimitedSignUpLandingContract.ViewState) obj;
                ActivityDeliveryUnlimitedSignupLandingBinding activityDeliveryUnlimitedSignupLandingBinding = deliveryUnlimitedSignUpLandingActivity.y;
                if (activityDeliveryUnlimitedSignupLandingBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                activityDeliveryUnlimitedSignupLandingBinding.y.setExpanded(viewState3.c == null);
                DeliveryUnlimitedSubscribe deliveryUnlimitedSubscribe = viewState3.b;
                if (deliveryUnlimitedSubscribe != null && (summary = deliveryUnlimitedSubscribe.getSummary()) != null) {
                    ((DeliveryUnlimitedSignUpLandingEpoxyController) deliveryUnlimitedSignUpLandingActivity.A.getD()).setData(summary);
                }
                return unit;
            case 27:
                ((PaymentViewModel) r13).u6();
                return unit;
            case 28:
                ArrayMap it8 = (ArrayMap) obj;
                Intrinsics.h(it8, "it");
                ((ProductDao_Impl) r13).h(it8);
                return unit;
            default:
                SemanticsPropertyReceiver semantics3 = (SemanticsPropertyReceiver) obj;
                Intrinsics.h(semantics3, "$this$semantics");
                SemanticsPropertiesKt.k(semantics3, ((ListDetailsTotalOverview) r13).c);
                return unit;
        }
    }
}
