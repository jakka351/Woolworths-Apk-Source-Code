package au.com.woolworths.feature.rewards.account.preferences;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import com.woolworths.R;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy;", "", "ViewState", "Actions", "ToggleErrorType", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsPreferenceDetailsContractLegacy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions;", "", "ShowSnackBarErrorMessage", "ShowSnackBarMessage", "OpenExternalLink", "GoToPushSettings", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$GoToPushSettings;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$ShowSnackBarErrorMessage;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$ShowSnackBarMessage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$GoToPushSettings;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoToPushSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToPushSettings f5735a = new GoToPushSettings();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenExternalLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5736a;

            public OpenExternalLink(String url) {
                Intrinsics.h(url, "url");
                this.f5736a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenExternalLink) && Intrinsics.c(this.f5736a, ((OpenExternalLink) obj).f5736a);
            }

            public final int hashCode() {
                return this.f5736a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenExternalLink(url=", this.f5736a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$ShowSnackBarErrorMessage;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarErrorMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ToggleErrorType f5737a;

            public ShowSnackBarErrorMessage(ToggleErrorType toggleErrorType) {
                this.f5737a = toggleErrorType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBarErrorMessage) && this.f5737a == ((ShowSnackBarErrorMessage) obj).f5737a;
            }

            public final int hashCode() {
                return this.f5737a.hashCode();
            }

            public final String toString() {
                return "ShowSnackBarErrorMessage(type=" + this.f5737a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions$ShowSnackBarMessage;", "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5738a;

            public ShowSnackBarMessage(String message) {
                Intrinsics.h(message, "message");
                this.f5738a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBarMessage) && Intrinsics.c(this.f5738a, ((ShowSnackBarMessage) obj).f5738a);
            }

            public final int hashCode() {
                return this.f5738a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowSnackBarMessage(message=", this.f5738a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$ToggleErrorType;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToggleErrorType {
        public static final ToggleErrorType e;
        public static final ToggleErrorType f;
        public static final /* synthetic */ ToggleErrorType[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int d;

        static {
            ToggleErrorType toggleErrorType = new ToggleErrorType("NETWORK", 0, R.string.preference_change_network_error);
            e = toggleErrorType;
            ToggleErrorType toggleErrorType2 = new ToggleErrorType("SERVER", 1, R.string.preference_change_server_error);
            f = toggleErrorType2;
            ToggleErrorType[] toggleErrorTypeArr = {toggleErrorType, toggleErrorType2};
            g = toggleErrorTypeArr;
            h = EnumEntriesKt.a(toggleErrorTypeArr);
        }

        public ToggleErrorType(String str, int i, int i2) {
            this.d = i2;
        }

        public static ToggleErrorType valueOf(String str) {
            return (ToggleErrorType) Enum.valueOf(ToggleErrorType.class, str);
        }

        public static ToggleErrorType[] values() {
            return (ToggleErrorType[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$ViewState;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Text f5739a;
        public final List b;
        public final boolean c;
        public final RewardsPreferenceDetailsErrorState d;
        public final boolean e;

        public ViewState(Text text, List items, boolean z, RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState, boolean z2) {
            Intrinsics.h(items, "items");
            this.f5739a = text;
            this.b = items;
            this.c = z;
            this.d = rewardsPreferenceDetailsErrorState;
            this.e = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f5739a, viewState.f5739a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e;
        }

        public final int hashCode() {
            Text text = this.f5739a;
            int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.d((text == null ? 0 : text.hashCode()) * 31, 31, this.b), 31, this.c);
            RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState = this.d;
            return Boolean.hashCode(this.e) + ((iE + (rewardsPreferenceDetailsErrorState != null ? rewardsPreferenceDetailsErrorState.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(title=");
            sb.append(this.f5739a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", isLoading=");
            sb.append(this.c);
            sb.append(", errorState=");
            sb.append(this.d);
            sb.append(", isToggling=");
            return YU.a.k(")", sb, this.e);
        }

        public /* synthetic */ ViewState(Text text, List list, RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState, int i) {
            this((i & 1) != 0 ? null : text, (i & 2) != 0 ? EmptyList.d : list, (i & 4) == 0, (i & 8) != 0 ? null : rewardsPreferenceDetailsErrorState, false);
        }
    }
}
