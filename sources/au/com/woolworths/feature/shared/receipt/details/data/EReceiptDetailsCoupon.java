package au.com.woolworths.feature.shared.receipt.details.data;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsCoupon;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "", "headerImageUrl", "", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsCouponSection;", "sections", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "barcode", "footer", "<init>", "(Ljava/lang/String;Ljava/util/List;Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "a", "()Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptBarcode;", "b", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsCoupon extends EReceiptDetailsElement {

    @SerializedName("barcode")
    @Nullable
    private final EReceiptBarcode barcode;

    @SerializedName("footer")
    @Nullable
    private final String footer;

    @SerializedName("headerImageUrl")
    @Nullable
    private final String headerImageUrl;

    @SerializedName("sections")
    @NotNull
    private final List<EReceiptDetailsCouponSection> sections;

    public EReceiptDetailsCoupon(@Nullable String str, @NotNull List<EReceiptDetailsCouponSection> sections, @Nullable EReceiptBarcode eReceiptBarcode, @Nullable String str2) {
        Intrinsics.h(sections, "sections");
        this.headerImageUrl = str;
        this.sections = sections;
        this.barcode = eReceiptBarcode;
        this.footer = str2;
    }

    /* renamed from: a, reason: from getter */
    public final EReceiptBarcode getBarcode() {
        return this.barcode;
    }

    /* renamed from: b, reason: from getter */
    public final String getFooter() {
        return this.footer;
    }

    /* renamed from: c, reason: from getter */
    public final String getHeaderImageUrl() {
        return this.headerImageUrl;
    }

    /* renamed from: d, reason: from getter */
    public final List getSections() {
        return this.sections;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsCoupon)) {
            return false;
        }
        EReceiptDetailsCoupon eReceiptDetailsCoupon = (EReceiptDetailsCoupon) obj;
        return Intrinsics.c(this.headerImageUrl, eReceiptDetailsCoupon.headerImageUrl) && Intrinsics.c(this.sections, eReceiptDetailsCoupon.sections) && Intrinsics.c(this.barcode, eReceiptDetailsCoupon.barcode) && Intrinsics.c(this.footer, eReceiptDetailsCoupon.footer);
    }

    public final int hashCode() {
        String str = this.headerImageUrl;
        int iD = b.d((str == null ? 0 : str.hashCode()) * 31, 31, this.sections);
        EReceiptBarcode eReceiptBarcode = this.barcode;
        int iHashCode = (iD + (eReceiptBarcode == null ? 0 : eReceiptBarcode.hashCode())) * 31;
        String str2 = this.footer;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.headerImageUrl;
        List<EReceiptDetailsCouponSection> list = this.sections;
        EReceiptBarcode eReceiptBarcode = this.barcode;
        String str2 = this.footer;
        StringBuilder sbS = a.s("EReceiptDetailsCoupon(headerImageUrl=", str, ", sections=", ", barcode=", list);
        sbS.append(eReceiptBarcode);
        sbS.append(", footer=");
        sbS.append(str2);
        sbS.append(")");
        return sbS.toString();
    }
}
