package au.com.woolworths.checkout.models;

import YU.a;
import androidx.camera.core.impl.b;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/checkout/models/PackagingFee;", "Ljava/io/Serializable;", "amount", "", AnnotatedPrivateKey.LABEL, "", "customerMessage", "<init>", "(FLjava/lang/String;Ljava/lang/String;)V", "getAmount", "()F", "getLabel", "()Ljava/lang/String;", "getCustomerMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "shop-checkout-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PackagingFee implements Serializable {
    private static final long serialVersionUID = 1;

    @SerializedName("amount")
    private final float amount;

    @SerializedName("customerMessage")
    @NotNull
    private final String customerMessage;

    @SerializedName(AnnotatedPrivateKey.LABEL)
    @NotNull
    private final String label;

    public PackagingFee(float f, @NotNull String label, @NotNull String customerMessage) {
        Intrinsics.h(label, "label");
        Intrinsics.h(customerMessage, "customerMessage");
        this.amount = f;
        this.label = label;
        this.customerMessage = customerMessage;
    }

    public static /* synthetic */ PackagingFee copy$default(PackagingFee packagingFee, float f, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = packagingFee.amount;
        }
        if ((i & 2) != 0) {
            str = packagingFee.label;
        }
        if ((i & 4) != 0) {
            str2 = packagingFee.customerMessage;
        }
        return packagingFee.copy(f, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCustomerMessage() {
        return this.customerMessage;
    }

    @NotNull
    public final PackagingFee copy(float amount, @NotNull String label, @NotNull String customerMessage) {
        Intrinsics.h(label, "label");
        Intrinsics.h(customerMessage, "customerMessage");
        return new PackagingFee(amount, label, customerMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PackagingFee)) {
            return false;
        }
        PackagingFee packagingFee = (PackagingFee) other;
        return Float.compare(this.amount, packagingFee.amount) == 0 && Intrinsics.c(this.label, packagingFee.label) && Intrinsics.c(this.customerMessage, packagingFee.customerMessage);
    }

    public final float getAmount() {
        return this.amount;
    }

    @NotNull
    public final String getCustomerMessage() {
        return this.customerMessage;
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return this.customerMessage.hashCode() + b.c(Float.hashCode(this.amount) * 31, 31, this.label);
    }

    @NotNull
    public String toString() {
        float f = this.amount;
        String str = this.label;
        String str2 = this.customerMessage;
        StringBuilder sb = new StringBuilder("PackagingFee(amount=");
        sb.append(f);
        sb.append(", label=");
        sb.append(str);
        sb.append(", customerMessage=");
        return a.o(sb, str2, ")");
    }
}
