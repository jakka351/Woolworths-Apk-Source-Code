package au.com.woolworths.shop.receipts.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.shop.receipts.EReceiptDetailsQuery;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.bouncycastle.i18n.TextBundle;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\bÇ\u0002\u0018\u00002\u00020\u0001:\u001b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter;", "", "Data", "ReceiptDetails", "Download", "Detail", "OnReceiptDetailsHeader", "OnReceiptDetailsTotal", "OnReceiptDetailsItems", "Header", "Item", "OnReceiptDetailsSummary", "Discount", "SummaryItem", "Gst", "ReceiptTotal", "OnReceiptDetailsInfo", "Header1", "Info", "OnReceiptDetailsPayments", "Payment", "PaymentDetail", "OnReceiptDetailsSavings", "SummaryItem1", "OnReceiptDetailsCoupon", "Section", "Barcode", "OnReceiptDetailsFooter", "Barcode1", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EReceiptDetailsQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Barcode;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Barcode;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Barcode implements Adapter<EReceiptDetailsQuery.Barcode> {

        /* renamed from: a, reason: collision with root package name */
        public static final Barcode f12835a = new Barcode();
        public static final List b = CollectionsKt.R("value", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new EReceiptDetailsQuery.Barcode(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Barcode value = (EReceiptDetailsQuery.Barcode) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("value");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12793a);
            writer.F1("type");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Barcode1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Barcode1;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Barcode1 implements Adapter<EReceiptDetailsQuery.Barcode1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Barcode1 f12836a = new Barcode1();
        public static final List b = CollectionsKt.R("value", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new EReceiptDetailsQuery.Barcode1(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Barcode1 value = (EReceiptDetailsQuery.Barcode1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("value");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12794a);
            writer.F1("type");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Data;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<EReceiptDetailsQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f12837a = new Data();
        public static final List b = CollectionsKt.Q("receiptDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EReceiptDetailsQuery.ReceiptDetails receiptDetails = null;
            while (reader.o2(b) == 0) {
                receiptDetails = (EReceiptDetailsQuery.ReceiptDetails) Adapters.b(Adapters.c(ReceiptDetails.f12857a, false)).fromJson(reader, customScalarAdapters);
            }
            return new EReceiptDetailsQuery.Data(receiptDetails);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Data value = (EReceiptDetailsQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("receiptDetails");
            Adapters.b(Adapters.c(ReceiptDetails.f12857a, false)).toJson(writer, customScalarAdapters, value.f12795a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Detail;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Detail;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Detail implements Adapter<EReceiptDetailsQuery.Detail> {

        /* renamed from: a, reason: collision with root package name */
        public static final Detail f12838a = new Detail();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            EReceiptDetailsQuery.OnReceiptDetailsHeader onReceiptDetailsHeaderA;
            EReceiptDetailsQuery.OnReceiptDetailsTotal onReceiptDetailsTotalA;
            EReceiptDetailsQuery.OnReceiptDetailsItems onReceiptDetailsItemsA;
            EReceiptDetailsQuery.OnReceiptDetailsSummary onReceiptDetailsSummaryA;
            EReceiptDetailsQuery.OnReceiptDetailsInfo onReceiptDetailsInfoA;
            EReceiptDetailsQuery.OnReceiptDetailsPayments onReceiptDetailsPaymentsA;
            EReceiptDetailsQuery.OnReceiptDetailsSavings onReceiptDetailsSavingsA;
            EReceiptDetailsQuery.OnReceiptDetailsCoupon onReceiptDetailsCouponA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            EReceiptDetailsQuery.OnReceiptDetailsFooter onReceiptDetailsFooterA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsHeader"))) {
                reader.o();
                onReceiptDetailsHeaderA = OnReceiptDetailsHeader.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsTotal"))) {
                reader.o();
                onReceiptDetailsTotalA = OnReceiptDetailsTotal.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsTotalA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsItems"))) {
                reader.o();
                onReceiptDetailsItemsA = OnReceiptDetailsItems.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsItemsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsSummary"))) {
                reader.o();
                onReceiptDetailsSummaryA = OnReceiptDetailsSummary.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsSummaryA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsInfo"))) {
                reader.o();
                onReceiptDetailsInfoA = OnReceiptDetailsInfo.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsInfoA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsPayments"))) {
                reader.o();
                onReceiptDetailsPaymentsA = OnReceiptDetailsPayments.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsPaymentsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsSavings"))) {
                reader.o();
                onReceiptDetailsSavingsA = OnReceiptDetailsSavings.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsSavingsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsCoupon"))) {
                reader.o();
                onReceiptDetailsCouponA = OnReceiptDetailsCoupon.a(reader, customScalarAdapters);
            } else {
                onReceiptDetailsCouponA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ReceiptDetailsFooter"))) {
                reader.o();
                onReceiptDetailsFooterA = OnReceiptDetailsFooter.a(reader, customScalarAdapters);
            }
            return new EReceiptDetailsQuery.Detail(str, onReceiptDetailsHeaderA, onReceiptDetailsTotalA, onReceiptDetailsItemsA, onReceiptDetailsSummaryA, onReceiptDetailsInfoA, onReceiptDetailsPaymentsA, onReceiptDetailsSavingsA, onReceiptDetailsCouponA, onReceiptDetailsFooterA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Detail value = (EReceiptDetailsQuery.Detail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12796a);
            EReceiptDetailsQuery.OnReceiptDetailsHeader onReceiptDetailsHeader = value.b;
            if (onReceiptDetailsHeader != null) {
                OnReceiptDetailsHeader.b(writer, customScalarAdapters, onReceiptDetailsHeader);
            }
            EReceiptDetailsQuery.OnReceiptDetailsTotal onReceiptDetailsTotal = value.c;
            if (onReceiptDetailsTotal != null) {
                OnReceiptDetailsTotal.b(writer, customScalarAdapters, onReceiptDetailsTotal);
            }
            EReceiptDetailsQuery.OnReceiptDetailsItems onReceiptDetailsItems = value.d;
            if (onReceiptDetailsItems != null) {
                OnReceiptDetailsItems.b(writer, customScalarAdapters, onReceiptDetailsItems);
            }
            EReceiptDetailsQuery.OnReceiptDetailsSummary onReceiptDetailsSummary = value.e;
            if (onReceiptDetailsSummary != null) {
                OnReceiptDetailsSummary.b(writer, customScalarAdapters, onReceiptDetailsSummary);
            }
            EReceiptDetailsQuery.OnReceiptDetailsInfo onReceiptDetailsInfo = value.f;
            if (onReceiptDetailsInfo != null) {
                OnReceiptDetailsInfo.b(writer, customScalarAdapters, onReceiptDetailsInfo);
            }
            EReceiptDetailsQuery.OnReceiptDetailsPayments onReceiptDetailsPayments = value.g;
            if (onReceiptDetailsPayments != null) {
                OnReceiptDetailsPayments.b(writer, customScalarAdapters, onReceiptDetailsPayments);
            }
            EReceiptDetailsQuery.OnReceiptDetailsSavings onReceiptDetailsSavings = value.h;
            if (onReceiptDetailsSavings != null) {
                OnReceiptDetailsSavings.b(writer, customScalarAdapters, onReceiptDetailsSavings);
            }
            EReceiptDetailsQuery.OnReceiptDetailsCoupon onReceiptDetailsCoupon = value.i;
            if (onReceiptDetailsCoupon != null) {
                OnReceiptDetailsCoupon.b(writer, customScalarAdapters, onReceiptDetailsCoupon);
            }
            EReceiptDetailsQuery.OnReceiptDetailsFooter onReceiptDetailsFooter = value.j;
            if (onReceiptDetailsFooter != null) {
                OnReceiptDetailsFooter.b(writer, customScalarAdapters, onReceiptDetailsFooter);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Discount;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Discount;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Discount implements Adapter<EReceiptDetailsQuery.Discount> {

        /* renamed from: a, reason: collision with root package name */
        public static final Discount f12839a = new Discount();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.Discount(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Discount value = (EReceiptDetailsQuery.Discount) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12797a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Download;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Download;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Download implements Adapter<EReceiptDetailsQuery.Download> {

        /* renamed from: a, reason: collision with root package name */
        public static final Download f12840a = new Download();
        public static final List b = CollectionsKt.R("url", "filename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.Download(str, str2);
            }
            Assertions.a(reader, "filename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Download value = (EReceiptDetailsQuery.Download) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12798a);
            writer.F1("filename");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Gst;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Gst;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Gst implements Adapter<EReceiptDetailsQuery.Gst> {

        /* renamed from: a, reason: collision with root package name */
        public static final Gst f12841a = new Gst();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.Gst(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Gst value = (EReceiptDetailsQuery.Gst) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12799a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Header;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Header;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header implements Adapter<EReceiptDetailsQuery.Header> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header f12842a = new Header();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new EReceiptDetailsQuery.Header(str, str2);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Header value = (EReceiptDetailsQuery.Header) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12800a);
            writer.F1("amount");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Header1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Header1;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Header1 implements Adapter<EReceiptDetailsQuery.Header1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Header1 f12843a = new Header1();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.Header1(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Header1 value = (EReceiptDetailsQuery.Header1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12801a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Info;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<EReceiptDetailsQuery.Info> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info f12844a = new Info();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.Info(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Info value = (EReceiptDetailsQuery.Info) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12802a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Item;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<EReceiptDetailsQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f12845a = new Item();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.Item(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Item value = (EReceiptDetailsQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12803a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsCoupon;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsCoupon;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsCoupon implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsCoupon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12846a = CollectionsKt.R("headerImageUrl", "footer", "sections", "barcode");

        public static EReceiptDetailsQuery.OnReceiptDetailsCoupon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            EReceiptDetailsQuery.Barcode barcode = null;
            while (true) {
                int iO2 = reader.o2(f12846a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(Section.f12859a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    barcode = (EReceiptDetailsQuery.Barcode) Adapters.b(Adapters.c(Barcode.f12835a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsCoupon(str, str2, arrayListFromJson, barcode);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsCoupon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerImageUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12804a);
            writer.F1("footer");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f12859a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("barcode");
            Adapters.b(Adapters.c(Barcode.f12835a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsCoupon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsFooter;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsFooter implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12847a = CollectionsKt.R("barcode", "transactionDetails", "abnAndStore");

        public static EReceiptDetailsQuery.OnReceiptDetailsFooter a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EReceiptDetailsQuery.Barcode1 barcode1 = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f12847a);
                if (iO2 == 0) {
                    barcode1 = (EReceiptDetailsQuery.Barcode1) Adapters.b(Adapters.c(Barcode1.f12836a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "transactionDetails");
                throw null;
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsFooter(barcode1, str, str2);
            }
            Assertions.a(reader, "abnAndStore");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsFooter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("barcode");
            Adapters.b(Adapters.c(Barcode1.f12836a, false)).toJson(writer, customScalarAdapters, value.f12805a);
            writer.F1("transactionDetails");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("abnAndStore");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsFooter) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsHeader;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsHeader implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12848a = CollectionsKt.R("iconUrl", "title", "content", "division", "storeNo");

        public static EReceiptDetailsQuery.OnReceiptDetailsHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f12848a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsHeader(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12806a);
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("division");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("storeNo");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsInfo;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsInfo implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12849a = CollectionsKt.R("header", "info");

        public static EReceiptDetailsQuery.OnReceiptDetailsInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EReceiptDetailsQuery.Header1 header1 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f12849a);
                if (iO2 == 0) {
                    header1 = (EReceiptDetailsQuery.Header1) Adapters.c(Header1.f12843a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Info.f12844a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (header1 == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsInfo(header1, arrayListFromJson);
            }
            Assertions.a(reader, "info");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.c(Header1.f12843a, false).toJson(writer, customScalarAdapters, value.f12807a);
            writer.F1("info");
            Adapters.a(Adapters.c(Info.f12844a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsItems;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsItems;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsItems implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsItems> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12850a = CollectionsKt.R("header", "items");

        public static EReceiptDetailsQuery.OnReceiptDetailsItems a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EReceiptDetailsQuery.Header header = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f12850a);
                if (iO2 == 0) {
                    header = (EReceiptDetailsQuery.Header) Adapters.c(Header.f12842a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f12845a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (header == null) {
                Assertions.a(reader, "header");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsItems(header, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsItems value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("header");
            Adapters.c(Header.f12842a, false).toJson(writer, customScalarAdapters, value.f12808a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f12845a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsItems) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsPayments;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsPayments;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsPayments implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsPayments> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12851a = CollectionsKt.Q("payments");

        public static EReceiptDetailsQuery.OnReceiptDetailsPayments a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f12851a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Payment.f12855a, false)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsPayments(arrayListFromJson);
            }
            Assertions.a(reader, "payments");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsPayments value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("payments");
            Adapters.a(Adapters.c(Payment.f12855a, false)).toJson(writer, customScalarAdapters, value.f12809a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsPayments) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsSavings;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsSavings;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsSavings implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsSavings> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12852a = CollectionsKt.R("savings", "summaryItems");

        public static EReceiptDetailsQuery.OnReceiptDetailsSavings a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f12852a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(SummaryItem1.f12861a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "savings");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsSavings(str, arrayListFromJson);
            }
            Assertions.a(reader, "summaryItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsSavings value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("savings");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12810a);
            writer.F1("summaryItems");
            Adapters.a(Adapters.c(SummaryItem1.f12861a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsSavings) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsSummary;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsSummary implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12853a = CollectionsKt.R("discounts", "summaryItems", "gst", "receiptTotal");

        public static EReceiptDetailsQuery.OnReceiptDetailsSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            EReceiptDetailsQuery.Gst gst = null;
            EReceiptDetailsQuery.ReceiptTotal receiptTotal = null;
            while (true) {
                int iO2 = reader.o2(f12853a);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Discount.f12839a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson2 = Adapters.a(Adapters.c(SummaryItem.f12860a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    gst = (EReceiptDetailsQuery.Gst) Adapters.b(Adapters.c(Gst.f12841a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    receiptTotal = (EReceiptDetailsQuery.ReceiptTotal) Adapters.c(ReceiptTotal.f12858a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "discounts");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "summaryItems");
                throw null;
            }
            if (receiptTotal != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsSummary(arrayListFromJson, arrayListFromJson2, gst, receiptTotal);
            }
            Assertions.a(reader, "receiptTotal");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("discounts");
            Adapters.a(Adapters.c(Discount.f12839a, false)).toJson(writer, customScalarAdapters, value.f12811a);
            writer.F1("summaryItems");
            Adapters.a(Adapters.c(SummaryItem.f12860a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("gst");
            Adapters.b(Adapters.c(Gst.f12841a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("receiptTotal");
            Adapters.c(ReceiptTotal.f12858a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$OnReceiptDetailsTotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsTotal;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnReceiptDetailsTotal implements Adapter<EReceiptDetailsQuery.OnReceiptDetailsTotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f12854a = CollectionsKt.Q("total");

        public static EReceiptDetailsQuery.OnReceiptDetailsTotal a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f12854a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EReceiptDetailsQuery.OnReceiptDetailsTotal(str);
            }
            Assertions.a(reader, "total");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, EReceiptDetailsQuery.OnReceiptDetailsTotal value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("total");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12812a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (EReceiptDetailsQuery.OnReceiptDetailsTotal) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Payment;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Payment;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Payment implements Adapter<EReceiptDetailsQuery.Payment> {

        /* renamed from: a, reason: collision with root package name */
        public static final Payment f12855a = new Payment();
        public static final List b = CollectionsKt.R(lqlqqlq.mmm006Dm006Dm, "amount", "iconUrl", "paymentDetails");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(PaymentDetail.f12856a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "amount");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.Payment(str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "paymentDetails");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Payment value = (EReceiptDetailsQuery.Payment) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f12813a);
            writer.F1("amount");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("paymentDetails");
            Adapters.a(Adapters.c(PaymentDetail.f12856a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$PaymentDetail;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$PaymentDetail;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PaymentDetail implements Adapter<EReceiptDetailsQuery.PaymentDetail> {

        /* renamed from: a, reason: collision with root package name */
        public static final PaymentDetail f12856a = new PaymentDetail();
        public static final List b = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new EReceiptDetailsQuery.PaymentDetail(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.PaymentDetail value = (EReceiptDetailsQuery.PaymentDetail) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f12814a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$ReceiptDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$ReceiptDetails;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReceiptDetails implements Adapter<EReceiptDetailsQuery.ReceiptDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final ReceiptDetails f12857a = new ReceiptDetails();
        public static final List b = CollectionsKt.R("download", ErrorBundle.DETAIL_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            EReceiptDetailsQuery.Download download = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    download = (EReceiptDetailsQuery.Download) Adapters.b(Adapters.c(Download.f12840a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Detail.f12838a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.ReceiptDetails(download, arrayListFromJson);
            }
            Assertions.a(reader, ErrorBundle.DETAIL_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.ReceiptDetails value = (EReceiptDetailsQuery.ReceiptDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("download");
            Adapters.b(Adapters.c(Download.f12840a, false)).toJson(writer, customScalarAdapters, value.f12815a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.a(Adapters.c(Detail.f12838a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$ReceiptTotal;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$ReceiptTotal;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ReceiptTotal implements Adapter<EReceiptDetailsQuery.ReceiptTotal> {

        /* renamed from: a, reason: collision with root package name */
        public static final ReceiptTotal f12858a = new ReceiptTotal();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.ReceiptTotal(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.ReceiptTotal value = (EReceiptDetailsQuery.ReceiptTotal) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12816a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Section;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<EReceiptDetailsQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f12859a = new Section();
        public static final List b = CollectionsKt.R("sectionTitle", ErrorBundle.DETAIL_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new EReceiptDetailsQuery.Section(str, arrayListFromJson);
            }
            Assertions.a(reader, ErrorBundle.DETAIL_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.Section value = (EReceiptDetailsQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sectionTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f12817a);
            writer.F1(ErrorBundle.DETAIL_ENTRY);
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$SummaryItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$SummaryItem;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SummaryItem implements Adapter<EReceiptDetailsQuery.SummaryItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final SummaryItem f12860a = new SummaryItem();
        public static final List b = CollectionsKt.R("prefixChar", lqlqqlq.mmm006Dm006Dm, "amount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new EReceiptDetailsQuery.SummaryItem(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.SummaryItem value = (EReceiptDetailsQuery.SummaryItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12818a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/receipts/adapter/EReceiptDetailsQuery_ResponseAdapter$SummaryItem1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$SummaryItem1;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SummaryItem1 implements Adapter<EReceiptDetailsQuery.SummaryItem1> {

        /* renamed from: a, reason: collision with root package name */
        public static final SummaryItem1 f12861a = new SummaryItem1();
        public static final List b = CollectionsKt.R("prefixChar", "amount", lqlqqlq.mmm006Dm006Dm);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new EReceiptDetailsQuery.SummaryItem1(str, str2, str3);
            }
            Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            EReceiptDetailsQuery.SummaryItem1 value = (EReceiptDetailsQuery.SummaryItem1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("prefixChar");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f12819a);
            writer.F1("amount");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
