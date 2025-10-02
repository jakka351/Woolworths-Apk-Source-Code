package com.woolworths.feature.shop.account;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.feature.shop.account.adapter.AccountDetailsQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:'\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Data;", "Data", "AccountDetails", "Feed", "OnMyAccountPersonalDetails", "RowItem", "LeadingAsset", "OnHostedIcon", "OnCoreIcon", "TrailingAsset", "OnHostedIcon1", "OnCoreIcon1", "OnMyAccountBusinessDetails", "RowItem1", "LeadingAsset1", "OnHostedIcon2", "OnCoreIcon2", "TrailingAsset1", "OnHostedIcon3", "OnCoreIcon3", "OnMyAccountContactDetails", "RowItem2", "LeadingAsset2", "OnHostedIcon4", "OnCoreIcon4", "TrailingAsset2", "OnHostedIcon5", "OnCoreIcon5", "OnMyAccountPreferences", "RowItem3", "LeadingAsset3", "OnHostedIcon6", "OnCoreIcon6", "TrailingAsset3", "OnHostedIcon7", "OnCoreIcon7", "OnMyAccountFooter", "Button", "ButtonAction", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AccountDetailsQuery implements Query<Data> {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$AccountDetails;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AccountDetails {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19303a;

        public AccountDetails(ArrayList arrayList) {
            this.f19303a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AccountDetails) && this.f19303a.equals(((AccountDetails) obj).f19303a);
        }

        public final int hashCode() {
            return this.f19303a.hashCode();
        }

        public final String toString() {
            return a.k("AccountDetails(feed=", ")", this.f19303a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Button;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f19304a;
        public final ButtonStyle b;
        public final boolean c;
        public final ButtonAction d;
        public final String e;

        public Button(String str, ButtonStyle buttonStyle, boolean z, ButtonAction buttonAction, String str2) {
            this.f19304a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = buttonAction;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f19304a, button.f19304a) && this.b == button.b && this.c == button.c && Intrinsics.c(this.d, button.d) && Intrinsics.c(this.e, button.e);
        }

        public final int hashCode() {
            int iHashCode = this.f19304a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            ButtonAction buttonAction = this.d;
            int iHashCode2 = (iE + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str = this.e;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("Button(label=", this.f19304a, ", style=", this.b, ", enabled=");
            sbQ.append(this.c);
            sbQ.append(", buttonAction=");
            sbQ.append(this.d);
            sbQ.append(", iconUrl=");
            return YU.a.o(sbQ, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$ButtonAction;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19305a;
        public final String b;
        public final ActionType c;

        public ButtonAction(ActionType actionType, String str, String str2) {
            this.f19305a = str;
            this.b = str2;
            this.c = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return Intrinsics.c(this.f19305a, buttonAction.f19305a) && Intrinsics.c(this.b, buttonAction.b) && this.c == buttonAction.c;
        }

        public final int hashCode() {
            String str = this.f19305a;
            return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ButtonAction(id=", this.f19305a, ", action=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final AccountDetails f19306a;

        public Data(AccountDetails accountDetails) {
            this.f19306a = accountDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f19306a, ((Data) obj).f19306a);
        }

        public final int hashCode() {
            return this.f19306a.f19303a.hashCode();
        }

        public final String toString() {
            return "Data(accountDetails=" + this.f19306a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$Feed;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f19307a;
        public final OnMyAccountPersonalDetails b;
        public final OnMyAccountBusinessDetails c;
        public final OnMyAccountContactDetails d;
        public final OnMyAccountPreferences e;
        public final OnMyAccountFooter f;

        public Feed(String __typename, OnMyAccountPersonalDetails onMyAccountPersonalDetails, OnMyAccountBusinessDetails onMyAccountBusinessDetails, OnMyAccountContactDetails onMyAccountContactDetails, OnMyAccountPreferences onMyAccountPreferences, OnMyAccountFooter onMyAccountFooter) {
            Intrinsics.h(__typename, "__typename");
            this.f19307a = __typename;
            this.b = onMyAccountPersonalDetails;
            this.c = onMyAccountBusinessDetails;
            this.d = onMyAccountContactDetails;
            this.e = onMyAccountPreferences;
            this.f = onMyAccountFooter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f19307a, feed.f19307a) && Intrinsics.c(this.b, feed.b) && Intrinsics.c(this.c, feed.c) && Intrinsics.c(this.d, feed.d) && Intrinsics.c(this.e, feed.e) && Intrinsics.c(this.f, feed.f);
        }

        public final int hashCode() {
            int iHashCode = this.f19307a.hashCode() * 31;
            OnMyAccountPersonalDetails onMyAccountPersonalDetails = this.b;
            int iHashCode2 = (iHashCode + (onMyAccountPersonalDetails == null ? 0 : onMyAccountPersonalDetails.hashCode())) * 31;
            OnMyAccountBusinessDetails onMyAccountBusinessDetails = this.c;
            int iHashCode3 = (iHashCode2 + (onMyAccountBusinessDetails == null ? 0 : onMyAccountBusinessDetails.hashCode())) * 31;
            OnMyAccountContactDetails onMyAccountContactDetails = this.d;
            int iHashCode4 = (iHashCode3 + (onMyAccountContactDetails == null ? 0 : onMyAccountContactDetails.hashCode())) * 31;
            OnMyAccountPreferences onMyAccountPreferences = this.e;
            int iHashCode5 = (iHashCode4 + (onMyAccountPreferences == null ? 0 : onMyAccountPreferences.hashCode())) * 31;
            OnMyAccountFooter onMyAccountFooter = this.f;
            return iHashCode5 + (onMyAccountFooter != null ? onMyAccountFooter.f19330a.hashCode() : 0);
        }

        public final String toString() {
            return "Feed(__typename=" + this.f19307a + ", onMyAccountPersonalDetails=" + this.b + ", onMyAccountBusinessDetails=" + this.c + ", onMyAccountContactDetails=" + this.d + ", onMyAccountPreferences=" + this.e + ", onMyAccountFooter=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f19308a;
        public final OnHostedIcon b;
        public final OnCoreIcon c;

        public LeadingAsset(String __typename, OnHostedIcon onHostedIcon, OnCoreIcon onCoreIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f19308a = __typename;
            this.b = onHostedIcon;
            this.c = onCoreIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset)) {
                return false;
            }
            LeadingAsset leadingAsset = (LeadingAsset) obj;
            return Intrinsics.c(this.f19308a, leadingAsset.f19308a) && Intrinsics.c(this.b, leadingAsset.b) && Intrinsics.c(this.c, leadingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19308a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f19320a.hashCode())) * 31;
            OnCoreIcon onCoreIcon = this.c;
            return iHashCode2 + (onCoreIcon != null ? onCoreIcon.f19312a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset(__typename=" + this.f19308a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19309a;
        public final OnHostedIcon2 b;
        public final OnCoreIcon2 c;

        public LeadingAsset1(String __typename, OnHostedIcon2 onHostedIcon2, OnCoreIcon2 onCoreIcon2) {
            Intrinsics.h(__typename, "__typename");
            this.f19309a = __typename;
            this.b = onHostedIcon2;
            this.c = onCoreIcon2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset1)) {
                return false;
            }
            LeadingAsset1 leadingAsset1 = (LeadingAsset1) obj;
            return Intrinsics.c(this.f19309a, leadingAsset1.f19309a) && Intrinsics.c(this.b, leadingAsset1.b) && Intrinsics.c(this.c, leadingAsset1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19309a.hashCode() * 31;
            OnHostedIcon2 onHostedIcon2 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon2 == null ? 0 : onHostedIcon2.f19322a.hashCode())) * 31;
            OnCoreIcon2 onCoreIcon2 = this.c;
            return iHashCode2 + (onCoreIcon2 != null ? onCoreIcon2.f19314a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset1(__typename=" + this.f19309a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19310a;
        public final OnHostedIcon4 b;
        public final OnCoreIcon4 c;

        public LeadingAsset2(String __typename, OnHostedIcon4 onHostedIcon4, OnCoreIcon4 onCoreIcon4) {
            Intrinsics.h(__typename, "__typename");
            this.f19310a = __typename;
            this.b = onHostedIcon4;
            this.c = onCoreIcon4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset2)) {
                return false;
            }
            LeadingAsset2 leadingAsset2 = (LeadingAsset2) obj;
            return Intrinsics.c(this.f19310a, leadingAsset2.f19310a) && Intrinsics.c(this.b, leadingAsset2.b) && Intrinsics.c(this.c, leadingAsset2.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19310a.hashCode() * 31;
            OnHostedIcon4 onHostedIcon4 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon4 == null ? 0 : onHostedIcon4.f19324a.hashCode())) * 31;
            OnCoreIcon4 onCoreIcon4 = this.c;
            return iHashCode2 + (onCoreIcon4 != null ? onCoreIcon4.f19316a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset2(__typename=" + this.f19310a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$LeadingAsset3;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19311a;
        public final OnHostedIcon6 b;
        public final OnCoreIcon6 c;

        public LeadingAsset3(String __typename, OnHostedIcon6 onHostedIcon6, OnCoreIcon6 onCoreIcon6) {
            Intrinsics.h(__typename, "__typename");
            this.f19311a = __typename;
            this.b = onHostedIcon6;
            this.c = onCoreIcon6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset3)) {
                return false;
            }
            LeadingAsset3 leadingAsset3 = (LeadingAsset3) obj;
            return Intrinsics.c(this.f19311a, leadingAsset3.f19311a) && Intrinsics.c(this.b, leadingAsset3.b) && Intrinsics.c(this.c, leadingAsset3.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19311a.hashCode() * 31;
            OnHostedIcon6 onHostedIcon6 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon6 == null ? 0 : onHostedIcon6.f19326a.hashCode())) * 31;
            OnCoreIcon6 onCoreIcon6 = this.c;
            return iHashCode2 + (onCoreIcon6 != null ? onCoreIcon6.f19318a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset3(__typename=" + this.f19311a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19312a;

        public OnCoreIcon(String str) {
            this.f19312a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f19312a, ((OnCoreIcon) obj).f19312a);
        }

        public final int hashCode() {
            return this.f19312a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon(coreIconName=", this.f19312a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19313a;

        public OnCoreIcon1(String str) {
            this.f19313a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon1) && Intrinsics.c(this.f19313a, ((OnCoreIcon1) obj).f19313a);
        }

        public final int hashCode() {
            return this.f19313a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon1(coreIconName=", this.f19313a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19314a;

        public OnCoreIcon2(String str) {
            this.f19314a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon2) && Intrinsics.c(this.f19314a, ((OnCoreIcon2) obj).f19314a);
        }

        public final int hashCode() {
            return this.f19314a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon2(coreIconName=", this.f19314a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon3;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19315a;

        public OnCoreIcon3(String str) {
            this.f19315a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon3) && Intrinsics.c(this.f19315a, ((OnCoreIcon3) obj).f19315a);
        }

        public final int hashCode() {
            return this.f19315a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon3(coreIconName=", this.f19315a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon4;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19316a;

        public OnCoreIcon4(String str) {
            this.f19316a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon4) && Intrinsics.c(this.f19316a, ((OnCoreIcon4) obj).f19316a);
        }

        public final int hashCode() {
            return this.f19316a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon4(coreIconName=", this.f19316a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon5;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19317a;

        public OnCoreIcon5(String str) {
            this.f19317a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon5) && Intrinsics.c(this.f19317a, ((OnCoreIcon5) obj).f19317a);
        }

        public final int hashCode() {
            return this.f19317a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon5(coreIconName=", this.f19317a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon6;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon6 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19318a;

        public OnCoreIcon6(String str) {
            this.f19318a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon6) && Intrinsics.c(this.f19318a, ((OnCoreIcon6) obj).f19318a);
        }

        public final int hashCode() {
            return this.f19318a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon6(coreIconName=", this.f19318a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnCoreIcon7;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon7 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19319a;

        public OnCoreIcon7(String str) {
            this.f19319a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon7) && Intrinsics.c(this.f19319a, ((OnCoreIcon7) obj).f19319a);
        }

        public final int hashCode() {
            return this.f19319a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon7(coreIconName=", this.f19319a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19320a;

        public OnHostedIcon(String str) {
            this.f19320a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f19320a, ((OnHostedIcon) obj).f19320a);
        }

        public final int hashCode() {
            return this.f19320a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon(url=", this.f19320a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19321a;

        public OnHostedIcon1(String str) {
            this.f19321a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f19321a, ((OnHostedIcon1) obj).f19321a);
        }

        public final int hashCode() {
            return this.f19321a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon1(url=", this.f19321a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19322a;

        public OnHostedIcon2(String str) {
            this.f19322a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon2) && Intrinsics.c(this.f19322a, ((OnHostedIcon2) obj).f19322a);
        }

        public final int hashCode() {
            return this.f19322a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon2(url=", this.f19322a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon3;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19323a;

        public OnHostedIcon3(String str) {
            this.f19323a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon3) && Intrinsics.c(this.f19323a, ((OnHostedIcon3) obj).f19323a);
        }

        public final int hashCode() {
            return this.f19323a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon3(url=", this.f19323a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon4;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19324a;

        public OnHostedIcon4(String str) {
            this.f19324a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon4) && Intrinsics.c(this.f19324a, ((OnHostedIcon4) obj).f19324a);
        }

        public final int hashCode() {
            return this.f19324a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon4(url=", this.f19324a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon5;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19325a;

        public OnHostedIcon5(String str) {
            this.f19325a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon5) && Intrinsics.c(this.f19325a, ((OnHostedIcon5) obj).f19325a);
        }

        public final int hashCode() {
            return this.f19325a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon5(url=", this.f19325a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon6;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon6 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19326a;

        public OnHostedIcon6(String str) {
            this.f19326a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon6) && Intrinsics.c(this.f19326a, ((OnHostedIcon6) obj).f19326a);
        }

        public final int hashCode() {
            return this.f19326a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon6(url=", this.f19326a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnHostedIcon7;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon7 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19327a;

        public OnHostedIcon7(String str) {
            this.f19327a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon7) && Intrinsics.c(this.f19327a, ((OnHostedIcon7) obj).f19327a);
        }

        public final int hashCode() {
            return this.f19327a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon7(url=", this.f19327a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountBusinessDetails;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyAccountBusinessDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19328a;
        public final String b;
        public final ArrayList c;

        public OnMyAccountBusinessDetails(String str, String str2, ArrayList arrayList) {
            this.f19328a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyAccountBusinessDetails)) {
                return false;
            }
            OnMyAccountBusinessDetails onMyAccountBusinessDetails = (OnMyAccountBusinessDetails) obj;
            return this.f19328a.equals(onMyAccountBusinessDetails.f19328a) && Intrinsics.c(this.b, onMyAccountBusinessDetails.b) && this.c.equals(onMyAccountBusinessDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19328a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("OnMyAccountBusinessDetails(title=", this.f19328a, ", subtitle=", this.b, ", rowItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountContactDetails;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyAccountContactDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19329a;
        public final String b;
        public final ArrayList c;

        public OnMyAccountContactDetails(String str, String str2, ArrayList arrayList) {
            this.f19329a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyAccountContactDetails)) {
                return false;
            }
            OnMyAccountContactDetails onMyAccountContactDetails = (OnMyAccountContactDetails) obj;
            return this.f19329a.equals(onMyAccountContactDetails.f19329a) && Intrinsics.c(this.b, onMyAccountContactDetails.b) && this.c.equals(onMyAccountContactDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19329a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("OnMyAccountContactDetails(title=", this.f19329a, ", subtitle=", this.b, ", rowItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountFooter;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyAccountFooter {

        /* renamed from: a, reason: collision with root package name */
        public final Button f19330a;

        public OnMyAccountFooter(Button button) {
            this.f19330a = button;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnMyAccountFooter) && Intrinsics.c(this.f19330a, ((OnMyAccountFooter) obj).f19330a);
        }

        public final int hashCode() {
            return this.f19330a.hashCode();
        }

        public final String toString() {
            return "OnMyAccountFooter(button=" + this.f19330a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountPersonalDetails;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyAccountPersonalDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f19331a;
        public final String b;
        public final ArrayList c;

        public OnMyAccountPersonalDetails(String str, String str2, ArrayList arrayList) {
            this.f19331a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyAccountPersonalDetails)) {
                return false;
            }
            OnMyAccountPersonalDetails onMyAccountPersonalDetails = (OnMyAccountPersonalDetails) obj;
            return this.f19331a.equals(onMyAccountPersonalDetails.f19331a) && Intrinsics.c(this.b, onMyAccountPersonalDetails.b) && this.c.equals(onMyAccountPersonalDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19331a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("OnMyAccountPersonalDetails(title=", this.f19331a, ", subtitle=", this.b, ", rowItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$OnMyAccountPreferences;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyAccountPreferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f19332a;
        public final String b;
        public final ArrayList c;

        public OnMyAccountPreferences(String str, String str2, ArrayList arrayList) {
            this.f19332a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyAccountPreferences)) {
                return false;
            }
            OnMyAccountPreferences onMyAccountPreferences = (OnMyAccountPreferences) obj;
            return this.f19332a.equals(onMyAccountPreferences.f19332a) && Intrinsics.c(this.b, onMyAccountPreferences.b) && this.c.equals(onMyAccountPreferences.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19332a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("OnMyAccountPreferences(title=", this.f19332a, ", subtitle=", this.b, ", rowItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19333a;
        public final String b;
        public final LeadingAsset c;
        public final String d;
        public final TrailingAsset e;

        public RowItem(String str, String str2, LeadingAsset leadingAsset, String str3, TrailingAsset trailingAsset) {
            this.f19333a = str;
            this.b = str2;
            this.c = leadingAsset;
            this.d = str3;
            this.e = trailingAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowItem)) {
                return false;
            }
            RowItem rowItem = (RowItem) obj;
            return Intrinsics.c(this.f19333a, rowItem.f19333a) && Intrinsics.c(this.b, rowItem.b) && Intrinsics.c(this.c, rowItem.c) && Intrinsics.c(this.d, rowItem.d) && Intrinsics.c(this.e, rowItem.e);
        }

        public final int hashCode() {
            String str = this.f19333a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            LeadingAsset leadingAsset = this.c;
            int iHashCode = (iC + (leadingAsset == null ? 0 : leadingAsset.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TrailingAsset trailingAsset = this.e;
            return iHashCode2 + (trailingAsset != null ? trailingAsset.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("RowItem(description=", this.f19333a, ", label=", this.b, ", leadingAsset=");
            sbV.append(this.c);
            sbV.append(", overlineText=");
            sbV.append(this.d);
            sbV.append(", trailingAsset=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowItem1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19334a;
        public final String b;
        public final LeadingAsset1 c;
        public final String d;
        public final TrailingAsset1 e;

        public RowItem1(String str, String str2, LeadingAsset1 leadingAsset1, String str3, TrailingAsset1 trailingAsset1) {
            this.f19334a = str;
            this.b = str2;
            this.c = leadingAsset1;
            this.d = str3;
            this.e = trailingAsset1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowItem1)) {
                return false;
            }
            RowItem1 rowItem1 = (RowItem1) obj;
            return Intrinsics.c(this.f19334a, rowItem1.f19334a) && Intrinsics.c(this.b, rowItem1.b) && Intrinsics.c(this.c, rowItem1.c) && Intrinsics.c(this.d, rowItem1.d) && Intrinsics.c(this.e, rowItem1.e);
        }

        public final int hashCode() {
            String str = this.f19334a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            LeadingAsset1 leadingAsset1 = this.c;
            int iHashCode = (iC + (leadingAsset1 == null ? 0 : leadingAsset1.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TrailingAsset1 trailingAsset1 = this.e;
            return iHashCode2 + (trailingAsset1 != null ? trailingAsset1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("RowItem1(description=", this.f19334a, ", label=", this.b, ", leadingAsset=");
            sbV.append(this.c);
            sbV.append(", overlineText=");
            sbV.append(this.d);
            sbV.append(", trailingAsset=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowItem2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19335a;
        public final String b;
        public final LeadingAsset2 c;
        public final String d;
        public final TrailingAsset2 e;

        public RowItem2(String str, String str2, LeadingAsset2 leadingAsset2, String str3, TrailingAsset2 trailingAsset2) {
            this.f19335a = str;
            this.b = str2;
            this.c = leadingAsset2;
            this.d = str3;
            this.e = trailingAsset2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowItem2)) {
                return false;
            }
            RowItem2 rowItem2 = (RowItem2) obj;
            return Intrinsics.c(this.f19335a, rowItem2.f19335a) && Intrinsics.c(this.b, rowItem2.b) && Intrinsics.c(this.c, rowItem2.c) && Intrinsics.c(this.d, rowItem2.d) && Intrinsics.c(this.e, rowItem2.e);
        }

        public final int hashCode() {
            String str = this.f19335a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            LeadingAsset2 leadingAsset2 = this.c;
            int iHashCode = (iC + (leadingAsset2 == null ? 0 : leadingAsset2.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TrailingAsset2 trailingAsset2 = this.e;
            return iHashCode2 + (trailingAsset2 != null ? trailingAsset2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("RowItem2(description=", this.f19335a, ", label=", this.b, ", leadingAsset=");
            sbV.append(this.c);
            sbV.append(", overlineText=");
            sbV.append(this.d);
            sbV.append(", trailingAsset=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$RowItem3;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowItem3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19336a;
        public final String b;
        public final LeadingAsset3 c;
        public final String d;
        public final TrailingAsset3 e;

        public RowItem3(String str, String str2, LeadingAsset3 leadingAsset3, String str3, TrailingAsset3 trailingAsset3) {
            this.f19336a = str;
            this.b = str2;
            this.c = leadingAsset3;
            this.d = str3;
            this.e = trailingAsset3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowItem3)) {
                return false;
            }
            RowItem3 rowItem3 = (RowItem3) obj;
            return Intrinsics.c(this.f19336a, rowItem3.f19336a) && Intrinsics.c(this.b, rowItem3.b) && Intrinsics.c(this.c, rowItem3.c) && Intrinsics.c(this.d, rowItem3.d) && Intrinsics.c(this.e, rowItem3.e);
        }

        public final int hashCode() {
            String str = this.f19336a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            LeadingAsset3 leadingAsset3 = this.c;
            int iHashCode = (iC + (leadingAsset3 == null ? 0 : leadingAsset3.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            TrailingAsset3 trailingAsset3 = this.e;
            return iHashCode2 + (trailingAsset3 != null ? trailingAsset3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("RowItem3(description=", this.f19336a, ", label=", this.b, ", leadingAsset=");
            sbV.append(this.c);
            sbV.append(", overlineText=");
            sbV.append(this.d);
            sbV.append(", trailingAsset=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrailingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f19337a;
        public final OnHostedIcon1 b;
        public final OnCoreIcon1 c;

        public TrailingAsset(String __typename, OnHostedIcon1 onHostedIcon1, OnCoreIcon1 onCoreIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f19337a = __typename;
            this.b = onHostedIcon1;
            this.c = onCoreIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrailingAsset)) {
                return false;
            }
            TrailingAsset trailingAsset = (TrailingAsset) obj;
            return Intrinsics.c(this.f19337a, trailingAsset.f19337a) && Intrinsics.c(this.b, trailingAsset.b) && Intrinsics.c(this.c, trailingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19337a.hashCode() * 31;
            OnHostedIcon1 onHostedIcon1 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon1 == null ? 0 : onHostedIcon1.f19321a.hashCode())) * 31;
            OnCoreIcon1 onCoreIcon1 = this.c;
            return iHashCode2 + (onCoreIcon1 != null ? onCoreIcon1.f19313a.hashCode() : 0);
        }

        public final String toString() {
            return "TrailingAsset(__typename=" + this.f19337a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset1;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrailingAsset1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19338a;
        public final OnHostedIcon3 b;
        public final OnCoreIcon3 c;

        public TrailingAsset1(String __typename, OnHostedIcon3 onHostedIcon3, OnCoreIcon3 onCoreIcon3) {
            Intrinsics.h(__typename, "__typename");
            this.f19338a = __typename;
            this.b = onHostedIcon3;
            this.c = onCoreIcon3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrailingAsset1)) {
                return false;
            }
            TrailingAsset1 trailingAsset1 = (TrailingAsset1) obj;
            return Intrinsics.c(this.f19338a, trailingAsset1.f19338a) && Intrinsics.c(this.b, trailingAsset1.b) && Intrinsics.c(this.c, trailingAsset1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19338a.hashCode() * 31;
            OnHostedIcon3 onHostedIcon3 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon3 == null ? 0 : onHostedIcon3.f19323a.hashCode())) * 31;
            OnCoreIcon3 onCoreIcon3 = this.c;
            return iHashCode2 + (onCoreIcon3 != null ? onCoreIcon3.f19315a.hashCode() : 0);
        }

        public final String toString() {
            return "TrailingAsset1(__typename=" + this.f19338a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset2;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrailingAsset2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19339a;
        public final OnHostedIcon5 b;
        public final OnCoreIcon5 c;

        public TrailingAsset2(String __typename, OnHostedIcon5 onHostedIcon5, OnCoreIcon5 onCoreIcon5) {
            Intrinsics.h(__typename, "__typename");
            this.f19339a = __typename;
            this.b = onHostedIcon5;
            this.c = onCoreIcon5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrailingAsset2)) {
                return false;
            }
            TrailingAsset2 trailingAsset2 = (TrailingAsset2) obj;
            return Intrinsics.c(this.f19339a, trailingAsset2.f19339a) && Intrinsics.c(this.b, trailingAsset2.b) && Intrinsics.c(this.c, trailingAsset2.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19339a.hashCode() * 31;
            OnHostedIcon5 onHostedIcon5 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon5 == null ? 0 : onHostedIcon5.f19325a.hashCode())) * 31;
            OnCoreIcon5 onCoreIcon5 = this.c;
            return iHashCode2 + (onCoreIcon5 != null ? onCoreIcon5.f19317a.hashCode() : 0);
        }

        public final String toString() {
            return "TrailingAsset2(__typename=" + this.f19339a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/account/AccountDetailsQuery$TrailingAsset3;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TrailingAsset3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19340a;
        public final OnHostedIcon7 b;
        public final OnCoreIcon7 c;

        public TrailingAsset3(String __typename, OnHostedIcon7 onHostedIcon7, OnCoreIcon7 onCoreIcon7) {
            Intrinsics.h(__typename, "__typename");
            this.f19340a = __typename;
            this.b = onHostedIcon7;
            this.c = onCoreIcon7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TrailingAsset3)) {
                return false;
            }
            TrailingAsset3 trailingAsset3 = (TrailingAsset3) obj;
            return Intrinsics.c(this.f19340a, trailingAsset3.f19340a) && Intrinsics.c(this.b, trailingAsset3.b) && Intrinsics.c(this.c, trailingAsset3.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19340a.hashCode() * 31;
            OnHostedIcon7 onHostedIcon7 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon7 == null ? 0 : onHostedIcon7.f19327a.hashCode())) * 31;
            OnCoreIcon7 onCoreIcon7 = this.c;
            return iHashCode2 + (onCoreIcon7 != null ? onCoreIcon7.f19319a.hashCode() : 0);
        }

        public final String toString() {
            return "TrailingAsset3(__typename=" + this.f19340a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(AccountDetailsQuery_ResponseAdapter.Data.f19349a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query accountDetails { accountDetails { feed { __typename ... on MyAccountPersonalDetails { title subtitle rowItems { description label leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } overlineText trailingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } } } ... on MyAccountBusinessDetails { title subtitle rowItems { description label leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } overlineText trailingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } } } ... on MyAccountContactDetails { title subtitle rowItems { description label leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } overlineText trailingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } } } ... on MyAccountPreferences { title subtitle rowItems { description label leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } overlineText trailingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } } } ... on MyAccountFooter { button { label style enabled buttonAction { id action type } iconUrl } } } } }";
    }

    public final boolean equals(Object obj) {
        return obj != null && obj.getClass() == AccountDetailsQuery.class;
    }

    public final int hashCode() {
        return Reflection.f24268a.b(AccountDetailsQuery.class).hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "bed42f7e0e180f573876d3dd45da324f0c7a949bcfea0979c7b993a68ffa6bf9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "accountDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
    }
}
