package au.com.woolworths.foundation.shop.editorder.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.foundation.shop.editorder.EditOrderEventHandler;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderBanner;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderDetails;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderStatus;
import au.com.woolworths.foundation.shop.editorder.databinding.IncludeEditOrderBannerBinding;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerContract;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010#\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$ViewState;", "viewState", "", "setData", "(Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerContract$ViewState;)V", "Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;", "eventHandler", "setEvenHandler", "(Lau/com/woolworths/foundation/shop/editorder/EditOrderEventHandler;)V", "Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerViewModel;", "d", "Lkotlin/Lazy;", "getViewModel", "()Lau/com/woolworths/foundation/shop/editorder/ui/EditOrderBannerViewModel;", "viewModel", "Landroidx/appcompat/app/AppCompatActivity;", "e", "getActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "activity", "Landroid/view/View;", "g", "Landroid/view/View;", "getStopButton", "()Landroid/view/View;", "stopButton", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class EditOrderBannerView extends FrameLayout {
    public static final /* synthetic */ int i = 0;
    public final ViewModelLazy d;

    /* renamed from: e, reason: from kotlin metadata */
    public final Lazy activity;
    public final IncludeEditOrderBannerBinding f;
    public final Button g;
    public EditOrderEventHandler h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EditOrderBannerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public static void a(EditOrderBannerView editOrderBannerView) {
        EditOrderEventHandler editOrderEventHandler = editOrderBannerView.h;
        if (editOrderEventHandler == null) {
            Intrinsics.p("eventHandler");
            throw null;
        }
        editOrderEventHandler.F4();
        EditOrderBannerViewModel viewModel = editOrderBannerView.getViewModel();
        EditOrderStatus editOrderStatus = (EditOrderStatus) viewModel.e.m().e();
        EditOrderDetails details = editOrderStatus != null ? editOrderStatus.getDetails() : null;
        if (details == null) {
            throw new IllegalArgumentException("Trying to cancel edit mode but we are not in edit mode");
        }
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new EditOrderBannerViewModel$cancelEditOrderMode$1(viewModel, details, null), 3);
    }

    public static final void d(EditOrderBannerView editOrderBannerView, EditOrderBannerContract.ViewState viewState) {
        EditOrderBanner banner;
        EditOrderEventHandler editOrderEventHandler = editOrderBannerView.h;
        EditOrderConfirmation confirmation = null;
        if (editOrderEventHandler == null) {
            Intrinsics.p("eventHandler");
            throw null;
        }
        editOrderEventHandler.k1();
        EditOrderBannerViewModel viewModel = editOrderBannerView.getViewModel();
        EditOrderStatus data = viewState.f8746a;
        viewModel.getClass();
        Intrinsics.h(data, "data");
        EditOrderDetails details = data.getDetails();
        if (details != null && (banner = details.getBanner()) != null) {
            confirmation = banner.getConfirmation();
        }
        if (confirmation == null) {
            throw new IllegalArgumentException("Unexpected NULL value for EditOrderConfirmation");
        }
        viewModel.h.k(new EditOrderBannerContract.Action.ShowDialog(confirmation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EditOrderBannerViewModel getViewModel() {
        return (EditOrderBannerViewModel) this.d.getD();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setData(EditOrderBannerContract.ViewState viewState) {
        EditOrderStatus editOrderStatus = viewState.f8746a;
        if (editOrderStatus == null) {
            setVisibility(8);
            return;
        }
        IncludeEditOrderBannerBinding includeEditOrderBannerBinding = this.f;
        includeEditOrderBannerBinding.L(editOrderStatus);
        includeEditOrderBannerBinding.A.setOnClickListener(new androidx.navigation.ui.a(15, this, viewState));
        setVisibility(0);
    }

    @NotNull
    public final AppCompatActivity getActivity() {
        return (AppCompatActivity) this.activity.getD();
    }

    @NotNull
    public final View getStopButton() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LifecycleOwner lifecycleOwnerA = ViewTreeLifecycleOwner.a(this);
        if (lifecycleOwnerA != null) {
            BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new EditOrderBannerView$onAttachedToWindow$1$1(this, lifecycleOwnerA, null), 3);
            BuildersKt.c(LifecycleOwnerKt.a(lifecycleOwnerA), null, null, new EditOrderBannerView$onAttachedToWindow$1$2(this, lifecycleOwnerA, null), 3);
        }
        EditOrderBannerViewModel viewModel = getViewModel();
        viewModel.getClass();
        BuildersKt.c(ViewModelKt.a(viewModel), null, null, new EditOrderBannerViewModel$initialise$1(viewModel, null), 3);
    }

    public final void setEvenHandler(@NotNull EditOrderEventHandler eventHandler) {
        Intrinsics.h(eventHandler, "eventHandler");
        this.h = eventHandler;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EditOrderBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ EditOrderBannerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EditOrderBannerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.h(context, "context");
        au.com.woolworths.feature.product.list.legacy.ui.a aVar = new au.com.woolworths.feature.product.list.legacy.ui.a(context, 4);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView$special$$inlined$viewModels$default$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwnerA = ViewTreeViewModelStoreOwner.a(this.d);
                if (viewModelStoreOwnerA != null) {
                    return viewModelStoreOwnerA;
                }
                throw new IllegalArgumentException("View needs to be attached to an activity or fragment first");
            }
        });
        this.d = new ViewModelLazy(Reflection.f24268a.b(EditOrderBannerViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView$special$$inlined$viewModels$default$2
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, aVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView$special$$inlined$viewModels$default$3
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.activity = LazyKt.b(new au.com.woolworths.feature.product.list.legacy.ui.a(context, 5));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i3 = IncludeEditOrderBannerBinding.D;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        IncludeEditOrderBannerBinding includeEditOrderBannerBinding = (IncludeEditOrderBannerBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.include_edit_order_banner, this, true, null);
        Intrinsics.g(includeEditOrderBannerBinding, "inflate(...)");
        this.f = includeEditOrderBannerBinding;
        Button stopButton = includeEditOrderBannerBinding.A;
        Intrinsics.g(stopButton, "stopButton");
        this.g = stopButton;
    }
}
