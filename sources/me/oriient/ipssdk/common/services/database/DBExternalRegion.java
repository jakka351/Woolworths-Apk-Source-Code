package me.oriient.ipssdk.common.services.database;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.ipssdk.common.ofs.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBExternalRegion;", "", "id", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "metadata", "buildingId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getId", "getMetadata", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DBExternalRegion {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String id;

    @Nullable
    private final String metadata;

    @NotNull
    private final String name;

    public DBExternalRegion(@NotNull String id, @NotNull String name, @Nullable String str, @NotNull String buildingId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingId, "buildingId");
        this.id = id;
        this.name = name;
        this.metadata = str;
        this.buildingId = buildingId;
    }

    public static /* synthetic */ DBExternalRegion copy$default(DBExternalRegion dBExternalRegion, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dBExternalRegion.id;
        }
        if ((i & 2) != 0) {
            str2 = dBExternalRegion.name;
        }
        if ((i & 4) != 0) {
            str3 = dBExternalRegion.metadata;
        }
        if ((i & 8) != 0) {
            str4 = dBExternalRegion.buildingId;
        }
        return dBExternalRegion.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final DBExternalRegion copy(@NotNull String id, @NotNull String name, @Nullable String metadata, @NotNull String buildingId) {
        Intrinsics.h(id, "id");
        Intrinsics.h(name, "name");
        Intrinsics.h(buildingId, "buildingId");
        return new DBExternalRegion(id, name, metadata, buildingId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBExternalRegion)) {
            return false;
        }
        DBExternalRegion dBExternalRegion = (DBExternalRegion) other;
        return Intrinsics.c(this.id, dBExternalRegion.id) && Intrinsics.c(this.name, dBExternalRegion.name) && Intrinsics.c(this.metadata, dBExternalRegion.metadata) && Intrinsics.c(this.buildingId, dBExternalRegion.buildingId);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getMetadata() {
        return this.metadata;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int iA = L.a(this.name, this.id.hashCode() * 31, 31);
        String str = this.metadata;
        return this.buildingId.hashCode() + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DBExternalRegion [\n  |  id: " + this.id + "\n  |  name: " + this.name + "\n  |  metadata: " + this.metadata + "\n  |  buildingId: " + this.buildingId + "\n  |]\n  ");
    }
}
