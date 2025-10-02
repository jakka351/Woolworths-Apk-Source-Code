package com.woolworths.scanlibrary.models.store;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/woolworths/scanlibrary/models/store/StoreTradingDateTime;", "", "date", "Ljava/util/Date;", "openTime", "", "closeTime", "<init>", "(Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/util/Date;", "getOpenTime", "()Ljava/lang/String;", "getCloseTime", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class StoreTradingDateTime {
    public static final int $stable = 8;

    @SerializedName("closeTime")
    @NotNull
    private final String closeTime;

    @SerializedName("date")
    @NotNull
    private final Date date;

    @SerializedName("openTime")
    @NotNull
    private final String openTime;

    public StoreTradingDateTime(@NotNull Date date, @NotNull String openTime, @NotNull String closeTime) {
        Intrinsics.h(date, "date");
        Intrinsics.h(openTime, "openTime");
        Intrinsics.h(closeTime, "closeTime");
        this.date = date;
        this.openTime = openTime;
        this.closeTime = closeTime;
    }

    public static /* synthetic */ StoreTradingDateTime copy$default(StoreTradingDateTime storeTradingDateTime, Date date, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            date = storeTradingDateTime.date;
        }
        if ((i & 2) != 0) {
            str = storeTradingDateTime.openTime;
        }
        if ((i & 4) != 0) {
            str2 = storeTradingDateTime.closeTime;
        }
        return storeTradingDateTime.copy(date, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getOpenTime() {
        return this.openTime;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCloseTime() {
        return this.closeTime;
    }

    @NotNull
    public final StoreTradingDateTime copy(@NotNull Date date, @NotNull String openTime, @NotNull String closeTime) {
        Intrinsics.h(date, "date");
        Intrinsics.h(openTime, "openTime");
        Intrinsics.h(closeTime, "closeTime");
        return new StoreTradingDateTime(date, openTime, closeTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreTradingDateTime)) {
            return false;
        }
        StoreTradingDateTime storeTradingDateTime = (StoreTradingDateTime) other;
        return Intrinsics.c(this.date, storeTradingDateTime.date) && Intrinsics.c(this.openTime, storeTradingDateTime.openTime) && Intrinsics.c(this.closeTime, storeTradingDateTime.closeTime);
    }

    @NotNull
    public final String getCloseTime() {
        return this.closeTime;
    }

    @NotNull
    public final Date getDate() {
        return this.date;
    }

    @NotNull
    public final String getOpenTime() {
        return this.openTime;
    }

    public int hashCode() {
        return this.closeTime.hashCode() + b.c(this.date.hashCode() * 31, 31, this.openTime);
    }

    @NotNull
    public String toString() {
        Date date = this.date;
        String str = this.openTime;
        String str2 = this.closeTime;
        StringBuilder sb = new StringBuilder("StoreTradingDateTime(date=");
        sb.append(date);
        sb.append(", openTime=");
        sb.append(str);
        sb.append(", closeTime=");
        return a.o(sb, str2, ")");
    }
}
