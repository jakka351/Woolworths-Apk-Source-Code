package au.com.woolworths.feature.rewards.permissions.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract;", "", "ViewState", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AskForPushNotificationPermissionContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState;", "", "Idle", "Ask", "Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState$Ask;", "Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState$Idle;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState$Ask;", "Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Ask implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Ask f6417a = new Ask();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Ask);
            }

            public final int hashCode() {
                return -1186364032;
            }

            public final String toString() {
                return "Ask";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState$Idle;", "Lau/com/woolworths/feature/rewards/permissions/ui/AskForPushNotificationPermissionContract$ViewState;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Idle implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Idle f6418a = new Idle();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Idle);
            }

            public final int hashCode() {
                return 1877644717;
            }

            public final String toString() {
                return "Idle";
            }
        }
    }
}
