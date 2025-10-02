package com.woolworths.scanlibrary.models.receipt;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003JW\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/woolworths/scanlibrary/models/receipt/VoucherInfo;", "", "id", "", "voucherId", "status", "voucherMessage", "voucherType", "voucherDescription", "boldLines", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getVoucherId", "getStatus", "getVoucherMessage", "getVoucherType", "getVoucherDescription", "getBoldLines", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class VoucherInfo {
    public static final int $stable = 8;

    @SerializedName("bold_lines")
    @Nullable
    private final List<Integer> boldLines;

    @SerializedName("id")
    @NotNull
    private final String id;

    @SerializedName("status")
    @NotNull
    private final String status;

    @SerializedName("voucher_description")
    @NotNull
    private final String voucherDescription;

    @SerializedName("voucher_id")
    @NotNull
    private final String voucherId;

    @SerializedName("voucher_message")
    @NotNull
    private final String voucherMessage;

    @SerializedName("voucher_type")
    @NotNull
    private final String voucherType;

    public VoucherInfo(@NotNull String id, @NotNull String voucherId, @NotNull String status, @NotNull String voucherMessage, @NotNull String voucherType, @NotNull String voucherDescription, @Nullable List<Integer> list) {
        Intrinsics.h(id, "id");
        Intrinsics.h(voucherId, "voucherId");
        Intrinsics.h(status, "status");
        Intrinsics.h(voucherMessage, "voucherMessage");
        Intrinsics.h(voucherType, "voucherType");
        Intrinsics.h(voucherDescription, "voucherDescription");
        this.id = id;
        this.voucherId = voucherId;
        this.status = status;
        this.voucherMessage = voucherMessage;
        this.voucherType = voucherType;
        this.voucherDescription = voucherDescription;
        this.boldLines = list;
    }

    public static /* synthetic */ VoucherInfo copy$default(VoucherInfo voucherInfo, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = voucherInfo.id;
        }
        if ((i & 2) != 0) {
            str2 = voucherInfo.voucherId;
        }
        if ((i & 4) != 0) {
            str3 = voucherInfo.status;
        }
        if ((i & 8) != 0) {
            str4 = voucherInfo.voucherMessage;
        }
        if ((i & 16) != 0) {
            str5 = voucherInfo.voucherType;
        }
        if ((i & 32) != 0) {
            str6 = voucherInfo.voucherDescription;
        }
        if ((i & 64) != 0) {
            list = voucherInfo.boldLines;
        }
        String str7 = str6;
        List list2 = list;
        String str8 = str5;
        String str9 = str3;
        return voucherInfo.copy(str, str2, str9, str4, str8, str7, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVoucherId() {
        return this.voucherId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getVoucherMessage() {
        return this.voucherMessage;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getVoucherType() {
        return this.voucherType;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getVoucherDescription() {
        return this.voucherDescription;
    }

    @Nullable
    public final List<Integer> component7() {
        return this.boldLines;
    }

    @NotNull
    public final VoucherInfo copy(@NotNull String id, @NotNull String voucherId, @NotNull String status, @NotNull String voucherMessage, @NotNull String voucherType, @NotNull String voucherDescription, @Nullable List<Integer> boldLines) {
        Intrinsics.h(id, "id");
        Intrinsics.h(voucherId, "voucherId");
        Intrinsics.h(status, "status");
        Intrinsics.h(voucherMessage, "voucherMessage");
        Intrinsics.h(voucherType, "voucherType");
        Intrinsics.h(voucherDescription, "voucherDescription");
        return new VoucherInfo(id, voucherId, status, voucherMessage, voucherType, voucherDescription, boldLines);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VoucherInfo)) {
            return false;
        }
        VoucherInfo voucherInfo = (VoucherInfo) other;
        return Intrinsics.c(this.id, voucherInfo.id) && Intrinsics.c(this.voucherId, voucherInfo.voucherId) && Intrinsics.c(this.status, voucherInfo.status) && Intrinsics.c(this.voucherMessage, voucherInfo.voucherMessage) && Intrinsics.c(this.voucherType, voucherInfo.voucherType) && Intrinsics.c(this.voucherDescription, voucherInfo.voucherDescription) && Intrinsics.c(this.boldLines, voucherInfo.boldLines);
    }

    @Nullable
    public final List<Integer> getBoldLines() {
        return this.boldLines;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getStatus() {
        return this.status;
    }

    @NotNull
    public final String getVoucherDescription() {
        return this.voucherDescription;
    }

    @NotNull
    public final String getVoucherId() {
        return this.voucherId;
    }

    @NotNull
    public final String getVoucherMessage() {
        return this.voucherMessage;
    }

    @NotNull
    public final String getVoucherType() {
        return this.voucherType;
    }

    public int hashCode() {
        int iC = b.c(b.c(b.c(b.c(b.c(this.id.hashCode() * 31, 31, this.voucherId), 31, this.status), 31, this.voucherMessage), 31, this.voucherType), 31, this.voucherDescription);
        List<Integer> list = this.boldLines;
        return iC + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.voucherId;
        String str3 = this.status;
        String str4 = this.voucherMessage;
        String str5 = this.voucherType;
        String str6 = this.voucherDescription;
        List<Integer> list = this.boldLines;
        StringBuilder sbV = a.v("VoucherInfo(id=", str, ", voucherId=", str2, ", status=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", voucherMessage=", str4, ", voucherType=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", voucherDescription=", str6, ", boldLines=");
        return android.support.v4.media.session.a.t(sbV, list, ")");
    }
}
