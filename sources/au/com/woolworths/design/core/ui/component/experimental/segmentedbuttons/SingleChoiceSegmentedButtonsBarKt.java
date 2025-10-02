package au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonDefaults;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.ShapesKt;
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.OutlinedSegmentedButtonTokens;
import androidx.compose.material3.tokens.ShapeKeyTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002¨\u0006\u0002²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"", "selectedIndex", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SingleChoiceSegmentedButtonsBarKt {
    public static final void a(final List list, final Function1 onSegmentButtonClick, final int i, Modifier modifier, Composer composer, int i2) {
        Intrinsics.h(onSegmentButtonClick, "onSegmentButtonClick");
        ComposerImpl composerImplV = composer.v(-682795183);
        if ((((composerImplV.I(list) ? 4 : 2) | i2 | (composerImplV.I(onSegmentButtonClick) ? 32 : 16) | (composerImplV.r(i) ? 256 : 128) | 3072) & 1171) == 1170 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (list.isEmpty()) {
                throw new IllegalArgumentException("SingleChoiceSegmentedButtonsBar requires at least one button label");
            }
            SegmentedButtonKt.b(BitmapDescriptorFactory.HUE_RED, ComposableLambdaKt.c(-51250522, new Function3<SingleChoiceSegmentedButtonRowScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.SingleChoiceSegmentedButtonsBarKt$SingleChoiceSegmentedButtonsBar$2
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r11v1, types: [androidx.compose.runtime.Composer] */
                /* JADX WARN: Type inference failed for: r1v23, types: [androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1] */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i3;
                    long j;
                    long j2;
                    boolean z;
                    CornerBasedShape cornerBasedShapeA;
                    SingleChoiceSegmentedButtonRowScope SingleChoiceSegmentedButtonRow = (SingleChoiceSegmentedButtonRowScope) obj;
                    ?? r11 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(SingleChoiceSegmentedButtonRow, "$this$SingleChoiceSegmentedButtonRow");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= r11.n(SingleChoiceSegmentedButtonRow) ? 4 : 2;
                    }
                    int i4 = iIntValue;
                    if ((i4 & 19) == 18 && r11.c()) {
                        r11.j();
                    } else {
                        List list2 = list;
                        int i5 = 0;
                        for (Object obj4 : list2) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                CollectionsKt.z0();
                                throw null;
                            }
                            final String str = (String) obj4;
                            r11.o(-572453002);
                            SegmentedButtonDefaults segmentedButtonDefaults = SegmentedButtonDefaults.f1488a;
                            ColorScheme colorSchemeA = MaterialTheme.a(r11);
                            SegmentedButtonColors segmentedButtonColors = colorSchemeA.P;
                            if (segmentedButtonColors == null) {
                                float f = OutlinedSegmentedButtonTokens.f1595a;
                                ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.t;
                                long jC = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens);
                                long jC2 = ColorSchemeKt.c(colorSchemeA, ColorSchemeKeyTokens.j);
                                ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.n;
                                long jC3 = ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens2);
                                long j3 = colorSchemeA.p;
                                ColorSchemeKeyTokens colorSchemeKeyTokens3 = ColorSchemeKeyTokens.k;
                                i3 = i5;
                                segmentedButtonColors = new SegmentedButtonColors(jC, jC2, jC3, j3, ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens2), ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens), Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), 0.38f), Color.b(ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens2), 0.12f), colorSchemeA.p, ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens3), ColorSchemeKt.c(colorSchemeA, colorSchemeKeyTokens2));
                                colorSchemeA.P = segmentedButtonColors;
                            } else {
                                i3 = i5;
                            }
                            long j4 = CoreTheme.b(r11).e.c.d;
                            long j5 = CoreTheme.b(r11).e.f4848a.e;
                            long j6 = CoreTheme.b(r11).e.b.c;
                            SingleChoiceSegmentedButtonRowScope singleChoiceSegmentedButtonRowScope = SingleChoiceSegmentedButtonRow;
                            long j7 = CoreTheme.b(r11).e.c.d;
                            long j8 = CoreTheme.b(r11).e.f4848a.c;
                            long j9 = CoreTheme.b(r11).e.b.c;
                            long j10 = segmentedButtonColors.g;
                            long j11 = segmentedButtonColors.h;
                            long j12 = segmentedButtonColors.i;
                            long j13 = segmentedButtonColors.j;
                            long j14 = segmentedButtonColors.k;
                            long j15 = segmentedButtonColors.l;
                            if (j5 == 16) {
                                j5 = segmentedButtonColors.f1486a;
                            }
                            if (j4 != 16) {
                                j = j15;
                                j2 = j4;
                            } else {
                                j = j15;
                                j2 = segmentedButtonColors.b;
                            }
                            if (j6 == 16) {
                                j6 = segmentedButtonColors.c;
                            }
                            SegmentedButtonColors segmentedButtonColors2 = new SegmentedButtonColors(j5, j2, j6, j8 != 16 ? j8 : segmentedButtonColors.d, j7 != 16 ? j7 : segmentedButtonColors.e, j9 != 16 ? j9 : segmentedButtonColors.f, j10, j11, j12, j13, j14, j);
                            r11.l();
                            int i7 = i3;
                            boolean z2 = i == i7;
                            int size = list2.size();
                            float f2 = OutlinedSegmentedButtonTokens.f1595a;
                            Shape shapeB = ShapesKt.b(ShapeKeyTokens.g, r11);
                            Intrinsics.f(shapeB, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
                            CornerBasedShape cornerBasedShape = (CornerBasedShape) shapeB;
                            if (size != 1) {
                                if (i7 == 0) {
                                    float f3 = (float) 0.0d;
                                    cornerBasedShapeA = CornerBasedShape.c(cornerBasedShape, null, CornerSizeKt.b(f3), CornerSizeKt.b(f3), null, 9);
                                } else {
                                    cornerBasedShapeA = i7 == size + (-1) ? ShapesKt.a(cornerBasedShape) : RectangleShapeKt.f1779a;
                                }
                                cornerBasedShape = cornerBasedShapeA;
                            }
                            r11.o(-1633490746);
                            Function1 function1 = onSegmentButtonClick;
                            boolean zN = r11.n(function1) | r11.r(i7);
                            Object objG = r11.G();
                            if (zN || objG == Composer.Companion.f1624a) {
                                z = false;
                                objG = new b(i7, 0, function1);
                                r11.A(objG);
                            } else {
                                z = false;
                            }
                            r11.l();
                            SingleChoiceSegmentedButtonRow = singleChoiceSegmentedButtonRowScope;
                            SegmentedButtonKt.a(SingleChoiceSegmentedButtonRow, z2, (Function0) objG, cornerBasedShape, null, false, segmentedButtonColors2, null, null, ComposableLambdaKt.c(-768200100, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.experimental.segmentedbuttons.SingleChoiceSegmentedButtonsBarKt$SingleChoiceSegmentedButtonsBar$2$1$2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj5, Object obj6) {
                                    Composer composer2 = (Composer) obj5;
                                    if ((((Number) obj6).intValue() & 3) == 2 && composer2.c()) {
                                        composer2.j();
                                    } else {
                                        TextKt.b(str, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, CoreTheme.f(composer2).e.b.b, composer2, 0, 0, 65534);
                                    }
                                    return Unit.f24250a;
                                }
                            }, r11), r11, i4 & 14);
                            i5 = i6;
                        }
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 390);
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(list, onSegmentButtonClick, i, modifier2, i2);
        }
    }
}
