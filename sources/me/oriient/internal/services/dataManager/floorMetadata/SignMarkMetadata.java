package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkMetadata;", "", "visibleRanges", "", "Lme/oriient/internal/services/dataManager/floorMetadata/SignMarkVisibleRange;", "(Ljava/util/List;)V", "getVisibleRanges", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class SignMarkMetadata {

    @Nullable
    private final List<SignMarkVisibleRange> visibleRanges;

    public SignMarkMetadata(@Nullable List<SignMarkVisibleRange> list) {
        this.visibleRanges = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignMarkMetadata copy$default(SignMarkMetadata signMarkMetadata, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signMarkMetadata.visibleRanges;
        }
        return signMarkMetadata.copy(list);
    }

    @Nullable
    public final List<SignMarkVisibleRange> component1() {
        return this.visibleRanges;
    }

    @NotNull
    public final SignMarkMetadata copy(@Nullable List<SignMarkVisibleRange> visibleRanges) {
        return new SignMarkMetadata(visibleRanges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SignMarkMetadata) && Intrinsics.c(this.visibleRanges, ((SignMarkMetadata) other).visibleRanges);
    }

    @Nullable
    public final List<SignMarkVisibleRange> getVisibleRanges() {
        return this.visibleRanges;
    }

    public int hashCode() {
        List<SignMarkVisibleRange> list = this.visibleRanges;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return me.oriient.internal.services.auth.rest.m.a(new StringBuilder("SignMarkMetadata(visibleRanges="), this.visibleRanges, ')');
    }
}
