package au.com.woolworths.foundation.shop.nhp.ui.pp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/ui/pp/ProductCarouselSession;", "", "Companion", "$serializer", "nhp-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Serializable
/* loaded from: classes4.dex */
public final /* data */ class ProductCarouselSession {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8789a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/ui/pp/ProductCarouselSession$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lau/com/woolworths/foundation/shop/nhp/ui/pp/ProductCarouselSession;", "serializer", "()Lkotlinx/serialization/KSerializer;", "nhp-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ProductCarouselSession> serializer() {
            return ProductCarouselSession$$serializer.f8790a;
        }
    }

    public /* synthetic */ ProductCarouselSession(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f8789a = z;
        } else {
            PluginExceptionsKt.a(i, 1, ProductCarouselSession$$serializer.f8790a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductCarouselSession) && this.f8789a == ((ProductCarouselSession) obj).f8789a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8789a);
    }

    public final String toString() {
        return a.n("ProductCarouselSession(autoPlayEnabled=", ")", this.f8789a);
    }

    public ProductCarouselSession(boolean z) {
        this.f8789a = z;
    }
}
