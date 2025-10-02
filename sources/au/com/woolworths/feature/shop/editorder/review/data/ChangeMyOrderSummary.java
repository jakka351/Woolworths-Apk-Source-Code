package au.com.woolworths.feature.shop.editorder.review.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.sdui.shop.broadcastbanner.model.BasicCoreBroadcastBannerModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/data/ChangeMyOrderSummary;", "", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ChangeMyOrderSummary {

    /* renamed from: a, reason: collision with root package name */
    public final BasicCoreBroadcastBannerModel f7126a;
    public final ChangeMyOrderDetailsSection b;
    public final FooterCtaSection c;

    public ChangeMyOrderSummary(BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel, ChangeMyOrderDetailsSection changeMyOrderDetailsSection, FooterCtaSection footerCtaSection) {
        this.f7126a = basicCoreBroadcastBannerModel;
        this.b = changeMyOrderDetailsSection;
        this.c = footerCtaSection;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChangeMyOrderSummary)) {
            return false;
        }
        ChangeMyOrderSummary changeMyOrderSummary = (ChangeMyOrderSummary) obj;
        return Intrinsics.c(this.f7126a, changeMyOrderSummary.f7126a) && Intrinsics.c(this.b, changeMyOrderSummary.b) && Intrinsics.c(this.c, changeMyOrderSummary.c);
    }

    public final int hashCode() {
        BasicCoreBroadcastBannerModel basicCoreBroadcastBannerModel = this.f7126a;
        return this.c.hashCode() + ((this.b.hashCode() + ((basicCoreBroadcastBannerModel == null ? 0 : basicCoreBroadcastBannerModel.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeMyOrderSummary(banner=" + this.f7126a + ", orderDetailsSection=" + this.b + ", footerCtaSection=" + this.c + ")";
    }
}
