package ovh.plrapps.mapcompose.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.ui.tap.a;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lovh/plrapps/mapcompose/core/VisibleTilesResolver;", "", "ScaleProvider", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class VisibleTilesResolver {

    /* renamed from: a, reason: collision with root package name */
    public final int f26940a;
    public final int b;
    public final int c;
    public final a d;
    public final LinkedHashMap e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/core/VisibleTilesResolver$ScaleProvider;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface ScaleProvider {
    }

    public VisibleTilesResolver(int i, int i2, int i3, a aVar) {
        this.f26940a = i;
        this.b = i2;
        this.c = i3;
        this.d = aVar;
        IntRange intRangeO = RangesKt.o(0, 1);
        int iH = MapsKt.h(CollectionsKt.s(intRangeO, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH < 16 ? 16 : iH);
        IntProgressionIterator it = intRangeO.iterator();
        while (it.f) {
            linkedHashMap.put(it.next(), Double.valueOf(1.0d / Math.pow(2.0d, 0 - ((Number) r8).intValue())));
        }
        this.e = linkedHashMap;
    }

    public static final VisibleTiles a(double d, int i, int i2, int i3, VisibleTilesResolver visibleTilesResolver, double d2, int i4, int i5, int i6, int i7) {
        int iFloor = (int) Math.floor(i4 / d);
        if (iFloor > i) {
            iFloor = i;
        }
        int iCeil = 0;
        if (iFloor < 0) {
            iFloor = 0;
        }
        int iFloor2 = (int) Math.floor(i5 / d);
        if (iFloor2 > i2) {
            iFloor2 = i2;
        }
        if (iFloor2 < 0) {
            iFloor2 = 0;
        }
        int iCeil2 = ((int) Math.ceil(i6 / d)) - 1;
        if (iCeil2 <= i) {
            i = iCeil2;
        }
        int iCeil3 = ((int) Math.ceil(i7 / d)) - 1;
        if (iCeil3 <= i2) {
            i2 = iCeil3;
        }
        IntRange intRange = new IntRange(iFloor2, i2, 1);
        int iH = MapsKt.h(CollectionsKt.s(intRange, 10));
        if (iH < 16) {
            iH = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iH);
        IntProgressionIterator it = intRange.iterator();
        while (it.f) {
            Object next = it.next();
            ((Number) next).intValue();
            linkedHashMap.put(next, new IntRange(iFloor, i, 1));
        }
        int i8 = ((i - iFloor) + 1) * ((i2 - iFloor2) + 1);
        LinkedHashMap linkedHashMap2 = visibleTilesResolver.e;
        Double d3 = (Double) linkedHashMap2.get(0);
        if (d2 < (d3 != null ? d3.doubleValue() : Double.MIN_VALUE)) {
            Double d4 = (Double) linkedHashMap2.get(0);
            if (d4 == null) {
                throw new IllegalStateException("");
            }
            iCeil = (int) Math.ceil(Math.log(d4.doubleValue() / d2) / Math.log(2.0d));
        }
        return new VisibleTiles(i3, linkedHashMap, i8, iCeil);
    }
}
