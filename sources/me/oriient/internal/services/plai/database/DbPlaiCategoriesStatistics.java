package me.oriient.internal.services.plai.database;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lme/oriient/internal/services/plai/database/DbPlaiCategoriesStatistics;", "", "buildingId", "", "lastUpdatedTimestampMillis", "", "(Ljava/lang/String;J)V", "getBuildingId", "()Ljava/lang/String;", "getLastUpdatedTimestampMillis", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbPlaiCategoriesStatistics {

    @NotNull
    private final String buildingId;
    private final long lastUpdatedTimestampMillis;

    public DbPlaiCategoriesStatistics(@NotNull String buildingId, long j) {
        Intrinsics.h(buildingId, "buildingId");
        this.buildingId = buildingId;
        this.lastUpdatedTimestampMillis = j;
    }

    public static /* synthetic */ DbPlaiCategoriesStatistics copy$default(DbPlaiCategoriesStatistics dbPlaiCategoriesStatistics, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dbPlaiCategoriesStatistics.buildingId;
        }
        if ((i & 2) != 0) {
            j = dbPlaiCategoriesStatistics.lastUpdatedTimestampMillis;
        }
        return dbPlaiCategoriesStatistics.copy(str, j);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getLastUpdatedTimestampMillis() {
        return this.lastUpdatedTimestampMillis;
    }

    @NotNull
    public final DbPlaiCategoriesStatistics copy(@NotNull String buildingId, long lastUpdatedTimestampMillis) {
        Intrinsics.h(buildingId, "buildingId");
        return new DbPlaiCategoriesStatistics(buildingId, lastUpdatedTimestampMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbPlaiCategoriesStatistics)) {
            return false;
        }
        DbPlaiCategoriesStatistics dbPlaiCategoriesStatistics = (DbPlaiCategoriesStatistics) other;
        return Intrinsics.c(this.buildingId, dbPlaiCategoriesStatistics.buildingId) && this.lastUpdatedTimestampMillis == dbPlaiCategoriesStatistics.lastUpdatedTimestampMillis;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final long getLastUpdatedTimestampMillis() {
        return this.lastUpdatedTimestampMillis;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUpdatedTimestampMillis) + (this.buildingId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DbPlaiCategoriesStatistics [\n  |  buildingId: " + this.buildingId + "\n  |  lastUpdatedTimestampMillis: " + this.lastUpdatedTimestampMillis + "\n  |]\n  ");
    }
}
