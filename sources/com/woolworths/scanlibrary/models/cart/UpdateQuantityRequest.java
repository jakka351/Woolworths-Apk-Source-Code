package com.woolworths.scanlibrary.models.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/UpdateQuantityRequest;", "", "quantity", "", "weights", "", "<init>", "(ILjava/lang/Float;)V", "getQuantity", "()I", "getWeights", "()Ljava/lang/Float;", "Ljava/lang/Float;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateQuantityRequest {
    public static final int $stable = 0;

    @SerializedName("quantity")
    private final int quantity;

    @SerializedName("weights")
    @Nullable
    private final Float weights;

    public UpdateQuantityRequest() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public final int getQuantity() {
        return this.quantity;
    }

    @Nullable
    public final Float getWeights() {
        return this.weights;
    }

    public UpdateQuantityRequest(int i, @Nullable Float f) {
        this.quantity = i;
        this.weights = f;
    }

    public /* synthetic */ UpdateQuantityRequest(int i, Float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i, (i2 & 2) != 0 ? null : f);
    }
}
