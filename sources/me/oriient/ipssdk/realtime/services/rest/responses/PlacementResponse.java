package me.oriient.ipssdk.realtime.services.rest.responses;

import androidx.annotation.Keep;
import androidx.compose.ui.input.pointer.a;
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
import me.oriient.ipssdk.base.rest.RestException;
import me.oriient.ipssdk.common.utils.models.PostProcessable;
import me.oriient.ipssdk.realtime.services.rest.ExtensionsKt;
import me.oriient.ipssdk.realtime.utils.models.CircularShape;
import me.oriient.ipssdk.realtime.utils.models.Coordinate;
import me.oriient.ipssdk.realtime.utils.models.PlacementInBuilding;
import me.oriient.ipssdk.realtime.utils.models.PolygonalShape;
import me.oriient.ipssdk.realtime.utils.models.RectangularShape;
import me.oriient.ipssdk.realtime.utils.models.RegionPlacementInBuilding;
import me.oriient.ipssdk.realtime.utils.models.Shape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 _2\u00020\u0001:\u0003^_`B¥\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015B§\u0001\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\u0016J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u00108\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bHÆ\u0003J\u0011\u00109\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010>\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010?\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0011\u0010@\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010/J°\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GHÖ\u0003J\t\u0010H\u001a\u00020\u0003HÖ\u0001J\u0018\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020Lø\u0001\u0000¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u00020P2\u0006\u0010K\u001a\u00020Lø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ\b\u0010S\u001a\u00020TH\u0002J\t\u0010U\u001a\u00020\u0005HÖ\u0001J&\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\\HÁ\u0001¢\u0006\u0002\b]R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0018\"\u0004\b#\u0010\u001aR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b$\u0010\u001e\"\u0004\b%\u0010 R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0018\"\u0004\b-\u0010\u001aR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006a"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse;", "Lme/oriient/ipssdk/common/utils/models/PostProcessable;", "seen1", "", "placementId", "", "floorIndex", "mapId", "clientCategory", "regionType", "topRight", "", "", "bottomLeft", "center", "radius", "points", "Lme/oriient/ipssdk/realtime/services/rest/responses/PointResponse;", "coordinates", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)V", "getBottomLeft", "()Ljava/util/List;", "setBottomLeft", "(Ljava/util/List;)V", "getCenter", "setCenter", "getClientCategory", "()Ljava/lang/Integer;", "setClientCategory", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCoordinates", "setCoordinates", "getFloorIndex", "setFloorIndex", "getMapId", "()Ljava/lang/String;", "setMapId", "(Ljava/lang/String;)V", "getPlacementId", "setPlacementId", "getPoints", "setPoints", "getRadius", "()Ljava/lang/Double;", "setRadius", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getRegionType", "setRegionType", "getTopRight", "setTopRight", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Double;Ljava/util/List;Ljava/util/List;)Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse;", "equals", "", "other", "", "hashCode", "toPlacementInBuilding", "Lme/oriient/ipssdk/realtime/utils/models/PlacementInBuilding;", "buildingId", "Lme/oriient/ipssdk/common/utils/models/BuildingId;", "toPlacementInBuilding-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/realtime/utils/models/PlacementInBuilding;", "toRegionPlacementInBuilding", "Lme/oriient/ipssdk/realtime/utils/models/RegionPlacementInBuilding;", "toRegionPlacementInBuilding-TVSKQeo", "(Ljava/lang/String;)Lme/oriient/ipssdk/realtime/utils/models/RegionPlacementInBuilding;", "toShape", "Lme/oriient/ipssdk/realtime/utils/models/Shape;", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$me_oriient_sdk_realtime", "$serializer", "Companion", "RegionShape", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
@SourceDebugExtension
/* loaded from: classes8.dex */
public final /* data */ class PlacementResponse implements PostProcessable {

    @JvmField
    @NotNull
    private static final KSerializer<Object>[] $childSerializers;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private List<Double> bottomLeft;

    @Nullable
    private List<Double> center;

    @Nullable
    private Integer clientCategory;

    @Nullable
    private List<Double> coordinates;

    @Nullable
    private Integer floorIndex;

    @Nullable
    private String mapId;

    @Nullable
    private String placementId;

    @Nullable
    private List<PointResponse> points;

    @Nullable
    private Double radius;

    @Nullable
    private String regionType;

    @Nullable
    private List<Double> topRight;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final KSerializer<PlacementResponse> serializer() {
            return PlacementResponse$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lme/oriient/ipssdk/realtime/services/rest/responses/PlacementResponse$RegionShape;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "RECTANGULAR", "CIRCULAR", "POLYGONAL", "me.oriient.sdk-realtime"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class RegionShape {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RegionShape[] $VALUES;

        @NotNull
        private final String value;
        public static final RegionShape RECTANGULAR = new RegionShape("RECTANGULAR", 0, "rectangular");
        public static final RegionShape CIRCULAR = new RegionShape("CIRCULAR", 1, "circular");
        public static final RegionShape POLYGONAL = new RegionShape("POLYGONAL", 2, "polygon");

        private static final /* synthetic */ RegionShape[] $values() {
            return new RegionShape[]{RECTANGULAR, CIRCULAR, POLYGONAL};
        }

        static {
            RegionShape[] regionShapeArr$values = $values();
            $VALUES = regionShapeArr$values;
            $ENTRIES = EnumEntriesKt.a(regionShapeArr$values);
        }

        private RegionShape(String str, int i, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<RegionShape> getEntries() {
            return $ENTRIES;
        }

        public static RegionShape valueOf(String str) {
            return (RegionShape) Enum.valueOf(RegionShape.class, str);
        }

        public static RegionShape[] values() {
            return (RegionShape[]) $VALUES.clone();
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    static {
        DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
        $childSerializers = new KSerializer[]{null, null, null, null, null, new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), new ArrayListSerializer(doubleSerializer), null, new ArrayListSerializer(PointResponse$$serializer.INSTANCE), new ArrayListSerializer(doubleSerializer)};
    }

    public PlacementResponse() {
        this((String) null, (Integer) null, (String) null, (Integer) null, (String) null, (List) null, (List) null, (List) null, (Double) null, (List) null, (List) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PlacementResponse copy$default(PlacementResponse placementResponse, String str, Integer num, String str2, Integer num2, String str3, List list, List list2, List list3, Double d, List list4, List list5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = placementResponse.placementId;
        }
        if ((i & 2) != 0) {
            num = placementResponse.floorIndex;
        }
        if ((i & 4) != 0) {
            str2 = placementResponse.mapId;
        }
        if ((i & 8) != 0) {
            num2 = placementResponse.clientCategory;
        }
        if ((i & 16) != 0) {
            str3 = placementResponse.regionType;
        }
        if ((i & 32) != 0) {
            list = placementResponse.topRight;
        }
        if ((i & 64) != 0) {
            list2 = placementResponse.bottomLeft;
        }
        if ((i & 128) != 0) {
            list3 = placementResponse.center;
        }
        if ((i & 256) != 0) {
            d = placementResponse.radius;
        }
        if ((i & 512) != 0) {
            list4 = placementResponse.points;
        }
        if ((i & 1024) != 0) {
            list5 = placementResponse.coordinates;
        }
        List list6 = list4;
        List list7 = list5;
        List list8 = list3;
        Double d2 = d;
        List list9 = list;
        List list10 = list2;
        String str4 = str3;
        String str5 = str2;
        return placementResponse.copy(str, num, str5, num2, str4, list9, list10, list8, d2, list6, list7);
    }

    private final Shape toShape() throws RestException {
        String str = this.regionType;
        if (Intrinsics.c(str, RegionShape.RECTANGULAR.getValue())) {
            List<Double> list = this.topRight;
            Intrinsics.e(list);
            Coordinate coordinate = ExtensionsKt.toCoordinate(list);
            List<Double> list2 = this.bottomLeft;
            Intrinsics.e(list2);
            return new RectangularShape(coordinate, ExtensionsKt.toCoordinate(list2));
        }
        if (Intrinsics.c(str, RegionShape.CIRCULAR.getValue())) {
            List<Double> list3 = this.center;
            Intrinsics.e(list3);
            Coordinate coordinate2 = ExtensionsKt.toCoordinate(list3);
            Double d = this.radius;
            Intrinsics.e(d);
            return new CircularShape(coordinate2, d.doubleValue());
        }
        if (!Intrinsics.c(str, RegionShape.POLYGONAL.getValue())) {
            throw new RestException("Placement of unknown shape " + this.regionType);
        }
        List<PointResponse> list4 = this.points;
        Intrinsics.e(list4);
        ArrayList arrayList = new ArrayList(CollectionsKt.s(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(((PointResponse) it.next()).toCoordinate());
        }
        return new PolygonalShape(arrayList);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$me_oriient_sdk_realtime(PlacementResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.q(serialDesc, 0) || self.placementId != null) {
            output.w(serialDesc, 0, StringSerializer.f24821a, self.placementId);
        }
        if (output.q(serialDesc, 1) || self.floorIndex != null) {
            output.w(serialDesc, 1, IntSerializer.f24800a, self.floorIndex);
        }
        if (output.q(serialDesc, 2) || self.mapId != null) {
            output.w(serialDesc, 2, StringSerializer.f24821a, self.mapId);
        }
        if (output.q(serialDesc, 3) || self.clientCategory != null) {
            output.w(serialDesc, 3, IntSerializer.f24800a, self.clientCategory);
        }
        if (output.q(serialDesc, 4) || self.regionType != null) {
            output.w(serialDesc, 4, StringSerializer.f24821a, self.regionType);
        }
        if (output.q(serialDesc, 5) || self.topRight != null) {
            output.w(serialDesc, 5, kSerializerArr[5], self.topRight);
        }
        if (output.q(serialDesc, 6) || self.bottomLeft != null) {
            output.w(serialDesc, 6, kSerializerArr[6], self.bottomLeft);
        }
        if (output.q(serialDesc, 7) || self.center != null) {
            output.w(serialDesc, 7, kSerializerArr[7], self.center);
        }
        if (output.q(serialDesc, 8) || self.radius != null) {
            output.w(serialDesc, 8, DoubleSerializer.f24792a, self.radius);
        }
        if (output.q(serialDesc, 9) || self.points != null) {
            output.w(serialDesc, 9, kSerializerArr[9], self.points);
        }
        if (!output.q(serialDesc, 10) && self.coordinates == null) {
            return;
        }
        output.w(serialDesc, 10, kSerializerArr[10], self.coordinates);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final List<PointResponse> component10() {
        return this.points;
    }

    @Nullable
    public final List<Double> component11() {
        return this.coordinates;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getFloorIndex() {
        return this.floorIndex;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getClientCategory() {
        return this.clientCategory;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getRegionType() {
        return this.regionType;
    }

    @Nullable
    public final List<Double> component6() {
        return this.topRight;
    }

    @Nullable
    public final List<Double> component7() {
        return this.bottomLeft;
    }

    @Nullable
    public final List<Double> component8() {
        return this.center;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Double getRadius() {
        return this.radius;
    }

    @NotNull
    public final PlacementResponse copy(@Nullable String placementId, @Nullable Integer floorIndex, @Nullable String mapId, @Nullable Integer clientCategory, @Nullable String regionType, @Nullable List<Double> topRight, @Nullable List<Double> bottomLeft, @Nullable List<Double> center, @Nullable Double radius, @Nullable List<PointResponse> points, @Nullable List<Double> coordinates) {
        return new PlacementResponse(placementId, floorIndex, mapId, clientCategory, regionType, topRight, bottomLeft, center, radius, points, coordinates);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlacementResponse)) {
            return false;
        }
        PlacementResponse placementResponse = (PlacementResponse) other;
        return Intrinsics.c(this.placementId, placementResponse.placementId) && Intrinsics.c(this.floorIndex, placementResponse.floorIndex) && Intrinsics.c(this.mapId, placementResponse.mapId) && Intrinsics.c(this.clientCategory, placementResponse.clientCategory) && Intrinsics.c(this.regionType, placementResponse.regionType) && Intrinsics.c(this.topRight, placementResponse.topRight) && Intrinsics.c(this.bottomLeft, placementResponse.bottomLeft) && Intrinsics.c(this.center, placementResponse.center) && Intrinsics.c(this.radius, placementResponse.radius) && Intrinsics.c(this.points, placementResponse.points) && Intrinsics.c(this.coordinates, placementResponse.coordinates);
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
    public final Integer getClientCategory() {
        return this.clientCategory;
    }

    @Nullable
    public final List<Double> getCoordinates() {
        return this.coordinates;
    }

    @Nullable
    public final Integer getFloorIndex() {
        return this.floorIndex;
    }

    @Nullable
    public final String getMapId() {
        return this.mapId;
    }

    @Nullable
    public final String getPlacementId() {
        return this.placementId;
    }

    @Nullable
    public final List<PointResponse> getPoints() {
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
        String str2 = this.mapId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.clientCategory;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.regionType;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Double> list = this.topRight;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<Double> list2 = this.bottomLeft;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Double> list3 = this.center;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Double d = this.radius;
        int iHashCode9 = (iHashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        List<PointResponse> list4 = this.points;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Double> list5 = this.coordinates;
        return iHashCode10 + (list5 != null ? list5.hashCode() : 0);
    }

    public final void setBottomLeft(@Nullable List<Double> list) {
        this.bottomLeft = list;
    }

    public final void setCenter(@Nullable List<Double> list) {
        this.center = list;
    }

    public final void setClientCategory(@Nullable Integer num) {
        this.clientCategory = num;
    }

    public final void setCoordinates(@Nullable List<Double> list) {
        this.coordinates = list;
    }

    public final void setFloorIndex(@Nullable Integer num) {
        this.floorIndex = num;
    }

    public final void setMapId(@Nullable String str) {
        this.mapId = str;
    }

    public final void setPlacementId(@Nullable String str) {
        this.placementId = str;
    }

    public final void setPoints(@Nullable List<PointResponse> list) {
        this.points = list;
    }

    public final void setRadius(@Nullable Double d) {
        this.radius = d;
    }

    public final void setRegionType(@Nullable String str) {
        this.regionType = str;
    }

    public final void setTopRight(@Nullable List<Double> list) {
        this.topRight = list;
    }

    @NotNull
    /* renamed from: toPlacementInBuilding-TVSKQeo, reason: not valid java name */
    public final PlacementInBuilding m472toPlacementInBuildingTVSKQeo(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        List<Double> list = this.coordinates;
        Coordinate coordinateM461toCoordinateInBuildingIDVNPgs = list != null ? ExtensionsKt.m461toCoordinateInBuildingIDVNPgs(list, buildingId) : toShape().getCenter();
        String str = this.placementId;
        Intrinsics.e(str);
        Integer num = this.floorIndex;
        Intrinsics.e(num);
        int iIntValue = num.intValue();
        Integer num2 = this.clientCategory;
        Intrinsics.e(num2);
        PlacementInBuilding placementInBuilding = new PlacementInBuilding(str, iIntValue, coordinateM461toCoordinateInBuildingIDVNPgs, num2.intValue());
        placementInBuilding.buildingId = buildingId;
        return placementInBuilding;
    }

    @NotNull
    /* renamed from: toRegionPlacementInBuilding-TVSKQeo, reason: not valid java name */
    public final RegionPlacementInBuilding m473toRegionPlacementInBuildingTVSKQeo(@NotNull String buildingId) {
        Intrinsics.h(buildingId, "buildingId");
        String str = this.placementId;
        Intrinsics.e(str);
        Integer num = this.floorIndex;
        Intrinsics.e(num);
        RegionPlacementInBuilding regionPlacementInBuilding = new RegionPlacementInBuilding(str, num.intValue(), toShape());
        regionPlacementInBuilding.buildingId = buildingId;
        return regionPlacementInBuilding;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("PlacementResponse(placementId=");
        sb.append(this.placementId);
        sb.append(", floorIndex=");
        sb.append(this.floorIndex);
        sb.append(", mapId=");
        sb.append(this.mapId);
        sb.append(", clientCategory=");
        sb.append(this.clientCategory);
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
        sb.append(this.points);
        sb.append(", coordinates=");
        return a.o(sb, this.coordinates, ')');
    }

    @Deprecated
    public /* synthetic */ PlacementResponse(int i, String str, Integer num, String str2, Integer num2, String str3, List list, List list2, List list3, Double d, List list4, List list5, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.mapId = null;
        } else {
            this.mapId = str2;
        }
        if ((i & 8) == 0) {
            this.clientCategory = null;
        } else {
            this.clientCategory = num2;
        }
        if ((i & 16) == 0) {
            this.regionType = null;
        } else {
            this.regionType = str3;
        }
        if ((i & 32) == 0) {
            this.topRight = null;
        } else {
            this.topRight = list;
        }
        if ((i & 64) == 0) {
            this.bottomLeft = null;
        } else {
            this.bottomLeft = list2;
        }
        if ((i & 128) == 0) {
            this.center = null;
        } else {
            this.center = list3;
        }
        if ((i & 256) == 0) {
            this.radius = null;
        } else {
            this.radius = d;
        }
        if ((i & 512) == 0) {
            this.points = null;
        } else {
            this.points = list4;
        }
        if ((i & 1024) == 0) {
            this.coordinates = null;
        } else {
            this.coordinates = list5;
        }
    }

    public PlacementResponse(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable Integer num2, @Nullable String str3, @Nullable List<Double> list, @Nullable List<Double> list2, @Nullable List<Double> list3, @Nullable Double d, @Nullable List<PointResponse> list4, @Nullable List<Double> list5) {
        this.placementId = str;
        this.floorIndex = num;
        this.mapId = str2;
        this.clientCategory = num2;
        this.regionType = str3;
        this.topRight = list;
        this.bottomLeft = list2;
        this.center = list3;
        this.radius = d;
        this.points = list4;
        this.coordinates = list5;
    }

    public /* synthetic */ PlacementResponse(String str, Integer num, String str2, Integer num2, String str3, List list, List list2, List list3, Double d, List list4, List list5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, (i & 128) != 0 ? null : list3, (i & 256) != 0 ? null : d, (i & 512) != 0 ? null : list4, (i & 1024) != 0 ? null : list5);
    }
}
