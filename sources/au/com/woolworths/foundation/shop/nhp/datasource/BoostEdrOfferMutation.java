package au.com.woolworths.foundation.shop.nhp.datasource;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.shop.nhp.datasource.adapter.BoostEdrOfferMutation_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.RtlBoostState;
import au.com.woolworths.shop.graphql.type.RtlOfferStatus;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\n\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Data;", "Data", "BoostEdrOffer", "OnEdrOffer", "OfferButtonAction", "OfferButtonLabel", "Analytics", "OnSnackBar", "Analytics1", "ImpressionAnalytics", "Companion", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoostEdrOfferMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8756a;
    public final String b;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Analytics;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f8757a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f8757a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f8757a, analytics.f8757a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8757a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f8757a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Analytics1;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f8758a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f8758a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f8758a, analytics1.f8758a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8758a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f8758a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$BoostEdrOffer;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostEdrOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f8759a;
        public final OnEdrOffer b;
        public final OnSnackBar c;

        public BoostEdrOffer(String __typename, OnEdrOffer onEdrOffer, OnSnackBar onSnackBar) {
            Intrinsics.h(__typename, "__typename");
            this.f8759a = __typename;
            this.b = onEdrOffer;
            this.c = onSnackBar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BoostEdrOffer)) {
                return false;
            }
            BoostEdrOffer boostEdrOffer = (BoostEdrOffer) obj;
            return Intrinsics.c(this.f8759a, boostEdrOffer.f8759a) && Intrinsics.c(this.b, boostEdrOffer.b) && Intrinsics.c(this.c, boostEdrOffer.c);
        }

        public final int hashCode() {
            int iHashCode = this.f8759a.hashCode() * 31;
            OnEdrOffer onEdrOffer = this.b;
            int iHashCode2 = (iHashCode + (onEdrOffer == null ? 0 : onEdrOffer.hashCode())) * 31;
            OnSnackBar onSnackBar = this.c;
            return iHashCode2 + (onSnackBar != null ? onSnackBar.hashCode() : 0);
        }

        public final String toString() {
            return "BoostEdrOffer(__typename=" + this.f8759a + ", onEdrOffer=" + this.b + ", onSnackBar=" + this.c + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final BoostEdrOffer f8760a;

        public Data(BoostEdrOffer boostEdrOffer) {
            this.f8760a = boostEdrOffer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f8760a, ((Data) obj).f8760a);
        }

        public final int hashCode() {
            return this.f8760a.hashCode();
        }

        public final String toString() {
            return "Data(boostEdrOffer=" + this.f8760a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$ImpressionAnalytics;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f8761a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f8761a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f8761a, impressionAnalytics.f8761a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f8761a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f8761a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OfferButtonAction;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f8762a;
        public final ActionType b;
        public final String c;
        public final String d;

        public OfferButtonAction(String str, ActionType actionType, String str2, String str3) {
            this.f8762a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferButtonAction)) {
                return false;
            }
            OfferButtonAction offerButtonAction = (OfferButtonAction) obj;
            return Intrinsics.c(this.f8762a, offerButtonAction.f8762a) && this.b == offerButtonAction.b && Intrinsics.c(this.c, offerButtonAction.c) && Intrinsics.c(this.d, offerButtonAction.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f8762a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.w("OfferButtonAction(__typename=", this.f8762a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OfferButtonLabel;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferButtonLabel {

        /* renamed from: a, reason: collision with root package name */
        public final String f8763a;
        public final String b;
        public final String c;

        public OfferButtonLabel(String str, String str2, String str3) {
            this.f8763a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferButtonLabel)) {
                return false;
            }
            OfferButtonLabel offerButtonLabel = (OfferButtonLabel) obj;
            return Intrinsics.c(this.f8763a, offerButtonLabel.f8763a) && Intrinsics.c(this.b, offerButtonLabel.b) && Intrinsics.c(this.c, offerButtonLabel.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f8763a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("OfferButtonLabel(__typename=", this.f8763a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OnEdrOffer;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEdrOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f8764a;
        public final String b;
        public final String c;
        public final String d;
        public final RtlBoostState e;
        public final RtlOfferStatus f;
        public final OfferButtonAction g;
        public final OfferButtonLabel h;
        public final Analytics i;

        public OnEdrOffer(String str, String str2, String str3, String str4, RtlBoostState rtlBoostState, RtlOfferStatus rtlOfferStatus, OfferButtonAction offerButtonAction, OfferButtonLabel offerButtonLabel, Analytics analytics) {
            this.f8764a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = rtlBoostState;
            this.f = rtlOfferStatus;
            this.g = offerButtonAction;
            this.h = offerButtonLabel;
            this.i = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEdrOffer)) {
                return false;
            }
            OnEdrOffer onEdrOffer = (OnEdrOffer) obj;
            return Intrinsics.c(this.f8764a, onEdrOffer.f8764a) && Intrinsics.c(this.b, onEdrOffer.b) && Intrinsics.c(this.c, onEdrOffer.c) && Intrinsics.c(this.d, onEdrOffer.d) && this.e == onEdrOffer.e && this.f == onEdrOffer.f && Intrinsics.c(this.g, onEdrOffer.g) && Intrinsics.c(this.h, onEdrOffer.h) && Intrinsics.c(this.i, onEdrOffer.i);
        }

        public final int hashCode() {
            int iC = b.c(this.f8764a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            RtlBoostState rtlBoostState = this.e;
            int iHashCode = (iC2 + (rtlBoostState == null ? 0 : rtlBoostState.hashCode())) * 31;
            RtlOfferStatus rtlOfferStatus = this.f;
            int iHashCode2 = (iHashCode + (rtlOfferStatus == null ? 0 : rtlOfferStatus.hashCode())) * 31;
            OfferButtonAction offerButtonAction = this.g;
            int iHashCode3 = (iHashCode2 + (offerButtonAction == null ? 0 : offerButtonAction.hashCode())) * 31;
            OfferButtonLabel offerButtonLabel = this.h;
            int iHashCode4 = (iHashCode3 + (offerButtonLabel == null ? 0 : offerButtonLabel.hashCode())) * 31;
            Analytics analytics = this.i;
            return iHashCode4 + (analytics != null ? analytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnEdrOffer(__typename=", this.f8764a, ", offerId=", this.b, ", offerType=");
            a.B(sbV, this.c, ", linkedEdrHashCrn=", this.d, ", offerBoostState=");
            sbV.append(this.e);
            sbV.append(", offerStatus=");
            sbV.append(this.f);
            sbV.append(", offerButtonAction=");
            sbV.append(this.g);
            sbV.append(", offerButtonLabel=");
            sbV.append(this.h);
            sbV.append(", analytics=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/datasource/BoostEdrOfferMutation$OnSnackBar;", "", "nhp-datasource_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSnackBar {

        /* renamed from: a, reason: collision with root package name */
        public final String f8765a;
        public final String b;
        public final String c;
        public final Analytics1 d;
        public final ImpressionAnalytics e;

        public OnSnackBar(String str, String str2, String str3, Analytics1 analytics1, ImpressionAnalytics impressionAnalytics) {
            this.f8765a = str;
            this.b = str2;
            this.c = str3;
            this.d = analytics1;
            this.e = impressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSnackBar)) {
                return false;
            }
            OnSnackBar onSnackBar = (OnSnackBar) obj;
            return Intrinsics.c(this.f8765a, onSnackBar.f8765a) && Intrinsics.c(this.b, onSnackBar.b) && Intrinsics.c(this.c, onSnackBar.c) && Intrinsics.c(this.d, onSnackBar.d) && Intrinsics.c(this.e, onSnackBar.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f8765a.hashCode() * 31, 31, this.b), 31, this.c);
            Analytics1 analytics1 = this.d;
            int iHashCode = (iC + (analytics1 == null ? 0 : analytics1.hashCode())) * 31;
            ImpressionAnalytics impressionAnalytics = this.e;
            return iHashCode + (impressionAnalytics != null ? impressionAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnSnackBar(__typename=", this.f8765a, ", message=", this.b, ", eventSource=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    public BoostEdrOfferMutation(String offerId, String linkedHashCrn) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(linkedHashCrn, "linkedHashCrn");
        this.f8756a = offerId;
        this.b = linkedHashCrn;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(BoostEdrOfferMutation_ResponseAdapter.Data.f8770a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation BoostEdrOffer($offerId: String!, $linkedHashCrn: String!) { boostEdrOffer(offerId: $offerId, linkedEdrHashCrn: $linkedHashCrn) { __typename ... on EdrOffer { __typename offerId offerType linkedEdrHashCrn offerBoostState offerStatus offerButtonAction { __typename type action id } offerButtonLabel { __typename text altText } analytics { __typename ...analyticsFields } } ... on SnackBar { __typename message eventSource analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoostEdrOfferMutation)) {
            return false;
        }
        BoostEdrOfferMutation boostEdrOfferMutation = (BoostEdrOfferMutation) obj;
        return Intrinsics.c(this.f8756a, boostEdrOfferMutation.f8756a) && Intrinsics.c(this.b, boostEdrOfferMutation.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f8756a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6fd41ab6aaa9a69cc20a983e75a5b5639c072f00f888be97181fb5ac0802774f";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "BoostEdrOffer";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerId");
        Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.f8756a);
        jsonWriter.F1("linkedHashCrn");
        adapters$StringAdapter$1.toJson(jsonWriter, customScalarAdapters, this.b);
    }

    public final String toString() {
        return YU.a.j("BoostEdrOfferMutation(offerId=", this.f8756a, ", linkedHashCrn=", this.b, ")");
    }
}
