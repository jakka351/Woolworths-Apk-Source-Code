package me.oriient.internal.services.plai.database;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.services.config.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u000eHÆ\u0003J\t\u0010&\u001a\u00020\u0010HÆ\u0003J\t\u0010'\u001a\u00020\u0012HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\bHÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u0081\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u00101\u001a\u00020\u000e2\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u00020\u0010HÖ\u0001J\b\u00104\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001dR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015¨\u00065"}, d2 = {"Lme/oriient/internal/services/plai/database/DbPlaiCategories;", "", "buildingId", "", "floorId", "categoryName", "categoryId", "bottomLeftX", "", "bottomLeftY", "topRightX", "topRightY", "categoryArea", "isAppropriateSize", "", "numberOfProductsWithinArea", "", "lastUsedScanTimeMillis", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDDDZIJ)V", "getBottomLeftX", "()D", "getBottomLeftY", "getBuildingId", "()Ljava/lang/String;", "getCategoryArea", "getCategoryId", "getCategoryName", "getFloorId", "()Z", "getLastUsedScanTimeMillis", "()J", "getNumberOfProductsWithinArea", "()I", "getTopRightX", "getTopRightY", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbPlaiCategories {
    private final double bottomLeftX;
    private final double bottomLeftY;

    @NotNull
    private final String buildingId;
    private final double categoryArea;

    @NotNull
    private final String categoryId;

    @NotNull
    private final String categoryName;

    @NotNull
    private final String floorId;
    private final boolean isAppropriateSize;
    private final long lastUsedScanTimeMillis;
    private final int numberOfProductsWithinArea;
    private final double topRightX;
    private final double topRightY;

    public DbPlaiCategories(@NotNull String buildingId, @NotNull String floorId, @NotNull String categoryName, @NotNull String categoryId, double d, double d2, double d3, double d4, double d5, boolean z, int i, long j) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(categoryName, "categoryName");
        Intrinsics.h(categoryId, "categoryId");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.categoryName = categoryName;
        this.categoryId = categoryId;
        this.bottomLeftX = d;
        this.bottomLeftY = d2;
        this.topRightX = d3;
        this.topRightY = d4;
        this.categoryArea = d5;
        this.isAppropriateSize = z;
        this.numberOfProductsWithinArea = i;
        this.lastUsedScanTimeMillis = j;
    }

    public static /* synthetic */ DbPlaiCategories copy$default(DbPlaiCategories dbPlaiCategories, String str, String str2, String str3, String str4, double d, double d2, double d3, double d4, double d5, boolean z, int i, long j, int i2, Object obj) {
        long j2;
        int i3;
        String str5 = (i2 & 1) != 0 ? dbPlaiCategories.buildingId : str;
        String str6 = (i2 & 2) != 0 ? dbPlaiCategories.floorId : str2;
        String str7 = (i2 & 4) != 0 ? dbPlaiCategories.categoryName : str3;
        String str8 = (i2 & 8) != 0 ? dbPlaiCategories.categoryId : str4;
        double d6 = (i2 & 16) != 0 ? dbPlaiCategories.bottomLeftX : d;
        double d7 = (i2 & 32) != 0 ? dbPlaiCategories.bottomLeftY : d2;
        double d8 = (i2 & 64) != 0 ? dbPlaiCategories.topRightX : d3;
        double d9 = (i2 & 128) != 0 ? dbPlaiCategories.topRightY : d4;
        double d10 = (i2 & 256) != 0 ? dbPlaiCategories.categoryArea : d5;
        String str9 = str5;
        boolean z2 = (i2 & 512) != 0 ? dbPlaiCategories.isAppropriateSize : z;
        int i4 = (i2 & 1024) != 0 ? dbPlaiCategories.numberOfProductsWithinArea : i;
        if ((i2 & 2048) != 0) {
            i3 = i4;
            j2 = dbPlaiCategories.lastUsedScanTimeMillis;
        } else {
            j2 = j;
            i3 = i4;
        }
        return dbPlaiCategories.copy(str9, str6, str7, str8, d6, d7, d8, d9, d10, z2, i3, j2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsAppropriateSize() {
        return this.isAppropriateSize;
    }

    /* renamed from: component11, reason: from getter */
    public final int getNumberOfProductsWithinArea() {
        return this.numberOfProductsWithinArea;
    }

    /* renamed from: component12, reason: from getter */
    public final long getLastUsedScanTimeMillis() {
        return this.lastUsedScanTimeMillis;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component5, reason: from getter */
    public final double getBottomLeftX() {
        return this.bottomLeftX;
    }

    /* renamed from: component6, reason: from getter */
    public final double getBottomLeftY() {
        return this.bottomLeftY;
    }

    /* renamed from: component7, reason: from getter */
    public final double getTopRightX() {
        return this.topRightX;
    }

    /* renamed from: component8, reason: from getter */
    public final double getTopRightY() {
        return this.topRightY;
    }

    /* renamed from: component9, reason: from getter */
    public final double getCategoryArea() {
        return this.categoryArea;
    }

    @NotNull
    public final DbPlaiCategories copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String categoryName, @NotNull String categoryId, double bottomLeftX, double bottomLeftY, double topRightX, double topRightY, double categoryArea, boolean isAppropriateSize, int numberOfProductsWithinArea, long lastUsedScanTimeMillis) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(categoryName, "categoryName");
        Intrinsics.h(categoryId, "categoryId");
        return new DbPlaiCategories(buildingId, floorId, categoryName, categoryId, bottomLeftX, bottomLeftY, topRightX, topRightY, categoryArea, isAppropriateSize, numberOfProductsWithinArea, lastUsedScanTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbPlaiCategories)) {
            return false;
        }
        DbPlaiCategories dbPlaiCategories = (DbPlaiCategories) other;
        return Intrinsics.c(this.buildingId, dbPlaiCategories.buildingId) && Intrinsics.c(this.floorId, dbPlaiCategories.floorId) && Intrinsics.c(this.categoryName, dbPlaiCategories.categoryName) && Intrinsics.c(this.categoryId, dbPlaiCategories.categoryId) && Double.compare(this.bottomLeftX, dbPlaiCategories.bottomLeftX) == 0 && Double.compare(this.bottomLeftY, dbPlaiCategories.bottomLeftY) == 0 && Double.compare(this.topRightX, dbPlaiCategories.topRightX) == 0 && Double.compare(this.topRightY, dbPlaiCategories.topRightY) == 0 && Double.compare(this.categoryArea, dbPlaiCategories.categoryArea) == 0 && this.isAppropriateSize == dbPlaiCategories.isAppropriateSize && this.numberOfProductsWithinArea == dbPlaiCategories.numberOfProductsWithinArea && this.lastUsedScanTimeMillis == dbPlaiCategories.lastUsedScanTimeMillis;
    }

    public final double getBottomLeftX() {
        return this.bottomLeftX;
    }

    public final double getBottomLeftY() {
        return this.bottomLeftY;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final double getCategoryArea() {
        return this.categoryArea;
    }

    @NotNull
    public final String getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final String getCategoryName() {
        return this.categoryName;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final long getLastUsedScanTimeMillis() {
        return this.lastUsedScanTimeMillis;
    }

    public final int getNumberOfProductsWithinArea() {
        return this.numberOfProductsWithinArea;
    }

    public final double getTopRightX() {
        return this.topRightX;
    }

    public final double getTopRightY() {
        return this.topRightY;
    }

    public int hashCode() {
        return Long.hashCode(this.lastUsedScanTimeMillis) + a.a(this.numberOfProductsWithinArea, me.oriient.internal.infra.scheduler.a.a(this.isAppropriateSize, J.a(this.categoryArea, J.a(this.topRightY, J.a(this.topRightX, J.a(this.bottomLeftY, J.a(this.bottomLeftX, me.oriient.internal.infra.rest.a.a(this.categoryId, me.oriient.internal.infra.rest.a.a(this.categoryName, me.oriient.internal.infra.rest.a.a(this.floorId, this.buildingId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final boolean isAppropriateSize() {
        return this.isAppropriateSize;
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DbPlaiCategories [\n  |  buildingId: " + this.buildingId + "\n  |  floorId: " + this.floorId + "\n  |  categoryName: " + this.categoryName + "\n  |  categoryId: " + this.categoryId + "\n  |  bottomLeftX: " + this.bottomLeftX + "\n  |  bottomLeftY: " + this.bottomLeftY + "\n  |  topRightX: " + this.topRightX + "\n  |  topRightY: " + this.topRightY + "\n  |  categoryArea: " + this.categoryArea + "\n  |  isAppropriateSize: " + this.isAppropriateSize + "\n  |  numberOfProductsWithinArea: " + this.numberOfProductsWithinArea + "\n  |  lastUsedScanTimeMillis: " + this.lastUsedScanTimeMillis + "\n  |]\n  ");
    }
}
