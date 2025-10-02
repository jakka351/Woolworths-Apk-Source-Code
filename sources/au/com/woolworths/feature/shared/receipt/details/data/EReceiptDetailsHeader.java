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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsHeader;", "Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDetailsElement;", "", "iconUrl", "title", "content", "division", "storeNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "e", "a", "b", "d", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDetailsHeader extends EReceiptDetailsElement {

    @SerializedName("content")
    @NotNull
    private final String content;

    @SerializedName("division")
    @Nullable
    private final String division;

    @SerializedName("iconUrl")
    @Nullable
    private final String iconUrl;

    @SerializedName("storeNo")
    @Nullable
    private final String storeNo;

    @SerializedName("title")
    @NotNull
    private final String title;

    public EReceiptDetailsHeader(@Nullable String str, @NotNull String title, @NotNull String content, @Nullable String str2, @Nullable String str3) {
        Intrinsics.h(title, "title");
        Intrinsics.h(content, "content");
        this.iconUrl = str;
        this.title = title;
        this.content = content;
        this.division = str2;
        this.storeNo = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final String getDivision() {
        return this.division;
    }

    /* renamed from: c, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* renamed from: d, reason: from getter */
    public final String getStoreNo() {
        return this.storeNo;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDetailsHeader)) {
            return false;
        }
        EReceiptDetailsHeader eReceiptDetailsHeader = (EReceiptDetailsHeader) obj;
        return Intrinsics.c(this.iconUrl, eReceiptDetailsHeader.iconUrl) && Intrinsics.c(this.title, eReceiptDetailsHeader.title) && Intrinsics.c(this.content, eReceiptDetailsHeader.content) && Intrinsics.c(this.division, eReceiptDetailsHeader.division) && Intrinsics.c(this.storeNo, eReceiptDetailsHeader.storeNo);
    }

    public final int hashCode() {
        String str = this.iconUrl;
        int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.content);
        String str2 = this.division;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.storeNo;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        String str3 = this.content;
        String str4 = this.division;
        String str5 = this.storeNo;
        StringBuilder sbV = a.v("EReceiptDetailsHeader(iconUrl=", str, ", title=", str2, ", content=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", division=", str4, ", storeNo=");
        return a.o(sbV, str5, ")");
    }
}
