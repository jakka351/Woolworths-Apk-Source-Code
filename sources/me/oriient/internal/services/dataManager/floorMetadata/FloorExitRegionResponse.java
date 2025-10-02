package me.oriient.internal.services.dataManager.floorMetadata;

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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.floorTransitions.IndoorCoordinateResponse;
import me.oriient.internal.services.dataManager.floorTransitions.IndoorCoordinateResponse$$serializer;
import me.oriient.internal.services.dataManager.region.RegionShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 =2\u00020\u0001:\u0003>=?Bs\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eBy\b\u0011\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J(\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017HÁ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0018\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010$J|\u0010*\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010!R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010$R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00106\u001a\u0004\b8\u0010$R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b9\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010(R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b<\u0010$¨\u0006@"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegionResponse;", "", "", "exitRegionId", "shapeType", "", "", "topRight", "bottomLeft", "center", "radius", "Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "points", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$internal_publishRelease", "(Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegionResponse;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegion;", "toFloorExitRegion", "()Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegion;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Ljava/lang/Double;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegionResponse;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getExitRegionId", "getShapeType", "Ljava/util/List;", "getTopRight", "getBottomLeft", "getCenter", "Ljava/lang/Double;", "getRadius", "getPoints", "Companion", "$serializer", "a", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class FloorExitRegionResponse {

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
    private final String exitRegionId;

    @Nullable
    private final List<IndoorCoordinateResponse> points;

    @Nullable
    private final Double radius;

    @Nullable
    private final String shapeType;

    @Nullable
    private final List<Double> topRight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegionResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/FloorExitRegionResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<FloorExitRegionResponse> serializer() {
            return FloorExitRegionResponse$$serializer.INSTANCE;
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
        $childSerializers = new KSerializer[]{null, null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), null, new ArrayListSerializer(IndoorCoordinateResponse$$serializer.INSTANCE)};
    }

    public FloorExitRegionResponse() {
        this((String) null, (String) null, (List) null, (List) null, (List) null, (Double) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FloorExitRegionResponse copy$default(FloorExitRegionResponse floorExitRegionResponse, String str, String str2, List list, List list2, List list3, Double d, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = floorExitRegionResponse.exitRegionId;
        }
        if ((i & 2) != 0) {
            str2 = floorExitRegionResponse.shapeType;
        }
        if ((i & 4) != 0) {
            list = floorExitRegionResponse.topRight;
        }
        if ((i & 8) != 0) {
            list2 = floorExitRegionResponse.bottomLeft;
        }
        if ((i & 16) != 0) {
            list3 = floorExitRegionResponse.center;
        }
        if ((i & 32) != 0) {
            d = floorExitRegionResponse.radius;
        }
        if ((i & 64) != 0) {
            list4 = floorExitRegionResponse.points;
        }
        Double d2 = d;
        List list5 = list4;
        List list6 = list3;
        List list7 = list;
        return floorExitRegionResponse.copy(str, str2, list7, list2, list6, d2, list5);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(FloorExitRegionResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.exitRegionId != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.exitRegionId);
        }
        if (output.q(serialDesc, 1) || self.shapeType != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.shapeType);
        }
        if (output.q(serialDesc, 2) || self.topRight != null) {
            output.w(serialDesc, 2, kSerializerArr[2], self.topRight);
        }
        if (output.q(serialDesc, 3) || self.bottomLeft != null) {
            output.w(serialDesc, 3, kSerializerArr[3], self.bottomLeft);
        }
        if (output.q(serialDesc, 4) || self.center != null) {
            output.w(serialDesc, 4, kSerializerArr[4], self.center);
        }
        if (output.q(serialDesc, 5) || self.radius != null) {
            output.w(serialDesc, 5, DoubleSerializer.f24792a, self.radius);
        }
        if (!output.q(serialDesc, 6) && self.points == null) {
            return;
        }
        output.w(serialDesc, 6, kSerializerArr[6], self.points);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getExitRegionId() {
        return this.exitRegionId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getShapeType() {
        return this.shapeType;
    }

    @Nullable
    public final List<Double> component3() {
        return this.topRight;
    }

    @Nullable
    public final List<Double> component4() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> component5() {
        return this.center;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final List<IndoorCoordinateResponse> component7() {
        return this.points;
    }

    @NotNull
    public final FloorExitRegionResponse copy(@Nullable String exitRegionId, @Nullable String shapeType, @Nullable List<Double> topRight, @Nullable List<Double> bottomLeft, @Nullable List<Double> center, @Nullable Double radius, @Nullable List<IndoorCoordinateResponse> points) {
        return new FloorExitRegionResponse(exitRegionId, shapeType, topRight, bottomLeft, center, radius, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FloorExitRegionResponse)) {
            return false;
        }
        FloorExitRegionResponse floorExitRegionResponse = (FloorExitRegionResponse) other;
        return Intrinsics.c(this.exitRegionId, floorExitRegionResponse.exitRegionId) && Intrinsics.c(this.shapeType, floorExitRegionResponse.shapeType) && Intrinsics.c(this.topRight, floorExitRegionResponse.topRight) && Intrinsics.c(this.bottomLeft, floorExitRegionResponse.bottomLeft) && Intrinsics.c(this.center, floorExitRegionResponse.center) && Intrinsics.c(this.radius, floorExitRegionResponse.radius) && Intrinsics.c(this.points, floorExitRegionResponse.points);
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
    public final String getExitRegionId() {
        return this.exitRegionId;
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
    public final String getShapeType() {
        return this.shapeType;
    }

    @Nullable
    public final List<Double> getTopRight() {
        return this.topRight;
    }

    public int hashCode() {
        String str = this.exitRegionId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.shapeType;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Double> list = this.topRight;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.bottomLeft;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.center;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Double d = this.radius;
        int iHashCode6 = (iHashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        List<IndoorCoordinateResponse> list4 = this.points;
        return iHashCode6 + (list4 != null ? list4.hashCode() : 0);
    }

    @Nullable
    public final FloorExitRegion toFloorExitRegion() {
        List<Double> list;
        List<Double> list2;
        if (this.exitRegionId == null) {
            return null;
        }
        String str = this.shapeType;
        if (Intrinsics.c(str, a.CIRCULAR.getValue())) {
            List<Double> list3 = this.center;
            if (list3 == null || list3.size() != 2 || this.radius == null) {
                return null;
            }
            return new FloorExitRegion(this.exitRegionId, new RegionShape.Circle(new IndoorCoordinate(this.center.get(0).doubleValue(), this.center.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null), this.radius.doubleValue()));
        }
        if (!Intrinsics.c(str, a.POLYGONAL.getValue())) {
            if (Intrinsics.c(str, a.RECTANGULAR.getValue()) && (list = this.topRight) != null && list.size() == 2 && (list2 = this.bottomLeft) != null && list2.size() == 2) {
                return new FloorExitRegion(this.exitRegionId, new RegionShape.Rectangle(new IndoorCoordinate(this.topRight.get(0).doubleValue(), this.topRight.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null), new IndoorCoordinate(this.bottomLeft.get(0).doubleValue(), this.bottomLeft.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null)));
            }
            return null;
        }
        List<IndoorCoordinateResponse> list4 = this.points;
        if (list4 == null || list4.isEmpty()) {
            return null;
        }
        String str2 = this.exitRegionId;
        List<IndoorCoordinateResponse> list5 = this.points;
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list5, 10));
        Iterator<T> it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndoorCoordinateResponse) it.next()).toIndoorCoordinate());
        }
        return new FloorExitRegion(str2, new RegionShape.Polygon(arrayList));
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("FloorExitRegionResponse(exitRegionId=");
        sb.append(this.exitRegionId);
        sb.append(", shapeType=");
        sb.append(this.shapeType);
        sb.append(", topRight=");
        sb.append(this.topRight);
        sb.append(", bottomLeft=");
        sb.append(this.bottomLeft);
        sb.append(", center=");
        sb.append(this.center);
        sb.append(", radius=");
        sb.append(this.radius);
        sb.append(", points=");
        return me.oriient.internal.services.auth.rest.m.a(sb, this.points, ')');
    }

    @Deprecated
    public /* synthetic */ FloorExitRegionResponse(int i, String str, String str2, List list, List list2, List list3, Double d, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.exitRegionId = null;
        } else {
            this.exitRegionId = str;
        }
        if ((i & 2) == 0) {
            this.shapeType = null;
        } else {
            this.shapeType = str2;
        }
        if ((i & 4) == 0) {
            this.topRight = null;
        } else {
            this.topRight = list;
        }
        if ((i & 8) == 0) {
            this.bottomLeft = null;
        } else {
            this.bottomLeft = list2;
        }
        if ((i & 16) == 0) {
            this.center = null;
        } else {
            this.center = list3;
        }
        if ((i & 32) == 0) {
            this.radius = null;
        } else {
            this.radius = d;
        }
        if ((i & 64) == 0) {
            this.points = null;
        } else {
            this.points = list4;
        }
    }

    public FloorExitRegionResponse(@Nullable String str, @Nullable String str2, @Nullable List<Double> list, @Nullable List<Double> list2, @Nullable List<Double> list3, @Nullable Double d, @Nullable List<IndoorCoordinateResponse> list4) {
        this.exitRegionId = str;
        this.shapeType = str2;
        this.topRight = list;
        this.bottomLeft = list2;
        this.center = list3;
        this.radius = d;
        this.points = list4;
    }

    public /* synthetic */ FloorExitRegionResponse(String str, String str2, List list, List list2, List list3, Double d, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : d, (i & 64) != 0 ? null : list4);
    }
}
