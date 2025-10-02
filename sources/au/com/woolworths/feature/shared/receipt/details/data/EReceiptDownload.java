package au.com.woolworths.feature.shared.receipt.details.data;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/feature/shared/receipt/details/data/EReceiptDownload;", "", "", "url", "filename", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "receipt-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EReceiptDownload {

    @SerializedName("filename")
    @NotNull
    private final String filename;

    @SerializedName("url")
    @NotNull
    private final String url;

    public EReceiptDownload(@NotNull String url, @NotNull String filename) {
        Intrinsics.h(url, "url");
        Intrinsics.h(filename, "filename");
        this.url = url;
        this.filename = filename;
    }

    /* renamed from: a, reason: from getter */
    public final String getFilename() {
        return this.filename;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EReceiptDownload)) {
            return false;
        }
        EReceiptDownload eReceiptDownload = (EReceiptDownload) obj;
        return Intrinsics.c(this.url, eReceiptDownload.url) && Intrinsics.c(this.filename, eReceiptDownload.filename);
    }

    public final int hashCode() {
        return this.filename.hashCode() + (this.url.hashCode() * 31);
    }

    public final String toString() {
        return a.j("EReceiptDownload(url=", this.url, ", filename=", this.filename, ")");
    }
}
