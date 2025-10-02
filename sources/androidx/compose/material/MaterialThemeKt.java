package androidx.compose.material;

import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MaterialThemeKt {
    public static final void a(final Colors colors, Typography typography, Shapes shapes, ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        final Typography typography2;
        final ComposableLambdaImpl composableLambdaImpl2;
        ComposerImpl composerImpl;
        Shapes shapes2;
        Shapes shapesB;
        Shapes shapes3;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        ComposerImpl composerImplV = composer.v(-891417079);
        int i2 = (composerImplV.n(colors) ? 4 : 2) | i | (composerImplV.n(typography) ? 32 : 16) | 128;
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 2048 : 1024;
        }
        if (composerImplV.z(i2 & 1, (i2 & 1171) != 1170)) {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                shapesB = MaterialTheme.b(composerImplV);
            } else {
                composerImplV.j();
                shapesB = shapes;
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$12) {
                composerImpl = composerImplV;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
                shapes3 = shapesB;
                objG = Colors.a(colors, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 8191);
                composerImpl.A(objG);
            } else {
                composerImpl = composerImplV;
                shapes3 = shapesB;
                composer$Companion$Empty$1 = composer$Companion$Empty$12;
            }
            Colors colors2 = (Colors) objG;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ColorsKt.f1254a;
            ((SnapshotMutableStateImpl) colors2.f1253a).setValue(new Color(colors.e()));
            ((SnapshotMutableStateImpl) colors2.b).setValue(new Color(((Color) ((SnapshotMutableStateImpl) colors.b).getD()).f1766a));
            ((SnapshotMutableStateImpl) colors2.c).setValue(new Color(colors.f()));
            ((SnapshotMutableStateImpl) colors2.d).setValue(new Color(((Color) ((SnapshotMutableStateImpl) colors.d).getD()).f1766a));
            ((SnapshotMutableStateImpl) colors2.e).setValue(new Color(colors.b()));
            ((SnapshotMutableStateImpl) colors2.f).setValue(new Color(colors.g()));
            ((SnapshotMutableStateImpl) colors2.g).setValue(new Color(colors.c()));
            ((SnapshotMutableStateImpl) colors2.h).setValue(new Color(((Color) ((SnapshotMutableStateImpl) colors.h).getD()).f1766a));
            ((SnapshotMutableStateImpl) colors2.i).setValue(new Color(((Color) ((SnapshotMutableStateImpl) colors.i).getD()).f1766a));
            ((SnapshotMutableStateImpl) colors2.j).setValue(new Color(((Color) ((SnapshotMutableStateImpl) colors.j).getD()).f1766a));
            ((SnapshotMutableStateImpl) colors2.k).setValue(new Color(colors.d()));
            ((SnapshotMutableStateImpl) colors2.l).setValue(new Color(((Color) ((SnapshotMutableStateImpl) colors.l).getD()).f1766a));
            ((SnapshotMutableStateImpl) colors2.m).setValue(Boolean.valueOf(colors.h()));
            IndicationNodeFactory indicationNodeFactoryB = RippleKt.b(BitmapDescriptorFactory.HUE_RED, 7, 0L, false);
            long jE = colors2.e();
            long jB = colors2.b();
            composerImpl.o(1102762852);
            long jA = ColorsKt.a(colors2, jB);
            if (jA == 16) {
                jA = ((Color) composerImpl.x(ContentColorKt.f1261a)).f1766a;
            }
            composerImpl.V(false);
            long jB2 = Color.b(jA, ContentAlpha.c(composerImpl, 6));
            boolean zS = composerImpl.s(jE) | composerImpl.s(jB) | composerImpl.s(jB2);
            Object objG2 = composerImpl.G();
            if (zS || objG2 == composer$Companion$Empty$1) {
                long jE2 = colors2.e();
                float fA = MaterialTextSelectionColorsKt.a(jE, jB2, jB, 0.4f);
                float fA2 = MaterialTextSelectionColorsKt.a(jE, jB2, jB, 0.2f);
                float f = 0.4f;
                if (fA < 4.5f) {
                    float f2 = 0.2f;
                    if (fA2 < 4.5f) {
                        f = 0.2f;
                    } else {
                        float f3 = 0.4f;
                        for (int i3 = 0; i3 < 7; i3++) {
                            float fA3 = (MaterialTextSelectionColorsKt.a(jE, jB2, jB, f3) / 4.5f) - 1.0f;
                            if (BitmapDescriptorFactory.HUE_RED <= fA3 && fA3 <= 0.01f) {
                                break;
                            }
                            if (fA3 < BitmapDescriptorFactory.HUE_RED) {
                                f = f3;
                            } else {
                                f2 = f3;
                            }
                            f3 = (f + f2) / 2.0f;
                        }
                        f = f3;
                    }
                }
                objG2 = new TextSelectionColors(jE2, Color.b(jE, f));
                composerImpl.A(objG2);
            }
            shapes2 = shapes3;
            typography2 = typography;
            composableLambdaImpl2 = composableLambdaImpl;
            CompositionLocalKt.b(new ProvidedValue[]{ColorsKt.f1254a.b(colors2), ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.b(composerImpl))), IndicationKt.f838a.b(indicationNodeFactoryB), ShapesKt.f1322a.b(shapes2), TextSelectionColorsKt.f1228a.b((TextSelectionColors) objG2), TypographyKt.b.b(typography2)}, ComposableLambdaKt.c(-1740102967, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        TextStyle textStyle = typography2.i;
                        final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                        TextKt.a(textStyle, ComposableLambdaKt.c(181426554, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$1.1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    MaterialTheme_androidKt.a(0, composer3, composableLambdaImpl3);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 48);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImpl), composerImpl, 56);
        } else {
            typography2 = typography;
            composableLambdaImpl2 = composableLambdaImpl;
            composerImpl = composerImplV;
            composerImpl.j();
            shapes2 = shapes;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            final Typography typography3 = typography2;
            final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
            final Shapes shapes4 = shapes2;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.MaterialThemeKt$MaterialTheme$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    MaterialThemeKt.a(colors, typography3, shapes4, composableLambdaImpl3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
