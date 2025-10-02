package au.com.woolworths.dynamic.page.ui.content;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;

    public /* synthetic */ o(float f, int i) {
        this.d = i;
        this.e = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                GraphicsLayerScope graphicsLayer = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer, "$this$graphicsLayer");
                graphicsLayer.c(this.e);
                break;
            case 1:
                GraphicsLayerScope graphicsLayer2 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer2, "$this$graphicsLayer");
                graphicsLayer2.c(((1 - this.e) * Float.intBitsToFloat((int) (graphicsLayer2.getT() & 4294967295L))) / 4);
                break;
            case 2:
                GraphicsLayerScope graphicsLayer3 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer3, "$this$graphicsLayer");
                graphicsLayer3.c(((1 - this.e) * Float.intBitsToFloat((int) (graphicsLayer3.getT() & 4294967295L))) / 4);
                break;
            case 3:
                Modifier conditional = (Modifier) obj;
                Intrinsics.h(conditional, "$this$conditional");
                break;
            case 4:
                GraphicsLayerScope graphicsLayer4 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer4, "$this$graphicsLayer");
                graphicsLayer4.c(((1 - this.e) * Float.intBitsToFloat((int) (graphicsLayer4.getT() & 4294967295L))) / 4);
                break;
            case 5:
                Modifier conditional2 = (Modifier) obj;
                Intrinsics.h(conditional2, "$this$conditional");
                break;
            case 6:
                Modifier conditional3 = (Modifier) obj;
                Intrinsics.h(conditional3, "$this$conditional");
                break;
            case 7:
                GraphicsLayerScope graphicsLayer5 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer5, "$this$graphicsLayer");
                graphicsLayer5.b(this.e);
                break;
            case 8:
                GraphicsLayerScope graphicsLayer6 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer6, "$this$graphicsLayer");
                graphicsLayer6.b(this.e);
                break;
            case 9:
                GraphicsLayerScope graphicsLayer7 = (GraphicsLayerScope) obj;
                Intrinsics.h(graphicsLayer7, "$this$graphicsLayer");
                graphicsLayer7.b(this.e);
                break;
            default:
                KeyframesSpec.KeyframesSpecConfig keyframes = (KeyframesSpec.KeyframesSpecConfig) obj;
                Intrinsics.h(keyframes, "$this$keyframes");
                keyframes.f765a = 350;
                keyframes.a(200, Float.valueOf(this.e * 1.1f));
                break;
        }
        return Unit.f24250a;
    }
}
