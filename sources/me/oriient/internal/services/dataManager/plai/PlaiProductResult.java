package me.oriient.internal.services.dataManager.plai;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/dataManager/plai/PlaiProductResult;", "", "buildingId", "", "customerTagId", "primaryRecord", "Lme/oriient/internal/services/dataManager/plai/PlaiRecord;", "allRecords", "", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/plai/PlaiRecord;Ljava/util/List;)V", "getAllRecords", "()Ljava/util/List;", "getBuildingId", "()Ljava/lang/String;", "getCustomerTagId", "getPrimaryRecord", "()Lme/oriient/internal/services/dataManager/plai/PlaiRecord;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaiProductResult {

    @NotNull
    private final List<PlaiRecord> allRecords;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String customerTagId;

    @NotNull
    private final PlaiRecord primaryRecord;

    public PlaiProductResult(@NotNull String buildingId, @NotNull String customerTagId, @NotNull PlaiRecord primaryRecord, @NotNull List<PlaiRecord> allRecords) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(primaryRecord, "primaryRecord");
        Intrinsics.h(allRecords, "allRecords");
        this.buildingId = buildingId;
        this.customerTagId = customerTagId;
        this.primaryRecord = primaryRecord;
        this.allRecords = allRecords;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaiProductResult copy$default(PlaiProductResult plaiProductResult, String str, String str2, PlaiRecord plaiRecord, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaiProductResult.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = plaiProductResult.customerTagId;
        }
        if ((i & 4) != 0) {
            plaiRecord = plaiProductResult.primaryRecord;
        }
        if ((i & 8) != 0) {
            list = plaiProductResult.allRecords;
        }
        return plaiProductResult.copy(str, str2, plaiRecord, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PlaiRecord getPrimaryRecord() {
        return this.primaryRecord;
    }

    @NotNull
    public final List<PlaiRecord> component4() {
        return this.allRecords;
    }

    @NotNull
    public final PlaiProductResult copy(@NotNull String buildingId, @NotNull String customerTagId, @NotNull PlaiRecord primaryRecord, @NotNull List<PlaiRecord> allRecords) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(primaryRecord, "primaryRecord");
        Intrinsics.h(allRecords, "allRecords");
        return new PlaiProductResult(buildingId, customerTagId, primaryRecord, allRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaiProductResult)) {
            return false;
        }
        PlaiProductResult plaiProductResult = (PlaiProductResult) other;
        return Intrinsics.c(this.buildingId, plaiProductResult.buildingId) && Intrinsics.c(this.customerTagId, plaiProductResult.customerTagId) && Intrinsics.c(this.primaryRecord, plaiProductResult.primaryRecord) && Intrinsics.c(this.allRecords, plaiProductResult.allRecords);
    }

    @NotNull
    public final List<PlaiRecord> getAllRecords() {
        return this.allRecords;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    @NotNull
    public final PlaiRecord getPrimaryRecord() {
        return this.primaryRecord;
    }

    public int hashCode() {
        return this.allRecords.hashCode() + ((this.primaryRecord.hashCode() + me.oriient.internal.infra.rest.a.a(this.customerTagId, this.buildingId.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlaiProductResult(buildingId=");
        sb.append(this.buildingId);
        sb.append(", customerTagId=");
        sb.append(this.customerTagId);
        sb.append(", primaryRecord=");
        sb.append(this.primaryRecord);
        sb.append(", allRecords=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.allRecords, ')');
    }
}
