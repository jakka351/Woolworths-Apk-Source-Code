package com.woolworths.scanlibrary.models.discount;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.common.api.internal.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/woolworths/scanlibrary/models/discount/Discount;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "amount", "Ljava/math/BigDecimal;", "order", "", "<init>", "(Ljava/lang/String;Ljava/math/BigDecimal;I)V", "getName", "()Ljava/lang/String;", "getAmount", "()Ljava/math/BigDecimal;", "getOrder", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Discount {
    public static final int $stable = 8;

    @SerializedName("amount")
    @NotNull
    private final BigDecimal amount;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("order")
    private final int order;

    public Discount(@NotNull String name, @NotNull BigDecimal amount, int i) {
        Intrinsics.h(name, "name");
        Intrinsics.h(amount, "amount");
        this.name = name;
        this.amount = amount;
        this.order = i;
    }

    public static /* synthetic */ Discount copy$default(Discount discount, String str, BigDecimal bigDecimal, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = discount.name;
        }
        if ((i2 & 2) != 0) {
            bigDecimal = discount.amount;
        }
        if ((i2 & 4) != 0) {
            i = discount.order;
        }
        return discount.copy(str, bigDecimal, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BigDecimal getAmount() {
        return this.amount;
    }

    /* renamed from: component3, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    @NotNull
    public final Discount copy(@NotNull String name, @NotNull BigDecimal amount, int order) {
        Intrinsics.h(name, "name");
        Intrinsics.h(amount, "amount");
        return new Discount(name, amount, order);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) other;
        return Intrinsics.c(this.name, discount.name) && Intrinsics.c(this.amount, discount.amount) && this.order == discount.order;
    }

    @NotNull
    public final BigDecimal getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getOrder() {
        return this.order;
    }

    public int hashCode() {
        return Integer.hashCode(this.order) + a.c(this.amount, this.name.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        BigDecimal bigDecimal = this.amount;
        int i = this.order;
        StringBuilder sb = new StringBuilder("Discount(name=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(bigDecimal);
        sb.append(", order=");
        return YU.a.m(sb, i, ")");
    }
}
