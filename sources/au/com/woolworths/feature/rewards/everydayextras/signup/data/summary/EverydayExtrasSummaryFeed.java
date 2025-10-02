package au.com.woolworths.feature.rewards.everydayextras.signup.data.summary;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/summary/EverydayExtrasSummaryFeed;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasSummaryFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f6172a;
    public final EverydayExtrasSummaryContent b;
    public final EverydayExtrasSummaryFooter c;

    public EverydayExtrasSummaryFeed(String str, EverydayExtrasSummaryContent everydayExtrasSummaryContent, EverydayExtrasSummaryFooter everydayExtrasSummaryFooter) {
        this.f6172a = str;
        this.b = everydayExtrasSummaryContent;
        this.c = everydayExtrasSummaryFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasSummaryFeed)) {
            return false;
        }
        EverydayExtrasSummaryFeed everydayExtrasSummaryFeed = (EverydayExtrasSummaryFeed) obj;
        return Intrinsics.c(this.f6172a, everydayExtrasSummaryFeed.f6172a) && Intrinsics.c(this.b, everydayExtrasSummaryFeed.b) && Intrinsics.c(this.c, everydayExtrasSummaryFeed.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6172a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "EverydayExtrasSummaryFeed(navigationTitle=" + this.f6172a + ", content=" + this.b + ", footer=" + this.c + ")";
    }
}
