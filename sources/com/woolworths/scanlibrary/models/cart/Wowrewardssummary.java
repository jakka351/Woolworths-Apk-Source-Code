package com.woolworths.scanlibrary.models.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0013\u0010\f¨\u0006 "}, d2 = {"Lcom/woolworths/scanlibrary/models/cart/Wowrewardssummary;", "", "wowrewardsearned", "", "iswowrewardscardgegistered", "", "iserroringettingwowrewardsbalance", "hasvalidwowrewardscard", "wowrewardstospend", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getWowrewardsearned", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getIswowrewardscardgegistered", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getIserroringettingwowrewardsbalance", "getHasvalidwowrewardscard", "getWowrewardstospend", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/woolworths/scanlibrary/models/cart/Wowrewardssummary;", "equals", "other", "hashCode", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Wowrewardssummary {
    public static final int $stable = 0;

    @SerializedName("hasvalidwowrewardscard")
    @Nullable
    private final Boolean hasvalidwowrewardscard;

    @SerializedName("iserroringettingwowrewardsbalance")
    @Nullable
    private final Boolean iserroringettingwowrewardsbalance;

    @SerializedName("iswowrewardscardgegistered")
    @Nullable
    private final Boolean iswowrewardscardgegistered;

    @SerializedName("wowrewardsearned")
    @Nullable
    private final Integer wowrewardsearned;

    @SerializedName("wowrewardstospend")
    @Nullable
    private final Integer wowrewardstospend;

    public Wowrewardssummary() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Wowrewardssummary copy$default(Wowrewardssummary wowrewardssummary, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = wowrewardssummary.wowrewardsearned;
        }
        if ((i & 2) != 0) {
            bool = wowrewardssummary.iswowrewardscardgegistered;
        }
        if ((i & 4) != 0) {
            bool2 = wowrewardssummary.iserroringettingwowrewardsbalance;
        }
        if ((i & 8) != 0) {
            bool3 = wowrewardssummary.hasvalidwowrewardscard;
        }
        if ((i & 16) != 0) {
            num2 = wowrewardssummary.wowrewardstospend;
        }
        Integer num3 = num2;
        Boolean bool4 = bool2;
        return wowrewardssummary.copy(num, bool, bool4, bool3, num3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getWowrewardsearned() {
        return this.wowrewardsearned;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIswowrewardscardgegistered() {
        return this.iswowrewardscardgegistered;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Boolean getIserroringettingwowrewardsbalance() {
        return this.iserroringettingwowrewardsbalance;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Boolean getHasvalidwowrewardscard() {
        return this.hasvalidwowrewardscard;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getWowrewardstospend() {
        return this.wowrewardstospend;
    }

    @NotNull
    public final Wowrewardssummary copy(@Nullable Integer wowrewardsearned, @Nullable Boolean iswowrewardscardgegistered, @Nullable Boolean iserroringettingwowrewardsbalance, @Nullable Boolean hasvalidwowrewardscard, @Nullable Integer wowrewardstospend) {
        return new Wowrewardssummary(wowrewardsearned, iswowrewardscardgegistered, iserroringettingwowrewardsbalance, hasvalidwowrewardscard, wowrewardstospend);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Wowrewardssummary)) {
            return false;
        }
        Wowrewardssummary wowrewardssummary = (Wowrewardssummary) other;
        return Intrinsics.c(this.wowrewardsearned, wowrewardssummary.wowrewardsearned) && Intrinsics.c(this.iswowrewardscardgegistered, wowrewardssummary.iswowrewardscardgegistered) && Intrinsics.c(this.iserroringettingwowrewardsbalance, wowrewardssummary.iserroringettingwowrewardsbalance) && Intrinsics.c(this.hasvalidwowrewardscard, wowrewardssummary.hasvalidwowrewardscard) && Intrinsics.c(this.wowrewardstospend, wowrewardssummary.wowrewardstospend);
    }

    @Nullable
    public final Boolean getHasvalidwowrewardscard() {
        return this.hasvalidwowrewardscard;
    }

    @Nullable
    public final Boolean getIserroringettingwowrewardsbalance() {
        return this.iserroringettingwowrewardsbalance;
    }

    @Nullable
    public final Boolean getIswowrewardscardgegistered() {
        return this.iswowrewardscardgegistered;
    }

    @Nullable
    public final Integer getWowrewardsearned() {
        return this.wowrewardsearned;
    }

    @Nullable
    public final Integer getWowrewardstospend() {
        return this.wowrewardstospend;
    }

    public int hashCode() {
        Integer num = this.wowrewardsearned;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.iswowrewardscardgegistered;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.iserroringettingwowrewardsbalance;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.hasvalidwowrewardscard;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.wowrewardstospend;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.wowrewardsearned;
        Boolean bool = this.iswowrewardscardgegistered;
        Boolean bool2 = this.iserroringettingwowrewardsbalance;
        Boolean bool3 = this.hasvalidwowrewardscard;
        Integer num2 = this.wowrewardstospend;
        StringBuilder sb = new StringBuilder("Wowrewardssummary(wowrewardsearned=");
        sb.append(num);
        sb.append(", iswowrewardscardgegistered=");
        sb.append(bool);
        sb.append(", iserroringettingwowrewardsbalance=");
        sb.append(bool2);
        sb.append(", hasvalidwowrewardscard=");
        sb.append(bool3);
        sb.append(", wowrewardstospend=");
        return a.p(sb, num2, ")");
    }

    public Wowrewardssummary(@Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable Integer num2) {
        this.wowrewardsearned = num;
        this.iswowrewardscardgegistered = bool;
        this.iserroringettingwowrewardsbalance = bool2;
        this.hasvalidwowrewardscard = bool3;
        this.wowrewardstospend = num2;
    }

    public /* synthetic */ Wowrewardssummary(Integer num, Boolean bool, Boolean bool2, Boolean bool3, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : bool3, (i & 16) != 0 ? null : num2);
    }
}
