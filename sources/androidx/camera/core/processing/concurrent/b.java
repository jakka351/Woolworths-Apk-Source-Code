package androidx.camera.core.processing.concurrent;

import androidx.camera.core.DynamicRange;
import androidx.camera.core.LayoutSettings;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericInlineErrorStateBinding;
import au.com.woolworths.android.onesite.epoxy.GenericInlineErrorStateEpoxyModel;
import au.com.woolworths.compose.utils.modifier.h;
import au.com.woolworths.design.core.ui.component.stable.broadcastbanner.BroadcastBannerKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function3 {
    public final /* synthetic */ int d;

    public /* synthetic */ b(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        switch (i) {
            case 0:
                return new DualSurfaceProcessor((DynamicRange) obj, (LayoutSettings) obj2, (LayoutSettings) obj3);
            case 1:
                ((Integer) obj3).intValue();
                Intrinsics.h((GenericInlineErrorStateEpoxyModel) obj, "<unused var>");
                Intrinsics.h((IncludeGenericInlineErrorStateBinding) obj2, "<unused var>");
                return unit;
            case 2:
                MeasureScope layout = (MeasureScope) obj;
                Measurable measurable = (Measurable) obj2;
                float f = BroadcastBannerKt.f4745a;
                Intrinsics.h(layout, "$this$layout");
                Intrinsics.h(measurable, "measurable");
                Placeable placeableC0 = measurable.c0(((Constraints) obj3).f2197a);
                return layout.L0(placeableC0.d, placeableC0.e, EmptyMap.d, new h(placeableC0, 1));
            case 3:
                Path GenericShape = (Path) obj;
                Size size = (Size) obj2;
                Intrinsics.h(GenericShape, "$this$GenericShape");
                Intrinsics.h((LayoutDirection) obj3, "<unused var>");
                GenericShape.b(Float.intBitsToFloat((int) (size.f1754a >> 32)), BitmapDescriptorFactory.HUE_RED);
                GenericShape.b(Float.intBitsToFloat((int) (size.f1754a >> 32)), Float.MAX_VALUE);
                GenericShape.b(BitmapDescriptorFactory.HUE_RED, Float.MAX_VALUE);
                return unit;
            case 4:
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h((String) obj2, "<unused var>");
                Intrinsics.h((String) obj3, "<unused var>");
                return unit;
            case 5:
                Path GenericShape2 = (Path) obj;
                Size size2 = (Size) obj2;
                Intrinsics.h(GenericShape2, "$this$GenericShape");
                Intrinsics.h((LayoutDirection) obj3, "<unused var>");
                GenericShape2.b(Float.intBitsToFloat((int) (size2.f1754a >> 32)), BitmapDescriptorFactory.HUE_RED);
                GenericShape2.b(Float.intBitsToFloat((int) (size2.f1754a >> 32)), Float.MAX_VALUE);
                GenericShape2.b(BitmapDescriptorFactory.HUE_RED, Float.MAX_VALUE);
                return unit;
            default:
                MeasureScope layout2 = (MeasureScope) obj;
                Measurable measurable2 = (Measurable) obj2;
                Intrinsics.h(layout2, "$this$layout");
                Intrinsics.h(measurable2, "measurable");
                Placeable placeableC02 = measurable2.c0(((Constraints) obj3).f2197a);
                return layout2.L0(placeableC02.d, placeableC02.e - layout2.W1(TextUnitKt.c(5)), EmptyMap.d, new h(placeableC02, 4));
        }
    }
}
