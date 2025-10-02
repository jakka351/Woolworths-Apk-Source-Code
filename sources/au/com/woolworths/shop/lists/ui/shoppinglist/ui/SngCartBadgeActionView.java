package au.com.woolworths.shop.lists.ui.shoppinglist.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ActionMenuView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.utils.Extensions;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener;
import au.com.woolworths.base.shopapp.cartbadge.CartItemCount;
import au.com.woolworths.base.shopapp.databinding.MenuCartBadgeBinding;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/ui/SngCartBadgeActionView;", "Landroid/widget/ActionMenuView;", "Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeClickListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "cartItemCount", "", "setCartBadgeCount$shop_lists_release", "(I)V", "setCartBadgeCount", "e", "Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeClickListener;", "getCartBadgeClickListener", "()Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeClickListener;", "setCartBadgeClickListener", "(Lau/com/woolworths/base/shopapp/cartbadge/CartBadgeClickListener;)V", "cartBadgeClickListener", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SngCartBadgeActionView extends ActionMenuView implements CartBadgeClickListener {
    public final MenuCartBadgeBinding d;

    /* renamed from: e, reason: from kotlin metadata */
    public CartBadgeClickListener cartBadgeClickListener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SngCartBadgeActionView(@NotNull Context context) {
        this(context, null);
        Intrinsics.h(context, "context");
    }

    @Override // au.com.woolworths.base.shopapp.cartbadge.CartBadgeClickListener
    public final void Q() {
        getCartBadgeClickListener().Q();
    }

    @NotNull
    public final CartBadgeClickListener getCartBadgeClickListener() {
        CartBadgeClickListener cartBadgeClickListener = this.cartBadgeClickListener;
        if (cartBadgeClickListener != null) {
            return cartBadgeClickListener;
        }
        Intrinsics.p("cartBadgeClickListener");
        throw null;
    }

    public final void setCartBadgeClickListener(@NotNull CartBadgeClickListener cartBadgeClickListener) {
        Intrinsics.h(cartBadgeClickListener, "<set-?>");
        this.cartBadgeClickListener = cartBadgeClickListener;
    }

    public final void setCartBadgeCount$shop_lists_release(int cartItemCount) {
        Context context = getContext();
        Intrinsics.g(context, "getContext(...)");
        CartItemCount cartItemCountA = CartBadgeActionView.Companion.a(cartItemCount, context);
        MenuCartBadgeBinding menuCartBadgeBinding = this.d;
        menuCartBadgeBinding.A.setTextSize(cartItemCountA.f4614a / getResources().getDisplayMetrics().scaledDensity);
        menuCartBadgeBinding.A.setText(cartItemCountA.b);
        menuCartBadgeBinding.h.setContentDescription(getContext().getResources().getQuantityString(R.plurals.cart_menu_item_content_description, cartItemCount, Integer.valueOf(cartItemCount)));
        menuCartBadgeBinding.l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SngCartBadgeActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i = MenuCartBadgeBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        MenuCartBadgeBinding menuCartBadgeBinding = (MenuCartBadgeBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.menu_cart_badge, this, true, null);
        Intrinsics.g(menuCartBadgeBinding, "inflate(...)");
        this.d = menuCartBadgeBinding;
        Context context2 = getContext();
        Intrinsics.g(context2, "getContext(...)");
        int iA = Extensions.a(R.attr.colorPrimary, context2);
        menuCartBadgeBinding.A.setTextColor(iA);
        menuCartBadgeBinding.z.setImageTintList(ColorStateList.valueOf(iA));
        menuCartBadgeBinding.L(this);
    }
}
