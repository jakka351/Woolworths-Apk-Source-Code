package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlurEffect;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class BlurKt {
    public static Modifier a(Modifier modifier, final float f) {
        final int i = 0;
        float f2 = 0;
        if (Float.compare(f, f2) > 0) {
            Float.compare(f, f2);
        }
        final boolean z = true;
        return GraphicsLayerModifierKt.a(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                float fT1 = graphicsLayerScope.T1(f);
                float fT12 = graphicsLayerScope.T1(f);
                graphicsLayerScope.k((fT1 <= BitmapDescriptorFactory.HUE_RED || fT12 <= BitmapDescriptorFactory.HUE_RED) ? null : new BlurEffect(fT1, fT12, i));
                graphicsLayerScope.H0(RectangleShapeKt.f1779a);
                graphicsLayerScope.z(z);
                return Unit.f24250a;
            }
        });
    }
}
