package au.com.woolworths.feature.rewards.everydayextras.signup.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "PrimaryCta", "SecondaryCta", "Analytics", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubscribeAlertDialogFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f6176a;
    public final Boolean b;
    public final String c;
    public final String d;
    public final PrimaryCta e;
    public final SecondaryCta f;
    public final Analytics g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment$Analytics;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f6177a;
        public final String b;

        public Analytics(String str, String str2) {
            this.f6177a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f6177a, analytics.f6177a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6177a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Analytics(eventCategory=", this.f6177a, ", eventDescription=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment$PrimaryCta;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f6178a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f6178a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f6178a, primaryCta.f6178a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6178a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f6178a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/fragment/SubscribeAlertDialogFragment$SecondaryCta;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f6179a;
        public final String b;

        public SecondaryCta(String str, String str2) {
            this.f6179a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryCta)) {
                return false;
            }
            SecondaryCta secondaryCta = (SecondaryCta) obj;
            return Intrinsics.c(this.f6179a, secondaryCta.f6179a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f6179a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("SecondaryCta(label=", this.f6179a, ", url=", this.b, ")");
        }
    }

    public SubscribeAlertDialogFragment(String str, Boolean bool, String str2, String str3, PrimaryCta primaryCta, SecondaryCta secondaryCta, Analytics analytics) {
        this.f6176a = str;
        this.b = bool;
        this.c = str2;
        this.d = str3;
        this.e = primaryCta;
        this.f = secondaryCta;
        this.g = analytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubscribeAlertDialogFragment)) {
            return false;
        }
        SubscribeAlertDialogFragment subscribeAlertDialogFragment = (SubscribeAlertDialogFragment) obj;
        return Intrinsics.c(this.f6176a, subscribeAlertDialogFragment.f6176a) && Intrinsics.c(this.b, subscribeAlertDialogFragment.b) && Intrinsics.c(this.c, subscribeAlertDialogFragment.c) && Intrinsics.c(this.d, subscribeAlertDialogFragment.d) && Intrinsics.c(this.e, subscribeAlertDialogFragment.e) && Intrinsics.c(this.f, subscribeAlertDialogFragment.f) && Intrinsics.c(this.g, subscribeAlertDialogFragment.g);
    }

    public final int hashCode() {
        int iHashCode = this.f6176a.hashCode() * 31;
        Boolean bool = this.b;
        int iHashCode2 = (this.e.hashCode() + b.c(b.c((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c), 31, this.d)) * 31;
        SecondaryCta secondaryCta = this.f;
        int iHashCode3 = (iHashCode2 + (secondaryCta == null ? 0 : secondaryCta.hashCode())) * 31;
        Analytics analytics = this.g;
        return iHashCode3 + (analytics != null ? analytics.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubscribeAlertDialogFragment(__typename=");
        sb.append(this.f6176a);
        sb.append(", resetPaymentForm=");
        sb.append(this.b);
        sb.append(", title=");
        androidx.constraintlayout.core.state.a.B(sb, this.c, ", message=", this.d, ", primaryCta=");
        sb.append(this.e);
        sb.append(", secondaryCta=");
        sb.append(this.f);
        sb.append(", analytics=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
