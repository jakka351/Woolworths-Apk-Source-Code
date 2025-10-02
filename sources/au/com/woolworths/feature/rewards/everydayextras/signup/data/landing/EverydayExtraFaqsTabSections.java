package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsTabSections;", "", "EverydayExtrasFaqsSection", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsTabSections$EverydayExtrasFaqsSection;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtraFaqsTabSections {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsTabSections$EverydayExtrasFaqsSection;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraFaqsTabSections;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtrasFaqsSection implements EverydayExtraFaqsTabSections {

        /* renamed from: a, reason: collision with root package name */
        public final List f6157a;

        public EverydayExtrasFaqsSection(List list) {
            this.f6157a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EverydayExtrasFaqsSection) && Intrinsics.c(this.f6157a, ((EverydayExtrasFaqsSection) obj).f6157a);
        }

        public final int hashCode() {
            return this.f6157a.hashCode();
        }

        public final String toString() {
            return a.l("EverydayExtrasFaqsSection(items=", ")", this.f6157a);
        }
    }
}
