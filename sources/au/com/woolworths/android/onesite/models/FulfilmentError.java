package au.com.woolworths.android.onesite.models;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/android/onesite/models/FulfilmentError;", "", "message", "", "statusCode", "", "<init>", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getStatusCode", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FulfilmentError {
    public static final int $stable = 0;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("statusCode")
    private final int statusCode;

    public FulfilmentError(@NotNull String message, int i) {
        Intrinsics.h(message, "message");
        this.message = message;
        this.statusCode = i;
    }

    public static /* synthetic */ FulfilmentError copy$default(FulfilmentError fulfilmentError, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fulfilmentError.message;
        }
        if ((i2 & 2) != 0) {
            i = fulfilmentError.statusCode;
        }
        return fulfilmentError.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @NotNull
    public final FulfilmentError copy(@NotNull String message, int statusCode) {
        Intrinsics.h(message, "message");
        return new FulfilmentError(message, statusCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FulfilmentError)) {
            return false;
        }
        FulfilmentError fulfilmentError = (FulfilmentError) other;
        return Intrinsics.c(this.message, fulfilmentError.message) && this.statusCode == fulfilmentError.statusCode;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        return Integer.hashCode(this.statusCode) + (this.message.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a.p("FulfilmentError(message=", this.statusCode, this.message, ", statusCode=", ")");
    }
}
