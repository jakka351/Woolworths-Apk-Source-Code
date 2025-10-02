package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract;", "", "ViewState", "Actions", "ViewActions", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsPreferenceDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions;", "", "OpenExternalLink", "GoToPushSettings", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions$GoToPushSettings;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions$OpenExternalLink;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions$GoToPushSettings;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoToPushSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToPushSettings f5726a = new GoToPushSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToPushSettings);
            }

            public final int hashCode() {
                return 1928536356;
            }

            public final String toString() {
                return "GoToPushSettings";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenExternalLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5727a;

            public OpenExternalLink(String url) {
                Intrinsics.h(url, "url");
                this.f5727a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenExternalLink) && Intrinsics.c(this.f5727a, ((OpenExternalLink) obj).f5727a);
            }

            public final int hashCode() {
                return this.f5727a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenExternalLink(url=", this.f5727a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions;", "", "ShowSnackBarErrorMessage", "ShowSnackBarMessage", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions$ShowSnackBarErrorMessage;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions$ShowSnackBarMessage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewActions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions$ShowSnackBarErrorMessage;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarErrorMessage implements ViewActions {

            /* renamed from: a, reason: collision with root package name */
            public final int f5728a;

            public ShowSnackBarErrorMessage(int i) {
                this.f5728a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBarErrorMessage) && this.f5728a == ((ShowSnackBarErrorMessage) obj).f5728a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f5728a);
            }

            public final String toString() {
                return YU.a.e(this.f5728a, "ShowSnackBarErrorMessage(errorRes=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions$ShowSnackBarMessage;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewActions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarMessage implements ViewActions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5729a;

            public ShowSnackBarMessage(String message) {
                Intrinsics.h(message, "message");
                this.f5729a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBarMessage) && Intrinsics.c(this.f5729a, ((ShowSnackBarMessage) obj).f5729a);
            }

            public final int hashCode() {
                return this.f5729a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowSnackBarMessage(message=", this.f5729a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState;", "", "Content", "Loading", "Error", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Loading;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final String f5730a;
            public final List b;
            public final boolean c;

            public Content(String str, boolean z, List list) {
                this.f5730a = str;
                this.b = list;
                this.c = z;
            }

            public static Content a(Content content, boolean z) {
                String str = content.f5730a;
                List items = content.b;
                Intrinsics.h(items, "items");
                return new Content(str, z, items);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f5730a, content.f5730a) && Intrinsics.c(this.b, content.b) && this.c == content.c;
            }

            public final int hashCode() {
                String str = this.f5730a;
                return Boolean.hashCode(this.c) + androidx.camera.core.impl.b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            }

            public final String toString() {
                return YU.a.k(")", au.com.woolworths.android.onesite.a.s("Content(title=", this.f5730a, ", items=", ", isToggling=", this.b), this.c);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState;", "Network", "Server", "PushSettings", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error$Network;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error$PushSettings;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error$Server;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Error implements ViewState {

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error$Network;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Network extends Error {

                /* renamed from: a, reason: collision with root package name */
                public static final Network f5731a = new Network();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Network);
                }

                public final int hashCode() {
                    return -1589833101;
                }

                public final String toString() {
                    return "Network";
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error$PushSettings;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class PushSettings extends Error {

                /* renamed from: a, reason: collision with root package name */
                public static final PushSettings f5732a = new PushSettings();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof PushSettings);
                }

                public final int hashCode() {
                    return -614744008;
                }

                public final String toString() {
                    return "PushSettings";
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error$Server;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Error;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Server extends Error {

                /* renamed from: a, reason: collision with root package name */
                public static final Server f5733a = new Server();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Server);
                }

                public final int hashCode() {
                    return -1847862690;
                }

                public final String toString() {
                    return "Server";
                }
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContract$ViewState;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f5734a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -608109625;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }
}
