package au.com.woolworths.shop.cart.domain.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.foundation.shop.cart.data.model.CartProductQuantityInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/domain/model/ProductReviewCard;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewCard {

    /* renamed from: a, reason: collision with root package name */
    public final String f10444a;
    public final String b;
    public final double c;
    public final String d;
    public final BadgeApiData e;
    public final CartProductQuantityInfo f;
    public final Integer g;
    public final boolean h;
    public final ProductAlternative i;
    public final String j;
    public final String k;

    public ProductReviewCard(String str, String str2, double d, String str3, BadgeApiData badgeApiData, CartProductQuantityInfo cartProductQuantityInfo, Integer num, boolean z, ProductAlternative productAlternative, String str4, String str5) {
        this.f10444a = str;
        this.b = str2;
        this.c = d;
        this.d = str3;
        this.e = badgeApiData;
        this.f = cartProductQuantityInfo;
        this.g = num;
        this.h = z;
        this.i = productAlternative;
        this.j = str4;
        this.k = str5;
    }

    public static ProductReviewCard a(ProductReviewCard productReviewCard, double d, BadgeApiData badgeApiData, CartProductQuantityInfo cartProductQuantityInfo, ProductAlternative productAlternative, String str, int i) {
        return new ProductReviewCard(productReviewCard.f10444a, productReviewCard.b, (i & 4) != 0 ? productReviewCard.c : d, productReviewCard.d, (i & 16) != 0 ? productReviewCard.e : badgeApiData, (i & 32) != 0 ? productReviewCard.f : cartProductQuantityInfo, (i & 64) != 0 ? productReviewCard.g : 4500, productReviewCard.h, (i & 256) != 0 ? productReviewCard.i : productAlternative, productReviewCard.j, (i & 1024) != 0 ? productReviewCard.k : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewCard)) {
            return false;
        }
        ProductReviewCard productReviewCard = (ProductReviewCard) obj;
        return Intrinsics.c(this.f10444a, productReviewCard.f10444a) && Intrinsics.c(this.b, productReviewCard.b) && Double.compare(this.c, productReviewCard.c) == 0 && Intrinsics.c(this.d, productReviewCard.d) && Intrinsics.c(this.e, productReviewCard.e) && Intrinsics.c(this.f, productReviewCard.f) && Intrinsics.c(this.g, productReviewCard.g) && this.h == productReviewCard.h && Intrinsics.c(this.i, productReviewCard.i) && Intrinsics.c(this.j, productReviewCard.j) && Intrinsics.c(this.k, productReviewCard.k);
    }

    public final int hashCode() {
        int iC = b.c(a.a(this.c, b.c(this.f10444a.hashCode() * 31, 31, this.b), 31), 31, this.d);
        BadgeApiData badgeApiData = this.e;
        int iHashCode = (iC + (badgeApiData == null ? 0 : badgeApiData.hashCode())) * 31;
        CartProductQuantityInfo cartProductQuantityInfo = this.f;
        int iHashCode2 = (iHashCode + (cartProductQuantityInfo == null ? 0 : cartProductQuantityInfo.hashCode())) * 31;
        Integer num = this.g;
        int iE = b.e((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.h);
        ProductAlternative productAlternative = this.i;
        int iHashCode3 = (iE + (productAlternative == null ? 0 : productAlternative.hashCode())) * 31;
        String str = this.j;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("ProductReviewCard(title=", this.f10444a, ", productId=", this.b, ", quantity=");
        sbV.append(this.c);
        sbV.append(", imageUrl=");
        sbV.append(this.d);
        sbV.append(", badge=");
        sbV.append(this.e);
        sbV.append(", quantityInfo=");
        sbV.append(this.f);
        sbV.append(", price=");
        sbV.append(this.g);
        sbV.append(", isAvailable=");
        sbV.append(this.h);
        sbV.append(", alternative=");
        sbV.append(this.i);
        sbV.append(", unitPrice=");
        sbV.append(this.j);
        return YU.a.p(sbV, ", availableLimit=", this.k, ")");
    }
}
