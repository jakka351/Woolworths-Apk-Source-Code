package au.com.woolworths.rewards.base.coachmark.legacy;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult;", "", "Success", "Failure", "Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult$Failure;", "Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult$Success;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class HomepageCoachMarkResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult$Failure;", "Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends HomepageCoachMarkResult {

        /* renamed from: a, reason: collision with root package name */
        public final RuntimeException f9363a;

        public Failure(RuntimeException runtimeException) {
            this.f9363a = runtimeException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.f9363a.equals(((Failure) obj).f9363a);
        }

        public final int hashCode() {
            return this.f9363a.hashCode();
        }

        public final String toString() {
            return "Failure(e=" + this.f9363a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult$Success;", "Lau/com/woolworths/rewards/base/coachmark/legacy/HomepageCoachMarkResult;", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends HomepageCoachMarkResult {

        /* renamed from: a, reason: collision with root package name */
        public final CoachMarkContent f9364a;

        public Success(CoachMarkContent coachmarkContent) {
            Intrinsics.h(coachmarkContent, "coachmarkContent");
            this.f9364a = coachmarkContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f9364a, ((Success) obj).f9364a);
        }

        public final int hashCode() {
            return this.f9364a.hashCode();
        }

        public final String toString() {
            return "Success(coachmarkContent=" + this.f9364a + ")";
        }
    }
}
