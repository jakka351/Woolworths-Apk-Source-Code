package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class NavigationDrawerKt$DrawerSheet$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ DrawerPredictiveBackState h;
    public final /* synthetic */ WindowInsets i;
    public final /* synthetic */ Modifier j;
    public final /* synthetic */ Shape k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ float n;
    public final /* synthetic */ Function3 o;
    public final /* synthetic */ int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavigationDrawerKt$DrawerSheet$2(DrawerPredictiveBackState drawerPredictiveBackState, WindowInsets windowInsets, Modifier modifier, Shape shape, long j, long j2, float f, Function3 function3, int i) {
        super(2);
        this.h = drawerPredictiveBackState;
        this.i = windowInsets;
        this.j = modifier;
        this.k = shape;
        this.l = j;
        this.m = j2;
        this.n = f;
        this.o = function3;
        this.p = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        long j2;
        ComposerImpl composerImpl;
        Shape shape;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.p | 1);
        float f = NavigationDrawerKt.f1464a;
        ComposerImpl composerImplV = ((Composer) obj).v(-151557245);
        int i3 = iA & 6;
        final DrawerPredictiveBackState drawerPredictiveBackState = this.h;
        if (i3 == 0) {
            i = (composerImplV.n(drawerPredictiveBackState) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i4 = iA & 48;
        final WindowInsets windowInsets = this.i;
        if (i4 == 0) {
            i |= composerImplV.n(windowInsets) ? 32 : 16;
        }
        int i5 = iA & KyberEngine.KyberPolyBytes;
        Modifier modifier = this.j;
        if (i5 == 0) {
            i |= composerImplV.n(modifier) ? 256 : 128;
        }
        int i6 = iA & 3072;
        Shape shape2 = this.k;
        if (i6 == 0) {
            i |= composerImplV.n(shape2) ? 2048 : 1024;
        }
        int i7 = iA & 24576;
        long j3 = this.l;
        if (i7 == 0) {
            i |= composerImplV.s(j3) ? 16384 : 8192;
        }
        int i8 = 196608 & iA;
        long j4 = this.m;
        if (i8 == 0) {
            i |= composerImplV.s(j4) ? 131072 : 65536;
        }
        int i9 = 1572864 & iA;
        float f2 = this.n;
        if (i9 == 0) {
            i |= composerImplV.q(f2) ? 1048576 : 524288;
        }
        int i10 = iA & 12582912;
        final Function3 function3 = this.o;
        if (i10 == 0) {
            i |= composerImplV.I(function3) ? 8388608 : 4194304;
        }
        if ((4793491 & i) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            j = j3;
            j2 = j4;
            shape = shape2;
        } else {
            composerImplV.u0();
            if ((iA & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            final boolean z = composerImplV.x(CompositionLocalsKt.n) == LayoutDirection.e;
            Modifier modifierA = Modifier.Companion.d;
            if (drawerPredictiveBackState != null) {
                i2 = 12582912;
                modifierA = GraphicsLayerModifierKt.a(modifierA, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerContainer$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj3;
                        DrawerPredictiveBackState drawerPredictiveBackState2 = drawerPredictiveBackState;
                        graphicsLayerScope.j(NavigationDrawerKt.a(graphicsLayerScope, drawerPredictiveBackState2));
                        graphicsLayerScope.l(NavigationDrawerKt.b(graphicsLayerScope, drawerPredictiveBackState2));
                        graphicsLayerScope.p0(TransformOriginKt.a(z ? 1.0f : BitmapDescriptorFactory.HUE_RED, 0.5f));
                        return Unit.f24250a;
                    }
                });
            } else {
                i2 = 12582912;
            }
            j = j3;
            j2 = j4;
            int i11 = i >> 6;
            composerImpl = composerImplV;
            shape = shape2;
            SurfaceKt.a(SizeKt.c(SizeKt.t(modifier, NavigationDrawerKt.b, BitmapDescriptorFactory.HUE_RED, DrawerDefaults.f1440a, BitmapDescriptorFactory.HUE_RED, 10).x0(modifierA), 1.0f), shape, j, j2, f2, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(669057502, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$DrawerSheet$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Modifier modifierA2;
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        final DrawerPredictiveBackState drawerPredictiveBackState2 = drawerPredictiveBackState;
                        if (drawerPredictiveBackState2 != null) {
                            float f3 = NavigationDrawerKt.f1464a;
                            final boolean z2 = z;
                            modifierA2 = GraphicsLayerModifierKt.a(companion, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$predictiveBackDrawerChild$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj5) {
                                    GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj5;
                                    DrawerPredictiveBackState drawerPredictiveBackState3 = drawerPredictiveBackState2;
                                    float fA = NavigationDrawerKt.a(graphicsLayerScope, drawerPredictiveBackState3);
                                    graphicsLayerScope.j(fA == BitmapDescriptorFactory.HUE_RED ? 1.0f : NavigationDrawerKt.b(graphicsLayerScope, drawerPredictiveBackState3) / fA);
                                    graphicsLayerScope.p0(TransformOriginKt.a(z2 ? 0.0f : 1.0f, BitmapDescriptorFactory.HUE_RED));
                                    return Unit.f24250a;
                                }
                            });
                        } else {
                            modifierA2 = companion;
                        }
                        Modifier modifierD = WindowInsetsPaddingKt.d(SizeKt.t(companion, NavigationDrawerKt.b, BitmapDescriptorFactory.HUE_RED, DrawerDefaults.f1440a, BitmapDescriptorFactory.HUE_RED, 10).x0(modifierA2), windowInsets);
                        ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer, 0);
                        int p = composer.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                        Modifier modifierD2 = ComposedModifierKt.d(composer, modifierD);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer.i();
                        if (composer.getO()) {
                            composer.K(function0);
                        } else {
                            composer.e();
                        }
                        Updater.b(composer, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer, p, function2);
                        }
                        Updater.b(composer, modifierD2, ComposeUiNode.Companion.d);
                        function3.invoke(ColumnScopeInstance.f948a, composer, 6);
                        composer.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i11 & 112) | i2 | (i11 & 896) | (i11 & 7168) | (i11 & 57344), 96);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new NavigationDrawerKt$DrawerSheet$2(drawerPredictiveBackState, windowInsets, modifier, shape, j, j2, f2, function3, iA);
        }
        return Unit.f24250a;
    }
}
