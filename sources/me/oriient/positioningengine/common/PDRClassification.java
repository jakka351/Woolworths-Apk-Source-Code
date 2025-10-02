package me.oriient.positioningengine.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001c"}, d2 = {"Lme/oriient/positioningengine/common/PDRClassification;", "", "inHand", "", "withCart", "onCart", "accuracyX", "accuracyY", "(DDDDD)V", "getAccuracyX", "()D", "getAccuracyY", "getInHand", "getOnCart", "getWithCart", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "service-positioning-engine_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PDRClassification {
    private final double accuracyX;
    private final double accuracyY;
    private final double inHand;
    private final double onCart;
    private final double withCart;

    public PDRClassification() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 31, null);
    }

    public static /* synthetic */ PDRClassification copy$default(PDRClassification pDRClassification, double d, double d2, double d3, double d4, double d5, int i, Object obj) {
        if ((i & 1) != 0) {
            d = pDRClassification.inHand;
        }
        double d6 = d;
        if ((i & 2) != 0) {
            d2 = pDRClassification.withCart;
        }
        return pDRClassification.copy(d6, d2, (i & 4) != 0 ? pDRClassification.onCart : d3, (i & 8) != 0 ? pDRClassification.accuracyX : d4, (i & 16) != 0 ? pDRClassification.accuracyY : d5);
    }

    /* renamed from: component1, reason: from getter */
    public final double getInHand() {
        return this.inHand;
    }

    /* renamed from: component2, reason: from getter */
    public final double getWithCart() {
        return this.withCart;
    }

    /* renamed from: component3, reason: from getter */
    public final double getOnCart() {
        return this.onCart;
    }

    /* renamed from: component4, reason: from getter */
    public final double getAccuracyX() {
        return this.accuracyX;
    }

    /* renamed from: component5, reason: from getter */
    public final double getAccuracyY() {
        return this.accuracyY;
    }

    @NotNull
    public final PDRClassification copy(double inHand, double withCart, double onCart, double accuracyX, double accuracyY) {
        return new PDRClassification(inHand, withCart, onCart, accuracyX, accuracyY);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PDRClassification)) {
            return false;
        }
        PDRClassification pDRClassification = (PDRClassification) other;
        return Double.compare(this.inHand, pDRClassification.inHand) == 0 && Double.compare(this.withCart, pDRClassification.withCart) == 0 && Double.compare(this.onCart, pDRClassification.onCart) == 0 && Double.compare(this.accuracyX, pDRClassification.accuracyX) == 0 && Double.compare(this.accuracyY, pDRClassification.accuracyY) == 0;
    }

    public final double getAccuracyX() {
        return this.accuracyX;
    }

    public final double getAccuracyY() {
        return this.accuracyY;
    }

    public final double getInHand() {
        return this.inHand;
    }

    public final double getOnCart() {
        return this.onCart;
    }

    public final double getWithCart() {
        return this.withCart;
    }

    public int hashCode() {
        return Double.hashCode(this.accuracyY) + v.a(this.accuracyX, v.a(this.onCart, v.a(this.withCart, Double.hashCode(this.inHand) * 31, 31), 31), 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PDRClassification(inHand=");
        sb.append(this.inHand);
        sb.append(", withCart=");
        sb.append(this.withCart);
        sb.append(", onCart=");
        sb.append(this.onCart);
        sb.append(", accuracyX=");
        sb.append(this.accuracyX);
        sb.append(", accuracyY=");
        return a.a(sb, this.accuracyY, ')');
    }

    public PDRClassification(double d, double d2, double d3, double d4, double d5) {
        this.inHand = d;
        this.withCart = d2;
        this.onCart = d3;
        this.accuracyX = d4;
        this.accuracyY = d5;
    }

    public /* synthetic */ PDRClassification(double d, double d2, double d3, double d4, double d5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? 0.0d : d3, (i & 8) != 0 ? 0.0d : d4, (i & 16) != 0 ? 0.0d : d5);
    }
}
