package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItems;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "header", "", "items", "<init>", "(Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;Ljava/util/List;)V", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "a", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "Ljava/util/List;", "b", "()Ljava/util/List;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsItems extends EReceiptDetailsElement {

    @SerializedName("header")
    @NotNull
    private final EReceiptDetailsItem header;

    @SerializedName("items")
    @NotNull
    private final List<EReceiptDetailsItem> items;

    public EReceiptDetailsItems(@NotNull EReceiptDetailsItem header, @NotNull List<EReceiptDetailsItem> items) {
        Intrinsics.h(header, "header");
        Intrinsics.h(items, "items");
        this.header = header;
        this.items = items;
    }

    /* renamed from: a, reason: from getter */
    public final EReceiptDetailsItem getHeader() {
        return this.header;
    }

    /* renamed from: b, reason: from getter */
    public final List getItems() {
        return this.items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsItems)) {
            return false;
        }
        EReceiptDetailsItems eReceiptDetailsItems = (EReceiptDetailsItems) obj;
        return Intrinsics.c(this.header, eReceiptDetailsItems.header) && Intrinsics.c(this.items, eReceiptDetailsItems.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        return "EReceiptDetailsItems(header=" + this.header + ", items=" + this.items + ")";
    }
}
