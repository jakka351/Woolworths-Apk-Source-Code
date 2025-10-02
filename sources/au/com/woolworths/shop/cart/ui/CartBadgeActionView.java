package au.com.woolworths.shop.cart.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeActionContract;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeActions;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener;
import au.com.woolworths.base.shopapp.cartbadge.CartItemCount;
import au.com.woolworths.base.shopapp.databinding.MenuCartBadgeBinding;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.concurrent.CancellationException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010-\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010$\u001a\u0004\b+\u0010&\"\u0004\b,\u0010(R\u0014\u00101\u001a\u00020.8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartBadgeActionView;", "Landroid/widget/ActionMenuView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "cartItemCount", "", "setCartBadgeCount", "(I)V", "Lau/com/woolworths/shop/cart/ui/CartBadgeActionViewModel;", "f", "Lkotlin/Lazy;", "getCartBadgeActionViewModel", "()Lau/com/woolworths/shop/cart/ui/CartBadgeActionViewModel;", "cartBadgeActionViewModel", "Lau/com/woolworths/android/onesite/analytics/Screen;", "h", "Lau/com/woolworths/android/onesite/analytics/Screen;", "getAnalyticsScreen", "()Lau/com/woolworths/android/onesite/analytics/Screen;", "setAnalyticsScreen", "(Lau/com/woolworths/android/onesite/analytics/Screen;)V", "analyticsScreen", "Landroidx/lifecycle/Observer;", "i", "Landroidx/lifecycle/Observer;", "getObserver", "()Landroidx/lifecycle/Observer;", "observer", "Lkotlinx/coroutines/Job;", "j", "Lkotlinx/coroutines/Job;", "getViewStateJob", "()Lkotlinx/coroutines/Job;", "setViewStateJob", "(Lkotlinx/coroutines/Job;)V", "viewStateJob", "k", "getActionJob", "setActionJob", "actionJob", "Landroidx/activity/ComponentActivity;", "getActivity$shop_cart_release", "()Landroidx/activity/ComponentActivity;", "activity", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartBadgeActionView extends Hilt_CartBadgeActionView {
    public static final /* synthetic */ int l = 0;
    public final ViewModelLazy f;
    public final MenuCartBadgeBinding g;

    /* renamed from: h, reason: from kotlin metadata */
    public Screen analyticsScreen;

    /* renamed from: i, reason: from kotlin metadata */
    public final Observer observer;

    /* renamed from: j, reason: from kotlin metadata */
    public Job viewStateJob;

    /* renamed from: k, reason: from kotlin metadata */
    public Job actionJob;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartBadgeActionView$Companion;", "", "", "MAX_COUNT_FOR_OVERLINE", "I", "MIN_COUNT_FOR_SMALL_FONT", "MIN_COUNT_FOR_BULLET_TEXT", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static CartItemCount a(int i, Context context) throws Resources.NotFoundException {
            float dimension;
            String strValueOf = String.valueOf(i);
            if (i >= 0 && i < 100) {
                dimension = context.getResources().getDimension(R.dimen.t_overline);
            } else if (100 <= i && i < 1000) {
                dimension = context.getResources().getDimension(R.dimen.cart_badge_min_text_size);
            } else if (999 > i || i > Integer.MAX_VALUE) {
                dimension = BitmapDescriptorFactory.HUE_RED;
            } else {
                dimension = context.getResources().getDimension(R.dimen.t_overline);
                strValueOf = context.getString(R.string.cart_bullets);
                Intrinsics.g(strValueOf, "getString(...)");
            }
            return new CartItemCount(dimension, strValueOf);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartBadgeActionView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        if (!isInEditMode() && !this.e) {
            this.e = true;
            ((CartBadgeActionView_GeneratedInjector) t3()).getClass();
        }
        au.com.woolworths.feature.shop.myorders.details.infomodal.a aVar = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 29);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView$special$$inlined$viewModels$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a(this.d);
                if (viewModelStoreOwnerA != null) {
                    return viewModelStoreOwnerA;
                }
                throw new IllegalArgumentException("View needs to be attached to an activity or fragment first");
            }
        });
        this.f = new ViewModelLazy(Reflection.f24268a.b(CartBadgeActionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView$special$$inlined$viewModels$default$2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, aVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView$special$$inlined$viewModels$default$3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.observer = new androidx.compose.runtime.livedata.a(this, 4);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = MenuCartBadgeBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        MenuCartBadgeBinding menuCartBadgeBinding = (MenuCartBadgeBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.menu_cart_badge, this, true, null);
        Intrinsics.g(menuCartBadgeBinding, "inflate(...)");
        this.g = menuCartBadgeBinding;
        menuCartBadgeBinding.L(new CartBadgeClickListener() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView.1
            @Override // au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener
            public final void Q() {
                CartBadgeActionView cartBadgeActionView = CartBadgeActionView.this;
                CartBadgeActionViewModel cartBadgeActionViewModel = cartBadgeActionView.getCartBadgeActionViewModel();
                Screen analyticsScreen = cartBadgeActionView.getAnalyticsScreen();
                if (analyticsScreen != null) {
                    cartBadgeActionViewModel.getClass();
                    CartBadgeActions cartBadgeActions = CartBadgeActions.e;
                    cartBadgeActions.getClass();
                    cartBadgeActions.d = analyticsScreen;
                    cartBadgeActionViewModel.f.c(cartBadgeActions);
                }
                cartBadgeActionViewModel.g.f(CartBadgeActionContract.Actions.LaunchCart.f4613a);
            }
        });
    }

    public static void a(CartBadgeActionView cartBadgeActionView, int i) {
        cartBadgeActionView.setCartBadgeCount(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartBadgeActionViewModel getCartBadgeActionViewModel() {
        return (CartBadgeActionViewModel) this.f.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCartBadgeCount(int cartItemCount) throws Resources.NotFoundException {
        Context context = getContext();
        Intrinsics.g(context, "getContext(...)");
        CartItemCount cartItemCountA = Companion.a(cartItemCount, context);
        MenuCartBadgeBinding menuCartBadgeBinding = this.g;
        menuCartBadgeBinding.A.setTextSize(cartItemCountA.f4614a / getResources().getDisplayMetrics().scaledDensity);
        TextView cartLabel = menuCartBadgeBinding.A;
        Intrinsics.g(cartLabel, "cartLabel");
        String str = cartItemCountA.b;
        if (str != null) {
            cartLabel.setText(Html.fromHtml(str, 0));
        }
        menuCartBadgeBinding.h.setContentDescription(getContext().getResources().getQuantityString(R.plurals.cart_menu_item_content_description, cartItemCount, Integer.valueOf(cartItemCount)));
        menuCartBadgeBinding.l();
    }

    @Nullable
    public final Job getActionJob() {
        return this.actionJob;
    }

    @NotNull
    public final ComponentActivity getActivity$shop_cart_release() {
        Context context = getContext();
        Intrinsics.g(context, "getContext(...)");
        return ContextExtKt.b(context);
    }

    @Nullable
    public final Screen getAnalyticsScreen() {
        return this.analyticsScreen;
    }

    @NotNull
    public final Observer<Integer> getObserver() {
        return this.observer;
    }

    @Nullable
    public final Job getViewStateJob() {
        return this.viewStateJob;
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            if (i != 8) {
                return;
            }
            Job job = this.actionJob;
            if (job != null) {
                job.cancel((CancellationException) null);
            }
            this.actionJob = null;
            Job job2 = this.viewStateJob;
            if (job2 != null) {
                job2.cancel((CancellationException) null);
            }
            this.viewStateJob = null;
            return;
        }
        Job job3 = this.actionJob;
        if (job3 != null) {
            job3.cancel((CancellationException) null);
        }
        Job job4 = this.viewStateJob;
        if (job4 != null) {
            job4.cancel((CancellationException) null);
        }
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        if (lifecycleOwnerA != null) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplA = LifecycleOwnerKt.a(lifecycleOwnerA);
            this.actionJob = FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CartBadgeActionView$launchActionsHandler$1(this, null), getCartBadgeActionViewModel().i), lifecycleCoroutineScopeImplA);
            this.viewStateJob = FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new CartBadgeActionView$launchViewStateHandler$1(this, null), getCartBadgeActionViewModel().h), lifecycleCoroutineScopeImplA);
        }
    }

    public final void setActionJob(@Nullable Job job) {
        this.actionJob = job;
    }

    public final void setAnalyticsScreen(@Nullable Screen screen) {
        this.analyticsScreen = screen;
    }

    public final void setViewStateJob(@Nullable Job job) {
        this.viewStateJob = job;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartBadgeActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        if (!isInEditMode() && !this.e) {
            this.e = true;
            ((CartBadgeActionView_GeneratedInjector) t3()).getClass();
        }
        au.com.woolworths.feature.shop.myorders.details.infomodal.a aVar = new au.com.woolworths.feature.shop.myorders.details.infomodal.a(this, 29);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView$special$$inlined$viewModels$default$4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a(this.d);
                if (viewModelStoreOwnerA != null) {
                    return viewModelStoreOwnerA;
                }
                throw new IllegalArgumentException("View needs to be attached to an activity or fragment first");
            }
        });
        this.f = new ViewModelLazy(Reflection.f24268a.b(CartBadgeActionViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView$special$$inlined$viewModels$default$5
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, aVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView$special$$inlined$viewModels$default$6
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.observer = new androidx.compose.runtime.livedata.a(this, 4);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = MenuCartBadgeBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        MenuCartBadgeBinding menuCartBadgeBinding = (MenuCartBadgeBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.menu_cart_badge, this, true, null);
        Intrinsics.g(menuCartBadgeBinding, "inflate(...)");
        this.g = menuCartBadgeBinding;
        menuCartBadgeBinding.L(new CartBadgeClickListener() { // from class: au.com.woolworths.shop.cart.ui.CartBadgeActionView.1
            @Override // au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener
            public final void Q() {
                CartBadgeActionView cartBadgeActionView = CartBadgeActionView.this;
                CartBadgeActionViewModel cartBadgeActionViewModel = cartBadgeActionView.getCartBadgeActionViewModel();
                Screen analyticsScreen = cartBadgeActionView.getAnalyticsScreen();
                if (analyticsScreen != null) {
                    cartBadgeActionViewModel.getClass();
                    CartBadgeActions cartBadgeActions = CartBadgeActions.e;
                    cartBadgeActions.getClass();
                    cartBadgeActions.d = analyticsScreen;
                    cartBadgeActionViewModel.f.c(cartBadgeActions);
                }
                cartBadgeActionViewModel.g.f(CartBadgeActionContract.Actions.LaunchCart.f4613a);
            }
        });
    }
}
