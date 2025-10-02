package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    public static final void a(final Function0 function0, final Modifier modifier, final LazyLayoutPrefetchState lazyLayoutPrefetchState, final Function2 function2, Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(2002163445);
        int i2 = (composerImplV.I(function0) ? 4 : 2) | i | (composerImplV.n(modifier) ? 32 : 16) | (composerImplV.n(lazyLayoutPrefetchState) ? 256 : 128) | (composerImplV.I(function2) ? 2048 : 1024);
        if (composerImplV.z(i2 & 1, (i2 & 1171) != 1170)) {
            final MutableState mutableStateL = SnapshotStateKt.l(function0, composerImplV);
            LazySaveableStateHolderKt.a(6, composerImplV, ComposableLambdaKt.c(-1488997347, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Modifier modifierX0;
                    SaveableStateHolder saveableStateHolder = (SaveableStateHolder) obj;
                    Composer composer2 = (Composer) obj2;
                    ((Number) obj3).intValue();
                    Object objG = composer2.G();
                    Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                    if (objG == composer$Companion$Empty$1) {
                        objG = new LazyLayoutItemContentFactory(saveableStateHolder, new LazyLayoutKt$LazyLayout$1$itemContentFactory$1$1(mutableStateL));
                        composer2.A(objG);
                    }
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objG;
                    Object objG2 = composer2.G();
                    if (objG2 == composer$Companion$Empty$1) {
                        objG2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.A(objG2);
                    }
                    final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objG2;
                    final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                    if (lazyLayoutPrefetchState2 != null) {
                        composer2.o(204281539);
                        final PrefetchScheduler prefetchScheduler = lazyLayoutPrefetchState2.f1050a;
                        if (prefetchScheduler == null) {
                            composer2.o(6591363);
                            prefetchScheduler = PrefetchScheduler_androidKt.f1064a;
                            if (prefetchScheduler != null) {
                                composer2.o(1213893039);
                                composer2.l();
                            } else {
                                composer2.o(1213931944);
                                View view = (View) composer2.x(AndroidCompositionLocals_androidKt.f);
                                boolean zN = composer2.n(view);
                                Object objG3 = composer2.G();
                                if (zN || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new AndroidPrefetchScheduler(view);
                                    composer2.A(objG3);
                                }
                                composer2.l();
                                prefetchScheduler = (AndroidPrefetchScheduler) objG3;
                            }
                        } else {
                            composer2.o(6590278);
                        }
                        composer2.l();
                        Object[] objArr = {lazyLayoutPrefetchState2, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler};
                        boolean zN2 = composer2.n(lazyLayoutPrefetchState2) | composer2.I(lazyLayoutItemContentFactory) | composer2.I(subcomposeLayoutState) | composer2.I(prefetchScheduler);
                        Object objG4 = composer2.G();
                        if (zN2 || objG4 == composer$Companion$Empty$1) {
                            objG4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    PrefetchHandleProvider prefetchHandleProvider = new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler);
                                    final LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                                    lazyLayoutPrefetchState3.d = prefetchHandleProvider;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public final void dispose() {
                                            lazyLayoutPrefetchState3.d = null;
                                        }
                                    };
                                }
                            };
                            composer2.A(objG4);
                        }
                        EffectsKt.d(objArr, (Function1) objG4, composer2);
                        composer2.l();
                    } else {
                        composer2.o(204710145);
                        composer2.l();
                    }
                    int i3 = LazyLayoutPrefetchStateKt.b;
                    Modifier modifier2 = modifier;
                    if (lazyLayoutPrefetchState2 != null && (modifierX0 = modifier2.x0(new TraversablePrefetchStateModifierElement(lazyLayoutPrefetchState2))) != null) {
                        modifier2 = modifierX0;
                    }
                    boolean zN3 = composer2.n(lazyLayoutItemContentFactory);
                    final Function2 function22 = function2;
                    boolean zN4 = zN3 | composer2.n(function22);
                    Object objG5 = composer2.G();
                    if (zN4 || objG5 == composer$Companion$Empty$1) {
                        objG5 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                long j = ((Constraints) obj5).f2197a;
                                return (MeasureResult) function22.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, (SubcomposeMeasureScope) obj4), new Constraints(j));
                            }
                        };
                        composer2.A(objG5);
                    }
                    SubcomposeLayoutKt.b(subcomposeLayoutState, modifier2, (Function2) objG5, composer2, 8);
                    return Unit.f24250a;
                }
            }, composerImplV));
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(modifier, lazyLayoutPrefetchState, function2, i) { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$2
                public final /* synthetic */ Modifier i;
                public final /* synthetic */ LazyLayoutPrefetchState j;
                public final /* synthetic */ Function2 k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    LazyLayoutKt.a(this.h, this.i, this.j, this.k, (Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
