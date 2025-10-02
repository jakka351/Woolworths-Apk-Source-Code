package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "", "", "value", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcodeType;", "type", "<init>", "(Ljava/lang/String;Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcodeType;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcodeType;", "a", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcodeType;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptBarcode {

    @SerializedName("type")
    @Nullable
    private final EReceiptBarcodeType type;

    @SerializedName("value")
    @NotNull
    private final String value;

    public EReceiptBarcode(@NotNull String value, @Nullable EReceiptBarcodeType eReceiptBarcodeType) {
        Intrinsics.h(value, "value");
        this.value = value;
        this.type = eReceiptBarcodeType;
    }

    /* renamed from: a, reason: from getter */
    public final EReceiptBarcodeType getType() {
        return this.type;
    }

    /* renamed from: b, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptBarcode)) {
            return false;
        }
        EReceiptBarcode eReceiptBarcode = (EReceiptBarcode) obj;
        return Intrinsics.c(this.value, eReceiptBarcode.value) && this.type == eReceiptBarcode.type;
    }

    public final int hashCode() {
        int iHashCode = this.value.hashCode() * 31;
        EReceiptBarcodeType eReceiptBarcodeType = this.type;
        return iHashCode + (eReceiptBarcodeType == null ? 0 : eReceiptBarcodeType.hashCode());
    }

    public final String toString() {
        return "EReceiptBarcode(value=" + this.value + ", type=" + this.type + ")";
    }
}
