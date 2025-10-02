package androidx.compose.material;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnackbarKt {
    public static final float c;
    public static final float f;

    /* renamed from: a, reason: collision with root package name */
    public static final float f1328a = 30;
    public static final float b = 16;
    public static final float d = 2;
    public static final float e = 6;
    public static final float g = 12;
    public static final float h = 48;
    public static final float i = 68;

    static {
        float f2 = 8;
        c = f2;
        f = f2;
    }

    public static final void a(final Modifier modifier, final Function2 function2, final Shape shape, final long j, final long j2, final float f2, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i2) {
        int i3;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-558258760);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.p(false) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerImplV.n(shape) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.s(j) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerImplV.s(j2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= composerImplV.q(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if (composerImplV.z(i3 & 1, (4793491 & i3) != 4793490)) {
            composerImplV.u0();
            if ((i2 & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            int i4 = i3 >> 6;
            composerImpl = composerImplV;
            SurfaceKt.a(modifier, shape, j, j2, null, f2, ComposableLambdaKt.c(-2084221700, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ProvidedValue providedValueB = ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.b(composer2)));
                        final Function2 function22 = function2;
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(1939362236, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    TextStyle textStyle = MaterialTheme.c(composer3).j;
                                    final Function2 function23 = function22;
                                    final ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl2;
                                    TextKt.a(textStyle, ComposableLambdaKt.c(225114541, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt.Snackbar.1.1.1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public final Object invoke(Object obj5, Object obj6) {
                                            Composer composer4 = (Composer) obj5;
                                            int iIntValue3 = ((Number) obj6).intValue();
                                            if (composer4.z(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                                                Function2 function24 = function23;
                                                if (function24 == null) {
                                                    composer4.o(1850968129);
                                                    SnackbarKt.e(0, composer4, composableLambdaImpl4);
                                                    composer4.l();
                                                } else {
                                                    composer4.o(1850972359);
                                                    SnackbarKt.d(0, composer4, composableLambdaImpl4, function24);
                                                    composer4.l();
                                                }
                                            } else {
                                                composer4.j();
                                            }
                                            return Unit.f24250a;
                                        }
                                    }, composer3), composer3, 48);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 56);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, 1572864 | (i3 & 14) | (i4 & 112) | (i4 & 896) | (i4 & 7168) | ((i3 >> 3) & 458752), 16);
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.a(modifier, function2, shape, j, j2, f2, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final SnackbarData snackbarData, Modifier modifier, Shape shape, long j, long j2, long j3, float f2, Composer composer, final int i2, final int i3) {
        int i4;
        final long jG;
        final long jG2;
        final long jG3;
        ComposerImpl composerImpl;
        final Modifier modifier2;
        final Shape shape2;
        final float f3;
        int i5;
        int i6;
        int i7;
        float f4;
        long j4;
        long j5;
        Shape shape3;
        int i8;
        ComposableLambdaImpl composableLambdaImplC;
        ComposerImpl composerImplV = composer.v(258660814);
        if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerImplV.n(snackbarData) : composerImplV.I(snackbarData) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i9 = i4 | 432;
        if ((i2 & 3072) == 0) {
            i9 = i4 | 1456;
        }
        if ((i2 & 24576) == 0) {
            jG = j;
            i9 |= ((i3 & 16) == 0 && composerImplV.s(jG)) ? 16384 : 8192;
        } else {
            jG = j;
        }
        if ((196608 & i2) == 0) {
            jG2 = j2;
            i9 |= ((i3 & 32) == 0 && composerImplV.s(jG2)) ? 131072 : 65536;
        } else {
            jG2 = j2;
        }
        if ((1572864 & i2) == 0) {
            jG3 = j3;
            i9 |= ((i3 & 64) == 0 && composerImplV.s(jG3)) ? 1048576 : 524288;
        } else {
            jG3 = j3;
        }
        int i10 = i9 | 12582912;
        if (composerImplV.z(i10 & 1, (4793491 & i10) != 4793490)) {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                RoundedCornerShape roundedCornerShape = MaterialTheme.b(composerImplV).f1321a;
                i5 = 12582912;
                int i11 = i10 & (-7169);
                if ((i3 & 16) != 0) {
                    i6 = -3670017;
                    i7 = -458753;
                    jG = ColorKt.g(Color.b(MaterialTheme.a(composerImplV).d(), 0.8f), MaterialTheme.a(composerImplV).g());
                    i11 = i10 & (-64513);
                } else {
                    i6 = -3670017;
                    i7 = -458753;
                }
                if ((i3 & 32) != 0) {
                    jG2 = MaterialTheme.a(composerImplV).g();
                    i11 &= i7;
                }
                if ((i3 & 64) != 0) {
                    Colors colorsA = MaterialTheme.a(composerImplV);
                    jG3 = colorsA.h() ? ColorKt.g(Color.b(colorsA.g(), 0.6f), colorsA.e()) : ((Color) ((SnapshotMutableStateImpl) colorsA.b).getD()).f1766a;
                    i11 &= i6;
                }
                f4 = 6;
                j4 = jG;
                j5 = jG2;
                shape3 = roundedCornerShape;
                i8 = i11;
                modifier2 = Modifier.Companion.d;
            } else {
                composerImplV.j();
                i8 = i10 & (-7169);
                if ((i3 & 16) != 0) {
                    i8 = i10 & (-64513);
                }
                if ((i3 & 32) != 0) {
                    i8 &= -458753;
                }
                if ((i3 & 64) != 0) {
                    i8 &= -3670017;
                }
                shape3 = shape;
                f4 = f2;
                i5 = 12582912;
                j4 = jG;
                j5 = jG2;
                modifier2 = modifier;
            }
            composerImplV.W();
            final String b2 = snackbarData.getB();
            if (b2 != null) {
                composerImplV.o(1609221416);
                composableLambdaImplC = ComposableLambdaKt.c(1843479216, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f1248a;
                            ButtonColors buttonColorsD = ButtonDefaults.d(0L, jG3, 0L, composer2, 5);
                            final SnackbarData snackbarData2 = snackbarData;
                            boolean zI = composer2.I(snackbarData2);
                            Object objG = composer2.G();
                            if (zI || objG == Composer.Companion.f1624a) {
                                objG = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1$1$1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        snackbarData2.a();
                                        return Unit.f24250a;
                                    }
                                };
                                composer2.A(objG);
                            }
                            Function0 function0 = (Function0) objG;
                            final String str = b2;
                            ButtonKt.c(function0, null, false, null, null, null, buttonColorsD, null, ComposableLambdaKt.c(-929149933, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$actionComposable$1.2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    Composer composer3 = (Composer) obj4;
                                    int iIntValue2 = ((Number) obj5).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        TextKt.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer3, 0, 0, 131070);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 805306368, 382);
                        } else {
                            composer2.j();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV);
                composerImplV.V(false);
            } else {
                composerImplV.o(1609519419);
                composerImplV.V(false);
                composableLambdaImplC = null;
            }
            composerImpl = composerImplV;
            a(PaddingKt.f(modifier2, 12), composableLambdaImplC, shape3, j4, j5, f4, ComposableLambdaKt.c(-261845785, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        TextKt.b(snackbarData.getF1327a(), null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i8 & 896) | i5 | (57344 & i8) | (458752 & i8) | ((i8 >> 3) & 3670016));
            shape2 = shape3;
            jG = j4;
            jG2 = j5;
            f3 = f4;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            modifier2 = modifier;
            shape2 = shape;
            f3 = f2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.b(snackbarData, modifier2, shape2, jG, jG2, jG3, f3, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1), i3);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final int i2, Composer composer, final ComposableLambdaImpl composableLambdaImpl, final Function2 function2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-1229075900);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if (composerImplV.z(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierE = SizeKt.e(companion, 1.0f);
            float f2 = d;
            float f3 = b;
            float f4 = c;
            Modifier modifierJ = PaddingKt.j(modifierE, f3, BitmapDescriptorFactory.HUE_RED, f4, f2, 2);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            Modifier modifierJ2 = PaddingKt.j(AlignmentLineKt.c(f1328a, g), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, 11);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ2);
            composerImplV.i();
            int i6 = i3;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            a.y(i6 & 14, composableLambdaImpl, composerImplV, true);
            Modifier modifierB = ColumnScopeInstance.f948a.b(companion, Alignment.Companion.o);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function24);
            }
            Updater.b(composerImplV, modifierD3, function25);
            function2.invoke(composerImplV, Integer.valueOf((i6 >> 3) & 14));
            composerImplV.V(true);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$NewLineButtonSnackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.c(RecomposeScopeImplKt.a(i2 | 1), (Composer) obj, composableLambdaImpl, function2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final int i2, Composer composer, final ComposableLambdaImpl composableLambdaImpl, final Function2 function2) {
        int i3;
        ComposerImpl composerImplV = composer.v(-534813202);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.I(function2) ? 32 : 16;
        }
        if (composerImplV.z(i3 & 1, (i3 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, b, BitmapDescriptorFactory.HUE_RED, c, BitmapDescriptorFactory.HUE_RED, 10);
            Object objG = composerImplV.G();
            if (objG == Composer.Companion.f1624a) {
                objG = new SnackbarKt$OneRowSnackbar$2$1();
                composerImplV.A(objG);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objG;
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function22 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicy, function22);
            Function2 function23 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function23);
            Function2 function24 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function24);
            }
            Function2 function25 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function25);
            Modifier modifierH = PaddingKt.h(LayoutIdKt.b(companion, TextBundle.TEXT_ENTRY), BitmapDescriptorFactory.HUE_RED, e, 1);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            int i6 = i3;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function24);
            }
            Updater.b(composerImplV, modifierD2, function25);
            a.y(i6 & 14, composableLambdaImpl, composerImplV, true);
            Modifier modifierB = LayoutIdKt.b(companion, UrlHandler.ACTION);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function22);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function23);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                b.B(i7, composerImplV, i7, function24);
            }
            Updater.b(composerImplV, modifierD3, function25);
            function2.invoke(composerImplV, Integer.valueOf((i6 >> 3) & 14));
            composerImplV.V(true);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$OneRowSnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.d(RecomposeScopeImplKt.a(i2 | 1), (Composer) obj, composableLambdaImpl, function2);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void e(final int i2, Composer composer, final ComposableLambdaImpl composableLambdaImpl) {
        int i3;
        ComposerImpl composerImplV = composer.v(917397959);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (composerImplV.z(i3 & 1, (i3 & 3) != 2)) {
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierD = ComposedModifierKt.d(composerImplV, companion);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function2 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, SnackbarKt$TextOnlySnackbar$2.f1329a, function2);
            Function2 function22 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function22);
            Function2 function23 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function23);
            }
            Function2 function24 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function24);
            Modifier modifierG = PaddingKt.g(companion, b, e);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierG);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function2);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function22);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function23);
            }
            Updater.b(composerImplV, modifierD2, function24);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf(i3 & 14));
            composerImplV.V(true);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarKt$TextOnlySnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.e(RecomposeScopeImplKt.a(i2 | 1), (Composer) obj, composableLambdaImpl);
                    return Unit.f24250a;
                }
            };
        }
    }
}
