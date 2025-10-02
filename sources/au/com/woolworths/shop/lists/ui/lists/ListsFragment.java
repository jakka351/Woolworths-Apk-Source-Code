package au.com.woolworths.shop.lists.ui.lists;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.lists.ShoppingListsFeature;
import au.com.woolworths.shop.lists.databinding.FragmentListsBinding;
import au.com.woolworths.shop.lists.ui.lists.ListsContract;
import au.com.woolworths.shop.lists.ui.lists.ListsFragment;
import au.com.woolworths.shop.lists.ui.utils.ListsUtils;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.salesforce.marketingcloud.UrlHandler;
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
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsFragment extends Hilt_ListsFragment {
    public final AutoClearedValue i = new AutoClearedValue(this);
    public final ViewModelLazy j;
    public Function0 k;
    public final Lazy l;
    public static final /* synthetic */ KProperty[] n = {Reflection.f24268a.e(new MutablePropertyReference1Impl(ListsFragment.class, "fragmentBinding", "getFragmentBinding()Lau/com/woolworths/shop/lists/databinding/FragmentListsBinding;", 0))};
    public static final Companion m = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/ListsFragment$Companion;", "", "", "SUGGESTED_LISTS_TAB_INDEX", "I", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.ListsFragment$onCreate$1", f = "ListsFragment.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.lists.ListsFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/shop/lists/ui/lists/ListsContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.ListsFragment$onCreate$1$1", f = "ListsFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.lists.ui.lists.ListsFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C02511 extends SuspendLambda implements Function2<ListsContract.Action, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ListsFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02511(ListsFragment listsFragment, Continuation continuation) {
                super(2, continuation);
                this.q = listsFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02511 c02511 = new C02511(this.q, continuation);
                c02511.p = obj;
                return c02511;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02511 c02511 = (C02511) create((ListsContract.Action) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02511.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ListsContract.Action action = (ListsContract.Action) this.p;
                if (!(action instanceof ListsContract.Action.ShowInstorePrompt)) {
                    Companion companion = ListsFragment.m;
                    throw new NoWhenBranchMatchedException();
                }
                ListsFragment listsFragment = this.q;
                Function0 function0 = listsFragment.k;
                if (function0 != null) {
                    function0.invoke();
                }
                FragmentActivity fragmentActivityRequireActivity = listsFragment.requireActivity();
                Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                listsFragment.k = InstorePresencePromptBottomSheetKt.f(fragmentActivityRequireActivity, ((ListsContract.Action.ShowInstorePrompt) action).f12321a, listsFragment.I1());
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ListsFragment.this.new AnonymousClass1(continuation);
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
                Companion companion = ListsFragment.m;
                ListsFragment listsFragment = ListsFragment.this;
                Flow flow = listsFragment.I1().n;
                Lifecycle d = listsFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02511(listsFragment, null), FlowExtKt.a(flow, d, Lifecycle.State.h));
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

    public ListsFragment() {
        final ListsFragment$special$$inlined$viewModels$default$1 listsFragment$special$$inlined$viewModels$default$1 = new ListsFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.lists.ListsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) listsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j = new ViewModelLazy(Reflection.f24268a.b(ListsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.lists.ListsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.lists.ui.lists.ListsFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.lists.ListsFragment$special$$inlined$viewModels$default$4
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
        this.l = LazyKt.b(new c(this, 17));
    }

    public final ListsViewModel I1() {
        return (ListsViewModel) this.j.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intent intent;
        TabLayout.Tab tabH;
        Intrinsics.h(inflater, "inflater");
        ViewDataBinding viewDataBindingC = DataBindingUtil.c(inflater, R.layout.fragment_lists, viewGroup, false, null);
        FragmentListsBinding fragmentListsBinding = (FragmentListsBinding) viewDataBindingC;
        fragmentListsBinding.L(I1());
        ViewPager2 viewPager2 = fragmentListsBinding.z;
        viewPager2.setAdapter((ListsPagerAdapter) this.l.getD());
        viewPager2.c(new ViewPager2.OnPageChangeCallback() { // from class: au.com.woolworths.shop.lists.ui.lists.ListsFragment$setupViewPager$1$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i) {
                ListsFragment.Companion companion = ListsFragment.m;
                this.f12322a.I1().e.c(((ListsContract.ListsTabsContent) ListsContract.ListsTabsContent.h.get(i)).a());
            }
        });
        ListsViewModel listsViewModelI1 = I1();
        viewPager2.setUserInputEnabled((listsViewModelI1.l.b() == Region.j || listsViewModelI1.k.c(ShoppingListsFeature.g)) ? false : true);
        TabLayout listsTabLayout = fragmentListsBinding.y;
        new TabLayoutMediator(listsTabLayout, viewPager2, new au.com.woolworths.product.details.epoxy.a(this, 8)).a();
        FragmentActivity activity = getActivity();
        if (activity != null && (intent = activity.getIntent()) != null) {
            Intrinsics.g(listsTabLayout, "listsTabLayout");
            boolean booleanExtra = intent.getBooleanExtra("is_deep_link_flag", false);
            String stringExtra = intent.getStringExtra("deep_link_uri");
            Boolean boolValueOf = stringExtra != null ? Boolean.valueOf(ListsUtils.Companion.a(stringExtra, "suggestedlists")) : null;
            if (booleanExtra && Intrinsics.c(boolValueOf, Boolean.TRUE) && (tabH = listsTabLayout.h(1)) != null) {
                listsTabLayout.l(tabH, true);
            }
        }
        Intrinsics.g(viewDataBindingC, "apply(...)");
        KProperty[] kPropertyArr = n;
        KProperty kProperty = kPropertyArr[0];
        AutoClearedValue autoClearedValue = this.i;
        autoClearedValue.b(this, kProperty, (FragmentListsBinding) viewDataBindingC);
        ListsViewModel listsViewModelI12 = I1();
        BuildersKt.c(ViewModelKt.a(listsViewModelI12), null, null, new ListsViewModel$refreshList$1(listsViewModelI12, null), 3);
        View view = ((FragmentListsBinding) autoClearedValue.getValue(this, kPropertyArr[0])).h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ListsViewModel listsViewModelI1 = I1();
        BuildersKt.c(ViewModelKt.a(listsViewModelI1), null, null, new ListsViewModel$trackScreen$1(listsViewModelI1, null), 3);
        BuildersKt.c(ViewModelKt.a(listsViewModelI1), null, null, new ListsViewModel$instoreCheck$1(listsViewModelI1, null), 3);
    }
}
