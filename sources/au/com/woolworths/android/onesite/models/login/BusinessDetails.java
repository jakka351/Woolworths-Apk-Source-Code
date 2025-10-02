package au.com.woolworths.android.onesite.models.login;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/android/onesite/models/login/BusinessDetails;", "", "abn", "", "companyName", "businessType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAbn", "()Ljava/lang/String;", "getCompanyName", "getBusinessType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BusinessDetails {

    @SerializedName("abn")
    @NotNull
    private final String abn;

    @SerializedName("businesstype")
    @NotNull
    private final String businessType;

    @SerializedName("companyname")
    @NotNull
    private final String companyName;

    public BusinessDetails(@NotNull String abn, @NotNull String companyName, @NotNull String businessType) {
        Intrinsics.h(abn, "abn");
        Intrinsics.h(companyName, "companyName");
        Intrinsics.h(businessType, "businessType");
        this.abn = abn;
        this.companyName = companyName;
        this.businessType = businessType;
    }

    public static /* synthetic */ BusinessDetails copy$default(BusinessDetails businessDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = businessDetails.abn;
        }
        if ((i & 2) != 0) {
            str2 = businessDetails.companyName;
        }
        if ((i & 4) != 0) {
            str3 = businessDetails.businessType;
        }
        return businessDetails.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getAbn() {
        return this.abn;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getBusinessType() {
        return this.businessType;
    }

    @NotNull
    public final BusinessDetails copy(@NotNull String abn, @NotNull String companyName, @NotNull String businessType) {
        Intrinsics.h(abn, "abn");
        Intrinsics.h(companyName, "companyName");
        Intrinsics.h(businessType, "businessType");
        return new BusinessDetails(abn, companyName, businessType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BusinessDetails)) {
            return false;
        }
        BusinessDetails businessDetails = (BusinessDetails) other;
        return Intrinsics.c(this.abn, businessDetails.abn) && Intrinsics.c(this.companyName, businessDetails.companyName) && Intrinsics.c(this.businessType, businessDetails.businessType);
    }

    @NotNull
    public final String getAbn() {
        return this.abn;
    }

    @NotNull
    public final String getBusinessType() {
        return this.businessType;
    }

    @NotNull
    public final String getCompanyName() {
        return this.companyName;
    }

    public int hashCode() {
        return this.businessType.hashCode() + b.c(this.abn.hashCode() * 31, 31, this.companyName);
    }

    @NotNull
    public String toString() {
        String str = this.abn;
        String str2 = this.companyName;
        return a.o(a.v("BusinessDetails(abn=", str, ", companyName=", str2, ", businessType="), this.businessType, ")");
    }
}
