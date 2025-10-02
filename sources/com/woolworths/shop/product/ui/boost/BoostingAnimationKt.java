package com.woolworths.shop.product.ui.boost;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import au.com.woolworths.design.core.ui.component.stable.TextKt;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.dynamic.page.ui.content.o;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nlnlnnn;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007¨\u0006\u000f²\u0006\u000e\u0010\u0001\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0004\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/woolworths/shop/product/ui/boost/BoostingState;", "animationState", "Landroidx/compose/ui/unit/Dp;", "maskSize", "maskOffset", "", "shouldAnimateTextOffset", "shouldAnimateBoostingSize", "", "animatedBoostingFontSize", "rippleBoostingTextOpacity", "rippleBoostingTextSize", "textOffset", "offset", "animateOffset", "product-ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BoostingAnimationKt {
    public static final void a(BoostingState boostingState, Modifier modifier, final String str, Composer composer, int i, int i2) {
        int i3;
        Intrinsics.h(boostingState, "boostingState");
        ComposerImpl composerImplV = composer.v(-1954277087);
        if ((i & 6) == 0) {
            i3 = (composerImplV.r(boostingState.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i3 | 48;
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 = i3 | 432;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(str) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                str = null;
            }
            final State stateA = AnimateAsStateKt.a(boostingState.compareTo(BoostingState.f) >= 0 ? 0 : -88, null, "boostedOffset", null, composerImplV, KyberEngine.KyberPolyBytes, 10);
            CoreThemeKt.c(6, composerImplV, ComposableLambdaKt.c(531731781, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.shop.product.ui.boost.BoostingAnimationKt$BoostedAnimationComponent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier.Companion companion = Modifier.Companion.d;
                        Modifier modifierX0 = ClipKt.b(companion).x0(SizeKt.c);
                        composer2.o(5004770);
                        State state = stateA;
                        boolean zN = composer2.n(state);
                        Object objG = composer2.G();
                        if (zN || objG == Composer.Companion.f1624a) {
                            objG = new d(state, 8);
                            composer2.A(objG);
                        }
                        composer2.l();
                        Modifier modifierA = OffsetKt.a(modifierX0, (Function1) objG);
                        float f = 4;
                        Modifier modifierB = BackgroundKt.b(ClipKt.a(modifierA, RoundedCornerShapeKt.b(f)), CoreTheme.d(composer2).f4872a.f, RectangleShapeKt.f1779a);
                        RowMeasurePolicy rowMeasurePolicyA = RowKt.a(Arrangement.e, Alignment.Companion.k, composer2, 54);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
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
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        InfinitePulsingDotKt.a(null, 0L, composer2, 0);
                        SpacerKt.a(composer2, SizeKt.u(companion, 2));
                        Modifier modifierJ = PaddingKt.j(companion, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, 11);
                        String str2 = str;
                        if (str2 == null) {
                            str2 = "BOOSTED";
                        }
                        TextKt.a(str2, CoreTheme.f(composer2).f5120a.c.b, modifierJ, CoreTheme.b(composer2).e.d.f4856a, null, 0, 0, false, 0, null, composer2, KyberEngine.KyberPolyBytes, 1008);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier = Modifier.Companion.d;
        }
        Modifier modifier2 = modifier;
        String str2 = str;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.shop.checkout.ui.timeselector.compose.a(boostingState, modifier2, str2, i, i2, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0261  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(androidx.compose.ui.Modifier r18, com.woolworths.shop.product.ui.boost.BoostingState r19, kotlin.jvm.functions.Function0 r20, java.lang.String r21, androidx.compose.runtime.Composer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 621
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.woolworths.shop.product.ui.boost.BoostingAnimationKt.b(androidx.compose.ui.Modifier, com.woolworths.shop.product.ui.boost.BoostingState, kotlin.jvm.functions.Function0, java.lang.String, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(BoostingState boostingState, Modifier modifier, Function1 onAnimationComplete, Composer composer, int i) {
        int i2;
        float fC;
        Modifier modifier2;
        Intrinsics.h(boostingState, "boostingState");
        Intrinsics.h(onAnimationComplete, "onAnimationComplete");
        ComposerImpl composerImplV = composer.v(1434042704);
        if ((i & 6) == 0) {
            i2 = i | (composerImplV.r(boostingState.ordinal()) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(Boolean.valueOf(boostingState.compareTo(BoostingState.f) < 0));
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == composer$Companion$Empty$1) {
                objD = SnapshotStateKt.f(Boolean.valueOf(boostingState.compareTo(BoostingState.e) <= 0));
                composerImplV.A(objD);
            }
            MutableState mutableState2 = (MutableState) objD;
            composerImplV.V(false);
            if (((Boolean) mutableState2.getD()).booleanValue() && boostingState == BoostingState.e) {
                composerImplV.o(-472640211);
                fC = TextUnit.c(CoreTheme.f(composerImplV).f5120a.c.b.f2068a.fontSize) * 1.1f;
                composerImplV.V(false);
            } else {
                composerImplV.o(-472534904);
                fC = TextUnit.c(CoreTheme.f(composerImplV).f5120a.c.b.f2068a.fontSize);
                composerImplV.V(false);
            }
            TweenSpec tweenSpecE = AnimationSpecKt.e(200, 0, null, 6);
            composerImplV.o(-1633490746);
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                objG2 = new au.com.woolworths.shop.ratingsandreviews.ui.reviewitem.a(mutableState2, mutableState, 1);
                composerImplV.A(objG2);
            }
            composerImplV.V(false);
            final State stateB = AnimateAsStateKt.b(fC, tweenSpecE, "animatedBoostingFontSize", (Function1) objG2, composerImplV, 27696, 4);
            final State stateB2 = AnimateAsStateKt.b(((Boolean) mutableState2.getD()).booleanValue() ? 0.45f : BitmapDescriptorFactory.HUE_RED, AnimationSpecKt.e(350, 0, null, 6), null, null, composerImplV, 48, 28);
            float fC2 = TextUnit.c(CoreTheme.f(composerImplV).f5120a.c.b.f2068a.fontSize);
            composerImplV.o(-569403494);
            float fC3 = boostingState == BoostingState.e ? 1.3f * fC2 : TextUnit.c(CoreTheme.f(composerImplV).f5120a.c.b.f2068a.fontSize);
            composerImplV.V(false);
            composerImplV.o(5004770);
            boolean zQ = composerImplV.q(fC2);
            Object objG3 = composerImplV.G();
            if (zQ || objG3 == composer$Companion$Empty$1) {
                objG3 = new o(fC2, 10);
                composerImplV.A(objG3);
            }
            composerImplV.V(false);
            final State stateB3 = AnimateAsStateKt.b(fC3, AnimationSpecKt.b((Function1) objG3), null, null, composerImplV, 0, 28);
            float f = !((Boolean) mutableState.getD()).booleanValue() ? -8 : 0;
            TweenSpec tweenSpecE2 = AnimationSpecKt.e(350, nlnlnnn.xxx00780078x0078, null, 4);
            composerImplV.o(5004770);
            Object objG4 = composerImplV.G();
            if (objG4 == composer$Companion$Empty$1) {
                objG4 = new au.com.woolworths.shop.rewards.promo.composable.a(1, onAnimationComplete);
                composerImplV.A(objG4);
            }
            composerImplV.V(false);
            final State stateA = AnimateAsStateKt.a(f, tweenSpecE2, null, (Function1) objG4, composerImplV, 48, 4);
            float f2 = boostingState.compareTo(BoostingState.f) < 0 ? 0 : 88;
            composerImplV.o(1849434622);
            Object objG5 = composerImplV.G();
            if (objG5 == composer$Companion$Empty$1) {
                objG5 = new com.woolworths.scanlibrary.domain.productsearch.a(22);
                composerImplV.A(objG5);
            }
            composerImplV.V(false);
            final State stateA2 = AnimateAsStateKt.a(f2, null, "boostingFlingOffset", (Function1) objG5, composerImplV, 3456, 2);
            CoreThemeKt.b(6, composerImplV, ComposableLambdaKt.c(-1405496883, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.shop.product.ui.boost.BoostingAnimationKt$BoostingAnimationComponent$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer2 = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierX0 = ClipKt.b(Modifier.Companion.d).x0(SizeKt.c);
                        composer2.o(5004770);
                        State state = stateA2;
                        boolean zN = composer2.n(state);
                        Object objG6 = composer2.G();
                        if (zN || objG6 == Composer.Companion.f1624a) {
                            objG6 = new d(state, 9);
                            composer2.A(objG6);
                        }
                        composer2.l();
                        Modifier modifierB = BackgroundKt.b(ClipKt.a(OffsetKt.a(modifierX0, (Function1) objG6), RoundedCornerShapeKt.b(4)), CoreTheme.a(composer2).b.f4775a.c, RectangleShapeKt.f1779a);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.e, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierB);
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
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        final State state2 = stateA;
                        final State state3 = stateB;
                        final State state4 = stateB2;
                        final State state5 = stateB3;
                        CoreThemeKt.c(6, composer2, ComposableLambdaKt.c(-11902237, new Function2<Composer, Integer, Unit>() { // from class: com.woolworths.shop.product.ui.boost.BoostingAnimationKt$BoostingAnimationComponent$1$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer3 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    composer3.o(5004770);
                                    State state6 = state2;
                                    boolean zN2 = composer3.n(state6);
                                    Object objG7 = composer3.G();
                                    if (zN2 || objG7 == Composer.Companion.f1624a) {
                                        objG7 = new d(state6, 10);
                                        composer3.A(objG7);
                                    }
                                    composer3.l();
                                    Modifier.Companion companion = Modifier.Companion.d;
                                    TextKt.a("BOOSTING", TextStyle.a(CoreTheme.f(composer3).f5120a.c.b, 0L, TextUnitKt.e(llqqqql.a00610061aaaa, ((Number) state3.getD()).floatValue()), null, null, 0L, 0L, null, null, 0, 16777213), OffsetKt.a(companion, (Function1) objG7), CoreTheme.b(composer3).e.d.c.b, null, 0, 0, false, 0, null, composer3, 6, 1008);
                                    TextKt.a("BOOSTING", TextStyle.a(CoreTheme.f(composer3).f5120a.c.b, 0L, TextUnitKt.e(llqqqql.a00610061aaaa, ((Number) state5.getD()).floatValue()), null, null, 0L, 0L, null, null, 0, 16777213), AlphaKt.a(companion, ((Number) state4.getD()).floatValue()), CoreTheme.b(composer3).e.d.c.b, null, 0, 0, false, 0, null, composer3, 6, 1008);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2));
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV));
            modifier2 = Modifier.Companion.d;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new com.woolworths.scanlibrary.ui.scanner.b(boostingState, modifier2, onAnimationComplete, i, 2);
        }
    }
}
