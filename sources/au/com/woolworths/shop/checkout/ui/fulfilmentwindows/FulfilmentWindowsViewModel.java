package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.TrackableErrorType;
import au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.app.region.data.ShopAppRegionInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.domain.model.ExtraInfoButton;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowSlotSelectionInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooter;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutScreens;
import au.com.woolworths.shop.checkout.ui.analytics.FulfilmentWindowsActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlowKt;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsViewModel;", "Landroidx/lifecycle/ViewModel;", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsSlotListener;", "Lau/com/woolworths/android/onesite/common/FullPageErrorStateClickHandler;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentWindowsViewModel extends ViewModel implements FulfilmentWindowsSlotListener, FullPageErrorStateClickHandler {
    public final CheckoutContentInteractor e;
    public final AnalyticsManager f;
    public final CollectionModeInteractor g;
    public final ShopAppRegionInteractor h;
    public final FeatureToggleManager i;
    public FulfilmentWindowSource j;
    public final MutableStateFlow k;
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 l;
    public final SharedFlowImpl m;
    public final SharedFlowImpl n;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ActionType actionType = ActionType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public FulfilmentWindowsViewModel(CheckoutContentInteractor checkoutContentInteractor, AnalyticsManager analyticsManager, CollectionModeInteractor collectionModeInteractor, ShopAppRegionInteractor shopAppRegionInteractor, FeatureToggleManager featureToggleManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(shopAppRegionInteractor, "shopAppRegionInteractor");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.e = checkoutContentInteractor;
        this.f = analyticsManager;
        this.g = collectionModeInteractor;
        this.h = shopAppRegionInteractor;
        this.i = featureToggleManager;
        this.j = FulfilmentWindowSource.e;
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(null);
        this.k = mutableStateFlowA;
        this.l = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(mutableStateFlowA);
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.m = sharedFlowImplB;
        this.n = sharedFlowImplB;
    }

    public static final void p6(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, SnackBarErrorType snackBarErrorType) {
        Text plainText;
        fulfilmentWindowsViewModel.getClass();
        AnalyticsManager analyticsManager = fulfilmentWindowsViewModel.f;
        CheckoutScreens checkoutScreens = CheckoutScreens.e;
        if (snackBarErrorType instanceof SnackBarErrorType.Network) {
            CheckoutErrorActions.NetworkError networkError = new CheckoutErrorActions.NetworkError(checkoutScreens);
            TrackingMetadata trackingMetadataT6 = fulfilmentWindowsViewModel.t6();
            trackingMetadataT6.b(TrackableValue.l0, snackBarErrorType.f10763a);
            trackingMetadataT6.b(TrackableValue.k0, TrackableErrorType.f);
            analyticsManager.j(networkError, trackingMetadataT6);
            plainText = new ResText(R.string.error_no_network);
        } else {
            if (!(snackBarErrorType instanceof SnackBarErrorType.Server)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((SnackBarErrorType.Server) snackBarErrorType).b;
            CheckoutErrorActions.ServerError serverError = new CheckoutErrorActions.ServerError(checkoutScreens, str);
            TrackingMetadata trackingMetadataT62 = fulfilmentWindowsViewModel.t6();
            trackingMetadataT62.b(TrackableValue.l0, snackBarErrorType.f10763a);
            trackingMetadataT62.b(TrackableValue.k0, TrackableErrorType.f);
            analyticsManager.j(serverError, trackingMetadataT62);
            plainText = str != null ? new PlainText(str) : new ResText(R.string.legacy_error_unable_to_select_fulfilment_window_error);
        }
        fulfilmentWindowsViewModel.v6(fulfilmentWindowsViewModel.k, false);
        fulfilmentWindowsViewModel.m.f(new FulfilmentWindowsContract.Actions.LaunchSnackBar(plainText));
    }

    public static final void q6(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, FulfilmentWindows fulfilmentWindows) {
        Object next;
        fulfilmentWindowsViewModel.getClass();
        if (fulfilmentWindows != null) {
            List list = fulfilmentWindows.e;
            if (!list.isEmpty()) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((FulfilmentWindowsOption) next).d) {
                            break;
                        }
                    }
                }
                FulfilmentWindowsOption fulfilmentWindowsOption = (FulfilmentWindowsOption) next;
                if (fulfilmentWindowsOption == null) {
                    fulfilmentWindowsOption = (FulfilmentWindowsOption) CollectionsKt.D(list);
                }
                fulfilmentWindowsViewModel.z6(fulfilmentWindows, fulfilmentWindowsOption);
                return;
            }
        }
        FulfilmentWindowErrorState fulfilmentWindowErrorState = FulfilmentWindowErrorState.e;
        fulfilmentWindowsViewModel.x6(fulfilmentWindowErrorState);
        y6(fulfilmentWindowsViewModel, fulfilmentWindowsViewModel.k, null, null, null, null, fulfilmentWindowErrorState, 28);
    }

    public static void y6(FulfilmentWindowsViewModel fulfilmentWindowsViewModel, MutableStateFlow mutableStateFlow, FulfilmentWindows fulfilmentWindows, FulfilmentWindowsOption fulfilmentWindowsOption, FooterData footerData, String str, FulfilmentWindowErrorState fulfilmentWindowErrorState, int i) {
        FulfilmentWindowsOption fulfilmentWindowsOption2;
        FooterData footerData2;
        String str2;
        if ((i & 1) != 0) {
            FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) fulfilmentWindowsViewModel.k.getValue();
            fulfilmentWindows = viewState != null ? viewState.c : null;
        }
        FulfilmentWindows fulfilmentWindows2 = fulfilmentWindows;
        if ((i & 2) != 0) {
            FulfilmentWindowsContract.ViewState viewState2 = (FulfilmentWindowsContract.ViewState) fulfilmentWindowsViewModel.k.getValue();
            fulfilmentWindowsOption2 = viewState2 != null ? viewState2.d : null;
        } else {
            fulfilmentWindowsOption2 = fulfilmentWindowsOption;
        }
        if ((i & 4) != 0) {
            FulfilmentWindowsContract.ViewState viewState3 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
            footerData2 = viewState3 != null ? viewState3.f : null;
        } else {
            footerData2 = footerData;
        }
        if ((i & 8) != 0) {
            FulfilmentWindowsContract.ViewState viewState4 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
            str2 = viewState4 != null ? viewState4.e : null;
        } else {
            str2 = str;
        }
        boolean z = (i & 16) == 0;
        FulfilmentWindowErrorState fulfilmentWindowErrorState2 = (i & 32) != 0 ? null : fulfilmentWindowErrorState;
        ShopAppRegionInteractor shopAppRegionInteractor = fulfilmentWindowsViewModel.h;
        Region regionB = shopAppRegionInteractor.b();
        Region region = Region.j;
        mutableStateFlow.setValue(new FulfilmentWindowsContract.ViewState(false, regionB == region, fulfilmentWindows2, fulfilmentWindowsOption2, str2, footerData2, shopAppRegionInteractor.b() == region, z, fulfilmentWindowErrorState2));
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener
    public final void B0(DirectToBootNowWindow directToBootNowWindow) {
        Intrinsics.h(directToBootNowWindow, "directToBootNowWindow");
        y6(this, this.k, null, null, s6(r6(directToBootNowWindow.f10597a, directToBootNowWindow.k), directToBootNowWindow.h), null, null, 59);
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener
    public final void G2(DeliveryNowWindow deliveryNowWindow) {
        Intrinsics.h(deliveryNowWindow, "deliveryNowWindow");
        y6(this, this.k, null, null, s6(r6(deliveryNowWindow.f10596a, deliveryNowWindow.m), deliveryNowWindow.k), null, null, 59);
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener
    public final boolean b4(DirectToBootNowWindow directToBootNowWindow) {
        FooterData footerData;
        FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) this.k.getValue();
        if (viewState != null && (footerData = viewState.f) != null) {
            return directToBootNowWindow != null && directToBootNowWindow.f10597a == footerData.c;
        }
        if (directToBootNowWindow != null) {
            return directToBootNowWindow.h;
        }
        return false;
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener
    public final void l5(FulfilmentWindowsSlot slot) {
        FulfilmentWindows fulfilmentWindows;
        FulfilmentSlotSelectionOptionsInfo fulfilmentSlotSelectionOptionsInfo;
        Intrinsics.h(slot, "slot");
        MutableStateFlow mutableStateFlow = this.k;
        FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        if (viewState == null || !viewState.g) {
            y6(this, mutableStateFlow, null, null, s6(r6(slot.d, slot.j), slot.f), null, null, 59);
            return;
        }
        FulfilmentWindowsContract.ViewState viewState2 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        if (viewState2 == null || (fulfilmentWindows = viewState2.c) == null || (fulfilmentSlotSelectionOptionsInfo = fulfilmentWindows.i) == null) {
            return;
        }
        BuildersKt.c(ViewModelKt.a(this), null, null, new FulfilmentWindowsViewModel$showSelectionOptionsUi$1$1(this, slot, fulfilmentSlotSelectionOptionsInfo, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener
    public final boolean m1(DeliveryNowWindow deliveryNowWindow) {
        FooterData footerData;
        FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) this.k.getValue();
        if (viewState != null && (footerData = viewState.f) != null) {
            return deliveryNowWindow != null && deliveryNowWindow.f10596a == footerData.c;
        }
        if (deliveryNowWindow != null) {
            return deliveryNowWindow.k;
        }
        return false;
    }

    @Override // au.com.woolworths.android.onesite.common.FullPageErrorStateClickHandler
    public final void onPrimaryActionClicked() {
        BuildersKt.c(ViewModelKt.a(this), null, null, new FulfilmentWindowsViewModel$fetchFulfilmentWindows$1(this, null), 3);
    }

    public final FooterData r6(int i, FulfilmentWindowSlotSelectionInfo fulfilmentWindowSlotSelectionInfo) {
        FulfilmentWindows fulfilmentWindows;
        FulfilmentWindowsFooter fulfilmentWindowsFooter;
        String str;
        FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) this.k.getValue();
        if (viewState == null || (fulfilmentWindows = viewState.c) == null || (fulfilmentWindowsFooter = fulfilmentWindows.f) == null || (str = fulfilmentWindowsFooter.f10612a) == null) {
            throw new IllegalStateException("Footer button title is expected.");
        }
        return new FooterData(str, fulfilmentWindowSlotSelectionInfo, i);
    }

    public final FooterData s6(FooterData footerData, boolean z) {
        FooterData footerData2;
        int i = footerData.c;
        FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) this.k.getValue();
        if (viewState == null || (footerData2 = viewState.f) == null || i != footerData2.c || z) {
            return footerData;
        }
        return null;
    }

    public final TrackingMetadata t6() {
        return TrackingMetadata.Companion.a(TrackableValue.o0, this.j.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u6(int r10, au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId r11) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsViewModel.u6(int, au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionId):void");
    }

    public final void v6(MutableStateFlow mutableStateFlow, boolean z) {
        ShopAppRegionInteractor shopAppRegionInteractor = this.h;
        Region regionB = shopAppRegionInteractor.b();
        Region region = Region.j;
        boolean z2 = regionB == region;
        FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        FulfilmentWindows fulfilmentWindows = viewState != null ? viewState.c : null;
        FulfilmentWindowsContract.ViewState viewState2 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        FulfilmentWindowsOption fulfilmentWindowsOption = viewState2 != null ? viewState2.d : null;
        FulfilmentWindowsContract.ViewState viewState3 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        String str = viewState3 != null ? viewState3.e : null;
        FulfilmentWindowsContract.ViewState viewState4 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        FooterData footerData = viewState4 != null ? viewState4.f : null;
        boolean z3 = shopAppRegionInteractor.b() == region;
        FulfilmentWindowsContract.ViewState viewState5 = (FulfilmentWindowsContract.ViewState) mutableStateFlow.getValue();
        mutableStateFlow.setValue(new FulfilmentWindowsContract.ViewState(z, z2, fulfilmentWindows, fulfilmentWindowsOption, str, footerData, z3, false, viewState5 != null ? viewState5.i : null));
    }

    public final void w6(FulfilmentWindowsOption fulfilmentWindowsOption) {
        FulfilmentExtraInfo fulfilmentExtraInfo = fulfilmentWindowsOption.i;
        SharedFlowImpl sharedFlowImpl = this.m;
        if (fulfilmentExtraInfo != null) {
            sharedFlowImpl.f(new FulfilmentWindowsContract.Actions.LaunchExtraInfoBottomSheet(fulfilmentExtraInfo));
            return;
        }
        DeliveryNowWindow deliveryNowWindow = fulfilmentWindowsOption.n;
        if (deliveryNowWindow != null) {
            sharedFlowImpl.f(new FulfilmentWindowsContract.Actions.LaunchExtraInfoDialog(deliveryNowWindow.j));
        } else {
            Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.w), "invalid FulfilmentWindowsOption state - extra info button clicked yet both extraInfo and deliveryNowV2 are null", fulfilmentWindowsOption.toString());
        }
    }

    public final void x6(FulfilmentWindowErrorState fulfilmentWindowErrorState) {
        TrackingMetadata trackingMetadataT6 = t6();
        trackingMetadataT6.b(TrackableValue.k0, TrackableErrorType.d);
        trackingMetadataT6.b(TrackableValue.l0, fulfilmentWindowErrorState.b());
        this.f.j(new FulfilmentWindowsActions.FullScreenError(fulfilmentWindowErrorState.a()), trackingMetadataT6);
    }

    public final void z6(FulfilmentWindows fulfilmentWindows, FulfilmentWindowsOption fulfilmentWindowsOption) {
        FulfilmentWindowsOption fulfilmentWindowsOption2;
        FulfilmentWindows fulfilmentWindows2;
        FulfilmentWindowsOption fulfilmentWindowsOptionA;
        if (fulfilmentWindowsOption != null) {
            if (fulfilmentWindowsOption.h != null) {
                fulfilmentWindowsOptionA = fulfilmentWindowsOption;
            } else {
                DeliveryNowWindow deliveryNowWindow = fulfilmentWindowsOption.n;
                fulfilmentWindowsOptionA = FulfilmentWindowsOption.a(fulfilmentWindowsOption, false, deliveryNowWindow != null ? new ExtraInfoButton(deliveryNowWindow.i, deliveryNowWindow.h) : null, null, 32639);
            }
            fulfilmentWindowsOption2 = fulfilmentWindowsOptionA;
        } else {
            fulfilmentWindowsOption2 = null;
        }
        if (fulfilmentWindowsOption == null || fulfilmentWindows == null) {
            fulfilmentWindows2 = null;
        } else {
            List<FulfilmentWindowsOption> list = fulfilmentWindows.e;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (FulfilmentWindowsOption fulfilmentWindowsOption3 : list) {
                arrayList.add(Intrinsics.c(fulfilmentWindowsOption3, fulfilmentWindowsOption) ? FulfilmentWindowsOption.a(fulfilmentWindowsOption3, true, null, null, 32759) : FulfilmentWindowsOption.a(fulfilmentWindowsOption3, false, null, null, 32759));
            }
            fulfilmentWindows2 = new FulfilmentWindows(fulfilmentWindows.f10610a, fulfilmentWindows.b, fulfilmentWindows.c, fulfilmentWindows.d, arrayList, fulfilmentWindows.f, fulfilmentWindows.g, fulfilmentWindows.h, fulfilmentWindows.i, fulfilmentWindows.j);
        }
        y6(this, this.k, fulfilmentWindows2, fulfilmentWindowsOption2, null, null, null, 40);
    }
}
