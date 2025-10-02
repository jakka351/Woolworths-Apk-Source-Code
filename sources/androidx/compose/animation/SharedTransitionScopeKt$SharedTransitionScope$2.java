package androidx.compose.animation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SharedTransitionScopeKt$SharedTransitionScope$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    public final /* synthetic */ ComposableLambdaImpl h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeKt$SharedTransitionScope$2(ComposableLambdaImpl composableLambdaImpl, int i) {
        super(2);
        this.h = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iA = RecomposeScopeImplKt.a(7);
        int i = SharedTransitionScopeKt.f730a;
        ComposerImpl composerImplV = ((Composer) obj).v(-2093217917);
        boolean z = composerImplV.z(iA & 1, (iA & 3) != 2);
        final ComposableLambdaImpl composableLambdaImpl = this.h;
        if (z) {
            LookaheadScopeKt.a(6, composerImplV, ComposableLambdaKt.c(-863967934, new Function3<LookaheadScope, Composer, Integer, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    LookaheadScope lookaheadScope = (LookaheadScope) obj3;
                    Composer composer = (Composer) obj4;
                    ((Number) obj5).intValue();
                    Object objG = composer.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = android.support.v4.media.session.a.i(composer.y(), composer);
                    }
                    CoroutineScope coroutineScope = (CoroutineScope) objG;
                    Object objG2 = composer.G();
                    if (objG2 == composer$Companion$Empty$1) {
                        objG2 = new SharedTransitionScopeImpl(lookaheadScope, coroutineScope);
                        composer.A(objG2);
                    }
                    final SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) objG2;
                    Object objG3 = composer.G();
                    if (objG3 == composer$Companion$Empty$1) {
                        objG3 = new Function3<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj6, Object obj7, Object obj8) {
                                final MeasureScope measureScope = (MeasureScope) obj6;
                                final Placeable placeableC0 = ((Measurable) obj7).c0(((Constraints) obj8).f2197a);
                                int i2 = placeableC0.d;
                                int i3 = placeableC0.e;
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                                return measureScope.L0(i2, i3, EmptyMap.d, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj9) {
                                        Placeable.PlacementScope placementScope = (Placeable.PlacementScope) obj9;
                                        LayoutCoordinates layoutCoordinatesB = placementScope.b();
                                        if (layoutCoordinatesB != null) {
                                            boolean zL1 = measureScope.l1();
                                            SharedTransitionScopeImpl sharedTransitionScopeImpl3 = sharedTransitionScopeImpl2;
                                            if (zL1) {
                                                sharedTransitionScopeImpl3.k = layoutCoordinatesB;
                                            } else {
                                                sharedTransitionScopeImpl3.j = layoutCoordinatesB;
                                            }
                                        }
                                        placementScope.e(placeableC0, 0, 0, BitmapDescriptorFactory.HUE_RED);
                                        return Unit.f24250a;
                                    }
                                });
                            }
                        };
                        composer.A(objG3);
                    }
                    Modifier modifierA = LayoutModifierKt.a(Modifier.Companion.d, (Function3) objG3);
                    Object objG4 = composer.G();
                    if (objG4 == composer$Companion$Empty$1) {
                        objG4 = new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$2$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                ContentDrawScope contentDrawScope = (ContentDrawScope) obj6;
                                contentDrawScope.Q0();
                                SnapshotStateList snapshotStateList = sharedTransitionScopeImpl.l;
                                if (snapshotStateList.size() > 1) {
                                    CollectionsKt.s0(snapshotStateList, new SharedTransitionScopeImpl$drawInOverlay$$inlined$sortBy$1());
                                }
                                int size = snapshotStateList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    ((LayerRenderer) snapshotStateList.get(i2)).b(contentDrawScope);
                                }
                                return Unit.f24250a;
                            }
                        };
                        composer.A(objG4);
                    }
                    composableLambdaImpl.invoke(sharedTransitionScopeImpl, DrawModifierKt.d(modifierA, (Function1) objG4), composer, 6);
                    Object objG5 = composer.G();
                    if (objG5 == composer$Companion$Empty$1) {
                        objG5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj6) {
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = sharedTransitionScopeImpl;
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1$invoke$$inlined$onDispose$1
                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public final void dispose() {
                                        SharedTransitionScopeImpl sharedTransitionScopeImpl3 = sharedTransitionScopeImpl2;
                                        sharedTransitionScopeImpl3.getClass();
                                        ((SnapshotStateObserver) SharedTransitionScopeImpl.n.getD()).c(sharedTransitionScopeImpl3);
                                        sharedTransitionScopeImpl3.f = true;
                                    }
                                };
                            }
                        };
                        composer.A(objG5);
                    }
                    Unit unit = Unit.f24250a;
                    EffectsKt.c(unit, (Function1) objG5, composer);
                    return unit;
                }
            }, composerImplV));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new SharedTransitionScopeKt$SharedTransitionScope$2(composableLambdaImpl, iA);
        }
        return Unit.f24250a;
    }
}
