package au.com.woolworths.design.core.ui.component.stable.snackbar;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScope;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.ListUtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*b\b\u0002\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "content", "FadeInFadeOutTransition", "ui_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SnackbarHostKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[SnackbarDuration.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SnackbarDuration snackbarDuration = SnackbarDuration.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SnackbarDuration snackbarDuration2 = SnackbarDuration.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(final SnackbarData snackbarData, Modifier modifier, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f4765a;
        ComposerImpl composerImplV = composer.v(1176789919);
        int i2 = (i & 6) == 0 ? (composerImplV.n(snackbarData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj = objG;
            if (objG == Composer.Companion.f1624a) {
                FadeInFadeOutState fadeInFadeOutState = new FadeInFadeOutState();
                fadeInFadeOutState.f4767a = new Object();
                fadeInFadeOutState.b = new ArrayList();
                composerImplV.A(fadeInFadeOutState);
                obj = fadeInFadeOutState;
            }
            final FadeInFadeOutState fadeInFadeOutState2 = (FadeInFadeOutState) obj;
            composerImplV.V(false);
            composerImplV.o(1318723058);
            Object obj2 = fadeInFadeOutState2.f4767a;
            ArrayList arrayList = fadeInFadeOutState2.b;
            if (!Intrinsics.c(snackbarData, obj2)) {
                fadeInFadeOutState2.f4767a = snackbarData;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((SnackbarData) ((FadeInFadeOutAnimationItem) arrayList.get(i3)).f4766a);
                }
                final ArrayList arrayListJ0 = CollectionsKt.J0(arrayList2);
                if (!arrayListJ0.contains(snackbarData)) {
                    arrayListJ0.add(snackbarData);
                }
                arrayList.clear();
                ArrayList arrayListA = ListUtilsKt.a(arrayListJ0);
                int size2 = arrayListA.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    final SnackbarData snackbarData2 = (SnackbarData) arrayListA.get(i4);
                    arrayList.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.c(871819117, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Object snackbarHostKt$animatedOpacity$2$1;
                            Boolean bool;
                            Function2 children = (Function2) obj3;
                            Composer composer2 = (Composer) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            Intrinsics.h(children, "children");
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= composer2.I(children) ? 4 : 2;
                            }
                            if ((iIntValue & 19) == 18 && composer2.c()) {
                                composer2.j();
                            } else {
                                SnackbarData snackbarData3 = snackbarData;
                                final SnackbarData snackbarData4 = snackbarData2;
                                boolean zC = Intrinsics.c(snackbarData4, snackbarData3);
                                int i5 = zC ? 150 : 75;
                                int i6 = (!zC || ListUtilsKt.a(arrayListJ0).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpec = new TweenSpec(i5, i6, EasingKt.d);
                                composer2.o(-1633490746);
                                boolean zN = composer2.n(snackbarData4);
                                final FadeInFadeOutState fadeInFadeOutState3 = fadeInFadeOutState2;
                                boolean zI = zN | composer2.I(fadeInFadeOutState3);
                                Object objG2 = composer2.G();
                                Object obj6 = Composer.Companion.f1624a;
                                if (zI || objG2 == obj6) {
                                    objG2 = new Function0() { // from class: au.com.woolworths.design.core.ui.component.stable.snackbar.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            FadeInFadeOutState fadeInFadeOutState4 = fadeInFadeOutState3;
                                            Object obj7 = fadeInFadeOutState4.f4767a;
                                            SnackbarData snackbarData5 = snackbarData4;
                                            if (!Intrinsics.c(snackbarData5, obj7)) {
                                                CollectionsKt.g0(fadeInFadeOutState4.b, new d(snackbarData5, 0));
                                                RecomposeScope recomposeScope = fadeInFadeOutState4.c;
                                                if (recomposeScope != null) {
                                                    recomposeScope.invalidate();
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                composer2.l();
                                composer2.o(-983038464);
                                composer2.o(1849434622);
                                Object objG3 = composer2.G();
                                if (objG3 == obj6) {
                                    objG3 = AnimatableKt.a(!zC ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                                    composer2.A(objG3);
                                }
                                Animatable animatable = (Animatable) objG3;
                                composer2.l();
                                Boolean boolValueOf = Boolean.valueOf(zC);
                                composer2.o(-1224400529);
                                boolean zI2 = composer2.I(animatable) | composer2.p(zC) | composer2.I(tweenSpec) | composer2.n(function0);
                                Object objG4 = composer2.G();
                                if (zI2 || objG4 == obj6) {
                                    bool = boolValueOf;
                                    snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, zC, tweenSpec, function0, null);
                                    composer2.A(snackbarHostKt$animatedOpacity$2$1);
                                } else {
                                    bool = boolValueOf;
                                    snackbarHostKt$animatedOpacity$2$1 = objG4;
                                }
                                composer2.l();
                                EffectsKt.e(composer2, bool, (Function2) snackbarHostKt$animatedOpacity$2$1);
                                AnimationState animationState = animatable.c;
                                composer2.l();
                                TweenSpec tweenSpec2 = new TweenSpec(i5, i6, EasingKt.f756a);
                                composer2.o(1122940851);
                                composer2.o(1849434622);
                                Object objG5 = composer2.G();
                                if (objG5 == obj6) {
                                    objG5 = AnimatableKt.a(zC ? 0.8f : 1.0f);
                                    composer2.A(objG5);
                                }
                                Animatable animatable2 = (Animatable) objG5;
                                composer2.l();
                                Boolean boolValueOf2 = Boolean.valueOf(zC);
                                composer2.o(-1746271574);
                                boolean zI3 = composer2.I(animatable2) | composer2.p(zC) | composer2.I(tweenSpec2);
                                Object objG6 = composer2.G();
                                if (zI3 || objG6 == obj6) {
                                    objG6 = new SnackbarHostKt$animatedScale$1$1(animatable2, zC, tweenSpec2, null);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                EffectsKt.e(composer2, boolValueOf2, (Function2) objG6);
                                AnimationState animationState2 = animatable2.c;
                                composer2.l();
                                Modifier modifierB = GraphicsLayerModifierKt.b(Modifier.Companion.d, ((Number) ((SnapshotMutableStateImpl) animationState2.e).getD()).floatValue(), ((Number) ((SnapshotMutableStateImpl) animationState2.e).getD()).floatValue(), ((Number) ((SnapshotMutableStateImpl) animationState.e).getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131064);
                                composer2.o(5004770);
                                boolean zN2 = composer2.n(snackbarData4);
                                Object objG7 = composer2.G();
                                if (zN2 || objG7 == obj6) {
                                    objG7 = new d(snackbarData4, 1);
                                    composer2.A(objG7);
                                }
                                composer2.l();
                                Modifier modifierB2 = SemanticsModifierKt.b(modifierB, false, (Function1) objG7);
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                int p = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                Modifier modifierD = ComposedModifierKt.d(composer2, modifierB2);
                                ComposeUiNode.e3.getClass();
                                Function0 function02 = ComposeUiNode.Companion.b;
                                if (composer2.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer2.i();
                                if (composer2.getO()) {
                                    composer2.K(function02);
                                } else {
                                    composer2.e();
                                }
                                Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                                Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function2 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer2, p, function2);
                                }
                                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                androidx.camera.core.impl.b.A(iIntValue & 14, composer2, children);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV)));
                }
            }
            composerImplV.V(false);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i5 = composerImplV.P;
            PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
            Modifier modifierD = ComposedModifierKt.d(composerImplV, modifier);
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
                androidx.camera.core.impl.b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            fadeInFadeOutState2.c = ComposablesKt.a(composerImplV);
            composerImplV.o(470085957);
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) arrayList.get(i6);
                final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.f4766a;
                ComposableLambdaImpl composableLambdaImpl2 = fadeInFadeOutAnimationItem.b;
                composerImplV.J(98040567, snackbarData3);
                composableLambdaImpl2.invoke(ComposableLambdaKt.c(-100390784, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                    {
                        ComposableLambdaImpl composableLambdaImpl3 = ComposableSingletons$SnackbarHostKt.f4765a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                            composer2.j();
                        } else {
                            ComposableLambdaImpl composableLambdaImpl3 = ComposableSingletons$SnackbarHostKt.f4765a;
                            SnackbarData snackbarData4 = snackbarData3;
                            Intrinsics.e(snackbarData4);
                            composableLambdaImpl3.invoke(snackbarData4, composer2, 0);
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 6);
                composerImplV.V(false);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new b(snackbarData, modifier, i);
        }
    }

    public static final void b(SnackbarHostState hostState, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Intrinsics.h(hostState, "hostState");
        ComposerImpl composerImplV = composer.v(-1281779200);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(hostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (composerImplV.n(modifier) ? 32 : 16);
        }
        if ((i4 & 19) == 18 && composerImplV.c()) {
            composerImplV.j();
        } else {
            if (i5 != 0) {
                modifier = Modifier.Companion.d;
            }
            SnackbarData snackbarDataA = hostState.a();
            AccessibilityManager accessibilityManager = (AccessibilityManager) composerImplV.x(CompositionLocalsKt.f1964a);
            composerImplV.o(-1633490746);
            boolean zN = composerImplV.n(snackbarDataA) | composerImplV.I(accessibilityManager);
            Object objG = composerImplV.G();
            if (zN || objG == Composer.Companion.f1624a) {
                objG = new SnackbarHostKt$SnackbarHost$1$1(snackbarDataA, accessibilityManager, null);
                composerImplV.A(objG);
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, snackbarDataA, (Function2) objG);
            SnackbarData snackbarDataA2 = hostState.a();
            ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f4765a;
            a(snackbarDataA2, modifier, composerImplV, (i4 & 112) | KyberEngine.KyberPolyBytes);
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new a(hostState, modifier2, i, i2, 0);
        }
    }
}
