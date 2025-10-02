package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsInfo;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "header", "", "info", "<init>", "(Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;Ljava/util/List;)V", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "a", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsItem;", "Ljava/util/List;", "b", "()Ljava/util/List;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsInfo extends EReceiptDetailsElement {

    @SerializedName("header")
    @Nullable
    private final EReceiptDetailsItem header;

    @SerializedName("info")
    @NotNull
    private final List<EReceiptDetailsItem> info;

    public EReceiptDetailsInfo(@Nullable EReceiptDetailsItem eReceiptDetailsItem, @NotNull List<EReceiptDetailsItem> info) {
        Intrinsics.h(info, "info");
        this.header = eReceiptDetailsItem;
        this.info = info;
    }

    /* renamed from: a, reason: from getter */
    public final EReceiptDetailsItem getHeader() {
        return this.header;
    }

    /* renamed from: b, reason: from getter */
    public final List getInfo() {
        return this.info;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsInfo)) {
            return false;
        }
        EReceiptDetailsInfo eReceiptDetailsInfo = (EReceiptDetailsInfo) obj;
        return Intrinsics.c(this.header, eReceiptDetailsInfo.header) && Intrinsics.c(this.info, eReceiptDetailsInfo.info);
    }

    public final int hashCode() {
        EReceiptDetailsItem eReceiptDetailsItem = this.header;
        return this.info.hashCode() + ((eReceiptDetailsItem == null ? 0 : eReceiptDetailsItem.hashCode()) * 31);
    }

    public final String toString() {
        return "EReceiptDetailsInfo(header=" + this.header + ", info=" + this.info + ")";
    }
}
