package au.com.woolworths.feature.shop.haveyouforgotten;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.local.ProductListAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.ProductListFragment;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.feature.shop.contentpage.ContentPageFragment;
import au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenContract;
import au.com.woolworths.feature.shop.haveyouforgotten.databinding.ActivityHaveYouForgottenBinding;
import au.com.woolworths.foundation.shop.cart.data.model.CartFooterData;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import au.com.woolworths.shop.cart.ui.shared.CartFooterKt;
import au.com.woolworths.shop.cart.ui.shared.FooterSource;
import com.dynatrace.android.callback.Callback;
import com.salesforce.marketingcloud.UrlHandler;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Companion", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class HaveYouForgottenActivity extends Hilt_HaveYouForgottenActivity implements AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int C = 0;
    public final ViewModelLazy A;
    public final ViewModelLazy B;
    public ShopAppNavigator x;
    public AnalyticsManager y;
    public ActivityHaveYouForgottenBinding z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenActivity$Companion;", "", "", "REQUEST_CHECKOUT", "I", "have-you-forgotten_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$2", f = "HaveYouForgottenActivity.kt", l = {76}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$2$1", f = "HaveYouForgottenActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<HaveYouForgottenContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ HaveYouForgottenActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HaveYouForgottenActivity haveYouForgottenActivity, Continuation continuation) {
                super(2, continuation);
                this.q = haveYouForgottenActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((HaveYouForgottenContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                HaveYouForgottenContract.Actions actions = (HaveYouForgottenContract.Actions) this.p;
                int i = HaveYouForgottenActivity.C;
                if (!Intrinsics.c(actions, HaveYouForgottenContract.Actions.LaunchCheckout.f7149a)) {
                    throw new NoWhenBranchMatchedException();
                }
                HaveYouForgottenActivity haveYouForgottenActivity = this.q;
                AnalyticsManager analyticsManager = haveYouForgottenActivity.y;
                if (analyticsManager == null) {
                    Intrinsics.p("analyticsManager");
                    throw null;
                }
                analyticsManager.g(ProductListAnalytics.ProductList.Action.e);
                if (haveYouForgottenActivity.x != null) {
                    haveYouForgottenActivity.startActivityForResult(ActivityNavigatorKt.a(Activities.CheckoutActivity.f4457a, ApplicationType.e), 20211013);
                    return Unit.f24250a;
                }
                Intrinsics.p("shopAppNavigator");
                throw null;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HaveYouForgottenActivity.this.new AnonymousClass2(continuation);
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
                int i2 = HaveYouForgottenActivity.C;
                HaveYouForgottenActivity haveYouForgottenActivity = HaveYouForgottenActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(haveYouForgottenActivity, null), FlowExtKt.a(haveYouForgottenActivity.O4().i, haveYouForgottenActivity.getD(), Lifecycle.State.h));
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$5", f = "HaveYouForgottenActivity.kt", l = {115}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$5, reason: invalid class name */
    final class AnonymousClass5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/haveyouforgotten/HaveYouForgottenContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$5$1", f = "HaveYouForgottenActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$onCreate$5$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<HaveYouForgottenContract.ViewState, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ HaveYouForgottenActivity q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HaveYouForgottenActivity haveYouForgottenActivity, Continuation continuation) {
                super(2, continuation);
                this.q = haveYouForgottenActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((HaveYouForgottenContract.ViewState) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                final CartFooterData cartFooterData = ((HaveYouForgottenContract.ViewState) this.p).f7150a;
                final HaveYouForgottenActivity haveYouForgottenActivity = this.q;
                ActivityHaveYouForgottenBinding activityHaveYouForgottenBinding = haveYouForgottenActivity.z;
                if (activityHaveYouForgottenBinding == null) {
                    Intrinsics.p("binding");
                    throw null;
                }
                ComposeView composeView = activityHaveYouForgottenBinding.y;
                Intrinsics.e(composeView);
                ViewExtKt.a(composeView);
                composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
                composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$updateFooter$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        Composer composer = (Composer) obj2;
                        if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            final CartFooterData cartFooterData2 = cartFooterData;
                            final HaveYouForgottenActivity haveYouForgottenActivity2 = haveYouForgottenActivity;
                            ThemeKt.b(6, composer, ComposableLambdaKt.c(-2011200565, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$updateFooter$1$1.1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    Composer composer2 = (Composer) obj4;
                                    if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        FooterSource footerSource = FooterSource.e;
                                        composer2.o(5004770);
                                        final HaveYouForgottenActivity haveYouForgottenActivity3 = haveYouForgottenActivity2;
                                        boolean zI = composer2.I(haveYouForgottenActivity3);
                                        Object objG = composer2.G();
                                        if (zI || objG == Composer.Companion.f1624a) {
                                            objG = new Function0() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.b
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    int i = HaveYouForgottenActivity.C;
                                                    haveYouForgottenActivity3.O4().h.f(HaveYouForgottenContract.Actions.LaunchCheckout.f7149a);
                                                    return Unit.f24250a;
                                                }
                                            };
                                            composer2.A(objG);
                                        }
                                        composer2.l();
                                        CartFooterKt.a(false, false, cartFooterData2, null, footerSource, false, (Function0) objG, composer2, 24630, 40);
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer));
                        }
                        return Unit.f24250a;
                    }
                }, true, -990415997));
                return Unit.f24250a;
            }
        }

        public AnonymousClass5(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return HaveYouForgottenActivity.this.new AnonymousClass5(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = HaveYouForgottenActivity.C;
                HaveYouForgottenActivity haveYouForgottenActivity = HaveYouForgottenActivity.this;
                StateFlow stateFlow = haveYouForgottenActivity.O4().k;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(haveYouForgottenActivity, null);
                this.p = 1;
                if (FlowKt.h(stateFlow, anonymousClass1, this) == coroutineSingletons) {
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

    public HaveYouForgottenActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.A = new ViewModelLazy(reflectionFactory.b(HaveYouForgottenViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.B = new ViewModelLazy(reflectionFactory.b(ProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a((ProductListViewModel) this.B.getD());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            ActivityHaveYouForgottenBinding activityHaveYouForgottenBinding = this.z;
            if (activityHaveYouForgottenBinding == null) {
                Intrinsics.p("binding");
                throw null;
            }
            View view = activityHaveYouForgottenBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            ListChangeEventKt.a(addToListSuccessEvent, this, view, false, 28);
        }
    }

    public final HaveYouForgottenViewModel O4() {
        return (HaveYouForgottenViewModel) this.A.getD();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 20211013) {
            if (i2 == -1) {
                setResult(-1);
            }
            finish();
        }
    }

    @Override // au.com.woolworths.feature.shop.haveyouforgotten.Hilt_HaveYouForgottenActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityHaveYouForgottenBinding activityHaveYouForgottenBinding = (ActivityHaveYouForgottenBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_have_you_forgotten);
        this.z = activityHaveYouForgottenBinding;
        if (activityHaveYouForgottenBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityHaveYouForgottenBinding.D(this);
        O4();
        ActivityHaveYouForgottenBinding activityHaveYouForgottenBinding2 = this.z;
        if (activityHaveYouForgottenBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityHaveYouForgottenBinding2.B);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
        if (getSupportFragmentManager().F(com.woolworths.R.id.fragment_container) == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            if (O4().g.b() == Region.j) {
                fragmentTransactionE.j(com.woolworths.R.id.fragment_container, ContentPageFragment.Companion.a(new ContentPageFragment.Extras(new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.e, "", getString(com.woolworths.R.string.have_you_forgotten_title))), false), null);
            } else {
                String string = getString(com.woolworths.R.string.have_you_forgotten_title);
                Intrinsics.g(string, "getString(...)");
                fragmentTransactionE.j(com.woolworths.R.id.fragment_container, ProductListFragment.Companion.a(new ProductListFragment.Extras(new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(string, null), Activities.ProductList.ExtrasByHaveYouForgotten.d, (Activities.ProductList.ExtrasConfig) null, 12))), null);
            }
            fragmentTransactionE.d();
        }
        getSupportFragmentManager().o0(this, new FragmentResultListener() { // from class: au.com.woolworths.feature.shop.haveyouforgotten.a
            @Override // androidx.fragment.app.FragmentResultListener
            public final void a(Bundle bundle2, String str) {
                int i = HaveYouForgottenActivity.C;
                HaveYouForgottenViewModel haveYouForgottenViewModelO4 = this.f7154a.O4();
                BuildersKt.c(ViewModelKt.a(haveYouForgottenViewModelO4), null, null, new HaveYouForgottenViewModel$fetchFooter$1(haveYouForgottenViewModelO4, null), 3);
            }
        });
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass5(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                AnalyticsManager analyticsManager = this.y;
                if (analyticsManager == null) {
                    Intrinsics.p("analyticsManager");
                    throw null;
                }
                analyticsManager.g(ProductListAnalytics.ProductList.Action.f);
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
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
        HaveYouForgottenViewModel haveYouForgottenViewModelO4 = O4();
        BuildersKt.c(ViewModelKt.a(haveYouForgottenViewModelO4), null, null, new HaveYouForgottenViewModel$fetchFooter$1(haveYouForgottenViewModelO4, null), 3);
    }
}
