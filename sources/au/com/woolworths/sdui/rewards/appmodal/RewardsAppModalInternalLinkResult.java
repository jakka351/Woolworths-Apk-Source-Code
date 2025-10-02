package au.com.woolworths.sdui.rewards.appmodal;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult;", "", "Success", "Failure", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult$Failure;", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult$Success;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class RewardsAppModalInternalLinkResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult$Failure;", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failure extends RewardsAppModalInternalLinkResult {

        /* renamed from: a, reason: collision with root package name */
        public final IllegalArgumentException f10014a;

        public Failure(IllegalArgumentException illegalArgumentException) {
            this.f10014a = illegalArgumentException;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Failure) && this.f10014a.equals(((Failure) obj).f10014a);
        }

        public final int hashCode() {
            return this.f10014a.hashCode();
        }

        public final String toString() {
            return "Failure(e=" + this.f10014a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult$Success;", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInternalLinkResult;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success extends RewardsAppModalInternalLinkResult {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsAppModalData f10015a;

        static {
            RewardsAppModalData.Companion companion = RewardsAppModalData.INSTANCE;
        }

        public Success(RewardsAppModalData appModalData) {
            Intrinsics.h(appModalData, "appModalData");
            this.f10015a = appModalData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Success) && Intrinsics.c(this.f10015a, ((Success) obj).f10015a);
        }

        public final int hashCode() {
            return this.f10015a.hashCode();
        }

        public final String toString() {
            return "Success(appModalData=" + this.f10015a + ")";
        }
    }
}
