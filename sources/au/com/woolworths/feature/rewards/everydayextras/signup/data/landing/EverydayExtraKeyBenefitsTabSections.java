package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections;", "", "EverydayExtrasKeyBenefitsSection", "EverydayExtrasComparisonSection", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections$EverydayExtrasComparisonSection;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections$EverydayExtrasKeyBenefitsSection;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtraKeyBenefitsTabSections {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections$EverydayExtrasComparisonSection;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtrasComparisonSection implements EverydayExtraKeyBenefitsTabSections {

        /* renamed from: a, reason: collision with root package name */
        public final List f6158a;

        public EverydayExtrasComparisonSection(List list) {
            this.f6158a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EverydayExtrasComparisonSection) && Intrinsics.c(this.f6158a, ((EverydayExtrasComparisonSection) obj).f6158a);
        }

        public final int hashCode() {
            return this.f6158a.hashCode();
        }

        public final String toString() {
            return a.l("EverydayExtrasComparisonSection(items=", ")", this.f6158a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections$EverydayExtrasKeyBenefitsSection;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtraKeyBenefitsTabSections;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtrasKeyBenefitsSection implements EverydayExtraKeyBenefitsTabSections {

        /* renamed from: a, reason: collision with root package name */
        public final List f6159a;

        public EverydayExtrasKeyBenefitsSection(List list) {
            this.f6159a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EverydayExtrasKeyBenefitsSection) && Intrinsics.c(this.f6159a, ((EverydayExtrasKeyBenefitsSection) obj).f6159a);
        }

        public final int hashCode() {
            return this.f6159a.hashCode();
        }

        public final String toString() {
            return a.l("EverydayExtrasKeyBenefitsSection(items=", ")", this.f6159a);
        }
    }
}
