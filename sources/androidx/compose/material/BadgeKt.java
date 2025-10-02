package androidx.compose.material;

import androidx.camera.core.impl.b;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
public final class BadgeKt {

    /* renamed from: a, reason: collision with root package name */
    public static final float f1242a;
    public static final float d;
    public static final float f;
    public static final float b = 8;
    public static final long c = TextUnitKt.c(10);
    public static final float e = -6;

    static {
        float f2 = 4;
        f1242a = f2;
        d = f2;
        f = -f2;
    }

    public static final void a(final Modifier modifier, final long j, long j2, final Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        long jB;
        ComposerImpl composerImplV = composer.v(1133484502);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.s(j) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            if ((i2 & 4) == 0) {
                jB = j2;
                int i4 = composerImplV.s(jB) ? 256 : 128;
                i3 |= i4;
            } else {
                jB = j2;
            }
            i3 |= i4;
        } else {
            jB = j2;
        }
        if ((i & 3072) == 0) {
            i3 |= composerImplV.I(function3) ? 2048 : 1024;
        }
        if (composerImplV.z(i3 & 1, (i3 & 1171) != 1170)) {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            } else if ((i2 & 4) != 0) {
                jB = ColorsKt.b(j, composerImplV);
            }
            composerImplV.W();
            float f2 = function3 != null ? b : f1242a;
            RoundedCornerShape roundedCornerShapeB = RoundedCornerShapeKt.b(f2);
            float f3 = f2 * 2;
            Modifier modifierH = PaddingKt.h(ClipKt.a(BackgroundKt.b(SizeKt.a(modifier, f3, f3), j, roundedCornerShapeB), roundedCornerShapeB), d, BitmapDescriptorFactory.HUE_RED, 2);
            RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composerImplV, 54);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierH);
            ComposeUiNode.e3.getClass();
            Function0 function0 = ComposeUiNode.Companion.b;
            composerImplV.i();
            if (composerImplV.O) {
                composerImplV.K(function0);
            } else {
                composerImplV.e();
            }
            Updater.b(composerImplV, rowMeasurePolicyA, ComposeUiNode.Companion.g);
            Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
            Function2 function2 = ComposeUiNode.Companion.j;
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i5))) {
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            if (function3 != null) {
                composerImplV.o(1448027890);
                CompositionLocalKt.a(b.g(jB, ContentColorKt.f1261a), ComposableLambdaKt.c(1784526485, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            TextStyle textStyleA = TextStyle.a(MaterialTheme.c(composer2).k, 0L, BadgeKt.c, null, null, 0L, 0L, null, null, 0, 16777213);
                            final Function3 function32 = function3;
                            TextKt.a(textStyleA, ComposableLambdaKt.c(915155142, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$1$1.1
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    Composer composer3 = (Composer) obj3;
                                    int iIntValue2 = ((Number) obj4).intValue();
                                    if (composer3.z(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        function32.invoke(RowScopeInstance.f974a, composer3, 0);
                                    } else {
                                        composer3.j();
                                    }
                                    return Unit.f24250a;
                                }
                            }, composer2), composer2, 48);
                        } else {
                            composer2.j();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 56);
                composerImplV.V(false);
            } else {
                composerImplV.o(1448293126);
                composerImplV.V(false);
            }
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        final long j3 = jB;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.BadgeKt$Badge$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    BadgeKt.a(modifier, j, j3, function3, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
