package au.com.woolworths.shop.product.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/data/RatingsAndReviewsCtaAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RatingsAndReviewsCtaAction {

    /* renamed from: a, reason: collision with root package name */
    public final ActionType f12618a;
    public final String b;
    public final String c;

    public RatingsAndReviewsCtaAction(ActionType actionType, String str, String str2) {
        this.f12618a = actionType;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingsAndReviewsCtaAction)) {
            return false;
        }
        RatingsAndReviewsCtaAction ratingsAndReviewsCtaAction = (RatingsAndReviewsCtaAction) obj;
        return this.f12618a == ratingsAndReviewsCtaAction.f12618a && Intrinsics.c(this.b, ratingsAndReviewsCtaAction.b) && Intrinsics.c(this.c, ratingsAndReviewsCtaAction.c);
    }

    public final int hashCode() {
        int iC = b.c(this.f12618a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return a.o(d.s("RatingsAndReviewsCtaAction(type=", this.f12618a, ", action=", this.b, ", id="), this.c, ")");
    }
}
