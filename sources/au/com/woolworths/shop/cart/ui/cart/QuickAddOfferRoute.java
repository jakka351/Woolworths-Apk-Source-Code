package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/QuickAddOfferRoute;", "", "Companion", "$serializer", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class QuickAddOfferRoute {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final String f10498a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/QuickAddOfferRoute$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/shop/cart/ui/cart/QuickAddOfferRoute;", "serializer", "()Lkotlinx/serialization/KSerializer;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<QuickAddOfferRoute> serializer() {
            return QuickAddOfferRoute$$serializer.f10499a;
        }
    }

    public /* synthetic */ QuickAddOfferRoute(int i, String str) {
        if (1 == (i & 1)) {
            this.f10498a = str;
        } else {
            PluginExceptionsKt.a(i, 1, QuickAddOfferRoute$$serializer.f10499a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuickAddOfferRoute) && Intrinsics.c(this.f10498a, ((QuickAddOfferRoute) obj).f10498a);
    }

    public final int hashCode() {
        return this.f10498a.hashCode();
    }

    public final String toString() {
        return YU.a.h("QuickAddOfferRoute(promotionId=", this.f10498a, ")");
    }

    public QuickAddOfferRoute(String str) {
        this.f10498a = str;
    }
}
