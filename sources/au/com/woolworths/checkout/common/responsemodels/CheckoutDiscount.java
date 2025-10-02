package au.com.woolworths.checkout.common.responsemodels;

import android.support.v4.media.session.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/checkout/common/responsemodels/CheckoutDiscount;", "", "source", "", "amount", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Ljava/lang/String;FLjava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getAmount", "()F", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CheckoutDiscount {

    @SerializedName("Amount")
    private final float amount;

    @SerializedName("Name")
    @NotNull
    private final String name;

    @SerializedName("Source")
    @NotNull
    private final String source;

    public CheckoutDiscount(@NotNull String source, float f, @NotNull String name) {
        Intrinsics.h(source, "source");
        Intrinsics.h(name, "name");
        this.source = source;
        this.amount = f;
        this.name = name;
    }

    public static /* synthetic */ CheckoutDiscount copy$default(CheckoutDiscount checkoutDiscount, String str, float f, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutDiscount.source;
        }
        if ((i & 2) != 0) {
            f = checkoutDiscount.amount;
        }
        if ((i & 4) != 0) {
            str2 = checkoutDiscount.name;
        }
        return checkoutDiscount.copy(str, f, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component2, reason: from getter */
    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final CheckoutDiscount copy(@NotNull String source, float amount, @NotNull String name) {
        Intrinsics.h(source, "source");
        Intrinsics.h(name, "name");
        return new CheckoutDiscount(source, amount, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckoutDiscount)) {
            return false;
        }
        CheckoutDiscount checkoutDiscount = (CheckoutDiscount) other;
        return Intrinsics.c(this.source, checkoutDiscount.source) && Float.compare(this.amount, checkoutDiscount.amount) == 0 && Intrinsics.c(this.name, checkoutDiscount.name);
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        return this.name.hashCode() + a.b(this.amount, this.source.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.source;
        float f = this.amount;
        String str2 = this.name;
        StringBuilder sb = new StringBuilder("CheckoutDiscount(source=");
        sb.append(str);
        sb.append(", amount=");
        sb.append(f);
        sb.append(", name=");
        return YU.a.o(sb, str2, ")");
    }
}
