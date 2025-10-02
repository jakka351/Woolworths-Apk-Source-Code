package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.DownloadableAsset;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.shared.EverydayExtrasAlertDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasLandingFeed;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasLandingFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f6160a;
    public final DownloadableAsset b;
    public final List c;
    public final EverydayExtrasTermsAndConditions d;
    public final EverydayExtrasLandingFooter e;
    public final EverydayExtrasAlertDialog f;

    public EverydayExtrasLandingFeed(String str, DownloadableAsset downloadableAsset, List list, EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions, EverydayExtrasLandingFooter everydayExtrasLandingFooter, EverydayExtrasAlertDialog everydayExtrasAlertDialog) {
        this.f6160a = str;
        this.b = downloadableAsset;
        this.c = list;
        this.d = everydayExtrasTermsAndConditions;
        this.e = everydayExtrasLandingFooter;
        this.f = everydayExtrasAlertDialog;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasLandingFeed)) {
            return false;
        }
        EverydayExtrasLandingFeed everydayExtrasLandingFeed = (EverydayExtrasLandingFeed) obj;
        return Intrinsics.c(this.f6160a, everydayExtrasLandingFeed.f6160a) && Intrinsics.c(this.b, everydayExtrasLandingFeed.b) && Intrinsics.c(this.c, everydayExtrasLandingFeed.c) && Intrinsics.c(this.d, everydayExtrasLandingFeed.d) && Intrinsics.c(this.e, everydayExtrasLandingFeed.e) && Intrinsics.c(this.f, everydayExtrasLandingFeed.f);
    }

    public final int hashCode() {
        int iD = b.d((this.b.hashCode() + (this.f6160a.hashCode() * 31)) * 31, 31, this.c);
        EverydayExtrasTermsAndConditions everydayExtrasTermsAndConditions = this.d;
        int iHashCode = (iD + (everydayExtrasTermsAndConditions == null ? 0 : everydayExtrasTermsAndConditions.hashCode())) * 31;
        EverydayExtrasLandingFooter everydayExtrasLandingFooter = this.e;
        int iHashCode2 = (iHashCode + (everydayExtrasLandingFooter == null ? 0 : everydayExtrasLandingFooter.hashCode())) * 31;
        EverydayExtrasAlertDialog everydayExtrasAlertDialog = this.f;
        return iHashCode2 + (everydayExtrasAlertDialog != null ? everydayExtrasAlertDialog.hashCode() : 0);
    }

    public final String toString() {
        return "EverydayExtrasLandingFeed(navigationTitle=" + this.f6160a + ", header=" + this.b + ", tabs=" + this.c + ", termsAndConditions=" + this.d + ", footer=" + this.e + ", alertDialog=" + this.f + ")";
    }
}
