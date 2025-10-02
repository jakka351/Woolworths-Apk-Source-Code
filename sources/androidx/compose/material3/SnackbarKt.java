package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.material3.tokens.SnackbarTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SnackbarKt {
    public static final float d;
    public static final float g;

    /* renamed from: a, reason: collision with root package name */
    public static final float f1502a = 600;
    public static final float b = 30;
    public static final float c = 16;
    public static final float e = 2;
    public static final float f = 6;
    public static final float h = 12;

    static {
        float f2 = 8;
        d = f2;
        g = f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final androidx.compose.ui.Modifier r26, final kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function2 r28, final boolean r29, final androidx.compose.ui.graphics.Shape r30, final long r31, final long r33, final long r35, long r37, final androidx.compose.runtime.internal.ComposableLambdaImpl r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SnackbarKt.a(androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.ui.graphics.Shape, long, long, long, long, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final SnackbarData snackbarData, Modifier modifier, Shape shape, long j, long j2, long j3, long j4, long j5, Composer composer, final int i) {
        int i2;
        long jD;
        Modifier modifier2;
        Shape shape2;
        int i3;
        long j6;
        long j7;
        long j8;
        long j9;
        ComposerImpl composerImpl;
        final Modifier modifier3;
        final long j10;
        final Shape shape3;
        final long j11;
        final long j12;
        final long j13;
        final long j14;
        ComposerImpl composerImplV = composer.v(274621471);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(snackbarData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if ((38347923 & i4) == 38347922 && composerImplV.c()) {
            composerImplV.j();
            modifier3 = modifier;
            shape3 = shape;
            j11 = j;
            j12 = j2;
            j10 = j3;
            j13 = j4;
            j14 = j5;
            composerImpl = composerImplV;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                Shape shapeB = ShapesKt.b(SnackbarTokens.b, composerImplV);
                long jD2 = ColorSchemeKt.d(ColorSchemeKeyTokens.g, composerImplV);
                long jD3 = ColorSchemeKt.d(SnackbarTokens.d, composerImplV);
                ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.f;
                jD = ColorSchemeKt.d(colorSchemeKeyTokens, composerImplV);
                long jD4 = ColorSchemeKt.d(colorSchemeKeyTokens, composerImplV);
                long jD5 = ColorSchemeKt.d(SnackbarTokens.c, composerImplV);
                modifier2 = Modifier.Companion.d;
                shape2 = shapeB;
                i3 = i4 & (-268434433);
                j6 = jD2;
                j7 = jD3;
                j8 = jD4;
                j9 = jD5;
            } else {
                composerImplV.j();
                i3 = i4 & (-268434433);
                modifier2 = modifier;
                shape2 = shape;
                j6 = j;
                j7 = j2;
                jD = j3;
                j8 = j4;
                j9 = j5;
            }
            composerImplV.W();
            snackbarData.b().getClass();
            composerImplV.o(1561344786);
            composerImplV.V(false);
            composerImplV.o(1561358724);
            snackbarData.b().getClass();
            composerImplV.V(false);
            composerImpl = composerImplV;
            a(PaddingKt.f(modifier2, 12), null, null, false, shape2, j6, j7, j8, j9, ComposableLambdaKt.c(-1266389126, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$3
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        snackbarData.b().getClass();
                        TextKt.b(null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, ((i3 << 3) & 7168) | 805306368, 0);
            modifier3 = modifier2;
            j10 = jD;
            shape3 = shape2;
            j11 = j6;
            j12 = j7;
            j13 = j8;
            j14 = j9;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$Snackbar$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    SnackbarKt.b(snackbarData, modifier3, shape3, j11, j12, j10, j13, j14, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(final ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function2 function22, TextStyle textStyle, final long j, long j2, Composer composer, final int i) {
        int i2;
        boolean z;
        float f2;
        TextStyle textStyle2;
        Function2 function23;
        Function2 function24;
        long j3;
        ComposerImpl composerImplV = composer.v(-1332496681);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.s(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.s(j2) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            function23 = function2;
            function24 = function22;
            textStyle2 = textStyle;
            j3 = j2;
        } else {
            float f3 = f1502a;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(SizeKt.e(SizeKt.w(companion, BitmapDescriptorFactory.HUE_RED, f3, 1), 1.0f), c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, e, 6);
            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composerImplV, 0);
            int i3 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierJ);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            int i4 = i2;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, columnMeasurePolicyA, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i3))) {
                androidx.camera.core.impl.b.B(i3, composerImplV, i3, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            Modifier modifierC = AlignmentLineKt.c(b, h);
            float f4 = d;
            Modifier modifierJ2 = PaddingKt.j(modifierC, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f4, BitmapDescriptorFactory.HUE_RED, 11);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierJ2);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function27);
            }
            Updater.b(composerImplV, modifierD2, function28);
            android.support.v4.media.session.a.y(i4 & 14, composableLambdaImpl, composerImplV, true);
            Modifier modifierB = ColumnScopeInstance.f948a.b(companion, Alignment.Companion.o);
            if (function22 == null) {
                f2 = f4;
                z = false;
            } else {
                z = false;
                f2 = 0;
            }
            Modifier modifierJ3 = PaddingKt.j(modifierB, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 11);
            MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, z);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
            Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierJ3);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD2, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ3, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function27);
            }
            Updater.b(composerImplV, modifierD3, function28);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.j, composerImplV, 0);
            int i7 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
            Modifier modifierD4 = ComposedModifierKt.d(composerImplV, companion);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ4, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                androidx.camera.core.impl.b.B(i7, composerImplV, i7, function27);
            }
            Updater.b(composerImplV, modifierD4, function28);
            DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = ContentColorKt.f1427a;
            textStyle2 = textStyle;
            function23 = function2;
            CompositionLocalKt.b(new ProvidedValue[]{androidx.camera.core.impl.b.g(j, dynamicProvidableCompositionLocal), TextKt.f1518a.b(textStyle2)}, function23, composerImplV, (i4 & 112) | 8);
            composerImplV.o(618603253);
            if (function22 != null) {
                j3 = j2;
                function24 = function22;
                CompositionLocalKt.a(androidx.camera.core.impl.b.g(j3, dynamicProvidableCompositionLocal), function24, composerImplV, 8 | ((i4 >> 3) & 112));
            } else {
                function24 = function22;
                j3 = j2;
            }
            composerImplV.V(false);
            composerImplV.V(true);
            composerImplV.V(true);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final long j4 = j3;
            final TextStyle textStyle3 = textStyle2;
            final Function2 function29 = function23;
            final Function2 function210 = function24;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$NewLineButtonSnackbar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.c(composableLambdaImpl, function29, function210, textStyle3, j, j4, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void d(final ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function2 function22, TextStyle textStyle, final long j, long j2, Composer composer, final int i) {
        int i2;
        Function2 function23;
        TextStyle textStyle2;
        int i3;
        Function2 function24;
        long j3;
        boolean z;
        ComposerImpl composerImplV = composer.v(-903235475);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function22) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(textStyle) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.s(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.s(j2) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerImplV.c()) {
            composerImplV.j();
            function23 = function2;
            function24 = function22;
            textStyle2 = textStyle;
            j3 = j2;
        } else {
            float f2 = function22 == null ? d : 0;
            Modifier.Companion companion = Modifier.Companion.d;
            Modifier modifierJ = PaddingKt.j(companion, c, BitmapDescriptorFactory.HUE_RED, f2, BitmapDescriptorFactory.HUE_RED, 10);
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
            int i5 = i2;
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Function2 function25 = ComposeUiNode.Companion.g;
            Updater.b(composerImplV, measurePolicy, function25);
            Function2 function26 = ComposeUiNode.Companion.f;
            Updater.b(composerImplV, persistentCompositionLocalMapQ, function26);
            Function2 function27 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                androidx.camera.core.impl.b.B(i4, composerImplV, i4, function27);
            }
            Function2 function28 = ComposeUiNode.Companion.d;
            Updater.b(composerImplV, modifierD, function28);
            Modifier modifierH = PaddingKt.h(LayoutIdKt.b(companion, TextBundle.TEXT_ENTRY), BitmapDescriptorFactory.HUE_RED, f, 1);
            BiasAlignment biasAlignment = Alignment.Companion.f1719a;
            MeasurePolicy measurePolicyD = BoxKt.d(biasAlignment, false);
            int i6 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ2 = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierH);
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, function25);
            Updater.b(composerImplV, persistentCompositionLocalMapQ2, function26);
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function27);
            }
            Updater.b(composerImplV, modifierD2, function28);
            composableLambdaImpl.invoke(composerImplV, Integer.valueOf(i5 & 14));
            composerImplV.V(true);
            composerImplV.o(-904778058);
            if (function2 != null) {
                Modifier modifierB = LayoutIdKt.b(companion, UrlHandler.ACTION);
                MeasurePolicy measurePolicyD2 = BoxKt.d(biasAlignment, false);
                int i7 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ3 = composerImplV.Q();
                Modifier modifierD3 = ComposedModifierKt.d(composerImplV, modifierB);
                composerImplV.i();
                i3 = 8;
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD2, function25);
                Updater.b(composerImplV, persistentCompositionLocalMapQ3, function26);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i7))) {
                    androidx.camera.core.impl.b.B(i7, composerImplV, i7, function27);
                }
                Updater.b(composerImplV, modifierD3, function28);
                textStyle2 = textStyle;
                function23 = function2;
                CompositionLocalKt.b(new ProvidedValue[]{androidx.camera.core.impl.b.g(j, ContentColorKt.f1427a), TextKt.f1518a.b(textStyle2)}, function23, composerImplV, 8 | (i5 & 112));
                composerImplV.V(true);
            } else {
                function23 = function2;
                textStyle2 = textStyle;
                i3 = 8;
            }
            composerImplV.V(false);
            composerImplV.o(-904766579);
            if (function22 != null) {
                Modifier modifierB2 = LayoutIdKt.b(companion, "dismissAction");
                MeasurePolicy measurePolicyD3 = BoxKt.d(biasAlignment, false);
                int i8 = composerImplV.P;
                PersistentCompositionLocalMap persistentCompositionLocalMapQ4 = composerImplV.Q();
                Modifier modifierD4 = ComposedModifierKt.d(composerImplV, modifierB2);
                composerImplV.i();
                if (composerImplV.O) {
                    composerImplV.K(function0);
                } else {
                    composerImplV.e();
                }
                Updater.b(composerImplV, measurePolicyD3, function25);
                Updater.b(composerImplV, persistentCompositionLocalMapQ4, function26);
                if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                    androidx.camera.core.impl.b.B(i8, composerImplV, i8, function27);
                }
                Updater.b(composerImplV, modifierD4, function28);
                j3 = j2;
                function24 = function22;
                CompositionLocalKt.a(androidx.camera.core.impl.b.g(j3, ContentColorKt.f1427a), function24, composerImplV, i3 | ((i5 >> 3) & 112));
                z = true;
                composerImplV.V(true);
            } else {
                function24 = function22;
                j3 = j2;
                z = true;
            }
            composerImplV.V(false);
            composerImplV.V(z);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            final long j4 = j3;
            final TextStyle textStyle3 = textStyle2;
            final Function2 function29 = function24;
            final Function2 function210 = function23;
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarKt$OneRowSnackbar$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarKt.d(composableLambdaImpl, function210, function29, textStyle3, j, j4, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }
}
