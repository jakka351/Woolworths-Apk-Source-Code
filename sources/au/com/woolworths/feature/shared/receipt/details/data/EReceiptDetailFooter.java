package au.com.woolworths.feature.shared.receipt.details.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailFooter;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "barcode", "", "transactionDetails", "abnAndStore", "<init>", "(Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;Ljava/lang/String;Ljava/lang/String;)V", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "b", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "a", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailFooter extends EReceiptDetailsElement {

    @SerializedName("abnAndStore")
    @NotNull
    private final String abnAndStore;

    @SerializedName("barcode")
    @Nullable
    private final EReceiptBarcode barcode;

    @SerializedName("transactionDetails")
    @NotNull
    private final String transactionDetails;

    public EReceiptDetailFooter(@Nullable EReceiptBarcode eReceiptBarcode, @NotNull String transactionDetails, @NotNull String abnAndStore) {
        Intrinsics.h(transactionDetails, "transactionDetails");
        Intrinsics.h(abnAndStore, "abnAndStore");
        this.barcode = eReceiptBarcode;
        this.transactionDetails = transactionDetails;
        this.abnAndStore = abnAndStore;
    }

    /* renamed from: a, reason: from getter */
    public final String getAbnAndStore() {
        return this.abnAndStore;
    }

    /* renamed from: b, reason: from getter */
    public final EReceiptBarcode getBarcode() {
        return this.barcode;
    }

    /* renamed from: c, reason: from getter */
    public final String getTransactionDetails() {
        return this.transactionDetails;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailFooter)) {
            return false;
        }
        EReceiptDetailFooter eReceiptDetailFooter = (EReceiptDetailFooter) obj;
        return Intrinsics.c(this.barcode, eReceiptDetailFooter.barcode) && Intrinsics.c(this.transactionDetails, eReceiptDetailFooter.transactionDetails) && Intrinsics.c(this.abnAndStore, eReceiptDetailFooter.abnAndStore);
    }

    public final int hashCode() {
        EReceiptBarcode eReceiptBarcode = this.barcode;
        return this.abnAndStore.hashCode() + b.c((eReceiptBarcode == null ? 0 : eReceiptBarcode.hashCode()) * 31, 31, this.transactionDetails);
    }

    public final String toString() {
        EReceiptBarcode eReceiptBarcode = this.barcode;
        String str = this.transactionDetails;
        String str2 = this.abnAndStore;
        StringBuilder sb = new StringBuilder("EReceiptDetailFooter(barcode=");
        sb.append(eReceiptBarcode);
        sb.append(", transactionDetails=");
        sb.append(str);
        sb.append(", abnAndStore=");
        return a.o(sb, str2, ")");
    }
}
