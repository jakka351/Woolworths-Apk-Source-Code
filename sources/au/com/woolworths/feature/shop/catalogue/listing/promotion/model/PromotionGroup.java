package au.com.woolworths.feature.shop.catalogue.listing.promotion.model;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.aem.components.model.ImageWithAltText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/model/PromotionGroup;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionGroup {

    /* renamed from: a, reason: collision with root package name */
    public final ImageWithAltText f6906a;
    public final String b;
    public final Object c;

    public PromotionGroup(ImageWithAltText imageWithAltText, String str, List list) {
        this.f6906a = imageWithAltText;
        this.b = str;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionGroup)) {
            return false;
        }
        PromotionGroup promotionGroup = (PromotionGroup) obj;
        return Intrinsics.c(this.f6906a, promotionGroup.f6906a) && Intrinsics.c(this.b, promotionGroup.b) && this.c.equals(promotionGroup.c);
    }

    public final int hashCode() {
        ImageWithAltText imageWithAltText = this.f6906a;
        int iHashCode = (imageWithAltText == null ? 0 : imageWithAltText.hashCode()) * 31;
        String str = this.b;
        return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionGroup(badge=");
        sb.append(this.f6906a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", items=");
        return a.o(this.c, ")", sb);
    }
}
