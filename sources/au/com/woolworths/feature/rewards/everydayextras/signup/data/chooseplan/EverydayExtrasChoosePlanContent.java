package au.com.woolworths.feature.rewards.everydayextras.signup.data.chooseplan;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/chooseplan/EverydayExtrasChoosePlanContent;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasChoosePlanContent {

    /* renamed from: a, reason: collision with root package name */
    public final String f6145a;
    public final List b;

    public EverydayExtrasChoosePlanContent(String str, List list) {
        this.f6145a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasChoosePlanContent)) {
            return false;
        }
        EverydayExtrasChoosePlanContent everydayExtrasChoosePlanContent = (EverydayExtrasChoosePlanContent) obj;
        return Intrinsics.c(this.f6145a, everydayExtrasChoosePlanContent.f6145a) && Intrinsics.c(this.b, everydayExtrasChoosePlanContent.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f6145a.hashCode() * 31);
    }

    public final String toString() {
        return a.i("EverydayExtrasChoosePlanContent(id=", this.f6145a, ", items=", ")", this.b);
    }
}
