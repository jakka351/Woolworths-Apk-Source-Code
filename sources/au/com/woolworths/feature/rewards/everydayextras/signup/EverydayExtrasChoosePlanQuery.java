package au.com.woolworths.feature.rewards.everydayextras.signup;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtrasChoosePlanQuery_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.BadgeType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.EverydayExtraPageName;
import au.com.woolworths.rewards.graphql.type.SpacerType;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u000f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Data;", "Data", "EverydayExtraChoosePlan", "Content", "ContentItem", "OnTitleTextItem", "OnSmallAppIconListItem", "OnEverydayExtraSubscribePlan", "Badge", "OnSpacer", "OnEverydayExtraButton", "Footer", "FooterItem", "OnEverydayExtraButton1", "OnNoteTextItem", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasChoosePlanQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final EverydayExtraPageName f5864a;
    public final Optional b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Badge;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f5865a;
        public final BadgeType b;

        public Badge(String str, BadgeType badgeType) {
            this.f5865a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.c(this.f5865a, badge.f5865a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5865a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(label=" + this.f5865a + ", type=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Content;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f5866a;
        public final String b;
        public final ArrayList c;

        public Content(String str, String str2, ArrayList arrayList) {
            this.f5866a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return this.f5866a.equals(content.f5866a) && this.b.equals(content.b) && this.c.equals(content.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5866a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.q(")", YU.a.v("Content(__typename=", this.f5866a, ", id=", this.b, ", contentItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$ContentItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5867a;
        public final OnTitleTextItem b;
        public final OnSmallAppIconListItem c;
        public final OnEverydayExtraSubscribePlan d;
        public final OnSpacer e;
        public final OnEverydayExtraButton f;

        public ContentItem(String __typename, OnTitleTextItem onTitleTextItem, OnSmallAppIconListItem onSmallAppIconListItem, OnEverydayExtraSubscribePlan onEverydayExtraSubscribePlan, OnSpacer onSpacer, OnEverydayExtraButton onEverydayExtraButton) {
            Intrinsics.h(__typename, "__typename");
            this.f5867a = __typename;
            this.b = onTitleTextItem;
            this.c = onSmallAppIconListItem;
            this.d = onEverydayExtraSubscribePlan;
            this.e = onSpacer;
            this.f = onEverydayExtraButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentItem)) {
                return false;
            }
            ContentItem contentItem = (ContentItem) obj;
            return Intrinsics.c(this.f5867a, contentItem.f5867a) && Intrinsics.c(this.b, contentItem.b) && Intrinsics.c(this.c, contentItem.c) && Intrinsics.c(this.d, contentItem.d) && Intrinsics.c(this.e, contentItem.e) && Intrinsics.c(this.f, contentItem.f);
        }

        public final int hashCode() {
            int iHashCode = this.f5867a.hashCode() * 31;
            OnTitleTextItem onTitleTextItem = this.b;
            int iHashCode2 = (iHashCode + (onTitleTextItem == null ? 0 : onTitleTextItem.hashCode())) * 31;
            OnSmallAppIconListItem onSmallAppIconListItem = this.c;
            int iHashCode3 = (iHashCode2 + (onSmallAppIconListItem == null ? 0 : onSmallAppIconListItem.hashCode())) * 31;
            OnEverydayExtraSubscribePlan onEverydayExtraSubscribePlan = this.d;
            int iHashCode4 = (iHashCode3 + (onEverydayExtraSubscribePlan == null ? 0 : onEverydayExtraSubscribePlan.hashCode())) * 31;
            OnSpacer onSpacer = this.e;
            int iHashCode5 = (iHashCode4 + (onSpacer == null ? 0 : onSpacer.hashCode())) * 31;
            OnEverydayExtraButton onEverydayExtraButton = this.f;
            return iHashCode5 + (onEverydayExtraButton != null ? onEverydayExtraButton.hashCode() : 0);
        }

        public final String toString() {
            return "ContentItem(__typename=" + this.f5867a + ", onTitleTextItem=" + this.b + ", onSmallAppIconListItem=" + this.c + ", onEverydayExtraSubscribePlan=" + this.d + ", onSpacer=" + this.e + ", onEverydayExtraButton=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraChoosePlan f5868a;

        public Data(EverydayExtraChoosePlan everydayExtraChoosePlan) {
            this.f5868a = everydayExtraChoosePlan;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5868a, ((Data) obj).f5868a);
        }

        public final int hashCode() {
            EverydayExtraChoosePlan everydayExtraChoosePlan = this.f5868a;
            if (everydayExtraChoosePlan == null) {
                return 0;
            }
            return everydayExtraChoosePlan.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraChoosePlan=" + this.f5868a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$EverydayExtraChoosePlan;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraChoosePlan {

        /* renamed from: a, reason: collision with root package name */
        public final String f5869a;
        public final String b;
        public final Content c;
        public final Footer d;

        public EverydayExtraChoosePlan(String str, String str2, Content content, Footer footer) {
            this.f5869a = str;
            this.b = str2;
            this.c = content;
            this.d = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtraChoosePlan)) {
                return false;
            }
            EverydayExtraChoosePlan everydayExtraChoosePlan = (EverydayExtraChoosePlan) obj;
            return Intrinsics.c(this.f5869a, everydayExtraChoosePlan.f5869a) && Intrinsics.c(this.b, everydayExtraChoosePlan.b) && Intrinsics.c(this.c, everydayExtraChoosePlan.c) && Intrinsics.c(this.d, everydayExtraChoosePlan.d);
        }

        public final int hashCode() {
            int iHashCode = this.f5869a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            Footer footer = this.d;
            return iHashCode2 + (footer != null ? footer.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("EverydayExtraChoosePlan(__typename=", this.f5869a, ", navigationTitle=", this.b, ", content=");
            sbV.append(this.c);
            sbV.append(", footer=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$Footer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5870a;
        public final String b;
        public final ArrayList c;

        public Footer(String str, String str2, ArrayList arrayList) {
            this.f5870a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return this.f5870a.equals(footer.f5870a) && this.b.equals(footer.b) && this.c.equals(footer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5870a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.q(")", YU.a.v("Footer(__typename=", this.f5870a, ", id=", this.b, ", footerItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$FooterItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5871a;
        public final OnEverydayExtraButton1 b;
        public final OnNoteTextItem c;

        public FooterItem(String __typename, OnEverydayExtraButton1 onEverydayExtraButton1, OnNoteTextItem onNoteTextItem) {
            Intrinsics.h(__typename, "__typename");
            this.f5871a = __typename;
            this.b = onEverydayExtraButton1;
            this.c = onNoteTextItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterItem)) {
                return false;
            }
            FooterItem footerItem = (FooterItem) obj;
            return Intrinsics.c(this.f5871a, footerItem.f5871a) && Intrinsics.c(this.b, footerItem.b) && Intrinsics.c(this.c, footerItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5871a.hashCode() * 31;
            OnEverydayExtraButton1 onEverydayExtraButton1 = this.b;
            int iHashCode2 = (iHashCode + (onEverydayExtraButton1 == null ? 0 : onEverydayExtraButton1.hashCode())) * 31;
            OnNoteTextItem onNoteTextItem = this.c;
            return iHashCode2 + (onNoteTextItem != null ? onNoteTextItem.hashCode() : 0);
        }

        public final String toString() {
            return "FooterItem(__typename=" + this.f5871a + ", onEverydayExtraButton=" + this.b + ", onNoteTextItem=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnEverydayExtraButton;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f5872a;
        public final String b;
        public final String c;
        public final EverydayExtraButtonStyle d;

        public OnEverydayExtraButton(String str, String str2, String str3, EverydayExtraButtonStyle everydayExtraButtonStyle) {
            this.f5872a = str;
            this.b = str2;
            this.c = str3;
            this.d = everydayExtraButtonStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraButton)) {
                return false;
            }
            OnEverydayExtraButton onEverydayExtraButton = (OnEverydayExtraButton) obj;
            return Intrinsics.c(this.f5872a, onEverydayExtraButton.f5872a) && Intrinsics.c(this.b, onEverydayExtraButton.b) && Intrinsics.c(this.c, onEverydayExtraButton.c) && this.d == onEverydayExtraButton.d;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f5872a.hashCode() * 31, 31, this.b), 31, this.c);
            EverydayExtraButtonStyle everydayExtraButtonStyle = this.d;
            return iC + (everydayExtraButtonStyle == null ? 0 : everydayExtraButtonStyle.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnEverydayExtraButton(__typename=", this.f5872a, ", label=", this.b, ", action=");
            sbV.append(this.c);
            sbV.append(", style=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnEverydayExtraButton1;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraButton1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5873a;
        public final String b;
        public final String c;
        public final String d;
        public final EverydayExtraButtonStyle e;

        public OnEverydayExtraButton1(String str, String str2, String str3, String str4, EverydayExtraButtonStyle everydayExtraButtonStyle) {
            this.f5873a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = everydayExtraButtonStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraButton1)) {
                return false;
            }
            OnEverydayExtraButton1 onEverydayExtraButton1 = (OnEverydayExtraButton1) obj;
            return Intrinsics.c(this.f5873a, onEverydayExtraButton1.f5873a) && Intrinsics.c(this.b, onEverydayExtraButton1.b) && Intrinsics.c(this.c, onEverydayExtraButton1.c) && Intrinsics.c(this.d, onEverydayExtraButton1.d) && this.e == onEverydayExtraButton1.e;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f5873a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            EverydayExtraButtonStyle everydayExtraButtonStyle = this.e;
            return iHashCode + (everydayExtraButtonStyle != null ? everydayExtraButtonStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnEverydayExtraButton1(__typename=", this.f5873a, ", label=", this.b, ", action=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionUrl=", this.d, ", style=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnEverydayExtraSubscribePlan;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraSubscribePlan {

        /* renamed from: a, reason: collision with root package name */
        public final String f5874a;
        public final String b;
        public final String c;
        public final String d;
        public final int e;
        public final Badge f;

        public OnEverydayExtraSubscribePlan(String str, String str2, String str3, String str4, int i, Badge badge) {
            this.f5874a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = i;
            this.f = badge;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraSubscribePlan)) {
                return false;
            }
            OnEverydayExtraSubscribePlan onEverydayExtraSubscribePlan = (OnEverydayExtraSubscribePlan) obj;
            return Intrinsics.c(this.f5874a, onEverydayExtraSubscribePlan.f5874a) && Intrinsics.c(this.b, onEverydayExtraSubscribePlan.b) && Intrinsics.c(this.c, onEverydayExtraSubscribePlan.c) && Intrinsics.c(this.d, onEverydayExtraSubscribePlan.d) && this.e == onEverydayExtraSubscribePlan.e && Intrinsics.c(this.f, onEverydayExtraSubscribePlan.f);
        }

        public final int hashCode() {
            int iA = b.a(this.e, b.c(b.c(b.c(this.f5874a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            Badge badge = this.f;
            return iA + (badge == null ? 0 : badge.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnEverydayExtraSubscribePlan(__typename=", this.f5874a, ", identifier=", this.b, ", planTitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", subtitle=", this.d, ", price=");
            sbV.append(this.e);
            sbV.append(", badge=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnNoteTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNoteTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5875a;
        public final String b;

        public OnNoteTextItem(String str, String str2) {
            this.f5875a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnNoteTextItem)) {
                return false;
            }
            OnNoteTextItem onNoteTextItem = (OnNoteTextItem) obj;
            return Intrinsics.c(this.f5875a, onNoteTextItem.f5875a) && Intrinsics.c(this.b, onNoteTextItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5875a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnNoteTextItem(__typename=", this.f5875a, ", content=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnSmallAppIconListItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSmallAppIconListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5876a;
        public final String b;
        public final String c;

        public OnSmallAppIconListItem(String str, String str2, String str3) {
            this.f5876a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSmallAppIconListItem)) {
                return false;
            }
            OnSmallAppIconListItem onSmallAppIconListItem = (OnSmallAppIconListItem) obj;
            return Intrinsics.c(this.f5876a, onSmallAppIconListItem.f5876a) && Intrinsics.c(this.b, onSmallAppIconListItem.b) && Intrinsics.c(this.c, onSmallAppIconListItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5876a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("OnSmallAppIconListItem(__typename=", this.f5876a, ", iconUrl=", this.b, ", label="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnSpacer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSpacer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5877a;
        public final SpacerType b;

        public OnSpacer(String str, SpacerType spacerType) {
            this.f5877a = str;
            this.b = spacerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSpacer)) {
                return false;
            }
            OnSpacer onSpacer = (OnSpacer) obj;
            return Intrinsics.c(this.f5877a, onSpacer.f5877a) && this.b == onSpacer.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5877a.hashCode() * 31);
        }

        public final String toString() {
            return "OnSpacer(__typename=" + this.f5877a + ", size=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasChoosePlanQuery$OnTitleTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5878a;
        public final String b;

        public OnTitleTextItem(String str, String str2) {
            this.f5878a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTitleTextItem)) {
                return false;
            }
            OnTitleTextItem onTitleTextItem = (OnTitleTextItem) obj;
            return Intrinsics.c(this.f5878a, onTitleTextItem.f5878a) && Intrinsics.c(this.b, onTitleTextItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5878a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnTitleTextItem(__typename=", this.f5878a, ", content=", this.b, ")");
        }
    }

    public EverydayExtrasChoosePlanQuery(EverydayExtraPageName page, Optional optional) {
        Intrinsics.h(page, "page");
        this.f5864a = page;
        this.b = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtrasChoosePlanQuery_ResponseAdapter.Data.f5987a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query EverydayExtrasChoosePlan($page: EverydayExtraPageName!, $acquisitionOfferName: String) { everydayExtraChoosePlan(page: $page, acquisitionOfferName: $acquisitionOfferName) { __typename navigationTitle content { __typename id contentItems: items { __typename ... on TitleTextItem { __typename content } ... on SmallAppIconListItem { __typename iconUrl label } ... on EverydayExtraSubscribePlan { __typename identifier planTitle subtitle price badge { label type } } ... on Spacer { __typename size } ... on EverydayExtraButton { __typename label action style } } } footer { __typename id footerItems: items { __typename ... on EverydayExtraButton { __typename label action actionUrl style } ... on NoteTextItem { __typename content } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasChoosePlanQuery)) {
            return false;
        }
        EverydayExtrasChoosePlanQuery everydayExtrasChoosePlanQuery = (EverydayExtrasChoosePlanQuery) obj;
        return this.f5864a == everydayExtrasChoosePlanQuery.f5864a && Intrinsics.c(this.b, everydayExtrasChoosePlanQuery.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f5864a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "61fccb17f1ffd78b8337c93ff7dfa41233e1aa5a35d1565d16f5d8152953efd1";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtrasChoosePlan";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("page");
        EverydayExtraPageName value = this.f5864a;
        Intrinsics.h(value, "value");
        jsonWriter.v0(value.d);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("acquisitionOfferName");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return "EverydayExtrasChoosePlanQuery(page=" + this.f5864a + ", acquisitionOfferName=" + this.b + ")";
    }
}
