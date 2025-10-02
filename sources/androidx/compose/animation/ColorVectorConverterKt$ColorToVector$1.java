package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorVectorConverterKt$ColorToVector$1 extends Lambda implements Function1<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 h = new ColorVectorConverterKt$ColorToVector$1(1);

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "color", "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    final class AnonymousClass1 extends Lambda implements Function1<Color, AnimationVector4D> {
        public static final AnonymousClass1 h = new AnonymousClass1(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            long jA = Color.a(((Color) obj).f1766a, ColorSpaces.x);
            return new AnimationVector4D(Color.d(jA), Color.h(jA), Color.g(jA), Color.e(jA));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        final ColorSpace colorSpace = (ColorSpace) obj;
        return VectorConvertersKt.a(AnonymousClass1.h, new Function1<AnimationVector4D, Color>() { // from class: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                AnimationVector4D animationVector4D = (AnimationVector4D) obj2;
                float f = animationVector4D.b;
                float f2 = BitmapDescriptorFactory.HUE_RED;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    f = 0.0f;
                }
                if (f > 1.0f) {
                    f = 1.0f;
                }
                float f3 = animationVector4D.c;
                if (f3 < -0.5f) {
                    f3 = -0.5f;
                }
                if (f3 > 0.5f) {
                    f3 = 0.5f;
                }
                float f4 = animationVector4D.d;
                float f5 = f4 >= -0.5f ? f4 : -0.5f;
                float f6 = f5 <= 0.5f ? f5 : 0.5f;
                float f7 = animationVector4D.f748a;
                if (f7 >= BitmapDescriptorFactory.HUE_RED) {
                    f2 = f7;
                }
                return new Color(Color.a(ColorKt.a(f, f3, f6, f2 <= 1.0f ? f2 : 1.0f, ColorSpaces.x), colorSpace));
            }
        });
    }
}
