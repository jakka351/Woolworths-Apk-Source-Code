package au.com.woolworths.product.details;

import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.pay.sdk.PayClient;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import au.com.woolworths.product.details.ui.CollapsibleContentUiModel;
import au.com.woolworths.product.details.ui.ProductNutritionInfoUiModel;
import au.com.woolworths.shop.checkout.ItemCheckoutCampaignBindingModel_;
import au.com.woolworths.shop.checkout.ItemCheckoutFulfilmentMessageBindingModel_;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaign;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsMessage;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.CheckoutProductEpoxyController;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindowsgroup.FulfilmentWindowsGroupEpoxyController;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.ItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.ConfirmSubscriptionTermsAndConditionEpoxyControllerOld;
import au.com.woolworths.shop.deliveryunlimited.signup.confirmsubscription.terms.TermItemUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpLandingFeature;
import au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingEpoxyController;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanEpoxyController;
import com.adobe.marketing.mobile.EventHistoryResultHandler;
import com.airbnb.epoxy.DataBindingEpoxyModel;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.woolworths.scanlibrary.SngViewLandingContentBindingModel_;
import com.woolworths.scanlibrary.domain.payment.RemoveInstrumentUC;
import com.woolworths.scanlibrary.ui.entry.content.ContentItem;
import com.woolworths.scanlibrary.ui.entry.controller.LandingContentController;
import com.woolworths.scanlibrary.util.exceptions.PaymentError;
import com.woolworths.scanlibrary.util.payment.DefaultRetryService;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import me.oriient.ipssdk.api.models.IPSCancelable;
import me.oriient.ipssdk.base.auth.User;
import me.oriient.ipssdk.realtime.ips.RegionsManager;
import me.oriient.ipssdk.realtime.ofs.J4;
import me.oriient.ipssdk.realtime.ofs.K4;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements OnModelBoundListener, EventHistoryResultHandler, Continuation, SingleOnSubscribe, K4 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b(int i, Object obj, Object obj2) {
        this.d = i;
        this.f = obj;
        this.e = obj2;
    }

    @Override // me.oriient.ipssdk.realtime.ofs.K4
    public IPSCancelable a(J4 j4) {
        return RegionsManager.a((RegionsManager) this.f, (User) this.e, j4);
    }

    @Override // io.reactivex.SingleOnSubscribe
    public void d(final SingleEmitter singleEmitter) {
        final RemoveInstrumentUC removeInstrumentUC = (RemoveInstrumentUC) this.f;
        PaymentInstrument paymentInstrument = (PaymentInstrument) this.e;
        PayClient payClient = removeInstrumentUC.c;
        PayEmptyResultCallback payEmptyResultCallback = new PayEmptyResultCallback() { // from class: com.woolworths.scanlibrary.domain.payment.RemoveInstrumentUC$prepareResponse$1$1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
            public final void A(Retryable retryable) {
                Intrinsics.h(retryable, "retryable");
                RemoveInstrumentUC removeInstrumentUC2 = removeInstrumentUC;
                ((DefaultRetryService) removeInstrumentUC2.e.getD()).a(removeInstrumentUC2.d, retryable, new a(singleEmitter, 2));
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
            public final void d2() {
                SingleEmitter singleEmitter2 = singleEmitter;
                if (singleEmitter2.b()) {
                    return;
                }
                singleEmitter2.onSuccess(new RemoveInstrumentUC.ResponseValue());
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback
            public final void v(PayError payError) {
                Intrinsics.h(payError, "payError");
                SingleEmitter singleEmitter2 = singleEmitter;
                if (singleEmitter2.b()) {
                    return;
                }
                singleEmitter2.onError(new PaymentError(payError));
            }
        };
        payClient.getClass();
        payClient.a(paymentInstrument.getInstrumentId(), payEmptyResultCallback);
    }

    @Override // com.airbnb.epoxy.OnModelBoundListener
    public void g(int i, EpoxyModel epoxyModel, Object obj) {
        switch (this.d) {
            case 0:
                ProductDetailsEpoxyController.buildModels$lambda$11$lambda$4$lambda$3((CollapsibleContentUiModel) this.f, (ProductDetailsEpoxyController) this.e, (ItemCollapsibleContentBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 1:
                ProductDetailsEpoxyController.buildModels$lambda$11$lambda$7$lambda$6((ProductDetailsEpoxyController) this.e, (ProductNutritionInfoUiModel) this.f, (ItemProductNutritionInfoBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 2:
                CheckoutProductEpoxyController.buildCheckoutProductCampaigns$lambda$17$lambda$16$lambda$15((CheckoutProductCampaign) this.f, (CheckoutProductEpoxyController) this.e, (ItemCheckoutCampaignBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 3:
                FulfilmentWindowsGroupEpoxyController.buildMessage$lambda$3$lambda$2$lambda$1((FulfilmentWindowsGroupEpoxyController) this.f, (FulfilmentWindowsMessage) this.e, (ItemCheckoutFulfilmentMessageBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 4:
                ConfirmSubscriptionTermsAndConditionEpoxyControllerOld.buildModels$lambda$6$lambda$4$lambda$3((ConfirmSubscriptionTermsAndConditionEpoxyControllerOld) this.f, (TermItemUiModel) this.e, (ItemDeliveryUnlimitedSignUpTermsAndConditionsOldBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 5:
                DeliveryUnlimitedSignUpLandingEpoxyController.buildModels$lambda$3$lambda$2$lambda$1((DeliveryUnlimitedSignUpLandingFeature) this.f, (DeliveryUnlimitedSignUpLandingEpoxyController) this.e, (ItemDeliveryUnlimitedSignUpLandingFeatureBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 6:
                SelectPlanEpoxyController.buildTabLayout$lambda$3$lambda$2((SelectPlanEpoxyController) this.f, (List) this.e, (ItemDeliveryUnlimitedPlanTypeTabLayoutBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            case 7:
                SelectPlanEpoxyController.buildModel$lambda$7$lambda$6((InsetBanner) this.f, (SelectPlanEpoxyController) this.e, (ItemDeliveryUnlimitedSignUpInsetBannerBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
            default:
                LandingContentController.bindContentItem$lambda$9$lambda$5((ContentItem) this.f, (LandingContentController) this.e, (SngViewLandingContentBindingModel_) epoxyModel, (DataBindingEpoxyModel.DataBindingHolder) obj, i);
                break;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f;
        HashMap map = (HashMap) this.e;
        int[] iArr = ConfigFetchHandler.k;
        return configFetchHandler.b(task, 0L, map);
    }

    public /* synthetic */ b(ProductDetailsEpoxyController productDetailsEpoxyController, ProductNutritionInfoUiModel productNutritionInfoUiModel) {
        this.d = 1;
        this.e = productDetailsEpoxyController;
        this.f = productNutritionInfoUiModel;
    }

    @Override // com.adobe.marketing.mobile.EventHistoryResultHandler
    public void a(Object obj) {
        Ref.IntRef intRef = (Ref.IntRef) this.f;
        CountDownLatch countDownLatch = (CountDownLatch) this.e;
        intRef.d = ((Integer) obj).intValue();
        countDownLatch.countDown();
    }
}
