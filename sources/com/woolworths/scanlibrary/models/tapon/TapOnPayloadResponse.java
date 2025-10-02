package com.woolworths.scanlibrary.models.tapon;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/woolworths/scanlibrary/models/tapon/TapOnPayloadResponse;", "", "encodedPayload", "", "serviceKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEncodedPayload", "()Ljava/lang/String;", "getServiceKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TapOnPayloadResponse {
    public static final int $stable = 0;

    @SerializedName("payload")
    @NotNull
    private final String encodedPayload;

    @SerializedName("serviceKey")
    @NotNull
    private final String serviceKey;

    public TapOnPayloadResponse(@NotNull String encodedPayload, @NotNull String serviceKey) {
        Intrinsics.h(encodedPayload, "encodedPayload");
        Intrinsics.h(serviceKey, "serviceKey");
        this.encodedPayload = encodedPayload;
        this.serviceKey = serviceKey;
    }

    public static /* synthetic */ TapOnPayloadResponse copy$default(TapOnPayloadResponse tapOnPayloadResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tapOnPayloadResponse.encodedPayload;
        }
        if ((i & 2) != 0) {
            str2 = tapOnPayloadResponse.serviceKey;
        }
        return tapOnPayloadResponse.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEncodedPayload() {
        return this.encodedPayload;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getServiceKey() {
        return this.serviceKey;
    }

    @NotNull
    public final TapOnPayloadResponse copy(@NotNull String encodedPayload, @NotNull String serviceKey) {
        Intrinsics.h(encodedPayload, "encodedPayload");
        Intrinsics.h(serviceKey, "serviceKey");
        return new TapOnPayloadResponse(encodedPayload, serviceKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TapOnPayloadResponse)) {
            return false;
        }
        TapOnPayloadResponse tapOnPayloadResponse = (TapOnPayloadResponse) other;
        return Intrinsics.c(this.encodedPayload, tapOnPayloadResponse.encodedPayload) && Intrinsics.c(this.serviceKey, tapOnPayloadResponse.serviceKey);
    }

    @NotNull
    public final String getEncodedPayload() {
        return this.encodedPayload;
    }

    @NotNull
    public final String getServiceKey() {
        return this.serviceKey;
    }

    public int hashCode() {
        return this.serviceKey.hashCode() + (this.encodedPayload.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.j("TapOnPayloadResponse(encodedPayload=", this.encodedPayload, ", serviceKey=", this.serviceKey, ")");
    }
}
