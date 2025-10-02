package au.com.woolworths.feature.shop.healthylifefoodtracker.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerConsent;", "Lau/com/woolworths/feature/shop/healthylifefoodtracker/data/FoodTrackerAction;", "healthy-life-food-tracker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FoodTrackerConsent extends FoodTrackerAction {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadableAsset f7164a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public FoodTrackerConsent(DownloadableAsset downloadableAsset, String str, String str2, String str3, String str4, String str5) {
        this.f7164a = downloadableAsset;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FoodTrackerConsent)) {
            return false;
        }
        FoodTrackerConsent foodTrackerConsent = (FoodTrackerConsent) obj;
        return Intrinsics.c(this.f7164a, foodTrackerConsent.f7164a) && Intrinsics.c(this.b, foodTrackerConsent.b) && Intrinsics.c(this.c, foodTrackerConsent.c) && Intrinsics.c(this.d, foodTrackerConsent.d) && Intrinsics.c(this.e, foodTrackerConsent.e) && Intrinsics.c(this.f, foodTrackerConsent.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + b.c(b.c(b.c(b.c(this.f7164a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FoodTrackerConsent(headerAsset=");
        sb.append(this.f7164a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", markdownDescription=");
        a.B(sb, this.c, ", termsMarkdownText=", this.d, ", primaryCtaLabel=");
        return a.l(sb, this.e, ", secondaryCtaLabel=", this.f, ")");
    }
}
