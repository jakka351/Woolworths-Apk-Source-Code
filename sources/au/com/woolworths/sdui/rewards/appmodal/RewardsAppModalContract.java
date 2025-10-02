package au.com.woolworths.sdui.rewards.appmodal;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract;", "", "Actions", "ViewState", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RewardsAppModalContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions;", "", "Finish", "DisplayNotificationsPermissionsDialog", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions$DisplayNotificationsPermissionsDialog;", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions$Finish;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions$DisplayNotificationsPermissionsDialog;", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayNotificationsPermissionsDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10010a;

            public DisplayNotificationsPermissionsDialog(String url) {
                Intrinsics.h(url, "url");
                this.f10010a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayNotificationsPermissionsDialog) && Intrinsics.c(this.f10010a, ((DisplayNotificationsPermissionsDialog) obj).f10010a);
            }

            public final int hashCode() {
                return this.f10010a.hashCode();
            }

            public final String toString() {
                return YU.a.h("DisplayNotificationsPermissionsDialog(url=", this.f10010a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions$Finish;", "Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$Actions;", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Finish extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Finish f10011a = new Finish();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public final int hashCode() {
                return 2077922700;
            }

            public final String toString() {
                return "Finish";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$ViewState;", "", "Companion", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState b;

        /* renamed from: a, reason: collision with root package name */
        public final RewardsAppModalData f10012a;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalContract$ViewState$Companion;", "", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        static {
            RewardsAppModalData.Companion companion = RewardsAppModalData.INSTANCE;
            b = new ViewState(null);
        }

        public ViewState(RewardsAppModalData rewardsAppModalData) {
            this.f10012a = rewardsAppModalData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && Intrinsics.c(this.f10012a, ((ViewState) obj).f10012a);
        }

        public final int hashCode() {
            RewardsAppModalData rewardsAppModalData = this.f10012a;
            if (rewardsAppModalData == null) {
                return 0;
            }
            return rewardsAppModalData.hashCode();
        }

        public final String toString() {
            return "ViewState(rewardsAppModal=" + this.f10012a + ")";
        }
    }
}
