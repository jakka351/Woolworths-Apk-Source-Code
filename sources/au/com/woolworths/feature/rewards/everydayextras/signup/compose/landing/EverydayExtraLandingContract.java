package au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.landing.EverydayExtrasLandingFeed;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import au.com.woolworths.foundation.rewards.servicemessages.RewardsServiceMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract;", "", "ViewState", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraLandingContract {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState;", "", "Content", "Loading", "Error", "ServiceMessage", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$ServiceMessage;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtrasLandingFeed f6093a;
            public final RewardsServiceMessage b;
            public final boolean c;
            public final boolean d;

            public Content(EverydayExtrasLandingFeed landingFeed, RewardsServiceMessage rewardsServiceMessage, boolean z, boolean z2) {
                Intrinsics.h(landingFeed, "landingFeed");
                this.f6093a = landingFeed;
                this.b = rewardsServiceMessage;
                this.c = z;
                this.d = z2;
            }

            public static Content c(Content content, EverydayExtrasLandingFeed landingFeed, RewardsServiceMessage rewardsServiceMessage, boolean z, int i) {
                if ((i & 1) != 0) {
                    landingFeed = content.f6093a;
                }
                if ((i & 2) != 0) {
                    rewardsServiceMessage = content.b;
                }
                if ((i & 4) != 0) {
                    z = content.c;
                }
                boolean z2 = (i & 8) != 0 ? content.d : true;
                content.getClass();
                Intrinsics.h(landingFeed, "landingFeed");
                return new Content(landingFeed, rewardsServiceMessage, z, z2);
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract.ViewState
            public final int a() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f6093a, content.f6093a) && Intrinsics.c(this.b, content.b) && this.c == content.c && this.d == content.d;
            }

            public final int hashCode() {
                int iHashCode = this.f6093a.hashCode() * 31;
                RewardsServiceMessage rewardsServiceMessage = this.b;
                return Boolean.hashCode(this.d) + b.e((iHashCode + (rewardsServiceMessage == null ? 0 : rewardsServiceMessage.hashCode())) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(landingFeed=");
                sb.append(this.f6093a);
                sb.append(", partialServiceMessage=");
                sb.append(this.b);
                sb.append(", isRefreshing=");
                return a.q(sb, this.c, ", loadDataError=", this.d, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageError f6094a;

            public Error(FullPageError fullPageError) {
                this.f6094a = fullPageError;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract.ViewState
            public final int a() {
                return 2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6094a, ((Error) obj).f6094a);
            }

            public final int hashCode() {
                return this.f6094a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6094a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6095a = new Loading();

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract.ViewState
            public final int a() {
                return 1;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -2067607628;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState$ServiceMessage;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/landing/EverydayExtraLandingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ServiceMessage implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsServiceMessage f6096a;

            static {
                RewardsServiceMessage.Companion companion = RewardsServiceMessage.INSTANCE;
            }

            public ServiceMessage(RewardsServiceMessage serviceMessage) {
                Intrinsics.h(serviceMessage, "serviceMessage");
                this.f6096a = serviceMessage;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.EverydayExtraLandingContract.ViewState
            public final int a() {
                return 3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ServiceMessage) && Intrinsics.c(this.f6096a, ((ServiceMessage) obj).f6096a);
            }

            public final int hashCode() {
                return this.f6096a.hashCode();
            }

            public final String toString() {
                return "ServiceMessage(serviceMessage=" + this.f6096a + ")";
            }
        }

        int a();

        default Content b() {
            if (this instanceof Content) {
                return (Content) this;
            }
            return null;
        }
    }
}
