package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ShapesKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1493a = new StaticProvidableCompositionLocal(ShapesKt$LocalShapes$1.h);

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[ShapeKeyTokens.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public static final CornerBasedShape a(CornerBasedShape cornerBasedShape) {
        float f = (float) 0.0d;
        return CornerBasedShape.c(cornerBasedShape, CornerSizeKt.b(f), null, null, CornerSizeKt.b(f), 6);
    }

    public static final Shape b(ShapeKeyTokens shapeKeyTokens, Composer composer) {
        Shapes shapes = (Shapes) composer.x(f1493a);
        switch (shapeKeyTokens.ordinal()) {
            case 0:
                return shapes.e;
            case 1:
                return c(shapes.e);
            case 2:
                return shapes.f1492a;
            case 3:
                return c(shapes.f1492a);
            case 4:
                return RoundedCornerShapeKt.f1100a;
            case 5:
                return shapes.d;
            case 6:
                return a(shapes.d);
            case 7:
                return c(shapes.d);
            case 8:
                return shapes.c;
            case 9:
                return RectangleShapeKt.f1779a;
            case 10:
                return shapes.b;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final CornerBasedShape c(CornerBasedShape cornerBasedShape) {
        float f = (float) 0.0d;
        return CornerBasedShape.c(cornerBasedShape, null, null, CornerSizeKt.b(f), CornerSizeKt.b(f), 3);
    }
}
