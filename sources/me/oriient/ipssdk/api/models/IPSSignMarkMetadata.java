package me.oriient.ipssdk.api.models;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lme/oriient/ipssdk/api/models/IPSSignMarkMetadata;", "", "visibleRanges", "", "Lme/oriient/ipssdk/api/models/IPSSignMarkVisibleRange;", "(Ljava/util/List;)V", "getVisibleRanges", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class IPSSignMarkMetadata {

    @Nullable
    private final List<IPSSignMarkVisibleRange> visibleRanges;

    public IPSSignMarkMetadata(@Nullable List<IPSSignMarkVisibleRange> list) {
        this.visibleRanges = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IPSSignMarkMetadata copy$default(IPSSignMarkMetadata iPSSignMarkMetadata, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = iPSSignMarkMetadata.visibleRanges;
        }
        return iPSSignMarkMetadata.copy(list);
    }

    @Nullable
    public final List<IPSSignMarkVisibleRange> component1() {
        return this.visibleRanges;
    }

    @NotNull
    public final IPSSignMarkMetadata copy(@Nullable List<IPSSignMarkVisibleRange> visibleRanges) {
        return new IPSSignMarkMetadata(visibleRanges);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IPSSignMarkMetadata) && Intrinsics.c(this.visibleRanges, ((IPSSignMarkMetadata) other).visibleRanges);
    }

    @Nullable
    public final List<IPSSignMarkVisibleRange> getVisibleRanges() {
        return this.visibleRanges;
    }

    public int hashCode() {
        List<IPSSignMarkVisibleRange> list = this.visibleRanges;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return a.o(new StringBuilder("IPSSignMarkMetadata(visibleRanges="), this.visibleRanges, ')');
    }
}
