package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
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
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AppBarKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1239a = 56;
    public static final float b;
    public static final Modifier c;
    public static final Modifier d;
    public static final float e;
    public static final float f;
    public static final WindowInsets g;

    static {
        float f2 = 4;
        b = f2;
        Modifier.Companion companion = Modifier.Companion.d;
        c = SizeKt.u(companion, 16 - f2);
        d = SizeKt.u(SizeKt.c(companion, 1.0f), 72 - f2);
        e = 8;
        f = f2;
        g = WindowInsetsKt.c(0);
    }

    public static final void a(final long j, final long j2, final float f2, final PaddingValues paddingValues, final Shape shape, final WindowInsets windowInsets, final Modifier modifier, final Function3 function3, Composer composer, final int i) {
        int i2;
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-712505634);
        if ((i & 6) == 0) {
            i2 = (composerImplV.s(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j2) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.q(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(paddingValues) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(shape) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.n(windowInsets) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 1048576 : 524288;
        } else {
            modifier2 = modifier;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.I(function3) ? 8388608 : 4194304;
        }
        if (composerImplV.z(i2 & 1, (4793491 & i2) != 4793490)) {
            int i3 = i2 << 6;
            composerImpl = composerImplV;
            SurfaceKt.a(modifier2, shape, j, j2, null, f2, ComposableLambdaKt.c(213273114, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ProvidedValue providedValueB = ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.c(composer2, 6)));
                        final PaddingValues paddingValues2 = paddingValues;
                        final Function3 function32 = function3;
                        final WindowInsets windowInsets2 = windowInsets;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(600325466, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                int iIntValue2 = ((Number) obj4).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    Modifier modifierG = SizeKt.g(PaddingKt.e(WindowInsetsPaddingKt.d(SizeKt.e(Modifier.Companion.d, 1.0f), windowInsets2), paddingValues2), AppBarKt.f1239a);
                                    RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer3, 54);
                                    int p = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD = composer3.d();
                                    Modifier modifierD = ComposedModifierKt.d(composer3, modifierG);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function0 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function0);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                    Function2 function2 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p))) {
                                        b.z(p, composer3, p, function2);
                                    }
                                    Updater.b(composer3, modifierD, ComposeUiNode.Companion.d);
                                    function32.invoke(RowScopeInstance.f974a, composer3, 6);
                                    composer3.f();
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
            }, composerImplV), composerImpl, 1572864 | ((i2 >> 18) & 14) | ((i2 >> 9) & 112) | (i3 & 896) | (i3 & 7168) | ((i2 << 9) & 458752), 16);
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$AppBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AppBarKt.a(j, j2, f2, paddingValues, shape, windowInsets, modifier, function3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final ComposableLambdaImpl composableLambdaImpl, final WindowInsets windowInsets, final Modifier modifier, final Function2 function2, final Function3 function3, final long j, final long j2, final float f2, Composer composer, final int i) {
        int i2;
        WindowInsets windowInsets2;
        Modifier modifier2;
        ComposerImpl composerImpl;
        ComposerImpl composerImplV = composer.v(-763778507);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(composableLambdaImpl) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            windowInsets2 = windowInsets;
            i2 |= composerImplV.n(windowInsets2) ? 32 : 16;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i2 |= composerImplV.n(modifier2) ? 256 : 128;
        } else {
            modifier2 = modifier;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(function3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.s(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.s(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerImplV.q(f2) ? 8388608 : 4194304;
        }
        if (composerImplV.z(i2 & 1, (4793491 & i2) != 4793490)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            int i3 = i2 >> 15;
            int i4 = i2 << 12;
            composerImpl = composerImplV;
            a(j, j2, f2, AppBarDefaults.f1238a, RectangleShapeKt.f1779a, windowInsets2, modifier2, ComposableLambdaKt.c(1849684359, new Function3<RowScope, Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    RowScope rowScope = (RowScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(rowScope) ? 4 : 2;
                    }
                    if (composer2.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                        BiasAlignment.Vertical vertical = Alignment.Companion.k;
                        Function2 function22 = function2;
                        if (function22 == null) {
                            composer2.o(1108917613);
                            SpacerKt.a(composer2, AppBarKt.c);
                            composer2.l();
                        } else {
                            composer2.o(1108983209);
                            Modifier modifier3 = AppBarKt.d;
                            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, vertical, composer2, 48);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, modifier3);
                            ComposeUiNode.e3.getClass();
                            Function0 function0 = ComposeUiNode.Companion.b;
                            if (composer2.w() == null) {
                                ComposablesKt.b();
                                throw null;
                            }
                            composer2.i();
                            if (composer2.getO()) {
                                composer2.K(function0);
                            } else {
                                composer2.e();
                            }
                            Updater.b(composer2, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function23 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                b.z(p, composer2, p, function23);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            CompositionLocalKt.a(ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.b(composer2))), function22, composer2, 8);
                            composer2.f();
                            composer2.l();
                        }
                        Modifier modifierA = rowScope.a(SizeKt.c(Modifier.Companion.d, 1.0f), 1.0f, true);
                        RowMeasurePolicy rowMeasurePolicyA2 = RowKt.a(Arrangement.f934a, vertical, composer2, 48);
                        int p2 = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD2 = composer2.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer2, modifierA);
                        ComposeUiNode.e3.getClass();
                        Function0 function02 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function02);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, rowMeasurePolicyA2, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD2, ComposeUiNode.Companion.f);
                        Function2 function24 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p2))) {
                            b.z(p2, composer2, p2, function24);
                        }
                        Updater.b(composer2, modifierD2, ComposeUiNode.Companion.d);
                        TextStyle textStyle = MaterialTheme.c(composer2).f;
                        final ComposableLambdaImpl composableLambdaImpl2 = composableLambdaImpl;
                        TextKt.a(textStyle, ComposableLambdaKt.c(-1654084516, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1$2$1
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    CompositionLocalKt.a(ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.b(composer3))), composableLambdaImpl2, composer3, 8);
                                } else {
                                    composer3.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 48);
                        composer2.f();
                        ProvidedValue providedValueB = ContentAlphaKt.f1260a.b(Float.valueOf(ContentAlpha.c(composer2, 6)));
                        final Function3 function32 = function3;
                        CompositionLocalKt.a(providedValueB, ComposableLambdaKt.c(2129753671, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$1.3
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                Composer composer3 = (Composer) obj4;
                                int iIntValue2 = ((Number) obj5).intValue();
                                if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    Modifier modifierC = SizeKt.c(Modifier.Companion.d, 1.0f);
                                    RowMeasurePolicy rowMeasurePolicyA3 = RowKt.a(Arrangement.b, Alignment.Companion.k, composer3, 54);
                                    int p3 = composer3.getP();
                                    PersistentCompositionLocalMap persistentCompositionLocalMapD3 = composer3.d();
                                    Modifier modifierD3 = ComposedModifierKt.d(composer3, modifierC);
                                    ComposeUiNode.e3.getClass();
                                    Function0 function03 = ComposeUiNode.Companion.b;
                                    if (composer3.w() == null) {
                                        ComposablesKt.b();
                                        throw null;
                                    }
                                    composer3.i();
                                    if (composer3.getO()) {
                                        composer3.K(function03);
                                    } else {
                                        composer3.e();
                                    }
                                    Updater.b(composer3, rowMeasurePolicyA3, ComposeUiNode.Companion.g);
                                    Updater.b(composer3, persistentCompositionLocalMapD3, ComposeUiNode.Companion.f);
                                    Function2 function25 = ComposeUiNode.Companion.j;
                                    if (composer3.getO() || !Intrinsics.c(composer3.G(), Integer.valueOf(p3))) {
                                        b.z(p3, composer3, p3, function25);
                                    }
                                    Updater.b(composer3, modifierD3, ComposeUiNode.Companion.d);
                                    function32.invoke(RowScopeInstance.f974a, composer3, 6);
                                    composer3.f();
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
            }, composerImplV), composerImpl, (i3 & 896) | (i3 & 14) | 12610560 | (i3 & 112) | (458752 & i4) | (i4 & 3670016));
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.AppBarKt$TopAppBar$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AppBarKt.b(composableLambdaImpl, windowInsets, modifier, function2, function3, j, j2, f2, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final float r17, final int r18, final int r19, final long r20, long r22, androidx.compose.runtime.Composer r24, final androidx.compose.runtime.internal.ComposableLambdaImpl r25, androidx.compose.ui.Modifier r26, final kotlin.jvm.functions.Function2 r27, kotlin.jvm.functions.Function3 r28) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.c(float, int, int, long, long, androidx.compose.runtime.Composer, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3):void");
    }
}
