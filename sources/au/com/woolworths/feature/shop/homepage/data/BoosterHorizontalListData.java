package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/BoosterHorizontalListData;", "Lau/com/woolworths/android/onesite/data/HorizontalListDataInterface;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BoosterHorizontalListData implements HorizontalListDataInterface {
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final List h;
    public final List i;

    public BoosterHorizontalListData(String str, String str2, String str3, String str4, List list, List list2) {
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = list;
        this.i = list2;
    }

    public static BoosterHorizontalListData a(BoosterHorizontalListData boosterHorizontalListData, ArrayList arrayList) {
        return new BoosterHorizontalListData(boosterHorizontalListData.d, boosterHorizontalListData.e, boosterHorizontalListData.f, boosterHorizontalListData.g, arrayList, boosterHorizontalListData.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoosterHorizontalListData)) {
            return false;
        }
        BoosterHorizontalListData boosterHorizontalListData = (BoosterHorizontalListData) obj;
        return Intrinsics.c(this.d, boosterHorizontalListData.d) && Intrinsics.c(this.e, boosterHorizontalListData.e) && Intrinsics.c(this.f, boosterHorizontalListData.f) && Intrinsics.c(this.g, boosterHorizontalListData.g) && Intrinsics.c(this.h, boosterHorizontalListData.h) && Intrinsics.c(this.i, boosterHorizontalListData.i);
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getActionTitle, reason: from getter */
    public final String getF() {
        return this.f;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getDeepLink, reason: from getter */
    public final String getG() {
        return this.g;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getItems, reason: from getter */
    public final List getH() {
        return this.h;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getSubtitle, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.data.HorizontalListDataInterface
    /* renamed from: getTitle, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.d;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return this.i.hashCode() + b.d((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.h);
    }

    public final String toString() {
        StringBuilder sbV = a.v("BoosterHorizontalListData(title=", this.d, ", subtitle=", this.e, ", actionTitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", deepLink=", this.g, ", items=");
        sbV.append(this.h);
        sbV.append(", tigerOfferIds=");
        sbV.append(this.i);
        sbV.append(")");
        return sbV.toString();
    }
}
