package au.com.woolworths.shop.graphql.type;

import com.apollographql.apollo.api.UnionType;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ReceiptDetailsItem;", "", "Companion", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReceiptDetailsItem {

    /* renamed from: a, reason: collision with root package name */
    public static final UnionType f11840a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/graphql/type/ReceiptDetailsItem$Companion;", "", "schema-shop"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i = ReceiptDetailsHeader.f11838a;
        int i2 = ReceiptDetailsTotal.f11848a;
        int i3 = ReceiptDetailsItems.f11841a;
        int i4 = ReceiptDetailsSummary.f11847a;
        int i5 = ReceiptDetailsPayments.f11845a;
        int i6 = ReceiptDetailsSavings.f11846a;
        int i7 = ReceiptDetailsCoupon.f11835a;
        int i8 = ReceiptDetailsFooter.f11837a;
        int i9 = ReceiptDetailsInfo.f11839a;
        f11840a = new UnionType("ReceiptDetailsItem");
    }
}
