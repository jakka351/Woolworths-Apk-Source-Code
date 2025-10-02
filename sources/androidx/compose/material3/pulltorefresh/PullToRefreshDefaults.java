package androidx.compose.material3.pulltorefresh;

import androidx.camera.core.impl.b;
import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/pulltorefresh/PullToRefreshDefaults;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class PullToRefreshDefaults {

    /* renamed from: a, reason: collision with root package name */
    public static final PullToRefreshDefaults f1566a = new PullToRefreshDefaults();
    public static final RoundedCornerShape b = RoundedCornerShapeKt.f1100a;
    public static final float c = 80;
    public static final float d = ElevationTokens.c;

    public final void a(final PullToRefreshState pullToRefreshState, final boolean z, final Modifier modifier, long j, long j2, float f, Composer composer, final int i, final int i2) {
        final PullToRefreshDefaults pullToRefreshDefaults;
        int i3;
        float f2;
        final float f3;
        ComposerImpl composerImplV = composer.v(-1076870256);
        final long j3 = j;
        final long j4 = j2;
        int i4 = i | (composerImplV.n(pullToRefreshState) ? 4 : 2) | (composerImplV.p(z) ? 32 : 16) | (composerImplV.n(modifier) ? 256 : 128) | (((i2 & 8) == 0 && composerImplV.s(j3)) ? 2048 : 1024) | (((i2 & 16) == 0 && composerImplV.s(j4)) ? 16384 : 8192) | 65536;
        if ((i & 1572864) == 0) {
            pullToRefreshDefaults = this;
            i4 |= composerImplV.n(pullToRefreshDefaults) ? 1048576 : 524288;
        } else {
            pullToRefreshDefaults = this;
        }
        if ((599187 & i4) == 599186 && composerImplV.c()) {
            composerImplV.j();
            f3 = f;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                if ((i2 & 8) != 0) {
                    j3 = MaterialTheme.a(composerImplV).G;
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    j4 = MaterialTheme.a(composerImplV).s;
                    i4 &= -57345;
                }
                i3 = i4 & (-458753);
                f2 = c;
            } else {
                composerImplV.j();
                if ((i2 & 8) != 0) {
                    i4 &= -7169;
                }
                if ((i2 & 16) != 0) {
                    i4 &= -57345;
                }
                i3 = i4 & (-458753);
                f2 = f;
            }
            long j5 = j3;
            final long j6 = j4;
            composerImplV.W();
            float f4 = PullToRefreshKt.f1567a;
            Modifier modifierD = DrawModifierKt.d(SizeKt.q(modifier, PullToRefreshKt.d), PullToRefreshKt$pullToRefreshIndicator$1.h);
            final float f5 = d;
            final RoundedCornerShape roundedCornerShape = b;
            final float f6 = f2;
            Modifier modifierB = BackgroundKt.b(GraphicsLayerModifierKt.a(modifierD, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    GraphicsLayerScope graphicsLayerScope = (GraphicsLayerScope) obj;
                    PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                    float fA = pullToRefreshState2.a();
                    float fT1 = BitmapDescriptorFactory.HUE_RED;
                    boolean z2 = fA > BitmapDescriptorFactory.HUE_RED || z;
                    graphicsLayerScope.c((pullToRefreshState2.a() * graphicsLayerScope.r1(f6)) - Size.b(graphicsLayerScope.getT()));
                    if (z2) {
                        fT1 = graphicsLayerScope.T1(f5);
                    }
                    graphicsLayerScope.A(fT1);
                    graphicsLayerScope.H0(roundedCornerShape);
                    graphicsLayerScope.z(true);
                    return Unit.f24250a;
                }
            }), j5, roundedCornerShape);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD2 = ComposedModifierKt.d(composerImplV, modifierB);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, measurePolicyD, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD2, ComposeUiNode.Companion.d);
            CrossfadeKt.b(Boolean.valueOf(z), null, AnimationSpecKt.e(100, 0, null, 6), null, ComposableLambdaKt.c(167807595, new Function3<Boolean, Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.p(zBooleanValue) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else if (zBooleanValue) {
                        composer2.o(576835739);
                        ProgressIndicatorKt.b(PullToRefreshKt.f1567a, 0, 390, 24, j6, 0L, composer2, SizeKt.q(Modifier.Companion.d, PullToRefreshKt.c));
                        composer2.l();
                    } else {
                        composer2.o(577079337);
                        final PullToRefreshState pullToRefreshState2 = pullToRefreshState;
                        boolean zN = composer2.n(pullToRefreshState2);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$1$1$1$1
                                {
                                    super(0);
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(pullToRefreshState2.a());
                                }
                            };
                            composer2.A(objG);
                        }
                        PullToRefreshKt.b((Function0) objG, j6, composer2, 0);
                        composer2.l();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, ((i3 >> 3) & 14) | 24960, 10);
            composerImplV.V(true);
            f3 = f6;
            j3 = j5;
            j4 = j6;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshDefaults$Indicator$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    this.h.a(pullToRefreshState, z, modifier, j3, j4, f3, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
