package androidx.compose.material;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class ScaffoldKt {

    /* renamed from: a, reason: collision with root package name */
    public static final StaticProvidableCompositionLocal f1317a = new StaticProvidableCompositionLocal(ScaffoldKt$LocalFabPlacement$1.h);
    public static final float b = 16;

    public static final void a(Modifier modifier, ScaffoldState scaffoldState, Function2 function2, Function2 function22, Function3 function3, final ComposableLambdaImpl composableLambdaImpl, int i, boolean z, Shape shape, float f, long j, long j2, long j3, long j4, long j5, final ComposableLambdaImpl composableLambdaImpl2, Composer composer, final int i2) {
        ComposerImpl composerImpl;
        final Modifier modifier2;
        final ScaffoldState scaffoldState2;
        final Function2 function23;
        final Function2 function24;
        final Function3 function32;
        final int i3;
        final boolean z2;
        final Shape shape2;
        final float f2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jB;
        Function3 function33;
        Function2 function25;
        ScaffoldState scaffoldState3;
        Function2 function26;
        Modifier modifier3;
        long j11;
        long j12;
        float f3;
        long j13;
        int i4;
        boolean z3;
        long j14;
        Shape shape3;
        ComposerImpl composerImplV = composer.v(1037492569);
        int i5 = i2 | 920153494;
        if (composerImplV.z(i5 & 1, (306783379 & i5) != 306783378)) {
            composerImplV.u0();
            if ((i2 & 1) == 0 || composerImplV.c0()) {
                ScaffoldState scaffoldStateD = d(null, composerImplV, 3);
                ComposableLambdaImpl composableLambdaImpl3 = ComposableSingletons$ScaffoldKt.f1257a;
                ComposableLambdaImpl composableLambdaImpl4 = ComposableSingletons$ScaffoldKt.b;
                ComposableLambdaImpl composableLambdaImpl5 = ComposableSingletons$ScaffoldKt.c;
                RoundedCornerShape roundedCornerShape = MaterialTheme.b(composerImplV).c;
                float f4 = DrawerDefaults.f1276a;
                long jG = MaterialTheme.a(composerImplV).g();
                long jB2 = ColorsKt.b(jG, composerImplV);
                long jA = DrawerDefaults.a(composerImplV);
                long jB3 = MaterialTheme.a(composerImplV).b();
                jB = ColorsKt.b(jB3, composerImplV);
                function33 = composableLambdaImpl5;
                function25 = composableLambdaImpl4;
                scaffoldState3 = scaffoldStateD;
                function26 = composableLambdaImpl3;
                modifier3 = Modifier.Companion.d;
                j11 = jA;
                j12 = jB2;
                f3 = f4;
                j13 = jG;
                i4 = 2;
                z3 = true;
                j14 = jB3;
                shape3 = roundedCornerShape;
            } else {
                composerImplV.j();
                modifier3 = modifier;
                scaffoldState3 = scaffoldState;
                function26 = function2;
                function25 = function22;
                function33 = function3;
                i4 = i;
                z3 = z;
                shape3 = shape;
                f3 = f;
                j13 = j;
                j12 = j2;
                j11 = j3;
                j14 = j4;
                jB = j5;
            }
            composerImplV.W();
            Function2 function27 = function26;
            composerImpl = composerImplV;
            b(WindowInsetsKt.c(0), modifier3, scaffoldState3, function27, function25, function33, composableLambdaImpl, i4, z3, shape3, f3, j13, j12, j11, j14, jB, composableLambdaImpl2, composerImpl, 920349744, 100663686, 0);
            modifier2 = modifier3;
            scaffoldState2 = scaffoldState3;
            function23 = function27;
            function24 = function25;
            function32 = function33;
            i3 = i4;
            z2 = z3;
            shape2 = shape3;
            f2 = f3;
            j6 = j13;
            j7 = j12;
            j8 = j11;
            j9 = j14;
            j10 = jB;
        } else {
            composerImpl = composerImplV;
            composerImpl.j();
            modifier2 = modifier;
            scaffoldState2 = scaffoldState;
            function23 = function2;
            function24 = function22;
            function32 = function3;
            i3 = i;
            z2 = z;
            shape2 = shape;
            f2 = f;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(scaffoldState2, function23, function24, function32, composableLambdaImpl, i3, z2, shape2, f2, j6, j7, j8, j9, j10, composableLambdaImpl2, i2) { // from class: androidx.compose.material.ScaffoldKt$Scaffold$3
                public final /* synthetic */ ScaffoldState i;
                public final /* synthetic */ Function2 j;
                public final /* synthetic */ Function2 k;
                public final /* synthetic */ Function3 l;
                public final /* synthetic */ ComposableLambdaImpl m;
                public final /* synthetic */ int n;
                public final /* synthetic */ boolean o;
                public final /* synthetic */ Shape p;
                public final /* synthetic */ float q;
                public final /* synthetic */ long r;
                public final /* synthetic */ long s;
                public final /* synthetic */ long t;
                public final /* synthetic */ long u;
                public final /* synthetic */ long v;
                public final /* synthetic */ ComposableLambdaImpl w;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(196609);
                    ScaffoldKt.a(this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final androidx.compose.foundation.layout.WindowInsets r39, final androidx.compose.ui.Modifier r40, final androidx.compose.material.ScaffoldState r41, final kotlin.jvm.functions.Function2 r42, final kotlin.jvm.functions.Function2 r43, final kotlin.jvm.functions.Function3 r44, final kotlin.jvm.functions.Function2 r45, final int r46, boolean r47, androidx.compose.ui.graphics.Shape r48, float r49, long r50, long r52, long r54, final long r56, final long r58, final androidx.compose.runtime.internal.ComposableLambdaImpl r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt.b(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.material.ScaffoldState, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, androidx.compose.ui.graphics.Shape, float, long, long, long, long, long, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final void c(final int i, final Function2 function2, final ComposableLambdaImpl composableLambdaImpl, final ComposableLambdaImpl composableLambdaImpl2, final Function2 function22, final WindowInsets windowInsets, final Function2 function23, Composer composer, final int i2) {
        int i3;
        ComposableLambdaImpl composableLambdaImpl3;
        final Function2 function24;
        WindowInsets windowInsets2;
        int i4;
        ComposerImpl composerImplV = composer.v(-468424875);
        if ((i2 & 6) == 0) {
            i3 = (composerImplV.p(false) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerImplV.r(i) ? 32 : 16;
        }
        if ((i2 & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            composableLambdaImpl3 = composableLambdaImpl;
            i3 |= composerImplV.I(composableLambdaImpl3) ? 2048 : 1024;
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            function24 = function22;
            i3 |= composerImplV.I(function24) ? 131072 : 65536;
        } else {
            function24 = function22;
        }
        if ((1572864 & i2) == 0) {
            windowInsets2 = windowInsets;
            i3 |= composerImplV.n(windowInsets2) ? 1048576 : 524288;
        } else {
            windowInsets2 = windowInsets;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= composerImplV.I(function23) ? 8388608 : 4194304;
        }
        if (composerImplV.z(i3 & 1, (i3 & 4793491) != 4793490)) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = new ScaffoldKt$ScaffoldLayout$contentPadding$1$1();
                composerImplV.A(objG);
            }
            final ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) objG;
            boolean z = ((i3 & 7168) == 2048) | ((3670016 & i3) == 1048576) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((29360128 & i3) == 8388608);
            Object objG2 = composerImplV.G();
            if (z || objG2 == composer$Companion$Empty$1) {
                final ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                final WindowInsets windowInsets3 = windowInsets2;
                i4 = 1;
                Function2<SubcomposeMeasureScope, Constraints, MeasureResult> function25 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:93:0x0209  */
                    @Override // kotlin.jvm.functions.Function2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r27, java.lang.Object r28) {
                        /*
                            Method dump skipped, instructions count: 913
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ScaffoldKt$ScaffoldLayout$1$1.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                composerImplV.A(function25);
                objG2 = function25;
            } else {
                i4 = 1;
            }
            SubcomposeLayoutKt.a(null, (Function2) objG2, composerImplV, 0, i4);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.ScaffoldKt$ScaffoldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    ScaffoldKt.c(i, function2, composableLambdaImpl, composableLambdaImpl2, function22, windowInsets, function23, (Composer) obj, RecomposeScopeImplKt.a(i2 | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final ScaffoldState d(SnackbarHostState snackbarHostState, Composer composer, int i) {
        DrawerValue drawerValue = DrawerValue.d;
        DrawerState drawerStateC = DrawerKt.c(composer);
        int i2 = i & 2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
        if (i2 != 0) {
            Object objG = composer.G();
            if (objG == composer$Companion$Empty$1) {
                objG = new SnackbarHostState();
                composer.A(objG);
            }
            snackbarHostState = (SnackbarHostState) objG;
        }
        Object objG2 = composer.G();
        if (objG2 == composer$Companion$Empty$1) {
            objG2 = new ScaffoldState(drawerStateC, snackbarHostState);
            composer.A(objG2);
        }
        return (ScaffoldState) objG2;
    }
}
