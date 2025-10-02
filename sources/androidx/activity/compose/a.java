package androidx.activity.compose;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModelLazy;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.productreview.ProductReviewAnalytics;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.rewards.account.utils.TwoFactorAuthStepUpHelper;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.dynamic.page.ui.DynamicPageActivity;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsFragmentOld;
import au.com.woolworths.feature.rewards.account.settings.v2.AccountSettingsActivity;
import au.com.woolworths.feature.rewards.account.sso.d;
import au.com.woolworths.feature.shared.notification.optin.NotificationOptInActivity;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionActivity;
import au.com.woolworths.feature.shared.web.file.uploader.permission.CameraPermissionViewModel;
import au.com.woolworths.feature.shop.catalogue.CatalogueStoreSelectionResult;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity;
import au.com.woolworths.feature.shop.catalogue.models.CatalogueStoreInfo;
import au.com.woolworths.feature.shop.myorders.details.cancel.OrderCancellationPromptActivity;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity;
import au.com.woolworths.feature.shop.myorders.orders.list.OrdersListFragment;
import au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity;
import au.com.woolworths.feature.shop.wpay.data.json.parser.GooglePayDataParser;
import au.com.woolworths.feature.shop.wpay.domain.model.GooglePayData;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.InputPayment;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentInstrumentsResponse;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderContract;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderFragment;
import au.com.woolworths.feature.shop.wpay.ui.wpay.WPayForOrderViewModel;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.shop.buyagain.ui.BuyAgainActivity;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewAnalytics;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentFragment;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsFragment;
import au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel;
import au.com.woolworths.shop.checkout.ui.idverification.IdVerificationCompleteResponse;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewContract;
import au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewViewModel;
import com.google.android.gms.wallet.CreditCardExpirationDate;
import com.google.android.gms.wallet.PaymentCardRecognitionResult;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.contract.ApiTaskResult;
import com.google.android.material.snackbar.Snackbar;
import com.swrve.sdk.SwrveSDKBase;
import com.woolworths.scanlibrary.databinding.ActivityOnboardingAddCardBinding;
import com.woolworths.scanlibrary.ui.payment.addfirstcard.AddPaymentActivity;
import com.woolworths.scanlibrary.util.widget.AddCreditCardView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements ActivityResultCallback {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [com.swrve.sdk.ISwrveBase, java.lang.Object] */
    @Override // androidx.activity.result.ActivityResultCallback
    public final void a(Object obj) {
        Intent intent;
        Intent intent2;
        Activities.CmoReviewActivity.Result result;
        Parcelable parcelable;
        Intent intent3;
        Bundle extras;
        OrderCancellationPromptActivity.Result result2;
        GooglePayData googlePayData;
        Object value;
        IdVerificationCompleteResponse idVerificationCompleteResponse;
        Intent intent4;
        PaymentCardRecognitionResult fromIntent;
        int i = this.d;
        int i2 = 2;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ((Function1) ((MutableState) obj2).getD()).invoke(obj);
                return;
            case 1:
                DeliveryAddressSearchActivity deliveryAddressSearchActivity = (DeliveryAddressSearchActivity) obj2;
                ActivityResult result3 = (ActivityResult) obj;
                int i3 = DeliveryAddressSearchActivity.J;
                Intrinsics.h(result3, "result");
                if (result3.d == -1) {
                    deliveryAddressSearchActivity.setResult(-1, result3.e);
                    Views.a(deliveryAddressSearchActivity);
                    deliveryAddressSearchActivity.finish();
                    return;
                }
                return;
            case 2:
                TwoFactorAuthStepUpHelper.launcher$lambda$0((TwoFactorAuthStepUpHelper) obj2, (ActivityResult) obj);
                return;
            case 3:
                DynamicPageActivity dynamicPageActivity = (DynamicPageActivity) obj2;
                ActivityResult result4 = (ActivityResult) obj;
                int i4 = DynamicPageActivity.A;
                Intrinsics.h(result4, "result");
                if (result4.d == -1) {
                    dynamicPageActivity.O4().p6();
                    return;
                }
                return;
            case 4:
                AccountSettingsFragmentOld accountSettingsFragmentOld = (AccountSettingsFragmentOld) obj2;
                ActivityResult result5 = (ActivityResult) obj;
                KProperty[] kPropertyArr = AccountSettingsFragmentOld.r;
                Intrinsics.h(result5, "result");
                if (result5.d == -1 && (intent = result5.e) != null && intent.getBooleanExtra("SUCCESS", false)) {
                    accountSettingsFragmentOld.R1(false);
                    return;
                }
                return;
            case 5:
                AccountSettingsActivity accountSettingsActivity = (AccountSettingsActivity) obj2;
                ActivityResult result6 = (ActivityResult) obj;
                int i5 = AccountSettingsActivity.A;
                Intrinsics.h(result6, "result");
                if (result6.d == -1 && (intent2 = result6.e) != null && intent2.getBooleanExtra("SUCCESS", false)) {
                    accountSettingsActivity.finish();
                    accountSettingsActivity.startActivity(Activities.Welcome.b(false).setFlags(268468224));
                    return;
                }
                return;
            case 6:
                ((Boolean) obj).getClass();
                int i6 = NotificationOptInActivity.y;
                SwrveSDKBase.a();
                SwrveSDKBase.f19075a.s();
                ((NotificationOptInActivity) obj2).finish();
                return;
            case 7:
                CameraPermissionActivity cameraPermissionActivity = (CameraPermissionActivity) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                int i7 = CameraPermissionActivity.z;
                if (!zBooleanValue) {
                    if (cameraPermissionActivity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        return;
                    }
                    ((CameraPermissionViewModel) cameraPermissionActivity.x.getD()).e.d("android.permission.CAMERA", true);
                    return;
                } else {
                    if (cameraPermissionActivity.isFinishing()) {
                        return;
                    }
                    cameraPermissionActivity.setResult(-1);
                    cameraPermissionActivity.finish();
                    return;
                }
            case 8:
                CatalogueIntroActivity catalogueIntroActivity = (CatalogueIntroActivity) obj2;
                CatalogueStoreSelectionResult result7 = (CatalogueStoreSelectionResult) obj;
                int i8 = CatalogueIntroActivity.D;
                Intrinsics.h(result7, "result");
                CatalogueStoreInfo catalogueStoreInfo = result7.b;
                if (catalogueStoreInfo != null) {
                    int i9 = result7.f6780a;
                    Intent intentPutExtra = new Intent().putExtra("extra_store_info", catalogueStoreInfo);
                    Intrinsics.g(intentPutExtra, "putExtra(...)");
                    catalogueIntroActivity.setResult(i9, intentPutExtra);
                    catalogueIntroActivity.finish();
                    return;
                }
                return;
            case 9:
                EditOrderConditionsActivity editOrderConditionsActivity = (EditOrderConditionsActivity) obj2;
                ActivityResult result8 = (ActivityResult) obj;
                int i10 = EditOrderConditionsActivity.C;
                Intrinsics.h(result8, "result");
                if (result8.d == -1) {
                    Intent intent5 = result8.e;
                    if (intent5 != null) {
                        if (Build.VERSION.SDK_INT >= 33) {
                            Bundle extras2 = intent5.getExtras();
                            parcelable = extras2 != null ? (Parcelable) extras2.getParcelable("CMO_REVIEW_DESTINATION_RESULT", Activities.CmoReviewActivity.Result.class) : null;
                        } else {
                            Bundle extras3 = intent5.getExtras();
                            Parcelable parcelable2 = extras3 != null ? extras3.getParcelable("CMO_REVIEW_DESTINATION_RESULT") : null;
                            if (!(parcelable2 instanceof Activities.CmoReviewActivity.Result)) {
                                parcelable2 = null;
                            }
                            parcelable = (Activities.CmoReviewActivity.Result) parcelable2;
                        }
                        result = (Activities.CmoReviewActivity.Result) parcelable;
                    } else {
                        result = null;
                    }
                    Activities.CmoReviewActivity.Result.Destination destination = result != null ? result.d : null;
                    int i11 = destination == null ? -1 : EditOrderConditionsActivity.WhenMappings.f7837a[destination.ordinal()];
                    if (i11 != -1) {
                        if (i11 == 1) {
                            String str = result.e;
                            if (str == null) {
                                str = "";
                            }
                            editOrderConditionsActivity.setResult(-1, new Intent().putExtra("EDIT_ORDER_CONDITIONS_RESULT", new EditOrderConditionsActivity.Result(str)));
                            editOrderConditionsActivity.finish();
                            return;
                        }
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    editOrderConditionsActivity.setResult(-1, new Intent().putExtra("EDIT_ORDER_CONDITIONS_TO_CMO_REVIEW_RESULT", new EditOrderConditionsActivity.CmoReviewResult(true)));
                    editOrderConditionsActivity.finish();
                    return;
                }
                return;
            case 10:
                OrdersListFragment ordersListFragment = (OrdersListFragment) obj2;
                ActivityResult result9 = (ActivityResult) obj;
                OrdersListFragment.Companion companion = OrdersListFragment.p;
                Intrinsics.h(result9, "result");
                if (result9.d != -1 || (intent3 = result9.e) == null || (extras = intent3.getExtras()) == null || (result2 = (OrderCancellationPromptActivity.Result) extras.getParcelable("ORDER_CANCEL_WARNING_RESULT")) == null) {
                    return;
                }
                Snackbar.i(ordersListFragment.I1().h, result2.d, 0).l();
                return;
            case 11:
                RecipeListActivity recipeListActivity = (RecipeListActivity) obj2;
                ActivityResult result10 = (ActivityResult) obj;
                int i12 = RecipeListActivity.C;
                Intrinsics.h(result10, "result");
                if (result10.d == -1) {
                    recipeListActivity.P4();
                    return;
                }
                return;
            case 12:
                WPayForOrderFragment wPayForOrderFragment = (WPayForOrderFragment) obj2;
                ApiTaskResult apiTaskResult = (ApiTaskResult) obj;
                wPayForOrderFragment.i = true;
                if (apiTaskResult.getStatus().getStatusCode() == 0) {
                    WPayForOrderViewModel wPayForOrderViewModel = (WPayForOrderViewModel) wPayForOrderFragment.j.getD();
                    PaymentData paymentData = (PaymentData) apiTaskResult.getResult();
                    MutableStateFlow mutableStateFlow = wPayForOrderViewModel.r;
                    PaymentInstrumentsResponse paymentInstrumentsResponse = (PaymentInstrumentsResponse) ((WPayForOrderContract.ViewState) mutableStateFlow.getValue()).c.c();
                    PaymentMethodItem paymentMethodItemA = paymentInstrumentsResponse != null ? paymentInstrumentsResponse.a() : null;
                    PaymentMethodItem.GooglePay googlePay = paymentMethodItemA instanceof PaymentMethodItem.GooglePay ? (PaymentMethodItem.GooglePay) paymentMethodItemA : null;
                    if (googlePay == null) {
                        IllegalStateException illegalStateException = new IllegalStateException("Unexpected payment submission using Google Pay. Google Pay is not set as active payment.");
                        Bark.Companion companion2 = Bark.f8483a;
                        Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), illegalStateException, null, 28);
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.d(value, WPayForOrderContract.ViewState.a((WPayForOrderContract.ViewState) value, null, null, new PageResult.Fail(illegalStateException), null, null, null, null, null, false, null, null, null, null, 8187)));
                        return;
                    }
                    if (paymentData != null) {
                        GooglePayDataParser googlePayDataParser = wPayForOrderViewModel.n;
                        String json = paymentData.toJson();
                        Intrinsics.g(json, "toJson(...)");
                        googlePayDataParser.getClass();
                        try {
                            googlePayData = (GooglePayData) googlePayDataParser.f8262a.d(GooglePayData.class, json);
                        } catch (Exception e) {
                            Bark.Companion companion3 = Bark.f8483a;
                            Bark.Barker.h(new ReportOwner(ReportOwner.Squad.h), e, null, 28);
                            googlePayData = null;
                        }
                        if (googlePayData != null) {
                            wPayForOrderViewModel.x6(new InputPayment.GooglePay(googlePay.e, googlePayData.f8283a));
                            return;
                        }
                    }
                    Bark.Companion companion4 = Bark.f8483a;
                    Bark.Barker.i(new ReportOwner(ReportOwner.Squad.h), "Unexpected payment submission using Google Pay. Google Pay data is null.", null, 12);
                    new ResText(com.woolworths.R.string.checkout_payment_place_order_fail_msg);
                    return;
                }
                return;
            case 13:
                AddToCartBottomSheetFragment addToCartBottomSheetFragment = (AddToCartBottomSheetFragment) obj2;
                ActivityResult result11 = (ActivityResult) obj;
                Intrinsics.h(result11, "result");
                if (result11.d == 0) {
                    addToCartBottomSheetFragment.dismissAllowingStateLoss();
                    return;
                }
                return;
            case 14:
                BuyAgainActivity buyAgainActivity = (BuyAgainActivity) obj2;
                ActivityResult result12 = (ActivityResult) obj;
                int i13 = BuyAgainActivity.D;
                Intrinsics.h(result12, "result");
                if (result12.d != -1) {
                    buyAgainActivity.finish();
                    return;
                } else {
                    buyAgainActivity.O4().u6(null, null);
                    return;
                }
            case 15:
                ProductReviewFragment productReviewFragment = (ProductReviewFragment) obj2;
                ActivityResult result13 = (ActivityResult) obj;
                Intrinsics.h(result13, "result");
                if (result13.d == -1) {
                    ProductReviewViewModel productReviewViewModelI1 = productReviewFragment.I1();
                    Activities.ProductsReviewActivity.Source source = productReviewViewModelI1.e;
                    ProductReviewAnalytics productReviewAnalytics = productReviewViewModelI1.i;
                    BufferedChannel bufferedChannel = productReviewViewModelI1.l;
                    CollectionModeInteractor collectionModeInteractor = productReviewViewModelI1.h;
                    CollectionMode collectionModeW = collectionModeInteractor.w();
                    if (collectionModeW instanceof CollectionMode.Delivery) {
                        bufferedChannel.k(ProductReviewContract.Actions.ShowSnackBarDeliveryWindowSelected.f10519a);
                        String str2 = source.d;
                        productReviewAnalytics.getClass();
                        productReviewAnalytics.f10512a.g((Event) new ProductReviewAnalytics.ProductReview(str2).h.e.getD());
                    } else if (collectionModeW.equals(CollectionMode.PickUp.d)) {
                        bufferedChannel.k(ProductReviewContract.Actions.ShowSnackBarPickUpWindowSelected.f10520a);
                        String str3 = source.d;
                        productReviewAnalytics.getClass();
                        productReviewAnalytics.f10512a.g((Event) new ProductReviewAnalytics.ProductReview(str3).h.f.getD());
                    } else {
                        if (!collectionModeW.equals(CollectionMode.InStore.d) && !collectionModeW.equals(CollectionMode.NotSet.d)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        ProductReviewViewModel.q.o("Unexpected window selection for collection mode: " + collectionModeInteractor.w(), new Object[0]);
                    }
                    productReviewViewModelI1.p6(false);
                    return;
                }
                return;
            case 16:
                CheckoutContentFragment checkoutContentFragment = (CheckoutContentFragment) obj2;
                ActivityResult result14 = (ActivityResult) obj;
                Intrinsics.h(result14, "result");
                Intent intent6 = result14.e;
                if (intent6 == null || (idVerificationCompleteResponse = (IdVerificationCompleteResponse) intent6.getParcelableExtra("data")) == null) {
                    return;
                }
                checkoutContentFragment.h2(idVerificationCompleteResponse);
                return;
            case 17:
                CheckoutDetailsFragment checkoutDetailsFragment = (CheckoutDetailsFragment) obj2;
                ActivityResult result15 = (ActivityResult) obj;
                Intrinsics.h(result15, "result");
                if (result15.d == -1) {
                    CheckoutDetailsViewModel checkoutDetailsViewModelO2 = checkoutDetailsFragment.o2();
                    checkoutDetailsViewModelO2.r = false;
                    checkoutDetailsViewModelO2.r6(new c(checkoutDetailsViewModelO2, 4));
                    return;
                }
                return;
            case 18:
                WatchlistBottomSheetFragment watchlistBottomSheetFragment = (WatchlistBottomSheetFragment) obj2;
                Boolean it = (Boolean) obj;
                Intrinsics.h(it, "it");
                ((WatchlistBottomSheetFragment.BottomSheetHost) watchlistBottomSheetFragment.i.getD()).u2();
                watchlistBottomSheetFragment.dismiss();
                return;
            case 19:
                ViewModelLazy viewModelLazy = ((SubmitReviewActivity) obj2).x;
                ActivityResult result16 = (ActivityResult) obj;
                int i14 = SubmitReviewActivity.z;
                Intrinsics.h(result16, "result");
                int i15 = result16.d;
                if (i15 == -1) {
                    ((SubmitReviewViewModel) viewModelLazy.getD()).q6();
                    return;
                } else {
                    if (i15 == 0) {
                        ((SubmitReviewViewModel) viewModelLazy.getD()).h.f(SubmitReviewContract.Action.OnNavigateUp.f12770a);
                        return;
                    }
                    return;
                }
            default:
                AddPaymentActivity addPaymentActivity = (AddPaymentActivity) obj2;
                ActivityResult scanResult = (ActivityResult) obj;
                int i16 = AddPaymentActivity.M;
                Intrinsics.h(scanResult, "scanResult");
                if (scanResult.d == 0 || (intent4 = scanResult.e) == null || (fromIntent = PaymentCardRecognitionResult.getFromIntent(intent4)) == null) {
                    return;
                }
                String pan = fromIntent.getPan();
                Intrinsics.g(pan, "getPan(...)");
                CreditCardExpirationDate creditCardExpirationDate = fromIntent.getCreditCardExpirationDate();
                int month = creditCardExpirationDate != null ? creditCardExpirationDate.getMonth() : 0;
                CreditCardExpirationDate creditCardExpirationDate2 = fromIntent.getCreditCardExpirationDate();
                int year = creditCardExpirationDate2 != null ? creditCardExpirationDate2.getYear() : 0;
                ActivityOnboardingAddCardBinding activityOnboardingAddCardBinding = addPaymentActivity.J;
                if (activityOnboardingAddCardBinding == null) {
                    Intrinsics.p("viewBinding");
                    throw null;
                }
                AddCreditCardView addCreditCardView = activityOnboardingAddCardBinding.y;
                addCreditCardView.getClass();
                StringBuffer stringBuffer = new StringBuffer();
                if (!TextUtils.isEmpty(pan)) {
                    stringBuffer.append("document.getElementById('embedded-frame').contentWindow.document.getElementById('card_number').value = '" + pan + "';");
                    stringBuffer.append('\n');
                }
                if (month > 0) {
                    stringBuffer.append("document.getElementById('embedded-frame').contentWindow.document.getElementById('expiry_month').value = '" + month + "';");
                    stringBuffer.append('\n');
                }
                if (year > 0) {
                    stringBuffer.append("document.getElementById('embedded-frame').contentWindow.document.getElementById('exp_year').value = '" + year + "';");
                }
                stringBuffer.append("var event = new Event('change');\n                       document.getElementById('embedded-frame').contentWindow.document.getElementById('card_number').dispatchEvent(event);\n                       document.getElementById('embedded-frame').contentWindow.document.getElementById('expiry_month').dispatchEvent(event);\n                       document.getElementById('embedded-frame').contentWindow.document.getElementById('exp_year').dispatchEvent(event);");
                CardCaptureView cardCaptureView = addCreditCardView.i;
                if (cardCaptureView != null) {
                    cardCaptureView.evaluateJavascript(stringBuffer.toString(), new d(i2));
                    return;
                }
                return;
        }
    }
}
