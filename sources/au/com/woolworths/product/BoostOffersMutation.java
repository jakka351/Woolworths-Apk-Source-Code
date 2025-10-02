package au.com.woolworths.product;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.product.adapter.BoostOffersMutation_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.RewardsOfferStatus;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lau/com/woolworths/product/BoostOffersMutation$Data;", "Data", "BoostTagProductOffers", "BoostOffer", "Info", "OfferAnalytics", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoostOffersMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List f9220a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation$BoostOffer;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f9221a;
        public final boolean b;
        public final String c;
        public final Info d;

        public BoostOffer(String str, boolean z, String str2, Info info) {
            this.f9221a = str;
            this.b = z;
            this.c = str2;
            this.d = info;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BoostOffer)) {
                return false;
            }
            BoostOffer boostOffer = (BoostOffer) obj;
            return Intrinsics.c(this.f9221a, boostOffer.f9221a) && this.b == boostOffer.b && Intrinsics.c(this.c, boostOffer.c) && Intrinsics.c(this.d, boostOffer.d);
        }

        public final int hashCode() {
            int iC = b.c(b.e(this.f9221a.hashCode() * 31, 31, this.b), 31, this.c);
            Info info = this.d;
            return iC + (info == null ? 0 : info.hashCode());
        }

        public final String toString() {
            StringBuilder sbQ = a.q("BoostOffer(offerId=", this.f9221a, ", success=", ", message=", this.b);
            sbQ.append(this.c);
            sbQ.append(", info=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation$BoostTagProductOffers;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostTagProductOffers {

        /* renamed from: a, reason: collision with root package name */
        public final List f9222a;

        public BoostTagProductOffers(List list) {
            this.f9222a = list;
        }

        /* renamed from: a, reason: from getter */
        public final List getF9222a() {
            return this.f9222a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoostTagProductOffers) && Intrinsics.c(this.f9222a, ((BoostTagProductOffers) obj).f9222a);
        }

        public final int hashCode() {
            List list = this.f9222a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.l("BoostTagProductOffers(boostOffers=", ")", this.f9222a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final BoostTagProductOffers f9223a;

        public Data(BoostTagProductOffers boostTagProductOffers) {
            this.f9223a = boostTagProductOffers;
        }

        /* renamed from: a, reason: from getter */
        public final BoostTagProductOffers getF9223a() {
            return this.f9223a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f9223a, ((Data) obj).f9223a);
        }

        public final int hashCode() {
            BoostTagProductOffers boostTagProductOffers = this.f9223a;
            if (boostTagProductOffers == null) {
                return 0;
            }
            return boostTagProductOffers.hashCode();
        }

        public final String toString() {
            return "Data(boostTagProductOffers=" + this.f9223a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation$Info;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {

        /* renamed from: a, reason: collision with root package name */
        public final String f9224a;
        public final String b;
        public final RewardsOfferStatus c;
        public final String d;
        public final String e;
        public final OfferAnalytics f;

        public Info(String str, String str2, RewardsOfferStatus rewardsOfferStatus, String str3, String str4, OfferAnalytics offerAnalytics) {
            this.f9224a = str;
            this.b = str2;
            this.c = rewardsOfferStatus;
            this.d = str3;
            this.e = str4;
            this.f = offerAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.f9224a, info.f9224a) && Intrinsics.c(this.b, info.b) && this.c == info.c && Intrinsics.c(this.d, info.d) && Intrinsics.c(this.e, info.e) && Intrinsics.c(this.f, info.f);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.c(this.f9224a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            OfferAnalytics offerAnalytics = this.f;
            return iHashCode3 + (offerAnalytics != null ? offerAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Info(offerId=", this.f9224a, ", displayExpiry=", this.b, ", offerStatus=");
            sbV.append(this.c);
            sbV.append(", displayStatus=");
            sbV.append(this.d);
            sbV.append(", minimumSpend=");
            sbV.append(this.e);
            sbV.append(", offerAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/BoostOffersMutation$OfferAnalytics;", "", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f9225a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public OfferAnalytics(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.f9225a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferAnalytics)) {
                return false;
            }
            OfferAnalytics offerAnalytics = (OfferAnalytics) obj;
            return Intrinsics.c(this.f9225a, offerAnalytics.f9225a) && Intrinsics.c(this.b, offerAnalytics.b) && Intrinsics.c(this.c, offerAnalytics.c) && Intrinsics.c(this.d, offerAnalytics.d) && Intrinsics.c(this.e, offerAnalytics.e) && Intrinsics.c(this.f, offerAnalytics.f) && Intrinsics.c(this.g, offerAnalytics.g) && Intrinsics.c(this.h, offerAnalytics.h) && Intrinsics.c(this.i, offerAnalytics.i);
        }

        public final int hashCode() {
            String str = this.f9225a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OfferAnalytics(offerName=", this.f9225a, ", campaignStream=", this.b, ", channel=");
            a.B(sbV, this.c, ", status=", this.d, ", offerType=");
            a.B(sbV, this.e, ", partnerId=", this.f, ", rtlAccountID=");
            a.B(sbV, this.g, ", rtlCampaignID=", this.h, ", rtlCampaignCode=");
            return YU.a.o(sbV, this.i, ")");
        }
    }

    public BoostOffersMutation(List offerIds) {
        Intrinsics.h(offerIds, "offerIds");
        this.f9220a = offerIds;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(BoostOffersMutation_ResponseAdapter.Data.f9236a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation boostOffers($offerIds: [ID]!) { boostTagProductOffers(offerIds: $offerIds) { boostOffers { offerId success message info { offerId displayExpiry offerStatus displayStatus minimumSpend offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BoostOffersMutation) && Intrinsics.c(this.f9220a, ((BoostOffersMutation) obj).f9220a);
    }

    public final int hashCode() {
        return this.f9220a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "e4f5cd534bbde94f722b837b56c62496df2f881a3c7c893f16d8192870414487";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "boostOffers";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerIds");
        Adapters.a(Adapters.i).toJson(jsonWriter, customScalarAdapters, this.f9220a);
    }

    public final String toString() {
        return au.com.woolworths.android.onesite.a.l("BoostOffersMutation(offerIds=", ")", this.f9220a);
    }
}
