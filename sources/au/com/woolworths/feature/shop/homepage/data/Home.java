package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/Home;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Home {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7188a;
    public final DeliveryNow b;
    public final UnreadChatbotMsg c;

    public Home(ArrayList arrayList, DeliveryNow deliveryNow, UnreadChatbotMsg unreadChatbotMsg) {
        this.f7188a = arrayList;
        this.b = deliveryNow;
        this.c = unreadChatbotMsg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Home)) {
            return false;
        }
        Home home = (Home) obj;
        return this.f7188a.equals(home.f7188a) && Intrinsics.c(this.b, home.b) && Intrinsics.c(this.c, home.c);
    }

    public final int hashCode() {
        int iHashCode = this.f7188a.hashCode() * 31;
        DeliveryNow deliveryNow = this.b;
        int iHashCode2 = (iHashCode + (deliveryNow == null ? 0 : deliveryNow.hashCode())) * 31;
        UnreadChatbotMsg unreadChatbotMsg = this.c;
        return iHashCode2 + (unreadChatbotMsg != null ? unreadChatbotMsg.hashCode() : 0);
    }

    public final String toString() {
        return "Home(headerItems=" + this.f7188a + ", deliveryNow=" + this.b + ", unreadChatbotMsg=" + this.c + ")";
    }
}
