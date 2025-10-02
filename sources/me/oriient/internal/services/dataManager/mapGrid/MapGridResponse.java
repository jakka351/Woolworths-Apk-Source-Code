package me.oriient.internal.services.dataManager.mapGrid;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ByteSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.ShortSerializer;
import me.oriient.internal.infra.utils.core.ParsingError;
import me.oriient.internal.services.dataManager.mapGrid.MapGrid;
import me.oriient.internal.services.dataManager.utils.MatLabArray;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0003 !\"B#\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u0013\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\r\u0010\u0014\u001a\u00020\u0015H\u0000¢\u0006\u0002\b\u0016J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J&\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006#"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse;", "", "seen1", "", "mapGridData", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;)V", "getMapGridData", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;", "checkMatlabArraysValidity", "", "component1", "copy", "equals", "", "other", "hashCode", "toMapGrid", "Lme/oriient/internal/services/dataManager/mapGrid/MapGrid$MapGridData;", "toMapGrid$internal_publishRelease", "toString", "", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "MapGridData", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes7.dex */
public final /* data */ class MapGridResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private final MapGridData mapGridData;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        @NotNull
        public final KSerializer<MapGridResponse> serializer() {
            return MapGridResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated
    public /* synthetic */ MapGridResponse(int i, MapGridData mapGridData, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 == (i & 1)) {
            this.mapGridData = mapGridData;
        } else {
            PluginExceptionsKt.a(i, 1, MapGridResponse$$serializer.INSTANCE.getB());
            throw null;
        }
    }

    private final void checkMatlabArraysValidity(MapGridData mapGridData) throws ParsingError {
        if (!mapGridData.getMgrid().getMx().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgrid.mx");
        }
        if (!mapGridData.getMgrid().getMy().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgrid.my");
        }
        if (!mapGridData.getMgrid().getMz().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgrid.mz");
        }
        if (!mapGridData.getMgrid().getD().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgrid.d");
        }
        if (!mapGridData.getMgrid().getRes().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgrid.res");
        }
        if (!mapGridData.getMgridxqRange().getMin().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridxqRange.min");
        }
        if (!mapGridData.getMgridxqRange().getMax().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridxqRange.max");
        }
        if (!mapGridData.getMgridyqRange().getMin().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridyqRange.min");
        }
        if (!mapGridData.getMgridyqRange().getMax().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridyqRange.max");
        }
        if (!mapGridData.getMgridcoarse().getMx().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarse.mx");
        }
        if (!mapGridData.getMgridcoarse().getMy().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarse.my");
        }
        if (!mapGridData.getMgridcoarse().getMz().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarse.mz");
        }
        if (!mapGridData.getMgridcoarse().getD().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarse.d");
        }
        if (!mapGridData.getMgridcoarse().getRes().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarse.res");
        }
        if (!mapGridData.getMgridcoarsexqRange().getMin().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarsexqRange.min");
        }
        if (!mapGridData.getMgridcoarsexqRange().getMax().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarsexqRange.max");
        }
        if (!mapGridData.getMgridcoarseyqRange().getMin().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarsexqRange.min");
        }
        if (!mapGridData.getMgridcoarseyqRange().getMax().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid mgridcoarseyqRange.max");
        }
        if (!mapGridData.getGmmpdf().getR().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid gmmpdf.r");
        }
        if (!mapGridData.getGmmpdf().getW().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid gmmpdf.w");
        }
        if (!mapGridData.getGmmpdf().getStd().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid gmmpdf.std");
        }
        if (!mapGridData.getDone().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid Done");
        }
        if (!mapGridData.getPlmVersion().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid plmVersion");
        }
        if (mapGridData.getMajorVersion() != null && !mapGridData.getMajorVersion().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid majorVersion");
        }
        if (mapGridData.getVersion() != null && !mapGridData.getVersion().isValid$internal_publishRelease()) {
            throw new ParsingError("invalid version");
        }
    }

    public static /* synthetic */ MapGridResponse copy$default(MapGridResponse mapGridResponse, MapGridData mapGridData, int i, Object obj) {
        if ((i & 1) != 0) {
            mapGridData = mapGridResponse.mapGridData;
        }
        return mapGridResponse.copy(mapGridData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MapGridData getMapGridData() {
        return this.mapGridData;
    }

    @NotNull
    public final MapGridResponse copy(@NotNull MapGridData mapGridData) {
        Intrinsics.h(mapGridData, "mapGridData");
        return new MapGridResponse(mapGridData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MapGridResponse) && Intrinsics.c(this.mapGridData, ((MapGridResponse) other).mapGridData);
    }

    @NotNull
    public final MapGridData getMapGridData() {
        return this.mapGridData;
    }

    public int hashCode() {
        return this.mapGridData.hashCode();
    }

    @NotNull
    public final MapGrid.MapGridData toMapGrid$internal_publishRelease() throws ParsingError {
        List<T> arrayData;
        List<T> arrayData2;
        MapGridData mapGridData = this.mapGridData;
        checkMatlabArraysValidity(mapGridData);
        String mapId = mapGridData.getMapId();
        MatLabArray<Short> mx = mapGridData.getMgrid().getMx();
        MatLabArray<Short> my = mapGridData.getMgrid().getMy();
        MatLabArray<Short> mz = mapGridData.getMgrid().getMz();
        MatLabArray<Short> d = mapGridData.getMgrid().getD();
        Double d2 = (Double) CollectionsKt.F(mapGridData.getMgrid().getRes().getArrayData());
        if (d2 == null) {
            throw new ParsingError("invalid mgrid.res");
        }
        MapGrid.MapGridData.Grid grid = new MapGrid.MapGridData.Grid(mx, my, mz, d, d2.doubleValue());
        Double d3 = (Double) CollectionsKt.F(mapGridData.getMgridxqRange().getMin().getArrayData());
        if (d3 == null) {
            throw new ParsingError("invalid mgridxRange.min");
        }
        double dDoubleValue = d3.doubleValue();
        Double d4 = (Double) CollectionsKt.F(mapGridData.getMgridxqRange().getMax().getArrayData());
        if (d4 == null) {
            throw new ParsingError("invalid mgridxRange.max");
        }
        MapGrid.MapGridData.Range range = new MapGrid.MapGridData.Range(dDoubleValue, d4.doubleValue());
        Double d5 = (Double) CollectionsKt.F(mapGridData.getMgridyqRange().getMin().getArrayData());
        if (d5 == null) {
            throw new ParsingError("invalid mgridyRange.min");
        }
        double dDoubleValue2 = d5.doubleValue();
        Double d6 = (Double) CollectionsKt.F(mapGridData.getMgridyqRange().getMax().getArrayData());
        if (d6 == null) {
            throw new ParsingError("invalid mgridyRange.max");
        }
        MapGrid.MapGridData.Range range2 = new MapGrid.MapGridData.Range(dDoubleValue2, d6.doubleValue());
        MatLabArray<Short> mx2 = mapGridData.getMgridcoarse().getMx();
        MatLabArray<Short> my2 = mapGridData.getMgridcoarse().getMy();
        MatLabArray<Short> mz2 = mapGridData.getMgridcoarse().getMz();
        MatLabArray<Short> d7 = mapGridData.getMgridcoarse().getD();
        Double d8 = (Double) CollectionsKt.F(mapGridData.getMgridcoarse().getRes().getArrayData());
        if (d8 == null) {
            throw new ParsingError("invalid mgridcoarse.res");
        }
        MapGrid.MapGridData.CoarseGrid coarseGrid = new MapGrid.MapGridData.CoarseGrid(mx2, my2, mz2, d7, d8.doubleValue());
        Float f = (Float) CollectionsKt.F(mapGridData.getMgridcoarsexqRange().getMin().getArrayData());
        if (f == null) {
            throw new ParsingError("invalid mgridcoarsexRange.min");
        }
        float fFloatValue = f.floatValue();
        Float f2 = (Float) CollectionsKt.F(mapGridData.getMgridcoarsexqRange().getMax().getArrayData());
        if (f2 == null) {
            throw new ParsingError("invalid mgridcoarsexRange.max");
        }
        MapGrid.MapGridData.CoarseRange coarseRange = new MapGrid.MapGridData.CoarseRange(fFloatValue, f2.floatValue());
        Float f3 = (Float) CollectionsKt.F(mapGridData.getMgridcoarseyqRange().getMin().getArrayData());
        if (f3 == null) {
            throw new ParsingError("invalid mgridcoarseyRange.min");
        }
        float fFloatValue2 = f3.floatValue();
        Float f4 = (Float) CollectionsKt.F(mapGridData.getMgridcoarseyqRange().getMax().getArrayData());
        if (f4 == null) {
            throw new ParsingError("invalid mgridcoarseyRange.max");
        }
        MapGrid.MapGridData.CoarseRange coarseRange2 = new MapGrid.MapGridData.CoarseRange(fFloatValue2, f4.floatValue());
        MatLabArray<Double> r = mapGridData.getGmmpdf().getR();
        MatLabArray<Double> w = mapGridData.getGmmpdf().getW();
        Double d9 = (Double) CollectionsKt.F(mapGridData.getGmmpdf().getStd().getArrayData());
        if (d9 == null) {
            throw new ParsingError("invalid gmmpdf.std");
        }
        MapGrid.MapGridData.GmmPdf gmmPdf = new MapGrid.MapGridData.GmmPdf(r, w, d9.doubleValue());
        Byte b = (Byte) CollectionsKt.F(mapGridData.getDone().getArrayData());
        if (b == null) {
            throw new ParsingError("invalid Done");
        }
        byte bByteValue = b.byteValue();
        Double d10 = (Double) CollectionsKt.F(mapGridData.getPlmVersion().getArrayData());
        if (d10 == null) {
            throw new ParsingError("invalid plmVersion");
        }
        double dDoubleValue3 = d10.doubleValue();
        MatLabArray<Double> majorVersion = mapGridData.getMajorVersion();
        Double d11 = null;
        Double d12 = (majorVersion == null || (arrayData2 = majorVersion.getArrayData()) == 0) ? null : (Double) CollectionsKt.F(arrayData2);
        MatLabArray<Double> version = mapGridData.getVersion();
        if (version != null && (arrayData = version.getArrayData()) != 0) {
            d11 = (Double) CollectionsKt.F(arrayData);
        }
        return new MapGrid.MapGridData(mapId, grid, range, range2, coarseGrid, coarseRange, coarseRange2, gmmPdf, bByteValue, dDoubleValue3, d12, d11);
    }

    @NotNull
    public String toString() {
        return "MapGridResponse(mapGridData=" + this.mapGridData + ')';
    }

    public MapGridResponse(@NotNull MapGridData mapGridData) {
        Intrinsics.h(mapGridData, "mapGridData");
        this.mapGridData = mapGridData;
    }

    @Keep
    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0081\b\u0018\u0000 M2\u00020\u0001:\u0007JKLMNOPB©\u0001\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\u0002\u0010\u001bB\u0085\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013¢\u0006\u0002\u0010\u001cJ\t\u00100\u001a\u00020\u0005HÆ\u0003J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013HÆ\u0003J\u0011\u00102\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013HÆ\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013HÆ\u0003J\t\u00104\u001a\u00020\u0007HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\t\u00106\u001a\u00020\tHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\u000eHÆ\u0003J\t\u00109\u001a\u00020\u000eHÆ\u0003J\t\u0010:\u001a\u00020\u0011HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u009d\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00132\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013HÆ\u0001J\u0013\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u0003HÖ\u0001J\t\u0010A\u001a\u00020\u0005HÖ\u0001J&\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HHÁ\u0001¢\u0006\u0002\bIR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b*\u0010)R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0013¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0019\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001e¨\u0006Q"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;", "", "seen1", "", "mapId", "", "mgrid", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid;", "mgridxqRange", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;", "mgridyqRange", "mgridcoarse", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid;", "mgridcoarsexqRange", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;", "mgridcoarseyqRange", "gmmpdf", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf;", "Done", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "plmVersion", "", "majorVersion", "version", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;)V", "getDone", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getGmmpdf", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf;", "getMajorVersion", "getMapId", "()Ljava/lang/String;", "getMgrid", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid;", "getMgridcoarse", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid;", "getMgridcoarsexqRange", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;", "getMgridcoarseyqRange", "getMgridxqRange", "()Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;", "getMgridyqRange", "getPlmVersion", "getVersion", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "CoarseGrid", "CoarseRange", "Companion", "GmmPdf", "Grid", "Range", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Serializable
    public static final /* data */ class MapGridData {

        @JvmField
        @NotNull
        private static final KSerializer<Object>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @NotNull
        private final MatLabArray<Byte> Done;

        @NotNull
        private final GmmPdf gmmpdf;

        @Nullable
        private final MatLabArray<Double> majorVersion;

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

        @NotNull
        private final MatLabArray<Double> plmVersion;

        @Nullable
        private final MatLabArray<Double> version;

        @Keep
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+Bi\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006,"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid;", "", "seen1", "", "mx", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "my", "mz", "d", "res", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;)V", "getD", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMx", "getMy", "getMz", "getRes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            @NotNull
            private final MatLabArray<Double> res;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseGrid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<CoarseGrid> serializer() {
                    return MapGridResponse$MapGridData$CoarseGrid$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                ShortSerializer shortSerializer = ShortSerializer.f24820a;
                $childSerializers = new KSerializer[]{companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(DoubleSerializer.f24792a)};
            }

            @Deprecated
            public /* synthetic */ CoarseGrid(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, MatLabArray matLabArray5, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptionsKt.a(i, 31, MapGridResponse$MapGridData$CoarseGrid$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.mx = matLabArray;
                this.my = matLabArray2;
                this.mz = matLabArray3;
                this.d = matLabArray4;
                this.res = matLabArray5;
            }

            public static /* synthetic */ CoarseGrid copy$default(CoarseGrid coarseGrid, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, MatLabArray matLabArray5, int i, Object obj) {
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
                    matLabArray5 = coarseGrid.res;
                }
                MatLabArray matLabArray6 = matLabArray5;
                MatLabArray matLabArray7 = matLabArray3;
                return coarseGrid.copy(matLabArray, matLabArray2, matLabArray7, matLabArray4, matLabArray6);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(CoarseGrid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.mx);
                output.F(serialDesc, 1, kSerializerArr[1], self.my);
                output.F(serialDesc, 2, kSerializerArr[2], self.mz);
                output.F(serialDesc, 3, kSerializerArr[3], self.d);
                output.F(serialDesc, 4, kSerializerArr[4], self.res);
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

            @NotNull
            public final MatLabArray<Double> component5() {
                return this.res;
            }

            @NotNull
            public final CoarseGrid copy(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, @NotNull MatLabArray<Double> res) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                Intrinsics.h(res, "res");
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
                return Intrinsics.c(this.mx, coarseGrid.mx) && Intrinsics.c(this.my, coarseGrid.my) && Intrinsics.c(this.mz, coarseGrid.mz) && Intrinsics.c(this.d, coarseGrid.d) && Intrinsics.c(this.res, coarseGrid.res);
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

            @NotNull
            public final MatLabArray<Double> getRes() {
                return this.res;
            }

            public int hashCode() {
                return this.res.hashCode() + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.d, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.mz, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.my, this.mx.hashCode() * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                return "CoarseGrid(mx=" + this.mx + ", my=" + this.my + ", mz=" + this.mz + ", d=" + this.d + ", res=" + this.res + ')';
            }

            public CoarseGrid(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, @NotNull MatLabArray<Double> res) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                Intrinsics.h(res, "res");
                this.mx = mx;
                this.my = my;
                this.mz = mz;
                this.d = d;
                this.res = res;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;", "", "seen1", "", "min", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "max", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;)V", "getMax", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class CoarseRange {

            @JvmField
            @NotNull
            private static final KSerializer<Object>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            private final MatLabArray<Float> max;

            @NotNull
            private final MatLabArray<Float> min;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$CoarseRange;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<CoarseRange> serializer() {
                    return MapGridResponse$MapGridData$CoarseRange$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                FloatSerializer floatSerializer = FloatSerializer.f24797a;
                $childSerializers = new KSerializer[]{companion.serializer(floatSerializer), companion.serializer(floatSerializer)};
            }

            @Deprecated
            public /* synthetic */ CoarseRange(int i, MatLabArray matLabArray, MatLabArray matLabArray2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.a(i, 3, MapGridResponse$MapGridData$CoarseRange$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.min = matLabArray;
                this.max = matLabArray2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ CoarseRange copy$default(CoarseRange coarseRange, MatLabArray matLabArray, MatLabArray matLabArray2, int i, Object obj) {
                if ((i & 1) != 0) {
                    matLabArray = coarseRange.min;
                }
                if ((i & 2) != 0) {
                    matLabArray2 = coarseRange.max;
                }
                return coarseRange.copy(matLabArray, matLabArray2);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(CoarseRange self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.min);
                output.F(serialDesc, 1, kSerializerArr[1], self.max);
            }

            @NotNull
            public final MatLabArray<Float> component1() {
                return this.min;
            }

            @NotNull
            public final MatLabArray<Float> component2() {
                return this.max;
            }

            @NotNull
            public final CoarseRange copy(@NotNull MatLabArray<Float> min, @NotNull MatLabArray<Float> max) {
                Intrinsics.h(min, "min");
                Intrinsics.h(max, "max");
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
                return Intrinsics.c(this.min, coarseRange.min) && Intrinsics.c(this.max, coarseRange.max);
            }

            @NotNull
            public final MatLabArray<Float> getMax() {
                return this.max;
            }

            @NotNull
            public final MatLabArray<Float> getMin() {
                return this.min;
            }

            public int hashCode() {
                return this.max.hashCode() + (this.min.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "CoarseRange(min=" + this.min + ", max=" + this.max + ')';
            }

            public CoarseRange(@NotNull MatLabArray<Float> min, @NotNull MatLabArray<Float> max) {
                Intrinsics.h(min, "min");
                Intrinsics.h(max, "max");
                this.min = min;
                this.max = max;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            @NotNull
            public final KSerializer<MapGridData> serializer() {
                return MapGridResponse$MapGridData$$serializer.INSTANCE;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002#$BI\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB/\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\fJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!HÁ\u0001¢\u0006\u0002\b\"R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006%"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf;", "", "seen1", "", "r", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "w", "std", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;)V", "getR", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getStd", "getW", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            @NotNull
            private final MatLabArray<Double> std;

            @NotNull
            private final MatLabArray<Double> w;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$GmmPdf;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<GmmPdf> serializer() {
                    return MapGridResponse$MapGridData$GmmPdf$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
                $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer), companion.serializer(doubleSerializer)};
            }

            @Deprecated
            public /* synthetic */ GmmPdf(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, SerializationConstructorMarker serializationConstructorMarker) {
                if (7 != (i & 7)) {
                    PluginExceptionsKt.a(i, 7, MapGridResponse$MapGridData$GmmPdf$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.r = matLabArray;
                this.w = matLabArray2;
                this.std = matLabArray3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ GmmPdf copy$default(GmmPdf gmmPdf, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, int i, Object obj) {
                if ((i & 1) != 0) {
                    matLabArray = gmmPdf.r;
                }
                if ((i & 2) != 0) {
                    matLabArray2 = gmmPdf.w;
                }
                if ((i & 4) != 0) {
                    matLabArray3 = gmmPdf.std;
                }
                return gmmPdf.copy(matLabArray, matLabArray2, matLabArray3);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(GmmPdf self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.r);
                output.F(serialDesc, 1, kSerializerArr[1], self.w);
                output.F(serialDesc, 2, kSerializerArr[2], self.std);
            }

            @NotNull
            public final MatLabArray<Double> component1() {
                return this.r;
            }

            @NotNull
            public final MatLabArray<Double> component2() {
                return this.w;
            }

            @NotNull
            public final MatLabArray<Double> component3() {
                return this.std;
            }

            @NotNull
            public final GmmPdf copy(@NotNull MatLabArray<Double> r, @NotNull MatLabArray<Double> w, @NotNull MatLabArray<Double> std) {
                Intrinsics.h(r, "r");
                Intrinsics.h(w, "w");
                Intrinsics.h(std, "std");
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
                return Intrinsics.c(this.r, gmmPdf.r) && Intrinsics.c(this.w, gmmPdf.w) && Intrinsics.c(this.std, gmmPdf.std);
            }

            @NotNull
            public final MatLabArray<Double> getR() {
                return this.r;
            }

            @NotNull
            public final MatLabArray<Double> getStd() {
                return this.std;
            }

            @NotNull
            public final MatLabArray<Double> getW() {
                return this.w;
            }

            public int hashCode() {
                return this.std.hashCode() + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.w, this.r.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                return "GmmPdf(r=" + this.r + ", w=" + this.w + ", std=" + this.std + ')';
            }

            public GmmPdf(@NotNull MatLabArray<Double> r, @NotNull MatLabArray<Double> w, @NotNull MatLabArray<Double> std) {
                Intrinsics.h(r, "r");
                Intrinsics.h(w, "w");
                Intrinsics.h(std, "std");
                this.r = r;
                this.w = w;
                this.std = std;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002*+Bi\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eBK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0003JY\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J&\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(HÁ\u0001¢\u0006\u0002\b)R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006,"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid;", "", "seen1", "", "mx", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "my", "mz", "d", "res", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;)V", "getD", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMx", "getMy", "getMz", "getRes", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

            @NotNull
            private final MatLabArray<Double> res;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Grid;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<Grid> serializer() {
                    return MapGridResponse$MapGridData$Grid$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                ShortSerializer shortSerializer = ShortSerializer.f24820a;
                $childSerializers = new KSerializer[]{companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(shortSerializer), companion.serializer(DoubleSerializer.f24792a)};
            }

            @Deprecated
            public /* synthetic */ Grid(int i, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, MatLabArray matLabArray5, SerializationConstructorMarker serializationConstructorMarker) {
                if (31 != (i & 31)) {
                    PluginExceptionsKt.a(i, 31, MapGridResponse$MapGridData$Grid$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.mx = matLabArray;
                this.my = matLabArray2;
                this.mz = matLabArray3;
                this.d = matLabArray4;
                this.res = matLabArray5;
            }

            public static /* synthetic */ Grid copy$default(Grid grid, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, MatLabArray matLabArray5, int i, Object obj) {
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
                    matLabArray5 = grid.res;
                }
                MatLabArray matLabArray6 = matLabArray5;
                MatLabArray matLabArray7 = matLabArray3;
                return grid.copy(matLabArray, matLabArray2, matLabArray7, matLabArray4, matLabArray6);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(Grid self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.mx);
                output.F(serialDesc, 1, kSerializerArr[1], self.my);
                output.F(serialDesc, 2, kSerializerArr[2], self.mz);
                output.F(serialDesc, 3, kSerializerArr[3], self.d);
                output.F(serialDesc, 4, kSerializerArr[4], self.res);
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

            @NotNull
            public final MatLabArray<Double> component5() {
                return this.res;
            }

            @NotNull
            public final Grid copy(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, @NotNull MatLabArray<Double> res) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                Intrinsics.h(res, "res");
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
                return Intrinsics.c(this.mx, grid.mx) && Intrinsics.c(this.my, grid.my) && Intrinsics.c(this.mz, grid.mz) && Intrinsics.c(this.d, grid.d) && Intrinsics.c(this.res, grid.res);
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

            @NotNull
            public final MatLabArray<Double> getRes() {
                return this.res;
            }

            public int hashCode() {
                return this.res.hashCode() + kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.d, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.mz, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.my, this.mx.hashCode() * 31, 31), 31), 31);
            }

            @NotNull
            public String toString() {
                return "Grid(mx=" + this.mx + ", my=" + this.my + ", mz=" + this.mz + ", d=" + this.d + ", res=" + this.res + ')';
            }

            public Grid(@NotNull MatLabArray<Short> mx, @NotNull MatLabArray<Short> my, @NotNull MatLabArray<Short> mz, @NotNull MatLabArray<Short> d, @NotNull MatLabArray<Double> res) {
                Intrinsics.h(mx, "mx");
                Intrinsics.h(my, "my");
                Intrinsics.h(mz, "mz");
                Intrinsics.h(d, "d");
                Intrinsics.h(res, "res");
                this.mx = mx;
                this.my = my;
                this.mz = mz;
                this.d = d;
                this.res = res;
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 !2\u00020\u0001:\u0002 !B9\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB!\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u000bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eHÁ\u0001¢\u0006\u0002\b\u001fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\""}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;", "", "seen1", "", "min", "Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "", "max", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lme/oriient/internal/services/dataManager/utils/MatLabArray;Lme/oriient/internal/services/dataManager/utils/MatLabArray;)V", "getMax", "()Lme/oriient/internal/services/dataManager/utils/MatLabArray;", "getMin", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$internal_publishRelease", "$serializer", "Companion", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @Serializable
        public static final /* data */ class Range {

            @JvmField
            @NotNull
            private static final KSerializer<Object>[] $childSerializers;

            /* renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            @NotNull
            private final MatLabArray<Double> max;

            @NotNull
            private final MatLabArray<Double> min;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lme/oriient/internal/services/dataManager/mapGrid/MapGridResponse$MapGridData$Range;", "serializer", "()Lkotlinx/serialization/KSerializer;", "internal_publishRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class Companion {
                @NotNull
                public final KSerializer<Range> serializer() {
                    return MapGridResponse$MapGridData$Range$$serializer.INSTANCE;
                }
            }

            static {
                MatLabArray.Companion companion = MatLabArray.INSTANCE;
                DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
                $childSerializers = new KSerializer[]{companion.serializer(doubleSerializer), companion.serializer(doubleSerializer)};
            }

            @Deprecated
            public /* synthetic */ Range(int i, MatLabArray matLabArray, MatLabArray matLabArray2, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    PluginExceptionsKt.a(i, 3, MapGridResponse$MapGridData$Range$$serializer.INSTANCE.getB());
                    throw null;
                }
                this.min = matLabArray;
                this.max = matLabArray2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Range copy$default(Range range, MatLabArray matLabArray, MatLabArray matLabArray2, int i, Object obj) {
                if ((i & 1) != 0) {
                    matLabArray = range.min;
                }
                if ((i & 2) != 0) {
                    matLabArray2 = range.max;
                }
                return range.copy(matLabArray, matLabArray2);
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$internal_publishRelease(Range self, CompositeEncoder output, SerialDescriptor serialDesc) {
                KSerializer<Object>[] kSerializerArr = $childSerializers;
                output.F(serialDesc, 0, kSerializerArr[0], self.min);
                output.F(serialDesc, 1, kSerializerArr[1], self.max);
            }

            @NotNull
            public final MatLabArray<Double> component1() {
                return this.min;
            }

            @NotNull
            public final MatLabArray<Double> component2() {
                return this.max;
            }

            @NotNull
            public final Range copy(@NotNull MatLabArray<Double> min, @NotNull MatLabArray<Double> max) {
                Intrinsics.h(min, "min");
                Intrinsics.h(max, "max");
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
                return Intrinsics.c(this.min, range.min) && Intrinsics.c(this.max, range.max);
            }

            @NotNull
            public final MatLabArray<Double> getMax() {
                return this.max;
            }

            @NotNull
            public final MatLabArray<Double> getMin() {
                return this.min;
            }

            public int hashCode() {
                return this.max.hashCode() + (this.min.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Range(min=" + this.min + ", max=" + this.max + ')';
            }

            public Range(@NotNull MatLabArray<Double> min, @NotNull MatLabArray<Double> max) {
                Intrinsics.h(min, "min");
                Intrinsics.h(max, "max");
                this.min = min;
                this.max = max;
            }
        }

        static {
            MatLabArray.Companion companion = MatLabArray.INSTANCE;
            KSerializer<Object> kSerializerSerializer = companion.serializer(ByteSerializer.f24781a);
            DoubleSerializer doubleSerializer = DoubleSerializer.f24792a;
            $childSerializers = new KSerializer[]{null, null, null, null, null, null, null, null, kSerializerSerializer, companion.serializer(doubleSerializer), companion.serializer(doubleSerializer), companion.serializer(doubleSerializer)};
        }

        @Deprecated
        public /* synthetic */ MapGridData(int i, String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, SerializationConstructorMarker serializationConstructorMarker) {
            if (1023 != (i & 1023)) {
                PluginExceptionsKt.a(i, 1023, MapGridResponse$MapGridData$$serializer.INSTANCE.getB());
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
            this.Done = matLabArray;
            this.plmVersion = matLabArray2;
            if ((i & 1024) == 0) {
                this.majorVersion = null;
            } else {
                this.majorVersion = matLabArray3;
            }
            if ((i & 2048) == 0) {
                this.version = null;
            } else {
                this.version = matLabArray4;
            }
        }

        public static /* synthetic */ MapGridData copy$default(MapGridData mapGridData, String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = mapGridData.mapId;
            }
            if ((i & 2) != 0) {
                grid = mapGridData.mgrid;
            }
            if ((i & 4) != 0) {
                range = mapGridData.mgridxqRange;
            }
            if ((i & 8) != 0) {
                range2 = mapGridData.mgridyqRange;
            }
            if ((i & 16) != 0) {
                coarseGrid = mapGridData.mgridcoarse;
            }
            if ((i & 32) != 0) {
                coarseRange = mapGridData.mgridcoarsexqRange;
            }
            if ((i & 64) != 0) {
                coarseRange2 = mapGridData.mgridcoarseyqRange;
            }
            if ((i & 128) != 0) {
                gmmPdf = mapGridData.gmmpdf;
            }
            if ((i & 256) != 0) {
                matLabArray = mapGridData.Done;
            }
            if ((i & 512) != 0) {
                matLabArray2 = mapGridData.plmVersion;
            }
            if ((i & 1024) != 0) {
                matLabArray3 = mapGridData.majorVersion;
            }
            if ((i & 2048) != 0) {
                matLabArray4 = mapGridData.version;
            }
            MatLabArray matLabArray5 = matLabArray3;
            MatLabArray matLabArray6 = matLabArray4;
            MatLabArray matLabArray7 = matLabArray;
            MatLabArray matLabArray8 = matLabArray2;
            CoarseRange coarseRange3 = coarseRange2;
            GmmPdf gmmPdf2 = gmmPdf;
            CoarseGrid coarseGrid2 = coarseGrid;
            CoarseRange coarseRange4 = coarseRange;
            return mapGridData.copy(str, grid, range, range2, coarseGrid2, coarseRange4, coarseRange3, gmmPdf2, matLabArray7, matLabArray8, matLabArray5, matLabArray6);
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$internal_publishRelease(MapGridData self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.p(serialDesc, 0, self.mapId);
            output.F(serialDesc, 1, MapGridResponse$MapGridData$Grid$$serializer.INSTANCE, self.mgrid);
            MapGridResponse$MapGridData$Range$$serializer mapGridResponse$MapGridData$Range$$serializer = MapGridResponse$MapGridData$Range$$serializer.INSTANCE;
            output.F(serialDesc, 2, mapGridResponse$MapGridData$Range$$serializer, self.mgridxqRange);
            output.F(serialDesc, 3, mapGridResponse$MapGridData$Range$$serializer, self.mgridyqRange);
            output.F(serialDesc, 4, MapGridResponse$MapGridData$CoarseGrid$$serializer.INSTANCE, self.mgridcoarse);
            MapGridResponse$MapGridData$CoarseRange$$serializer mapGridResponse$MapGridData$CoarseRange$$serializer = MapGridResponse$MapGridData$CoarseRange$$serializer.INSTANCE;
            output.F(serialDesc, 5, mapGridResponse$MapGridData$CoarseRange$$serializer, self.mgridcoarsexqRange);
            output.F(serialDesc, 6, mapGridResponse$MapGridData$CoarseRange$$serializer, self.mgridcoarseyqRange);
            output.F(serialDesc, 7, MapGridResponse$MapGridData$GmmPdf$$serializer.INSTANCE, self.gmmpdf);
            output.F(serialDesc, 8, kSerializerArr[8], self.Done);
            output.F(serialDesc, 9, kSerializerArr[9], self.plmVersion);
            if (output.q(serialDesc, 10) || self.majorVersion != null) {
                output.w(serialDesc, 10, kSerializerArr[10], self.majorVersion);
            }
            if (!output.q(serialDesc, 11) && self.version == null) {
                return;
            }
            output.w(serialDesc, 11, kSerializerArr[11], self.version);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getMapId() {
            return this.mapId;
        }

        @NotNull
        public final MatLabArray<Double> component10() {
            return this.plmVersion;
        }

        @Nullable
        public final MatLabArray<Double> component11() {
            return this.majorVersion;
        }

        @Nullable
        public final MatLabArray<Double> component12() {
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

        @NotNull
        public final MatLabArray<Byte> component9() {
            return this.Done;
        }

        @NotNull
        public final MapGridData copy(@NotNull String mapId, @NotNull Grid mgrid, @NotNull Range mgridxqRange, @NotNull Range mgridyqRange, @NotNull CoarseGrid mgridcoarse, @NotNull CoarseRange mgridcoarsexqRange, @NotNull CoarseRange mgridcoarseyqRange, @NotNull GmmPdf gmmpdf, @NotNull MatLabArray<Byte> Done, @NotNull MatLabArray<Double> plmVersion, @Nullable MatLabArray<Double> majorVersion, @Nullable MatLabArray<Double> version) {
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(mgrid, "mgrid");
            Intrinsics.h(mgridxqRange, "mgridxqRange");
            Intrinsics.h(mgridyqRange, "mgridyqRange");
            Intrinsics.h(mgridcoarse, "mgridcoarse");
            Intrinsics.h(mgridcoarsexqRange, "mgridcoarsexqRange");
            Intrinsics.h(mgridcoarseyqRange, "mgridcoarseyqRange");
            Intrinsics.h(gmmpdf, "gmmpdf");
            Intrinsics.h(Done, "Done");
            Intrinsics.h(plmVersion, "plmVersion");
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
            return Intrinsics.c(this.mapId, mapGridData.mapId) && Intrinsics.c(this.mgrid, mapGridData.mgrid) && Intrinsics.c(this.mgridxqRange, mapGridData.mgridxqRange) && Intrinsics.c(this.mgridyqRange, mapGridData.mgridyqRange) && Intrinsics.c(this.mgridcoarse, mapGridData.mgridcoarse) && Intrinsics.c(this.mgridcoarsexqRange, mapGridData.mgridcoarsexqRange) && Intrinsics.c(this.mgridcoarseyqRange, mapGridData.mgridcoarseyqRange) && Intrinsics.c(this.gmmpdf, mapGridData.gmmpdf) && Intrinsics.c(this.Done, mapGridData.Done) && Intrinsics.c(this.plmVersion, mapGridData.plmVersion) && Intrinsics.c(this.majorVersion, mapGridData.majorVersion) && Intrinsics.c(this.version, mapGridData.version);
        }

        @NotNull
        public final MatLabArray<Byte> getDone() {
            return this.Done;
        }

        @NotNull
        public final GmmPdf getGmmpdf() {
            return this.gmmpdf;
        }

        @Nullable
        public final MatLabArray<Double> getMajorVersion() {
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

        @NotNull
        public final MatLabArray<Double> getPlmVersion() {
            return this.plmVersion;
        }

        @Nullable
        public final MatLabArray<Double> getVersion() {
            return this.version;
        }

        public int hashCode() {
            int iA = kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.plmVersion, kotlin.reflect.jvm.internal.impl.types.checker.a.a(this.Done, (this.gmmpdf.hashCode() + ((this.mgridcoarseyqRange.hashCode() + ((this.mgridcoarsexqRange.hashCode() + ((this.mgridcoarse.hashCode() + ((this.mgridyqRange.hashCode() + ((this.mgridxqRange.hashCode() + ((this.mgrid.hashCode() + (this.mapId.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31), 31);
            MatLabArray<Double> matLabArray = this.majorVersion;
            int iHashCode = (iA + (matLabArray == null ? 0 : matLabArray.hashCode())) * 31;
            MatLabArray<Double> matLabArray2 = this.version;
            return iHashCode + (matLabArray2 != null ? matLabArray2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MapGridData(mapId=" + this.mapId + ", mgrid=" + this.mgrid + ", mgridxqRange=" + this.mgridxqRange + ", mgridyqRange=" + this.mgridyqRange + ", mgridcoarse=" + this.mgridcoarse + ", mgridcoarsexqRange=" + this.mgridcoarsexqRange + ", mgridcoarseyqRange=" + this.mgridcoarseyqRange + ", gmmpdf=" + this.gmmpdf + ", Done=" + this.Done + ", plmVersion=" + this.plmVersion + ", majorVersion=" + this.majorVersion + ", version=" + this.version + ')';
        }

        public MapGridData(@NotNull String mapId, @NotNull Grid mgrid, @NotNull Range mgridxqRange, @NotNull Range mgridyqRange, @NotNull CoarseGrid mgridcoarse, @NotNull CoarseRange mgridcoarsexqRange, @NotNull CoarseRange mgridcoarseyqRange, @NotNull GmmPdf gmmpdf, @NotNull MatLabArray<Byte> Done, @NotNull MatLabArray<Double> plmVersion, @Nullable MatLabArray<Double> matLabArray, @Nullable MatLabArray<Double> matLabArray2) {
            Intrinsics.h(mapId, "mapId");
            Intrinsics.h(mgrid, "mgrid");
            Intrinsics.h(mgridxqRange, "mgridxqRange");
            Intrinsics.h(mgridyqRange, "mgridyqRange");
            Intrinsics.h(mgridcoarse, "mgridcoarse");
            Intrinsics.h(mgridcoarsexqRange, "mgridcoarsexqRange");
            Intrinsics.h(mgridcoarseyqRange, "mgridcoarseyqRange");
            Intrinsics.h(gmmpdf, "gmmpdf");
            Intrinsics.h(Done, "Done");
            Intrinsics.h(plmVersion, "plmVersion");
            this.mapId = mapId;
            this.mgrid = mgrid;
            this.mgridxqRange = mgridxqRange;
            this.mgridyqRange = mgridyqRange;
            this.mgridcoarse = mgridcoarse;
            this.mgridcoarsexqRange = mgridcoarsexqRange;
            this.mgridcoarseyqRange = mgridcoarseyqRange;
            this.gmmpdf = gmmpdf;
            this.Done = Done;
            this.plmVersion = plmVersion;
            this.majorVersion = matLabArray;
            this.version = matLabArray2;
        }

        public /* synthetic */ MapGridData(String str, Grid grid, Range range, Range range2, CoarseGrid coarseGrid, CoarseRange coarseRange, CoarseRange coarseRange2, GmmPdf gmmPdf, MatLabArray matLabArray, MatLabArray matLabArray2, MatLabArray matLabArray3, MatLabArray matLabArray4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, grid, range, range2, coarseGrid, coarseRange, coarseRange2, gmmPdf, matLabArray, matLabArray2, (i & 1024) != 0 ? null : matLabArray3, (i & 2048) != 0 ? null : matLabArray4);
        }
    }
}
