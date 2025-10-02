package au.com.woolworths.shop.lists.ui.substitutions;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Color;
import au.com.woolworths.android.onesite.models.text.PlainText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/substitutions/HeaderBannerState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HeaderBannerState {

    /* renamed from: a, reason: collision with root package name */
    public final PlainText f12469a;
    public final HeaderBannerType b;
    public final long c;

    public HeaderBannerState(PlainText plainText, HeaderBannerType bannerType, long j) {
        Intrinsics.h(bannerType, "bannerType");
        this.f12469a = plainText;
        this.b = bannerType;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeaderBannerState)) {
            return false;
        }
        HeaderBannerState headerBannerState = (HeaderBannerState) obj;
        return this.f12469a.equals(headerBannerState.f12469a) && this.b == headerBannerState.b && Color.c(this.c, headerBannerState.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.f12469a.hashCode() * 31)) * 31;
        int i = Color.l;
        return Long.hashCode(this.c) + iHashCode;
    }

    public final String toString() {
        String strI = Color.i(this.c);
        StringBuilder sb = new StringBuilder("HeaderBannerState(title=");
        sb.append(this.f12469a);
        sb.append(", bannerType=");
        sb.append(this.b);
        sb.append(", titleColor=");
        return YU.a.o(sb, strI, ")");
    }
}
