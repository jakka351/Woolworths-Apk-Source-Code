package au.com.woolworths.shop.receipts.pagination;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry;", "", "MyOrdersBanner", "GroupHeader", "ReceiptItem", "NoMoreReceipts", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$GroupHeader;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$MyOrdersBanner;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$NoMoreReceipts;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$ReceiptItem;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ReceiptRowEntry {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$GroupHeader;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GroupHeader implements ReceiptRowEntry {

        /* renamed from: a, reason: collision with root package name */
        public final String f12873a;

        public GroupHeader(String str) {
            this.f12873a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GroupHeader) && Intrinsics.c(this.f12873a, ((GroupHeader) obj).f12873a);
        }

        @Override // au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry
        /* renamed from: getKey */
        public final String getF12876a() {
            return a.d(this.f12873a.hashCode(), "id_group_header_");
        }

        public final int hashCode() {
            return this.f12873a.hashCode();
        }

        public final String toString() {
            return a.h("GroupHeader(title=", this.f12873a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$MyOrdersBanner;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyOrdersBanner implements ReceiptRowEntry {

        /* renamed from: a, reason: collision with root package name */
        public static final MyOrdersBanner f12874a = new MyOrdersBanner();

        @Override // au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry
        /* renamed from: getKey */
        public final String getF12876a() {
            return "id_my_orders_banner";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$NoMoreReceipts;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoMoreReceipts implements ReceiptRowEntry {

        /* renamed from: a, reason: collision with root package name */
        public static final NoMoreReceipts f12875a = new NoMoreReceipts();

        @Override // au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry
        /* renamed from: getKey */
        public final String getF12876a() {
            return "id_no_more_receipts";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry$ReceiptItem;", "Lau/com/woolworths/shop/receipts/pagination/ReceiptRowEntry;", "receipts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReceiptItem implements ReceiptRowEntry {

        /* renamed from: a, reason: collision with root package name */
        public final String f12876a;
        public final String b;
        public final String c;

        public ReceiptItem(String str, String str2, String str3) {
            this.f12876a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReceiptItem)) {
                return false;
            }
            ReceiptItem receiptItem = (ReceiptItem) obj;
            return Intrinsics.c(this.f12876a, receiptItem.f12876a) && Intrinsics.c(this.b, receiptItem.b) && Intrinsics.c(this.c, receiptItem.c);
        }

        @Override // au.com.woolworths.shop.receipts.pagination.ReceiptRowEntry
        /* renamed from: getKey, reason: from getter */
        public final String getF12876a() {
            return this.f12876a;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f12876a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("ReceiptItem(id=", this.f12876a, ", displayDate=", this.b, ", displayValue="), this.c, ")");
        }
    }

    /* renamed from: getKey */
    String getF12876a();
}
