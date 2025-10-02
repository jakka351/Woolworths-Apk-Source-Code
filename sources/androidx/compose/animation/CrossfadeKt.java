package androidx.compose.animation;

import androidx.camera.core.impl.b;
import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionState;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ListIterator;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002¨\u0006\u0003²\u0006\u0012\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "alpha", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CrossfadeKt {
    public static final void a(final Transition transition, final Modifier modifier, final FiniteAnimationSpec finiteAnimationSpec, Function1 function1, final ComposableLambdaImpl composableLambdaImpl, Composer composer, final int i) {
        TransitionState transitionState = transition.f776a;
        ComposerImpl composerImplV = composer.v(679005231);
        int i2 = (i & 6) == 0 ? (composerImplV.n(transition) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= composerImplV.n(modifier) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(finiteAnimationSpec) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if ((i & 24576) == 0) {
            i3 |= composerImplV.I(composableLambdaImpl) ? 16384 : 8192;
        }
        if (composerImplV.z(i3 & 1, (i3 & 9363) != 9362)) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            Object obj = objG;
            if (objG == composer$Companion$Empty$1) {
                SnapshotStateList snapshotStateList = new SnapshotStateList();
                snapshotStateList.add(transitionState.a());
                composerImplV.A(snapshotStateList);
                obj = snapshotStateList;
            }
            SnapshotStateList snapshotStateList2 = (SnapshotStateList) obj;
            Object objG2 = composerImplV.G();
            if (objG2 == composer$Companion$Empty$1) {
                long[] jArr = ScatterMapKt.f699a;
                objG2 = new MutableScatterMap();
                composerImplV.A(objG2);
            }
            MutableScatterMap mutableScatterMap = (MutableScatterMap) objG2;
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) transition.d;
            if (Intrinsics.c(transitionState.a(), snapshotMutableStateImpl.getD())) {
                composerImplV.o(860925177);
                if (snapshotStateList2.size() == 1 && Intrinsics.c(snapshotStateList2.get(0), snapshotMutableStateImpl.getD())) {
                    composerImplV.o(861249809);
                    composerImplV.V(false);
                } else {
                    composerImplV.o(861059531);
                    boolean z = (i3 & 14) == 4;
                    Object objG3 = composerImplV.G();
                    if (z || objG3 == composer$Companion$Empty$1) {
                        objG3 = new Function1<Object, Boolean>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$4$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(!Intrinsics.c(obj2, ((SnapshotMutableStateImpl) transition.d).getD()));
                            }
                        };
                        composerImplV.A(objG3);
                    }
                    CollectionsKt.g0(snapshotStateList2, (Function1) objG3);
                    mutableScatterMap.g();
                    composerImplV.V(false);
                }
                composerImplV.V(false);
            } else {
                composerImplV.o(861255761);
                composerImplV.V(false);
            }
            if (mutableScatterMap.b(snapshotMutableStateImpl.getD())) {
                composerImplV.o(862059281);
                composerImplV.V(false);
            } else {
                composerImplV.o(861316428);
                ListIterator listIterator = snapshotStateList2.listIterator();
                int i4 = 0;
                while (true) {
                    if (!listIterator.hasNext()) {
                        i4 = -1;
                        break;
                    } else if (Intrinsics.c(listIterator.next(), snapshotMutableStateImpl.getD())) {
                        break;
                    } else {
                        i4++;
                    }
                }
                if (i4 == -1) {
                    snapshotStateList2.add(snapshotMutableStateImpl.getD());
                } else {
                    snapshotStateList2.set(i4, snapshotMutableStateImpl.getD());
                }
                mutableScatterMap.g();
                int size = snapshotStateList2.size();
                for (int i5 = 0; i5 < size; i5++) {
                    final Object obj2 = snapshotStateList2.get(i5);
                    mutableScatterMap.m(obj2, ComposableLambdaKt.c(-1426421288, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            if (composer2.z(iIntValue & 1, (iIntValue & 3) != 2)) {
                                final FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
                                Function3<Transition.Segment<Object>, Composer, Integer, FiniteAnimationSpec<Float>> function3 = new Function3<Transition.Segment<Object>, Composer, Integer, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$alpha$2
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        Composer composer3 = (Composer) obj6;
                                        ((Number) obj7).intValue();
                                        composer3.o(438406499);
                                        composer3.l();
                                        return finiteAnimationSpec2;
                                    }
                                };
                                TwoWayConverter twoWayConverter = VectorConvertersKt.f788a;
                                Transition transition2 = transition;
                                Object objA = transition2.f776a.a();
                                composer2.o(-438678252);
                                Object obj5 = obj2;
                                boolean zC = Intrinsics.c(objA, obj5);
                                float f = BitmapDescriptorFactory.HUE_RED;
                                float f2 = zC ? 1.0f : 0.0f;
                                composer2.l();
                                Float fValueOf = Float.valueOf(f2);
                                Object d = ((SnapshotMutableStateImpl) transition2.d).getD();
                                composer2.o(-438678252);
                                if (Intrinsics.c(d, obj5)) {
                                    f = 1.0f;
                                }
                                composer2.l();
                                final Transition.TransitionAnimationState transitionAnimationStateD = androidx.compose.animation.core.TransitionKt.d(transition2, fValueOf, Float.valueOf(f), (FiniteAnimationSpec) function3.invoke(transition2.f(), composer2, 0), twoWayConverter, composer2, 0);
                                boolean zN = composer2.n(transitionAnimationStateD);
                                Object objG4 = composer2.G();
                                if (zN || objG4 == Composer.Companion.f1624a) {
                                    objG4 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$5$1$1$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj6) {
                                            ((GraphicsLayerScope) obj6).b(((Number) transitionAnimationStateD.getD()).floatValue());
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                Modifier modifierA = GraphicsLayerModifierKt.a(Modifier.Companion.d, (Function1) objG4);
                                MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                                int p = composer2.getP();
                                PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                                Modifier modifierD = ComposedModifierKt.d(composer2, modifierA);
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
                                composableLambdaImpl.invoke(obj5, composer2, 0);
                                composer2.f();
                            } else {
                                composer2.j();
                            }
                            return Unit.f24250a;
                        }
                    }, composerImplV));
                }
                composerImplV.V(false);
            }
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
                b.B(i6, composerImplV, i6, function2);
            }
            Updater.b(composerImplV, modifierD, ComposeUiNode.Companion.d);
            composerImplV.o(-187474512);
            int size2 = snapshotStateList2.size();
            for (int i7 = 0; i7 < size2; i7++) {
                Object obj3 = snapshotStateList2.get(i7);
                composerImplV.J(-1081865889, obj3);
                Function2 function22 = (Function2) mutableScatterMap.e(obj3);
                if (function22 == null) {
                    composerImplV.o(821932266);
                } else {
                    composerImplV.o(-1081864713);
                    function22.invoke(composerImplV, 0);
                }
                composerImplV.V(false);
                composerImplV.V(false);
            }
            composerImplV.V(false);
            composerImplV.V(true);
            function1 = CrossfadeKt$Crossfade$3.h;
        } else {
            composerImplV.j();
        }
        final Function1 function12 = function1;
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt$Crossfade$7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj4, Object obj5) {
                    ((Number) obj5).intValue();
                    CrossfadeKt.a(transition, modifier, finiteAnimationSpec, function12, composableLambdaImpl, (Composer) obj4, RecomposeScopeImplKt.a(i | 1));
                    return Unit.f24250a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(final java.lang.Object r14, androidx.compose.ui.Modifier r15, androidx.compose.animation.core.FiniteAnimationSpec r16, java.lang.String r17, final androidx.compose.runtime.internal.ComposableLambdaImpl r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.b(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.String, androidx.compose.runtime.internal.ComposableLambdaImpl, androidx.compose.runtime.Composer, int, int):void");
    }
}
