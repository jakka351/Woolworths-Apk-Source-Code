package me.oriient.internal.services.plai.database;

import androidx.camera.core.impl.b;
import com.squareup.sqldelight.ColumnAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.internal.infra.locationManager.J;
import me.oriient.internal.infra.locationManager.K;
import me.oriient.internal.infra.rest.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001-BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u000bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003Jo\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\b\u0010,\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013¨\u0006."}, d2 = {"Lme/oriient/internal/services/plai/database/DbPlaiProducts;", "", "buildingId", "", "floorId", "customerTagId", "x", "", "y", "confidence", "lastUsedScanTimeMillis", "", "regionIds", "", "regionNames", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DDDJLjava/util/List;Ljava/util/List;)V", "getBuildingId", "()Ljava/lang/String;", "getConfidence", "()D", "getCustomerTagId", "getFloorId", "getLastUsedScanTimeMillis", "()J", "getRegionIds", "()Ljava/util/List;", "getRegionNames", "getX", "getY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Adapter", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class DbPlaiProducts {

    @NotNull
    private final String buildingId;
    private final double confidence;

    @NotNull
    private final String customerTagId;

    @NotNull
    private final String floorId;
    private final long lastUsedScanTimeMillis;

    @NotNull
    private final List<String> regionIds;

    @NotNull
    private final List<String> regionNames;
    private final double x;
    private final double y;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\u0012\u0018\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0007R#\u0010\u0002\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR#\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lme/oriient/internal/services/plai/database/DbPlaiProducts$Adapter;", "", "regionIdsAdapter", "Lcom/squareup/sqldelight/ColumnAdapter;", "", "", "regionNamesAdapter", "(Lcom/squareup/sqldelight/ColumnAdapter;Lcom/squareup/sqldelight/ColumnAdapter;)V", "getRegionIdsAdapter", "()Lcom/squareup/sqldelight/ColumnAdapter;", "getRegionNamesAdapter", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Adapter {

        @NotNull
        private final ColumnAdapter<List<String>, String> regionIdsAdapter;

        @NotNull
        private final ColumnAdapter<List<String>, String> regionNamesAdapter;

        public Adapter(@NotNull ColumnAdapter<List<String>, String> regionIdsAdapter, @NotNull ColumnAdapter<List<String>, String> regionNamesAdapter) {
            Intrinsics.h(regionIdsAdapter, "regionIdsAdapter");
            Intrinsics.h(regionNamesAdapter, "regionNamesAdapter");
            this.regionIdsAdapter = regionIdsAdapter;
            this.regionNamesAdapter = regionNamesAdapter;
        }

        @NotNull
        public final ColumnAdapter<List<String>, String> getRegionIdsAdapter() {
            return this.regionIdsAdapter;
        }

        @NotNull
        public final ColumnAdapter<List<String>, String> getRegionNamesAdapter() {
            return this.regionNamesAdapter;
        }
    }

    public DbPlaiProducts(@NotNull String buildingId, @NotNull String floorId, @NotNull String customerTagId, double d, double d2, double d3, long j, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(regionIds, "regionIds");
        Intrinsics.h(regionNames, "regionNames");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.customerTagId = customerTagId;
        this.x = d;
        this.y = d2;
        this.confidence = d3;
        this.lastUsedScanTimeMillis = j;
        this.regionIds = regionIds;
        this.regionNames = regionNames;
    }

    public static /* synthetic */ DbPlaiProducts copy$default(DbPlaiProducts dbPlaiProducts, String str, String str2, String str3, double d, double d2, double d3, long j, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dbPlaiProducts.buildingId;
        }
        return dbPlaiProducts.copy(str, (i & 2) != 0 ? dbPlaiProducts.floorId : str2, (i & 4) != 0 ? dbPlaiProducts.customerTagId : str3, (i & 8) != 0 ? dbPlaiProducts.x : d, (i & 16) != 0 ? dbPlaiProducts.y : d2, (i & 32) != 0 ? dbPlaiProducts.confidence : d3, (i & 64) != 0 ? dbPlaiProducts.lastUsedScanTimeMillis : j, (i & 128) != 0 ? dbPlaiProducts.regionIds : list, (i & 256) != 0 ? dbPlaiProducts.regionNames : list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    /* renamed from: component4, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component5, reason: from getter */
    public final double getY() {
        return this.y;
    }

    /* renamed from: component6, reason: from getter */
    public final double getConfidence() {
        return this.confidence;
    }

    /* renamed from: component7, reason: from getter */
    public final long getLastUsedScanTimeMillis() {
        return this.lastUsedScanTimeMillis;
    }

    @NotNull
    public final List<String> component8() {
        return this.regionIds;
    }

    @NotNull
    public final List<String> component9() {
        return this.regionNames;
    }

    @NotNull
    public final DbPlaiProducts copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String customerTagId, double x, double y, double confidence, long lastUsedScanTimeMillis, @NotNull List<String> regionIds, @NotNull List<String> regionNames) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(customerTagId, "customerTagId");
        Intrinsics.h(regionIds, "regionIds");
        Intrinsics.h(regionNames, "regionNames");
        return new DbPlaiProducts(buildingId, floorId, customerTagId, x, y, confidence, lastUsedScanTimeMillis, regionIds, regionNames);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DbPlaiProducts)) {
            return false;
        }
        DbPlaiProducts dbPlaiProducts = (DbPlaiProducts) other;
        return Intrinsics.c(this.buildingId, dbPlaiProducts.buildingId) && Intrinsics.c(this.floorId, dbPlaiProducts.floorId) && Intrinsics.c(this.customerTagId, dbPlaiProducts.customerTagId) && Double.compare(this.x, dbPlaiProducts.x) == 0 && Double.compare(this.y, dbPlaiProducts.y) == 0 && Double.compare(this.confidence, dbPlaiProducts.confidence) == 0 && this.lastUsedScanTimeMillis == dbPlaiProducts.lastUsedScanTimeMillis && Intrinsics.c(this.regionIds, dbPlaiProducts.regionIds) && Intrinsics.c(this.regionNames, dbPlaiProducts.regionNames);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    public final double getConfidence() {
        return this.confidence;
    }

    @NotNull
    public final String getCustomerTagId() {
        return this.customerTagId;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final long getLastUsedScanTimeMillis() {
        return this.lastUsedScanTimeMillis;
    }

    @NotNull
    public final List<String> getRegionIds() {
        return this.regionIds;
    }

    @NotNull
    public final List<String> getRegionNames() {
        return this.regionNames;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return this.regionNames.hashCode() + b.d(K.a(this.lastUsedScanTimeMillis, J.a(this.confidence, J.a(this.y, J.a(this.x, a.a(this.customerTagId, a.a(this.floorId, this.buildingId.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31, this.regionIds);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DbPlaiProducts [\n  |  buildingId: " + this.buildingId + "\n  |  floorId: " + this.floorId + "\n  |  customerTagId: " + this.customerTagId + "\n  |  x: " + this.x + "\n  |  y: " + this.y + "\n  |  confidence: " + this.confidence + "\n  |  lastUsedScanTimeMillis: " + this.lastUsedScanTimeMillis + "\n  |  regionIds: " + this.regionIds + "\n  |  regionNames: " + this.regionNames + "\n  |]\n  ");
    }
}
