package au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/finalglance/EverydayExtraFinalGlanceContent;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtraFinalGlanceContent {

    /* renamed from: a, reason: collision with root package name */
    public final List f6149a;

    public EverydayExtraFinalGlanceContent(List list) {
        this.f6149a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EverydayExtraFinalGlanceContent) && Intrinsics.c(this.f6149a, ((EverydayExtraFinalGlanceContent) obj).f6149a);
    }

    public final int hashCode() {
        return this.f6149a.hashCode();
    }

    public final String toString() {
        return a.l("EverydayExtraFinalGlanceContent(feed=", ")", this.f6149a);
    }
}
