package au.com.woolworths.feature.rewards.everydayextras.signup.data.landing;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab;", "", "EverydayExtrasKeyBenefitsTab", "EverydayExtrasFaqsTab", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab$EverydayExtrasFaqsTab;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab$EverydayExtrasKeyBenefitsTab;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtrasTab {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab$EverydayExtrasFaqsTab;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtrasFaqsTab implements EverydayExtrasTab {

        /* renamed from: a, reason: collision with root package name */
        public final String f6162a;
        public final String b;
        public final List c;

        public EverydayExtrasFaqsTab(String str, String str2, List list) {
            this.f6162a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtrasFaqsTab)) {
                return false;
            }
            EverydayExtrasFaqsTab everydayExtrasFaqsTab = (EverydayExtrasFaqsTab) obj;
            return Intrinsics.c(this.f6162a, everydayExtrasFaqsTab.f6162a) && Intrinsics.c(this.b, everydayExtrasFaqsTab.b) && Intrinsics.c(this.c, everydayExtrasFaqsTab.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f6162a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.t(YU.a.v("EverydayExtrasFaqsTab(id=", this.f6162a, ", tabName=", this.b, ", sections="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab$EverydayExtrasKeyBenefitsTab;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/data/landing/EverydayExtrasTab;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtrasKeyBenefitsTab implements EverydayExtrasTab {

        /* renamed from: a, reason: collision with root package name */
        public final String f6163a;
        public final String b;
        public final List c;

        public EverydayExtrasKeyBenefitsTab(String str, String str2, List list) {
            this.f6163a = str;
            this.b = str2;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtrasKeyBenefitsTab)) {
                return false;
            }
            EverydayExtrasKeyBenefitsTab everydayExtrasKeyBenefitsTab = (EverydayExtrasKeyBenefitsTab) obj;
            return Intrinsics.c(this.f6163a, everydayExtrasKeyBenefitsTab.f6163a) && Intrinsics.c(this.b, everydayExtrasKeyBenefitsTab.b) && Intrinsics.c(this.c, everydayExtrasKeyBenefitsTab.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f6163a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.t(YU.a.v("EverydayExtrasKeyBenefitsTab(id=", this.f6163a, ", tabName=", this.b, ", sections="), this.c, ")");
        }
    }
}
