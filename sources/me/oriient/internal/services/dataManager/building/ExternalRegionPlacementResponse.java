package me.oriient.internal.services.dataManager.building;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0003=<>B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBY\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u00022\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b&\u0010%J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(JP\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\"J\u0010\u0010,\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\"R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b6\u0010%\"\u0004\b7\u00108R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b9\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010(¨\u0006?"}, d2 = {"Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacementResponse;", "", "", "shapeType", "placementId", "", "Lme/oriient/internal/services/dataManager/building/WorldCoordinateResponse;", "points", "entranceIds", "Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;", "properties", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacementResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "buildingId", "Lme/oriient/internal/services/dataManager/building/Entrance;", "allEntrances", "Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacement;", "toPlacement", "(Ljava/lang/String;Ljava/util/List;)Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacement;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;)Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacementResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getShapeType", "getPlacementId", "Ljava/util/List;", "getPoints", "setPoints", "(Ljava/util/List;)V", "getEntranceIds", "Lme/oriient/internal/services/dataManager/building/RegionPlacementFeaturesResponse;", "getProperties", "Companion", "$serializer", "a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class ExternalRegionPlacementResponse {

    @NotNull
    private final List<String> entranceIds;

    @NotNull
    private final String placementId;

    @Nullable
    private List<WorldCoordinateResponse> points;

    @NotNull
    private final RegionPlacementFeaturesResponse properties;

    @NotNull
    private final String shapeType;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(WorldCoordinateResponse$$serializer.INSTANCE), new ArrayListSerializer(StringSerializer.f24821a), null};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacementResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/building/ExternalRegionPlacementResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<ExternalRegionPlacementResponse> serializer() {
            return ExternalRegionPlacementResponse$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a POLYGONAL = new a("POLYGONAL", 0, "polygon");

        @NotNull
        private final String value;

        private static final /* synthetic */ a[] $values() {
            return new a[]{POLYGONAL};
        }

        static {
            a[] aVarArr$values = $values();
            $VALUES = aVarArr$values;
            $ENTRIES = EnumEntriesKt.a(aVarArr$values);
        }

        private a(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    @Deprecated
    public /* synthetic */ ExternalRegionPlacementResponse(int i, String str, String str2, List list, List list2, RegionPlacementFeaturesResponse regionPlacementFeaturesResponse, SerializationConstructorMarker serializationConstructorMarker) {
        if (27 != (i & 27)) {
            PluginExceptionsKt.a(i, 27, ExternalRegionPlacementResponse$$serializer.INSTANCE.getB());
            throw null;
        }
        this.shapeType = str;
        this.placementId = str2;
        if ((i & 4) == 0) {
            this.points = null;
        } else {
            this.points = list;
        }
        this.entranceIds = list2;
        this.properties = regionPlacementFeaturesResponse;
    }

    public static /* synthetic */ ExternalRegionPlacementResponse copy$default(ExternalRegionPlacementResponse externalRegionPlacementResponse, String str, String str2, List list, List list2, RegionPlacementFeaturesResponse regionPlacementFeaturesResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalRegionPlacementResponse.shapeType;
        }
        if ((i & 2) != 0) {
            str2 = externalRegionPlacementResponse.placementId;
        }
        if ((i & 4) != 0) {
            list = externalRegionPlacementResponse.points;
        }
        if ((i & 8) != 0) {
            list2 = externalRegionPlacementResponse.entranceIds;
        }
        if ((i & 16) != 0) {
            regionPlacementFeaturesResponse = externalRegionPlacementResponse.properties;
        }
        RegionPlacementFeaturesResponse regionPlacementFeaturesResponse2 = regionPlacementFeaturesResponse;
        List list3 = list;
        return externalRegionPlacementResponse.copy(str, str2, list3, list2, regionPlacementFeaturesResponse2);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(ExternalRegionPlacementResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.p(serialDesc, 0, self.shapeType);
        output.p(serialDesc, 1, self.placementId);
        if (output.q(serialDesc, 2) || self.points != null) {
            output.w(serialDesc, 2, kSerializerArr[2], self.points);
        }
        output.F(serialDesc, 3, kSerializerArr[3], self.entranceIds);
        output.F(serialDesc, 4, RegionPlacementFeaturesResponse$$serializer.INSTANCE, self.properties);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getShapeType() {
        return this.shapeType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final List<WorldCoordinateResponse> component3() {
        return this.points;
    }

    @NotNull
    public final List<String> component4() {
        return this.entranceIds;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final RegionPlacementFeaturesResponse getProperties() {
        return this.properties;
    }

    @NotNull
    public final ExternalRegionPlacementResponse copy(@NotNull String shapeType, @NotNull String placementId, @Nullable List<WorldCoordinateResponse> points, @NotNull List<String> entranceIds, @NotNull RegionPlacementFeaturesResponse properties) {
        Intrinsics.h(shapeType, "shapeType");
        Intrinsics.h(placementId, "placementId");
        Intrinsics.h(entranceIds, "entranceIds");
        Intrinsics.h(properties, "properties");
        return new ExternalRegionPlacementResponse(shapeType, placementId, points, entranceIds, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalRegionPlacementResponse)) {
            return false;
        }
        ExternalRegionPlacementResponse externalRegionPlacementResponse = (ExternalRegionPlacementResponse) other;
        return Intrinsics.c(this.shapeType, externalRegionPlacementResponse.shapeType) && Intrinsics.c(this.placementId, externalRegionPlacementResponse.placementId) && Intrinsics.c(this.points, externalRegionPlacementResponse.points) && Intrinsics.c(this.entranceIds, externalRegionPlacementResponse.entranceIds) && Intrinsics.c(this.properties, externalRegionPlacementResponse.properties);
    }

    @NotNull
    public final List<String> getEntranceIds() {
        return this.entranceIds;
    }

    @NotNull
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final List<WorldCoordinateResponse> getPoints() {
        return this.points;
    }

    @NotNull
    public final RegionPlacementFeaturesResponse getProperties() {
        return this.properties;
    }

    @NotNull
    public final String getShapeType() {
        return this.shapeType;
    }

    public int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.placementId, this.shapeType.hashCode() * 31, 31);
        List<WorldCoordinateResponse> list = this.points;
        return this.properties.hashCode() + androidx.camera.core.impl.b.d((iA + (list == null ? 0 : list.hashCode())) * 31, 31, this.entranceIds);
    }

    public final void setPoints(@Nullable List<WorldCoordinateResponse> list) {
        this.points = list;
    }

    @NotNull
    public final ExternalRegionPlacement toPlacement(@NotNull String buildingId, @NotNull List<Entrance> allEntrances) {
        Object next;
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(allEntrances, "allEntrances");
        if (!Intrinsics.c(this.shapeType, a.POLYGONAL.getValue())) {
            throw new IllegalArgumentException("Placement of unknown shape " + this.shapeType);
        }
        String str = this.placementId;
        List<String> list = this.entranceIds;
        ArrayList arrayList = new ArrayList();
        for (String str2 : list) {
            Iterator<T> it = allEntrances.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.c(((Entrance) next).getId(), str2)) {
                    break;
                }
            }
            Entrance entrance = (Entrance) next;
            if (entrance != null) {
                arrayList.add(entrance);
            }
        }
        RegionPlacementFeatures features = this.properties.toFeatures();
        List<WorldCoordinateResponse> list2 = this.points;
        Intrinsics.e(list2);
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((WorldCoordinateResponse) it2.next()).toWorldCoordinate());
        }
        return new PolygonalExternalRegionPlacement(str, buildingId, arrayList, features, arrayList2);
    }

    @NotNull
    public String toString() {
        return "ExternalRegionPlacementResponse(shapeType=" + this.shapeType + ", placementId=" + this.placementId + ", points=" + this.points + ", entranceIds=" + this.entranceIds + ", properties=" + this.properties + ')';
    }

    public ExternalRegionPlacementResponse(@NotNull String shapeType, @NotNull String placementId, @Nullable List<WorldCoordinateResponse> list, @NotNull List<String> entranceIds, @NotNull RegionPlacementFeaturesResponse properties) {
        Intrinsics.h(shapeType, "shapeType");
        Intrinsics.h(placementId, "placementId");
        Intrinsics.h(entranceIds, "entranceIds");
        Intrinsics.h(properties, "properties");
        this.shapeType = shapeType;
        this.placementId = placementId;
        this.points = list;
        this.entranceIds = entranceIds;
        this.properties = properties;
    }

    public /* synthetic */ ExternalRegionPlacementResponse(String str, String str2, List list, List list2, RegionPlacementFeaturesResponse regionPlacementFeaturesResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list, list2, regionPlacementFeaturesResponse);
    }
}
