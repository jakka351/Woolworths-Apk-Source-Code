package au.com.woolworths.feature.rewards.everydayextras.signup;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.adapter.EverydayExtrasLandingQuery_ResponseAdapter;
import au.com.woolworths.rewards.graphql.type.DividerType;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.EverydayExtraButtonStyle;
import au.com.woolworths.rewards.graphql.type.EverydayExtraLandingFeatureFlags;
import au.com.woolworths.rewards.graphql.type.adapter.EverydayExtraLandingFeatureFlags_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:'\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()¨\u0006*"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Data;", "Data", "EverydayExtraLanding", "Header", "Tab", "OnEverydayExtraKeyBenefitsTab", "Section", "OnEverydayExtraKeyBenefitsSection", "KeyBenefitsItem", "OnTitleTextItem", "OnMediumIconListItem", "OnEverydayExtraComparisonSection", "ComparisonItem", "OnTitleTextItem1", "OnEverydayExtraBenefitsCompare", "ColumnHeadings", "LabelColumn", "RewardsColumn", "ExtraColumn", "Row", "LabelValue", "RewardsValue", "ExtraValue", "OnEverydayExtraFaqsTab", "Section1", "OnEverydayExtraFaqsSection", "FaqItem", "OnTitleTextItem2", "OnSubheadTextItem", "OnDivider", "OnFaqItem", "OnNoteTextItem", "TermsAndConditions", "Footer", "FooterItem", "AlertDialog", "Analytics", "PrimaryCta", "SecondaryCta", "Companion", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EverydayExtrasLandingQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f5888a;
    public final EverydayExtraLandingFeatureFlags b;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$AlertDialog;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AlertDialog {

        /* renamed from: a, reason: collision with root package name */
        public final String f5889a;
        public final String b;
        public final Analytics c;
        public final PrimaryCta d;
        public final SecondaryCta e;

        public AlertDialog(String str, String str2, Analytics analytics, PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f5889a = str;
            this.b = str2;
            this.c = analytics;
            this.d = primaryCta;
            this.e = secondaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AlertDialog)) {
                return false;
            }
            AlertDialog alertDialog = (AlertDialog) obj;
            return Intrinsics.c(this.f5889a, alertDialog.f5889a) && Intrinsics.c(this.b, alertDialog.b) && Intrinsics.c(this.c, alertDialog.c) && Intrinsics.c(this.d, alertDialog.d) && Intrinsics.c(this.e, alertDialog.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f5889a.hashCode() * 31, 31, this.b);
            Analytics analytics = this.c;
            int iHashCode = (this.d.hashCode() + ((iC + (analytics == null ? 0 : analytics.hashCode())) * 31)) * 31;
            SecondaryCta secondaryCta = this.e;
            return iHashCode + (secondaryCta != null ? secondaryCta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("AlertDialog(title=", this.f5889a, ", message=", this.b, ", analytics=");
            sbV.append(this.c);
            sbV.append(", primaryCta=");
            sbV.append(this.d);
            sbV.append(", secondaryCta=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Analytics;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5890a;
        public final String b;

        public Analytics(String str, String str2) {
            this.f5890a = str;
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
            return Intrinsics.c(this.f5890a, analytics.f5890a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5890a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Analytics(eventCategory=", this.f5890a, ", eventDescription=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ColumnHeadings;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ColumnHeadings {

        /* renamed from: a, reason: collision with root package name */
        public final LabelColumn f5891a;
        public final RewardsColumn b;
        public final ExtraColumn c;

        public ColumnHeadings(LabelColumn labelColumn, RewardsColumn rewardsColumn, ExtraColumn extraColumn) {
            this.f5891a = labelColumn;
            this.b = rewardsColumn;
            this.c = extraColumn;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColumnHeadings)) {
                return false;
            }
            ColumnHeadings columnHeadings = (ColumnHeadings) obj;
            return Intrinsics.c(this.f5891a, columnHeadings.f5891a) && Intrinsics.c(this.b, columnHeadings.b) && Intrinsics.c(this.c, columnHeadings.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f5891a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ColumnHeadings(labelColumn=" + this.f5891a + ", rewardsColumn=" + this.b + ", extraColumn=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ComparisonItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ComparisonItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5892a;
        public final OnTitleTextItem1 b;
        public final OnEverydayExtraBenefitsCompare c;

        public ComparisonItem(String __typename, OnTitleTextItem1 onTitleTextItem1, OnEverydayExtraBenefitsCompare onEverydayExtraBenefitsCompare) {
            Intrinsics.h(__typename, "__typename");
            this.f5892a = __typename;
            this.b = onTitleTextItem1;
            this.c = onEverydayExtraBenefitsCompare;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComparisonItem)) {
                return false;
            }
            ComparisonItem comparisonItem = (ComparisonItem) obj;
            return Intrinsics.c(this.f5892a, comparisonItem.f5892a) && Intrinsics.c(this.b, comparisonItem.b) && Intrinsics.c(this.c, comparisonItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5892a.hashCode() * 31;
            OnTitleTextItem1 onTitleTextItem1 = this.b;
            int iHashCode2 = (iHashCode + (onTitleTextItem1 == null ? 0 : onTitleTextItem1.hashCode())) * 31;
            OnEverydayExtraBenefitsCompare onEverydayExtraBenefitsCompare = this.c;
            return iHashCode2 + (onEverydayExtraBenefitsCompare != null ? onEverydayExtraBenefitsCompare.hashCode() : 0);
        }

        public final String toString() {
            return "ComparisonItem(__typename=" + this.f5892a + ", onTitleTextItem=" + this.b + ", onEverydayExtraBenefitsCompare=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final EverydayExtraLanding f5893a;

        public Data(EverydayExtraLanding everydayExtraLanding) {
            this.f5893a = everydayExtraLanding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5893a, ((Data) obj).f5893a);
        }

        public final int hashCode() {
            EverydayExtraLanding everydayExtraLanding = this.f5893a;
            if (everydayExtraLanding == null) {
                return 0;
            }
            return everydayExtraLanding.hashCode();
        }

        public final String toString() {
            return "Data(everydayExtraLanding=" + this.f5893a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$EverydayExtraLanding;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EverydayExtraLanding {

        /* renamed from: a, reason: collision with root package name */
        public final String f5894a;
        public final String b;
        public final Header c;
        public final ArrayList d;
        public final TermsAndConditions e;
        public final Footer f;
        public final AlertDialog g;

        public EverydayExtraLanding(String str, String str2, Header header, ArrayList arrayList, TermsAndConditions termsAndConditions, Footer footer, AlertDialog alertDialog) {
            this.f5894a = str;
            this.b = str2;
            this.c = header;
            this.d = arrayList;
            this.e = termsAndConditions;
            this.f = footer;
            this.g = alertDialog;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EverydayExtraLanding)) {
                return false;
            }
            EverydayExtraLanding everydayExtraLanding = (EverydayExtraLanding) obj;
            return this.f5894a.equals(everydayExtraLanding.f5894a) && this.b.equals(everydayExtraLanding.b) && this.c.equals(everydayExtraLanding.c) && this.d.equals(everydayExtraLanding.d) && Intrinsics.c(this.e, everydayExtraLanding.e) && Intrinsics.c(this.f, everydayExtraLanding.f) && Intrinsics.c(this.g, everydayExtraLanding.g);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b((this.c.hashCode() + b.c(this.f5894a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
            TermsAndConditions termsAndConditions = this.e;
            int iHashCode = (iB + (termsAndConditions == null ? 0 : termsAndConditions.hashCode())) * 31;
            Footer footer = this.f;
            int iHashCode2 = (iHashCode + (footer == null ? 0 : footer.hashCode())) * 31;
            AlertDialog alertDialog = this.g;
            return iHashCode2 + (alertDialog != null ? alertDialog.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("EverydayExtraLanding(__typename=", this.f5894a, ", navigationTitle=", this.b, ", header=");
            sbV.append(this.c);
            sbV.append(", tabs=");
            sbV.append(this.d);
            sbV.append(", termsAndConditions=");
            sbV.append(this.e);
            sbV.append(", footer=");
            sbV.append(this.f);
            sbV.append(", alertDialog=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ExtraColumn;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraColumn {

        /* renamed from: a, reason: collision with root package name */
        public final String f5895a;
        public final String b;

        public ExtraColumn(String str, String str2) {
            this.f5895a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraColumn)) {
                return false;
            }
            ExtraColumn extraColumn = (ExtraColumn) obj;
            return Intrinsics.c(this.f5895a, extraColumn.f5895a) && Intrinsics.c(this.b, extraColumn.b);
        }

        public final int hashCode() {
            String str = this.f5895a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("ExtraColumn(iconName=", this.f5895a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$ExtraValue;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraValue {

        /* renamed from: a, reason: collision with root package name */
        public final String f5896a;
        public final String b;

        public ExtraValue(String str, String str2) {
            this.f5896a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraValue)) {
                return false;
            }
            ExtraValue extraValue = (ExtraValue) obj;
            return Intrinsics.c(this.f5896a, extraValue.f5896a) && Intrinsics.c(this.b, extraValue.b);
        }

        public final int hashCode() {
            String str = this.f5896a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("ExtraValue(iconName=", this.f5896a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$FaqItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FaqItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5897a;
        public final OnTitleTextItem2 b;
        public final OnSubheadTextItem c;
        public final OnDivider d;
        public final OnFaqItem e;
        public final OnNoteTextItem f;

        public FaqItem(String __typename, OnTitleTextItem2 onTitleTextItem2, OnSubheadTextItem onSubheadTextItem, OnDivider onDivider, OnFaqItem onFaqItem, OnNoteTextItem onNoteTextItem) {
            Intrinsics.h(__typename, "__typename");
            this.f5897a = __typename;
            this.b = onTitleTextItem2;
            this.c = onSubheadTextItem;
            this.d = onDivider;
            this.e = onFaqItem;
            this.f = onNoteTextItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FaqItem)) {
                return false;
            }
            FaqItem faqItem = (FaqItem) obj;
            return Intrinsics.c(this.f5897a, faqItem.f5897a) && Intrinsics.c(this.b, faqItem.b) && Intrinsics.c(this.c, faqItem.c) && Intrinsics.c(this.d, faqItem.d) && Intrinsics.c(this.e, faqItem.e) && Intrinsics.c(this.f, faqItem.f);
        }

        public final int hashCode() {
            int iHashCode = this.f5897a.hashCode() * 31;
            OnTitleTextItem2 onTitleTextItem2 = this.b;
            int iHashCode2 = (iHashCode + (onTitleTextItem2 == null ? 0 : onTitleTextItem2.f5917a.hashCode())) * 31;
            OnSubheadTextItem onSubheadTextItem = this.c;
            int iHashCode3 = (iHashCode2 + (onSubheadTextItem == null ? 0 : onSubheadTextItem.f5914a.hashCode())) * 31;
            OnDivider onDivider = this.d;
            int iHashCode4 = (iHashCode3 + (onDivider == null ? 0 : onDivider.f5904a.hashCode())) * 31;
            OnFaqItem onFaqItem = this.e;
            int iHashCode5 = (iHashCode4 + (onFaqItem == null ? 0 : onFaqItem.hashCode())) * 31;
            OnNoteTextItem onNoteTextItem = this.f;
            return iHashCode5 + (onNoteTextItem != null ? onNoteTextItem.f5913a.hashCode() : 0);
        }

        public final String toString() {
            return "FaqItem(__typename=" + this.f5897a + ", onTitleTextItem=" + this.b + ", onSubheadTextItem=" + this.c + ", onDivider=" + this.d + ", onFaqItem=" + this.e + ", onNoteTextItem=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Footer;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5898a;
        public final String b;
        public final ArrayList c;

        public Footer(String str, String str2, ArrayList arrayList) {
            this.f5898a = str;
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
            return this.f5898a.equals(footer.f5898a) && this.b.equals(footer.b) && this.c.equals(footer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5898a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("Footer(__typename=", this.f5898a, ", id=", this.b, ", footerItems="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$FooterItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5899a;
        public final String b;
        public final String c;
        public final String d;
        public final EverydayExtraButtonStyle e;

        public FooterItem(String str, String str2, String str3, String str4, EverydayExtraButtonStyle everydayExtraButtonStyle) {
            this.f5899a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = everydayExtraButtonStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterItem)) {
                return false;
            }
            FooterItem footerItem = (FooterItem) obj;
            return Intrinsics.c(this.f5899a, footerItem.f5899a) && Intrinsics.c(this.b, footerItem.b) && Intrinsics.c(this.c, footerItem.c) && Intrinsics.c(this.d, footerItem.d) && this.e == footerItem.e;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f5899a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            EverydayExtraButtonStyle everydayExtraButtonStyle = this.e;
            return iHashCode + (everydayExtraButtonStyle != null ? everydayExtraButtonStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("FooterItem(__typename=", this.f5899a, ", label=", this.b, ", action=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionUrl=", this.d, ", style=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Header;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f5900a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public Header(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f5900a = downloadableAssetType;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = downloadableAssetFit;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return this.f5900a == header.f5900a && Intrinsics.c(this.b, header.b) && this.c == header.c && this.d == header.d && this.e == header.e && Intrinsics.c(this.f, header.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f5900a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Header(assetType=");
            sb.append(this.f5900a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$KeyBenefitsItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class KeyBenefitsItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5901a;
        public final OnTitleTextItem b;
        public final OnMediumIconListItem c;

        public KeyBenefitsItem(String __typename, OnTitleTextItem onTitleTextItem, OnMediumIconListItem onMediumIconListItem) {
            Intrinsics.h(__typename, "__typename");
            this.f5901a = __typename;
            this.b = onTitleTextItem;
            this.c = onMediumIconListItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KeyBenefitsItem)) {
                return false;
            }
            KeyBenefitsItem keyBenefitsItem = (KeyBenefitsItem) obj;
            return Intrinsics.c(this.f5901a, keyBenefitsItem.f5901a) && Intrinsics.c(this.b, keyBenefitsItem.b) && Intrinsics.c(this.c, keyBenefitsItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5901a.hashCode() * 31;
            OnTitleTextItem onTitleTextItem = this.b;
            int iHashCode2 = (iHashCode + (onTitleTextItem == null ? 0 : onTitleTextItem.hashCode())) * 31;
            OnMediumIconListItem onMediumIconListItem = this.c;
            return iHashCode2 + (onMediumIconListItem != null ? onMediumIconListItem.hashCode() : 0);
        }

        public final String toString() {
            return "KeyBenefitsItem(__typename=" + this.f5901a + ", onTitleTextItem=" + this.b + ", onMediumIconListItem=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$LabelColumn;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LabelColumn {

        /* renamed from: a, reason: collision with root package name */
        public final String f5902a;
        public final String b;

        public LabelColumn(String str, String str2) {
            this.f5902a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LabelColumn)) {
                return false;
            }
            LabelColumn labelColumn = (LabelColumn) obj;
            return Intrinsics.c(this.f5902a, labelColumn.f5902a) && Intrinsics.c(this.b, labelColumn.b);
        }

        public final int hashCode() {
            String str = this.f5902a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("LabelColumn(iconName=", this.f5902a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$LabelValue;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LabelValue {

        /* renamed from: a, reason: collision with root package name */
        public final String f5903a;

        public LabelValue(String str) {
            this.f5903a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LabelValue) && Intrinsics.c(this.f5903a, ((LabelValue) obj).f5903a);
        }

        public final int hashCode() {
            return this.f5903a.hashCode();
        }

        public final String toString() {
            return a.h("LabelValue(label=", this.f5903a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnDivider;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDivider {

        /* renamed from: a, reason: collision with root package name */
        public final DividerType f5904a;

        public OnDivider(DividerType dividerType) {
            this.f5904a = dividerType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDivider) && this.f5904a == ((OnDivider) obj).f5904a;
        }

        public final int hashCode() {
            return this.f5904a.hashCode();
        }

        public final String toString() {
            return "OnDivider(type=" + this.f5904a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraBenefitsCompare;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraBenefitsCompare {

        /* renamed from: a, reason: collision with root package name */
        public final String f5905a;
        public final ColumnHeadings b;
        public final ArrayList c;

        public OnEverydayExtraBenefitsCompare(String str, ColumnHeadings columnHeadings, ArrayList arrayList) {
            this.f5905a = str;
            this.b = columnHeadings;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraBenefitsCompare)) {
                return false;
            }
            OnEverydayExtraBenefitsCompare onEverydayExtraBenefitsCompare = (OnEverydayExtraBenefitsCompare) obj;
            return this.f5905a.equals(onEverydayExtraBenefitsCompare.f5905a) && this.b.equals(onEverydayExtraBenefitsCompare.b) && this.c.equals(onEverydayExtraBenefitsCompare.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f5905a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnEverydayExtraBenefitsCompare(__typename=");
            sb.append(this.f5905a);
            sb.append(", columnHeadings=");
            sb.append(this.b);
            sb.append(", rows=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraComparisonSection;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraComparisonSection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5906a;

        public OnEverydayExtraComparisonSection(ArrayList arrayList) {
            this.f5906a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEverydayExtraComparisonSection) && this.f5906a.equals(((OnEverydayExtraComparisonSection) obj).f5906a);
        }

        public final int hashCode() {
            return this.f5906a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnEverydayExtraComparisonSection(comparisonItems=", ")", this.f5906a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraFaqsSection;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraFaqsSection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5907a;

        public OnEverydayExtraFaqsSection(ArrayList arrayList) {
            this.f5907a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEverydayExtraFaqsSection) && this.f5907a.equals(((OnEverydayExtraFaqsSection) obj).f5907a);
        }

        public final int hashCode() {
            return this.f5907a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnEverydayExtraFaqsSection(faqItems=", ")", this.f5907a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraFaqsTab;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraFaqsTab {

        /* renamed from: a, reason: collision with root package name */
        public final String f5908a;
        public final String b;
        public final ArrayList c;

        public OnEverydayExtraFaqsTab(String str, String str2, ArrayList arrayList) {
            this.f5908a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraFaqsTab)) {
                return false;
            }
            OnEverydayExtraFaqsTab onEverydayExtraFaqsTab = (OnEverydayExtraFaqsTab) obj;
            return this.f5908a.equals(onEverydayExtraFaqsTab.f5908a) && this.b.equals(onEverydayExtraFaqsTab.b) && this.c.equals(onEverydayExtraFaqsTab.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5908a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnEverydayExtraFaqsTab(id=", this.f5908a, ", tabName=", this.b, ", sections="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraKeyBenefitsSection;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraKeyBenefitsSection {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f5909a;

        public OnEverydayExtraKeyBenefitsSection(ArrayList arrayList) {
            this.f5909a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEverydayExtraKeyBenefitsSection) && this.f5909a.equals(((OnEverydayExtraKeyBenefitsSection) obj).f5909a);
        }

        public final int hashCode() {
            return this.f5909a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnEverydayExtraKeyBenefitsSection(keyBenefitsItems=", ")", this.f5909a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnEverydayExtraKeyBenefitsTab;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEverydayExtraKeyBenefitsTab {

        /* renamed from: a, reason: collision with root package name */
        public final String f5910a;
        public final String b;
        public final ArrayList c;

        public OnEverydayExtraKeyBenefitsTab(String str, String str2, ArrayList arrayList) {
            this.f5910a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEverydayExtraKeyBenefitsTab)) {
                return false;
            }
            OnEverydayExtraKeyBenefitsTab onEverydayExtraKeyBenefitsTab = (OnEverydayExtraKeyBenefitsTab) obj;
            return this.f5910a.equals(onEverydayExtraKeyBenefitsTab.f5910a) && this.b.equals(onEverydayExtraKeyBenefitsTab.b) && this.c.equals(onEverydayExtraKeyBenefitsTab.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5910a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnEverydayExtraKeyBenefitsTab(id=", this.f5910a, ", tabName=", this.b, ", sections="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnFaqItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFaqItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5911a;
        public final String b;
        public final String c;

        public OnFaqItem(String str, String str2, String str3) {
            this.f5911a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFaqItem)) {
                return false;
            }
            OnFaqItem onFaqItem = (OnFaqItem) obj;
            return Intrinsics.c(this.f5911a, onFaqItem.f5911a) && Intrinsics.c(this.b, onFaqItem.b) && Intrinsics.c(this.c, onFaqItem.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f5911a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("OnFaqItem(id=", this.f5911a, ", question=", this.b, ", markdownAnswer="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnMediumIconListItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMediumIconListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5912a;
        public final String b;
        public final String c;
        public final String d;

        public OnMediumIconListItem(String str, String str2, String str3, String str4) {
            this.f5912a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMediumIconListItem)) {
                return false;
            }
            OnMediumIconListItem onMediumIconListItem = (OnMediumIconListItem) obj;
            return Intrinsics.c(this.f5912a, onMediumIconListItem.f5912a) && Intrinsics.c(this.b, onMediumIconListItem.b) && Intrinsics.c(this.c, onMediumIconListItem.c) && Intrinsics.c(this.d, onMediumIconListItem.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f5912a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnMediumIconListItem(__typename=", this.f5912a, ", iconUrl=", this.b, ", title="), this.c, ", description=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnNoteTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNoteTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5913a;

        public OnNoteTextItem(String str) {
            this.f5913a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnNoteTextItem) && Intrinsics.c(this.f5913a, ((OnNoteTextItem) obj).f5913a);
        }

        public final int hashCode() {
            return this.f5913a.hashCode();
        }

        public final String toString() {
            return a.h("OnNoteTextItem(content=", this.f5913a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnSubheadTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSubheadTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5914a;

        public OnSubheadTextItem(String str) {
            this.f5914a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnSubheadTextItem) && Intrinsics.c(this.f5914a, ((OnSubheadTextItem) obj).f5914a);
        }

        public final int hashCode() {
            return this.f5914a.hashCode();
        }

        public final String toString() {
            return a.h("OnSubheadTextItem(content=", this.f5914a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnTitleTextItem;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5915a;
        public final String b;

        public OnTitleTextItem(String str, String str2) {
            this.f5915a = str;
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
            return Intrinsics.c(this.f5915a, onTitleTextItem.f5915a) && Intrinsics.c(this.b, onTitleTextItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5915a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnTitleTextItem(__typename=", this.f5915a, ", content=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnTitleTextItem1;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5916a;
        public final String b;

        public OnTitleTextItem1(String str, String str2) {
            this.f5916a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTitleTextItem1)) {
                return false;
            }
            OnTitleTextItem1 onTitleTextItem1 = (OnTitleTextItem1) obj;
            return Intrinsics.c(this.f5916a, onTitleTextItem1.f5916a) && Intrinsics.c(this.b, onTitleTextItem1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5916a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnTitleTextItem1(__typename=", this.f5916a, ", content=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$OnTitleTextItem2;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleTextItem2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5917a;

        public OnTitleTextItem2(String str) {
            this.f5917a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnTitleTextItem2) && Intrinsics.c(this.f5917a, ((OnTitleTextItem2) obj).f5917a);
        }

        public final int hashCode() {
            return this.f5917a.hashCode();
        }

        public final String toString() {
            return a.h("OnTitleTextItem2(content=", this.f5917a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$PrimaryCta;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f5918a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f5918a = str;
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
            return Intrinsics.c(this.f5918a, primaryCta.f5918a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f5918a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f5918a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$RewardsColumn;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsColumn {

        /* renamed from: a, reason: collision with root package name */
        public final String f5919a;
        public final String b;

        public RewardsColumn(String str, String str2) {
            this.f5919a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsColumn)) {
                return false;
            }
            RewardsColumn rewardsColumn = (RewardsColumn) obj;
            return Intrinsics.c(this.f5919a, rewardsColumn.f5919a) && Intrinsics.c(this.b, rewardsColumn.b);
        }

        public final int hashCode() {
            String str = this.f5919a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("RewardsColumn(iconName=", this.f5919a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$RewardsValue;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsValue {

        /* renamed from: a, reason: collision with root package name */
        public final String f5920a;
        public final String b;

        public RewardsValue(String str, String str2) {
            this.f5920a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsValue)) {
                return false;
            }
            RewardsValue rewardsValue = (RewardsValue) obj;
            return Intrinsics.c(this.f5920a, rewardsValue.f5920a) && Intrinsics.c(this.b, rewardsValue.b);
        }

        public final int hashCode() {
            String str = this.f5920a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.j("RewardsValue(iconName=", this.f5920a, ", label=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Row;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Row {

        /* renamed from: a, reason: collision with root package name */
        public final String f5921a;
        public final boolean b;
        public final ArrayList c;
        public final List d;
        public final ArrayList e;

        public Row(String str, boolean z, ArrayList arrayList, List list, ArrayList arrayList2) {
            this.f5921a = str;
            this.b = z;
            this.c = arrayList;
            this.d = list;
            this.e = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return this.f5921a.equals(row.f5921a) && this.b == row.b && this.c.equals(row.c) && Intrinsics.c(this.d, row.d) && this.e.equals(row.e);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.e(this.f5921a.hashCode() * 31, 31, this.b), 31, this.c);
            List list = this.d;
            return this.e.hashCode() + ((iB + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("Row(rowId=", this.f5921a, ", altBackground=", ", labelValue=", this.b);
            sbQ.append(this.c);
            sbQ.append(", rewardsValue=");
            sbQ.append(this.d);
            sbQ.append(", extraValue=");
            return android.support.v4.media.session.a.q(")", sbQ, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$SecondaryCta;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f5922a;
        public final String b;

        public SecondaryCta(String str, String str2) {
            this.f5922a = str;
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
            return Intrinsics.c(this.f5922a, secondaryCta.f5922a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f5922a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("SecondaryCta(label=", this.f5922a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Section;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f5923a;
        public final OnEverydayExtraKeyBenefitsSection b;
        public final OnEverydayExtraComparisonSection c;

        public Section(String __typename, OnEverydayExtraKeyBenefitsSection onEverydayExtraKeyBenefitsSection, OnEverydayExtraComparisonSection onEverydayExtraComparisonSection) {
            Intrinsics.h(__typename, "__typename");
            this.f5923a = __typename;
            this.b = onEverydayExtraKeyBenefitsSection;
            this.c = onEverydayExtraComparisonSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f5923a, section.f5923a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5923a.hashCode() * 31;
            OnEverydayExtraKeyBenefitsSection onEverydayExtraKeyBenefitsSection = this.b;
            int iHashCode2 = (iHashCode + (onEverydayExtraKeyBenefitsSection == null ? 0 : onEverydayExtraKeyBenefitsSection.f5909a.hashCode())) * 31;
            OnEverydayExtraComparisonSection onEverydayExtraComparisonSection = this.c;
            return iHashCode2 + (onEverydayExtraComparisonSection != null ? onEverydayExtraComparisonSection.f5906a.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f5923a + ", onEverydayExtraKeyBenefitsSection=" + this.b + ", onEverydayExtraComparisonSection=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Section1;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5924a;
        public final OnEverydayExtraFaqsSection b;

        public Section1(String __typename, OnEverydayExtraFaqsSection onEverydayExtraFaqsSection) {
            Intrinsics.h(__typename, "__typename");
            this.f5924a = __typename;
            this.b = onEverydayExtraFaqsSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section1)) {
                return false;
            }
            Section1 section1 = (Section1) obj;
            return Intrinsics.c(this.f5924a, section1.f5924a) && Intrinsics.c(this.b, section1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f5924a.hashCode() * 31;
            OnEverydayExtraFaqsSection onEverydayExtraFaqsSection = this.b;
            return iHashCode + (onEverydayExtraFaqsSection == null ? 0 : onEverydayExtraFaqsSection.f5907a.hashCode());
        }

        public final String toString() {
            return "Section1(__typename=" + this.f5924a + ", onEverydayExtraFaqsSection=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$Tab;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Tab {

        /* renamed from: a, reason: collision with root package name */
        public final String f5925a;
        public final OnEverydayExtraKeyBenefitsTab b;
        public final OnEverydayExtraFaqsTab c;

        public Tab(String __typename, OnEverydayExtraKeyBenefitsTab onEverydayExtraKeyBenefitsTab, OnEverydayExtraFaqsTab onEverydayExtraFaqsTab) {
            Intrinsics.h(__typename, "__typename");
            this.f5925a = __typename;
            this.b = onEverydayExtraKeyBenefitsTab;
            this.c = onEverydayExtraFaqsTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) obj;
            return Intrinsics.c(this.f5925a, tab.f5925a) && Intrinsics.c(this.b, tab.b) && Intrinsics.c(this.c, tab.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5925a.hashCode() * 31;
            OnEverydayExtraKeyBenefitsTab onEverydayExtraKeyBenefitsTab = this.b;
            int iHashCode2 = (iHashCode + (onEverydayExtraKeyBenefitsTab == null ? 0 : onEverydayExtraKeyBenefitsTab.hashCode())) * 31;
            OnEverydayExtraFaqsTab onEverydayExtraFaqsTab = this.c;
            return iHashCode2 + (onEverydayExtraFaqsTab != null ? onEverydayExtraFaqsTab.hashCode() : 0);
        }

        public final String toString() {
            return "Tab(__typename=" + this.f5925a + ", onEverydayExtraKeyBenefitsTab=" + this.b + ", onEverydayExtraFaqsTab=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasLandingQuery$TermsAndConditions;", "", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f5926a;
        public final String b;
        public final String c;

        public TermsAndConditions(String str, String str2, String str3) {
            this.f5926a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
            return Intrinsics.c(this.f5926a, termsAndConditions.f5926a) && Intrinsics.c(this.b, termsAndConditions.b) && Intrinsics.c(this.c, termsAndConditions.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5926a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("TermsAndConditions(__typename=", this.f5926a, ", title=", this.b, ", termsAndConditions="), this.c, ")");
        }
    }

    public EverydayExtrasLandingQuery(Optional optional, EverydayExtraLandingFeatureFlags everydayExtraLandingFeatureFlags) {
        this.f5888a = optional;
        this.b = everydayExtraLandingFeatureFlags;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EverydayExtrasLandingQuery_ResponseAdapter.Data.f6010a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query EverydayExtrasLanding($acquisitionOfferName: String, $featureFlags: EverydayExtraLandingFeatureFlags!) { everydayExtraLanding(acquisitionOfferName: $acquisitionOfferName, featureFlags: $featureFlags) { __typename navigationTitle header { assetType assetUrl assetWidth assetHeight fit altText } tabs { __typename ... on EverydayExtraKeyBenefitsTab { id tabName sections { __typename ... on EverydayExtraKeyBenefitsSection { keyBenefitsItems: items { __typename ... on TitleTextItem { __typename content } ... on MediumIconListItem { __typename iconUrl title description } } } ... on EverydayExtraComparisonSection { comparisonItems: items { __typename ... on TitleTextItem { __typename content } ... on EverydayExtraBenefitsCompare { __typename columnHeadings { labelColumn { iconName label } rewardsColumn { iconName label } extraColumn { iconName label } } rows { rowId altBackground labelValue { label } rewardsValue { iconName label } extraValue { iconName label } } } } } } } ... on EverydayExtraFaqsTab { id tabName sections { __typename ... on EverydayExtraFaqsSection { faqItems: items { __typename ... on TitleTextItem { content } ... on SubheadTextItem { content } ... on Divider { type } ... on FaqItem { id question markdownAnswer } ... on NoteTextItem { content } } } } } } termsAndConditions { __typename title termsAndConditions } footer { __typename id footerItems: items { __typename label action actionUrl style } } alertDialog { title message analytics { eventCategory eventDescription } primaryCta { label url } secondaryCta { label url } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EverydayExtrasLandingQuery)) {
            return false;
        }
        EverydayExtrasLandingQuery everydayExtrasLandingQuery = (EverydayExtrasLandingQuery) obj;
        return Intrinsics.c(this.f5888a, everydayExtrasLandingQuery.f5888a) && Intrinsics.c(this.b, everydayExtrasLandingQuery.b);
    }

    public final int hashCode() {
        return this.b.f9541a.hashCode() + (this.f5888a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c85b68501f0f034dfc4feeb65b6f2cb829ee963dbca82928a02cb7013d940bc0";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EverydayExtrasLanding";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f5888a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("acquisitionOfferName");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("featureFlags");
        Adapters.c(EverydayExtraLandingFeatureFlags_InputAdapter.f9951a, false).toJson(jsonWriter, customScalarAdapters, this.b);
    }

    public final String toString() {
        return "EverydayExtrasLandingQuery(acquisitionOfferName=" + this.f5888a + ", featureFlags=" + this.b + ")";
    }
}
