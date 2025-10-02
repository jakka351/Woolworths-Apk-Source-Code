package me.oriient.internal.services.dataManager.mapGrid;

import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteArraySerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataModel.engine.MapGridType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u0083\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014B]\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0002\u0010\u0015J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003Jw\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÁ\u0001¢\u0006\u0002\b=R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001a¨\u0006@"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "", "seen1", "", "buildingId", "", "floorId", "mapId", "data", "", "vector", "tag", "engineVersion", "mapVersion", "type", "Lme/oriient/internal/services/dataModel/engine/MapGridType;", "majorVersion", "createdBy", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[B[B[BLjava/lang/String;ILme/oriient/internal/services/dataModel/engine/MapGridType;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B[B[BLjava/lang/String;ILme/oriient/internal/services/dataModel/engine/MapGridType;ILjava/lang/String;)V", "getBuildingId", "()Ljava/lang/String;", "getCreatedBy", "getData", "()[B", "getEngineVersion", "getFloorId", "getMajorVersion", "()I", "getMapId", "getMapVersion", "getTag", "getType", "()Lme/oriient/internal/services/dataModel/engine/MapGridType;", "getVector", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class MapGridRecord {

    @NotNull
    private final String buildingId;

    @NotNull
    private final String createdBy;

    @NotNull
    private final byte[] data;

    @NotNull
    private final String engineVersion;

    @NotNull
    private final String floorId;
    private final int majorVersion;

    @NotNull
    private final String mapId;
    private final int mapVersion;

    @NotNull
    private final byte[] tag;

    @NotNull
    private final MapGridType type;

    @NotNull
    private final byte[] vector;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, EnumsKt.b(MapGridType.values(), "me.oriient.internal.services.dataModel.engine.MapGridType"), null, null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MapGridRecord> serializer() {
            return MapGridRecord$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ MapGridRecord(int i, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, String str4, int i2, MapGridType mapGridType, int i3, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (2047 != (i & 2047)) {
            PluginExceptionsKt.a(i, 2047, MapGridRecord$$serializer.INSTANCE.getB());
            throw null;
        }
        this.buildingId = str;
        this.floorId = str2;
        this.mapId = str3;
        this.data = bArr;
        this.vector = bArr2;
        this.tag = bArr3;
        this.engineVersion = str4;
        this.mapVersion = i2;
        this.type = mapGridType;
        this.majorVersion = i3;
        this.createdBy = str5;
    }

    public static /* synthetic */ MapGridRecord copy$default(MapGridRecord mapGridRecord, String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, String str4, int i, MapGridType mapGridType, int i2, String str5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = mapGridRecord.buildingId;
        }
        if ((i3 & 2) != 0) {
            str2 = mapGridRecord.floorId;
        }
        if ((i3 & 4) != 0) {
            str3 = mapGridRecord.mapId;
        }
        if ((i3 & 8) != 0) {
            bArr = mapGridRecord.data;
        }
        if ((i3 & 16) != 0) {
            bArr2 = mapGridRecord.vector;
        }
        if ((i3 & 32) != 0) {
            bArr3 = mapGridRecord.tag;
        }
        if ((i3 & 64) != 0) {
            str4 = mapGridRecord.engineVersion;
        }
        if ((i3 & 128) != 0) {
            i = mapGridRecord.mapVersion;
        }
        if ((i3 & 256) != 0) {
            mapGridType = mapGridRecord.type;
        }
        if ((i3 & 512) != 0) {
            i2 = mapGridRecord.majorVersion;
        }
        if ((i3 & 1024) != 0) {
            str5 = mapGridRecord.createdBy;
        }
        int i4 = i2;
        String str6 = str5;
        int i5 = i;
        MapGridType mapGridType2 = mapGridType;
        byte[] bArr4 = bArr3;
        String str7 = str4;
        byte[] bArr5 = bArr2;
        String str8 = str3;
        return mapGridRecord.copy(str, str2, str8, bArr, bArr5, bArr4, str7, i5, mapGridType2, i4, str6);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(MapGridRecord self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.buildingId);
        output.p(serialDesc, 1, self.floorId);
        output.p(serialDesc, 2, self.mapId);
        ByteArraySerializer byteArraySerializer = ByteArraySerializer.c;
        output.F(serialDesc, 3, byteArraySerializer, self.data);
        output.F(serialDesc, 4, byteArraySerializer, self.vector);
        output.F(serialDesc, 5, byteArraySerializer, self.tag);
        output.p(serialDesc, 6, self.engineVersion);
        output.C(7, self.mapVersion, serialDesc);
        output.F(serialDesc, 8, kSerializerArr[8], self.type);
        output.C(9, self.majorVersion, serialDesc);
        output.p(serialDesc, 10, self.createdBy);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBuildingId() {
        return this.buildingId;
    }

    /* renamed from: component10, reason: from getter */
    public final int getMajorVersion() {
        return this.majorVersion;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getFloorId() {
        return this.floorId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final byte[] getVector() {
        return this.vector;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final byte[] getTag() {
        return this.tag;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final MapGridType getType() {
        return this.type;
    }

    @NotNull
    public final MapGridRecord copy(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull byte[] data, @NotNull byte[] vector, @NotNull byte[] tag, @NotNull String engineVersion, int mapVersion, @NotNull MapGridType type, int majorVersion, @NotNull String createdBy) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(data, "data");
        Intrinsics.h(vector, "vector");
        Intrinsics.h(tag, "tag");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(type, "type");
        Intrinsics.h(createdBy, "createdBy");
        return new MapGridRecord(buildingId, floorId, mapId, data, vector, tag, engineVersion, mapVersion, type, majorVersion, createdBy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapGridRecord)) {
            return false;
        }
        MapGridRecord mapGridRecord = (MapGridRecord) other;
        return Intrinsics.c(this.buildingId, mapGridRecord.buildingId) && Intrinsics.c(this.floorId, mapGridRecord.floorId) && Intrinsics.c(this.mapId, mapGridRecord.mapId) && Intrinsics.c(this.data, mapGridRecord.data) && Intrinsics.c(this.vector, mapGridRecord.vector) && Intrinsics.c(this.tag, mapGridRecord.tag) && Intrinsics.c(this.engineVersion, mapGridRecord.engineVersion) && this.mapVersion == mapGridRecord.mapVersion && this.type == mapGridRecord.type && this.majorVersion == mapGridRecord.majorVersion && Intrinsics.c(this.createdBy, mapGridRecord.createdBy);
    }

    @NotNull
    public final String getBuildingId() {
        return this.buildingId;
    }

    @NotNull
    public final String getCreatedBy() {
        return this.createdBy;
    }

    @NotNull
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final String getEngineVersion() {
        return this.engineVersion;
    }

    @NotNull
    public final String getFloorId() {
        return this.floorId;
    }

    public final int getMajorVersion() {
        return this.majorVersion;
    }

    @NotNull
    public final String getMapId() {
        return this.mapId;
    }

    public final int getMapVersion() {
        return this.mapVersion;
    }

    @NotNull
    public final byte[] getTag() {
        return this.tag;
    }

    @NotNull
    public final MapGridType getType() {
        return this.type;
    }

    @NotNull
    public final byte[] getVector() {
        return this.vector;
    }

    public int hashCode() {
        return this.createdBy.hashCode() + me.oriient.internal.services.config.a.a(this.majorVersion, (this.type.hashCode() + me.oriient.internal.services.config.a.a(this.mapVersion, me.oriient.internal.infra.rest.a.a(this.engineVersion, androidx.compose.ui.input.pointer.a.d(androidx.compose.ui.input.pointer.a.d(androidx.compose.ui.input.pointer.a.d(me.oriient.internal.infra.rest.a.a(this.mapId, me.oriient.internal.infra.rest.a.a(this.floorId, this.buildingId.hashCode() * 31, 31), 31), 31, this.data), 31, this.vector), 31, this.tag), 31), 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("MapGridRecord(buildingId=");
        sb.append(this.buildingId);
        sb.append(", floorId=");
        sb.append(this.floorId);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", data=");
        sb.append(Arrays.toString(this.data));
        sb.append(", vector=");
        sb.append(Arrays.toString(this.vector));
        sb.append(", tag=");
        sb.append(Arrays.toString(this.tag));
        sb.append(", engineVersion=");
        sb.append(this.engineVersion);
        sb.append(", mapVersion=");
        sb.append(this.mapVersion);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", majorVersion=");
        sb.append(this.majorVersion);
        sb.append(", createdBy=");
        return androidx.camera.core.impl.b.r(sb, this.createdBy, ')');
    }

    public MapGridRecord(@NotNull String buildingId, @NotNull String floorId, @NotNull String mapId, @NotNull byte[] data, @NotNull byte[] vector, @NotNull byte[] tag, @NotNull String engineVersion, int i, @NotNull MapGridType type, int i2, @NotNull String createdBy) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(data, "data");
        Intrinsics.h(vector, "vector");
        Intrinsics.h(tag, "tag");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(type, "type");
        Intrinsics.h(createdBy, "createdBy");
        this.buildingId = buildingId;
        this.floorId = floorId;
        this.mapId = mapId;
        this.data = data;
        this.vector = vector;
        this.tag = tag;
        this.engineVersion = engineVersion;
        this.mapVersion = i;
        this.type = type;
        this.majorVersion = i2;
        this.createdBy = createdBy;
    }
}
