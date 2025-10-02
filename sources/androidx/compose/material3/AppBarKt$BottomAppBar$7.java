package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AppBarKt$BottomAppBar$7 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ Modifier h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long j;
    public final /* synthetic */ float k;
    public final /* synthetic */ PaddingValues l;
    public final /* synthetic */ WindowInsets m;
    public final /* synthetic */ ComposableLambdaImpl n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$7(Modifier modifier, long j, long j2, float f, PaddingValues paddingValues, WindowInsets windowInsets, ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = modifier;
        this.i = j;
        this.j = j2;
        this.k = f;
        this.l = paddingValues;
        this.m = windowInsets;
        this.n = composableLambdaImpl;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        ComposerImpl composerImpl;
        long j;
        long j2;
        float f;
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(this.o | 1);
        float f2 = AppBarKt.f1396a;
        ComposerImpl composerImplV = ((Composer) obj).v(422438773);
        int i2 = iA & 6;
        Modifier modifier = this.h;
        if (i2 == 0) {
            i = (composerImplV.n(modifier) ? 4 : 2) | iA;
        } else {
            i = iA;
        }
        int i3 = iA & 48;
        long j3 = this.i;
        if (i3 == 0) {
            i |= composerImplV.s(j3) ? 32 : 16;
        }
        int i4 = iA & KyberEngine.KyberPolyBytes;
        long j4 = this.j;
        if (i4 == 0) {
            i |= composerImplV.s(j4) ? 256 : 128;
        }
        int i5 = iA & 3072;
        float f3 = this.k;
        if (i5 == 0) {
            i |= composerImplV.q(f3) ? 2048 : 1024;
        }
        int i6 = iA & 24576;
        final PaddingValues paddingValues = this.l;
        if (i6 == 0) {
            i |= composerImplV.n(paddingValues) ? 16384 : 8192;
        }
        int i7 = 196608 & iA;
        final WindowInsets windowInsets = this.m;
        if (i7 == 0) {
            i |= composerImplV.n(windowInsets) ? 131072 : 65536;
        }
        if ((1572864 & iA) == 0) {
            i |= composerImplV.n(null) ? 1048576 : 524288;
        }
        int i8 = iA & 12582912;
        final ComposableLambdaImpl composableLambdaImpl = this.n;
        if (i8 == 0) {
            i |= composerImplV.I(composableLambdaImpl) ? 8388608 : 4194304;
        }
        if ((4793491 & i) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            j = j3;
            j2 = j4;
            f = f3;
        } else {
            composerImplV.u0();
            if ((iA & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            composerImplV.o(1393560009);
            composerImplV.V(false);
            Shape shapeB = ShapesKt.b(BottomAppBarTokens.b, composerImplV);
            boolean z = (3670016 & i) == 1048576;
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new AppBarKt$BottomAppBar$5$1(3);
                composerImplV.A(objG);
            }
            int i9 = i << 3;
            composerImpl = composerImplV;
            j = j3;
            j2 = j4;
            f = f3;
            SurfaceKt.a(LayoutModifierKt.a(modifier, (Function3) objG).x0(Modifier.Companion.d), shapeB, j, j2, f, BitmapDescriptorFactory.HUE_RED, null, ComposableLambdaKt.c(1243053520, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.AppBarKt$BottomAppBar$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(SizeKt.g(WindowInsetsPaddingKt.d(SizeKt.e(Modifier.Companion.d, 1.0f), windowInsets), BottomAppBarTokens.f1571a), paddingValues);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.f934a, Alignment.Companion.k, composer, 54);
                        int p = composer.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                        Modifier modifierD = ComposedModifierKt.d(composer, modifierE);
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
                        Updater.b(composer, rowMeasurePolicyA, ComposeUiNode.Companion.g);
                        Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer, p, function2);
                        }
                        Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                        composableLambdaImpl.invoke(RowScopeInstance.f974a, composer, 6);
                        composer.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImpl, (i9 & 896) | 12582912 | (i9 & 7168) | (i9 & 57344), 96);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new AppBarKt$BottomAppBar$7(modifier, j, j2, f, paddingValues, windowInsets, composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
