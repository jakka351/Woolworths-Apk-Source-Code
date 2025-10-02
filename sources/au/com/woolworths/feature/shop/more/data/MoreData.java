package au.com.woolworths.feature.shop.more.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.Region;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/data/MoreData;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MoreData {

    /* renamed from: a, reason: collision with root package name */
    public final Region f7629a;
    public final boolean b;
    public final Text c;
    public final String d;
    public final boolean e;
    public final ResWithArgText f;
    public final MoreFeed g;
    public final boolean h;

    public MoreData(Region currentRegion, boolean z, PlainText plainText, String str, boolean z2, ResWithArgText resWithArgText, MoreFeed moreFeed, boolean z3) {
        Intrinsics.h(currentRegion, "currentRegion");
        this.f7629a = currentRegion;
        this.b = z;
        this.c = plainText;
        this.d = str;
        this.e = z2;
        this.f = resWithArgText;
        this.g = moreFeed;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoreData)) {
            return false;
        }
        MoreData moreData = (MoreData) obj;
        return this.f7629a == moreData.f7629a && this.b == moreData.b && Intrinsics.c(this.c, moreData.c) && Intrinsics.c(this.d, moreData.d) && this.e == moreData.e && this.f.equals(moreData.f) && this.g.equals(moreData.g) && this.h == moreData.h;
    }

    public final int hashCode() {
        int iE = b.e(this.f7629a.hashCode() * 31, 31, this.b);
        Text text = this.c;
        int iHashCode = (iE + (text == null ? 0 : text.hashCode())) * 31;
        String str = this.d;
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + ((this.f.hashCode() + b.e((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.e)) * 31)) * 31);
    }

    public final String toString() {
        return "MoreData(currentRegion=" + this.f7629a + ", isLoggedIn=" + this.b + ", userName=" + this.c + ", rewardsCardNumber=" + this.d + ", rewardsCanBeUnlinked=" + this.e + ", appVersion=" + this.f + ", feedData=" + this.g + ", hasUnreadMessages=" + this.h + ")";
    }
}
