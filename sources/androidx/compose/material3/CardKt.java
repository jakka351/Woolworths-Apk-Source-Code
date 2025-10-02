package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
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
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CardKt {
    public static final void a(final Modifier modifier, final Shape shape, final CardColors cardColors, CardElevation cardElevation, final BorderStroke borderStroke, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        int i3;
        CardElevation cardElevation2;
        CardElevation cardElevation3;
        ComposerImpl composerImpl;
        CardElevation cardElevationB;
        CardElevation cardElevation4;
        CardElevation cardElevation5;
        int i4;
        CardElevation cardElevation6;
        ComposerImpl composerImplV = composer.v(1179621553);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerImplV.n(shape) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.n(cardColors) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                CardElevation cardElevation7 = cardElevation;
                boolean zN = composerImplV.n(cardElevation7);
                cardElevation5 = cardElevation7;
                if (zN) {
                    i4 = 2048;
                    cardElevation6 = cardElevation7;
                }
                i3 |= i4;
                cardElevation2 = cardElevation6;
            } else {
                cardElevation5 = cardElevation;
            }
            i4 = 1024;
            cardElevation6 = cardElevation5;
            i3 |= i4;
            cardElevation2 = cardElevation6;
        } else {
            cardElevation2 = cardElevation;
        }
        if ((i & 24576) == 0) {
            i3 |= composerImplV.n(borderStroke) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            cardElevation4 = cardElevation2;
        } else {
            composerImplV.u0();
            if ((i & 1) == 0 || composerImplV.c0()) {
                cardElevation3 = cardElevation2;
                if ((i2 & 8) != 0) {
                    cardElevationB = CardDefaults.b();
                    i3 &= -7169;
                    cardElevation3 = cardElevationB;
                }
                composerImplV.W();
                composerImpl = composerImplV;
                SurfaceKt.a(modifier, shape, cardColors.f1406a, cardColors.b, BitmapDescriptorFactory.HUE_RED, ((Dp) cardElevation3.a(true, null, composerImplV, ((i3 >> 3) & 896) | 54).getD()).d, borderStroke, ComposableLambdaKt.c(664103990, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                            Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            composableLambdaImpl.invoke(ColumnScopeInstance.f948a, composer2, 6);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImpl, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                cardElevation4 = cardElevation3;
            } else {
                composerImplV.j();
                cardElevationB = cardElevation2;
                cardElevation3 = cardElevation2;
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    cardElevation3 = cardElevationB;
                }
                composerImplV.W();
                composerImpl = composerImplV;
                SurfaceKt.a(modifier, shape, cardColors.f1406a, cardColors.b, BitmapDescriptorFactory.HUE_RED, ((Dp) cardElevation3.a(true, null, composerImplV, ((i3 >> 3) & 896) | 54).getD()).d, borderStroke, ComposableLambdaKt.c(664103990, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$1
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer2 = (Composer) obj;
                        if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ColumnMeasurePolicy columnMeasurePolicyA = ColumnKt.a(Arrangement.c, Alignment.Companion.m, composer2, 0);
                            int p = composer2.getP();
                            PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                            Modifier modifierD = ComposedModifierKt.d(composer2, Modifier.Companion.d);
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
                            Updater.b(composer2, columnMeasurePolicyA, ComposeUiNode.Companion.g);
                            Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                            Function2 function2 = ComposeUiNode.Companion.j;
                            if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                androidx.camera.core.impl.b.z(p, composer2, p, function2);
                            }
                            Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                            composableLambdaImpl.invoke(ColumnScopeInstance.f948a, composer2, 6);
                            composer2.f();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImpl, (i3 & 14) | 12582912 | (i3 & 112) | ((i3 << 6) & 3670016), 16);
                cardElevation4 = cardElevation3;
            }
        }
        final CardElevation cardElevation8 = cardElevation4;
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.CardKt$Card$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    CardKt.a(modifier, shape, cardColors, cardElevation8, borderStroke, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final kotlin.jvm.functions.Function0 r18, final androidx.compose.ui.Modifier r19, final boolean r20, final androidx.compose.ui.graphics.Shape r21, final androidx.compose.material3.CardColors r22, androidx.compose.material3.CardElevation r23, final androidx.compose.foundation.BorderStroke r24, final androidx.compose.foundation.interaction.MutableInteractionSource r25, final androidx.compose.runtime.internal.ComposableLambdaImpl r26, androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CardKt.b(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, androidx.compose.material3.CardColors, androidx.compose.material3.CardElevation, androidx.compose.foundation.BorderStroke, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
