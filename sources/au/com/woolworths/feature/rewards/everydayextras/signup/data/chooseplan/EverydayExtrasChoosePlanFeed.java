package au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanFeed;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasChoosePlanFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f6147a;
    public final EverydayExtrasChoosePlanContent b;
    public final EverydayExtrasChoosePlanFooter c;

    public EverydayExtrasChoosePlanFeed(String str, EverydayExtrasChoosePlanContent everydayExtrasChoosePlanContent, EverydayExtrasChoosePlanFooter everydayExtrasChoosePlanFooter) {
        this.f6147a = str;
        this.b = everydayExtrasChoosePlanContent;
        this.c = everydayExtrasChoosePlanFooter;
    }

    public static EverydayExtrasChoosePlanFeed a(EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed, EverydayExtrasChoosePlanContent content, EverydayExtrasChoosePlanFooter everydayExtrasChoosePlanFooter, int i) {
        String str = everydayExtrasChoosePlanFeed.f6147a;
        if ((i & 4) != 0) {
            everydayExtrasChoosePlanFooter = everydayExtrasChoosePlanFeed.c;
        }
        everydayExtrasChoosePlanFeed.getClass();
        Intrinsics.h(content, "content");
        return new EverydayExtrasChoosePlanFeed(str, content, everydayExtrasChoosePlanFooter);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasChoosePlanFeed)) {
            return false;
        }
        EverydayExtrasChoosePlanFeed everydayExtrasChoosePlanFeed = (EverydayExtrasChoosePlanFeed) obj;
        return Intrinsics.c(this.f6147a, everydayExtrasChoosePlanFeed.f6147a) && Intrinsics.c(this.b, everydayExtrasChoosePlanFeed.b) && Intrinsics.c(this.c, everydayExtrasChoosePlanFeed.c);
    }

    public final int hashCode() {
        String str = this.f6147a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        EverydayExtrasChoosePlanFooter everydayExtrasChoosePlanFooter = this.c;
        return iHashCode + (everydayExtrasChoosePlanFooter != null ? everydayExtrasChoosePlanFooter.hashCode() : 0);
    }

    public final String toString() {
        return "EverydayExtrasChoosePlanFeed(navigationTitle=" + this.f6147a + ", content=" + this.b + ", footer=" + this.c + ")";
    }
}
