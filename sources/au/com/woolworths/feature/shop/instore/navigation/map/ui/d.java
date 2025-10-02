package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ State e;

    public /* synthetic */ d(State state, int i) {
        this.d = i;
        this.e = state;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        State state = this.e;
        switch (i) {
            case 0:
                Density offset = (Density) obj;
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$1 = InstoreMapScreenKt.f7385a;
                Intrinsics.h(offset, "$this$offset");
                return new IntOffset((0 << 32) | (offset.r1(((Dp) state.getD()).d) & 4294967295L));
            case 1:
                Density offset2 = (Density) obj;
                InstoreMapScreenKt$EmptyCallbacks$1 instoreMapScreenKt$EmptyCallbacks$12 = InstoreMapScreenKt.f7385a;
                Intrinsics.h(offset2, "$this$offset");
                return new IntOffset((0 << 32) | (offset2.r1(((Dp) state.getD()).d) & 4294967295L));
            case 2:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.b(((Number) state.getD()).floatValue());
                return unit;
            case 3:
                GraphicsLayerScope graphicsLayer2 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.b(((Number) state.getD()).floatValue());
                return unit;
            case 4:
                Density offset3 = (Density) obj;
                Intrinsics.h(offset3, "$this$offset");
                return new IntOffset((offset3.r1(((Dp) state.getD()).d) << 32) | (0 & 4294967295L));
            case 5:
                Density offset4 = (Density) obj;
                Intrinsics.h(offset4, "$this$offset");
                return new IntOffset((offset4.r1(((Dp) state.getD()).d) << 32) | (0 & 4294967295L));
            case 6:
                GraphicsLayerScope graphicsLayer3 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer3, "$this$graphicsLayer");
                graphicsLayer3.b(((Number) state.getD()).floatValue());
                return unit;
            case 7:
                Density offset5 = (Density) obj;
                Intrinsics.h(offset5, "$this$offset");
                return new IntOffset((offset5.r1(((Dp) state.getD()).d) << 32) | (0 & 4294967295L));
            case 8:
                Density offset6 = (Density) obj;
                Intrinsics.h(offset6, "$this$offset");
                return new IntOffset((offset6.r1(((Dp) state.getD()).d) << 32) | (0 & 4294967295L));
            case 9:
                Density offset7 = (Density) obj;
                Intrinsics.h(offset7, "$this$offset");
                return new IntOffset((offset7.r1(((Dp) state.getD()).d) << 32) | (0 & 4294967295L));
            default:
                Density offset8 = (Density) obj;
                Intrinsics.h(offset8, "$this$offset");
                return new IntOffset((offset8.r1(((Dp) state.getD()).d) << 32) | (0 & 4294967295L));
        }
    }
}
