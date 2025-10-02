package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0015"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSSignMarkVisibleRange;", "", "belowMeters", "", "aboveMeters", "(Ljava/lang/Float;Ljava/lang/Float;)V", "getAboveMeters", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBelowMeters", "component1", "component2", "copy", "(Ljava/lang/Float;Ljava/lang/Float;)Lme/oriient/ipssdk/api/models/IPSSignMarkVisibleRange;", "equals", "", "other", "hashCode", "", "toString", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IPSSignMarkVisibleRange {

    @Nullable
    private final Float aboveMeters;

    @Nullable
    private final Float belowMeters;

    public IPSSignMarkVisibleRange(@Nullable Float f, @Nullable Float f2) {
        this.belowMeters = f;
        this.aboveMeters = f2;
    }

    public static /* synthetic */ IPSSignMarkVisibleRange copy$default(IPSSignMarkVisibleRange iPSSignMarkVisibleRange, Float f, Float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = iPSSignMarkVisibleRange.belowMeters;
        }
        if ((i & 2) != 0) {
            f2 = iPSSignMarkVisibleRange.aboveMeters;
        }
        return iPSSignMarkVisibleRange.copy(f, f2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Float getBelowMeters() {
        return this.belowMeters;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Float getAboveMeters() {
        return this.aboveMeters;
    }

    @NotNull
    public final IPSSignMarkVisibleRange copy(@Nullable Float belowMeters, @Nullable Float aboveMeters) {
        return new IPSSignMarkVisibleRange(belowMeters, aboveMeters);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IPSSignMarkVisibleRange)) {
            return false;
        }
        IPSSignMarkVisibleRange iPSSignMarkVisibleRange = (IPSSignMarkVisibleRange) other;
        return Intrinsics.c(this.belowMeters, iPSSignMarkVisibleRange.belowMeters) && Intrinsics.c(this.aboveMeters, iPSSignMarkVisibleRange.aboveMeters);
    }

    @Nullable
    public final Float getAboveMeters() {
        return this.aboveMeters;
    }

    @Nullable
    public final Float getBelowMeters() {
        return this.belowMeters;
    }

    public int hashCode() {
        Float f = this.belowMeters;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.aboveMeters;
        return iHashCode + (f2 != null ? f2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "IPSSignMarkVisibleRange(belowMeters=" + this.belowMeters + ", aboveMeters=" + this.aboveMeters + ')';
    }
}
