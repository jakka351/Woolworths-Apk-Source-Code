package au.com.woolworths.shop.checkout.ui.content;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionModeKt;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.analytics.EditOrderActions;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutKt;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscount;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRewardsAndDiscounts;
import au.com.woolworths.shop.checkout.domain.model.LegacyNotifications;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.ProgressIdKt;
import au.com.woolworths.shop.checkout.domain.model.RestrictionPromptData;
import au.com.woolworths.shop.checkout.domain.model.ShoppingModeDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutProductsActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutSummaryActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.ModalBottomSheetData;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
import au.com.woolworths.shop.checkout.ui.content.StoreCreditContent;
import au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviour;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutFullPageErrorActionInterface;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentListener;", "Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public abstract class CheckoutContentViewModel extends ViewModel implements CheckoutFullPageErrorActionInterface, CheckoutContentListener, EditOrderEventHandler {
    public final CollectionModeInteractor e;
    public final AnalyticsManager f;
    public final FeatureToggleManager g;
    public Job h;
    public final SharedFlowImpl i;
    public final MutableStateFlow j;
    public final MutableStateFlow k;
    public final SharedFlowImpl l;
    public final StateFlow m;
    public final Flow n;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ProgressId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ProgressId progressId = ProgressId.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProgressId progressId2 = ProgressId.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProgressId progressId3 = ProgressId.d;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                ProgressId progressId4 = ProgressId.d;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                ProgressId progressId5 = ProgressId.d;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[CheckoutContentContract.BottomSheetViewState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                CheckoutContentContract.BottomSheetViewState bottomSheetViewState = CheckoutContentContract.BottomSheetViewState.e;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public CheckoutContentViewModel(CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = collectionModeInteractor;
        this.f = analyticsManager;
        this.g = featureToggleManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.i = sharedFlowImplB;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(new CheckoutContentContract.ViewState(false, null, null, false, false, 255));
        this.j = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = StateFlowKt.a(CheckoutContentContract.BottomSheetViewState.f);
        this.k = mutableStateFlowA2;
        this.l = sharedFlowImplB;
        this.m = FlowKt.b(mutableStateFlowA);
        this.n = mutableStateFlowA2;
    }

    public static void A6(MutableStateFlow mutableStateFlow, boolean z) {
        Intrinsics.h(mutableStateFlow, "<this>");
        boolean z2 = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).b;
        CheckoutFullPageErrorState checkoutFullPageErrorState = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).c;
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        mutableStateFlow.setValue(new CheckoutContentContract.ViewState(z, z2, checkoutFullPageErrorState, checkout != null ? Checkout.a(checkout, null, 1015) : null, null, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).f, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).g, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).h));
    }

    public static final void p6(CheckoutContentViewModel checkoutContentViewModel, MutableStateFlow mutableStateFlow, CheckoutFullPageErrorState checkoutFullPageErrorState) {
        AnalyticsManager analyticsManager = checkoutContentViewModel.f;
        Intrinsics.h(mutableStateFlow, "<this>");
        Screens screensA = ProgressIdKt.a(checkoutContentViewModel.getQ());
        if (screensA != null) {
            if (checkoutFullPageErrorState == CheckoutFullPageErrorState.e) {
                analyticsManager.c(new CheckoutErrorActions.ServerError(screensA, null));
            } else if (checkoutFullPageErrorState == CheckoutFullPageErrorState.d) {
                analyticsManager.c(new CheckoutErrorActions.NetworkError(screensA));
            } else if (checkoutFullPageErrorState == CheckoutFullPageErrorState.f) {
                analyticsManager.c(CheckoutDetailsActions.ProductsEmpty.e);
            }
        }
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        mutableStateFlow.setValue(new CheckoutContentContract.ViewState(false, checkoutFullPageErrorState, checkout != null ? Checkout.a(checkout, null, 1015) : null, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).f, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).h, 64));
    }

    public static CheckoutContentContract.Actions t6(ProgressId progressId, Boolean bool) {
        int iOrdinal = progressId.ordinal();
        if (iOrdinal == 0) {
            return CheckoutContentContract.Actions.LaunchDetailsScreen.f10737a;
        }
        if (iOrdinal == 1) {
            return CheckoutContentContract.Actions.LaunchProductScreen.f10742a;
        }
        if (iOrdinal == 2) {
            return CheckoutContentContract.Actions.LaunchSummaryScreen.f10750a;
        }
        if (iOrdinal == 3) {
            return new CheckoutContentContract.Actions.LaunchPaymentScreen(Intrinsics.c(bool, Boolean.TRUE));
        }
        if (iOrdinal != 4) {
            return null;
        }
        return CheckoutContentContract.Actions.LaunchReviewScreen.f10745a;
    }

    public final void B6(MutableStateFlow mutableStateFlow, SnackBarErrorType snackBarErrorType) {
        Intrinsics.h(mutableStateFlow, "<this>");
        Text textF6 = F6(snackBarErrorType, R.string.error_no_network);
        boolean z = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).b;
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        mutableStateFlow.setValue(new CheckoutContentContract.ViewState(z, null, checkout != null ? Checkout.a(checkout, null, 1015) : null, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).f, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).h, 64));
        this.i.f(new CheckoutContentContract.Actions.LaunchSnackBar(textF6));
    }

    public final void C6(Event event, TrackingMetadata trackingMetadata) {
        Intrinsics.h(event, "event");
        AnalyticsManager analyticsManager = this.f;
        if (trackingMetadata != null) {
            analyticsManager.i(event, trackingMetadata);
        } else {
            analyticsManager.g(event);
        }
    }

    public final void D6(Action action) {
        Intrinsics.h(action, "action");
        this.f.c(action);
    }

    public final void E6(Action action, TrackingMetadata trackingMetadata) {
        Intrinsics.h(action, "action");
        AnalyticsManager analyticsManager = this.f;
        if (trackingMetadata != null) {
            analyticsManager.j(action, trackingMetadata);
        } else {
            analyticsManager.c(action);
        }
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void F3(Text text) {
        Screens screensA = ProgressIdKt.a(getQ());
        if (screensA != null) {
            this.f.c(new EditOrderActions.CancellationSuccess(screensA));
        }
        A6(this.j, false);
        this.i.f(new CheckoutContentContract.Actions.ExitAndLaunchHome(text));
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void F4() {
        Screens screensA = ProgressIdKt.a(getQ());
        if (screensA != null) {
            this.f.c(new EditOrderActions.ConfirmCancellationWarningDialog(screensA));
        }
        A6(this.j, true);
    }

    public final Text F6(SnackBarErrorType snackBarErrorType, int i) {
        Screens screensA = ProgressIdKt.a(getQ());
        boolean z = snackBarErrorType instanceof SnackBarErrorType.Network;
        AnalyticsManager analyticsManager = this.f;
        if (z) {
            ResText resText = new ResText(i);
            Action networkError = screensA != null ? new CheckoutErrorActions.NetworkError(screensA) : null;
            if (networkError != null) {
                analyticsManager.c(networkError);
            }
            return resText;
        }
        if (!(snackBarErrorType instanceof SnackBarErrorType.Server)) {
            throw new NoWhenBranchMatchedException();
        }
        SnackBarErrorType.Server server = (SnackBarErrorType.Server) snackBarErrorType;
        String str = server.b;
        Text plainText = str != null ? new PlainText(str) : new ResText(R.string.generic_server_error_subtitle);
        Action serverError = server.c;
        if (serverError == null) {
            serverError = screensA != null ? new CheckoutErrorActions.ServerError(screensA, str) : null;
        }
        if (serverError != null) {
            analyticsManager.c(serverError);
        }
        return plainText;
    }

    public final void G6(MutableStateFlow mutableStateFlow, Checkout checkout, LegacyNotifications legacyNotifications) {
        ModalBottomSheetData modalBottomSheetData;
        ModalBottomSheetData modalBottomSheetDataA;
        Intrinsics.h(mutableStateFlow, "<this>");
        Intrinsics.h(checkout, "checkout");
        boolean zA = s6().a(checkout, legacyNotifications);
        boolean zC = this.g.c(BaseShopAppFeature.W);
        ModalBottomSheetData modalBottomSheetData2 = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).g;
        CheckoutRewardsAndDiscount.PromoCode promoCode = null;
        if (modalBottomSheetData2 != null) {
            if (modalBottomSheetData2 instanceof ModalBottomSheetData.RewardsQuantitySelector) {
                modalBottomSheetDataA = ModalBottomSheetData.RewardsQuantitySelector.a((ModalBottomSheetData.RewardsQuantitySelector) modalBottomSheetData2, 0, false, 15);
            } else if (modalBottomSheetData2 instanceof ModalBottomSheetData.StoreCredit) {
                CheckoutRewardsAndDiscount.StoreCredit storeCreditA = CheckoutKt.a(checkout);
                ModalBottomSheetData.StoreCredit storeCredit = (ModalBottomSheetData.StoreCredit) modalBottomSheetData2;
                modalBottomSheetDataA = storeCredit;
                if (storeCreditA != null) {
                    modalBottomSheetDataA = ModalBottomSheetData.StoreCredit.a(storeCredit, new StoreCreditContent.Success(storeCreditA.f), 2);
                }
            } else {
                boolean z = modalBottomSheetData2 instanceof ModalBottomSheetData.Info;
                modalBottomSheetDataA = modalBottomSheetData2;
                if (!z) {
                    if (!(modalBottomSheetData2 instanceof ModalBottomSheetData.PromoCode)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List list = checkout.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (obj instanceof CheckoutRewardsAndDiscounts) {
                            arrayList.add(obj);
                        }
                    }
                    CheckoutRewardsAndDiscounts checkoutRewardsAndDiscounts = (CheckoutRewardsAndDiscounts) CollectionsKt.F(arrayList);
                    if (checkoutRewardsAndDiscounts != null) {
                        ArrayList arrayList2 = checkoutRewardsAndDiscounts.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : arrayList2) {
                            if (obj2 instanceof CheckoutRewardsAndDiscount.PromoCode) {
                                arrayList3.add(obj2);
                            }
                        }
                        promoCode = (CheckoutRewardsAndDiscount.PromoCode) CollectionsKt.F(arrayList3);
                    }
                    CheckoutRewardsAndDiscount.PromoCode promoCode2 = promoCode;
                    modalBottomSheetDataA = promoCode2 != null ? ModalBottomSheetData.PromoCode.a((ModalBottomSheetData.PromoCode) modalBottomSheetData2, promoCode2, null, null, null, null, null, 62) : (ModalBottomSheetData.PromoCode) modalBottomSheetData2;
                }
            }
            modalBottomSheetData = modalBottomSheetDataA;
        } else {
            modalBottomSheetData = null;
        }
        mutableStateFlow.setValue(new CheckoutContentContract.ViewState(false, zA, null, checkout, legacyNotifications, zC, modalBottomSheetData, ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).h));
    }

    public final void H6(ShoppingModeDetails shoppingModeDetails) {
        if (shoppingModeDetails != null) {
            String str = shoppingModeDetails.f10638a;
            CollectionModeInteractor collectionModeInteractor = this.e;
            collectionModeInteractor.r(str);
            collectionModeInteractor.M(shoppingModeDetails.c);
            collectionModeInteractor.i(CollectionModeKt.c(shoppingModeDetails.b, collectionModeInteractor.w().equals(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryNow))));
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.OrderTotalDetailsListener
    public final void N0() {
        Action action;
        int iOrdinal = getQ().ordinal();
        RestrictionPromptData restrictionPromptData = null;
        if (iOrdinal == 0) {
            action = CheckoutDetailsActions.Continue.e;
        } else if (iOrdinal == 1) {
            action = CheckoutProductsActions.Continue.e;
        } else if (iOrdinal == 2) {
            action = CheckoutSummaryActions.Continue.e;
        } else {
            if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            action = null;
        }
        if (action != null) {
            this.f.c(action);
        }
        MutableStateFlow mutableStateFlow = this.j;
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        if (checkout == null) {
            return;
        }
        RestrictionPromptData restrictionPromptData2 = checkout.j;
        if (restrictionPromptData2 != null && !((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).h) {
            restrictionPromptData = restrictionPromptData2;
        }
        ProgressId progressIdW6 = w6(checkout.c);
        if (progressIdW6 != null) {
            v6(progressIdW6, checkout.g, checkout.i, restrictionPromptData);
            z6(CheckoutContentContract.BottomSheetViewState.f);
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.OrderTotalDetailsListener
    public final void W2() {
        CheckoutContentContract.BottomSheetViewState bottomSheetViewState;
        int iOrdinal = ((CheckoutContentContract.BottomSheetViewState) this.k.getValue()).ordinal();
        if (iOrdinal == 0) {
            bottomSheetViewState = CheckoutContentContract.BottomSheetViewState.f;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            bottomSheetViewState = CheckoutContentContract.BottomSheetViewState.e;
        }
        z6(bottomSheetViewState);
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void c6() {
        Screens screensA = ProgressIdKt.a(getQ());
        if (screensA != null) {
            this.f.c(new EditOrderActions.CancellationWarmingDialogImpression(screensA));
        }
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void k1() {
        Screens screensA = ProgressIdKt.a(getQ());
        if (screensA != null) {
            this.f.c(new EditOrderActions.CancelEditModeClick(screensA));
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorActionInterface
    public void o0() {
    }

    @Override // androidx.lifecycle.ViewModel
    public final void o6() {
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        CheckoutFullPageErrorState checkoutFullPageErrorState = ((CheckoutContentContract.ViewState) this.j.getValue()).c;
        if (checkoutFullPageErrorState != null) {
            checkoutFullPageErrorState.a(this);
        }
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onSecondaryActionClicked() {
        CheckoutFullPageErrorState checkoutFullPageErrorState = ((CheckoutContentContract.ViewState) this.j.getValue()).c;
        if (checkoutFullPageErrorState != null) {
            checkoutFullPageErrorState.b(this);
        }
    }

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void q0() {
        Screens screensA = ProgressIdKt.a(getQ());
        if (screensA != null) {
            this.f.c(new EditOrderActions.CloseCancellationWarningDialog(screensA));
        }
    }

    public abstract Job q6(Function0 function0);

    public final void r6(Function0 function0) {
        Job job = this.h;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.h = q6(function0);
    }

    public abstract CheckoutContentViewBehaviour s6();

    /* renamed from: u6 */
    public abstract ProgressId getQ();

    @Override // au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler
    public final void v3(Text text) {
        Screens screensA = ProgressIdKt.a(getQ());
        if (screensA != null) {
            this.f.c(new EditOrderActions.CancellationFailure(screensA));
        }
        A6(this.j, false);
        this.i.f(new CheckoutContentContract.Actions.LaunchSnackBar(text));
    }

    public final void v6(ProgressId progressId, IdVerificationBottomSheet idVerificationBottomSheet, Boolean bool, RestrictionPromptData restrictionPromptData) {
        Object launchIdVerificationBottomSheet = idVerificationBottomSheet != null ? new CheckoutContentContract.Actions.LaunchIdVerificationBottomSheet(idVerificationBottomSheet, false) : restrictionPromptData != null ? new CheckoutContentContract.Actions.LaunchRestrictionPrompt(restrictionPromptData, new androidx.work.impl.utils.c(24, this, progressId, bool), new h(20)) : t6(progressId, bool);
        if (launchIdVerificationBottomSheet != null) {
            this.i.f(launchIdVerificationBottomSheet);
        }
    }

    public ProgressId w6(CheckoutOrderTotalDetails checkoutOrderTotalDetails) {
        return checkoutOrderTotalDetails.c.e;
    }

    public final void x6() {
        r6(new h(20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [au.com.woolworths.shop.checkout.domain.model.CollectionAddressDelivery] */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y6(au.com.woolworths.shop.checkout.domain.model.Checkout r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 906
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel.y6(au.com.woolworths.shop.checkout.domain.model.Checkout, boolean):void");
    }

    public final void z6(CheckoutContentContract.BottomSheetViewState bottomSheetViewState) {
        MutableStateFlow mutableStateFlow = this.k;
        if (mutableStateFlow.getValue() == bottomSheetViewState) {
            return;
        }
        mutableStateFlow.f(bottomSheetViewState);
        this.f.c(new CheckoutDetailsActions.CostSummaryToggle(bottomSheetViewState == CheckoutContentContract.BottomSheetViewState.e));
    }
}
