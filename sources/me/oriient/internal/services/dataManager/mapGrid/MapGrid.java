package me.oriient.internal.services.dataManager.mapGrid;

import androidx.annotation.Keep;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.ShortSerializer;
import me.oriient.internal.services.dataManager.utils.MatLabArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0003!\"#B-\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fHÁ\u0001¢\u0006\u0002\b R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid;", "", "seen1", "", "record", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "mapGridData", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;)V", "getMapGridData", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;", "getRecord", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridRecord;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "MapGridData", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class MapGrid {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final MapGridData mapGridData;

    @NotNull
    private final MapGridRecord record;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MapGrid> serializer() {
            return MapGrid$$serializer.INSTANCE;
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0007MNOPQRSB\u008d\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aBi\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u001bJ\t\u00102\u001a\u00020\u0005HÆ\u0003J\t\u00103\u001a\u00020\u0015HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010!J\t\u00106\u001a\u00020\u0007HÆ\u0003J\t\u00107\u001a\u00020\tHÆ\u0003J\t\u00108\u001a\u00020\tHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\t\u0010:\u001a\u00020\u000eHÆ\u0003J\t\u0010;\u001a\u00020\u000eHÆ\u0003J\t\u0010<\u001a\u00020\u0011HÆ\u0003J\t\u0010=\u001a\u00020\u0013HÆ\u0003J\u008a\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010?J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010C\u001a\u00020\u0003HÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001J&\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KHÁ\u0001¢\u0006\u0002\bLR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010*R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b1\u0010!¨\u0006T"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;", "", "seen1", "", "mapId", "", "mgrid", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;", "mgridxqRange", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;", "mgridyqRange", "mgridcoarse", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;", "mgridcoarsexqRange", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;", "mgridcoarseyqRange", "gmmpdf", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;", "Done", "", "plmVersion", "", "majorVersion", "version", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;BDLjava/lang/Double;Ljava/lang/Double;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;BDLjava/lang/Double;Ljava/lang/Double;)V", "getDone", "()B", "getGmmpdf", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;", "getMajorVersion", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getMapId", "()Ljava/lang/String;", "getMgrid", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;", "getMgridcoarse", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;", "getMgridcoarsexqRange", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;", "getMgridcoarseyqRange", "getMgridxqRange", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;", "getMgridyqRange", "getPlmVersion", "()D", "getVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;BDLjava/lang/Double;Ljava/lang/Double;)Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "CoarseGrid", "CoarseRange", "Companion", "GmmPdf", "Grid", "Range", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MapGridData {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        private final byte Done;

        @NotNull
        private final GmmPdf gmmpdf;

        @Nullable
        private final Double majorVersion;

        @NotNull
        private final String mapId;

        @NotNull
        private final Grid mgrid;

        @NotNull
        private final CoarseGrid mgridcoarse;

        @NotNull
        private final CoarseRange mgridcoarsexqRange;

        @NotNull
        private final CoarseRange mgridcoarseyqRange;

        @NotNull
        private final Range mgridxqRange;

        @NotNull
        private final Range mgridyqRange;
        private final double plmVersion;

        @Nullable
        private final Double version;

        @Keep
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;", "", "seen1", "", "mx", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "my", "mz", "d", "res", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;D)V", "getD", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMx", "getMy", "getMz", "getRes", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class CoarseGrid {

            @JvmField
            @NotNull
            private static final KSerializer<Object>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            private final MatLabArray<Short> d;

            @NotNull
            private final MatLabArray<Short> mx;

            @NotNull
            private final MatLabArray<Short> my;

            @NotNull
            private final MatLabArray<Short> mz;
            private final double res;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseGrid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<CoarseGrid> serializer() {
                    return MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                ShortSerializer shortSerializer = ShortSerializer.f24820a;
                $childSerializers = new KSerializer[]{companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), null};
            }

            @Deprecated
            public /* synthetic */ CoarseGrid(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptionsKt.a(i, 31, MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.mx = matLabArray;
                this.my = matLabArray2;
                this.mz = matLabArray3;
                this.d = matLabArray4;
                this.res = d;
            }

            public static /* synthetic */ CoarseGrid copy$default(CoarseGrid coarseGrid, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    matLabArray = coarseGrid.mx;
                }
                if ((i & 2) != 0) {
                    matLabArray2 = coarseGrid.my;
                }
                if ((i & 4) != 0) {
                    matLabArray3 = coarseGrid.mz;
                }
                if ((i & 8) != 0) {
                    matLabArray4 = coarseGrid.d;
                }
                if ((i & 16) != 0) {
                    d = coarseGrid.res;
                }
                double d2 = d;
                return coarseGrid.copy(matLabArray, matLabArray2, matLabArray3, matLabArray4, d2);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(CoarseGrid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.mx);
                output.F(serialDesc, 1, kSerializerArr[1], self.my);
                output.F(serialDesc, 2, kSerializerArr[2], self.mz);
                output.F(serialDesc, 3, kSerializerArr[3], self.d);
                output.G(serialDesc, 4, self.res);
            }

            @NotNull
            public final MatLabArray<Short> component1() {
                return this.mx;
            }

            @NotNull
            public final MatLabArray<Short> component2() {
                return this.my;
            }

            @NotNull
            public final MatLabArray<Short> component3() {
                return this.mz;
            }

            @NotNull
            public final MatLabArray<Short> component4() {
                return this.d;
            }

            /* renamed from: component5, reason: from getter */
            public final double getRes() {
                return this.res;
            }

            @NotNull
            public final CoarseGrid copy(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double res) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                return new CoarseGrid(mx, my, mz, d, res);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CoarseGrid)) {
                    return false;
                }
                CoarseGrid coarseGrid = (CoarseGrid) other;
                return Intrinsics.c(this.mx, coarseGrid.mx) && Intrinsics.c(this.my, coarseGrid.my) && Intrinsics.c(this.mz, coarseGrid.mz) && Intrinsics.c(this.d, coarseGrid.d) && Double.compare(this.res, coarseGrid.res) == 0;
            }

            @NotNull
            public final MatLabArray<Short> getD() {
                return this.d;
            }

            @NotNull
            public final MatLabArray<Short> getMx() {
                return this.mx;
            }

            @NotNull
            public final MatLabArray<Short> getMy() {
                return this.my;
            }

            @NotNull
            public final MatLabArray<Short> getMz() {
                return this.mz;
            }

            public final double getRes() {
                return this.res;
            }

            public int hashCode() {
                return Double.hashCode(this.res) + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.d, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.mz, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.my, this.mx.hashCode() * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("CoarseGrid(mx=");
                sb.append(this.mx);
                sb.append(", my=");
                sb.append(this.my);
                sb.append(", mz=");
                sb.append(this.mz);
                sb.append(", d=");
                sb.append(this.d);
                sb.append(", res=");
                return me.oriient.internal.services.dataManager.building.E.a(sb, this.res, ')');
            }

            public CoarseGrid(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double d2) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                this.mx = mx;
                this.my = my;
                this.mz = mz;
                this.d = d;
                this.res = d2;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<MapGridData> serializer() {
                return MapGrid$MapGridData$$serializer.INSTANCE;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J3\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;", "", "seen1", "", "r", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "w", "std", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;D)V", "getR", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getStd", "()D", "getW", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class GmmPdf {

            @JvmField
            @NotNull
            private static final KSerializer<Object>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            private final MatLabArray<Double> r;
            private final double std;

            @NotNull
            private final MatLabArray<Double> w;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$GmmPdf;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<GmmPdf> serializer() {
                    return MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
                $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer), null};
            }

            @Deprecated
            public /* synthetic */ GmmPdf(int i, MatLabArray matLabArray, MatLabArray matLabArray2, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptionsKt.a(i, 7, MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.r = matLabArray;
                this.w = matLabArray2;
                this.std = d;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GmmPdf copy$default(GmmPdf gmmPdf, MatLabArray matLabArray, MatLabArray matLabArray2, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    matLabArray = gmmPdf.r;
                }
                if ((i & 2) != 0) {
                    matLabArray2 = gmmPdf.w;
                }
                if ((i & 4) != 0) {
                    d = gmmPdf.std;
                }
                return gmmPdf.copy(matLabArray, matLabArray2, d);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(GmmPdf self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.r);
                output.F(serialDesc, 1, kSerializerArr[1], self.w);
                output.G(serialDesc, 2, self.std);
            }

            @NotNull
            public final MatLabArray<Double> component1() {
                return this.r;
            }

            @NotNull
            public final MatLabArray<Double> component2() {
                return this.w;
            }

            /* renamed from: component3, reason: from getter */
            public final double getStd() {
                return this.std;
            }

            @NotNull
            public final GmmPdf copy(@NotNull MatLabArray<Double> r, @NotNull MatLabArray<Double> w, double std) {
                Intrinsics.h(r, "r");
                Intrinsics.h(w, "w");
                return new GmmPdf(r, w, std);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GmmPdf)) {
                    return false;
                }
                GmmPdf gmmPdf = (GmmPdf) other;
                return Intrinsics.c(this.r, gmmPdf.r) && Intrinsics.c(this.w, gmmPdf.w) && Double.compare(this.std, gmmPdf.std) == 0;
            }

            @NotNull
            public final MatLabArray<Double> getR() {
                return this.r;
            }

            public final double getStd() {
                return this.std;
            }

            @NotNull
            public final MatLabArray<Double> getW() {
                return this.w;
            }

            public int hashCode() {
                return Double.hashCode(this.std) + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.w, this.r.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("GmmPdf(r=");
                sb.append(this.r);
                sb.append(", w=");
                sb.append(this.w);
                sb.append(", std=");
                return me.oriient.internal.services.dataManager.building.E.a(sb, this.std, ')');
            }

            public GmmPdf(@NotNull MatLabArray<Double> r, @NotNull MatLabArray<Double> w, double d) {
                Intrinsics.h(r, "r");
                Intrinsics.h(w, "w");
                this.r = r;
                this.w = w;
                this.std = d;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,Ba\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003JS\u0010\u001c\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006-"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;", "", "seen1", "", "mx", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "my", "mz", "d", "res", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;D)V", "getD", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMx", "getMy", "getMz", "getRes", "()D", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Grid {

            @JvmField
            @NotNull
            private static final KSerializer<Object>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            private final MatLabArray<Short> d;

            @NotNull
            private final MatLabArray<Short> mx;

            @NotNull
            private final MatLabArray<Short> my;

            @NotNull
            private final MatLabArray<Short> mz;
            private final double res;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Grid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<Grid> serializer() {
                    return MapGrid$MapGridData$Grid$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                ShortSerializer shortSerializer = ShortSerializer.f24820a;
                $childSerializers = new KSerializer[]{companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), null};
            }

            @Deprecated
            public /* synthetic */ Grid(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptionsKt.a(i, 31, MapGrid$MapGridData$Grid$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.mx = matLabArray;
                this.my = matLabArray2;
                this.mz = matLabArray3;
                this.d = matLabArray4;
                this.res = d;
            }

            public static /* synthetic */ Grid copy$default(Grid grid, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    matLabArray = grid.mx;
                }
                if ((i & 2) != 0) {
                    matLabArray2 = grid.my;
                }
                if ((i & 4) != 0) {
                    matLabArray3 = grid.mz;
                }
                if ((i & 8) != 0) {
                    matLabArray4 = grid.d;
                }
                if ((i & 16) != 0) {
                    d = grid.res;
                }
                double d2 = d;
                return grid.copy(matLabArray, matLabArray2, matLabArray3, matLabArray4, d2);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(Grid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.mx);
                output.F(serialDesc, 1, kSerializerArr[1], self.my);
                output.F(serialDesc, 2, kSerializerArr[2], self.mz);
                output.F(serialDesc, 3, kSerializerArr[3], self.d);
                output.G(serialDesc, 4, self.res);
            }

            @NotNull
            public final MatLabArray<Short> component1() {
                return this.mx;
            }

            @NotNull
            public final MatLabArray<Short> component2() {
                return this.my;
            }

            @NotNull
            public final MatLabArray<Short> component3() {
                return this.mz;
            }

            @NotNull
            public final MatLabArray<Short> component4() {
                return this.d;
            }

            /* renamed from: component5, reason: from getter */
            public final double getRes() {
                return this.res;
            }

            @NotNull
            public final Grid copy(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double res) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                return new Grid(mx, my, mz, d, res);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Grid)) {
                    return false;
                }
                Grid grid = (Grid) other;
                return Intrinsics.c(this.mx, grid.mx) && Intrinsics.c(this.my, grid.my) && Intrinsics.c(this.mz, grid.mz) && Intrinsics.c(this.d, grid.d) && Double.compare(this.res, grid.res) == 0;
            }

            @NotNull
            public final MatLabArray<Short> getD() {
                return this.d;
            }

            @NotNull
            public final MatLabArray<Short> getMx() {
                return this.mx;
            }

            @NotNull
            public final MatLabArray<Short> getMy() {
                return this.my;
            }

            @NotNull
            public final MatLabArray<Short> getMz() {
                return this.mz;
            }

            public final double getRes() {
                return this.res;
            }

            public int hashCode() {
                return Double.hashCode(this.res) + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.d, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.mz, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.my, this.mx.hashCode() * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Grid(mx=");
                sb.append(this.mx);
                sb.append(", my=");
                sb.append(this.my);
                sb.append(", mz=");
                sb.append(this.mz);
                sb.append(", d=");
                sb.append(this.d);
                sb.append(", res=");
                return me.oriient.internal.services.dataManager.building.E.a(sb, this.res, ')');
            }

            public Grid(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, double d2) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                this.mx = mx;
                this.my = my;
                this.mz = mz;
                this.d = d;
                this.res = d2;
            }
        }

        @Deprecated
        public /* synthetic */ MapGridData(int i, String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, byte b, double d, Double d2, Double d3, SerializationConstructorMarker serializationConstructorMarker) {
            if (4095 != (i & l3.b)) {
                PluginExceptionsKt.a(i, l3.b, MapGrid$MapGridData$$serializer.INSTANCE.getB());
                throw null;
            }
            this.mapId = str;
            this.mgrid = grid;
            this.mgridxqRange = range;
            this.mgridyqRange = range2;
            this.mgridcoarse = coarseGrid;
            this.mgridcoarsexqRange = coarseRange;
            this.mgridcoarseyqRange = coarseRange2;
            this.gmmpdf = gmmPdf;
            this.Done = b;
            this.plmVersion = d;
            this.majorVersion = d2;
            this.version = d3;
        }

        public static /* synthetic */ MapGridData copy$default(MapGridData mapGridData, String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, byte b, double d, Double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mapGridData.mapId;
            }
            return mapGridData.copy(str, (i & 2) != 0 ? mapGridData.mgrid : grid, (i & 4) != 0 ? mapGridData.mgridxqRange : range, (i & 8) != 0 ? mapGridData.mgridyqRange : range2, (i & 16) != 0 ? mapGridData.mgridcoarse : coarseGrid, (i & 32) != 0 ? mapGridData.mgridcoarsexqRange : coarseRange, (i & 64) != 0 ? mapGridData.mgridcoarseyqRange : coarseRange2, (i & 128) != 0 ? mapGridData.gmmpdf : gmmPdf, (i & 256) != 0 ? mapGridData.Done : b, (i & 512) != 0 ? mapGridData.plmVersion : d, (i & 1024) != 0 ? mapGridData.majorVersion : d2, (i & 2048) != 0 ? mapGridData.version : d3);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(MapGridData self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.p(serialDesc, 0, self.mapId);
            output.F(serialDesc, 1, MapGrid$MapGridData$Grid$$serializer.INSTANCE, self.mgrid);
            MapGrid$MapGridData$Range$$serializer mapGrid$MapGridData$Range$$serializer = MapGrid$MapGridData$Range$$serializer.INSTANCE;
            output.F(serialDesc, 2, mapGrid$MapGridData$Range$$serializer, self.mgridxqRange);
            output.F(serialDesc, 3, mapGrid$MapGridData$Range$$serializer, self.mgridyqRange);
            output.F(serialDesc, 4, MapGrid$MapGridData$CoarseGrid$$serializer.INSTANCE, self.mgridcoarse);
            MapGrid$MapGridData$CoarseRange$$serializer mapGrid$MapGridData$CoarseRange$$serializer = MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE;
            output.F(serialDesc, 5, mapGrid$MapGridData$CoarseRange$$serializer, self.mgridcoarsexqRange);
            output.F(serialDesc, 6, mapGrid$MapGridData$CoarseRange$$serializer, self.mgridcoarseyqRange);
            output.F(serialDesc, 7, MapGrid$MapGridData$GmmPdf$$serializer.INSTANCE, self.gmmpdf);
            output.k(serialDesc, 8, self.Done);
            output.G(serialDesc, 9, self.plmVersion);
            DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
            output.w(serialDesc, 10, doubleSerializer, self.majorVersion);
            output.w(serialDesc, 11, doubleSerializer, self.version);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMapId() {
            return this.mapId;
        }

        /* renamed from: component10, reason: from getter */
        public final double getPlmVersion() {
            return this.plmVersion;
        }

        @Nullable
        /* renamed from: component11, reason: from getter */
        public final Double getMajorVersion() {
            return this.majorVersion;
        }

        @Nullable
        /* renamed from: component12, reason: from getter */
        public final Double getVersion() {
            return this.version;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Grid getMgrid() {
            return this.mgrid;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Range getMgridxqRange() {
            return this.mgridxqRange;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Range getMgridyqRange() {
            return this.mgridyqRange;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final CoarseGrid getMgridcoarse() {
            return this.mgridcoarse;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final CoarseRange getMgridcoarsexqRange() {
            return this.mgridcoarsexqRange;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final CoarseRange getMgridcoarseyqRange() {
            return this.mgridcoarseyqRange;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final GmmPdf getGmmpdf() {
            return this.gmmpdf;
        }

        /* renamed from: component9, reason: from getter */
        public final byte getDone() {
            return this.Done;
        }

        @NotNull
        public final MapGridData copy(@NotNull String mapId, @NotNull Grid mgrid, @NotNull Range mgridxqRange, @NotNull Range mgridyqRange, @NotNull CoarseGrid mgridcoarse, @NotNull CoarseRange mgridcoarsexqRange, @NotNull CoarseRange mgridcoarseyqRange, @NotNull GmmPdf gmmpdf, byte Done, double plmVersion, @Nullable Double majorVersion, @Nullable Double version) {
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(mgrid, "mgrid");
            Intrinsics.h(mgridxqRange, "mgridxqRange");
            Intrinsics.h(mgridyqRange, "mgridyqRange");
            Intrinsics.h(mgridcoarse, "mgridcoarse");
            Intrinsics.h(mgridcoarsexqRange, "mgridcoarsexqRange");
            Intrinsics.h(mgridcoarseyqRange, "mgridcoarseyqRange");
            Intrinsics.h(gmmpdf, "gmmpdf");
            return new MapGridData(mapId, mgrid, mgridxqRange, mgridyqRange, mgridcoarse, mgridcoarsexqRange, mgridcoarseyqRange, gmmpdf, Done, plmVersion, majorVersion, version);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapGridData)) {
                return false;
            }
            MapGridData mapGridData = (MapGridData) other;
            return Intrinsics.c(this.mapId, mapGridData.mapId) && Intrinsics.c(this.mgrid, mapGridData.mgrid) && Intrinsics.c(this.mgridxqRange, mapGridData.mgridxqRange) && Intrinsics.c(this.mgridyqRange, mapGridData.mgridyqRange) && Intrinsics.c(this.mgridcoarse, mapGridData.mgridcoarse) && Intrinsics.c(this.mgridcoarsexqRange, mapGridData.mgridcoarsexqRange) && Intrinsics.c(this.mgridcoarseyqRange, mapGridData.mgridcoarseyqRange) && Intrinsics.c(this.gmmpdf, mapGridData.gmmpdf) && this.Done == mapGridData.Done && Double.compare(this.plmVersion, mapGridData.plmVersion) == 0 && Intrinsics.c(this.majorVersion, mapGridData.majorVersion) && Intrinsics.c(this.version, mapGridData.version);
        }

        public final byte getDone() {
            return this.Done;
        }

        @NotNull
        public final GmmPdf getGmmpdf() {
            return this.gmmpdf;
        }

        @Nullable
        public final Double getMajorVersion() {
            return this.majorVersion;
        }

        @NotNull
        public final String getMapId() {
            return this.mapId;
        }

        @NotNull
        public final Grid getMgrid() {
            return this.mgrid;
        }

        @NotNull
        public final CoarseGrid getMgridcoarse() {
            return this.mgridcoarse;
        }

        @NotNull
        public final CoarseRange getMgridcoarsexqRange() {
            return this.mgridcoarsexqRange;
        }

        @NotNull
        public final CoarseRange getMgridcoarseyqRange() {
            return this.mgridcoarseyqRange;
        }

        @NotNull
        public final Range getMgridxqRange() {
            return this.mgridxqRange;
        }

        @NotNull
        public final Range getMgridyqRange() {
            return this.mgridyqRange;
        }

        public final double getPlmVersion() {
            return this.plmVersion;
        }

        @Nullable
        public final Double getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iA = me.oriient.internal.infra.locationManager.J.a(this.plmVersion, (Byte.hashCode(this.Done) + ((this.gmmpdf.hashCode() + ((this.mgridcoarseyqRange.hashCode() + ((this.mgridcoarsexqRange.hashCode() + ((this.mgridcoarse.hashCode() + ((this.mgridyqRange.hashCode() + ((this.mgridxqRange.hashCode() + ((this.mgrid.hashCode() + (this.mapId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31);
            Double d = this.majorVersion;
            int iHashCode = (iA + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.version;
            return iHashCode + (d2 != null ? d2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MapGridData(mapId=" + this.mapId + ", mgrid=" + this.mgrid + ", mgridxqRange=" + this.mgridxqRange + ", mgridyqRange=" + this.mgridyqRange + ", mgridcoarse=" + this.mgridcoarse + ", mgridcoarsexqRange=" + this.mgridcoarsexqRange + ", mgridcoarseyqRange=" + this.mgridcoarseyqRange + ", gmmpdf=" + this.gmmpdf + ", Done=" + ((int) this.Done) + ", plmVersion=" + this.plmVersion + ", majorVersion=" + this.majorVersion + ", version=" + this.version + ')';
        }

        public MapGridData(@NotNull String mapId, @NotNull Grid mgrid, @NotNull Range mgridxqRange, @NotNull Range mgridyqRange, @NotNull CoarseGrid mgridcoarse, @NotNull CoarseRange mgridcoarsexqRange, @NotNull CoarseRange mgridcoarseyqRange, @NotNull GmmPdf gmmpdf, byte b, double d, @Nullable Double d2, @Nullable Double d3) {
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(mgrid, "mgrid");
            Intrinsics.h(mgridxqRange, "mgridxqRange");
            Intrinsics.h(mgridyqRange, "mgridyqRange");
            Intrinsics.h(mgridcoarse, "mgridcoarse");
            Intrinsics.h(mgridcoarsexqRange, "mgridcoarsexqRange");
            Intrinsics.h(mgridcoarseyqRange, "mgridcoarseyqRange");
            Intrinsics.h(gmmpdf, "gmmpdf");
            this.mapId = mapId;
            this.mgrid = mgrid;
            this.mgridxqRange = mgridxqRange;
            this.mgridyqRange = mgridyqRange;
            this.mgridcoarse = mgridcoarse;
            this.mgridcoarsexqRange = mgridcoarsexqRange;
            this.mgridcoarseyqRange = mgridcoarseyqRange;
            this.gmmpdf = gmmpdf;
            this.Done = b;
            this.plmVersion = d;
            this.majorVersion = d2;
            this.version = d3;
        }

        @Keep
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;", "", "seen1", "", "min", "", "max", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IFFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(FF)V", "getMax", "()F", "getMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class CoarseRange {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();
            private final float max;
            private final float min;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$CoarseRange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<CoarseRange> serializer() {
                    return MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE;
                }
            }

            public CoarseRange(float f, float f2) {
                this.min = f;
                this.max = f2;
            }

            public static /* synthetic */ CoarseRange copy$default(CoarseRange coarseRange, float f, float f2, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = coarseRange.min;
                }
                if ((i & 2) != 0) {
                    f2 = coarseRange.max;
                }
                return coarseRange.copy(f, f2);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(CoarseRange self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.B(serialDesc, 0, self.min);
                output.B(serialDesc, 1, self.max);
            }

            /* renamed from: component1, reason: from getter */
            public final float getMin() {
                return this.min;
            }

            /* renamed from: component2, reason: from getter */
            public final float getMax() {
                return this.max;
            }

            @NotNull
            public final CoarseRange copy(float min, float max) {
                return new CoarseRange(min, max);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CoarseRange)) {
                    return false;
                }
                CoarseRange coarseRange = (CoarseRange) other;
                return Float.compare(this.min, coarseRange.min) == 0 && Float.compare(this.max, coarseRange.max) == 0;
            }

            public final float getMax() {
                return this.max;
            }

            public final float getMin() {
                return this.min;
            }

            public int hashCode() {
                return Float.hashCode(this.max) + (Float.hashCode(this.min) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("CoarseRange(min=");
                sb.append(this.min);
                sb.append(", max=");
                return android.support.v4.media.session.a.r(sb, this.max, ')');
            }

            @Deprecated
            public /* synthetic */ CoarseRange(int i, float f, float f2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.a(i, 3, MapGrid$MapGridData$CoarseRange$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.min = f;
                this.max = f2;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0002\u001f B)\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÁ\u0001¢\u0006\u0002\b\u001eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006!"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;", "", "seen1", "", "min", "", "max", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(DD)V", "getMax", "()D", "getMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Range {

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();
            private final double max;
            private final double min;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData$Range;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<Range> serializer() {
                    return MapGrid$MapGridData$Range$$serializer.INSTANCE;
                }
            }

            public Range(double d, double d2) {
                this.min = d;
                this.max = d2;
            }

            public static /* synthetic */ Range copy$default(Range range, double d, double d2, int i, Object obj) {
                if ((i & 1) != 0) {
                    d = range.min;
                }
                if ((i & 2) != 0) {
                    d2 = range.max;
                }
                return range.copy(d, d2);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(Range self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.G(serialDesc, 0, self.min);
                output.G(serialDesc, 1, self.max);
            }

            /* renamed from: component1, reason: from getter */
            public final double getMin() {
                return this.min;
            }

            /* renamed from: component2, reason: from getter */
            public final double getMax() {
                return this.max;
            }

            @NotNull
            public final Range copy(double min, double max) {
                return new Range(min, max);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Range)) {
                    return false;
                }
                Range range = (Range) other;
                return Double.compare(this.min, range.min) == 0 && Double.compare(this.max, range.max) == 0;
            }

            public final double getMax() {
                return this.max;
            }

            public final double getMin() {
                return this.min;
            }

            public int hashCode() {
                return Double.hashCode(this.max) + (Double.hashCode(this.min) * 31);
            }

            @NotNull
            public String toString() {
                StringBuilder sb = new StringBuilder("Range(min=");
                sb.append(this.min);
                sb.append(", max=");
                return me.oriient.internal.services.dataManager.building.E.a(sb, this.max, ')');
            }

            @Deprecated
            public /* synthetic */ Range(int i, double d, double d2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.a(i, 3, MapGrid$MapGridData$Range$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.min = d;
                this.max = d2;
            }
        }
    }

    @Deprecated
    public /* synthetic */ MapGrid(int i, MapGridRecord mapGridRecord, MapGridData mapGridData, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.a(i, 3, MapGrid$$serializer.INSTANCE.getB());
            throw null;
        }
        this.record = mapGridRecord;
        this.mapGridData = mapGridData;
    }

    public static /* synthetic */ MapGrid copy$default(MapGrid mapGrid, MapGridRecord mapGridRecord, MapGridData mapGridData, int i, Object obj) {
        if ((i & 1) != 0) {
            mapGridRecord = mapGrid.record;
        }
        if ((i & 2) != 0) {
            mapGridData = mapGrid.mapGridData;
        }
        return mapGrid.copy(mapGridRecord, mapGridData);
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$internal_publishRelease(MapGrid self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.F(serialDesc, 0, MapGridRecord$$serializer.INSTANCE, self.record);
        output.F(serialDesc, 1, MapGrid$MapGridData$$serializer.INSTANCE, self.mapGridData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MapGridRecord getRecord() {
        return this.record;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final MapGridData getMapGridData() {
        return this.mapGridData;
    }

    @NotNull
    public final MapGrid copy(@NotNull MapGridRecord record, @NotNull MapGridData mapGridData) {
        Intrinsics.h(record, "record");
        Intrinsics.h(mapGridData, "mapGridData");
        return new MapGrid(record, mapGridData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MapGrid)) {
            return false;
        }
        MapGrid mapGrid = (MapGrid) other;
        return Intrinsics.c(this.record, mapGrid.record) && Intrinsics.c(this.mapGridData, mapGrid.mapGridData);
    }

    @NotNull
    public final MapGridData getMapGridData() {
        return this.mapGridData;
    }

    @NotNull
    public final MapGridRecord getRecord() {
        return this.record;
    }

    public int hashCode() {
        return this.mapGridData.hashCode() + (this.record.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MapGrid(record=" + this.record + ", mapGridData=" + this.mapGridData + ')';
    }

    public MapGrid(@NotNull MapGridRecord record, @NotNull MapGridData mapGridData) {
        Intrinsics.h(record, "record");
        Intrinsics.h(mapGridData, "mapGridData");
        this.record = record;
        this.mapGridData = mapGridData;
    }
}
