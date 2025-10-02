package au.com.woolworths.shop.lists.ui.lists.suggested;

import android.content.Context;
import android.content.Intent;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.paging.PagedList;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.databinding.FragmentSuggestedListsBinding;
import au.com.woolworths.shop.lists.ui.lists.compose.SuggestedListScreenKt;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsContract;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SuggestedListsFragment extends Hilt_SuggestedListsFragment {
    public static final /* synthetic */ KProperty[] m = {Reflection.f24268a.e(new MutablePropertyReference1Impl(SuggestedListsFragment.class, "fragmentBinding", "getFragmentBinding()Lau/com/woolworths/shop/lists/databinding/FragmentSuggestedListsBinding;", 0))};
    public FeatureToggleManager i;
    public final AutoClearedValue j = new AutoClearedValue(this);
    public final ViewModelLazy k;
    public final Lazy l;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1", f = "SuggestedListsFragment.kt", l = {55}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$2", f = "SuggestedListsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements Function2<SuggestedListsContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ SuggestedListsFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SuggestedListsFragment suggestedListsFragment, Continuation continuation) {
                super(2, continuation);
                this.q = suggestedListsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.q, continuation);
                anonymousClass2.p = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((SuggestedListsContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass2.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                SuggestedListsContract.Actions actions = (SuggestedListsContract.Actions) this.p;
                KProperty[] kPropertyArr = SuggestedListsFragment.m;
                if (!(actions instanceof SuggestedListsContract.Actions.LaunchSuggestedList)) {
                    throw new NoWhenBranchMatchedException();
                }
                SuggestedListItem suggestedListItem = ((SuggestedListsContract.Actions.LaunchSuggestedList) actions).f12349a;
                String name = suggestedListItem.getName();
                int id = suggestedListItem.getId();
                Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(new Activities.ProductList.ExtrasPageData(name, null), new Activities.ProductList.ExtrasBySuggestedLists(id, Activities.ProductList.ProductListType.F), (Activities.ProductList.ExtrasConfig) null, 12));
                this.q.startActivity(intentA);
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return SuggestedListsFragment.this.new AnonymousClass1(continuation);
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
                KProperty[] kPropertyArr = SuggestedListsFragment.m;
                final SuggestedListsFragment suggestedListsFragment = SuggestedListsFragment.this;
                final Flow flow = suggestedListsFragment.I1().j;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(suggestedListsFragment, null), new Flow<SuggestedListsContract.Actions>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ SuggestedListsFragment e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2", f = "SuggestedListsFragment.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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

                        public AnonymousClass2(FlowCollector flowCollector, SuggestedListsFragment suggestedListsFragment) {
                            this.d = flowCollector;
                            this.e = suggestedListsFragment;
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
                                boolean r0 = r6 instanceof au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L48
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsContract$Actions r6 = (au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsContract.Actions) r6
                                au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment r6 = r4.e
                                boolean r6 = r6.isResumed()
                                if (r6 == 0) goto L48
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L48
                                return r1
                            L48:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreate$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, suggestedListsFragment), continuation);
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

    public SuggestedListsFragment() {
        final SuggestedListsFragment$special$$inlined$viewModels$default$1 suggestedListsFragment$special$$inlined$viewModels$default$1 = new SuggestedListsFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) suggestedListsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k = new ViewModelLazy(Reflection.f24268a.b(SuggestedListsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.l = LazyKt.b(new Function0() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KProperty[] kPropertyArr = SuggestedListsFragment.m;
                return new SuggestedListsEpoxyController(new SuggestedListsFragment$epoxyController$2$1(1, this.d.I1(), SuggestedListsViewModel.class, "onSuggestedListItemClicked", "onSuggestedListItemClicked(Lau/com/woolworths/shop/lists/data/model/SuggestedListItem;)V", 0));
            }
        });
    }

    public final SuggestedListsViewModel I1() {
        return (SuggestedListsViewModel) this.k.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Intent intent;
        String stringExtra;
        String value;
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null && intent.getBooleanExtra("is_deep_link_flag", false) && (stringExtra = intent.getStringExtra("deep_link_uri")) != null) {
            SuggestedListsViewModel suggestedListsViewModelI1 = I1();
            if (ListsUtils.Companion.a(stringExtra, "suggestedlists")) {
                suggestedListsViewModelI1.g.getClass();
                if (ListsUtils.Companion.a(stringExtra, "suggestedlists")) {
                    UrlQuerySanitizer urlQuerySanitizer = new UrlQuerySanitizer();
                    urlQuerySanitizer.setAllowUnregisteredParamaters(true);
                    urlQuerySanitizer.parseUrl(stringExtra);
                    value = urlQuerySanitizer.getValue("id");
                } else {
                    value = null;
                }
                suggestedListsViewModelI1.q = value != null ? Integer.parseInt(value) : -1;
            }
        }
        SuggestedListsViewModel suggestedListsViewModelI12 = I1();
        BuildersKt.c(ViewModelKt.a(suggestedListsViewModelI12), null, null, new SuggestedListsViewModel$fetchSuggestedLists$1(suggestedListsViewModelI12, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FeatureToggleManager featureToggleManager = this.i;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        final int i = 1;
        final int i2 = 0;
        if (featureToggleManager.c(ShoppingListsFeature.h)) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreateView$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final SuggestedListsFragment suggestedListsFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-1723446545, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsFragment$onCreateView$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    KProperty[] kPropertyArr = SuggestedListsFragment.m;
                                    SuggestedListScreenKt.a(suggestedListsFragment.I1(), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1880108087));
            return composeView;
        }
        int i3 = FragmentSuggestedListsBinding.B;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentSuggestedListsBinding fragmentSuggestedListsBinding = (FragmentSuggestedListsBinding) ViewDataBinding.q(inflater, R.layout.fragment_suggested_lists, viewGroup, false, null);
        Intrinsics.g(fragmentSuggestedListsBinding, "inflate(...)");
        fragmentSuggestedListsBinding.D(getViewLifecycleOwner());
        fragmentSuggestedListsBinding.L(I1());
        fragmentSuggestedListsBinding.z.setController((SuggestedListsEpoxyController) this.l.getD());
        KProperty[] kPropertyArr = m;
        KProperty kProperty = kPropertyArr[0];
        AutoClearedValue autoClearedValue = this.j;
        autoClearedValue.b(this, kProperty, fragmentSuggestedListsBinding);
        SuggestedListsViewModel suggestedListsViewModelI1 = I1();
        suggestedListsViewModelI1.p.f(getViewLifecycleOwner(), new SuggestedListsFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.b
            public final /* synthetic */ SuggestedListsFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i2;
                Unit unit = Unit.f24250a;
                SuggestedListsFragment suggestedListsFragment = this.e;
                switch (i4) {
                    case 0:
                        KProperty[] kPropertyArr2 = SuggestedListsFragment.m;
                        ((SuggestedListsEpoxyController) suggestedListsFragment.l.getD()).setNetworkState((NetworkState) obj);
                        break;
                    default:
                        KProperty[] kPropertyArr3 = SuggestedListsFragment.m;
                        ((SuggestedListsEpoxyController) suggestedListsFragment.l.getD()).submitList((PagedList) obj);
                        break;
                }
                return unit;
            }
        }));
        suggestedListsViewModelI1.o.f(getViewLifecycleOwner(), new SuggestedListsFragment$sam$androidx_lifecycle_Observer$0(new Function1(this) { // from class: au.com.woolworths.shop.lists.ui.lists.suggested.b
            public final /* synthetic */ SuggestedListsFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i;
                Unit unit = Unit.f24250a;
                SuggestedListsFragment suggestedListsFragment = this.e;
                switch (i4) {
                    case 0:
                        KProperty[] kPropertyArr2 = SuggestedListsFragment.m;
                        ((SuggestedListsEpoxyController) suggestedListsFragment.l.getD()).setNetworkState((NetworkState) obj);
                        break;
                    default:
                        KProperty[] kPropertyArr3 = SuggestedListsFragment.m;
                        ((SuggestedListsEpoxyController) suggestedListsFragment.l.getD()).submitList((PagedList) obj);
                        break;
                }
                return unit;
            }
        }));
        suggestedListsViewModelI1.m.f(getViewLifecycleOwner(), new SuggestedListsFragment$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.shop.checkout.ui.timeselector.compose.dateselector.a(20)));
        View view = ((FragmentSuggestedListsBinding) autoClearedValue.getValue(this, kPropertyArr[0])).h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
