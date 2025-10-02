package androidx.compose.animation.graphics.res;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.animation.graphics.vector.AnimatedImageVector;
import androidx.compose.animation.graphics.vector.AnimatedVectorTarget;
import androidx.compose.animation.graphics.vector.Animator;
import androidx.compose.animation.graphics.vector.StateVectorConfig;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainter;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"animation-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AnimatedVectorPainterResources_androidKt {
    public static final VectorPainter a(final AnimatedImageVector animatedImageVector, final boolean z, Composer composer) {
        ComposableLambdaImpl composableLambdaImpl = ComposableSingletons$AnimatedVectorPainterResources_androidKt.f805a;
        ImageVector imageVector = animatedImageVector.f808a;
        return VectorPainterKt.f(imageVector.b, imageVector.c, imageVector.d, imageVector.e, imageVector.f1813a, imageVector.g, imageVector.h, ComposableLambdaKt.c(10512245, new Function4<Float, Float, Composer, Integer, Unit>() { // from class: androidx.compose.animation.graphics.res.AnimatedVectorPainterResources_androidKt$rememberAnimatedVectorPainter$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
                ComposableLambdaImpl composableLambdaImpl2 = ComposableSingletons$AnimatedVectorPainterResources_androidKt.f805a;
            }

            @Override // kotlin.jvm.functions.Function4
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                ((Number) obj).floatValue();
                ((Number) obj2).floatValue();
                Composer composer2 = (Composer) obj3;
                int iIntValue = ((Number) obj4).intValue();
                if (composer2.z(iIntValue & 1, (iIntValue & 129) != 128)) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    AnimatedImageVector animatedImageVector2 = animatedImageVector;
                    Transition transitionF = TransitionKt.f(boolValueOf, animatedImageVector2.f808a.f1813a, composer2, 0, 0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    composer2.o(244958144);
                    ArrayList arrayList = animatedImageVector2.b;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        AnimatedVectorTarget animatedVectorTarget = (AnimatedVectorTarget) arrayList.get(i);
                        Animator animator = animatedVectorTarget.b;
                        String str = animatedVectorTarget.f809a;
                        int i2 = animatedImageVector2.c;
                        composer2.o(-1031781866);
                        Object objG = composer2.G();
                        if (objG == Composer.Companion.f1624a) {
                            objG = new StateVectorConfig();
                            composer2.A(objG);
                        }
                        StateVectorConfig stateVectorConfig = (StateVectorConfig) objG;
                        animator.a(transitionF, stateVectorConfig, i2, composer2, 0);
                        composer2.l();
                        StateVectorConfig stateVectorConfig2 = (StateVectorConfig) linkedHashMap.get(str);
                        if (stateVectorConfig2 != null) {
                            State state = stateVectorConfig.f818a;
                            if (state != null) {
                                stateVectorConfig2.f818a = state;
                            }
                            State state2 = stateVectorConfig.b;
                            if (state2 != null) {
                                stateVectorConfig2.b = state2;
                            }
                            State state3 = stateVectorConfig.c;
                            if (state3 != null) {
                                stateVectorConfig2.c = state3;
                            }
                            State state4 = stateVectorConfig.d;
                            if (state4 != null) {
                                stateVectorConfig2.d = state4;
                            }
                            State state5 = stateVectorConfig.e;
                            if (state5 != null) {
                                stateVectorConfig2.e = state5;
                            }
                            State state6 = stateVectorConfig.f;
                            if (state6 != null) {
                                stateVectorConfig2.f = state6;
                            }
                            State state7 = stateVectorConfig.g;
                            if (state7 != null) {
                                stateVectorConfig2.g = state7;
                            }
                            State state8 = stateVectorConfig.h;
                            if (state8 != null) {
                                stateVectorConfig2.h = state8;
                            }
                            State state9 = stateVectorConfig.i;
                            if (state9 != null) {
                                stateVectorConfig2.i = state9;
                            }
                            State state10 = stateVectorConfig.j;
                            if (state10 != null) {
                                stateVectorConfig2.j = state10;
                            }
                            State state11 = stateVectorConfig.k;
                            if (state11 != null) {
                                stateVectorConfig2.k = state11;
                            }
                            State state12 = stateVectorConfig.l;
                            if (state12 != null) {
                                stateVectorConfig2.l = state12;
                            }
                            State state13 = stateVectorConfig.m;
                            if (state13 != null) {
                                stateVectorConfig2.m = state13;
                            }
                            State state14 = stateVectorConfig.n;
                            if (state14 != null) {
                                stateVectorConfig2.n = state14;
                            }
                            State state15 = stateVectorConfig.o;
                            if (state15 != null) {
                                stateVectorConfig2.o = state15;
                            }
                            State state16 = stateVectorConfig.p;
                            if (state16 != null) {
                                stateVectorConfig2.p = state16;
                            }
                        } else {
                            linkedHashMap.put(str, stateVectorConfig);
                        }
                    }
                    composer2.l();
                    ComposableSingletons$AnimatedVectorPainterResources_androidKt.f805a.invoke(animatedImageVector2.f808a.f, linkedHashMap, composer2, 0);
                } else {
                    composer2.j();
                }
                return Unit.f24250a;
            }
        }, composer), composer);
    }
}
