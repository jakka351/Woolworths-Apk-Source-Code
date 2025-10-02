package com.woolworths.rewards.redemptionsettings.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "InfoItem", "SecurePreference", "LoadingState", "Analytics", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsSecurePreferenceFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f21115a;
    public final String b;
    public final ArrayList c;
    public final SecurePreference d;
    public final LoadingState e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$Analytics;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21116a;

        public Analytics(String str) {
            this.f21116a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f21116a, ((Analytics) obj).f21116a);
        }

        public final int hashCode() {
            return this.f21116a.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f21116a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$InfoItem;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f21117a;
        public final Boolean b;
        public final String c;
        public final String d;

        public InfoItem(String str, Boolean bool, String str2, String str3) {
            this.f21117a = str;
            this.b = bool;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoItem)) {
                return false;
            }
            InfoItem infoItem = (InfoItem) obj;
            return Intrinsics.c(this.f21117a, infoItem.f21117a) && Intrinsics.c(this.b, infoItem.b) && Intrinsics.c(this.c, infoItem.c) && Intrinsics.c(this.d, infoItem.d);
        }

        public final int hashCode() {
            int iHashCode = this.f21117a.hashCode() * 31;
            Boolean bool = this.b;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InfoItem(bulletText=");
            sb.append(this.f21117a);
            sb.append(", isEmoji=");
            sb.append(this.b);
            sb.append(", itemTitle=");
            return androidx.constraintlayout.core.state.a.l(sb, this.c, ", markdownDescription=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$LoadingState;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LoadingState {

        /* renamed from: a, reason: collision with root package name */
        public final String f21118a;
        public final String b;

        public LoadingState(String str, String str2) {
            this.f21118a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LoadingState)) {
                return false;
            }
            LoadingState loadingState = (LoadingState) obj;
            return Intrinsics.c(this.f21118a, loadingState.f21118a) && Intrinsics.c(this.b, loadingState.b);
        }

        public final int hashCode() {
            String str = this.f21118a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("LoadingState(title=", this.f21118a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RewardsSecurePreferenceFields$SecurePreference;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecurePreference {

        /* renamed from: a, reason: collision with root package name */
        public final String f21119a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final Analytics f;
        public final String g;

        public SecurePreference(String str, String str2, boolean z, String str3, String str4, Analytics analytics, String str5) {
            this.f21119a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = analytics;
            this.g = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecurePreference)) {
                return false;
            }
            SecurePreference securePreference = (SecurePreference) obj;
            return Intrinsics.c(this.f21119a, securePreference.f21119a) && Intrinsics.c(this.b, securePreference.b) && this.c == securePreference.c && Intrinsics.c(this.d, securePreference.d) && Intrinsics.c(this.e, securePreference.e) && Intrinsics.c(this.f, securePreference.f) && Intrinsics.c(this.g, securePreference.g);
        }

        public final int hashCode() {
            int iHashCode = this.f21119a.hashCode() * 31;
            String str = this.b;
            int iC = b.c(b.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
            String str2 = this.e;
            int iC2 = b.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f.f21116a);
            String str3 = this.g;
            return iC2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("SecurePreference(title=", this.f21119a, ", subtitle=", this.b, ", value=");
            au.com.woolworths.android.onesite.a.y(", id=", this.d, ", altText=", sbV, this.c);
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", iconUrl=");
            return a.o(sbV, this.g, ")");
        }
    }

    public RewardsSecurePreferenceFields(String str, String str2, ArrayList arrayList, SecurePreference securePreference, LoadingState loadingState) {
        this.f21115a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = securePreference;
        this.e = loadingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsSecurePreferenceFields)) {
            return false;
        }
        RewardsSecurePreferenceFields rewardsSecurePreferenceFields = (RewardsSecurePreferenceFields) obj;
        return this.f21115a.equals(rewardsSecurePreferenceFields.f21115a) && this.b.equals(rewardsSecurePreferenceFields.b) && this.c.equals(rewardsSecurePreferenceFields.c) && this.d.equals(rewardsSecurePreferenceFields.d) && this.e.equals(rewardsSecurePreferenceFields.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c(this.f21115a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbV = a.v("RewardsSecurePreferenceFields(title=", this.f21115a, ", summary=", this.b, ", infoItems=");
        sbV.append(this.c);
        sbV.append(", securePreference=");
        sbV.append(this.d);
        sbV.append(", loadingState=");
        sbV.append(this.e);
        sbV.append(")");
        return sbV.toString();
    }
}
