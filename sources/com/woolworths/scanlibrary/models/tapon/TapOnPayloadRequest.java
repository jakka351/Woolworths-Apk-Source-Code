package com.woolworths.scanlibrary.models.tapon;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/TapOnPayloadRequest;", "", "tapOnId", "", "<init>", "(Ljava/lang/String;)V", "getTapOnId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TapOnPayloadRequest {
    public static final int $stable = 0;

    @SerializedName("taponid")
    @NotNull
    private final String tapOnId;

    public TapOnPayloadRequest(@NotNull String tapOnId) {
        Intrinsics.h(tapOnId, "tapOnId");
        this.tapOnId = tapOnId;
    }

    public static /* synthetic */ TapOnPayloadRequest copy$default(TapOnPayloadRequest tapOnPayloadRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapOnPayloadRequest.tapOnId;
        }
        return tapOnPayloadRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTapOnId() {
        return this.tapOnId;
    }

    @NotNull
    public final TapOnPayloadRequest copy(@NotNull String tapOnId) {
        Intrinsics.h(tapOnId, "tapOnId");
        return new TapOnPayloadRequest(tapOnId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TapOnPayloadRequest) && Intrinsics.c(this.tapOnId, ((TapOnPayloadRequest) other).tapOnId);
    }

    @NotNull
    public final String getTapOnId() {
        return this.tapOnId;
    }

    public int hashCode() {
        return this.tapOnId.hashCode();
    }

    @NotNull
    public String toString() {
        return a.h("TapOnPayloadRequest(tapOnId=", this.tapOnId, ")");
    }
}
