package me.oriient.internal.services.dataManager.region;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.auth.rest.m;
import me.oriient.internal.services.dataManager.building.BuildingId;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.floorTransitions.IndoorCoordinateResponse;
import me.oriient.internal.services.dataManager.floorTransitions.IndoorCoordinateResponse$$serializer;
import me.oriient.internal.services.dataManager.region.RegionShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0081\b\u0018\u0000 G2\u00020\u0001:\u0003HGIB\u007f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u0083\u0001\b\u0011\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J(\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bHÁ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010'J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b-\u0010,J\u0018\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b.\u0010,J\u0012\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b1\u0010,J\u0088\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b4\u0010'J\u0010\u00105\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010)R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b?\u0010'R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010,R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\bB\u0010,R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bC\u0010,R\u0019\u0010\f\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u00100R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bF\u0010,¨\u0006J"}, d2 = {"Lme/oriient/internal/services/dataManager/region/PlacementResponse;", "", "", "placementId", "", "floorIndex", "regionType", "", "", "topRight", "bottomLeft", "center", "radius", "Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "points", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)V", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "parseShape", "()Lme/oriient/internal/services/dataManager/region/RegionShape;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/dataManager/region/PlacementResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lme/oriient/internal/services/dataManager/building/BuildingId;", "buildingId", "Lme/oriient/internal/services/dataManager/region/BuildingRegionPlacement;", "toBuildingRegionPlacement", "(Lme/oriient/internal/services/dataManager/building/BuildingId;)Lme/oriient/internal/services/dataManager/region/BuildingRegionPlacement;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "component7", "()Ljava/lang/Double;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)Lme/oriient/internal/services/dataManager/region/PlacementResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlacementId", "Ljava/lang/Integer;", "getFloorIndex", "getRegionType", "Ljava/util/List;", "getTopRight", "getBottomLeft", "getCenter", "Ljava/lang/Double;", "getRadius", "getPoints", "Companion", "$serializer", "a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class PlacementResponse {

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @Nullable
    private final List<Double> bottomLeft;

    @Nullable
    private final List<Double> center;

    @Nullable
    private final Integer floorIndex;

    @Nullable
    private final String placementId;

    @Nullable
    private final List<IndoorCoordinateResponse> points;

    @Nullable
    private final Double radius;

    @Nullable
    private final String regionType;

    @Nullable
    private final List<Double> topRight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/region/PlacementResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/region/PlacementResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<PlacementResponse> serializer() {
            return PlacementResponse$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @NotNull
        private final String value;
        public static final a RECTANGULAR = new a("RECTANGULAR", 0, "rectangular");
        public static final a CIRCULAR = new a("CIRCULAR", 1, "circular");
        public static final a POLYGONAL = new a("POLYGONAL", 2, "polygon");

        private static final /* synthetic */ a[] $values() {
            return new a[]{RECTANGULAR, CIRCULAR, POLYGONAL};
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

    static {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        $childSerializers = new KSerializer[]{null, null, null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), null, new ArrayListSerializer(IndoorCoordinateResponse$$serializer.INSTANCE)};
    }

    public PlacementResponse() {
        this((String) null, (Integer) null, (String) null, (List) null, (List) null, (List) null, (Double) null, (List) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PlacementResponse copy$default(PlacementResponse placementResponse, String str, Integer num, String str2, List list, List list2, List list3, Double d, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placementResponse.placementId;
        }
        if ((i & 2) != 0) {
            num = placementResponse.floorIndex;
        }
        if ((i & 4) != 0) {
            str2 = placementResponse.regionType;
        }
        if ((i & 8) != 0) {
            list = placementResponse.topRight;
        }
        if ((i & 16) != 0) {
            list2 = placementResponse.bottomLeft;
        }
        if ((i & 32) != 0) {
            list3 = placementResponse.center;
        }
        if ((i & 64) != 0) {
            d = placementResponse.radius;
        }
        if ((i & 128) != 0) {
            list4 = placementResponse.points;
        }
        Double d2 = d;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        return placementResponse.copy(str, num, str2, list, list6, list7, d2, list5);
    }

    private final RegionShape parseShape() {
        List<Double> list;
        List<Double> list2;
        String str = this.regionType;
        if (Intrinsics.c(str, a.CIRCULAR.getValue())) {
            List<Double> list3 = this.center;
            if (list3 == null || list3.size() != 2 || this.radius == null) {
                return null;
            }
            return new RegionShape.Circle(new IndoorCoordinate(this.center.get(0).doubleValue(), this.center.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null), this.radius.doubleValue());
        }
        if (!Intrinsics.c(str, a.POLYGONAL.getValue())) {
            if (Intrinsics.c(str, a.RECTANGULAR.getValue()) && (list = this.topRight) != null && list.size() == 2 && (list2 = this.bottomLeft) != null && list2.size() == 2) {
                return new RegionShape.Rectangle(new IndoorCoordinate(this.topRight.get(0).doubleValue(), this.topRight.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null), new IndoorCoordinate(this.bottomLeft.get(0).doubleValue(), this.bottomLeft.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null));
            }
            return null;
        }
        List<IndoorCoordinateResponse> list4 = this.points;
        if (list4 == null || list4.isEmpty()) {
            return null;
        }
        List<IndoorCoordinateResponse> list5 = this.points;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list5, 10));
        Iterator<T> it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndoorCoordinateResponse) it.next()).toIndoorCoordinate());
        }
        return new RegionShape.Polygon(arrayList);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(PlacementResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.placementId != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.placementId);
        }
        if (output.q(serialDesc, 1) || self.floorIndex != null) {
            output.w(serialDesc, 1, IntSerializer.f24800a, self.floorIndex);
        }
        if (output.q(serialDesc, 2) || self.regionType != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.regionType);
        }
        if (output.q(serialDesc, 3) || self.topRight != null) {
            output.w(serialDesc, 3, kSerializerArr[3], self.topRight);
        }
        if (output.q(serialDesc, 4) || self.bottomLeft != null) {
            output.w(serialDesc, 4, kSerializerArr[4], self.bottomLeft);
        }
        if (output.q(serialDesc, 5) || self.center != null) {
            output.w(serialDesc, 5, kSerializerArr[5], self.center);
        }
        if (output.q(serialDesc, 6) || self.radius != null) {
            output.w(serialDesc, 6, DoubleSerializer.f24792a, self.radius);
        }
        if (!output.q(serialDesc, 7) && self.points == null) {
            return;
        }
        output.w(serialDesc, 7, kSerializerArr[7], self.points);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getFloorIndex() {
        return this.floorIndex;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRegionType() {
        return this.regionType;
    }

    @Nullable
    public final List<Double> component4() {
        return this.topRight;
    }

    @Nullable
    public final List<Double> component5() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> component6() {
        return this.center;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final List<IndoorCoordinateResponse> component8() {
        return this.points;
    }

    @NotNull
    public final PlacementResponse copy(@Nullable String placementId, @Nullable Integer floorIndex, @Nullable String regionType, @Nullable List<Double> topRight, @Nullable List<Double> bottomLeft, @Nullable List<Double> center, @Nullable Double radius, @Nullable List<IndoorCoordinateResponse> points) {
        return new PlacementResponse(placementId, floorIndex, regionType, topRight, bottomLeft, center, radius, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacementResponse)) {
            return false;
        }
        PlacementResponse placementResponse = (PlacementResponse) other;
        return Intrinsics.c(this.placementId, placementResponse.placementId) && Intrinsics.c(this.floorIndex, placementResponse.floorIndex) && Intrinsics.c(this.regionType, placementResponse.regionType) && Intrinsics.c(this.topRight, placementResponse.topRight) && Intrinsics.c(this.bottomLeft, placementResponse.bottomLeft) && Intrinsics.c(this.center, placementResponse.center) && Intrinsics.c(this.radius, placementResponse.radius) && Intrinsics.c(this.points, placementResponse.points);
    }

    @Nullable
    public final List<Double> getBottomLeft() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> getCenter() {
        return this.center;
    }

    @Nullable
    public final Integer getFloorIndex() {
        return this.floorIndex;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final List<IndoorCoordinateResponse> getPoints() {
        return this.points;
    }

    @Nullable
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final String getRegionType() {
        return this.regionType;
    }

    @Nullable
    public final List<Double> getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        String str = this.placementId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.floorIndex;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.regionType;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Double> list = this.topRight;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.bottomLeft;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.center;
        int iHashCode6 = (iHashCode5 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Double d = this.radius;
        int iHashCode7 = (iHashCode6 + (d == null ? 0 : d.hashCode())) * 31;
        List<IndoorCoordinateResponse> list4 = this.points;
        return iHashCode7 + (list4 != null ? list4.hashCode() : 0);
    }

    @Nullable
    public final BuildingRegionPlacement toBuildingRegionPlacement(@NotNull BuildingId buildingId) {
        RegionShape shape;
        Intrinsics.h(buildingId, "buildingId");
        if (this.placementId == null || this.floorIndex == null || (shape = parseShape()) == null) {
            return null;
        }
        return new BuildingRegionPlacement(this.placementId, buildingId, this.floorIndex.intValue(), shape);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlacementResponse(placementId=");
        sb.append(this.placementId);
        sb.append(", floorIndex=");
        sb.append(this.floorIndex);
        sb.append(", regionType=");
        sb.append(this.regionType);
        sb.append(", topRight=");
        sb.append(this.topRight);
        sb.append(", bottomLeft=");
        sb.append(this.bottomLeft);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", points=");
        return m.a(sb, this.points, ')');
    }

    @Deprecated
    public /* synthetic */ PlacementResponse(int i, String str, Integer num, String str2, List list, List list2, List list3, Double d, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.placementId = null;
        } else {
            this.placementId = str;
        }
        if ((i & 2) == 0) {
            this.floorIndex = null;
        } else {
            this.floorIndex = num;
        }
        if ((i & 4) == 0) {
            this.regionType = null;
        } else {
            this.regionType = str2;
        }
        if ((i & 8) == 0) {
            this.topRight = null;
        } else {
            this.topRight = list;
        }
        if ((i & 16) == 0) {
            this.bottomLeft = null;
        } else {
            this.bottomLeft = list2;
        }
        if ((i & 32) == 0) {
            this.center = null;
        } else {
            this.center = list3;
        }
        if ((i & 64) == 0) {
            this.radius = null;
        } else {
            this.radius = d;
        }
        if ((i & 128) == 0) {
            this.points = null;
        } else {
            this.points = list4;
        }
    }

    public PlacementResponse(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable List<Double> list, @Nullable List<Double> list2, @Nullable List<Double> list3, @Nullable Double d, @Nullable List<IndoorCoordinateResponse> list4) {
        this.placementId = str;
        this.floorIndex = num;
        this.regionType = str2;
        this.topRight = list;
        this.bottomLeft = list2;
        this.center = list3;
        this.radius = d;
        this.points = list4;
    }

    public /* synthetic */ PlacementResponse(String str, Integer num, String str2, List list, List list2, List list3, Double d, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, (i & 64) != 0 ? null : d, (i & 128) != 0 ? null : list4);
    }
}
