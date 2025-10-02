package androidx.compose.material.pullrefresh;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0004²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"", "showElevation", "", "targetAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PullRefreshIndicatorKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1382a = 40;
    public static final RoundedCornerShape b = RoundedCornerShapeKt.f1100a;
    public static final float c = (float) 7.5d;
    public static final float d = (float) 2.5d;
    public static final float e = 10;
    public static final float f = 5;
    public static final float g = 6;
    public static final TweenSpec h = AnimationSpecKt.e(nlnlnnn.xxx00780078x0078, 0, EasingKt.d, 2);

    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(final boolean r30, final androidx.compose.material.pullrefresh.PullRefreshState r31, final androidx.compose.ui.Modifier r32, long r33, long r35, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt.a(boolean, androidx.compose.material.pullrefresh.PullRefreshState, androidx.compose.ui.Modifier, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void b(final PullRefreshState pullRefreshState, final long j, final Modifier modifier, Composer composer, final int i) {
        int i2;
        ComposerImpl composerImplV = composer.v(-486016981);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(pullRefreshState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
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
            boolean zN = composerImplV.n(pullRefreshState);
            Object objG2 = composerImplV.G();
            if (zN || objG2 == composer$Companion$Empty$1) {
                objG2 = SnapshotStateKt.d(new Function0<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$targetAlpha$2$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PullRefreshState pullRefreshState2 = pullRefreshState;
                        return Float.valueOf(((Number) pullRefreshState2.c.getD()).floatValue() / pullRefreshState2.a() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerImplV.A(objG2);
            }
            boolean z = true;
            final State stateB = AnimateAsStateKt.b(((Number) ((State) objG2).getD()).floatValue(), h, null, null, composerImplV, 48, 28);
            Modifier modifierB = SemanticsModifierKt.b(modifier, false, PullRefreshIndicatorKt$CircularArrowIndicator$1.h);
            boolean zI = composerImplV.I(pullRefreshState) | composerImplV.n(stateB);
            if ((i2 & 112) != 32) {
                z = false;
            }
            boolean zI2 = zI | z | composerImplV.I(path);
            Object objG3 = composerImplV.G();
            if (zI2 || objG3 == composer$Companion$Empty$1) {
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) throws Throwable {
                        CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1;
                        long j2;
                        float f2;
                        Rect rect;
                        DrawScope drawScope = (DrawScope) obj2;
                        PullRefreshState pullRefreshState2 = pullRefreshState;
                        float fFloatValue = ((Number) pullRefreshState2.c.getD()).floatValue() / pullRefreshState2.a();
                        float f3 = PullRefreshIndicatorKt.f1382a;
                        float fMin = Math.min(1.0f, fFloatValue) - 0.4f;
                        float f4 = BitmapDescriptorFactory.HUE_RED;
                        float fMax = (Math.max(fMin, BitmapDescriptorFactory.HUE_RED) * 5) / 3;
                        float fAbs = Math.abs(fFloatValue) - 1.0f;
                        if (fAbs >= BitmapDescriptorFactory.HUE_RED) {
                            f4 = fAbs;
                        }
                        if (f4 > 2.0f) {
                            f4 = 2.0f;
                        }
                        float fPow = (((0.4f * fMax) - 0.25f) + (f4 - (((float) Math.pow(f4, 2)) / 4))) * 0.5f;
                        float f5 = 360;
                        float f6 = fPow * f5;
                        float f7 = ((0.8f * fMax) + fPow) * f5;
                        ArrowValues arrowValues = new ArrowValues(fPow, f6, f7, Math.min(1.0f, fMax));
                        float fFloatValue2 = ((Number) stateB.getD()).floatValue();
                        long j3 = j;
                        Path path2 = path;
                        long jM0 = drawScope.M0();
                        CanvasDrawScope$drawContext$1 e2 = drawScope.getE();
                        long jD = e2.d();
                        e2.a().save();
                        try {
                            e2.f1798a.d(jM0, fPow);
                            float fT1 = drawScope.T1(PullRefreshIndicatorKt.c);
                            f2 = PullRefreshIndicatorKt.d;
                            float fT12 = (drawScope.T1(f2) / 2.0f) + fT1;
                            rect = new Rect(Offset.e(SizeKt.b(drawScope.h())) - fT12, Offset.f(SizeKt.b(drawScope.h())) - fT12, Offset.e(SizeKt.b(drawScope.h())) + fT12, Offset.f(SizeKt.b(drawScope.h())) + fT12);
                        } catch (Throwable th) {
                            th = th;
                            canvasDrawScope$drawContext$1 = e2;
                        }
                        try {
                            j2 = jD;
                            canvasDrawScope$drawContext$1 = e2;
                        } catch (Throwable th2) {
                            th = th2;
                            canvasDrawScope$drawContext$1 = e2;
                            j2 = jD;
                            b.C(canvasDrawScope$drawContext$1, j2);
                            throw th;
                        }
                        try {
                            drawScope.R1(j3, f6, f7 - f6, rect.f(), rect.e(), (832 & 64) != 0 ? 1.0f : fFloatValue2, new Stroke(drawScope.T1(f2), BitmapDescriptorFactory.HUE_RED, 2, 0, null, 26));
                            PullRefreshIndicatorKt.c(drawScope, path2, rect, j3, fFloatValue2, arrowValues);
                            b.C(canvasDrawScope$drawContext$1, j2);
                            return Unit.f24250a;
                        } catch (Throwable th3) {
                            th = th3;
                            b.C(canvasDrawScope$drawContext$1, j2);
                            throw th;
                        }
                    }
                };
                composerImplV.A(function1);
                objG3 = function1;
            }
            CanvasKt.a(modifierB, (Function1) objG3, composerImplV, 0);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.pullrefresh.PullRefreshIndicatorKt$CircularArrowIndicator$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Number) obj3).intValue();
                    PullRefreshIndicatorKt.b(pullRefreshState, j, modifier, (Composer) obj2, RecomposeScopeImplKt.a(i | 1));
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
        path.b(fT1 * f4, BitmapDescriptorFactory.HUE_RED);
        path.b((drawScope.T1(f3) * f4) / 2, drawScope.T1(f) * f4);
        path.g(OffsetKt.a((Offset.e(rect.d()) + (Math.min(rect.c - rect.f1752a, rect.d - rect.b) / 2.0f)) - ((drawScope.T1(f3) * f4) / 2.0f), (drawScope.T1(d) / 2.0f) + Offset.f(rect.d())));
        path.close();
        float f5 = arrowValues.f1380a;
        long jM0 = drawScope.M0();
        CanvasDrawScope$drawContext$1 e2 = drawScope.getE();
        long jD = e2.d();
        e2.a().save();
        try {
            e2.f1798a.d(jM0, f5);
            DrawScope.Z(drawScope, path, j, f2, null, 56);
        } finally {
            b.C(e2, jD);
        }
    }
}
