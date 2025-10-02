package nl.dionsegijn.konfetti.compose;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Particle;
import nl.dionsegijn.konfetti.core.models.Shape;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"compose_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawShapesKt {
    public static void a(Shape shape, DrawScope drawScope, Particle particle) {
        Intrinsics.h(shape, "<this>");
        Intrinsics.h(drawScope, "drawScope");
        float f = particle.b;
        float f2 = particle.f26634a;
        float f3 = particle.c;
        int i = particle.e;
        if (shape.equals(Shape.Circle.f26644a)) {
            float f4 = f3 / 2;
            DrawScope.j0(drawScope, ColorKt.b(i), f4, OffsetKt.a(f2 + f4, f + f4), null, 0, 120);
            return;
        }
        if (shape.equals(Shape.Square.f26646a)) {
            DrawScope.S(drawScope, ColorKt.b(i), OffsetKt.a(f2, f), SizeKt.a(f3, particle.d), BitmapDescriptorFactory.HUE_RED, null, null, 120);
            return;
        }
        if (shape instanceof Shape.Rectangle) {
            DrawScope.S(drawScope, ColorKt.b(i), OffsetKt.a(f2, f), SizeKt.a(f3, BitmapDescriptorFactory.HUE_RED * f3), BitmapDescriptorFactory.HUE_RED, null, null, 120);
            return;
        }
        if (shape instanceof Shape.DrawableShape) {
            Canvas canvasA = drawScope.getE().a();
            Shape.DrawableShape drawableShape = (Shape.DrawableShape) shape;
            Drawable drawable = drawableShape.f26645a;
            if (!drawableShape.b) {
                drawable.setAlpha((particle.i << 24) | (i & 16777215));
            } else if (Build.VERSION.SDK_INT >= 29) {
                drawable.setColorFilter(new BlendModeColorFilter(i, BlendMode.SRC_IN));
            } else {
                drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            }
            int i2 = (int) (drawableShape.c * f3);
            int i3 = (int) ((f3 - i2) / 2.0f);
            int i4 = (int) f;
            int i5 = (int) f2;
            drawable.setBounds(i5, i3 + i4, ((int) f3) + i5, i3 + i2 + i4);
            drawable.draw(AndroidCanvas_androidKt.a(canvasA));
        }
    }
}
