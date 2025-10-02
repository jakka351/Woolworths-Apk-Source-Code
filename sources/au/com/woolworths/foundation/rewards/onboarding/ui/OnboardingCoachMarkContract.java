package au.com.woolworths.foundation.rewards.onboarding.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkContent;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkContract;", "", "ViewState", "Listener", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnboardingCoachMarkContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkContract$Listener;", "", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Listener {

        /* renamed from: a, reason: collision with root package name */
        public final Function0 f8639a;
        public final Function2 b;
        public final Function1 c;

        public Listener(Function0 function0, Function2 function2, Function1 function1) {
            this.f8639a = function0;
            this.b = function2;
            this.c = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Listener)) {
                return false;
            }
            Listener listener = (Listener) obj;
            return Intrinsics.c(this.f8639a, listener.f8639a) && Intrinsics.c(this.b, listener.b) && Intrinsics.c(this.c, listener.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f8639a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Listener(onDismiss=" + this.f8639a + ", onCtaClick=" + this.b + ", onShow=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/onboarding/ui/OnboardingCoachMarkContract$ViewState;", "", "onboarding-ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ProgressiveCoachMarkContent f8640a;

        public ViewState(ProgressiveCoachMarkContent progressiveCoachMarkContent) {
            this.f8640a = progressiveCoachMarkContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f8640a, ((ViewState) obj).f8640a);
        }

        public final int hashCode() {
            ProgressiveCoachMarkContent progressiveCoachMarkContent = this.f8640a;
            if (progressiveCoachMarkContent == null) {
                return 0;
            }
            return progressiveCoachMarkContent.hashCode();
        }

        public final String toString() {
            return "ViewState(content=" + this.f8640a + ")";
        }
    }
}
