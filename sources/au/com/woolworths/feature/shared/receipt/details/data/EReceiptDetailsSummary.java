package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsSummary;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "gst", "total", "", "discounts", ErrorBundle.SUMMARY_ENTRY, "<init>", "(Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;Ljava/util/List;Ljava/util/List;)V", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "b", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "d", "Ljava/util/List;", "a", "()Ljava/util/List;", "c", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsSummary extends EReceiptDetailsElement {

    @SerializedName("discounts")
    @NotNull
    private final List<EReceiptDetailsItem> discounts;

    @SerializedName("gst")
    @Nullable
    private final EReceiptDetailsItem gst;

    @SerializedName("summaryItems")
    @MappedName
    @NotNull
    private final List<EReceiptDetailsItem> summary;

    @SerializedName("receiptTotal")
    @MappedName
    @NotNull
    private final EReceiptDetailsItem total;

    public EReceiptDetailsSummary(@Nullable EReceiptDetailsItem eReceiptDetailsItem, @NotNull EReceiptDetailsItem total, @NotNull List<EReceiptDetailsItem> discounts, @NotNull List<EReceiptDetailsItem> summary) {
        Intrinsics.h(total, "total");
        Intrinsics.h(discounts, "discounts");
        Intrinsics.h(summary, "summary");
        this.gst = eReceiptDetailsItem;
        this.total = total;
        this.discounts = discounts;
        this.summary = summary;
    }

    /* renamed from: a, reason: from getter */
    public final List getDiscounts() {
        return this.discounts;
    }

    /* renamed from: b, reason: from getter */
    public final EReceiptDetailsItem getGst() {
        return this.gst;
    }

    /* renamed from: c, reason: from getter */
    public final List getSummary() {
        return this.summary;
    }

    /* renamed from: d, reason: from getter */
    public final EReceiptDetailsItem getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsSummary)) {
            return false;
        }
        EReceiptDetailsSummary eReceiptDetailsSummary = (EReceiptDetailsSummary) obj;
        return Intrinsics.c(this.gst, eReceiptDetailsSummary.gst) && Intrinsics.c(this.total, eReceiptDetailsSummary.total) && Intrinsics.c(this.discounts, eReceiptDetailsSummary.discounts) && Intrinsics.c(this.summary, eReceiptDetailsSummary.summary);
    }

    public final int hashCode() {
        EReceiptDetailsItem eReceiptDetailsItem = this.gst;
        return this.summary.hashCode() + b.d((this.total.hashCode() + ((eReceiptDetailsItem == null ? 0 : eReceiptDetailsItem.hashCode()) * 31)) * 31, 31, this.discounts);
    }

    public final String toString() {
        return "EReceiptDetailsSummary(gst=" + this.gst + ", total=" + this.total + ", discounts=" + this.discounts + ", summary=" + this.summary + ")";
    }
}
