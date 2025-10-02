package au.com.woolworths.shop.checkout.domain.model;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/domain/model/LegacyNotifications;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class LegacyNotifications {

    /* renamed from: a, reason: collision with root package name */
    public final InlineMessage f10618a;
    public final InlineMessage b;
    public final AlertMessage c;
    public final LinkedHashSet d;
    public final boolean e;

    public LegacyNotifications(InlineMessage inlineMessage, InlineMessage inlineMessage2, AlertMessage alertMessage, LinkedHashSet linkedHashSet, boolean z) {
        this.f10618a = inlineMessage;
        this.b = inlineMessage2;
        this.c = alertMessage;
        this.d = linkedHashSet;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyNotifications)) {
            return false;
        }
        LegacyNotifications legacyNotifications = (LegacyNotifications) obj;
        return Intrinsics.c(this.f10618a, legacyNotifications.f10618a) && Intrinsics.c(this.b, legacyNotifications.b) && Intrinsics.c(this.c, legacyNotifications.c) && this.d.equals(legacyNotifications.d) && this.e == legacyNotifications.e;
    }

    public final int hashCode() {
        InlineMessage inlineMessage = this.f10618a;
        int iHashCode = (inlineMessage == null ? 0 : inlineMessage.hashCode()) * 31;
        InlineMessage inlineMessage2 = this.b;
        int iHashCode2 = (iHashCode + (inlineMessage2 == null ? 0 : inlineMessage2.hashCode())) * 31;
        AlertMessage alertMessage = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode2 + (alertMessage != null ? alertMessage.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LegacyNotifications(selectedWindowInlineMessage=");
        sb.append(this.f10618a);
        sb.append(", bottomSheetInlineMessage=");
        sb.append(this.b);
        sb.append(", alertMessageData=");
        sb.append(this.c);
        sb.append(", trackActions=");
        sb.append(this.d);
        sb.append(", isContinueButtonEnabled=");
        return a.k(")", sb, this.e);
    }
}
