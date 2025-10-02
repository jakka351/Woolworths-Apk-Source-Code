package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/BoostAllBannerState;", "", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoostAllBannerState {
    public static final BoostAllBannerState f = new BoostAllBannerState(false, null, null, false, StatefulButtonState.d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12374a;
    public final Text b;
    public final Text c;
    public final boolean d;
    public final StatefulButtonState e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/BoostAllBannerState$Companion;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public BoostAllBannerState(boolean z, Text text, Text text2, boolean z2, StatefulButtonState buttonState) {
        Intrinsics.h(buttonState, "buttonState");
        this.f12374a = z;
        this.b = text;
        this.c = text2;
        this.d = z2;
        this.e = buttonState;
    }

    public static BoostAllBannerState a(BoostAllBannerState boostAllBannerState, boolean z, int i) {
        Text text = boostAllBannerState.b;
        Text text2 = boostAllBannerState.c;
        if ((i & 8) != 0) {
            z = boostAllBannerState.d;
        }
        StatefulButtonState buttonState = boostAllBannerState.e;
        boostAllBannerState.getClass();
        Intrinsics.h(buttonState, "buttonState");
        return new BoostAllBannerState(false, text, text2, z, buttonState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostAllBannerState)) {
            return false;
        }
        BoostAllBannerState boostAllBannerState = (BoostAllBannerState) obj;
        return this.f12374a == boostAllBannerState.f12374a && Intrinsics.c(this.b, boostAllBannerState.b) && Intrinsics.c(this.c, boostAllBannerState.c) && this.d == boostAllBannerState.d && this.e == boostAllBannerState.e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f12374a) * 31;
        Text text = this.b;
        int iHashCode2 = (iHashCode + (text == null ? 0 : text.hashCode())) * 31;
        Text text2 = this.c;
        return this.e.hashCode() + androidx.camera.core.impl.b.e((iHashCode2 + (text2 != null ? text2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        return "BoostAllBannerState(hasBoostableOffers=" + this.f12374a + ", message=" + this.b + ", buttonText=" + this.c + ", showBoostAnimation=" + this.d + ", buttonState=" + this.e + ")";
    }
}
