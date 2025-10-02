package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import me.oriient.internal.services.dataManager.building.CoordinateResponse;
import me.oriient.internal.services.dataManager.building.CoordinateResponse$$serializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002&'B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fB#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u001b\u001a\u00020\u001cJ\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006("}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMapResponse;", "", "seen1", "", "mapId", "", "points", "", "Lme/oriient/internal/services/dataManager/building/CoordinateResponse;", "mapName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getMapId", "()Ljava/lang/String;", "getMapName", "getPoints", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toFloorMap", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMap;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class FloorMapResponse {

    @NotNull
    private final String mapId;

    @NotNull
    private final String mapName;

    @NotNull
    private final List<CoordinateResponse> points;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(CoordinateResponse$$serializer.INSTANCE), null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorMapResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorMapResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorMapResponse> serializer() {
            return FloorMapResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ FloorMapResponse(int i, String str, List list, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.a(i, 7, FloorMapResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.mapId = str;
        this.points = list;
        this.mapName = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FloorMapResponse copy$default(FloorMapResponse floorMapResponse, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = floorMapResponse.mapId;
        }
        if ((i & 2) != 0) {
            list = floorMapResponse.points;
        }
        if ((i & 4) != 0) {
            str2 = floorMapResponse.mapName;
        }
        return floorMapResponse.copy(str, list, str2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorMapResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.mapId);
        output.F(serialDesc, 1, kSerializerArr[1], self.points);
        output.p(serialDesc, 2, self.mapName);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    public final List<CoordinateResponse> component2() {
        return this.points;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMapName() {
        return this.mapName;
    }

    @NotNull
    public final FloorMapResponse copy(@NotNull String mapId, @NotNull List<CoordinateResponse> points, @NotNull String mapName) {
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(points, "points");
        Intrinsics.h(mapName, "mapName");
        return new FloorMapResponse(mapId, points, mapName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorMapResponse)) {
            return false;
        }
        FloorMapResponse floorMapResponse = (FloorMapResponse) other;
        return Intrinsics.c(this.mapId, floorMapResponse.mapId) && Intrinsics.c(this.points, floorMapResponse.points) && Intrinsics.c(this.mapName, floorMapResponse.mapName);
    }

    @NotNull
    public final String getMapId() {
        return this.mapId;
    }

    @NotNull
    public final String getMapName() {
        return this.mapName;
    }

    @NotNull
    public final List<CoordinateResponse> getPoints() {
        return this.points;
    }

    public int hashCode() {
        return this.mapName.hashCode() + androidx.camera.core.impl.b.d(this.mapId.hashCode() * 31, 31, this.points);
    }

    @NotNull
    public final FloorMap toFloorMap() {
        String str = this.mapId;
        List<CoordinateResponse> list = this.points;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
        for (CoordinateResponse coordinateResponse : list) {
            arrayList.add(new IndoorCoordinate(coordinateResponse.getX(), coordinateResponse.getY(), 0.0d, 4, (DefaultConstructorMarker) null));
        }
        return new FloorMap(str, arrayList, this.mapName);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorMapResponse(mapId=");
        sb.append(this.mapId);
        sb.append(", points=");
        sb.append(this.points);
        sb.append(", mapName=");
        return me.oriient.internal.infra.rest.e.a(sb, this.mapName, ')');
    }

    public FloorMapResponse(@NotNull String mapId, @NotNull List<CoordinateResponse> points, @NotNull String mapName) {
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(points, "points");
        Intrinsics.h(mapName, "mapName");
        this.mapId = mapId;
        this.points = points;
        this.mapName = mapName;
    }
}
