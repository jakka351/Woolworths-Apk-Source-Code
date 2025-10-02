package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.data.RewardsState;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/RewardsBalanceCardData;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsBalanceCardData {

    /* renamed from: a, reason: collision with root package name */
    public final String f7205a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final List g;
    public final String h;
    public final AlertIndicator i;
    public final AlertIndicator j;
    public final RewardsState k;

    public RewardsBalanceCardData(String str, String str2, int i, int i2, String str3, String str4, List list, String str5, AlertIndicator alertIndicator, AlertIndicator alertIndicator2, RewardsState rewardsState) {
        Intrinsics.h(rewardsState, "rewardsState");
        this.f7205a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = str5;
        this.i = alertIndicator;
        this.j = alertIndicator2;
        this.k = rewardsState;
    }

    public static RewardsBalanceCardData a(RewardsBalanceCardData rewardsBalanceCardData, AlertIndicator alertIndicator, AlertIndicator alertIndicator2, int i) {
        String str = rewardsBalanceCardData.f7205a;
        String str2 = (i & 2) != 0 ? rewardsBalanceCardData.b : "- offers to boost";
        int i2 = (i & 4) != 0 ? rewardsBalanceCardData.c : -1;
        int i3 = rewardsBalanceCardData.d;
        String str3 = rewardsBalanceCardData.e;
        String str4 = rewardsBalanceCardData.f;
        List list = rewardsBalanceCardData.g;
        String str5 = rewardsBalanceCardData.h;
        if ((i & 256) != 0) {
            alertIndicator = rewardsBalanceCardData.i;
        }
        AlertIndicator alertIndicator3 = alertIndicator;
        if ((i & 512) != 0) {
            alertIndicator2 = rewardsBalanceCardData.j;
        }
        RewardsState rewardsState = rewardsBalanceCardData.k;
        Intrinsics.h(rewardsState, "rewardsState");
        return new RewardsBalanceCardData(str, str2, i2, i3, str3, str4, list, str5, alertIndicator3, alertIndicator2, rewardsState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsBalanceCardData)) {
            return false;
        }
        RewardsBalanceCardData rewardsBalanceCardData = (RewardsBalanceCardData) obj;
        return Intrinsics.c(this.f7205a, rewardsBalanceCardData.f7205a) && Intrinsics.c(this.b, rewardsBalanceCardData.b) && this.c == rewardsBalanceCardData.c && this.d == rewardsBalanceCardData.d && Intrinsics.c(this.e, rewardsBalanceCardData.e) && Intrinsics.c(this.f, rewardsBalanceCardData.f) && Intrinsics.c(this.g, rewardsBalanceCardData.g) && Intrinsics.c(this.h, rewardsBalanceCardData.h) && Intrinsics.c(this.i, rewardsBalanceCardData.i) && Intrinsics.c(this.j, rewardsBalanceCardData.j) && this.k == rewardsBalanceCardData.k;
    }

    public final int hashCode() {
        int iC = b.c(b.d(b.c(b.c(b.a(this.d, b.a(this.c, b.c(this.f7205a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        AlertIndicator alertIndicator = this.i;
        int iHashCode = (iC + (alertIndicator == null ? 0 : alertIndicator.hashCode())) * 31;
        AlertIndicator alertIndicator2 = this.j;
        return this.k.hashCode() + ((iHashCode + (alertIndicator2 != null ? alertIndicator2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsBalanceCardData(edrNumber=", this.f7205a, ", offersTitle=", this.b, ", currentBalance=");
        a.w(this.c, this.d, ", goalBalance=", ", actionUrl=", sbV);
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", pointsDescriptionFormat=", this.f, ", pointsDescriptionReplacements=");
        sbV.append(this.g);
        sbV.append(", altText=");
        sbV.append(this.h);
        sbV.append(", offersAlertIndicator=");
        sbV.append(this.i);
        sbV.append(", pointsAlertIndicator=");
        sbV.append(this.j);
        sbV.append(", rewardsState=");
        sbV.append(this.k);
        sbV.append(")");
        return sbV.toString();
    }
}
