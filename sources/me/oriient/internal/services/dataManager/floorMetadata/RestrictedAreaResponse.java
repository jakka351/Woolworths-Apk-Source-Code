package me.oriient.internal.services.dataManager.floorMetadata;

import androidx.annotation.Keep;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import me.oriient.internal.services.dataManager.common.IndoorCoordinate;
import me.oriient.internal.services.dataManager.floorTransitions.IndoorCoordinateResponse;
import me.oriient.internal.services.dataManager.floorTransitions.IndoorCoordinateResponse$$serializer;
import me.oriient.internal.services.dataManager.region.PlacementResponse;
import me.oriient.internal.services.dataManager.region.RegionShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 ?2\u00020\u0001:\u0002>?B\u008b\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013B\u0089\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\u0002\u0010\u0014J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010(\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0011\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nHÆ\u0003J\u0092\u0001\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0003HÖ\u0001J\n\u00101\u001a\u0004\u0018\u000102H\u0002J\b\u00103\u001a\u0004\u0018\u000104J\t\u00105\u001a\u00020\u0005HÖ\u0001J&\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u00002\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<HÁ\u0001¢\u0006\u0002\b=R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0019\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006@"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse;", "", "seen1", "", "restrictedAreaId", "", "mapId", AppMeasurementSdk.ConditionalUserProperty.NAME, "shapeType", "topRight", "", "", "bottomLeft", "center", "radius", "points", "Lme/oriient/internal/services/dataManager/floorTransitions/IndoorCoordinateResponse;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)V", "getBottomLeft", "()Ljava/util/List;", "getCenter", "getMapId", "()Ljava/lang/String;", "getName", "getPoints", "getRadius", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRestrictedAreaId", "getShapeType", "getTopRight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;)Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse;", "equals", "", "other", "hashCode", "parseShape", "Lme/oriient/internal/services/dataManager/region/RegionShape;", "toRestrictedArea", "Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedArea;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RestrictedAreaResponse {

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
    private final String mapId;

    @Nullable
    private final String name;

    @Nullable
    private final List<IndoorCoordinateResponse> points;

    @Nullable
    private final Double radius;

    @Nullable
    private final String restrictedAreaId;

    @Nullable
    private final String shapeType;

    @Nullable
    private final List<Double> topRight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/floorMetadata/RestrictedAreaResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<RestrictedAreaResponse> serializer() {
            return RestrictedAreaResponse$$serializer.INSTANCE;
        }
    }

    static {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        $childSerializers = new KSerializer[]{null, null, null, null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), null, new ArrayListSerializer(IndoorCoordinateResponse$$serializer.INSTANCE)};
    }

    public RestrictedAreaResponse() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (Double) null, (List) null, 511, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RestrictedAreaResponse copy$default(RestrictedAreaResponse restrictedAreaResponse, String str, String str2, String str3, String str4, List list, List list2, List list3, Double d, List list4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = restrictedAreaResponse.restrictedAreaId;
        }
        if ((i & 2) != 0) {
            str2 = restrictedAreaResponse.mapId;
        }
        if ((i & 4) != 0) {
            str3 = restrictedAreaResponse.name;
        }
        if ((i & 8) != 0) {
            str4 = restrictedAreaResponse.shapeType;
        }
        if ((i & 16) != 0) {
            list = restrictedAreaResponse.topRight;
        }
        if ((i & 32) != 0) {
            list2 = restrictedAreaResponse.bottomLeft;
        }
        if ((i & 64) != 0) {
            list3 = restrictedAreaResponse.center;
        }
        if ((i & 128) != 0) {
            d = restrictedAreaResponse.radius;
        }
        if ((i & 256) != 0) {
            list4 = restrictedAreaResponse.points;
        }
        Double d2 = d;
        List list5 = list4;
        List list6 = list2;
        List list7 = list3;
        List list8 = list;
        String str5 = str3;
        return restrictedAreaResponse.copy(str, str2, str5, str4, list8, list6, list7, d2, list5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    private final RegionShape parseShape() {
        List<Double> list;
        List<Double> list2;
        String str = this.shapeType;
        if (Intrinsics.c(str, PlacementResponse.a.CIRCULAR.getValue())) {
            List<Double> list3 = this.center;
            if (list3 == null || list3.size() != 2 || this.radius == null) {
                return null;
            }
            return new RegionShape.Circle(new IndoorCoordinate(this.center.get(0).doubleValue(), this.center.get(1).doubleValue(), 0.0d, 4, (DefaultConstructorMarker) null), this.radius.doubleValue());
        }
        if (!Intrinsics.c(str, PlacementResponse.a.POLYGONAL.getValue())) {
            if (Intrinsics.c(str, PlacementResponse.a.RECTANGULAR.getValue()) && (list = this.topRight) != null && list.size() == 2 && (list2 = this.bottomLeft) != null && list2.size() == 2) {
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
        Iterator it = list5.iterator();
        while (it.hasNext()) {
            arrayList.add(((IndoorCoordinateResponse) it.next()).toIndoorCoordinate());
        }
        int size = arrayList.size();
        ArrayList arrayListY = arrayList;
        if (size > 1) {
            boolean zC = Intrinsics.c(CollectionsKt.D(arrayList), CollectionsKt.O(arrayList));
            arrayListY = arrayList;
            if (zC) {
                arrayListY = CollectionsKt.y(arrayList);
            }
        }
        return new RegionShape.Polygon(arrayListY);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(RestrictedAreaResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.restrictedAreaId != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.restrictedAreaId);
        }
        if (output.q(serialDesc, 1) || self.mapId != null) {
            output.w(serialDesc, 1, StringSerializer.f24821a, self.mapId);
        }
        if (output.q(serialDesc, 2) || self.name != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.name);
        }
        if (output.q(serialDesc, 3) || self.shapeType != null) {
            output.w(serialDesc, 3, StringSerializer.f24821a, self.shapeType);
        }
        if (output.q(serialDesc, 4) || self.topRight != null) {
            output.w(serialDesc, 4, kSerializerArr[4], self.topRight);
        }
        if (output.q(serialDesc, 5) || self.bottomLeft != null) {
            output.w(serialDesc, 5, kSerializerArr[5], self.bottomLeft);
        }
        if (output.q(serialDesc, 6) || self.center != null) {
            output.w(serialDesc, 6, kSerializerArr[6], self.center);
        }
        if (output.q(serialDesc, 7) || self.radius != null) {
            output.w(serialDesc, 7, DoubleSerializer.f24792a, self.radius);
        }
        if (!output.q(serialDesc, 8) && self.points == null) {
            return;
        }
        output.w(serialDesc, 8, kSerializerArr[8], self.points);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getShapeType() {
        return this.shapeType;
    }

    @Nullable
    public final List<Double> component5() {
        return this.topRight;
    }

    @Nullable
    public final List<Double> component6() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> component7() {
        return this.center;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @Nullable
    public final List<IndoorCoordinateResponse> component9() {
        return this.points;
    }

    @NotNull
    public final RestrictedAreaResponse copy(@Nullable String restrictedAreaId, @Nullable String mapId, @Nullable String name, @Nullable String shapeType, @Nullable List<Double> topRight, @Nullable List<Double> bottomLeft, @Nullable List<Double> center, @Nullable Double radius, @Nullable List<IndoorCoordinateResponse> points) {
        return new RestrictedAreaResponse(restrictedAreaId, mapId, name, shapeType, topRight, bottomLeft, center, radius, points);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RestrictedAreaResponse)) {
            return false;
        }
        RestrictedAreaResponse restrictedAreaResponse = (RestrictedAreaResponse) other;
        return Intrinsics.c(this.restrictedAreaId, restrictedAreaResponse.restrictedAreaId) && Intrinsics.c(this.mapId, restrictedAreaResponse.mapId) && Intrinsics.c(this.name, restrictedAreaResponse.name) && Intrinsics.c(this.shapeType, restrictedAreaResponse.shapeType) && Intrinsics.c(this.topRight, restrictedAreaResponse.topRight) && Intrinsics.c(this.bottomLeft, restrictedAreaResponse.bottomLeft) && Intrinsics.c(this.center, restrictedAreaResponse.center) && Intrinsics.c(this.radius, restrictedAreaResponse.radius) && Intrinsics.c(this.points, restrictedAreaResponse.points);
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
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    public final String getName() {
        return this.name;
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
    public final String getRestrictedAreaId() {
        return this.restrictedAreaId;
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
        String str = this.restrictedAreaId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.mapId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shapeType;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<Double> list = this.topRight;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.bottomLeft;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.center;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Double d = this.radius;
        int iHashCode8 = (iHashCode7 + (d == null ? 0 : d.hashCode())) * 31;
        List<IndoorCoordinateResponse> list4 = this.points;
        return iHashCode8 + (list4 != null ? list4.hashCode() : 0);
    }

    @Nullable
    public final RestrictedArea toRestrictedArea() {
        RegionShape shape;
        if (this.restrictedAreaId == null || this.name == null || (shape = parseShape()) == null) {
            return null;
        }
        return new RestrictedArea(this.restrictedAreaId, this.name, shape);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RestrictedAreaResponse(restrictedAreaId=");
        sb.append(this.restrictedAreaId);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", name=");
        sb.append(this.name);
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
    public /* synthetic */ RestrictedAreaResponse(int i, String str, String str2, String str3, String str4, List list, List list2, List list3, Double d, List list4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.restrictedAreaId = null;
        } else {
            this.restrictedAreaId = str;
        }
        if ((i & 2) == 0) {
            this.mapId = null;
        } else {
            this.mapId = str2;
        }
        if ((i & 4) == 0) {
            this.name = null;
        } else {
            this.name = str3;
        }
        if ((i & 8) == 0) {
            this.shapeType = null;
        } else {
            this.shapeType = str4;
        }
        if ((i & 16) == 0) {
            this.topRight = null;
        } else {
            this.topRight = list;
        }
        if ((i & 32) == 0) {
            this.bottomLeft = null;
        } else {
            this.bottomLeft = list2;
        }
        if ((i & 64) == 0) {
            this.center = null;
        } else {
            this.center = list3;
        }
        if ((i & 128) == 0) {
            this.radius = null;
        } else {
            this.radius = d;
        }
        if ((i & 256) == 0) {
            this.points = null;
        } else {
            this.points = list4;
        }
    }

    public RestrictedAreaResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<Double> list, @Nullable List<Double> list2, @Nullable List<Double> list3, @Nullable Double d, @Nullable List<IndoorCoordinateResponse> list4) {
        this.restrictedAreaId = str;
        this.mapId = str2;
        this.name = str3;
        this.shapeType = str4;
        this.topRight = list;
        this.bottomLeft = list2;
        this.center = list3;
        this.radius = d;
        this.points = list4;
    }

    public /* synthetic */ RestrictedAreaResponse(String str, String str2, String str3, String str4, List list, List list2, List list3, Double d, List list4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, (i & 128) != 0 ? null : d, (i & 256) != 0 ? null : list4);
    }
}
