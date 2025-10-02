package au.com.woolworths.feature.shop.catalogue.browse.page.promotion;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/page/promotion/PromotionPageGridState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionPageGridState {

    /* renamed from: a, reason: collision with root package name */
    public final List f6816a;
    public final float b;

    public PromotionPageGridState(List list, float f) {
        this.f6816a = list;
        this.b = f;
    }

    public static PromotionPageGridState a(PromotionPageGridState promotionPageGridState, List list, float f, int i) {
        if ((i & 1) != 0) {
            list = promotionPageGridState.f6816a;
        }
        if ((i & 2) != 0) {
            f = promotionPageGridState.b;
        }
        promotionPageGridState.getClass();
        return new PromotionPageGridState(list, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionPageGridState)) {
            return false;
        }
        PromotionPageGridState promotionPageGridState = (PromotionPageGridState) obj;
        return Intrinsics.c(this.f6816a, promotionPageGridState.f6816a) && Float.compare(this.b, promotionPageGridState.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.f6816a.hashCode() * 31);
    }

    public final String toString() {
        return "PromotionPageGridState(items=" + this.f6816a + ", minYOffset=" + this.b + ")";
    }
}
