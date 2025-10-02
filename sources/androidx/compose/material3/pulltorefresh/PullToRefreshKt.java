package androidx.compose.material3.pulltorefresh;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0002²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "targetAlpha", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PullToRefreshKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1567a = (float) 2.5d;
    public static final float b = (float) 5.5d;
    public static final float c = 16;
    public static final float d = 40;
    public static final float e = 10;
    public static final float f = 5;
    public static final TweenSpec g = AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, EasingKt.d, 2);

    public static final void a(final boolean z, final Function0 function0, final Modifier modifier, final PullToRefreshState pullToRefreshState, Alignment alignment, final Function3 function3, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        int i2;
        Alignment alignment2;
        final Alignment alignment3;
        ComposerImpl composerImplV = composer.v(1902956467);
        if ((i & 6) == 0) {
            i2 = (composerImplV.p(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function0) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(pullToRefreshState) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && composerImplV.c()) {
            composerImplV.j();
            alignment3 = alignment;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                alignment2 = Alignment.Companion.f1719a;
            } else {
                composerImplV.j();
                alignment2 = alignment;
            }
            composerImplV.W();
            Modifier modifierX0 = modifier.x0(new PullToRefreshElement(z, function0, pullToRefreshState, PullToRefreshDefaults.c));
            MeasurePolicy measurePolicyD = BoxKt.d(alignment2, false);
            int i4 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX0);
            ComposeUiNode.e3.getClass();
            Function0 function02 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function02);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i4))) {
                b.B(i4, composerImplV, i4, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            Integer numValueOf = Integer.valueOf(((i3 >> 15) & 112) | 6);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.f944a;
            composableLambdaImpl.invoke(boxScopeInstance, composerImplV, numValueOf);
            function3.invoke(boxScopeInstance, composerImplV, Integer.valueOf(((i3 >> 12) & 112) | 6));
            composerImplV.V(true);
            alignment3 = alignment2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$PullToRefreshBox$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    PullToRefreshKt.a(z, function0, modifier, pullToRefreshState, alignment3, function3, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final Function0 function0, final long j, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-569718810);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            Object obj = objG;
            if (objG == composer$Companion$Empty$1) {
                AndroidPath androidPathA = AndroidPath_androidKt.a();
                androidPathA.n(1);
                composerImplV.A(androidPathA);
                obj = androidPathA;
            }
            final Path path = (Path) obj;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.d(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(((Number) function0.invoke()).floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerImplV.A(objG2);
            }
            final State stateB = AnimateAsStateKt.b(((Number) ((State) objG2).getD()).floatValue(), g, null, null, composerImplV, 48, 28);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objG3 = composerImplV.G();
            if (z || objG3 == composer$Companion$Empty$1) {
                objG3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        SemanticsPropertiesKt.q((SemanticsPropertyReceiver) obj2, new ProgressBarRangeInfo(((Number) function0.invoke()).floatValue(), RangesKt.j(BitmapDescriptorFactory.HUE_RED, 1.0f), 0));
                        return Unit.f24250a;
                    }
                };
                composerImplV.A(objG3);
            }
            Modifier modifierQ = SizeKt.q(SemanticsModifierKt.b(Modifier.Companion.d, true, (Function1) objG3), c);
            boolean zN = (i3 == 4) | composerImplV.n(stateB) | ((i2 & 112) == 32) | composerImplV.I(path);
            Object objG4 = composerImplV.G();
            if (zN || objG4 == composer$Companion$Empty$1) {
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        long j2;
                        float f2;
                        Rect rect;
                        DrawScope drawScope = (DrawScope) obj2;
                        float fFloatValue = ((Number) function0.invoke()).floatValue();
                        float f3 = PullToRefreshKt.f1567a;
                        float fMax = (Math.max(Math.min(1.0f, fFloatValue) - 0.4f, BitmapDescriptorFactory.HUE_RED) * 5) / 3;
                        float fB = RangesKt.b(Math.abs(fFloatValue) - 1.0f, BitmapDescriptorFactory.HUE_RED, 2.0f);
                        float fPow = (((0.4f * fMax) - 0.25f) + (fB - (((float) Math.pow(fB, 2)) / 4))) * 0.5f;
                        float f4 = 360;
                        float f5 = fPow * f4;
                        float f6 = ((0.8f * fMax) + fPow) * f4;
                        ArrowValues arrowValues = new ArrowValues(fPow, f5, f6, Math.min(1.0f, fMax));
                        float fFloatValue2 = ((Number) stateB.getD()).floatValue();
                        long j3 = j;
                        Path path2 = path;
                        long jM0 = drawScope.M0();
                        CanvasDrawScope$drawContext$1 e2 = drawScope.getE();
                        long jD = e2.d();
                        e2.a().save();
                        try {
                            e2.f1798a.d(jM0, fPow);
                            float fT1 = drawScope.T1(PullToRefreshKt.b);
                            f2 = PullToRefreshKt.f1567a;
                            float fT12 = (drawScope.T1(f2) / 2.0f) + fT1;
                            long jB = androidx.compose.ui.geometry.SizeKt.b(drawScope.h());
                            int i4 = (int) (jB >> 32);
                            int i5 = (int) (jB & 4294967295L);
                            rect = new Rect(Float.intBitsToFloat(i4) - fT12, Float.intBitsToFloat(i5) - fT12, Float.intBitsToFloat(i4) + fT12, Float.intBitsToFloat(i5) + fT12);
                        } catch (Throwable th) {
                            th = th;
                            j2 = jD;
                        }
                        try {
                            drawScope.R1(j3, f5, f6 - f5, rect.f(), rect.e(), (832 & 64) != 0 ? 1.0f : fFloatValue2, new Stroke(drawScope.T1(f2), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 26));
                            PullToRefreshKt.c(drawScope, path2, rect, j3, fFloatValue2, arrowValues);
                            b.C(e2, jD);
                            return Unit.f24250a;
                        } catch (Throwable th2) {
                            th = th2;
                            j2 = jD;
                            b.C(e2, j2);
                            throw th;
                        }
                    }
                };
                composerImplV.A(function1);
                objG4 = function1;
            }
            CanvasKt.a(modifierQ, (Function1) objG4, composerImplV, 0);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    PullToRefreshKt.b(function0, j, (Composer) obj2, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void c(DrawScope drawScope, Path path, Rect rect, long j, float f2, ArrowValues arrowValues) {
        path.reset();
        path.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        float f3 = e;
        float fT1 = drawScope.T1(f3);
        float f4 = arrowValues.b;
        path.b((fT1 * f4) / 2, drawScope.T1(f) * f4);
        path.b(drawScope.T1(f3) * f4, BitmapDescriptorFactory.HUE_RED);
        float fE = (Offset.e(rect.d()) + (Math.min(rect.c - rect.f1752a, rect.d - rect.b) / 2.0f)) - ((drawScope.T1(f3) * f4) / 2.0f);
        float f5 = Offset.f(rect.d());
        float f6 = f1567a;
        path.g(OffsetKt.a(fE, f5 - drawScope.T1(f6)));
        float fT12 = arrowValues.f1565a - drawScope.T1(f6);
        long jM0 = drawScope.M0();
        CanvasDrawScope$drawContext$1 e2 = drawScope.getE();
        long jD = e2.d();
        e2.a().save();
        try {
            e2.f1798a.d(jM0, fT12);
            DrawScope.Z(drawScope, path, j, f2, new Stroke(drawScope.T1(f6), BitmapDescriptorFactory.HUE_RED, 0, 0, null, 30), 48);
        } finally {
            b.C(e2, jD);
        }
    }

    public static final PullToRefreshStateImpl d(Composer composer) {
        return (PullToRefreshStateImpl) RememberSaveableKt.c(new Object[0], PullToRefreshStateImpl.b, PullToRefreshKt$rememberPullToRefreshState$1.h, composer, 3072, 4);
    }
}
