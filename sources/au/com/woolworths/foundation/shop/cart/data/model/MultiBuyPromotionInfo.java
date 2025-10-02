package au.com.woolworths.foundation.shop.cart.data.model;

import YU.a;
import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/MultiBuyPromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MultiBuyPromotionInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f8698a;
    public final String b;
    public final boolean c;

    public MultiBuyPromotionInfo(String str, String str2, boolean z) {
        this.f8698a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiBuyPromotionInfo)) {
            return false;
        }
        MultiBuyPromotionInfo multiBuyPromotionInfo = (MultiBuyPromotionInfo) obj;
        return Intrinsics.c(this.f8698a, multiBuyPromotionInfo.f8698a) && Intrinsics.c(this.b, multiBuyPromotionInfo.b) && this.c == multiBuyPromotionInfo.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.c(this.f8698a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return a.k(")", a.v("MultiBuyPromotionInfo(title=", this.f8698a, ", subtitle=", this.b, ", isApplied="), this.c);
    }
}
