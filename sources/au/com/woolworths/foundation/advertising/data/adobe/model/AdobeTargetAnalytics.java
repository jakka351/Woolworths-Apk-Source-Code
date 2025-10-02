package au.com.woolworths.foundation.advertising.data.adobe.model;

import YU.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/foundation/advertising/data/adobe/model/AdobeTargetAnalytics;", "", "", "pe", "tnta", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "b", "advertising-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdobeTargetAnalytics {

    @SerializedName("pe")
    @Nullable
    private final String pe;

    @SerializedName("tnta")
    @Nullable
    private final String tnta;

    public AdobeTargetAnalytics(@Nullable String str, @Nullable String str2) {
        this.pe = str;
        this.tnta = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getPe() {
        return this.pe;
    }

    /* renamed from: b, reason: from getter */
    public final String getTnta() {
        return this.tnta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdobeTargetAnalytics)) {
            return false;
        }
        AdobeTargetAnalytics adobeTargetAnalytics = (AdobeTargetAnalytics) obj;
        return Intrinsics.c(this.pe, adobeTargetAnalytics.pe) && Intrinsics.c(this.tnta, adobeTargetAnalytics.tnta);
    }

    public final int hashCode() {
        String str = this.pe;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tnta;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return a.j("AdobeTargetAnalytics(pe=", this.pe, ", tnta=", this.tnta, ")");
    }
}
