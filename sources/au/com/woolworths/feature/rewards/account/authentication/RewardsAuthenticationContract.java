package au.com.woolworths.feature.rewards.account.authentication;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.network.SharedHeaders;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract;", "", "ViewState", "Result", "Actions", "AuthType", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsAuthenticationContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;", "", "CloseScreen", "LoadLinkUrl", "LoadSignUpUrl", "DisplayLinkError", "LaunchHomepage", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$DisplayLinkError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$LaunchHomepage;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$LoadLinkUrl;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$LoadSignUpUrl;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f5650a;

            public CloseScreen(boolean z) {
                this.f5650a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseScreen) && this.f5650a == ((CloseScreen) obj).f5650a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f5650a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("CloseScreen(success=", ")", this.f5650a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$DisplayLinkError;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayLinkError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5651a;

            public DisplayLinkError(String message) {
                Intrinsics.h(message, "message");
                this.f5651a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayLinkError) && Intrinsics.c(this.f5651a, ((DisplayLinkError) obj).f5651a);
            }

            public final int hashCode() {
                return this.f5651a.hashCode();
            }

            public final String toString() {
                return YU.a.h("DisplayLinkError(message=", this.f5651a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$LaunchHomepage;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchHomepage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHomepage f5652a = new LaunchHomepage();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$LoadLinkUrl;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LoadLinkUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5653a;

            public LoadLinkUrl(String url) {
                Intrinsics.h(url, "url");
                this.f5653a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LoadLinkUrl) && Intrinsics.c(this.f5653a, ((LoadLinkUrl) obj).f5653a);
            }

            public final int hashCode() {
                return this.f5653a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LoadLinkUrl(url=", this.f5653a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions$LoadSignUpUrl;", "Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LoadSignUpUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5654a;
            public final SharedHeaders b;

            public LoadSignUpUrl(String url, SharedHeaders sharedHeaders) {
                Intrinsics.h(url, "url");
                Intrinsics.h(sharedHeaders, "sharedHeaders");
                this.f5654a = url;
                this.b = sharedHeaders;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LoadSignUpUrl)) {
                    return false;
                }
                LoadSignUpUrl loadSignUpUrl = (LoadSignUpUrl) obj;
                return Intrinsics.c(this.f5654a, loadSignUpUrl.f5654a) && Intrinsics.c(this.b, loadSignUpUrl.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5654a.hashCode() * 31);
            }

            public final String toString() {
                return "LoadSignUpUrl(url=" + this.f5654a + ", sharedHeaders=" + this.b + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$AuthType;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AuthType {
        public static final AuthType d;
        public static final AuthType e;
        public static final /* synthetic */ AuthType[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            AuthType authType = new AuthType("STEP_UP", 0);
            d = authType;
            AuthType authType2 = new AuthType("NORMAL", 1);
            e = authType2;
            AuthType[] authTypeArr = {authType, authType2};
            f = authTypeArr;
            g = EnumEntriesKt.a(authTypeArr);
        }

        public static AuthType valueOf(String str) {
            return (AuthType) Enum.valueOf(AuthType.class, str);
        }

        public static AuthType[] values() {
            return (AuthType[]) f.clone();
        }
    }

    @StabilityInferred
    @Parcelize
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$Result;", "Landroid/os/Parcelable;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Result implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public final String d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Result> {
            @Override // android.os.Parcelable.Creator
            public final Result createFromParcel(Parcel parcel) {
                Intrinsics.h(parcel, "parcel");
                return new Result(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result(String message) {
            Intrinsics.h(message, "message");
            this.d = message;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Result) && Intrinsics.c(this.d, ((Result) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return YU.a.h("Result(message=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.h(dest, "dest");
            dest.writeString(this.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/authentication/RewardsAuthenticationContract$ViewState;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5655a;
        public final RewardsAuthenticationFullPageErrorState b;

        public ViewState(boolean z, RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState) {
            this.f5655a = z;
            this.b = rewardsAuthenticationFullPageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5655a == viewState.f5655a && this.b == viewState.b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f5655a) * 31;
            RewardsAuthenticationFullPageErrorState rewardsAuthenticationFullPageErrorState = this.b;
            return iHashCode + (rewardsAuthenticationFullPageErrorState == null ? 0 : rewardsAuthenticationFullPageErrorState.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f5655a + ", errorState=" + this.b + ")";
        }
    }
}
