package androidx.compose.material;

import androidx.camera.core.impl.b;
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
import androidx.compose.ui.platform.AccessibilityManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*b\b\u0002\u0010\u0007\"-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u00032-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0002\b\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "content", "FadeInFadeOutTransition", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SnackbarHostKt {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
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

    public static final void a(final SnackbarData snackbarData, final Modifier modifier, final Function3 function3, Composer composer, final int i) {
        boolean z;
        ComposerImpl composerImplV = composer.v(2036134589);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerImplV.n(snackbarData) : composerImplV.I(snackbarData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(function3) ? 256 : 128;
        }
        if (composerImplV.z(i2 & 1, (i2 & 147) != 146)) {
            Object objG = composerImplV.G();
            Object obj = objG;
            if (objG == Composer.Companion.f1624a) {
                FadeInFadeOutState fadeInFadeOutState = new FadeInFadeOutState();
                fadeInFadeOutState.f1285a = new Object();
                fadeInFadeOutState.b = new ArrayList();
                composerImplV.A(fadeInFadeOutState);
                obj = fadeInFadeOutState;
            }
            final FadeInFadeOutState fadeInFadeOutState2 = (FadeInFadeOutState) obj;
            final String strA = Strings_androidKt.a(composerImplV, 7);
            Object obj2 = fadeInFadeOutState2.f1285a;
            ArrayList arrayList = fadeInFadeOutState2.b;
            if (Intrinsics.c(snackbarData, obj2)) {
                z = false;
                composerImplV.o(1524617353);
                composerImplV.V(false);
            } else {
                composerImplV.o(1522020731);
                fadeInFadeOutState2.f1285a = snackbarData;
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    arrayList2.add((SnackbarData) ((FadeInFadeOutAnimationItem) arrayList.get(i3)).c());
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
                    arrayList.add(new FadeInFadeOutAnimationItem(snackbarData2, ComposableLambdaKt.c(1471040642, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            Function2 function2 = (Function2) obj3;
                            Composer composer2 = (Composer) obj4;
                            int iIntValue = ((Number) obj5).intValue();
                            if ((iIntValue & 6) == 0) {
                                iIntValue |= composer2.I(function2) ? 4 : 2;
                            }
                            if (composer2.z(iIntValue & 1, (iIntValue & 19) != 18)) {
                                SnackbarData snackbarData3 = snackbarData;
                                final SnackbarData snackbarData4 = snackbarData2;
                                final boolean zC = Intrinsics.c(snackbarData4, snackbarData3);
                                int i5 = zC ? 150 : 75;
                                int i6 = (!zC || ListUtilsKt.a(arrayListJ0).size() == 1) ? 0 : 75;
                                TweenSpec tweenSpec = new TweenSpec(i5, i6, EasingKt.d);
                                boolean zI = composer2.I(snackbarData4);
                                final FadeInFadeOutState fadeInFadeOutState3 = fadeInFadeOutState2;
                                boolean zI2 = zI | composer2.I(fadeInFadeOutState3);
                                Object objG2 = composer2.G();
                                Object obj6 = Composer.Companion.f1624a;
                                if (zI2 || objG2 == obj6) {
                                    objG2 = new Function0<Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            FadeInFadeOutState fadeInFadeOutState4 = fadeInFadeOutState3;
                                            Object obj7 = fadeInFadeOutState4.f1285a;
                                            final SnackbarData snackbarData5 = snackbarData4;
                                            if (!Intrinsics.c(snackbarData5, obj7)) {
                                                CollectionsKt.g0(fadeInFadeOutState4.b, new Function1<FadeInFadeOutAnimationItem<SnackbarData>, Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1.1
                                                    {
                                                        super(1);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj8) {
                                                        return Boolean.valueOf(Intrinsics.c(((FadeInFadeOutAnimationItem) obj8).f1284a, snackbarData5));
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
                                    composer2.A(objG2);
                                }
                                Function0 function0 = (Function0) objG2;
                                Object objG3 = composer2.G();
                                if (objG3 == obj6) {
                                    objG3 = AnimatableKt.a(!zC ? 1.0f : BitmapDescriptorFactory.HUE_RED);
                                    composer2.A(objG3);
                                }
                                Animatable animatable = (Animatable) objG3;
                                Boolean boolValueOf = Boolean.valueOf(zC);
                                boolean zI3 = composer2.I(animatable) | composer2.p(zC) | composer2.I(tweenSpec) | composer2.n(function0);
                                Object objG4 = composer2.G();
                                if (zI3 || objG4 == obj6) {
                                    Object snackbarHostKt$animatedOpacity$2$1 = new SnackbarHostKt$animatedOpacity$2$1(animatable, zC, tweenSpec, function0, null);
                                    composer2.A(snackbarHostKt$animatedOpacity$2$1);
                                    objG4 = snackbarHostKt$animatedOpacity$2$1;
                                }
                                EffectsKt.e(composer2, boolValueOf, (Function2) objG4);
                                AnimationState animationState = animatable.c;
                                TweenSpec tweenSpec2 = new TweenSpec(i5, i6, EasingKt.f756a);
                                Object objG5 = composer2.G();
                                if (objG5 == obj6) {
                                    objG5 = AnimatableKt.a(zC ? 0.8f : 1.0f);
                                    composer2.A(objG5);
                                }
                                Animatable animatable2 = (Animatable) objG5;
                                Boolean boolValueOf2 = Boolean.valueOf(zC);
                                boolean zI4 = composer2.I(animatable2) | composer2.p(zC) | composer2.I(tweenSpec2);
                                Object objG6 = composer2.G();
                                if (zI4 || objG6 == obj6) {
                                    objG6 = new SnackbarHostKt$animatedScale$1$1(animatable2, zC, tweenSpec2, null);
                                    composer2.A(objG6);
                                }
                                EffectsKt.e(composer2, boolValueOf2, (Function2) objG6);
                                AnimationState animationState2 = animatable2.c;
                                Modifier modifierB = GraphicsLayerModifierKt.b(Modifier.Companion.d, ((Number) ((SnapshotMutableStateImpl) animationState2.e).getD()).floatValue(), ((Number) ((SnapshotMutableStateImpl) animationState2.e).getD()).floatValue(), ((Number) ((SnapshotMutableStateImpl) animationState.e).getD()).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 131064);
                                boolean zP = composer2.p(zC);
                                final String str = strA;
                                boolean zN = zP | composer2.n(str) | composer2.I(snackbarData4);
                                Object objG7 = composer2.G();
                                if (zN || objG7 == obj6) {
                                    objG7 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj7) {
                                            SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj7;
                                            if (zC) {
                                                SemanticsPropertiesKt.n(semanticsPropertyReceiver, 0);
                                            }
                                            SemanticsPropertiesKt.o(semanticsPropertyReceiver, str);
                                            final SnackbarData snackbarData5 = snackbarData4;
                                            SemanticsPropertiesKt.d(semanticsPropertyReceiver, new Function0<Boolean>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1.1
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
                                    composer2.A(objG7);
                                }
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
                                Function2 function22 = ComposeUiNode.Companion.j;
                                if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                                    b.z(p, composer2, p, function22);
                                }
                                Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                                b.A(iIntValue & 14, composer2, function2);
                            } else {
                                composer2.j();
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV)));
                }
                z = false;
                composerImplV.V(false);
            }
            MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, z);
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
                b.B(i5, composerImplV, i5, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            fadeInFadeOutState2.c = ComposablesKt.a(composerImplV);
            composerImplV.o(1801449988);
            int size3 = arrayList.size();
            for (int i6 = 0; i6 < size3; i6++) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) arrayList.get(i6);
                final SnackbarData snackbarData3 = (SnackbarData) fadeInFadeOutAnimationItem.getF1284a();
                Function3 function3B = fadeInFadeOutAnimationItem.b();
                composerImplV.J(2123994112, snackbarData3);
                ((ComposableLambdaImpl) function3B).invoke(ComposableLambdaKt.c(2041982076, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$2$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        Composer composer2 = (Composer) obj3;
                        int iIntValue = ((Number) obj4).intValue();
                        if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                            SnackbarData snackbarData4 = snackbarData3;
                            Intrinsics.e(snackbarData4);
                            function3.invoke(snackbarData4, composer2, 0);
                        } else {
                            composer2.j();
                        }
                        return Unit.f24250a;
                    }
                }, composerImplV), composerImplV, 6);
                composerImplV.V(false);
            }
            composerImplV.V(false);
            composerImplV.V(true);
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$FadeInFadeOutWithScale$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Number) obj4).intValue();
                    int iA = RecomposeScopeImplKt.a(i | 1);
                    SnackbarHostKt.a(snackbarData, modifier, function3, (Composer) obj3, iA);
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final SnackbarHostState snackbarHostState, Modifier modifier, Function3 function3, Composer composer, final int i, final int i2) {
        int i3;
        ComposerImpl composerImplV = composer.v(431012348);
        if ((i & 6) == 0) {
            i3 = (composerImplV.n(snackbarHostState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerImplV.n(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= KyberEngine.KyberPolyBytes;
        } else if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i3 |= composerImplV.I(function3) ? 256 : 128;
        }
        if (composerImplV.z(i3 & 1, (i3 & 147) != 146)) {
            if (i4 != 0) {
                modifier = Modifier.Companion.d;
            }
            if (i5 != 0) {
                function3 = ComposableSingletons$SnackbarHostKt.f1258a;
            }
            SnackbarData snackbarData = (SnackbarData) ((SnapshotMutableStateImpl) snackbarHostState.b).getD();
            AccessibilityManager accessibilityManager = (AccessibilityManager) composerImplV.x(CompositionLocalsKt.f1964a);
            boolean zI = composerImplV.I(snackbarData) | composerImplV.I(accessibilityManager);
            Object objG = composerImplV.G();
            if (zI || objG == Composer.Companion.f1624a) {
                objG = new SnackbarHostKt$SnackbarHost$1$1(snackbarData, accessibilityManager, null);
                composerImplV.A(objG);
            }
            EffectsKt.e(composerImplV, snackbarData, (Function2) objG);
            a((SnackbarData) ((SnapshotMutableStateImpl) snackbarHostState.b).getD(), modifier, function3, composerImplV, i3 & 1008);
        } else {
            composerImplV.j();
        }
        final Modifier modifier2 = modifier;
        final Function3 function32 = function3;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SnackbarHostKt$SnackbarHost$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    SnackbarHostKt.b(snackbarHostState, modifier2, function32, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }
}
