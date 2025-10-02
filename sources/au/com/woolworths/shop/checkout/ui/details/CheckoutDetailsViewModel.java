package au.com.woolworths.shop.checkout.ui.details;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethod;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOption;
import au.com.woolworths.shop.checkout.domain.model.CollectionMethodOptionModeId;
import au.com.woolworths.shop.checkout.domain.model.PackagingMethodOption;
import au.com.woolworths.shop.checkout.domain.model.PreferenceId;
import au.com.woolworths.shop.checkout.domain.model.PreferenceText;
import au.com.woolworths.shop.checkout.domain.model.PreferenceToggle;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.address.MarketAddressType;
import au.com.woolworths.shop.checkout.domain.model.breakdown.CheckoutOrderTotalDetails;
import au.com.woolworths.shop.checkout.domain.model.breakdown.OrderTotalDetailsTotal;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.SnackBarErrorType;
import au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviour;
import com.woolworths.R;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsViewModel;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentViewModel;", "Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsListener;", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutDetailsViewModel extends CheckoutContentViewModel implements CheckoutDetailsListener {
    public final CheckoutContentInteractor o;
    public final ProgressId p;
    public final Lazy q;
    public boolean r;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/details/CheckoutDetailsViewModel$Companion;", "", "", "REVIEW_BUTTON_PREFIX", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10774a;

        static {
            int[] iArr = new int[MarketAddressType.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MarketAddressType marketAddressType = MarketAddressType.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[PreferenceId.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                PreferenceId preferenceId = PreferenceId.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                PreferenceId preferenceId2 = PreferenceId.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                PreferenceId preferenceId3 = PreferenceId.d;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                PreferenceId preferenceId4 = PreferenceId.d;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                PreferenceId preferenceId5 = PreferenceId.d;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[CollectionMethodOptionModeId.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                CollectionMethodOptionModeId collectionMethodOptionModeId = CollectionMethodOptionModeId.e;
                iArr3[2] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                CollectionMethodOptionModeId collectionMethodOptionModeId2 = CollectionMethodOptionModeId.e;
                iArr3[1] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                CollectionMethodOptionModeId collectionMethodOptionModeId3 = CollectionMethodOptionModeId.e;
                iArr3[3] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f10774a = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutDetailsViewModel(CheckoutContentInteractor checkoutContentInteractor, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        super(collectionModeInteractor, analyticsManager, featureToggleManager);
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.o = checkoutContentInteractor;
        this.p = ProgressId.d;
        this.q = LazyKt.b(new au.com.woolworths.rewards.base.d(13));
        this.r = true;
    }

    public static final void I6(CheckoutDetailsViewModel checkoutDetailsViewModel, MutableStateFlow mutableStateFlow, PreferenceId preferenceId, String str, SnackBarErrorType snackBarErrorType) {
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        if (checkout == null) {
            return;
        }
        List list = checkout.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                checkoutDetailsViewModel.G6(mutableStateFlow, Checkout.a(checkout, arrayList, 1021), null);
                return;
            }
            Object next = it.next();
            PreferenceText preferenceText = next instanceof PreferenceText ? (PreferenceText) next : null;
            if ((preferenceText != null ? preferenceText.f10630a : null) == preferenceId) {
                next = PreferenceText.a((PreferenceText) next, str, new ResText(R.string.preference_text_error_button_title), checkoutDetailsViewModel.F6(snackBarErrorType, R.string.preference_text_error_label), 575);
            }
            arrayList.add(next);
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void G5(PreferenceId preferenceId, boolean z) {
        Action preferenceUnwellSwitch;
        int iOrdinal = preferenceId.ordinal();
        if (iOrdinal == 0) {
            preferenceUnwellSwitch = new CheckoutDetailsActions.PreferenceUnwellSwitch(z);
        } else if (iOrdinal == 1) {
            preferenceUnwellSwitch = new CheckoutDetailsActions.PreferenceLeaveOrderSwitch(z);
        } else {
            if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                throw new NoWhenBranchMatchedException();
            }
            preferenceUnwellSwitch = null;
        }
        if (preferenceUnwellSwitch != null) {
            D6(preferenceUnwellSwitch);
        }
        L6(this.j, preferenceId, z);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutDetailsViewModel$onUpdatePreferenceToggle$2(this, preferenceId, z, null), 3);
    }

    public final void J6(CollectionMethodOptionModeId collectionMethodOptionModeId) {
        Object launchAddressPicker;
        int i = collectionMethodOptionModeId == null ? -1 : WhenMappings.f10774a[collectionMethodOptionModeId.ordinal()];
        if (i == -1) {
            launchAddressPicker = new CheckoutContentContract.Actions.LaunchAddressPicker(false, false);
        } else if (i == 1 || i == 2) {
            launchAddressPicker = new CheckoutContentContract.Actions.LaunchAddressPicker(this.e.s(), false);
        } else {
            if (i != 3) {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalArgumentException("Unknown collectionMethodOptionId: " + collectionMethodOptionModeId);
            }
            launchAddressPicker = CheckoutContentContract.Actions.LaunchPickUpStoreLocator.f10741a;
        }
        this.i.f(launchAddressPicker);
    }

    public final void K6(CollectionMethodOptionModeId collectionMethodOptionModeId) {
        Action action;
        int i = collectionMethodOptionModeId == null ? -1 : WhenMappings.f10774a[collectionMethodOptionModeId.ordinal()];
        if (i == -1) {
            action = CheckoutDetailsActions.AddDeliveryLocationClick.e;
        } else if (i == 1 || i == 2) {
            action = this.e.s() ? CheckoutDetailsActions.EditDeliveryLocationClick.e : CheckoutDetailsActions.AddDeliveryLocationClick.e;
        } else if (i == 3) {
            action = CheckoutDetailsActions.EditPickupLocationClick.e;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            action = null;
        }
        if (action != null) {
            D6(action);
        }
    }

    public final void L6(MutableStateFlow mutableStateFlow, PreferenceId preferenceId, boolean z) {
        boolean z2;
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        if (checkout == null) {
            return;
        }
        List list = checkout.b;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                G6(mutableStateFlow, Checkout.a(checkout, arrayList, 1021), null);
                return;
            }
            Object next = it.next();
            PreferenceToggle preferenceToggle = next instanceof PreferenceToggle ? (PreferenceToggle) next : null;
            if ((preferenceToggle != null ? preferenceToggle.f10631a : null) == preferenceId) {
                PreferenceToggle preferenceToggle2 = (PreferenceToggle) next;
                z2 = z;
                next = new PreferenceToggle(preferenceToggle2.f10631a, preferenceToggle2.b, preferenceToggle2.c, preferenceToggle2.d, preferenceToggle2.e, z2, preferenceToggle2.g);
            } else {
                z2 = z;
            }
            arrayList.add(next);
            z = z2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0028  */
    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M4(au.com.woolworths.shop.checkout.domain.model.PreferenceId r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.h(r6, r0)
            int r0 = r5.ordinal()
            r1 = 3
            r2 = 0
            if (r0 == 0) goto L28
            r3 = 1
            if (r0 == r3) goto L28
            r3 = 2
            if (r0 == r3) goto L25
            if (r0 == r1) goto L28
            r3 = 4
            if (r0 == r3) goto L22
            r3 = 5
            if (r0 != r3) goto L1c
            goto L28
        L1c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L22:
            au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions$PreferenceShopperInstructions r0 = au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions.PreferenceShopperInstructions.e
            goto L29
        L25:
            au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions$PreferenceDriverInstructions r0 = au.com.woolworths.shop.checkout.ui.analytics.CheckoutDetailsActions.PreferenceDriverInstructions.e
            goto L29
        L28:
            r0 = r2
        L29:
            if (r0 == 0) goto L2e
            r4.D6(r0)
        L2e:
            kotlinx.coroutines.flow.SharedFlowImpl r0 = r4.i
            au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract$Actions$DismissKeyboard r3 = au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract.Actions.DismissKeyboard.f10730a
            r0.f(r3)
            androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope r0 = androidx.lifecycle.ViewModelKt.a(r4)
            au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onUpdatePreferenceText$2 r3 = new au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel$onUpdatePreferenceText$2
            r3.<init>(r4, r5, r6, r2)
            kotlinx.coroutines.BuildersKt.c(r0, r2, r2, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsViewModel.M4(au.com.woolworths.shop.checkout.domain.model.PreferenceId, java.lang.String):void");
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void N3(PackagingMethodOption packagingMethod) {
        Intrinsics.h(packagingMethod, "packagingMethod");
        D6(new CheckoutDetailsActions.CustomButtonClick(packagingMethod.c));
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutDetailsViewModel$onUpdatePackagingPreferences$1(this, packagingMethod, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void Z0(MarketAddressType marketAddressType, CollectionMethodOptionModeId collectionMethodOptionModeId) {
        int iOrdinal = marketAddressType.ordinal();
        if (iOrdinal == 1) {
            K6(collectionMethodOptionModeId);
        } else if (iOrdinal == 2) {
            return;
        }
        this.i.f(new CheckoutContentContract.Actions.LaunchAddressPicker(this.e.s(), marketAddressType == MarketAddressType.d));
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void e1(String str) {
        if (str != null) {
            this.i.f(new CheckoutContentContract.Actions.LaunchLink(str));
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void f4(CollectionMethodOption collectionMethodOption) {
        Integer numI0;
        Intrinsics.h(collectionMethodOption, "collectionMethodOption");
        CheckoutDetailsActions.SelectMethodClick selectMethodClick = CheckoutDetailsActions.SelectMethodClick.e;
        TrackableValue trackableValue = TrackableValue.L;
        CollectionMethodOptionModeId collectionMethodOptionModeId = collectionMethodOption.b;
        E6(selectMethodClick, TrackingMetadata.Companion.a(trackableValue, collectionMethodOptionModeId.d));
        CheckoutContentViewModel.A6(this.j, true);
        int iOrdinal = collectionMethodOptionModeId.ordinal();
        if (iOrdinal == 0) {
            numI0 = collectionMethodOption.d;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    throw new IllegalArgumentException("Collection mode is unknown");
                }
                throw new NoWhenBranchMatchedException();
            }
            numI0 = collectionMethodOption.d;
        } else {
            String strB = this.e.B();
            numI0 = strB != null ? StringsKt.i0(strB) : null;
        }
        if (numI0 != null) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutDetailsViewModel$onSelectCollectionMethod$1$1(this, collectionMethodOption, numI0.intValue(), null), 3);
        } else {
            J6(collectionMethodOptionModeId);
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void l2(String str, String str2) {
        this.i.f(new CheckoutContentContract.Actions.LaunchContactDetails(str, str2));
    }

    @Override // au.com.woolworths.shop.checkout.ui.details.CheckoutDetailsListener
    public final void n2(CollectionMethodOptionModeId collectionMethodOptionModeId) {
        K6(collectionMethodOptionModeId);
        J6(collectionMethodOptionModeId);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final Job q6(Function0 function0) {
        return BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutDetailsViewModel$constructFetchContentJob$1(this, function0, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final CheckoutContentViewBehaviour s6() {
        return (CheckoutContentViewBehaviour) this.q.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    /* renamed from: u6, reason: from getter */
    public final ProgressId getP() {
        return this.p;
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final ProgressId w6(CheckoutOrderTotalDetails checkoutOrderTotalDetails) {
        OrderTotalDetailsTotal orderTotalDetailsTotal = checkoutOrderTotalDetails.c;
        ProgressId progressId = orderTotalDetailsTotal.e;
        return (progressId == ProgressId.d && StringsKt.W(orderTotalDetailsTotal.d, "review", true)) ? ProgressId.h : progressId;
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final void y6(Checkout checkout, boolean z) {
        Intrinsics.h(checkout, "checkout");
        super.y6(checkout, z);
        List list = checkout.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof CollectionMethod) {
                arrayList.add(obj);
            }
        }
        CollectionMethod collectionMethod = (CollectionMethod) CollectionsKt.F(arrayList);
        BottomSheetContent.MarketplacePickUp marketPickupSheet = collectionMethod != null ? collectionMethod.getMarketPickupSheet() : null;
        if (marketPickupSheet != null) {
            CheckoutContentInteractor checkoutContentInteractor = this.o;
            if (checkoutContentInteractor.d.getBoolean("mixed_fulfilment_dialog_shown", true)) {
                androidx.constraintlayout.core.state.a.v(checkoutContentInteractor.d, "mixed_fulfilment_dialog_shown", false);
                this.i.f(new CheckoutContentContract.Actions.LaunchBottomSheetContent(marketPickupSheet));
            }
        }
    }
}
