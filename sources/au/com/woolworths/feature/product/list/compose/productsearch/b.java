package au.com.woolworths.feature.product.list.compose.productsearch;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import au.com.woolworths.shared.ui.compose.CoachmarkKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableIntState e;

    public /* synthetic */ b(int i, MutableIntState mutableIntState) {
        this.d = i;
        this.e = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        MutableIntState mutableIntState = this.e;
        switch (i) {
            case 0:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates, "coordinates");
                mutableIntState.i((int) (coordinates.a() & 4294967295L));
                return unit;
            case 1:
                LayoutCoordinates coordinates2 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates2, "coordinates");
                mutableIntState.i((int) (coordinates2.a() & 4294967295L));
                return unit;
            case 2:
                LayoutCoordinates coordinates3 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates3, "coordinates");
                mutableIntState.i((int) (coordinates3.a() & 4294967295L));
                return unit;
            case 3:
                LayoutCoordinates coordinates4 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates4, "coordinates");
                mutableIntState.i((int) (coordinates4.a() & 4294967295L));
                return unit;
            case 4:
                LayoutCoordinates coordinates5 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates5, "coordinates");
                mutableIntState.i((int) (coordinates5.a() & 4294967295L));
                return unit;
            case 5:
                LayoutCoordinates coordinates6 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates6, "coordinates");
                mutableIntState.i((int) (coordinates6.a() & 4294967295L));
                return unit;
            case 6:
                LayoutCoordinates coordinates7 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates7, "coordinates");
                mutableIntState.i((int) (coordinates7.a() & 4294967295L));
                return unit;
            case 7:
                LayoutCoordinates coordinates8 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates8, "coordinates");
                mutableIntState.i((int) (coordinates8.a() & 4294967295L));
                return unit;
            case 8:
                IntSize intSize = (IntSize) obj;
                if (((int) (intSize.f2202a & 4294967295L)) != mutableIntState.d()) {
                    mutableIntState.i((int) (intSize.f2202a & 4294967295L));
                }
                return unit;
            case 9:
                LayoutCoordinates coordinates9 = (LayoutCoordinates) obj;
                Intrinsics.h(coordinates9, "coordinates");
                mutableIntState.i((int) (coordinates9.a() >> 32));
                return unit;
            case 10:
                mutableIntState.i(((Integer) obj).intValue());
                return unit;
            case 11:
                float f = CoachmarkKt.f10086a;
                mutableIntState.i((int) (((IntSize) obj).f2202a & 4294967295L));
                return unit;
            default:
                Density offset = (Density) obj;
                Intrinsics.h(offset, "$this$offset");
                return new IntOffset((0 << 32) | (mutableIntState.d() & 4294967295L));
        }
    }
}
