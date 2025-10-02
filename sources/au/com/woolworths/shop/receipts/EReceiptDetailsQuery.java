package au.com.woolworths.shop.receipts;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.receipts.adapter.EReceiptDetailsQuery_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u001c\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Data;", "Data", "ReceiptDetails", "Download", "Detail", "OnReceiptDetailsHeader", "OnReceiptDetailsTotal", "OnReceiptDetailsItems", "Header", "Item", "OnReceiptDetailsSummary", "Discount", "SummaryItem", "Gst", "ReceiptTotal", "OnReceiptDetailsInfo", "Header1", "Info", "OnReceiptDetailsPayments", "Payment", "PaymentDetail", "OnReceiptDetailsSavings", "SummaryItem1", "OnReceiptDetailsCoupon", "Section", "Barcode", "OnReceiptDetailsFooter", "Barcode1", "Companion", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class EReceiptDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f12792a;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Barcode;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Barcode {

        /* renamed from: a, reason: collision with root package name */
        public final String f12793a;
        public final String b;

        public Barcode(String str, String str2) {
            this.f12793a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Barcode)) {
                return false;
            }
            Barcode barcode = (Barcode) obj;
            return Intrinsics.c(this.f12793a, barcode.f12793a) && Intrinsics.c(this.b, barcode.b);
        }

        public final int hashCode() {
            int iHashCode = this.f12793a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Barcode(value=", this.f12793a, ", type=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Barcode1;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Barcode1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12794a;
        public final String b;

        public Barcode1(String str, String str2) {
            this.f12794a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Barcode1)) {
                return false;
            }
            Barcode1 barcode1 = (Barcode1) obj;
            return Intrinsics.c(this.f12794a, barcode1.f12794a) && Intrinsics.c(this.b, barcode1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f12794a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Barcode1(value=", this.f12794a, ", type=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ReceiptDetails f12795a;

        public Data(ReceiptDetails receiptDetails) {
            this.f12795a = receiptDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f12795a, ((Data) obj).f12795a);
        }

        public final int hashCode() {
            ReceiptDetails receiptDetails = this.f12795a;
            if (receiptDetails == null) {
                return 0;
            }
            return receiptDetails.hashCode();
        }

        public final String toString() {
            return "Data(receiptDetails=" + this.f12795a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Detail;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Detail {

        /* renamed from: a, reason: collision with root package name */
        public final String f12796a;
        public final OnReceiptDetailsHeader b;
        public final OnReceiptDetailsTotal c;
        public final OnReceiptDetailsItems d;
        public final OnReceiptDetailsSummary e;
        public final OnReceiptDetailsInfo f;
        public final OnReceiptDetailsPayments g;
        public final OnReceiptDetailsSavings h;
        public final OnReceiptDetailsCoupon i;
        public final OnReceiptDetailsFooter j;

        public Detail(String __typename, OnReceiptDetailsHeader onReceiptDetailsHeader, OnReceiptDetailsTotal onReceiptDetailsTotal, OnReceiptDetailsItems onReceiptDetailsItems, OnReceiptDetailsSummary onReceiptDetailsSummary, OnReceiptDetailsInfo onReceiptDetailsInfo, OnReceiptDetailsPayments onReceiptDetailsPayments, OnReceiptDetailsSavings onReceiptDetailsSavings, OnReceiptDetailsCoupon onReceiptDetailsCoupon, OnReceiptDetailsFooter onReceiptDetailsFooter) {
            Intrinsics.h(__typename, "__typename");
            this.f12796a = __typename;
            this.b = onReceiptDetailsHeader;
            this.c = onReceiptDetailsTotal;
            this.d = onReceiptDetailsItems;
            this.e = onReceiptDetailsSummary;
            this.f = onReceiptDetailsInfo;
            this.g = onReceiptDetailsPayments;
            this.h = onReceiptDetailsSavings;
            this.i = onReceiptDetailsCoupon;
            this.j = onReceiptDetailsFooter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj;
            return Intrinsics.c(this.f12796a, detail.f12796a) && Intrinsics.c(this.b, detail.b) && Intrinsics.c(this.c, detail.c) && Intrinsics.c(this.d, detail.d) && Intrinsics.c(this.e, detail.e) && Intrinsics.c(this.f, detail.f) && Intrinsics.c(this.g, detail.g) && Intrinsics.c(this.h, detail.h) && Intrinsics.c(this.i, detail.i) && Intrinsics.c(this.j, detail.j);
        }

        public final int hashCode() {
            int iHashCode = this.f12796a.hashCode() * 31;
            OnReceiptDetailsHeader onReceiptDetailsHeader = this.b;
            int iHashCode2 = (iHashCode + (onReceiptDetailsHeader == null ? 0 : onReceiptDetailsHeader.hashCode())) * 31;
            OnReceiptDetailsTotal onReceiptDetailsTotal = this.c;
            int iHashCode3 = (iHashCode2 + (onReceiptDetailsTotal == null ? 0 : onReceiptDetailsTotal.f12812a.hashCode())) * 31;
            OnReceiptDetailsItems onReceiptDetailsItems = this.d;
            int iHashCode4 = (iHashCode3 + (onReceiptDetailsItems == null ? 0 : onReceiptDetailsItems.hashCode())) * 31;
            OnReceiptDetailsSummary onReceiptDetailsSummary = this.e;
            int iHashCode5 = (iHashCode4 + (onReceiptDetailsSummary == null ? 0 : onReceiptDetailsSummary.hashCode())) * 31;
            OnReceiptDetailsInfo onReceiptDetailsInfo = this.f;
            int iHashCode6 = (iHashCode5 + (onReceiptDetailsInfo == null ? 0 : onReceiptDetailsInfo.hashCode())) * 31;
            OnReceiptDetailsPayments onReceiptDetailsPayments = this.g;
            int iHashCode7 = (iHashCode6 + (onReceiptDetailsPayments == null ? 0 : onReceiptDetailsPayments.f12809a.hashCode())) * 31;
            OnReceiptDetailsSavings onReceiptDetailsSavings = this.h;
            int iHashCode8 = (iHashCode7 + (onReceiptDetailsSavings == null ? 0 : onReceiptDetailsSavings.hashCode())) * 31;
            OnReceiptDetailsCoupon onReceiptDetailsCoupon = this.i;
            int iHashCode9 = (iHashCode8 + (onReceiptDetailsCoupon == null ? 0 : onReceiptDetailsCoupon.hashCode())) * 31;
            OnReceiptDetailsFooter onReceiptDetailsFooter = this.j;
            return iHashCode9 + (onReceiptDetailsFooter != null ? onReceiptDetailsFooter.hashCode() : 0);
        }

        public final String toString() {
            return "Detail(__typename=" + this.f12796a + ", onReceiptDetailsHeader=" + this.b + ", onReceiptDetailsTotal=" + this.c + ", onReceiptDetailsItems=" + this.d + ", onReceiptDetailsSummary=" + this.e + ", onReceiptDetailsInfo=" + this.f + ", onReceiptDetailsPayments=" + this.g + ", onReceiptDetailsSavings=" + this.h + ", onReceiptDetailsCoupon=" + this.i + ", onReceiptDetailsFooter=" + this.j + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Discount;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Discount {

        /* renamed from: a, reason: collision with root package name */
        public final String f12797a;
        public final String b;
        public final String c;

        public Discount(String str, String str2, String str3) {
            this.f12797a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj;
            return Intrinsics.c(this.f12797a, discount.f12797a) && Intrinsics.c(this.b, discount.b) && Intrinsics.c(this.c, discount.c);
        }

        public final int hashCode() {
            String str = this.f12797a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Discount(prefixChar=", this.f12797a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Download;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Download {

        /* renamed from: a, reason: collision with root package name */
        public final String f12798a;
        public final String b;

        public Download(String str, String str2) {
            this.f12798a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Download)) {
                return false;
            }
            Download download = (Download) obj;
            return Intrinsics.c(this.f12798a, download.f12798a) && Intrinsics.c(this.b, download.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12798a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Download(url=", this.f12798a, ", filename=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Gst;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Gst {

        /* renamed from: a, reason: collision with root package name */
        public final String f12799a;
        public final String b;
        public final String c;

        public Gst(String str, String str2, String str3) {
            this.f12799a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Gst)) {
                return false;
            }
            Gst gst = (Gst) obj;
            return Intrinsics.c(this.f12799a, gst.f12799a) && Intrinsics.c(this.b, gst.b) && Intrinsics.c(this.c, gst.c);
        }

        public final int hashCode() {
            String str = this.f12799a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Gst(prefixChar=", this.f12799a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Header;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f12800a;
        public final String b;

        public Header(String str, String str2) {
            this.f12800a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f12800a, header.f12800a) && Intrinsics.c(this.b, header.b);
        }

        public final int hashCode() {
            int iHashCode = this.f12800a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Header(description=", this.f12800a, ", amount=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Header1;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12801a;
        public final String b;
        public final String c;

        public Header1(String str, String str2, String str3) {
            this.f12801a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header1)) {
                return false;
            }
            Header1 header1 = (Header1) obj;
            return Intrinsics.c(this.f12801a, header1.f12801a) && Intrinsics.c(this.b, header1.b) && Intrinsics.c(this.c, header1.c);
        }

        public final int hashCode() {
            String str = this.f12801a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Header1(prefixChar=", this.f12801a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Info;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {

        /* renamed from: a, reason: collision with root package name */
        public final String f12802a;
        public final String b;
        public final String c;

        public Info(String str, String str2, String str3) {
            this.f12802a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.f12802a, info.f12802a) && Intrinsics.c(this.b, info.b) && Intrinsics.c(this.c, info.c);
        }

        public final int hashCode() {
            String str = this.f12802a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Info(prefixChar=", this.f12802a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Item;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f12803a;
        public final String b;
        public final String c;

        public Item(String str, String str2, String str3) {
            this.f12803a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f12803a, item.f12803a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            String str = this.f12803a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Item(prefixChar=", this.f12803a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsCoupon;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsCoupon {

        /* renamed from: a, reason: collision with root package name */
        public final String f12804a;
        public final String b;
        public final ArrayList c;
        public final Barcode d;

        public OnReceiptDetailsCoupon(String str, String str2, ArrayList arrayList, Barcode barcode) {
            this.f12804a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = barcode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsCoupon)) {
                return false;
            }
            OnReceiptDetailsCoupon onReceiptDetailsCoupon = (OnReceiptDetailsCoupon) obj;
            return Intrinsics.c(this.f12804a, onReceiptDetailsCoupon.f12804a) && Intrinsics.c(this.b, onReceiptDetailsCoupon.b) && this.c.equals(onReceiptDetailsCoupon.c) && Intrinsics.c(this.d, onReceiptDetailsCoupon.d);
        }

        public final int hashCode() {
            String str = this.f12804a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
            Barcode barcode = this.d;
            return iB + (barcode != null ? barcode.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnReceiptDetailsCoupon(headerImageUrl=", this.f12804a, ", footer=", this.b, ", sections=");
            sbV.append(this.c);
            sbV.append(", barcode=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsFooter;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsFooter {

        /* renamed from: a, reason: collision with root package name */
        public final Barcode1 f12805a;
        public final String b;
        public final String c;

        public OnReceiptDetailsFooter(Barcode1 barcode1, String str, String str2) {
            this.f12805a = barcode1;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsFooter)) {
                return false;
            }
            OnReceiptDetailsFooter onReceiptDetailsFooter = (OnReceiptDetailsFooter) obj;
            return Intrinsics.c(this.f12805a, onReceiptDetailsFooter.f12805a) && Intrinsics.c(this.b, onReceiptDetailsFooter.b) && Intrinsics.c(this.c, onReceiptDetailsFooter.c);
        }

        public final int hashCode() {
            Barcode1 barcode1 = this.f12805a;
            return this.c.hashCode() + b.c((barcode1 == null ? 0 : barcode1.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnReceiptDetailsFooter(barcode=");
            sb.append(this.f12805a);
            sb.append(", transactionDetails=");
            sb.append(this.b);
            sb.append(", abnAndStore=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsHeader;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f12806a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public OnReceiptDetailsHeader(String str, String str2, String str3, String str4, String str5) {
            this.f12806a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsHeader)) {
                return false;
            }
            OnReceiptDetailsHeader onReceiptDetailsHeader = (OnReceiptDetailsHeader) obj;
            return Intrinsics.c(this.f12806a, onReceiptDetailsHeader.f12806a) && Intrinsics.c(this.b, onReceiptDetailsHeader.b) && Intrinsics.c(this.c, onReceiptDetailsHeader.c) && Intrinsics.c(this.d, onReceiptDetailsHeader.d) && Intrinsics.c(this.e, onReceiptDetailsHeader.e);
        }

        public final int hashCode() {
            String str = this.f12806a;
            int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            String str2 = this.d;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnReceiptDetailsHeader(iconUrl=", this.f12806a, ", title=", this.b, ", content=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", division=", this.d, ", storeNo=");
            return a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsInfo;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Header1 f12807a;
        public final ArrayList b;

        public OnReceiptDetailsInfo(Header1 header1, ArrayList arrayList) {
            this.f12807a = header1;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsInfo)) {
                return false;
            }
            OnReceiptDetailsInfo onReceiptDetailsInfo = (OnReceiptDetailsInfo) obj;
            return this.f12807a.equals(onReceiptDetailsInfo.f12807a) && this.b.equals(onReceiptDetailsInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12807a.hashCode() * 31);
        }

        public final String toString() {
            return "OnReceiptDetailsInfo(header=" + this.f12807a + ", info=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsItems;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsItems {

        /* renamed from: a, reason: collision with root package name */
        public final Header f12808a;
        public final ArrayList b;

        public OnReceiptDetailsItems(Header header, ArrayList arrayList) {
            this.f12808a = header;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsItems)) {
                return false;
            }
            OnReceiptDetailsItems onReceiptDetailsItems = (OnReceiptDetailsItems) obj;
            return this.f12808a.equals(onReceiptDetailsItems.f12808a) && this.b.equals(onReceiptDetailsItems.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12808a.hashCode() * 31);
        }

        public final String toString() {
            return "OnReceiptDetailsItems(header=" + this.f12808a + ", items=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsPayments;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsPayments {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12809a;

        public OnReceiptDetailsPayments(ArrayList arrayList) {
            this.f12809a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnReceiptDetailsPayments) && this.f12809a.equals(((OnReceiptDetailsPayments) obj).f12809a);
        }

        public final int hashCode() {
            return this.f12809a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnReceiptDetailsPayments(payments=", ")", this.f12809a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsSavings;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsSavings {

        /* renamed from: a, reason: collision with root package name */
        public final String f12810a;
        public final ArrayList b;

        public OnReceiptDetailsSavings(String str, ArrayList arrayList) {
            this.f12810a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsSavings)) {
                return false;
            }
            OnReceiptDetailsSavings onReceiptDetailsSavings = (OnReceiptDetailsSavings) obj;
            return this.f12810a.equals(onReceiptDetailsSavings.f12810a) && this.b.equals(onReceiptDetailsSavings.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f12810a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnReceiptDetailsSavings(savings=", this.f12810a, ", summaryItems=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsSummary;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsSummary {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f12811a;
        public final ArrayList b;
        public final Gst c;
        public final ReceiptTotal d;

        public OnReceiptDetailsSummary(ArrayList arrayList, ArrayList arrayList2, Gst gst, ReceiptTotal receiptTotal) {
            this.f12811a = arrayList;
            this.b = arrayList2;
            this.c = gst;
            this.d = receiptTotal;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnReceiptDetailsSummary)) {
                return false;
            }
            OnReceiptDetailsSummary onReceiptDetailsSummary = (OnReceiptDetailsSummary) obj;
            return this.f12811a.equals(onReceiptDetailsSummary.f12811a) && this.b.equals(onReceiptDetailsSummary.b) && Intrinsics.c(this.c, onReceiptDetailsSummary.c) && this.d.equals(onReceiptDetailsSummary.d);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f12811a.hashCode() * 31, 31, this.b);
            Gst gst = this.c;
            return this.d.hashCode() + ((iB + (gst == null ? 0 : gst.hashCode())) * 31);
        }

        public final String toString() {
            return "OnReceiptDetailsSummary(discounts=" + this.f12811a + ", summaryItems=" + this.b + ", gst=" + this.c + ", receiptTotal=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$OnReceiptDetailsTotal;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnReceiptDetailsTotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f12812a;

        public OnReceiptDetailsTotal(String str) {
            this.f12812a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnReceiptDetailsTotal) && Intrinsics.c(this.f12812a, ((OnReceiptDetailsTotal) obj).f12812a);
        }

        public final int hashCode() {
            return this.f12812a.hashCode();
        }

        public final String toString() {
            return a.h("OnReceiptDetailsTotal(total=", this.f12812a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Payment;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Payment {

        /* renamed from: a, reason: collision with root package name */
        public final String f12813a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public Payment(String str, String str2, String str3, ArrayList arrayList) {
            this.f12813a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Payment)) {
                return false;
            }
            Payment payment = (Payment) obj;
            return this.f12813a.equals(payment.f12813a) && this.b.equals(payment.b) && Intrinsics.c(this.c, payment.c) && this.d.equals(payment.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f12813a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Payment(description=", this.f12813a, ", amount=", this.b, ", iconUrl=");
            sbV.append(this.c);
            sbV.append(", paymentDetails=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$PaymentDetail;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PaymentDetail {

        /* renamed from: a, reason: collision with root package name */
        public final String f12814a;

        public PaymentDetail(String str) {
            this.f12814a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PaymentDetail) && Intrinsics.c(this.f12814a, ((PaymentDetail) obj).f12814a);
        }

        public final int hashCode() {
            return this.f12814a.hashCode();
        }

        public final String toString() {
            return a.h("PaymentDetail(text=", this.f12814a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$ReceiptDetails;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReceiptDetails {

        /* renamed from: a, reason: collision with root package name */
        public final Download f12815a;
        public final ArrayList b;

        public ReceiptDetails(Download download, ArrayList arrayList) {
            this.f12815a = download;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReceiptDetails)) {
                return false;
            }
            ReceiptDetails receiptDetails = (ReceiptDetails) obj;
            return Intrinsics.c(this.f12815a, receiptDetails.f12815a) && this.b.equals(receiptDetails.b);
        }

        public final int hashCode() {
            Download download = this.f12815a;
            return this.b.hashCode() + ((download == null ? 0 : download.hashCode()) * 31);
        }

        public final String toString() {
            return "ReceiptDetails(download=" + this.f12815a + ", details=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$ReceiptTotal;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReceiptTotal {

        /* renamed from: a, reason: collision with root package name */
        public final String f12816a;
        public final String b;
        public final String c;

        public ReceiptTotal(String str, String str2, String str3) {
            this.f12816a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReceiptTotal)) {
                return false;
            }
            ReceiptTotal receiptTotal = (ReceiptTotal) obj;
            return Intrinsics.c(this.f12816a, receiptTotal.f12816a) && Intrinsics.c(this.b, receiptTotal.b) && Intrinsics.c(this.c, receiptTotal.c);
        }

        public final int hashCode() {
            String str = this.f12816a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("ReceiptTotal(prefixChar=", this.f12816a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$Section;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f12817a;
        public final ArrayList b;

        public Section(String str, ArrayList arrayList) {
            this.f12817a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f12817a, section.f12817a) && this.b.equals(section.b);
        }

        public final int hashCode() {
            String str = this.f12817a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("Section(sectionTitle=", this.f12817a, ", details=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$SummaryItem;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SummaryItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f12818a;
        public final String b;
        public final String c;

        public SummaryItem(String str, String str2, String str3) {
            this.f12818a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummaryItem)) {
                return false;
            }
            SummaryItem summaryItem = (SummaryItem) obj;
            return Intrinsics.c(this.f12818a, summaryItem.f12818a) && Intrinsics.c(this.b, summaryItem.b) && Intrinsics.c(this.c, summaryItem.c);
        }

        public final int hashCode() {
            String str = this.f12818a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            return iC + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("SummaryItem(prefixChar=", this.f12818a, ", description=", this.b, ", amount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/EReceiptDetailsQuery$SummaryItem1;", "", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SummaryItem1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f12819a;
        public final String b;
        public final String c;

        public SummaryItem1(String str, String str2, String str3) {
            this.f12819a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SummaryItem1)) {
                return false;
            }
            SummaryItem1 summaryItem1 = (SummaryItem1) obj;
            return Intrinsics.c(this.f12819a, summaryItem1.f12819a) && Intrinsics.c(this.b, summaryItem1.b) && Intrinsics.c(this.c, summaryItem1.c);
        }

        public final int hashCode() {
            String str = this.f12819a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return a.o(a.v("SummaryItem1(prefixChar=", this.f12819a, ", amount=", this.b, ", description="), this.c, ")");
        }
    }

    public EReceiptDetailsQuery(String receiptId) {
        Intrinsics.h(receiptId, "receiptId");
        this.f12792a = receiptId;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(EReceiptDetailsQuery_ResponseAdapter.Data.f12837a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query EReceiptDetails($receiptId: String!) { receiptDetails(receiptId: $receiptId) { download { url filename } details { __typename ... on ReceiptDetailsHeader { iconUrl title content division storeNo } ... on ReceiptDetailsTotal { total } ... on ReceiptDetailsItems { header { description amount } items { prefixChar description amount } } ... on ReceiptDetailsSummary { discounts { prefixChar description amount } summaryItems { prefixChar description amount } gst { prefixChar description amount } receiptTotal { prefixChar description amount } } ... on ReceiptDetailsInfo { header { prefixChar description amount } info { prefixChar description amount } } ... on ReceiptDetailsPayments { payments { description amount iconUrl paymentDetails: details { text } } } ... on ReceiptDetailsSavings { savings summaryItems { prefixChar amount description } } ... on ReceiptDetailsCoupon { headerImageUrl footer sections { sectionTitle details } barcode { value type } } ... on ReceiptDetailsFooter { barcode { value type } transactionDetails abnAndStore } } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EReceiptDetailsQuery) && Intrinsics.c(this.f12792a, ((EReceiptDetailsQuery) obj).f12792a);
    }

    public final int hashCode() {
        return this.f12792a.hashCode();
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "970b86b7c9c3c5f6a166e2c7e2947389ed0485de763b57803225c278a39cff3e";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "EReceiptDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("receiptId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f12792a);
    }

    public final String toString() {
        return a.h("EReceiptDetailsQuery(receiptId=", this.f12792a, ")");
    }
}
