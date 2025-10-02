package au.com.woolworths.feature.shop.myorders.details.help;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ActionMenuView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.databinding.MenuItemHelpBinding;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bR.\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView;", "Landroid/widget/ActionMenuView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;", "value", "e", "Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;", "getClickHandler", "()Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;", "setClickHandler", "(Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;)V", "clickHandler", "ClickHandler", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HelpActionView extends ActionMenuView {
    public final MenuItemHelpBinding d;

    /* renamed from: e, reason: from kotlin metadata */
    public ClickHandler clickHandler;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/help/HelpActionView$ClickHandler;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ClickHandler {
        void h5();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpActionView(@NotNull Context context) {
        super(context);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = MenuItemHelpBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        MenuItemHelpBinding menuItemHelpBinding = (MenuItemHelpBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.menu_item_help, this, true, null);
        Intrinsics.g(menuItemHelpBinding, "inflate(...)");
        this.d = menuItemHelpBinding;
    }

    @Nullable
    public final ClickHandler getClickHandler() {
        return this.clickHandler;
    }

    public final void setClickHandler(@Nullable ClickHandler clickHandler) {
        this.clickHandler = clickHandler;
        this.d.L(clickHandler);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpActionView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i = MenuItemHelpBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        MenuItemHelpBinding menuItemHelpBinding = (MenuItemHelpBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.menu_item_help, this, true, null);
        Intrinsics.g(menuItemHelpBinding, "inflate(...)");
        this.d = menuItemHelpBinding;
    }
}
