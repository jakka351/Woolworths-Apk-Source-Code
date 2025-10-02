package au.com.woolworths.shop.cart.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.shop.cart.CartItemSectionMenuOptionBindingModel_;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lau/com/woolworths/shop/cart/ui/CartSectionOptionsEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/shop/cart/ui/CartSectionOptionsListener;", "<init>", "(Lau/com/woolworths/shop/cart/ui/CartSectionOptionsListener;)V", "buildModels", "", "sectionTitle", "isMarketplace", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class CartSectionOptionsEpoxyController extends Typed2EpoxyController<String, Boolean> {
    public static final int $stable = 8;

    @NotNull
    private final CartSectionOptionsListener listener;

    public CartSectionOptionsEpoxyController(@NotNull CartSectionOptionsListener listener) {
        Intrinsics.h(listener, "listener");
        this.listener = listener;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public void buildModels(@Nullable String sectionTitle, @Nullable Boolean isMarketplace) {
        if (sectionTitle == null || isMarketplace == null) {
            return;
        }
        CartItemSectionMenuOptionBindingModel_ cartItemSectionMenuOptionBindingModel_ = new CartItemSectionMenuOptionBindingModel_();
        cartItemSectionMenuOptionBindingModel_.r(Integer.valueOf(sectionTitle.hashCode()));
        Integer numValueOf = Integer.valueOf(R.drawable.ic_trash);
        cartItemSectionMenuOptionBindingModel_.t();
        cartItemSectionMenuOptionBindingModel_.n = numValueOf;
        cartItemSectionMenuOptionBindingModel_.t();
        cartItemSectionMenuOptionBindingModel_.p = sectionTitle;
        cartItemSectionMenuOptionBindingModel_.t();
        cartItemSectionMenuOptionBindingModel_.q = isMarketplace;
        ResWithArgText resWithArgText = new ResWithArgText(R.string.cart_section_dialog_option, sectionTitle);
        cartItemSectionMenuOptionBindingModel_.t();
        cartItemSectionMenuOptionBindingModel_.o = resWithArgText;
        CartSectionOptionsListener cartSectionOptionsListener = this.listener;
        cartItemSectionMenuOptionBindingModel_.t();
        cartItemSectionMenuOptionBindingModel_.r = cartSectionOptionsListener;
        add(cartItemSectionMenuOptionBindingModel_);
    }
}
