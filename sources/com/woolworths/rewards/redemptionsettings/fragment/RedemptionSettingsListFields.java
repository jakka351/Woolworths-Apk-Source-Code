package com.woolworths.rewards.redemptionsettings.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.rewards.graphql.type.RewardsRedemptionSettingIcon;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "TwoFactorAuth", "Item", "Actions", "ConfirmationMessage", "Cta", "Cta1", "Item1", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RedemptionSettingsListFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final TwoFactorAuth f21099a;
    public final ArrayList b;
    public final Actions c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Actions;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Actions {

        /* renamed from: a, reason: collision with root package name */
        public final String f21100a;
        public final ArrayList b;

        public Actions(String str, ArrayList arrayList) {
            this.f21100a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Actions)) {
                return false;
            }
            Actions actions = (Actions) obj;
            return this.f21100a.equals(actions.f21100a) && this.b.equals(actions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21100a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("Actions(title=", this.f21100a, ", items=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$ConfirmationMessage;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ConfirmationMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f21101a;
        public final String b;
        public final String c;

        public ConfirmationMessage(String str, String str2, String str3) {
            this.f21101a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ConfirmationMessage)) {
                return false;
            }
            ConfirmationMessage confirmationMessage = (ConfirmationMessage) obj;
            return Intrinsics.c(this.f21101a, confirmationMessage.f21101a) && Intrinsics.c(this.b, confirmationMessage.b) && Intrinsics.c(this.c, confirmationMessage.c);
        }

        public final int hashCode() {
            String str = this.f21101a;
            return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("ConfirmationMessage(title=", this.f21101a, ", message=", this.b, ", buttonLabel="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Cta;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f21102a;
        public final Cta1 b;

        public Cta(String str, Cta1 cta1) {
            this.f21102a = str;
            this.b = cta1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f21102a, cta.f21102a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21102a.hashCode() * 31);
        }

        public final String toString() {
            return "Cta(iconUrl=" + this.f21102a + ", cta=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Cta1;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21103a;
        public final String b;

        public Cta1(String str, String str2) {
            this.f21103a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta1)) {
                return false;
            }
            Cta1 cta1 = (Cta1) obj;
            return Intrinsics.c(this.f21103a, cta1.f21103a) && Intrinsics.c(this.b, cta1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21103a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Cta1(label=", this.f21103a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Item;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21104a;
        public final RewardsRedemptionSettingIcon b;
        public final String c;
        public final String d;
        public final List e;
        public final Boolean f;
        public final Cta g;

        public Item(boolean z, RewardsRedemptionSettingIcon rewardsRedemptionSettingIcon, String str, String str2, List list, Boolean bool, Cta cta) {
            this.f21104a = z;
            this.b = rewardsRedemptionSettingIcon;
            this.c = str;
            this.d = str2;
            this.e = list;
            this.f = bool;
            this.g = cta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return this.f21104a == item.f21104a && this.b == item.b && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c((this.b.hashCode() + (Boolean.hashCode(this.f21104a) * 31)) * 31, 31, this.c), 31, this.d);
            List list = this.e;
            int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
            Boolean bool = this.f;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Cta cta = this.g;
            return iHashCode2 + (cta != null ? cta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(isSelected=");
            sb.append(this.f21104a);
            sb.append(", icon=");
            sb.append(this.b);
            sb.append(", title=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", body=", this.d, ", confirmationMessages=");
            sb.append(this.e);
            sb.append(", isChangeEnabled=");
            sb.append(this.f);
            sb.append(", cta=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$Item1;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21105a;
        public final String b;
        public final String c;
        public final String d;

        public Item1(String str, String str2, String str3, String str4) {
            this.f21105a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f21105a, item1.f21105a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c) && Intrinsics.c(this.d, item1.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f21105a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("Item1(iconUrl=", this.f21105a, ", title=", this.b, ", body="), this.c, ", actionUrl=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/redemptionsettings/fragment/RedemptionSettingsListFields$TwoFactorAuth;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TwoFactorAuth {

        /* renamed from: a, reason: collision with root package name */
        public final String f21106a;

        public TwoFactorAuth(String str) {
            this.f21106a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TwoFactorAuth) && Intrinsics.c(this.f21106a, ((TwoFactorAuth) obj).f21106a);
        }

        public final int hashCode() {
            return this.f21106a.hashCode();
        }

        public final String toString() {
            return a.h("TwoFactorAuth(stepUpUrl=", this.f21106a, ")");
        }
    }

    public RedemptionSettingsListFields(TwoFactorAuth twoFactorAuth, ArrayList arrayList, Actions actions) {
        this.f21099a = twoFactorAuth;
        this.b = arrayList;
        this.c = actions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedemptionSettingsListFields)) {
            return false;
        }
        RedemptionSettingsListFields redemptionSettingsListFields = (RedemptionSettingsListFields) obj;
        return Intrinsics.c(this.f21099a, redemptionSettingsListFields.f21099a) && this.b.equals(redemptionSettingsListFields.b) && Intrinsics.c(this.c, redemptionSettingsListFields.c);
    }

    public final int hashCode() {
        TwoFactorAuth twoFactorAuth = this.f21099a;
        int iB = androidx.compose.ui.input.pointer.a.b((twoFactorAuth == null ? 0 : twoFactorAuth.f21106a.hashCode()) * 31, 31, this.b);
        Actions actions = this.c;
        return iB + (actions != null ? actions.hashCode() : 0);
    }

    public final String toString() {
        return "RedemptionSettingsListFields(twoFactorAuth=" + this.f21099a + ", items=" + this.b + ", actions=" + this.c + ")";
    }
}
