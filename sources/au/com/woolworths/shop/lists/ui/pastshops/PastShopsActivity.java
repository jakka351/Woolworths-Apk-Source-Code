package au.com.woolworths.shop.lists.ui.pastshops;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.network.ServerErrorException;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import au.com.woolworths.shop.lists.data.model.PurchaseHistoryEvent;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.databinding.ActivityPastShopsBinding;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.pastshops.PastShopsContract;
import au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions;
import au.com.woolworths.shop.lists.ui.pastshops.errors.PastShopsFullPageError;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PastShopsActivity extends Hilt_PastShopsActivity {
    public static final /* synthetic */ int C = 0;
    public PastShopsController A;
    public ActivityPastShopsBinding B;
    public CartUpdateInteractor x;
    public FeatureToggleManager y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(PastShopsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsActivity$Companion;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2", f = "PastShopsActivity.kt", l = {71}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$2, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02542 extends AdaptedFunctionReference implements Function2<PastShopsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                PastShopsContract.Actions actions = (PastShopsContract.Actions) obj;
                PastShopsActivity pastShopsActivity = (PastShopsActivity) this.d;
                int i = PastShopsActivity.C;
                pastShopsActivity.getClass();
                if (actions instanceof PastShopsContract.Actions.PastShopClicked) {
                    Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                    PurchaseHistoryEvent purchaseHistoryEvent = ((PastShopsContract.Actions.PastShopClicked) actions).f12365a;
                    intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(purchaseHistoryEvent.getTitle(), null), new Activities.ProductList.ExtrasByPastShop(purchaseHistoryEvent.getBasketId(), Activities.ProductList.ProductListType.s), (Activities.ProductList.ExtrasConfig) null, 12));
                    pastShopsActivity.startActivity(intentA);
                } else {
                    if (!(actions instanceof PastShopsContract.Actions.Retry)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    PastShopsController pastShopsController = pastShopsActivity.A;
                    if (pastShopsController == null) {
                        Intrinsics.p("pastShopsController");
                        throw null;
                    }
                    pastShopsController.retry();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return PastShopsActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = PastShopsActivity.C;
                final PastShopsActivity pastShopsActivity = PastShopsActivity.this;
                final Flow flow = pastShopsActivity.O4().j;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02542(2, pastShopsActivity, PastShopsActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/lists/ui/pastshops/PastShopsContract$Actions;)V", 4), new Flow<PastShopsContract.Actions>() { // from class: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ PastShopsActivity e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2", f = "PastShopsActivity.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, PastShopsActivity pastShopsActivity) {
                            this.d = flowCollector;
                            this.e = pastShopsActivity;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L52
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.shop.lists.ui.pastshops.PastShopsContract$Actions r6 = (au.com.woolworths.shop.lists.ui.pastshops.PastShopsContract.Actions) r6
                                au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity r6 = r4.e
                                androidx.lifecycle.Lifecycle r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.h
                                int r6 = r6.compareTo(r2)
                                if (r6 < 0) goto L52
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L52
                                return r1
                            L52:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity$onCreate$2$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pastShopsActivity), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
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

    public final PastShopsViewModel O4() {
        return (PastShopsViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.shop.lists.ui.pastshops.Hilt_PastShopsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityPastShopsBinding activityPastShopsBinding = (ActivityPastShopsBinding) DataBindingUtil.d(this, R.layout.activity_past_shops);
        activityPastShopsBinding.D(this);
        activityPastShopsBinding.L(O4());
        setSupportActionBar(activityPastShopsBinding.D);
        this.B = activityPastShopsBinding;
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.s(true);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        PastShopsController pastShopsController = new PastShopsController(O4());
        this.A = pastShopsController;
        pastShopsController.addLoadStateListener(new Function1() { // from class: au.com.woolworths.shop.lists.ui.pastshops.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CombinedLoadStates it = (CombinedLoadStates) obj;
                int i = PastShopsActivity.C;
                Intrinsics.h(it, "it");
                PastShopsActivity pastShopsActivity = this.d;
                PastShopsViewModel pastShopsViewModelO4 = pastShopsActivity.O4();
                LoadState state = it.f3529a;
                AnalyticsManager analyticsManager = pastShopsViewModelO4.f;
                MediatorLiveData mediatorLiveData = pastShopsViewModelO4.h;
                Intrinsics.h(state, "state");
                if (state instanceof LoadState.Loading) {
                    PastShopsViewModel.p6(pastShopsViewModelO4, mediatorLiveData, true, 0, null, 6);
                } else if (state instanceof LoadState.NotLoading) {
                    PastShopsContract.ViewState viewState = (PastShopsContract.ViewState) mediatorLiveData.e();
                    PastShopsViewModel.p6(pastShopsViewModelO4, mediatorLiveData, false, 0, (viewState != null ? viewState.b : 0) == 0 ? PastShopsFullPageError.f : null, 2);
                } else {
                    if (!(state instanceof LoadState.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable th = ((LoadState.Error) state).b;
                    if (th instanceof NoConnectivityException) {
                        analyticsManager.c(PastShopsActions.e);
                        PastShopsViewModel.p6(pastShopsViewModelO4, mediatorLiveData, false, 0, PastShopsFullPageError.e, 3);
                    } else {
                        if (!(th instanceof ServerErrorException)) {
                            throw new IllegalStateException("Unrecognized pagination error: " + th);
                        }
                        analyticsManager.c(PastShopsActions.f);
                        PastShopsViewModel.p6(pastShopsViewModelO4, mediatorLiveData, false, 0, PastShopsFullPageError.d, 3);
                    }
                }
                PastShopsController pastShopsController2 = pastShopsActivity.A;
                if (pastShopsController2 != null) {
                    pastShopsController2.setNetworkState(it.c);
                    return Unit.f24250a;
                }
                Intrinsics.p("pastShopsController");
                throw null;
            }
        });
        ActivityPastShopsBinding activityPastShopsBinding2 = this.B;
        if (activityPastShopsBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = activityPastShopsBinding2.B;
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(epoxyRecyclerView.getContext()));
        PastShopsController pastShopsController2 = this.A;
        if (pastShopsController2 == null) {
            Intrinsics.p("pastShopsController");
            throw null;
        }
        epoxyRecyclerView.setController(pastShopsController2);
        LifecycleOwnerKt.a(this).c(new PastShopsActivity$bindViewModel$1(this, null));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_cart_and_search, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        CartUpdateInteractor cartUpdateInteractor = this.x;
        if (cartUpdateInteractor == null) {
            Intrinsics.p("cartUpdateInteractor");
            throw null;
        }
        menuItemFindItem.setVisible(cartUpdateInteractor.b.z());
        View actionView = menuItemFindItem.getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
        cartBadgeActionView.setAnalyticsScreen(new ListScreen.PastShopsList());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 16908332) {
                finish();
            } else if (itemId == R.id.search) {
                O4().f.c(PastShopsActions.i);
                startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = O4().f;
        ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
        analyticsManager.a(new ListScreen.PastShopsList());
    }
}
