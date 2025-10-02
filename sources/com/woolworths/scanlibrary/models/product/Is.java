package com.woolworths.scanlibrary.models.product;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bD\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010.JÎ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\u00032\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020HHÖ\u0001J\t\u0010I\u001a\u00020JHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010 R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0019R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u0019R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0019R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0019R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.¨\u0006K"}, d2 = {"Lcom/woolworths/scanlibrary/models/product/Is;", "", "ranged", "", "weightonline", "pmrestriction", "tobacco", "liquor", "weighed", "priceembedded", "weightrequired", "intervention", "simpleproduct", "unknownitem", "tun", "assistancerequired", "reducedtoclear", "taxeditem", "promotionalitem", "linkedpromo", "forcedquantity", "quantityUpdateAllowed", "<init>", "(ZZZZZZZZZZZZZZZZZZLjava/lang/Boolean;)V", "getRanged", "()Z", "getWeightonline", "getPmrestriction", "getTobacco", "getLiquor", "getWeighed", "setWeighed", "(Z)V", "getPriceembedded", "getWeightrequired", "getIntervention", "getSimpleproduct", "getUnknownitem", "getTun", "getAssistancerequired", "getReducedtoclear", "getTaxeditem", "getPromotionalitem", "getLinkedpromo", "getForcedquantity", "getQuantityUpdateAllowed", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(ZZZZZZZZZZZZZZZZZZLjava/lang/Boolean;)Lcom/woolworths/scanlibrary/models/product/Is;", "equals", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Is {
    public static final int $stable = 8;

    @SerializedName("assistancerequired")
    private final boolean assistancerequired;

    @SerializedName("forcedquantity")
    private final boolean forcedquantity;

    @SerializedName("intervention")
    private final boolean intervention;

    @SerializedName("linkedpromo")
    private final boolean linkedpromo;

    @SerializedName("liquor")
    private final boolean liquor;

    @SerializedName("pmrestriction")
    private final boolean pmrestriction;

    @SerializedName("priceembedded")
    private final boolean priceembedded;

    @SerializedName("promotionalitem")
    private final boolean promotionalitem;

    @SerializedName("quantityupdateallowed")
    @Nullable
    private final Boolean quantityUpdateAllowed;

    @SerializedName("ranged")
    private final boolean ranged;

    @SerializedName("reducedtoclear")
    private final boolean reducedtoclear;

    @SerializedName("simpleproduct")
    private final boolean simpleproduct;

    @SerializedName("taxeditem")
    private final boolean taxeditem;

    @SerializedName("tobacco")
    private final boolean tobacco;

    @SerializedName("tun")
    private final boolean tun;

    @SerializedName("unknownitem")
    private final boolean unknownitem;

    @SerializedName("weighed")
    private boolean weighed;

    @SerializedName("weightonline")
    private final boolean weightonline;

    @SerializedName("weightrequired")
    private final boolean weightrequired;

    public Is(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, @Nullable Boolean bool) {
        this.ranged = z;
        this.weightonline = z2;
        this.pmrestriction = z3;
        this.tobacco = z4;
        this.liquor = z5;
        this.weighed = z6;
        this.priceembedded = z7;
        this.weightrequired = z8;
        this.intervention = z9;
        this.simpleproduct = z10;
        this.unknownitem = z11;
        this.tun = z12;
        this.assistancerequired = z13;
        this.reducedtoclear = z14;
        this.taxeditem = z15;
        this.promotionalitem = z16;
        this.linkedpromo = z17;
        this.forcedquantity = z18;
        this.quantityUpdateAllowed = bool;
    }

    public static /* synthetic */ Is copy$default(Is is, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Boolean bool, int i, Object obj) {
        Boolean bool2;
        boolean z19;
        boolean z20 = (i & 1) != 0 ? is.ranged : z;
        boolean z21 = (i & 2) != 0 ? is.weightonline : z2;
        boolean z22 = (i & 4) != 0 ? is.pmrestriction : z3;
        boolean z23 = (i & 8) != 0 ? is.tobacco : z4;
        boolean z24 = (i & 16) != 0 ? is.liquor : z5;
        boolean z25 = (i & 32) != 0 ? is.weighed : z6;
        boolean z26 = (i & 64) != 0 ? is.priceembedded : z7;
        boolean z27 = (i & 128) != 0 ? is.weightrequired : z8;
        boolean z28 = (i & 256) != 0 ? is.intervention : z9;
        boolean z29 = (i & 512) != 0 ? is.simpleproduct : z10;
        boolean z30 = (i & 1024) != 0 ? is.unknownitem : z11;
        boolean z31 = (i & 2048) != 0 ? is.tun : z12;
        boolean z32 = (i & 4096) != 0 ? is.assistancerequired : z13;
        boolean z33 = (i & 8192) != 0 ? is.reducedtoclear : z14;
        boolean z34 = z20;
        boolean z35 = (i & 16384) != 0 ? is.taxeditem : z15;
        boolean z36 = (i & 32768) != 0 ? is.promotionalitem : z16;
        boolean z37 = (i & 65536) != 0 ? is.linkedpromo : z17;
        boolean z38 = (i & 131072) != 0 ? is.forcedquantity : z18;
        if ((i & 262144) != 0) {
            z19 = z38;
            bool2 = is.quantityUpdateAllowed;
        } else {
            bool2 = bool;
            z19 = z38;
        }
        return is.copy(z34, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z35, z36, z37, z19, bool2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRanged() {
        return this.ranged;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getSimpleproduct() {
        return this.simpleproduct;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getUnknownitem() {
        return this.unknownitem;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getTun() {
        return this.tun;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getAssistancerequired() {
        return this.assistancerequired;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getReducedtoclear() {
        return this.reducedtoclear;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getTaxeditem() {
        return this.taxeditem;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getPromotionalitem() {
        return this.promotionalitem;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getLinkedpromo() {
        return this.linkedpromo;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getForcedquantity() {
        return this.forcedquantity;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Boolean getQuantityUpdateAllowed() {
        return this.quantityUpdateAllowed;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getWeightonline() {
        return this.weightonline;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPmrestriction() {
        return this.pmrestriction;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getTobacco() {
        return this.tobacco;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getLiquor() {
        return this.liquor;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getWeighed() {
        return this.weighed;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getPriceembedded() {
        return this.priceembedded;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getWeightrequired() {
        return this.weightrequired;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIntervention() {
        return this.intervention;
    }

    @NotNull
    public final Is copy(boolean ranged, boolean weightonline, boolean pmrestriction, boolean tobacco, boolean liquor, boolean weighed, boolean priceembedded, boolean weightrequired, boolean intervention, boolean simpleproduct, boolean unknownitem, boolean tun, boolean assistancerequired, boolean reducedtoclear, boolean taxeditem, boolean promotionalitem, boolean linkedpromo, boolean forcedquantity, @Nullable Boolean quantityUpdateAllowed) {
        return new Is(ranged, weightonline, pmrestriction, tobacco, liquor, weighed, priceembedded, weightrequired, intervention, simpleproduct, unknownitem, tun, assistancerequired, reducedtoclear, taxeditem, promotionalitem, linkedpromo, forcedquantity, quantityUpdateAllowed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Is)) {
            return false;
        }
        Is is = (Is) other;
        return this.ranged == is.ranged && this.weightonline == is.weightonline && this.pmrestriction == is.pmrestriction && this.tobacco == is.tobacco && this.liquor == is.liquor && this.weighed == is.weighed && this.priceembedded == is.priceembedded && this.weightrequired == is.weightrequired && this.intervention == is.intervention && this.simpleproduct == is.simpleproduct && this.unknownitem == is.unknownitem && this.tun == is.tun && this.assistancerequired == is.assistancerequired && this.reducedtoclear == is.reducedtoclear && this.taxeditem == is.taxeditem && this.promotionalitem == is.promotionalitem && this.linkedpromo == is.linkedpromo && this.forcedquantity == is.forcedquantity && Intrinsics.c(this.quantityUpdateAllowed, is.quantityUpdateAllowed);
    }

    public final boolean getAssistancerequired() {
        return this.assistancerequired;
    }

    public final boolean getForcedquantity() {
        return this.forcedquantity;
    }

    public final boolean getIntervention() {
        return this.intervention;
    }

    public final boolean getLinkedpromo() {
        return this.linkedpromo;
    }

    public final boolean getLiquor() {
        return this.liquor;
    }

    public final boolean getPmrestriction() {
        return this.pmrestriction;
    }

    public final boolean getPriceembedded() {
        return this.priceembedded;
    }

    public final boolean getPromotionalitem() {
        return this.promotionalitem;
    }

    @Nullable
    public final Boolean getQuantityUpdateAllowed() {
        return this.quantityUpdateAllowed;
    }

    public final boolean getRanged() {
        return this.ranged;
    }

    public final boolean getReducedtoclear() {
        return this.reducedtoclear;
    }

    public final boolean getSimpleproduct() {
        return this.simpleproduct;
    }

    public final boolean getTaxeditem() {
        return this.taxeditem;
    }

    public final boolean getTobacco() {
        return this.tobacco;
    }

    public final boolean getTun() {
        return this.tun;
    }

    public final boolean getUnknownitem() {
        return this.unknownitem;
    }

    public final boolean getWeighed() {
        return this.weighed;
    }

    public final boolean getWeightonline() {
        return this.weightonline;
    }

    public final boolean getWeightrequired() {
        return this.weightrequired;
    }

    public int hashCode() {
        int iE = b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(Boolean.hashCode(this.ranged) * 31, 31, this.weightonline), 31, this.pmrestriction), 31, this.tobacco), 31, this.liquor), 31, this.weighed), 31, this.priceembedded), 31, this.weightrequired), 31, this.intervention), 31, this.simpleproduct), 31, this.unknownitem), 31, this.tun), 31, this.assistancerequired), 31, this.reducedtoclear), 31, this.taxeditem), 31, this.promotionalitem), 31, this.linkedpromo), 31, this.forcedquantity);
        Boolean bool = this.quantityUpdateAllowed;
        return iE + (bool == null ? 0 : bool.hashCode());
    }

    public final void setWeighed(boolean z) {
        this.weighed = z;
    }

    @NotNull
    public String toString() {
        boolean z = this.ranged;
        boolean z2 = this.weightonline;
        boolean z3 = this.pmrestriction;
        boolean z4 = this.tobacco;
        boolean z5 = this.liquor;
        boolean z6 = this.weighed;
        boolean z7 = this.priceembedded;
        boolean z8 = this.weightrequired;
        boolean z9 = this.intervention;
        boolean z10 = this.simpleproduct;
        boolean z11 = this.unknownitem;
        boolean z12 = this.tun;
        boolean z13 = this.assistancerequired;
        boolean z14 = this.reducedtoclear;
        boolean z15 = this.taxeditem;
        boolean z16 = this.promotionalitem;
        boolean z17 = this.linkedpromo;
        boolean z18 = this.forcedquantity;
        Boolean bool = this.quantityUpdateAllowed;
        StringBuilder sbV = b.v("Is(ranged=", ", weightonline=", ", pmrestriction=", z, z2);
        a.D(sbV, z3, ", tobacco=", z4, ", liquor=");
        a.D(sbV, z5, ", weighed=", z6, ", priceembedded=");
        a.D(sbV, z7, ", weightrequired=", z8, ", intervention=");
        a.D(sbV, z9, ", simpleproduct=", z10, ", unknownitem=");
        a.D(sbV, z11, ", tun=", z12, ", assistancerequired=");
        a.D(sbV, z13, ", reducedtoclear=", z14, ", taxeditem=");
        a.D(sbV, z15, ", promotionalitem=", z16, ", linkedpromo=");
        a.D(sbV, z17, ", forcedquantity=", z18, ", quantityUpdateAllowed=");
        return a.o(sbV, bool, ")");
    }

    public /* synthetic */ Is(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, (i & 262144) != 0 ? null : bool);
    }
}
