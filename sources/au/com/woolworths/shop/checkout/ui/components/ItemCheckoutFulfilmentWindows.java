package au.com.woolworths.shop.checkout.ui.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsListener;
import com.airbnb.epoxy.CallbackProp;
import com.airbnb.epoxy.ModelView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import shop.checkout.ItemCheckoutFulfilmentWindowsBinding;

@StabilityInferred
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\"\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/components/ItemCheckoutFulfilmentWindows;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "f", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindows;", "g", "Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindows;", "getFulfilmentWindows", "()Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindows;", "setFulfilmentWindows", "(Lau/com/woolworths/shop/checkout/domain/model/FulfilmentWindows;)V", "fulfilmentWindows", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;", "value", "h", "Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;", "getListener", "()Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;", "setListener", "(Lau/com/woolworths/shop/checkout/ui/listener/FulfilmentWindowsListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@ModelView
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ItemCheckoutFulfilmentWindows extends LinearLayout {
    public static final /* synthetic */ int i = 0;
    public final ItemCheckoutFulfilmentWindowsBinding d;
    public final LinearLayoutManager e;

    /* renamed from: f, reason: from kotlin metadata */
    public String title;

    /* renamed from: g, reason: from kotlin metadata */
    public FulfilmentWindows fulfilmentWindows;

    /* renamed from: h, reason: from kotlin metadata */
    public FulfilmentWindowsListener listener;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ItemCheckoutFulfilmentWindows(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    @NotNull
    public final FulfilmentWindows getFulfilmentWindows() {
        FulfilmentWindows fulfilmentWindows = this.fulfilmentWindows;
        if (fulfilmentWindows != null) {
            return fulfilmentWindows;
        }
        Intrinsics.p("fulfilmentWindows");
        throw null;
    }

    @Nullable
    public final FulfilmentWindowsListener getListener() {
        return this.listener;
    }

    @NotNull
    public final String getTitle() {
        String str = this.title;
        if (str != null) {
            return str;
        }
        Intrinsics.p("title");
        throw null;
    }

    public final void setFulfilmentWindows(@NotNull FulfilmentWindows fulfilmentWindows) {
        Intrinsics.h(fulfilmentWindows, "<set-?>");
        this.fulfilmentWindows = fulfilmentWindows;
    }

    @CallbackProp
    public final void setListener(@Nullable FulfilmentWindowsListener fulfilmentWindowsListener) {
        this.listener = fulfilmentWindowsListener;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.h(str, "<set-?>");
        this.title = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ItemCheckoutFulfilmentWindows(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ ItemCheckoutFulfilmentWindows(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ItemCheckoutFulfilmentWindows(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.h(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i3 = ItemCheckoutFulfilmentWindowsBinding.A;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ItemCheckoutFulfilmentWindowsBinding itemCheckoutFulfilmentWindowsBinding = (ItemCheckoutFulfilmentWindowsBinding) ViewDataBinding.q(layoutInflaterFrom, R.layout.item_checkout_fulfillment_windows, this, true, null);
        Intrinsics.g(itemCheckoutFulfilmentWindowsBinding, "inflate(...)");
        this.d = itemCheckoutFulfilmentWindowsBinding;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(0);
        this.e = linearLayoutManager;
        setOrientation(1);
        itemCheckoutFulfilmentWindowsBinding.y.setLayoutManager(linearLayoutManager);
    }
}
