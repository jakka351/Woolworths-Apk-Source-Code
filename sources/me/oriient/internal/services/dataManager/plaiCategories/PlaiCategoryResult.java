package me.oriient.internal.services.dataManager.plaiCategories;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryResult;", "", "buildingId", "", "categoryId", "primaryRecord", "Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryRecord;", "allRecords", "", "(Ljava/lang/String;Ljava/lang/String;Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryRecord;Ljava/util/List;)V", "getAllRecords", "()Ljava/util/List;", "getBuildingId", "()Ljava/lang/String;", "getCategoryId", "getPrimaryRecord", "()Lme/oriient/internal/services/dataManager/plaiCategories/PlaiCategoryRecord;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlaiCategoryResult {

    @NotNull
    private final List<PlaiCategoryRecord> allRecords;

    @NotNull
    private final String buildingId;

    @NotNull
    private final String categoryId;

    @NotNull
    private final PlaiCategoryRecord primaryRecord;

    public PlaiCategoryResult(@NotNull String buildingId, @NotNull String categoryId, @NotNull PlaiCategoryRecord primaryRecord, @NotNull List<PlaiCategoryRecord> allRecords) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryId, "categoryId");
        Intrinsics.h(primaryRecord, "primaryRecord");
        Intrinsics.h(allRecords, "allRecords");
        this.buildingId = buildingId;
        this.categoryId = categoryId;
        this.primaryRecord = primaryRecord;
        this.allRecords = allRecords;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlaiCategoryResult copy$default(PlaiCategoryResult plaiCategoryResult, String str, String str2, PlaiCategoryRecord plaiCategoryRecord, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = plaiCategoryResult.buildingId;
        }
        if ((i & 2) != 0) {
            str2 = plaiCategoryResult.categoryId;
        }
        if ((i & 4) != 0) {
            plaiCategoryRecord = plaiCategoryResult.primaryRecord;
        }
        if ((i & 8) != 0) {
            list = plaiCategoryResult.allRecords;
        }
        return plaiCategoryResult.copy(str, str2, plaiCategoryRecord, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PlaiCategoryRecord getPrimaryRecord() {
        return this.primaryRecord;
    }

    @NotNull
    public final List<PlaiCategoryRecord> component4() {
        return this.allRecords;
    }

    @NotNull
    public final PlaiCategoryResult copy(@NotNull String buildingId, @NotNull String categoryId, @NotNull PlaiCategoryRecord primaryRecord, @NotNull List<PlaiCategoryRecord> allRecords) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(categoryId, "categoryId");
        Intrinsics.h(primaryRecord, "primaryRecord");
        Intrinsics.h(allRecords, "allRecords");
        return new PlaiCategoryResult(buildingId, categoryId, primaryRecord, allRecords);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaiCategoryResult)) {
            return false;
        }
        PlaiCategoryResult plaiCategoryResult = (PlaiCategoryResult) other;
        return Intrinsics.c(this.buildingId, plaiCategoryResult.buildingId) && Intrinsics.c(this.categoryId, plaiCategoryResult.categoryId) && Intrinsics.c(this.primaryRecord, plaiCategoryResult.primaryRecord) && Intrinsics.c(this.allRecords, plaiCategoryResult.allRecords);
    }

    @NotNull
    public final List<PlaiCategoryRecord> getAllRecords() {
        return this.allRecords;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final PlaiCategoryRecord getPrimaryRecord() {
        return this.primaryRecord;
    }

    public int hashCode() {
        return this.allRecords.hashCode() + ((this.primaryRecord.hashCode() + me.oriient.internal.infra.rest.a.a(this.categoryId, this.buildingId.hashCode() * 31, 31)) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlaiCategoryResult(buildingId=");
        sb.append(this.buildingId);
        sb.append(", categoryId=");
        sb.append(this.categoryId);
        sb.append(", primaryRecord=");
        sb.append(this.primaryRecord);
        sb.append(", allRecords=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.allRecords, ')');
    }
}
