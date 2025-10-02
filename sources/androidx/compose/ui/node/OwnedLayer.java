package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface OwnedLayer {
    void a(Function2 function2, Function0 function0);

    void b(Canvas canvas, GraphicsLayer graphicsLayer);

    void c(MutableRect mutableRect, boolean z);

    void d(float[] fArr);

    void destroy();

    long e(long j, boolean z);

    void f(long j);

    boolean g(long j);

    /* renamed from: getUnderlyingMatrix-sQKQjiQ, reason: not valid java name */
    float[] mo2getUnderlyingMatrixsQKQjiQ();

    void h(ReusableGraphicsLayerScope reusableGraphicsLayerScope);

    void i(float[] fArr);

    void invalidate();

    void j(long j);

    void k();
}
