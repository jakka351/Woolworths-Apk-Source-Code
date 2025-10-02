package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.vector.VectorGroup;
import androidx.compose.ui.graphics.vector.VectorProperty;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class VectorPainterKt {
    public static final void a(final VectorGroup vectorGroup, final Map map, Composer composer, final int i) {
        int i2;
        VectorGroup.AnonymousClass1 anonymousClass1;
        boolean z;
        ComposerImpl composerImplV = composer.v(-446179233);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(vectorGroup) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(map) ? 32 : 16;
        }
        boolean z2 = false;
        if (composerImplV.z(i2 & 1, (i2 & 19) != 18)) {
            vectorGroup.getClass();
            VectorGroup.AnonymousClass1 anonymousClass12 = new VectorGroup.AnonymousClass1(vectorGroup);
            while (anonymousClass12.hasNext()) {
                VectorNode vectorNode = (VectorNode) anonymousClass12.next();
                boolean z3 = vectorNode instanceof VectorPath;
                VectorProperty.PathData pathData = VectorProperty.PathData.f1824a;
                if (z3) {
                    composerImplV.o(-23302778);
                    VectorPath vectorPath = (VectorPath) vectorNode;
                    VectorConfig vectorConfig = (VectorConfig) map.get(vectorPath.d);
                    if (vectorConfig == null) {
                        vectorConfig = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$1
                        };
                    }
                    ComposerImpl composerImpl = composerImplV;
                    anonymousClass1 = anonymousClass12;
                    z = false;
                    VectorComposeKt.b((List) vectorConfig.a(pathData, vectorPath.e), vectorPath.f, vectorPath.d, (Brush) vectorConfig.a(VectorProperty.Fill.f1822a, vectorPath.g), ((Number) vectorConfig.a(VectorProperty.FillAlpha.f1823a, Float.valueOf(vectorPath.h))).floatValue(), (Brush) vectorConfig.a(VectorProperty.Stroke.f1830a, vectorPath.i), ((Number) vectorConfig.a(VectorProperty.StrokeAlpha.f1831a, Float.valueOf(vectorPath.j))).floatValue(), ((Number) vectorConfig.a(VectorProperty.StrokeLineWidth.f1832a, Float.valueOf(vectorPath.k))).floatValue(), vectorPath.l, vectorPath.m, vectorPath.n, ((Number) vectorConfig.a(VectorProperty.TrimPathStart.f1837a, Float.valueOf(vectorPath.o))).floatValue(), ((Number) vectorConfig.a(VectorProperty.TrimPathEnd.f1835a, Float.valueOf(vectorPath.p))).floatValue(), ((Number) vectorConfig.a(VectorProperty.TrimPathOffset.f1836a, Float.valueOf(vectorPath.q))).floatValue(), composerImpl, 0);
                    composerImplV = composerImpl;
                    composerImplV.V(false);
                } else {
                    anonymousClass1 = anonymousClass12;
                    z = z2;
                    if (vectorNode instanceof VectorGroup) {
                        composerImplV.o(-21889209);
                        final VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                        VectorConfig vectorConfig2 = (VectorConfig) map.get(vectorGroup2.d);
                        if (vectorConfig2 == null) {
                            vectorConfig2 = new VectorConfig() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$config$2
                            };
                        }
                        VectorComposeKt.a(vectorGroup2.d, ((Number) vectorConfig2.a(VectorProperty.Rotation.f1827a, Float.valueOf(vectorGroup2.e))).floatValue(), ((Number) vectorConfig2.a(VectorProperty.PivotX.f1825a, Float.valueOf(vectorGroup2.f))).floatValue(), ((Number) vectorConfig2.a(VectorProperty.PivotY.f1826a, Float.valueOf(vectorGroup2.g))).floatValue(), ((Number) vectorConfig2.a(VectorProperty.ScaleX.f1828a, Float.valueOf(vectorGroup2.h))).floatValue(), ((Number) vectorConfig2.a(VectorProperty.ScaleY.f1829a, Float.valueOf(vectorGroup2.i))).floatValue(), ((Number) vectorConfig2.a(VectorProperty.TranslateX.f1833a, Float.valueOf(vectorGroup2.j))).floatValue(), ((Number) vectorConfig2.a(VectorProperty.TranslateY.f1834a, Float.valueOf(vectorGroup2.k))).floatValue(), (List) vectorConfig2.a(pathData, vectorGroup2.l), ComposableLambdaKt.c(1450046638, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer2 = (Composer) obj;
                                int iIntValue = ((Number) obj2).intValue();
                                if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                                    VectorPainterKt.a(vectorGroup2, map, composer2, 0);
                                } else {
                                    composer2.j();
                                }
                                return Unit.f24250a;
                            }
                        }, composerImplV), composerImplV, 805306368);
                        z = false;
                        composerImplV.V(false);
                    } else {
                        composerImplV.o(-20884003);
                        composerImplV.V(z);
                    }
                }
                z2 = z;
                anonymousClass12 = anonymousClass1;
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$RenderVectorGroup$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    VectorPainterKt.a(vectorGroup, map, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(VectorPainter vectorPainter, long j, long j2, String str, ColorFilter colorFilter, boolean z) {
        ((SnapshotMutableStateImpl) vectorPainter.i).setValue(new Size(j));
        ((SnapshotMutableStateImpl) vectorPainter.j).setValue(Boolean.valueOf(z));
        VectorComponent vectorComponent = vectorPainter.k;
        ((SnapshotMutableStateImpl) vectorComponent.g).setValue(colorFilter);
        ((SnapshotMutableStateImpl) vectorComponent.i).setValue(new Size(j2));
        vectorComponent.c = str;
    }

    public static final void c(GroupComponent groupComponent, VectorGroup vectorGroup) {
        List list = vectorGroup.m;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VectorNode vectorNode = (VectorNode) list.get(i);
            if (vectorNode instanceof VectorPath) {
                PathComponent pathComponent = new PathComponent();
                VectorPath vectorPath = (VectorPath) vectorNode;
                pathComponent.d = vectorPath.e;
                pathComponent.n = true;
                pathComponent.c();
                pathComponent.s.n(vectorPath.f);
                pathComponent.c();
                pathComponent.c();
                pathComponent.b = vectorPath.g;
                pathComponent.c();
                pathComponent.c = vectorPath.h;
                pathComponent.c();
                pathComponent.g = vectorPath.i;
                pathComponent.c();
                pathComponent.e = vectorPath.j;
                pathComponent.c();
                pathComponent.f = vectorPath.k;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.h = vectorPath.l;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.i = vectorPath.m;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.j = vectorPath.n;
                pathComponent.o = true;
                pathComponent.c();
                pathComponent.k = vectorPath.o;
                pathComponent.p = true;
                pathComponent.c();
                pathComponent.l = vectorPath.p;
                pathComponent.p = true;
                pathComponent.c();
                pathComponent.m = vectorPath.q;
                pathComponent.p = true;
                pathComponent.c();
                groupComponent.e(i, pathComponent);
            } else if (vectorNode instanceof VectorGroup) {
                GroupComponent groupComponent2 = new GroupComponent();
                VectorGroup vectorGroup2 = (VectorGroup) vectorNode;
                groupComponent2.k = vectorGroup2.d;
                groupComponent2.c();
                groupComponent2.l = vectorGroup2.e;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.o = vectorGroup2.h;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.p = vectorGroup2.i;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.q = vectorGroup2.j;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.r = vectorGroup2.k;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.m = vectorGroup2.f;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.n = vectorGroup2.g;
                groupComponent2.s = true;
                groupComponent2.c();
                groupComponent2.f = vectorGroup2.l;
                groupComponent2.g = true;
                groupComponent2.c();
                c(groupComponent2, vectorGroup2);
                groupComponent.e(i, groupComponent2);
            }
        }
    }

    public static final long d(long j, float f, float f2) {
        if (Float.isNaN(f)) {
            f = Float.intBitsToFloat((int) (j >> 32));
        }
        if (Float.isNaN(f2)) {
            f2 = Float.intBitsToFloat((int) (j & 4294967295L));
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final VectorPainter e(ImageVector imageVector, Composer composer) {
        Density density = (Density) composer.x(CompositionLocalsKt.h);
        float f = imageVector.j;
        boolean zS = composer.s((Float.floatToRawIntBits(density.getE()) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        Object objG = composer.G();
        if (zS || objG == Composer.Companion.f1624a) {
            GroupComponent groupComponent = new GroupComponent();
            c(groupComponent, imageVector.f);
            float f2 = imageVector.b;
            float f3 = imageVector.c;
            long jFloatToRawIntBits = (Float.floatToRawIntBits(density.T1(f2)) << 32) | (Float.floatToRawIntBits(density.T1(f3)) & 4294967295L);
            long jD = d(jFloatToRawIntBits, imageVector.d, imageVector.e);
            VectorPainter vectorPainter = new VectorPainter(groupComponent);
            String str = imageVector.f1813a;
            long j = imageVector.g;
            b(vectorPainter, jFloatToRawIntBits, jD, str, j != 16 ? new BlendModeColorFilter(j, imageVector.h) : null, imageVector.i);
            composer.A(vectorPainter);
            objG = vectorPainter;
        }
        return (VectorPainter) objG;
    }

    public static final VectorPainter f(float f, float f2, float f3, float f4, String str, long j, int i, final ComposableLambdaImpl composableLambdaImpl, Composer composer) {
        Density density = (Density) composer.x(CompositionLocalsKt.h);
        long jFloatToRawIntBits = (Float.floatToRawIntBits(density.T1(f)) << 32) | (Float.floatToRawIntBits(density.T1(f2)) & 4294967295L);
        final long jD = d(jFloatToRawIntBits, f3, f4);
        boolean zS = composer.s(j) | composer.r(i);
        Object objG = composer.G();
        Object obj = Composer.Companion.f1624a;
        if (zS || objG == obj) {
            objG = j != 16 ? new BlendModeColorFilter(j, i) : null;
            composer.A(objG);
        }
        ColorFilter colorFilter = (ColorFilter) objG;
        composer.o(-1837507429);
        Object objG2 = composer.G();
        if (objG2 == obj) {
            objG2 = new VectorPainter(new GroupComponent());
            composer.A(objG2);
        }
        VectorPainter vectorPainter = (VectorPainter) objG2;
        b(vectorPainter, jFloatToRawIntBits, jD, str, colorFilter, true);
        ComposerImpl.CompositionContextImpl compositionContextImplM = composer.m();
        boolean zQ = composer.q(f3) | composer.q(f4);
        Object objG3 = composer.G();
        Object obj2 = objG3;
        if (zQ || objG3 == obj) {
            Composition composition = vectorPainter.l;
            Composition compositionImpl = (composition == null || composition.getW()) ? new CompositionImpl(compositionContextImplM, new VectorApplier(vectorPainter.k.b)) : composition;
            compositionImpl.d(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$composition$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    int iIntValue = ((Number) obj4).intValue();
                    if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                        long j2 = jD;
                        composableLambdaImpl.invoke(Float.valueOf(Float.intBitsToFloat((int) (j2 >> 32))), Float.valueOf(Float.intBitsToFloat((int) (j2 & 4294967295L))), composer2, 0);
                    } else {
                        composer2.j();
                    }
                    return Unit.f24250a;
                }
            }, true, 2008312779));
            composer.A(compositionImpl);
            obj2 = compositionImpl;
        }
        final Composition composition2 = (Composition) obj2;
        vectorPainter.l = composition2;
        boolean zI = composer.I(composition2);
        Object objG4 = composer.G();
        if (zI || objG4 == obj) {
            objG4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    final Composition composition3 = composition2;
                    return new DisposableEffectResult() { // from class: androidx.compose.ui.graphics.vector.VectorPainterKt$rememberVectorPainter$2$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public final void dispose() {
                            composition3.dispose();
                        }
                    };
                }
            };
            composer.A(objG4);
        }
        EffectsKt.c(vectorPainter, (Function1) objG4, composer);
        composer.l();
        return vectorPainter;
    }
}
