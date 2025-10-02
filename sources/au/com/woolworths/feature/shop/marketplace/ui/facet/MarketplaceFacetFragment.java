package au.com.woolworths.feature.shop.marketplace.ui.facet;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.SearchView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceFacetBinding;
import au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetContract;
import au.com.woolworths.feature.shop.marketplace.ui.marketplacesection.SearchBarViewState;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState;", "viewState", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class MarketplaceFacetFragment extends Fragment {
    public FeatureToggleManager d;
    public FragmentMarketplaceFacetBinding f;
    public final Lazy e = LazyKt.b(new g(this, 0));
    public final Lazy g = LazyKt.b(new g(this, 1));

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment$onCreateView$1", f = "MarketplaceFacetFragment.kt", l = {59}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment$onCreateView$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment$onCreateView$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01921 extends AdaptedFunctionReference implements Function2<MarketplaceFacetContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                MarketplaceFacetContract.Action action = (MarketplaceFacetContract.Action) obj;
                MarketplaceFacetFragment marketplaceFacetFragment = (MarketplaceFacetFragment) this.d;
                marketplaceFacetFragment.getClass();
                if (!(action instanceof MarketplaceFacetContract.Action.LaunchProductList)) {
                    throw new NoWhenBranchMatchedException();
                }
                MarketplaceFacetContract.Action.LaunchProductList launchProductList = (MarketplaceFacetContract.Action.LaunchProductList) action;
                String str = launchProductList.f7488a;
                String str2 = launchProductList.b;
                String str3 = launchProductList.c;
                Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(str, null), new Activities.ProductList.ExtrasByFacet(null, str, str2, str3, null), (Activities.ProductList.ExtrasConfig) null, 12));
                marketplaceFacetFragment.startActivity(intentA);
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MarketplaceFacetFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                MarketplaceFacetFragment marketplaceFacetFragment = MarketplaceFacetFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01921(2, marketplaceFacetFragment, MarketplaceFacetFragment.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$Action;)V", 4), FlowExtKt.a(marketplaceFacetFragment.E1().i, marketplaceFacetFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    public abstract MarketplaceFacetViewModel E1();

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new AnonymousClass1(null), 3);
        if (((Boolean) this.e.getD()).booleanValue()) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment$onCreateView$2$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final MarketplaceFacetFragment marketplaceFacetFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(1562902236, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment$onCreateView$2$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    final MarketplaceFacetFragment marketplaceFacetFragment2 = marketplaceFacetFragment;
                                    MarketplaceFacetContract.ViewState viewState = (MarketplaceFacetContract.ViewState) androidx.lifecycle.compose.FlowExtKt.a(marketplaceFacetFragment2.E1().j, composer2).getD();
                                    MarketplaceFacetViewModel marketplaceFacetViewModelE1 = marketplaceFacetFragment2.E1();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(marketplaceFacetFragment2);
                                    Object objG = composer2.G();
                                    Object obj5 = Composer.Companion.f1624a;
                                    if (zI || objG == obj5) {
                                        objG = new g(marketplaceFacetFragment2, 2);
                                        composer2.A(objG);
                                    }
                                    Function0 function0 = (Function0) objG;
                                    composer2.l();
                                    composer2.o(5004770);
                                    boolean zI2 = composer2.I(marketplaceFacetFragment2);
                                    Object objG2 = composer2.G();
                                    if (zI2 || objG2 == obj5) {
                                        objG2 = new Function1() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.j
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj6) {
                                                String it = (String) obj6;
                                                Intrinsics.h(it, "it");
                                                MarketplaceFacetViewModel marketplaceFacetViewModelE12 = marketplaceFacetFragment2.E1();
                                                BuildersKt.c(ViewModelKt.a(marketplaceFacetViewModelE12), null, null, new MarketplaceFacetViewModel$fetchMarketplace$1(marketplaceFacetViewModelE12, false, it, null), 3);
                                                return Unit.f24250a;
                                            }
                                        };
                                        composer2.A(objG2);
                                    }
                                    composer2.l();
                                    FacetScreenKt.b(viewState, marketplaceFacetViewModelE1, function0, (Function1) objG2, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 868227108));
            return composeView;
        }
        int i = FragmentMarketplaceFacetBinding.F;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentMarketplaceFacetBinding fragmentMarketplaceFacetBinding = (FragmentMarketplaceFacetBinding) ViewDataBinding.q(inflater, R.layout.fragment_marketplace_facet, viewGroup, false, null);
        this.f = fragmentMarketplaceFacetBinding;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new MarketplaceFacetFragment$onCreateView$3$1(this, null), 3);
        View view = fragmentMarketplaceFacetBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        if (!((Boolean) this.e.getD()).booleanValue()) {
            FragmentMarketplaceFacetBinding fragmentMarketplaceFacetBinding = this.f;
            Intrinsics.e(fragmentMarketplaceFacetBinding);
            SearchView searchView = fragmentMarketplaceFacetBinding.z;
            EpoxyRecyclerView epoxyRecyclerView = fragmentMarketplaceFacetBinding.y;
            epoxyRecyclerView.setController((MarketplaceFacetEpoxyController) this.g.getD());
            epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.h
                @Override // androidx.appcompat.widget.SearchView.OnCloseListener
                public final void onClose() {
                    MarketplaceFacetViewModel marketplaceFacetViewModelE1 = this.f7490a.E1();
                    marketplaceFacetViewModelE1.t6(marketplaceFacetViewModelE1.h, SearchBarViewState.Inactive.d);
                }
            });
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.MarketplaceFacetFragment$onViewCreated$1$2
                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                public final boolean onQueryTextChange(String str) {
                    MarketplaceFacetViewModel marketplaceFacetViewModelE1 = this.d.E1();
                    BuildersKt.c(ViewModelKt.a(marketplaceFacetViewModelE1), null, null, new MarketplaceFacetViewModel$fetchMarketplace$1(marketplaceFacetViewModelE1, false, str, null), 3);
                    return true;
                }

                @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
                public final boolean onQueryTextSubmit(String str) {
                    return false;
                }
            });
            fragmentMarketplaceFacetBinding.A.setOnClickListener(new View.OnClickListener() { // from class: au.com.woolworths.feature.shop.marketplace.ui.facet.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MarketplaceFacetFragment marketplaceFacetFragment = this.d;
                    Callback.g(view2);
                    try {
                        MarketplaceFacetViewModel marketplaceFacetViewModelE1 = marketplaceFacetFragment.E1();
                        marketplaceFacetViewModelE1.t6(marketplaceFacetViewModelE1.h, SearchBarViewState.Active.d);
                    } finally {
                        Callback.h();
                    }
                }
            });
        }
        MarketplaceFacetViewModel marketplaceFacetViewModelE1 = E1();
        BuildersKt.c(ViewModelKt.a(marketplaceFacetViewModelE1), null, null, new MarketplaceFacetViewModel$fetchMarketplace$1(marketplaceFacetViewModelE1, true, null, null), 3);
    }
}
