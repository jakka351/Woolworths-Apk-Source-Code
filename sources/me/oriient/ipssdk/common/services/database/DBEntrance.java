package me.oriient.ipssdk.common.services.database;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import me.oriient.ipssdk.common.ofs.L;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0006HÖ\u0001J\b\u0010\"\u001a\u00020\u0003H\u0016R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006#"}, d2 = {"Lme/oriient/ipssdk/common/services/database/DBEntrance;", "", "id", "", lqlqqlq.mmm006Dm006Dm, "isMain", "", "buildingId", "floorId", "x", "", "y", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;DD)V", "getBuildingId", "()Ljava/lang/String;", "getDescription", "getFloorId", "getId", "()I", "getX", "()D", "getY", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DBEntrance {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String description;

    @NotNull
    private final String floorId;

    @NotNull
    private final String id;
    private final int isMain;
    private final double x;
    private final double y;

    public DBEntrance(@NotNull String id, @NotNull String description, int i, @NotNull String buildingId, @NotNull String floorId, double d, double d2) {
        Intrinsics.h(id, "id");
        Intrinsics.h(description, "description");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.id = id;
        this.description = description;
        this.isMain = i;
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.x = d;
        this.y = d2;
    }

    public static /* synthetic */ DBEntrance copy$default(DBEntrance dBEntrance, String str, String str2, int i, String str3, String str4, double d, double d2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dBEntrance.id;
        }
        if ((i2 & 2) != 0) {
            str2 = dBEntrance.description;
        }
        if ((i2 & 4) != 0) {
            i = dBEntrance.isMain;
        }
        if ((i2 & 8) != 0) {
            str3 = dBEntrance.buildingId;
        }
        if ((i2 & 16) != 0) {
            str4 = dBEntrance.floorId;
        }
        if ((i2 & 32) != 0) {
            d = dBEntrance.x;
        }
        if ((i2 & 64) != 0) {
            d2 = dBEntrance.y;
        }
        double d3 = d2;
        double d4 = d;
        String str5 = str4;
        int i3 = i;
        return dBEntrance.copy(str, str2, i3, str3, str5, d4, d3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsMain() {
        return this.isMain;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    /* renamed from: component6, reason: from getter */
    public final double getX() {
        return this.x;
    }

    /* renamed from: component7, reason: from getter */
    public final double getY() {
        return this.y;
    }

    @NotNull
    public final DBEntrance copy(@NotNull String id, @NotNull String description, int isMain, @NotNull String buildingId, @NotNull String floorId, double x, double y) {
        Intrinsics.h(id, "id");
        Intrinsics.h(description, "description");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        return new DBEntrance(id, description, isMain, buildingId, floorId, x, y);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DBEntrance)) {
            return false;
        }
        DBEntrance dBEntrance = (DBEntrance) other;
        return Intrinsics.c(this.id, dBEntrance.id) && Intrinsics.c(this.description, dBEntrance.description) && this.isMain == dBEntrance.isMain && Intrinsics.c(this.buildingId, dBEntrance.buildingId) && Intrinsics.c(this.floorId, dBEntrance.floorId) && Double.compare(this.x, dBEntrance.x) == 0 && Double.compare(this.y, dBEntrance.y) == 0;
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final double getX() {
        return this.x;
    }

    public final double getY() {
        return this.y;
    }

    public int hashCode() {
        return Double.hashCode(this.y) + a.a(this.x, L.a(this.floorId, L.a(this.buildingId, b.a(this.isMain, L.a(this.description, this.id.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final int isMain() {
        return this.isMain;
    }

    @NotNull
    public String toString() {
        return StringsKt.n0("\n  |DBEntrance [\n  |  id: " + this.id + "\n  |  description: " + this.description + "\n  |  isMain: " + this.isMain + "\n  |  buildingId: " + this.buildingId + "\n  |  floorId: " + this.floorId + "\n  |  x: " + this.x + "\n  |  y: " + this.y + "\n  |]\n  ");
    }
}
