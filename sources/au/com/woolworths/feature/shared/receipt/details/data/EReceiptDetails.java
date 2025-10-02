package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetails;", "", "", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", ErrorBundle.DETAIL_ENTRY, "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDownload;", "download", "<init>", "(Ljava/util/List;Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDownload;)V", "Ljava/util/List;", "a", "()Ljava/util/List;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDownload;", "b", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDownload;", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetails {

    @SerializedName(ErrorBundle.DETAIL_ENTRY)
    @NotNull
    private final List<EReceiptDetailsElement> details;

    @SerializedName("download")
    @Nullable
    private final EReceiptDownload download;

    /* JADX WARN: Multi-variable type inference failed */
    public EReceiptDetails(@NotNull List<? extends EReceiptDetailsElement> details, @Nullable EReceiptDownload eReceiptDownload) {
        Intrinsics.h(details, "details");
        this.details = details;
        this.download = eReceiptDownload;
    }

    /* renamed from: a, reason: from getter */
    public final List getDetails() {
        return this.details;
    }

    /* renamed from: b, reason: from getter */
    public final EReceiptDownload getDownload() {
        return this.download;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetails)) {
            return false;
        }
        EReceiptDetails eReceiptDetails = (EReceiptDetails) obj;
        return Intrinsics.c(this.details, eReceiptDetails.details) && Intrinsics.c(this.download, eReceiptDetails.download);
    }

    public final int hashCode() {
        int iHashCode = this.details.hashCode() * 31;
        EReceiptDownload eReceiptDownload = this.download;
        return iHashCode + (eReceiptDownload == null ? 0 : eReceiptDownload.hashCode());
    }

    public final String toString() {
        return "EReceiptDetails(details=" + this.details + ", download=" + this.download + ")";
    }
}
