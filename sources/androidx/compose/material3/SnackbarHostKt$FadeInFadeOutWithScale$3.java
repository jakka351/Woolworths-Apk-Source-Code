package androidx.compose.material3;

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
import androidx.compose.runtime.RecomposeScopeImplKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.util.ListUtilsKt;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SnackbarHostKt$FadeInFadeOutWithScale$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ SnackbarData h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$3(SnackbarData snackbarData, Modifier modifier, int i) {
        super(2);
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f1424a;
        this.h = snackbarData;
        this.i = modifier;
        this.j = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$SnackbarHostKt.f1424a;
        int iA = RecomposeScopeImplKt.a(this.j | 1);
        ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$SnackbarHostKt.f1424a;
        ComposerImpl composerImplV = ((Composer) obj).v(-1316639904);
        int i = iA & 6;
        final SnackbarData snackbarData = this.h;
        int i2 = i == 0 ? (composerImplV.n(snackbarData) ? 4 : 2) | iA : iA;
        int i3 = iA & 48;
        Modifier modifier = this.i;
        if (i3 == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((iA & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Object obj3 = objG;
            if (objG == Composer.Companion.f1624a) {
                FadeInFadeOutState fadeInFadeOutState = new FadeInFadeOutState();
                fadeInFadeOutState.f1449a = new Object();
                fadeInFadeOutState.b = new ArrayList();
                composerImplV.A(fadeInFadeOutState);
                obj3 = fadeInFadeOutState;
            }
            final FadeInFadeOutState fadeInFadeOutState2 = (FadeInFadeOutState) obj3;
            composerImplV.o(-1256811491);
            Object obj4 = fadeInFadeOutState2.f1449a;
            ArrayList arrayList = fadeInFadeOutState2.b;
            if (!Intrinsics.c(snackbarData, obj4)) {
                fadeInFadeOutState2.f1449a = snackbarData;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    arrayList2.add((SnackbarData) ((FadeInFadeOutAnimationItem) arrayList.get(i4)).f1448a);
                }
                final ArrayList arrayListJ0 = CollectionsKt.J0(arrayList2);
                if (!arrayListJ0.contains(snackbarData)) {
                    arrayListJ0.add(snackbarData);
                }
                arrayList.clear();
                ArrayList arrayListA = ListUtilsKt.a(arrayListJ0);
                int size2 = arrayListA.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    final SnackbarData snackbarData2 = (SnackbarData) arrayListA.get(i5);
                    arrayList.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.c(-1654683077, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            Object snackbarHostKt$animatedOpacity$2$1;
                            Boolean bool;
                            Function2 function2 = (Function2) obj5;
                            Composer composer = (Composer) obj6;
                            int iIntValue = ((Number) obj7).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= composer.I(function2) ? 4 : 2;
                            }
                            if ((iIntValue & 19) == 18 && composer.c()) {
                                composer.j();
                            } else {
                                SnackbarData snackbarData3 = snackbarData;
                                final SnackbarData snackbarData4 = snackbarData2;
                                boolean zC = Intrinsics.c(snackbarData4, snackbarData3);
                                int i6 = zC ? 150 : 75;
                                int i7 = (!zC || ListUtilsKt.a(arrayListJ0).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpec = new TweenSpec(i6, i7, EasingKt.d);
                                boolean zN = composer.n(snackbarData4);
                                final FadeInFadeOutState fadeInFadeOutState3 = fadeInFadeOutState2;
                                boolean zI = zN | composer.I(fadeInFadeOutState3);
                                Object objG2 = composer.G();
                                Object obj8 = Composer.Companion.f1624a;
                                if (zI || objG2 == obj8) {
                                    objG2 = new Function0<Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            FadeInFadeOutState fadeInFadeOutState4 = fadeInFadeOutState3;
                                            Object obj9 = fadeInFadeOutState4.f1449a;
                                            final SnackbarData snackbarData5 = snackbarData4;
                                            if (!Intrinsics.c(snackbarData5, obj9)) {
                                                CollectionsKt.g0(fadeInFadeOutState4.b, new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj10) {
                                                        return Boolean.valueOf(Intrinsics.c(((FadeInFadeOutAnimationItem) obj10).f1448a, snackbarData5));
                                                    }
                                                });
                                                RecomposeScope recomposeScope = fadeInFadeOutState4.c;
                                                if (recomposeScope != null) {
                                                    recomposeScope.invalidate();
                                                }
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                Object objG3 = composer.G();
                                if (objG3 == obj8) {
                                    objG3 = AnimatableKt.a(!zC ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                                    composer.A(objG3);
                                }
                                Animatable animatable = (Animatable) objG3;
                                Boolean boolValueOf = Boolean.valueOf(zC);
                                boolean zI2 = composer.I(animatable) | composer.p(zC) | composer.I(tweenSpec) | composer.n(function0);
                                Object objG4 = composer.G();
                                if (zI2 || objG4 == obj8) {
                                    bool = boolValueOf;
                                    snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, zC, tweenSpec, function0, null);
                                    composer.A(snackbarHostKt$animatedOpacity$2$1);
                                } else {
                                    bool = boolValueOf;
                                    snackbarHostKt$animatedOpacity$2$1 = objG4;
                                }
                                EffectsKt.e(composer, bool, (Function2) snackbarHostKt$animatedOpacity$2$1);
                                AnimationState animationState = animatable.c;
                                TweenSpec tweenSpec2 = new TweenSpec(i6, i7, EasingKt.f756a);
                                Object objG5 = composer.G();
                                if (objG5 == obj8) {
                                    objG5 = AnimatableKt.a(!zC ? 1.0f : 0.8f);
                                    composer.A(objG5);
                                }
                                Animatable animatable2 = (Animatable) objG5;
                                Boolean boolValueOf2 = Boolean.valueOf(zC);
                                boolean zI3 = composer.I(animatable2) | composer.p(zC) | composer.I(tweenSpec2);
                                Object objG6 = composer.G();
                                if (zI3 || objG6 == obj8) {
                                    objG6 = new SnackbarHostKt$animatedScale$1$1(animatable2, zC, tweenSpec2, null);
                                    composer.A(objG6);
                                }
                                EffectsKt.e(composer, boolValueOf2, (Function2) objG6);
                                AnimationState animationState2 = animatable2.c;
                                Modifier modifierB = GraphicsLayerModifierKt.b(Modifier.Companion.d, ((Number) ((SnapshotMutableStateImpl) animationState2.e).getD()).floatValue(), ((Number) ((SnapshotMutableStateImpl) animationState2.e).getD()).floatValue(), ((Number) ((SnapshotMutableStateImpl) animationState.e).getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131064);
                                boolean zN2 = composer.n(snackbarData4);
                                Object objG7 = composer.G();
                                if (zN2 || objG7 == obj8) {
                                    objG7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj9) {
                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj9;
                                            SemanticsPropertiesKt.n(semanticsPropertyReceiver, 0);
                                            final SnackbarData snackbarData5 = snackbarData4;
                                            SemanticsPropertiesKt.d(semanticsPropertyReceiver, new Function0<Boolean>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
                                                {
                                                    super(0);
                                                }

                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    snackbarData5.dismiss();
                                                    return Boolean.TRUE;
                                                }
                                            });
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer.A(objG7);
                                }
                                Modifier modifierB2 = SemanticsModifierKt.b(modifierB, false, (Function1) objG7);
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                int p = composer.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer.d();
                                Modifier modifierD = ComposedModifierKt.d(composer, modifierB2);
                                ComposeUiNode.e3.getClass();
                                Function0 function02 = ComposeUiNode.Companion.b;
                                if (composer.w() == null) {
                                    ComposablesKt.b();
                                    throw null;
                                }
                                composer.i();
                                if (composer.getO()) {
                                    composer.K(function02);
                                } else {
                                    composer.e();
                                }
                                Updater.b(composer, measurePolicyD, ComposeUiNode.Companion.g);
                                Updater.b(composer, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                                Function2 function22 = ComposeUiNode.Companion.j;
                                if (composer.getO() || !Intrinsics.c(composer.G(), Integer.valueOf(p))) {
                                    androidx.camera.core.impl.b.z(p, composer, p, function22);
                                }
                                Updater.b(composer, modifierD, ComposeUiNode.Companion.d);
                                androidx.camera.core.impl.b.A(iIntValue & 14, composer, function2);
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV)));
                }
            }
            composerImplV.V(false);
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
            int i6 = composerImplV.P;
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
            if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i6))) {
                androidx.camera.core.impl.b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            fadeInFadeOutState2.c = ComposablesKt.a(composerImplV);
            composerImplV.o(1748085441);
            int size3 = arrayList.size();
            for (int i7 = 0; i7 < size3; i7++) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) arrayList.get(i7);
                final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.f1448a;
                ComposableLambdaImpl composableLambdaImpl3 = fadeInFadeOutAnimationItem.b;
                composerImplV.J(1201076541, snackbarData3);
                composableLambdaImpl3.invoke(ComposableLambdaKt.c(-1135367807, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                        ComposableLambdaImpl composableLambdaImpl4 = ComposableSingletons$SnackbarHostKt.f1424a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj5, Object obj6) {
                        Composer composer = (Composer) obj5;
                        if ((((Number) obj6).intValue() & 3) == 2 && composer.c()) {
                            composer.j();
                        } else {
                            ComposableLambdaImpl composableLambdaImpl4 = ComposableSingletons$SnackbarHostKt.f1424a;
                            SnackbarData snackbarData4 = snackbarData3;
                            Intrinsics.e(snackbarData4);
                            composableLambdaImpl4.invoke(snackbarData4, composer, 0);
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
            recomposeScopeImplX.d = new SnackbarHostKt$FadeInFadeOutWithScale$3(snackbarData, modifier, iA);
        }
        return Unit.f24250a;
    }
}
