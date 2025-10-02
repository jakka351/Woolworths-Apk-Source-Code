package coil3.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import coil3.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil3/compose/ImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "coil-compose-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ImagePainter extends Painter {
    public final Image i;

    public ImagePainter(Image image) {
        this.i = image;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: f */
    public final long getL() {
        Image image = this.i;
        int width = image.getWidth();
        float f = width > 0 ? width : Float.NaN;
        int height = image.getHeight();
        return SizeKt.a(f, height > 0 ? height : Float.NaN);
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void h(DrawScope drawScope) {
        Image image = this.i;
        int width = image.getWidth();
        float fD = width > 0 ? Size.d(drawScope.h()) / width : 1.0f;
        int height = image.getHeight();
        float fB = height > 0 ? Size.b(drawScope.h()) / height : 1.0f;
        CanvasDrawScope$drawContext$1 e = drawScope.getE();
        long jD = e.d();
        e.a().save();
        try {
            e.f1798a.e(0L, fD, fB);
            image.b(AndroidCanvas_androidKt.a(drawScope.getE().a()));
        } finally {
            androidx.camera.core.impl.b.C(e, jD);
        }
    }
}
