package au.com.woolworths.feature.shop.homepage.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/HomeContentPage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HomeContentPage {

    /* renamed from: a, reason: collision with root package name */
    public final Home f7189a;
    public final HomePage b;

    public HomeContentPage(Home home, HomePage homePage) {
        this.f7189a = home;
        this.b = homePage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeContentPage)) {
            return false;
        }
        HomeContentPage homeContentPage = (HomeContentPage) obj;
        return Intrinsics.c(this.f7189a, homeContentPage.f7189a) && Intrinsics.c(this.b, homeContentPage.b);
    }

    public final int hashCode() {
        Home home = this.f7189a;
        return this.b.hashCode() + ((home == null ? 0 : home.hashCode()) * 31);
    }

    public final String toString() {
        return "HomeContentPage(home=" + this.f7189a + ", homePage=" + this.b + ")";
    }
}
