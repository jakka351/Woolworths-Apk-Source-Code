package au.com.woolworths.shop.checkout.ui.product;

import android.R;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.local.CheckoutAnalytics;
import au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.ProductTrackingValueKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.TrolleyInteractor;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.rewards.base.d;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaign;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaignInfo;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductCampaigns;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitutionOption;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductSubstitutionOptionId;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProducts;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProductsSubstitutionInfo;
import au.com.woolworths.shop.checkout.domain.model.CheckoutRemoveProductInfo;
import au.com.woolworths.shop.checkout.domain.model.MarketProductRow;
import au.com.woolworths.shop.checkout.domain.model.ProgressId;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutProductSubstitutionPreference;
import au.com.woolworths.shop.checkout.domain.model.substitution.CheckoutSubstitutionPreferences;
import au.com.woolworths.shop.checkout.domain.model.substitution.SubstitutionState;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutAnalyticsExtKt;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutProductsActions;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentContract;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentInteractor;
import au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel;
import au.com.woolworths.shop.checkout.ui.content.behaviour.CheckoutContentViewBehaviour;
import dagger.hilt.android.lifecycle.HiltViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@HiltViewModel
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductViewModel;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentViewModel;", "Lau/com/woolworths/shop/checkout/ui/product/CheckoutProductListener;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CheckoutProductViewModel extends CheckoutContentViewModel implements CheckoutProductListener {
    public final CheckoutContentInteractor o;
    public final TrolleyInteractor p;
    public final ProgressId q;
    public final Lazy r;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[CheckoutProductSubstitutionOptionId.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId = CheckoutProductSubstitutionOptionId.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId2 = CheckoutProductSubstitutionOptionId.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                CheckoutProductSubstitutionOptionId checkoutProductSubstitutionOptionId3 = CheckoutProductSubstitutionOptionId.d;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[SubstitutionState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                SubstitutionState substitutionState = SubstitutionState.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                SubstitutionState substitutionState2 = SubstitutionState.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutProductViewModel(CheckoutContentInteractor checkoutContentInteractor, TrolleyInteractor trolleyInteractor, CollectionModeInteractor collectionModeInteractor, AnalyticsManager analyticsManager, FeatureToggleManager featureToggleManager) {
        super(collectionModeInteractor, analyticsManager, featureToggleManager);
        Intrinsics.h(trolleyInteractor, "trolleyInteractor");
        Intrinsics.h(collectionModeInteractor, "collectionModeInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        Intrinsics.h(featureToggleManager, "featureToggleManager");
        this.o = checkoutContentInteractor;
        this.p = trolleyInteractor;
        this.q = ProgressId.e;
        this.r = LazyKt.b(new d(14));
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void B5(CheckoutProductsSubstitutionInfo checkoutProductsSubstitutionInfo) {
        D6(CheckoutProductsActions.SubstitutionInfoClick.e);
        this.i.f(new CheckoutContentContract.Actions.LaunchAlertDialog(new PlainText(checkoutProductsSubstitutionInfo.f10574a), new PlainText(checkoutProductsSubstitutionInfo.b), new PlainText(checkoutProductsSubstitutionInfo.c), null, null, null));
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void D3(boolean z, CheckoutProduct checkoutProduct) {
        final String label;
        CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.Companion companion = CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.d;
        CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference = checkoutProduct.o;
        if (checkoutProductSubstitutionPreference == null || (label = checkoutProductSubstitutionPreference.d.getLabel()) == null) {
            label = "";
        }
        final List listQ = CollectionsKt.Q(checkoutProduct.c);
        companion.getClass();
        C6(new Event(label, listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action$Companion$selectProductSubstitution$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CheckoutSubstitutionAnalytics.CheckoutSubstitution.e);
                spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Label", "Substitution preference checkbox"));
                spreadBuilder.a(new Pair("event.Description", label));
                spreadBuilder.a(new Pair("product.ID", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "select_product_substitution";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "select_product_substitution".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, null);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$updateSubstitution$1(this, CollectionsKt.Q(checkoutProduct), z, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void E1(int i, boolean z) {
        K6(this.j, i, z);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$onToggleCampaignOptIn$1(this, i, z, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void E4(CheckoutProduct checkoutProduct) {
        final String label;
        String str = checkoutProduct.c;
        CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.Companion companion = CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.d;
        CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference = checkoutProduct.o;
        if (checkoutProductSubstitutionPreference == null || (label = checkoutProductSubstitutionPreference.d.getLabel()) == null) {
            label = "";
        }
        final List listQ = CollectionsKt.Q(str);
        companion.getClass();
        C6(new Event(label, listQ) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action$Companion$editProductSubstitution$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CheckoutSubstitutionAnalytics.CheckoutSubstitution.e);
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                spreadBuilder.a(new Pair("event.Label", "Edit choice"));
                spreadBuilder.a(new Pair("event.Description", label));
                spreadBuilder.a(new Pair("product.ID", listQ));
                ArrayList arrayList = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "substitution_edit_click";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "substitution_edit_click".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, null);
        this.i.f(new CheckoutContentContract.Actions.LaunchSubstitutionScreen(str, checkoutProduct.b));
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void F0(boolean z, CheckoutSubstitutionPreferences substitutionPreferences, ArrayList arrayList) {
        Intrinsics.h(substitutionPreferences, "substitutionPreferences");
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$updateSubstitution$1(this, arrayList, z, null), 3);
        CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.Companion companion = CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.d;
        final boolean z2 = substitutionPreferences.c == SubstitutionState.d;
        companion.getClass();
        C6(new Event(z2) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action$Companion$clickGlobalSubstitution$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                spreadBuilder.b(CheckoutSubstitutionAnalytics.CheckoutSubstitution.e);
                spreadBuilder.a(new Pair("event.Category", "substitution"));
                spreadBuilder.a(new Pair("event.Action", "click"));
                spreadBuilder.a(new Pair("event.Label", "Select All"));
                a.y("event.Value", String.valueOf(z2), spreadBuilder);
                ArrayList arrayList2 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList2.toArray(new Pair[arrayList2.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "substitution_select_all";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "substitution_select_all".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, null);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void H3() {
        C6(CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.g, null);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void I4(CheckoutProduct checkoutProduct) {
        this.i.f(new CheckoutContentContract.Actions.LaunchShopperNoteScreen(checkoutProduct));
    }

    public final void I6(final String str, CheckoutRemoveProductInfo checkoutRemoveProductInfo, final TrackingMetadata trackingMetadata) {
        C6(CheckoutAnalytics.Product.Action.d, trackingMetadata);
        this.i.f(new CheckoutContentContract.Actions.LaunchAlertDialog(new PlainText(checkoutRemoveProductInfo.f10580a), new PlainText(checkoutRemoveProductInfo.b), new PlainText(checkoutRemoveProductInfo.c), new Function0() { // from class: au.com.woolworths.shop.checkout.ui.product.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                CheckoutProductViewModel checkoutProductViewModel = this.d;
                BuildersKt.c(ViewModelKt.a(checkoutProductViewModel), null, null, new CheckoutProductViewModel$onRemoveProduct$1$1(checkoutProductViewModel, trackingMetadata, str, null), 3);
                return Unit.f24250a;
            }
        }, new ResText(R.string.cancel), null));
    }

    public final void J6(double d, String productId, String instruction) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(instruction, "instruction");
        this.i.f(CheckoutContentContract.Actions.DismissKeyboard.f10730a);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$onUpdateProductInstruction$1(this, productId, d, instruction, null), 3);
    }

    public final void K6(MutableStateFlow mutableStateFlow, int i, boolean z) {
        Checkout checkout = ((CheckoutContentContract.ViewState) mutableStateFlow.getValue()).d;
        if (checkout != null) {
            List list = checkout.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            for (Object checkoutProductCampaigns : list) {
                if (checkoutProductCampaigns instanceof CheckoutProductCampaigns) {
                    ArrayList<CheckoutProductCampaign> arrayList2 = ((CheckoutProductCampaigns) checkoutProductCampaigns).f10568a;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                    for (CheckoutProductCampaign checkoutProductCampaign : arrayList2) {
                        int i2 = checkoutProductCampaign.d;
                        if (i2 == i) {
                            checkoutProductCampaign = new CheckoutProductCampaign(checkoutProductCampaign.f10566a, checkoutProductCampaign.b, checkoutProductCampaign.c, i2, checkoutProductCampaign.e, z, checkoutProductCampaign.g);
                        }
                        arrayList3.add(checkoutProductCampaign);
                    }
                    checkoutProductCampaigns = new CheckoutProductCampaigns(arrayList3);
                }
                arrayList.add(checkoutProductCampaigns);
            }
            G6(mutableStateFlow, Checkout.a(checkout, arrayList, 1021), null);
        }
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void O0(CheckoutProduct product) {
        Intrinsics.h(product, "product");
        D6(new CheckoutProductsActions.SubstitutionToggle(!product.k));
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$onToggleSubstitution$1(this, product, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void W3(CheckoutProductCampaignInfo checkoutProductCampaignInfo) {
        this.i.f(new CheckoutContentContract.Actions.LaunchAlertDialog(null, new PlainText(checkoutProductCampaignInfo.f10567a), new PlainText(checkoutProductCampaignInfo.b), null, null, null));
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void X1() {
        C6(CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.h, null);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener
    public final void Z2(String str) {
        D6(CheckoutProductsActions.PromotionSubmitted.e);
        this.i.f(CheckoutContentContract.Actions.DismissKeyboard.f10730a);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$onAddPromoCode$1(this, str, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void c1(CheckoutSubstitutionPreferences substitutionPreferences) {
        Intrinsics.h(substitutionPreferences, "substitutionPreferences");
        int iOrdinal = substitutionPreferences.c.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        C6(CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.e, null);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void f1(CheckoutProductSubstitutionOption checkoutProductSubstitutionOption, ArrayList arrayList) {
        Boolean bool;
        int iOrdinal = checkoutProductSubstitutionOption.b.ordinal();
        if (iOrdinal == 0) {
            bool = Boolean.TRUE;
        } else if (iOrdinal == 1) {
            bool = null;
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            bool = null;
        } else {
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$onUpdateSubstitution$1$1(this, arrayList, bool.booleanValue(), null), 3);
        }
        D6(new CheckoutProductsActions.CustomButtonClick(checkoutProductSubstitutionOption.f10572a));
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel, au.com.woolworths.shop.checkout.ui.content.CheckoutFullPageErrorActionInterface
    public final void o0() {
        this.p.K();
        this.i.f(CheckoutContentContract.Actions.ExitAndLaunchProducts.f10732a);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final Job q6(Function0 function0) {
        return BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$constructFetchContentJob$1(this, null), 3);
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    public final CheckoutContentViewBehaviour s6() {
        return (CheckoutContentViewBehaviour) this.r.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void u4(MarketProductRow product, String sellerName, String dispatchNote) {
        Intrinsics.h(product, "product");
        Intrinsics.h(sellerName, "sellerName");
        Intrinsics.h(dispatchNote, "dispatchNote");
        I6(product.c, product.i, ProductTrackingValueKt.a(CollectionsKt.Q(CheckoutAnalyticsExtKt.c(product, sellerName, dispatchNote))));
    }

    @Override // au.com.woolworths.shop.checkout.ui.content.CheckoutContentViewModel
    /* renamed from: u6, reason: from getter */
    public final ProgressId getQ() {
        return this.q;
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void w1(CheckoutProducts product) {
        String label;
        Intrinsics.h(product, "product");
        ArrayList arrayList = product.e;
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((CheckoutProduct) it.next()).c);
        }
        final ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CheckoutProductSubstitutionPreference checkoutProductSubstitutionPreference = ((CheckoutProduct) it2.next()).o;
            if (checkoutProductSubstitutionPreference == null || (label = checkoutProductSubstitutionPreference.d.getLabel()) == null) {
                label = "";
            }
            arrayList3.add(label);
        }
        CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.d.getClass();
        C6(new Event(arrayList2, arrayList3) { // from class: au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics$CheckoutSubstitution$Action$Companion$loadProductSubstitution$1
            public final Object d;

            {
                SpreadBuilder spreadBuilder = new SpreadBuilder(6);
                spreadBuilder.b(CheckoutSubstitutionAnalytics.CheckoutSubstitution.e);
                spreadBuilder.a(new Pair("event.Category", "Checkout Substitutions"));
                spreadBuilder.a(new Pair("event.Action", "impression"));
                spreadBuilder.a(new Pair("event.Label", "Substitution Checkout Impression"));
                spreadBuilder.a(new Pair("product.ID", arrayList2));
                spreadBuilder.a(new Pair("product.SubstitutionStatus", arrayList3));
                ArrayList arrayList4 = spreadBuilder.f24269a;
                this.d = MapsKt.j((Pair[]) arrayList4.toArray(new Pair[arrayList4.size()]));
            }

            @Override // au.com.woolworths.analytics.Event
            /* renamed from: d */
            public final String getE() {
                return "substitution_checkout_impression";
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof Event)) {
                    return false;
                }
                Event event = (Event) obj;
                return "substitution_checkout_impression".equals(event.getE()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
            @Override // au.com.woolworths.analytics.Event
            public final Map getData() {
                return this.d;
            }
        }, null);
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutProductListener
    public final void x1(CheckoutProduct product) {
        Intrinsics.h(product, "product");
        I6(product.c, product.j, ProductTrackingValueKt.a(CollectionsKt.Q(CheckoutAnalyticsExtKt.b(product))));
    }

    @Override // au.com.woolworths.shop.checkout.ui.product.CheckoutPromoCodeListener
    public final void x2() {
        this.i.f(CheckoutContentContract.Actions.DismissKeyboard.f10730a);
        BuildersKt.c(ViewModelKt.a(this), null, null, new CheckoutProductViewModel$onRemovePromoCode$1(this, null), 3);
    }
}
