package androidx.compose.animation;

import androidx.camera.core.impl.b;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003¨\u0006\u0006²\u0006$\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function2;", "Landroidx/compose/animation/EnterExitState;", "", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class AnimatedVisibilityKt {
    public static final void a(final Transition transition, final Function1 function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function2 function2, final Function3 function3, Composer composer, final int i) {
        int i2;
        Composer$Companion$Empty$1 composer$Companion$Empty$1;
        boolean z;
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        Transition.DeferredAnimation deferredAnimation3;
        Transition.DeferredAnimation deferredAnimation4;
        Transition.DeferredAnimation deferredAnimation5;
        Transition.DeferredAnimation deferredAnimation6;
        Transition.DeferredAnimation deferredAnimation7;
        Transition.DeferredAnimation deferredAnimation8;
        Transition.DeferredAnimation deferredAnimationC;
        ExitTransition exitTransition2;
        EnterTransition enterTransition2;
        boolean z2;
        ComposerImpl composerImplV = composer.v(-891967166);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.n(enterTransition) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.n(exitTransition) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(function2) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            i3 |= composerImplV.I(function3) ? 8388608 : 4194304;
        }
        if (composerImplV.z(i3 & 1, (4793491 & i3) != 4793490)) {
            MutableState mutableState = transition.d;
            TransitionState transitionState = transition.f776a;
            if (((Boolean) function1.invoke(((SnapshotMutableStateImpl) mutableState).getD())).booleanValue() || ((Boolean) function1.invoke(transitionState.a())).booleanValue() || transition.i() || transition.d()) {
                composerImplV.o(1788522886);
                int i4 = i3 & 14;
                int i5 = i4 | 48;
                int i6 = i5 & 14;
                boolean z3 = ((i6 ^ 6) > 4 && composerImplV.n(transition)) || (i5 & 6) == 4;
                Object objG = composerImplV.G();
                boolean z4 = z3;
                Composer$Companion$Empty$1 composer$Companion$Empty$12 = Composer.Companion.f1624a;
                if (z4 || objG == composer$Companion$Empty$12) {
                    objG = transitionState.a();
                    composerImplV.A(objG);
                }
                if (transition.i()) {
                    objG = transitionState.a();
                }
                composerImplV.o(-466616829);
                EnterExitState enterExitStateG = g(transition, function1, objG, composerImplV);
                composerImplV.V(false);
                Object d = ((SnapshotMutableStateImpl) transition.d).getD();
                composerImplV.o(-466616829);
                EnterExitState enterExitStateG2 = g(transition, function1, d, composerImplV);
                composerImplV.V(false);
                final Transition transitionB = androidx.compose.animation.core.TransitionKt.b(transition, enterExitStateG, enterExitStateG2, composerImplV, i6 | 3072);
                MutableState mutableStateL = SnapshotStateKt.l(function2, composerImplV);
                TransitionState transitionState2 = transitionB.f776a;
                TransitionState transitionState3 = transitionB.f776a;
                int i7 = i3;
                MutableState mutableState2 = transitionB.d;
                Object objInvoke = function2.invoke(transitionState2.a(), ((SnapshotMutableStateImpl) mutableState2).getD());
                boolean zN = composerImplV.n(transitionB) | composerImplV.n(mutableStateL);
                Object objG2 = composerImplV.G();
                if (zN || objG2 == composer$Companion$Empty$12) {
                    objG2 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1(transitionB, mutableStateL, null);
                    composerImplV.A(objG2);
                }
                MutableState mutableStateH = SnapshotStateKt.h(composerImplV, objInvoke, (Function2) objG2);
                Object objA = transitionState3.a();
                EnterExitState enterExitState = EnterExitState.f;
                if (objA == enterExitState && ((SnapshotMutableStateImpl) mutableState2).getD() == enterExitState && ((Boolean) mutableStateH.getD()).booleanValue()) {
                    composerImplV.o(1790688794);
                    z2 = false;
                    composerImplV.V(false);
                } else {
                    composerImplV.o(1789551931);
                    boolean z5 = i4 == 4;
                    Object objG3 = composerImplV.G();
                    if (z5 || objG3 == composer$Companion$Empty$12) {
                        objG3 = new AnimatedVisibilityScopeImpl(transitionB);
                        composerImplV.A(objG3);
                    }
                    AnimatedVisibilityScopeImpl animatedVisibilityScopeImpl = (AnimatedVisibilityScopeImpl) objG3;
                    TwoWayConverter twoWayConverter = EnterExitTransitionKt.f721a;
                    boolean zN2 = composerImplV.n(transitionB);
                    Object objG4 = composerImplV.G();
                    if (zN2 || objG4 == composer$Companion$Empty$12) {
                        objG4 = SnapshotStateKt.f(enterTransition);
                        composerImplV.A(objG4);
                    }
                    MutableState mutableState3 = (MutableState) objG4;
                    SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState2;
                    if (transitionState3.a() == snapshotMutableStateImpl.getD() && transitionState3.a() == EnterExitState.e) {
                        if (transitionB.i()) {
                            mutableState3.setValue(enterTransition);
                        } else {
                            mutableState3.setValue(EnterTransition.f722a);
                        }
                    } else if (snapshotMutableStateImpl.getD() == EnterExitState.e) {
                        mutableState3.setValue(((EnterTransition) mutableState3.getD()).b(enterTransition));
                    }
                    final EnterTransition enterTransition3 = (EnterTransition) mutableState3.getD();
                    boolean zN3 = composerImplV.n(transitionB);
                    Object objG5 = composerImplV.G();
                    if (zN3 || objG5 == composer$Companion$Empty$12) {
                        objG5 = SnapshotStateKt.f(exitTransition);
                        composerImplV.A(objG5);
                    }
                    MutableState mutableState4 = (MutableState) objG5;
                    if (transitionState3.a() == snapshotMutableStateImpl.getD() && transitionState3.a() == EnterExitState.e) {
                        if (transitionB.i()) {
                            mutableState4.setValue(exitTransition);
                        } else {
                            mutableState4.setValue(ExitTransition.f723a);
                        }
                    } else if (snapshotMutableStateImpl.getD() != EnterExitState.e) {
                        mutableState4.setValue(((ExitTransition) mutableState4.getD()).b(exitTransition));
                    }
                    final ExitTransition exitTransition3 = (ExitTransition) mutableState4.getD();
                    boolean z6 = (enterTransition3.getB().b == null && exitTransition3.getC().b == null) ? false : true;
                    boolean z7 = (enterTransition3.getB().c == null && exitTransition3.getC().c == null) ? false : true;
                    if (z6) {
                        composerImplV.o(-821159459);
                        TwoWayConverter twoWayConverter2 = VectorConvertersKt.g;
                        Object objG6 = composerImplV.G();
                        if (objG6 == composer$Companion$Empty$12) {
                            objG6 = "Built-in slide";
                            composerImplV.A("Built-in slide");
                        }
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        z = true;
                        deferredAnimation = null;
                        Transition.DeferredAnimation deferredAnimationC2 = androidx.compose.animation.core.TransitionKt.c(transitionB, twoWayConverter2, (String) objG6, composerImplV, KyberEngine.KyberPolyBytes, 0);
                        composerImplV.l();
                        deferredAnimation2 = deferredAnimationC2;
                    } else {
                        composer$Companion$Empty$1 = composer$Companion$Empty$12;
                        z = true;
                        deferredAnimation = null;
                        composerImplV.o(-821053656);
                        composerImplV.l();
                        deferredAnimation2 = null;
                    }
                    if (z7) {
                        composerImplV.o(-820961865);
                        TwoWayConverter twoWayConverter3 = VectorConvertersKt.h;
                        Object objG7 = composerImplV.G();
                        if (objG7 == composer$Companion$Empty$1) {
                            objG7 = "Built-in shrink/expand";
                            composerImplV.A("Built-in shrink/expand");
                        }
                        Transition.DeferredAnimation deferredAnimationC3 = androidx.compose.animation.core.TransitionKt.c(transitionB, twoWayConverter3, (String) objG7, composerImplV, KyberEngine.KyberPolyBytes, 0);
                        composerImplV.l();
                        deferredAnimation3 = deferredAnimationC3;
                    } else {
                        composerImplV.o(-820851041);
                        composerImplV.l();
                        deferredAnimation3 = deferredAnimation;
                    }
                    if (z7) {
                        composerImplV.o(-820777446);
                        TwoWayConverter twoWayConverter4 = VectorConvertersKt.g;
                        Object objG8 = composerImplV.G();
                        if (objG8 == composer$Companion$Empty$1) {
                            objG8 = "Built-in InterruptionHandlingOffset";
                            composerImplV.A("Built-in InterruptionHandlingOffset");
                        }
                        Transition.DeferredAnimation deferredAnimationC4 = androidx.compose.animation.core.TransitionKt.c(transitionB, twoWayConverter4, (String) objG8, composerImplV, KyberEngine.KyberPolyBytes, 0);
                        composerImplV.l();
                        deferredAnimation4 = deferredAnimationC4;
                    } else {
                        composerImplV.o(-820608001);
                        composerImplV.l();
                        deferredAnimation4 = deferredAnimation;
                    }
                    ChangeSize changeSize = enterTransition3.getB().c;
                    ChangeSize changeSize2 = exitTransition3.getC().c;
                    final boolean z8 = !z7;
                    boolean z9 = (enterTransition3.getB().f738a == null && exitTransition3.getC().f738a == null) ? false : z;
                    boolean z10 = (enterTransition3.getB().d == null && exitTransition3.getC().d == null) ? false : z;
                    if (z9) {
                        composerImplV.o(-675026101);
                        TwoWayConverter twoWayConverter5 = VectorConvertersKt.f788a;
                        Object objG9 = composerImplV.G();
                        if (objG9 == composer$Companion$Empty$1) {
                            objG9 = "Built-in alpha";
                            composerImplV.A("Built-in alpha");
                        }
                        Transition.DeferredAnimation deferredAnimationC5 = androidx.compose.animation.core.TransitionKt.c(transitionB, twoWayConverter5, (String) objG9, composerImplV, KyberEngine.KyberPolyBytes, 0);
                        composerImplV.l();
                        deferredAnimation5 = deferredAnimationC5;
                    } else {
                        composerImplV.o(-674857617);
                        composerImplV.l();
                        deferredAnimation5 = deferredAnimation;
                    }
                    if (z10) {
                        composerImplV.o(-674790005);
                        TwoWayConverter twoWayConverter6 = VectorConvertersKt.f788a;
                        Object objG10 = composerImplV.G();
                        if (objG10 == composer$Companion$Empty$1) {
                            objG10 = "Built-in scale";
                            composerImplV.A("Built-in scale");
                        }
                        deferredAnimation6 = deferredAnimation5;
                        Transition.DeferredAnimation deferredAnimationC6 = androidx.compose.animation.core.TransitionKt.c(transitionB, twoWayConverter6, (String) objG10, composerImplV, KyberEngine.KyberPolyBytes, 0);
                        composerImplV.l();
                        deferredAnimation7 = deferredAnimationC6;
                    } else {
                        deferredAnimation6 = deferredAnimation5;
                        composerImplV.o(-674621521);
                        composerImplV.l();
                        deferredAnimation7 = deferredAnimation;
                    }
                    if (z10) {
                        composerImplV.o(-674543896);
                        deferredAnimation8 = deferredAnimation7;
                        deferredAnimationC = androidx.compose.animation.core.TransitionKt.c(transitionB, EnterExitTransitionKt.f721a, "TransformOriginInterruptionHandling", composerImplV, KyberEngine.KyberPolyBytes, 0);
                        composerImplV.l();
                    } else {
                        deferredAnimation8 = deferredAnimation7;
                        composerImplV.o(-674372529);
                        composerImplV.l();
                        deferredAnimationC = deferredAnimation;
                    }
                    boolean zI = composerImplV.I(deferredAnimation6) | composerImplV.n(enterTransition3) | composerImplV.n(exitTransition3) | composerImplV.I(deferredAnimation8) | composerImplV.n(transitionB) | composerImplV.I(deferredAnimationC);
                    Object objG11 = composerImplV.G();
                    if (zI || objG11 == composer$Companion$Empty$1) {
                        final Transition.DeferredAnimation deferredAnimation9 = deferredAnimation6;
                        final Transition.DeferredAnimation deferredAnimation10 = deferredAnimation8;
                        final Transition.DeferredAnimation deferredAnimation11 = deferredAnimationC;
                        objG11 = new GraphicsLayerBlockForEnterExit() { // from class: androidx.compose.animation.a
                            /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
                            @Override // androidx.compose.animation.GraphicsLayerBlockForEnterExit
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct code enable 'Show inconsistent code' option in preferences
                            */
                            public final kotlin.jvm.functions.Function1 init() {
                                /*
                                    r8 = this;
                                    androidx.compose.animation.core.TwoWayConverter r0 = androidx.compose.animation.EnterExitTransitionKt.f721a
                                    androidx.compose.animation.core.Transition$DeferredAnimation r0 = r1
                                    androidx.compose.animation.EnterTransition r1 = r4
                                    androidx.compose.animation.ExitTransition r2 = r5
                                    r3 = 0
                                    if (r0 == 0) goto L1a
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1 r4 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
                                    r4.<init>()
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2 r5 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2
                                    r5.<init>()
                                    androidx.compose.animation.core.Transition$DeferredAnimation$DeferredAnimationData r0 = r0.a(r4, r5)
                                    goto L1b
                                L1a:
                                    r0 = r3
                                L1b:
                                    androidx.compose.animation.core.Transition$DeferredAnimation r4 = r2
                                    if (r4 == 0) goto L2e
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1 r5 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
                                    r5.<init>()
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2 r6 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2
                                    r6.<init>()
                                    androidx.compose.animation.core.Transition$DeferredAnimation$DeferredAnimationData r4 = r4.a(r5, r6)
                                    goto L2f
                                L2e:
                                    r4 = r3
                                L2f:
                                    androidx.compose.animation.core.Transition r5 = r3
                                    androidx.compose.animation.core.TransitionState r5 = r5.f776a
                                    java.lang.Object r5 = r5.a()
                                    androidx.compose.animation.EnterExitState r6 = androidx.compose.animation.EnterExitState.d
                                    if (r5 != r6) goto L5d
                                    androidx.compose.animation.TransitionData r5 = r1.getB()
                                    androidx.compose.animation.Scale r5 = r5.d
                                    if (r5 == 0) goto L4b
                                    long r5 = r5.b
                                    androidx.compose.ui.graphics.TransformOrigin r7 = new androidx.compose.ui.graphics.TransformOrigin
                                    r7.<init>(r5)
                                    goto L7c
                                L4b:
                                    androidx.compose.animation.TransitionData r5 = r2.getC()
                                    androidx.compose.animation.Scale r5 = r5.d
                                    if (r5 == 0) goto L5b
                                    long r5 = r5.b
                                    androidx.compose.ui.graphics.TransformOrigin r7 = new androidx.compose.ui.graphics.TransformOrigin
                                    r7.<init>(r5)
                                    goto L7c
                                L5b:
                                    r7 = r3
                                    goto L7c
                                L5d:
                                    androidx.compose.animation.TransitionData r5 = r2.getC()
                                    androidx.compose.animation.Scale r5 = r5.d
                                    if (r5 == 0) goto L6d
                                    long r5 = r5.b
                                    androidx.compose.ui.graphics.TransformOrigin r7 = new androidx.compose.ui.graphics.TransformOrigin
                                    r7.<init>(r5)
                                    goto L7c
                                L6d:
                                    androidx.compose.animation.TransitionData r5 = r1.getB()
                                    androidx.compose.animation.Scale r5 = r5.d
                                    if (r5 == 0) goto L5b
                                    long r5 = r5.b
                                    androidx.compose.ui.graphics.TransformOrigin r7 = new androidx.compose.ui.graphics.TransformOrigin
                                    r7.<init>(r5)
                                L7c:
                                    androidx.compose.animation.core.Transition$DeferredAnimation r5 = r6
                                    if (r5 == 0) goto L8b
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2 r3 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2
                                    r3.<init>()
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1 r1 = androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1.h
                                    androidx.compose.animation.core.Transition$DeferredAnimation$DeferredAnimationData r3 = r5.a(r1, r3)
                                L8b:
                                    androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1 r1 = new androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
                                    r1.<init>()
                                    return r1
                                */
                                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.init():kotlin.jvm.functions.Function1");
                            }
                        };
                        exitTransition2 = exitTransition3;
                        enterTransition2 = enterTransition3;
                        composerImplV.A(objG11);
                    } else {
                        enterTransition2 = enterTransition3;
                        exitTransition2 = exitTransition3;
                    }
                    GraphicsLayerBlockForEnterExit graphicsLayerBlockForEnterExit = (GraphicsLayerBlockForEnterExit) objG11;
                    boolean zP = composerImplV.p(z8) | composerImplV.n(EnterExitTransitionKt$createModifier$1.h);
                    Object objG12 = composerImplV.G();
                    if (zP || objG12 == composer$Companion$Empty$1) {
                        objG12 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
                            public final /* synthetic */ Function0 i = EnterExitTransitionKt$createModifier$1.h;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((GraphicsLayerScope) obj).z(!z8 && ((Boolean) this.i.invoke()).booleanValue());
                                return Unit.f24250a;
                            }
                        };
                        composerImplV.A(objG12);
                    }
                    Modifier.Companion companion = Modifier.Companion.d;
                    Modifier modifierX0 = GraphicsLayerModifierKt.a(companion, (Function1) objG12).x0(new EnterExitTransitionElement(transitionB, deferredAnimation3, deferredAnimation4, deferredAnimation2, enterTransition2, exitTransition2, graphicsLayerBlockForEnterExit));
                    composerImplV.o(1581779440);
                    composerImplV.V(false);
                    Modifier modifierX02 = modifier.x0(modifierX0.x0(companion));
                    Object objG13 = composerImplV.G();
                    if (objG13 == composer$Companion$Empty$1) {
                        objG13 = new AnimatedEnterExitMeasurePolicy(animatedVisibilityScopeImpl);
                        composerImplV.A(objG13);
                    }
                    AnimatedEnterExitMeasurePolicy animatedEnterExitMeasurePolicy = (AnimatedEnterExitMeasurePolicy) objG13;
                    int i8 = composerImplV.P;
                    PersistentCompositionLocalMap persistentCompositionLocalMapQ = composerImplV.Q();
                    Modifier modifierD = ComposedModifierKt.d(composerImplV, modifierX02);
                    ComposeUiNode.e3.getClass();
                    Function0 function0 = ComposeUiNode.Companion.b;
                    composerImplV.i();
                    if (composerImplV.O) {
                        composerImplV.K(function0);
                    } else {
                        composerImplV.e();
                    }
                    Updater.b(composerImplV, animatedEnterExitMeasurePolicy, ComposeUiNode.Companion.g);
                    Updater.b(composerImplV, persistentCompositionLocalMapQ, ComposeUiNode.Companion.f);
                    Function2 function22 = ComposeUiNode.Companion.j;
                    if (composerImplV.O || !Intrinsics.c(composerImplV.G(), Integer.valueOf(i8))) {
                        b.B(i8, composerImplV, i8, function22);
                    }
                    Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
                    function3.invoke(animatedVisibilityScopeImpl, composerImplV, Integer.valueOf((i7 >> 18) & 112));
                    composerImplV.V(z);
                    z2 = false;
                    composerImplV.V(false);
                }
                composerImplV.V(z2);
            } else {
                composerImplV.o(1790694746);
                composerImplV.V(false);
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AnimatedVisibilityKt.a(transition, function1, modifier, enterTransition, exitTransition, function2, function3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final void b(final MutableTransitionState mutableTransitionState, Modifier modifier, final EnterTransition enterTransition, ExitTransition exitTransition, String str, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i, final int i2) {
        ExitTransition exitTransition2;
        int i3;
        final Modifier modifier2;
        final String str2;
        final ExitTransition exitTransition3;
        ComposerImpl composerImplV = composer.v(-222898426);
        int i4 = (composerImplV.n(mutableTransitionState) ? 4 : 2) | i | 48;
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i4 |= composerImplV.n(enterTransition) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            exitTransition2 = exitTransition;
        } else {
            exitTransition2 = exitTransition;
            i3 = i4 | (composerImplV.n(exitTransition2) ? 2048 : 1024);
        }
        int i6 = i3 | 24576;
        if (composerImplV.z(i6 & 1, (74899 & i6) != 74898)) {
            ExitTransition exitTransitionB = i5 != 0 ? EnterExitTransitionKt.f(null, 3).b(EnterExitTransitionKt.j(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntSize(VisibilityThresholdsKt.b()), 1), (15 & 2) != 0 ? Alignment.Companion.i : Alignment.Companion.h, EnterExitTransitionKt$shrinkOut$1.h)) : exitTransition2;
            Transition transitionE = androidx.compose.animation.core.TransitionKt.e(mutableTransitionState, "AnimatedVisibility", composerImplV, (i6 & 14) | 48);
            int i7 = i6 << 3;
            AnimatedVisibilityKt$AnimatedVisibility$7 animatedVisibilityKt$AnimatedVisibility$7 = AnimatedVisibilityKt$AnimatedVisibility$7.h;
            Modifier.Companion companion = Modifier.Companion.d;
            f(transitionE, animatedVisibilityKt$AnimatedVisibility$7, companion, enterTransition, exitTransitionB, composableLambdaImpl, composerImplV, (i7 & 57344) | (i7 & 7168) | 432 | 196608);
            str2 = "AnimatedVisibility";
            modifier2 = companion;
            exitTransition3 = exitTransitionB;
        } else {
            composerImplV.j();
            modifier2 = modifier;
            str2 = str;
            exitTransition3 = exitTransition2;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AnimatedVisibilityKt.b(mutableTransitionState, modifier2, enterTransition, exitTransition3, str2, composableLambdaImpl, (Composer) obj, RecomposeScopeImplKt.a(i | 1), i2);
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(final androidx.compose.foundation.layout.ColumnScope r17, final boolean r18, androidx.compose.ui.Modifier r19, androidx.compose.animation.EnterTransition r20, androidx.compose.animation.ExitTransition r21, java.lang.String r22, final androidx.compose.runtime.internal.ComposableLambdaImpl r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.c(androidx.compose.foundation.layout.ColumnScope, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(final boolean r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.EnterTransition r18, androidx.compose.animation.ExitTransition r19, java.lang.String r20, final androidx.compose.runtime.internal.ComposableLambdaImpl r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.d(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(final boolean r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.EnterTransition r18, androidx.compose.animation.ExitTransition r19, java.lang.String r20, final androidx.compose.runtime.internal.ComposableLambdaImpl r21, androidx.compose.runtime.Composer r22, final int r23, final int r24) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt.e(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(final Transition transition, final Function1 function1, final Modifier modifier, final EnterTransition enterTransition, final ExitTransition exitTransition, final Function3 function3, Composer composer, final int i) {
        int i2;
        EnterTransition enterTransition2;
        ExitTransition exitTransition2;
        Function3 function32;
        ComposerImpl composerImplV = composer.v(429978603);
        if ((i & 6) == 0) {
            i2 = (composerImplV.n(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.I(function1) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.n(modifier) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            enterTransition2 = enterTransition;
            i2 |= composerImplV.n(enterTransition2) ? 2048 : 1024;
        } else {
            enterTransition2 = enterTransition;
        }
        if ((i & 24576) == 0) {
            exitTransition2 = exitTransition;
            i2 |= composerImplV.n(exitTransition2) ? 16384 : 8192;
        } else {
            exitTransition2 = exitTransition;
        }
        if ((i & 196608) == 0) {
            function32 = function3;
            i2 |= composerImplV.I(function32) ? 131072 : 65536;
        } else {
            function32 = function3;
        }
        if (composerImplV.z(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z = (i3 == 32) | (i4 == 4);
            Object objG = composerImplV.G();
            if (z || objG == Composer.Companion.f1624a) {
                objG = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
                    @Override // kotlin.jvm.functions.Function3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
                        /*
                            r8 = this;
                            androidx.compose.ui.layout.MeasureScope r9 = (androidx.compose.ui.layout.MeasureScope) r9
                            androidx.compose.ui.layout.Measurable r10 = (androidx.compose.ui.layout.Measurable) r10
                            androidx.compose.ui.unit.Constraints r11 = (androidx.compose.ui.unit.Constraints) r11
                            long r0 = r11.f2197a
                            androidx.compose.ui.layout.Placeable r10 = r10.c0(r0)
                            boolean r11 = r9.l1()
                            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
                            r2 = 32
                            if (r11 == 0) goto L34
                            androidx.compose.animation.core.Transition r11 = r2
                            androidx.compose.runtime.MutableState r11 = r11.d
                            androidx.compose.runtime.SnapshotMutableStateImpl r11 = (androidx.compose.runtime.SnapshotMutableStateImpl) r11
                            java.lang.Object r11 = r11.getD()
                            kotlin.jvm.functions.Function1 r3 = r1
                            java.lang.Object r11 = r3.invoke(r11)
                            java.lang.Boolean r11 = (java.lang.Boolean) r11
                            boolean r11 = r11.booleanValue()
                            if (r11 != 0) goto L34
                            r3 = 0
                            goto L3e
                        L34:
                            int r11 = r10.d
                            int r3 = r10.e
                            long r4 = (long) r11
                            long r4 = r4 << r2
                            long r6 = (long) r3
                            long r6 = r6 & r0
                            long r3 = r4 | r6
                        L3e:
                            long r5 = r3 >> r2
                            int r11 = (int) r5
                            long r0 = r0 & r3
                            int r0 = (int) r0
                            androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1 r1 = new androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1
                            r1.<init>()
                            java.util.Map r10 = kotlin.collections.MapsKt.d()
                            androidx.compose.ui.layout.MeasureResult r9 = r9.L0(r11, r0, r10, r1)
                            return r9
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                composerImplV.A(objG);
            }
            a(transition, function1, LayoutModifierKt.a(modifier, (Function3) objG), enterTransition2, exitTransition2, AnimatedVisibilityKt$AnimatedVisibilityImpl$2.h, function32, composerImplV, i4 | 196608 | i3 | (i2 & 7168) | (57344 & i2) | ((i2 << 6) & 29360128));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    AnimatedVisibilityKt.f(transition, function1, modifier, enterTransition, exitTransition, function3, (Composer) obj, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    public static final EnterExitState g(Transition transition, Function1 function1, Object obj, Composer composer) {
        EnterExitState enterExitState;
        composer.J(-902032957, transition);
        boolean zI = transition.i();
        TransitionState transitionState = transition.f776a;
        if (zI) {
            composer.o(2101770115);
            composer.l();
            enterExitState = ((Boolean) function1.invoke(obj)).booleanValue() ? EnterExitState.e : ((Boolean) function1.invoke(transitionState.a())).booleanValue() ? EnterExitState.f : EnterExitState.d;
        } else {
            composer.o(2102044248);
            Object objG = composer.G();
            if (objG == Composer.Companion.f1624a) {
                objG = SnapshotStateKt.f(Boolean.FALSE);
                composer.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            if (((Boolean) function1.invoke(transitionState.a())).booleanValue()) {
                mutableState.setValue(Boolean.TRUE);
            }
            enterExitState = ((Boolean) function1.invoke(obj)).booleanValue() ? EnterExitState.e : ((Boolean) mutableState.getD()).booleanValue() ? EnterExitState.f : EnterExitState.d;
            composer.l();
        }
        composer.M();
        return enterExitState;
    }
}
