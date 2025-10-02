package com.woolworths.scanlibrary.models.store;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/woolworths/scanlibrary/models/store/StoreTradingWeek;", "", "tradingHours", "", "Lcom/woolworths/scanlibrary/models/store/StoreTradingDateTime;", "<init>", "(Ljava/util/List;)V", "getTradingHours", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StoreTradingWeek {
    public static final int $stable = 8;

    @SerializedName("tradingHours")
    @NotNull
    private final List<StoreTradingDateTime> tradingHours;

    public StoreTradingWeek() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoreTradingWeek copy$default(StoreTradingWeek storeTradingWeek, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = storeTradingWeek.tradingHours;
        }
        return storeTradingWeek.copy(list);
    }

    @NotNull
    public final List<StoreTradingDateTime> component1() {
        return this.tradingHours;
    }

    @NotNull
    public final StoreTradingWeek copy(@NotNull List<StoreTradingDateTime> tradingHours) {
        Intrinsics.h(tradingHours, "tradingHours");
        return new StoreTradingWeek(tradingHours);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StoreTradingWeek) && Intrinsics.c(this.tradingHours, ((StoreTradingWeek) other).tradingHours);
    }

    @NotNull
    public final List<StoreTradingDateTime> getTradingHours() {
        return this.tradingHours;
    }

    public int hashCode() {
        return this.tradingHours.hashCode();
    }

    @NotNull
    public String toString() {
        return a.l("StoreTradingWeek(tradingHours=", ")", this.tradingHours);
    }

    public StoreTradingWeek(@NotNull List<StoreTradingDateTime> tradingHours) {
        Intrinsics.h(tradingHours, "tradingHours");
        this.tradingHours = tradingHours;
    }

    public /* synthetic */ StoreTradingWeek(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EmptyList.d : list);
    }
}
