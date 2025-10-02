package au.com.woolworths.shop.lists.ui.substitutions;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.compose.BackHandlerKt;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.internal.CloseableCoroutineScope;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.lists.ListsAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.component.bottomsheet.ModalBottomSheetLayoutKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.lists.data.model.AlternativeProductCard;
import au.com.woolworths.shop.lists.data.model.AlternativeProductsDisclaimer;
import au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsContract;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/product/addtocart/AddToCartBottomSheetFragment$BottomSheetHost;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Lau/com/woolworths/shop/lists/ui/substitutions/ViewSimilarProductsContract$ViewState;", "viewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ViewSimilarProductsActivity extends Hilt_ViewSimilarProductsActivity implements AddToCartBottomSheetFragment.BottomSheetHost, AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int C = 0;
    public final Lazy A;
    public final Lazy B;
    public ShopAppNavigator x;
    public FeatureToggleManager y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(ViewSimilarProductsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12472a;

        static {
            int[] iArr = new int[ViewSimilarProductsContract.ResultStatus.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f12472a = iArr;
            int[] iArr2 = new int[ProductBottomSheetActionType.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ProductBottomSheetActionType productBottomSheetActionType = ProductBottomSheetActionType.d;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                ProductBottomSheetActionType productBottomSheetActionType2 = ProductBottomSheetActionType.d;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public ViewSimilarProductsActivity() {
        final int i = 0;
        this.A = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.substitutions.j
            public final /* synthetic */ ViewSimilarProductsActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                ViewSimilarProductsActivity viewSimilarProductsActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = ViewSimilarProductsActivity.C;
                        Activities.ViewSimilarProductsActivity.Extras extras = (Activities.ViewSimilarProductsActivity.Extras) viewSimilarProductsActivity.getIntent().getParcelableExtra("EXTRAS");
                        if (extras != null) {
                            return extras;
                        }
                        throw new IllegalArgumentException("EXTRAS argument is required");
                    default:
                        int i4 = ViewSimilarProductsActivity.C;
                        return AlternativeProductsMode.valueOf(viewSimilarProductsActivity.S4().f);
                }
            }
        });
        final int i2 = 1;
        this.B = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.substitutions.j
            public final /* synthetic */ ViewSimilarProductsActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                ViewSimilarProductsActivity viewSimilarProductsActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = ViewSimilarProductsActivity.C;
                        Activities.ViewSimilarProductsActivity.Extras extras = (Activities.ViewSimilarProductsActivity.Extras) viewSimilarProductsActivity.getIntent().getParcelableExtra("EXTRAS");
                        if (extras != null) {
                            return extras;
                        }
                        throw new IllegalArgumentException("EXTRAS argument is required");
                    default:
                        int i4 = ViewSimilarProductsActivity.C;
                        return AlternativeProductsMode.valueOf(viewSimilarProductsActivity.S4().f);
                }
            }
        });
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a(T4());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            View decorView = getWindow().getDecorView();
            Intrinsics.g(decorView, "getDecorView(...)");
            ListChangeEventKt.a((ListChangeEvent.AddToListSuccessEvent) listChangeEvent, this, decorView, false, 28);
        }
    }

    public final void O4(ViewSimilarProductsContract.ViewState viewState, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(315386563);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i | (composerImplV.I(this) ? 32 : 16);
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            FeatureToggleManager featureToggleManager = this.y;
            if (featureToggleManager == null) {
                Intrinsics.p("featureToggleManager");
                throw null;
            }
            boolean zC = featureToggleManager.c(BaseShopAppFeature.w);
            T4();
            String strS6 = ViewSimilarProductsViewModel.s6((AlternativeProductsMode) this.B.getD());
            String str = S4().e;
            ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = T4();
            composerImplV.o(5004770);
            boolean zI = composerImplV.I(viewSimilarProductsViewModelT4);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                ViewSimilarProductsActivity$Content$1$1 viewSimilarProductsActivity$Content$1$1 = new ViewSimilarProductsActivity$Content$1$1(1, viewSimilarProductsViewModelT4, ViewSimilarProductsViewModel.class, "onSelectProductClick", "onSelectProductClick$shop_lists_release(Lau/com/woolworths/shop/lists/data/model/AlternativeProductCard;)V", 0);
                composerImplV.A(viewSimilarProductsActivity$Content$1$1);
                objG = viewSimilarProductsActivity$Content$1$1;
            }
            composerImplV.V(false);
            Function1 function1 = (Function1) ((KFunction) objG);
            ViewSimilarProductsViewModel viewSimilarProductsViewModelT42 = T4();
            composerImplV.o(5004770);
            boolean zI2 = composerImplV.I(viewSimilarProductsViewModelT42);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                objG2 = new ViewSimilarProductsActivity$Content$2$1(1, viewSimilarProductsViewModelT42, ViewSimilarProductsViewModel.class, "onInfoClick", "onInfoClick$shop_lists_release(Lau/com/woolworths/shop/lists/data/model/AlternativeProductsDisclaimer;)V", 0);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            Function1 function12 = (Function1) ((KFunction) objG2);
            composerImplV.o(5004770);
            boolean zI3 = composerImplV.I(this);
            Object objG3 = composerImplV.G();
            if (zI3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new au.com.woolworths.shop.lists.ui.shoppinglist.main.i(this, 1);
                composerImplV.A(objG3);
            }
            Function1 function13 = (Function1) objG3;
            composerImplV.V(false);
            ViewSimilarProductsViewModel viewSimilarProductsViewModelT43 = T4();
            composerImplV.o(5004770);
            boolean zI4 = composerImplV.I(viewSimilarProductsViewModelT43);
            Object objG4 = composerImplV.G();
            if (zI4 || objG4 == composer$Companion$Empty$1) {
                ViewSimilarProductsActivity$Content$4$1 viewSimilarProductsActivity$Content$4$1 = new ViewSimilarProductsActivity$Content$4$1(1, viewSimilarProductsViewModelT43, ViewSimilarProductsViewModel.class, "onSeeMoreClick", "onSeeMoreClick$shop_lists_release(Lau/com/woolworths/shop/lists/data/model/AlternativeProductsCtaSection;)V", 0);
                composerImplV.A(viewSimilarProductsActivity$Content$4$1);
                objG4 = viewSimilarProductsActivity$Content$4$1;
            }
            composerImplV.V(false);
            Function1 function14 = (Function1) ((KFunction) objG4);
            ViewSimilarProductsViewModel viewSimilarProductsViewModelT44 = T4();
            composerImplV.o(5004770);
            boolean zI5 = composerImplV.I(viewSimilarProductsViewModelT44);
            Object objG5 = composerImplV.G();
            if (zI5 || objG5 == composer$Companion$Empty$1) {
                ViewSimilarProductsActivity$Content$5$1 viewSimilarProductsActivity$Content$5$1 = new ViewSimilarProductsActivity$Content$5$1(0, viewSimilarProductsViewModelT44, ViewSimilarProductsViewModel.class, "onCloseClick", "onCloseClick$shop_lists_release()V", 0);
                composerImplV.A(viewSimilarProductsActivity$Content$5$1);
                objG5 = viewSimilarProductsActivity$Content$5$1;
            }
            composerImplV.V(false);
            SimilarProductsScreenKt.m(viewState, zC, strS6, str, function1, function12, function13, function14, (Function0) ((KFunction) objG5), T4(), composerImplV, i2 & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(this, i, 1, viewState);
        }
    }

    public final void P4(AlternativeProductsDisclaimer alternativeProductsDisclaimer, CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(1277358174);
        int i2 = (composerImplV.I(alternativeProductsDisclaimer) ? 4 : 2) | i | (composerImplV.I(coroutineScope) ? 32 : 16) | (composerImplV.I(modalBottomSheetState) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(coroutineScope) | ((i2 & 896) == 256 || composerImplV.I(modalBottomSheetState));
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new k(0, coroutineScope, modalBottomSheetState);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            DisclaimerBottomSheetContentKt.a(alternativeProductsDisclaimer, (Function0) objG, composerImplV, i2 & 14);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(this, alternativeProductsDisclaimer, coroutineScope, modalBottomSheetState, i, 2);
        }
    }

    public final void Q4(ViewSimilarProductsContract.ViewState viewState, CoroutineScope coroutineScope, ModalBottomSheetState modalBottomSheetState, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(323772991);
        int i2 = (composerImplV.n(viewState) ? 4 : 2) | i | (composerImplV.I(coroutineScope) ? 32 : 16) | (composerImplV.I(modalBottomSheetState) ? 256 : 128) | (composerImplV.I(this) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (viewState.c()) {
                composerImplV.o(1908207951);
                ViewSimilarProductsContract.ViewState.Content content = viewState instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) viewState : null;
                AlternativeProductCard alternativeProductCard = content != null ? content.b : null;
                if (alternativeProductCard != null) {
                    R4(alternativeProductCard, coroutineScope, modalBottomSheetState, composerImplV, (i2 & 112) | 512 | (i2 & 896) | (i2 & 7168));
                }
                composerImplV.V(false);
            } else if (viewState.b()) {
                composerImplV.o(1908218334);
                ViewSimilarProductsContract.ViewState.Content content2 = viewState instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) viewState : null;
                AlternativeProductsDisclaimer alternativeProductsDisclaimer = content2 != null ? content2.c : null;
                if (alternativeProductsDisclaimer != null) {
                    P4(alternativeProductsDisclaimer, coroutineScope, modalBottomSheetState, composerImplV, (i2 & 112) | 512 | (i2 & 896) | (i2 & 7168));
                }
                composerImplV.V(false);
            } else {
                composerImplV.o(-974528733);
                composerImplV.V(false);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(this, viewState, coroutineScope, modalBottomSheetState, i, 1);
        }
    }

    public final void R4(final AlternativeProductCard alternativeProductCard, final CoroutineScope coroutineScope, final ModalBottomSheetState modalBottomSheetState, Composer composer, int i) {
        ComposerImpl composerImplV = composer.v(-1703754782);
        int i2 = (composerImplV.I(alternativeProductCard) ? 4 : 2) | i | (composerImplV.I(coroutineScope) ? 32 : 16) | (composerImplV.I(modalBottomSheetState) ? 256 : 128) | (composerImplV.I(this) ? 2048 : 1024);
        if ((i2 & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(-1633490746);
            boolean zI = composerImplV.I(this) | composerImplV.I(alternativeProductCard);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (zI || objG == composer$Companion$Empty$1) {
                final int i3 = 0;
                objG = new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.substitutions.l
                    public final /* synthetic */ ViewSimilarProductsActivity e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Event event;
                        Event event2;
                        int i4 = i3;
                        Unit unit = Unit.f24250a;
                        ViewSimilarProductsActivity viewSimilarProductsActivity = this.e;
                        switch (i4) {
                            case 0:
                                int i5 = ViewSimilarProductsActivity.C;
                                ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = viewSimilarProductsActivity.T4();
                                String listId = viewSimilarProductsActivity.S4().d;
                                Intrinsics.h(listId, "listId");
                                CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(viewSimilarProductsViewModelT4);
                                AlternativeProductCard alternativeProductCard2 = alternativeProductCard;
                                BuildersKt.c(closeableCoroutineScopeA, null, null, new ViewSimilarProductsViewModel$onSaveKeepingOriginalClick$1(viewSimilarProductsViewModelT4, listId, alternativeProductCard2, null), 3);
                                TrackingMetadata trackingMetadataB = ProductAnalyticsExtKt.b(null, 3, CollectionsKt.Q(alternativeProductCard2.getProduct()));
                                if (trackingMetadataB != null) {
                                    if (viewSimilarProductsViewModelT4.m == AlternativeProductsMode.f) {
                                        event = ListsAnalytics.LowerUnitPriceOptions.Action.f;
                                    } else {
                                        ListsAnalytics.ViewSimilarItems.Action.Companion companion = ListsAnalytics.ViewSimilarItems.Action.d;
                                        String substitutionSource = alternativeProductCard2.getSubstitutionSource();
                                        companion.getClass();
                                        Intrinsics.h(substitutionSource, "substitutionSource");
                                        event = new Event(substitutionSource) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$saveAndKeepOriginal$1
                                            public final Object d;

                                            {
                                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                                                spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                                                spreadBuilder.a(new Pair("event.Action", "click"));
                                                a.z("event.Label", "save and keep original", spreadBuilder, "event.Description", substitutionSource);
                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                            }

                                            @Override // au.com.woolworths.analytics.Event
                                            /* renamed from: d */
                                            public final String getE() {
                                                return "bottomsheet_click";
                                            }

                                            public final boolean equals(Object obj) {
                                                if (!(obj instanceof Event)) {
                                                    return false;
                                                }
                                                Event event3 = (Event) obj;
                                                return "bottomsheet_click".equals(event3.getE()) && Intrinsics.c(this.d, event3.getData()) && Intrinsics.c(null, event3.getF());
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                            @Override // au.com.woolworths.analytics.Event
                                            public final Map getData() {
                                                return this.d;
                                            }
                                        };
                                    }
                                    viewSimilarProductsViewModelT4.h.i(event, trackingMetadataB);
                                    break;
                                }
                                break;
                            default:
                                int i6 = ViewSimilarProductsActivity.C;
                                ViewSimilarProductsViewModel viewSimilarProductsViewModelT42 = viewSimilarProductsActivity.T4();
                                String listId2 = viewSimilarProductsActivity.S4().d;
                                String originalProductId = viewSimilarProductsActivity.S4().e;
                                Intrinsics.h(listId2, "listId");
                                Intrinsics.h(originalProductId, "originalProductId");
                                CloseableCoroutineScope closeableCoroutineScopeA2 = ViewModelKt.a(viewSimilarProductsViewModelT42);
                                AlternativeProductCard alternativeProductCard3 = alternativeProductCard;
                                BuildersKt.c(closeableCoroutineScopeA2, null, null, new ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1(viewSimilarProductsViewModelT42, listId2, originalProductId, alternativeProductCard3, null), 3);
                                TrackingMetadata trackingMetadataB2 = ProductAnalyticsExtKt.b(null, 3, CollectionsKt.Q(alternativeProductCard3.getProduct()));
                                if (trackingMetadataB2 != null) {
                                    if (viewSimilarProductsViewModelT42.m == AlternativeProductsMode.f) {
                                        event2 = ListsAnalytics.LowerUnitPriceOptions.Action.e;
                                    } else {
                                        ListsAnalytics.ViewSimilarItems.Action.Companion companion2 = ListsAnalytics.ViewSimilarItems.Action.d;
                                        String substitutionSource2 = alternativeProductCard3.getSubstitutionSource();
                                        companion2.getClass();
                                        Intrinsics.h(substitutionSource2, "substitutionSource");
                                        event2 = new Event(substitutionSource2) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$saveAndReplaceOriginal$1
                                            public final Object d;

                                            {
                                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                                                spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                                                spreadBuilder.a(new Pair("event.Action", "click"));
                                                a.z("event.Label", "save and replace original", spreadBuilder, "event.Description", substitutionSource2);
                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                            }

                                            @Override // au.com.woolworths.analytics.Event
                                            /* renamed from: d */
                                            public final String getE() {
                                                return "bottomsheet_click";
                                            }

                                            public final boolean equals(Object obj) {
                                                if (!(obj instanceof Event)) {
                                                    return false;
                                                }
                                                Event event3 = (Event) obj;
                                                return "bottomsheet_click".equals(event3.getE()) && Intrinsics.c(this.d, event3.getData()) && Intrinsics.c(null, event3.getF());
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                            @Override // au.com.woolworths.analytics.Event
                                            public final Map getData() {
                                                return this.d;
                                            }
                                        };
                                    }
                                    viewSimilarProductsViewModelT42.h.i(event2, trackingMetadataB2);
                                    break;
                                }
                                break;
                        }
                        return unit;
                    }
                };
                composerImplV.A(objG);
            }
            Function0 function0 = (Function0) objG;
            composerImplV.V(false);
            composerImplV.o(-1633490746);
            boolean zI2 = composerImplV.I(this) | composerImplV.I(alternativeProductCard);
            Object objG2 = composerImplV.G();
            if (zI2 || objG2 == composer$Companion$Empty$1) {
                final int i4 = 1;
                objG2 = new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.substitutions.l
                    public final /* synthetic */ ViewSimilarProductsActivity e;

                    {
                        this.e = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Event event;
                        Event event2;
                        int i42 = i4;
                        Unit unit = Unit.f24250a;
                        ViewSimilarProductsActivity viewSimilarProductsActivity = this.e;
                        switch (i42) {
                            case 0:
                                int i5 = ViewSimilarProductsActivity.C;
                                ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = viewSimilarProductsActivity.T4();
                                String listId = viewSimilarProductsActivity.S4().d;
                                Intrinsics.h(listId, "listId");
                                CloseableCoroutineScope closeableCoroutineScopeA = ViewModelKt.a(viewSimilarProductsViewModelT4);
                                AlternativeProductCard alternativeProductCard2 = alternativeProductCard;
                                BuildersKt.c(closeableCoroutineScopeA, null, null, new ViewSimilarProductsViewModel$onSaveKeepingOriginalClick$1(viewSimilarProductsViewModelT4, listId, alternativeProductCard2, null), 3);
                                TrackingMetadata trackingMetadataB = ProductAnalyticsExtKt.b(null, 3, CollectionsKt.Q(alternativeProductCard2.getProduct()));
                                if (trackingMetadataB != null) {
                                    if (viewSimilarProductsViewModelT4.m == AlternativeProductsMode.f) {
                                        event = ListsAnalytics.LowerUnitPriceOptions.Action.f;
                                    } else {
                                        ListsAnalytics.ViewSimilarItems.Action.Companion companion = ListsAnalytics.ViewSimilarItems.Action.d;
                                        String substitutionSource = alternativeProductCard2.getSubstitutionSource();
                                        companion.getClass();
                                        Intrinsics.h(substitutionSource, "substitutionSource");
                                        event = new Event(substitutionSource) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$saveAndKeepOriginal$1
                                            public final Object d;

                                            {
                                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                                                spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                                                spreadBuilder.a(new Pair("event.Action", "click"));
                                                a.z("event.Label", "save and keep original", spreadBuilder, "event.Description", substitutionSource);
                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                            }

                                            @Override // au.com.woolworths.analytics.Event
                                            /* renamed from: d */
                                            public final String getE() {
                                                return "bottomsheet_click";
                                            }

                                            public final boolean equals(Object obj) {
                                                if (!(obj instanceof Event)) {
                                                    return false;
                                                }
                                                Event event3 = (Event) obj;
                                                return "bottomsheet_click".equals(event3.getE()) && Intrinsics.c(this.d, event3.getData()) && Intrinsics.c(null, event3.getF());
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                            @Override // au.com.woolworths.analytics.Event
                                            public final Map getData() {
                                                return this.d;
                                            }
                                        };
                                    }
                                    viewSimilarProductsViewModelT4.h.i(event, trackingMetadataB);
                                    break;
                                }
                                break;
                            default:
                                int i6 = ViewSimilarProductsActivity.C;
                                ViewSimilarProductsViewModel viewSimilarProductsViewModelT42 = viewSimilarProductsActivity.T4();
                                String listId2 = viewSimilarProductsActivity.S4().d;
                                String originalProductId = viewSimilarProductsActivity.S4().e;
                                Intrinsics.h(listId2, "listId");
                                Intrinsics.h(originalProductId, "originalProductId");
                                CloseableCoroutineScope closeableCoroutineScopeA2 = ViewModelKt.a(viewSimilarProductsViewModelT42);
                                AlternativeProductCard alternativeProductCard3 = alternativeProductCard;
                                BuildersKt.c(closeableCoroutineScopeA2, null, null, new ViewSimilarProductsViewModel$onSaveReplacingOriginalClick$1(viewSimilarProductsViewModelT42, listId2, originalProductId, alternativeProductCard3, null), 3);
                                TrackingMetadata trackingMetadataB2 = ProductAnalyticsExtKt.b(null, 3, CollectionsKt.Q(alternativeProductCard3.getProduct()));
                                if (trackingMetadataB2 != null) {
                                    if (viewSimilarProductsViewModelT42.m == AlternativeProductsMode.f) {
                                        event2 = ListsAnalytics.LowerUnitPriceOptions.Action.e;
                                    } else {
                                        ListsAnalytics.ViewSimilarItems.Action.Companion companion2 = ListsAnalytics.ViewSimilarItems.Action.d;
                                        String substitutionSource2 = alternativeProductCard3.getSubstitutionSource();
                                        companion2.getClass();
                                        Intrinsics.h(substitutionSource2, "substitutionSource");
                                        event2 = new Event(substitutionSource2) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$saveAndReplaceOriginal$1
                                            public final Object d;

                                            {
                                                SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                                spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                                                spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                                                spreadBuilder.a(new Pair("event.Action", "click"));
                                                a.z("event.Label", "save and replace original", spreadBuilder, "event.Description", substitutionSource2);
                                                ArrayList arrayList = spreadBuilder.f24269a;
                                                this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                            }

                                            @Override // au.com.woolworths.analytics.Event
                                            /* renamed from: d */
                                            public final String getE() {
                                                return "bottomsheet_click";
                                            }

                                            public final boolean equals(Object obj) {
                                                if (!(obj instanceof Event)) {
                                                    return false;
                                                }
                                                Event event3 = (Event) obj;
                                                return "bottomsheet_click".equals(event3.getE()) && Intrinsics.c(this.d, event3.getData()) && Intrinsics.c(null, event3.getF());
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                            @Override // au.com.woolworths.analytics.Event
                                            public final Map getData() {
                                                return this.d;
                                            }
                                        };
                                    }
                                    viewSimilarProductsViewModelT42.h.i(event2, trackingMetadataB2);
                                    break;
                                }
                                break;
                        }
                        return unit;
                    }
                };
                composerImplV.A(objG2);
            }
            Function0 function02 = (Function0) objG2;
            composerImplV.V(false);
            composerImplV.o(-1224400529);
            boolean zI3 = ((i2 & 896) == 256 || composerImplV.I(modalBottomSheetState)) | composerImplV.I(coroutineScope) | composerImplV.I(this) | composerImplV.I(alternativeProductCard);
            Object objG3 = composerImplV.G();
            if (zI3 || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.substitutions.m
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Event event;
                        int i5 = ViewSimilarProductsActivity.C;
                        BuildersKt.c(coroutineScope, null, null, new ViewSimilarProductsActivity$SelectOptionBottomSheetContent$3$1$1(modalBottomSheetState, null), 3);
                        ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = this.T4();
                        MutableStateFlow mutableStateFlow = viewSimilarProductsViewModelT4.k;
                        Object value = mutableStateFlow.getValue();
                        ViewSimilarProductsContract.ViewState.Content content = value instanceof ViewSimilarProductsContract.ViewState.Content ? (ViewSimilarProductsContract.ViewState.Content) value : null;
                        if (content != null) {
                            mutableStateFlow.f(ViewSimilarProductsContract.ViewState.Content.d(content, null, null, null, 61));
                        }
                        SharedFlowImpl sharedFlowImpl = viewSimilarProductsViewModelT4.l;
                        AlternativeProductCard alternativeProductCard2 = alternativeProductCard;
                        sharedFlowImpl.f(new ViewSimilarProductsContract.Action.DisplayAddToCartBottomSheet(alternativeProductCard2.getProduct()));
                        TrackingMetadata trackingMetadataB = ProductAnalyticsExtKt.b(null, 3, CollectionsKt.Q(alternativeProductCard2.getProduct()));
                        if (trackingMetadataB != null) {
                            if (viewSimilarProductsViewModelT4.m == AlternativeProductsMode.f) {
                                event = ListsAnalytics.LowerUnitPriceOptions.Action.g;
                            } else {
                                ListsAnalytics.ViewSimilarItems.Action.Companion companion = ListsAnalytics.ViewSimilarItems.Action.d;
                                String substitutionSource = alternativeProductCard2.getSubstitutionSource();
                                companion.getClass();
                                Intrinsics.h(substitutionSource, "substitutionSource");
                                event = new Event(substitutionSource) { // from class: au.com.woolworths.analytics.supers.lists.ListsAnalytics$ViewSimilarItems$Action$Companion$addToCart$1
                                    public final Object d;

                                    {
                                        SpreadBuilder spreadBuilder = new SpreadBuilder(5);
                                        spreadBuilder.b(ListsAnalytics.ViewSimilarItems.f);
                                        spreadBuilder.a(new Pair("event.Category", "bottomsheet"));
                                        spreadBuilder.a(new Pair("event.Action", "click"));
                                        a.z("event.Label", "Add To Cart", spreadBuilder, "event.Description", substitutionSource);
                                        ArrayList arrayList = spreadBuilder.f24269a;
                                        this.d = MapsKt.j((Pair[]) arrayList.toArray(new Pair[arrayList.size()]));
                                    }

                                    @Override // au.com.woolworths.analytics.Event
                                    /* renamed from: d */
                                    public final String getE() {
                                        return "bottomsheet_click";
                                    }

                                    public final boolean equals(Object obj) {
                                        if (!(obj instanceof Event)) {
                                            return false;
                                        }
                                        Event event2 = (Event) obj;
                                        return "bottomsheet_click".equals(event2.getE()) && Intrinsics.c(this.d, event2.getData()) && Intrinsics.c(null, event2.getF());
                                    }

                                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                    @Override // au.com.woolworths.analytics.Event
                                    public final Map getData() {
                                        return this.d;
                                    }
                                };
                            }
                            viewSimilarProductsViewModelT4.h.i(event, trackingMetadataB);
                        }
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            SelectAlternativeOptionsBottomSheetContentKt.c(function0, function02, (Function0) objG3, !T4().i.g(), composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new i(this, alternativeProductCard, coroutineScope, modalBottomSheetState, i, 0);
        }
    }

    public final Activities.ViewSimilarProductsActivity.Extras S4() {
        return (Activities.ViewSimilarProductsActivity.Extras) this.A.getD();
    }

    public final ViewSimilarProductsViewModel T4() {
        return (ViewSimilarProductsViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment.BottomSheetHost
    public final void e(AddToCartBottomSheetFragment.AddToCartSuccessEvent addToCartSuccessEvent) {
        Activities.ViewSimilarProductsActivity.Status status;
        if (T4().m != AlternativeProductsMode.h) {
            int iOrdinal = addToCartSuccessEvent.f9242a.ordinal();
            if (iOrdinal == 0) {
                status = Activities.ViewSimilarProductsActivity.Status.e;
            } else if (iOrdinal == 1) {
                status = Activities.ViewSimilarProductsActivity.Status.f;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                status = Activities.ViewSimilarProductsActivity.Status.g;
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_RESULT", new Activities.ViewSimilarProductsActivity.Result(status, null));
            setResult(-1, intent);
            finish();
        }
    }

    @Override // au.com.woolworths.shop.lists.ui.substitutions.Hilt_ViewSimilarProductsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ViewSimilarProductsActivity$handleActions$1(this, null), 3);
        T4().t6(S4().e, (AlternativeProductsMode) this.B.getD());
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$setUiContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = ViewSimilarProductsActivity.C;
                    final ViewSimilarProductsActivity viewSimilarProductsActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(viewSimilarProductsActivity.T4().k, composer);
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = android.support.v4.media.session.a.i(composer.y(), composer);
                    }
                    final CoroutineScope coroutineScope = (CoroutineScope) objG;
                    final ModalBottomSheetState modalBottomSheetStateC = ModalBottomSheetKt.c(ModalBottomSheetValue.d, null, composer, 6, 14);
                    Boolean boolValueOf = Boolean.valueOf(((ViewSimilarProductsContract.ViewState) mutableStateA.getD()).a());
                    composer.o(-1633490746);
                    boolean zN = composer.n(mutableStateA) | composer.I(modalBottomSheetStateC);
                    Object objG2 = composer.G();
                    if (zN || objG2 == composer$Companion$Empty$1) {
                        objG2 = new ViewSimilarProductsActivity$setUiContent$1$1$1(modalBottomSheetStateC, mutableStateA, null);
                        composer.A(objG2);
                    }
                    composer.l();
                    EffectsKt.e(composer, boolValueOf, (Function2) objG2);
                    ModalBottomSheetValue modalBottomSheetValueB = modalBottomSheetStateC.b();
                    composer.o(-1633490746);
                    boolean zI = composer.I(modalBottomSheetStateC) | composer.I(viewSimilarProductsActivity);
                    Object objG3 = composer.G();
                    if (zI || objG3 == composer$Companion$Empty$1) {
                        objG3 = new ViewSimilarProductsActivity$setUiContent$1$2$1(modalBottomSheetStateC, viewSimilarProductsActivity, null);
                        composer.A(objG3);
                    }
                    composer.l();
                    EffectsKt.e(composer, modalBottomSheetValueB, (Function2) objG3);
                    composer.o(-1746271574);
                    boolean zI2 = composer.I(coroutineScope) | composer.I(modalBottomSheetStateC) | composer.I(viewSimilarProductsActivity);
                    Object objG4 = composer.G();
                    if (zI2 || objG4 == composer$Companion$Empty$1) {
                        objG4 = new Function0() { // from class: au.com.woolworths.shop.lists.ui.substitutions.n
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                BuildersKt.c(coroutineScope, null, null, new ViewSimilarProductsActivity$setUiContent$1$3$1$1(modalBottomSheetStateC, viewSimilarProductsActivity, null), 3);
                                return Unit.f24250a;
                            }
                        };
                        composer.A(objG4);
                    }
                    composer.l();
                    BackHandlerKt.a(false, (Function0) objG4, composer, 0, 1);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1412683246, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity$setUiContent$1.4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final CoroutineScope coroutineScope2 = coroutineScope;
                                final ModalBottomSheetState modalBottomSheetState = modalBottomSheetStateC;
                                final MutableState mutableState = mutableStateA;
                                final ViewSimilarProductsActivity viewSimilarProductsActivity2 = viewSimilarProductsActivity;
                                ModalBottomSheetLayoutKt.a(ComposableLambdaKt.c(-60489572, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity.setUiContent.1.4.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        ColumnScope ModalBottomSheetLayout = (ColumnScope) obj5;
                                        Composer composer3 = (Composer) obj6;
                                        int iIntValue = ((Number) obj7).intValue();
                                        Intrinsics.h(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                                        if ((iIntValue & 17) == 16 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            ViewSimilarProductsContract.ViewState viewState = (ViewSimilarProductsContract.ViewState) mutableState.getD();
                                            int i2 = ViewSimilarProductsActivity.C;
                                            viewSimilarProductsActivity2.Q4(viewState, coroutineScope2, modalBottomSheetState, composer3, 512);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), null, modalBottomSheetState, 0, 0L, 0L, false, ComposableLambdaKt.c(-1286242477, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity.setUiContent.1.4.2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj5, Object obj6) {
                                        Composer composer3 = (Composer) obj5;
                                        if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                            composer3.j();
                                        } else {
                                            ViewSimilarProductsContract.ViewState viewState = (ViewSimilarProductsContract.ViewState) mutableState.getD();
                                            int i2 = ViewSimilarProductsActivity.C;
                                            viewSimilarProductsActivity2.O4(viewState, composer3, 0);
                                        }
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 12586502, 114);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1782803254));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewSimilarProductsViewModel viewSimilarProductsViewModelT4 = T4();
        AnalyticsManager analyticsManager = viewSimilarProductsViewModelT4.h;
        if (viewSimilarProductsViewModelT4.m == AlternativeProductsMode.f) {
            analyticsManager.f(ListsAnalytics.LowerUnitPriceOptions.d);
        } else {
            analyticsManager.f(ListsAnalytics.ViewSimilarItems.d);
        }
    }
}
