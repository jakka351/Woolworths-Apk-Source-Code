package com.woolworths.scanlibrary.models.product;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0013JF\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\tHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Instoreprice;", "", "cupuom", "", "cupprice", "", "uom", "pricegst", "cupsize", "", "<init>", "(Ljava/lang/String;DLjava/lang/String;DLjava/lang/Integer;)V", "getCupuom", "()Ljava/lang/String;", "getCupprice", "()D", "getUom", "getPricegst", "getCupsize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;DLjava/lang/String;DLjava/lang/Integer;)Lcom/woolworths/scanlibrary/models/product/Instoreprice;", "equals", "", "other", "hashCode", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Instoreprice {
    public static final int $stable = 0;

    @SerializedName("cupprice")
    private final double cupprice;

    @SerializedName("cupsize")
    @Nullable
    private final Integer cupsize;

    @SerializedName("cupuom")
    @Nullable
    private final String cupuom;

    @SerializedName("pricegst")
    private final double pricegst;

    @SerializedName("uom")
    @Nullable
    private final String uom;

    public Instoreprice(@Nullable String str, double d, @Nullable String str2, double d2, @Nullable Integer num) {
        this.cupuom = str;
        this.cupprice = d;
        this.uom = str2;
        this.pricegst = d2;
        this.cupsize = num;
    }

    public static /* synthetic */ Instoreprice copy$default(Instoreprice instoreprice, String str, double d, String str2, double d2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = instoreprice.cupuom;
        }
        if ((i & 2) != 0) {
            d = instoreprice.cupprice;
        }
        if ((i & 4) != 0) {
            str2 = instoreprice.uom;
        }
        if ((i & 8) != 0) {
            d2 = instoreprice.pricegst;
        }
        if ((i & 16) != 0) {
            num = instoreprice.cupsize;
        }
        String str3 = str2;
        return instoreprice.copy(str, d, str3, d2, num);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCupuom() {
        return this.cupuom;
    }

    /* renamed from: component2, reason: from getter */
    public final double getCupprice() {
        return this.cupprice;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUom() {
        return this.uom;
    }

    /* renamed from: component4, reason: from getter */
    public final double getPricegst() {
        return this.pricegst;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getCupsize() {
        return this.cupsize;
    }

    @NotNull
    public final Instoreprice copy(@Nullable String cupuom, double cupprice, @Nullable String uom, double pricegst, @Nullable Integer cupsize) {
        return new Instoreprice(cupuom, cupprice, uom, pricegst, cupsize);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Instoreprice)) {
            return false;
        }
        Instoreprice instoreprice = (Instoreprice) other;
        return Intrinsics.c(this.cupuom, instoreprice.cupuom) && Double.compare(this.cupprice, instoreprice.cupprice) == 0 && Intrinsics.c(this.uom, instoreprice.uom) && Double.compare(this.pricegst, instoreprice.pricegst) == 0 && Intrinsics.c(this.cupsize, instoreprice.cupsize);
    }

    public final double getCupprice() {
        return this.cupprice;
    }

    @Nullable
    public final Integer getCupsize() {
        return this.cupsize;
    }

    @Nullable
    public final String getCupuom() {
        return this.cupuom;
    }

    public final double getPricegst() {
        return this.pricegst;
    }

    @Nullable
    public final String getUom() {
        return this.uom;
    }

    public int hashCode() {
        String str = this.cupuom;
        int iA = a.a(this.cupprice, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.uom;
        int iA2 = a.a(this.pricegst, (iA + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Integer num = this.cupsize;
        return iA2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.cupuom;
        double d = this.cupprice;
        String str2 = this.uom;
        double d2 = this.pricegst;
        Integer num = this.cupsize;
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(d, "Instoreprice(cupuom=", str, ", cupprice=");
        androidx.compose.ui.input.pointer.a.w(sbR, ", uom=", str2, ", pricegst=");
        sbR.append(d2);
        sbR.append(", cupsize=");
        sbR.append(num);
        sbR.append(")");
        return sbR.toString();
    }

    public /* synthetic */ Instoreprice(String str, double d, String str2, double d2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, d, (i & 4) != 0 ? null : str2, d2, (i & 16) != 0 ? null : num);
    }
}
