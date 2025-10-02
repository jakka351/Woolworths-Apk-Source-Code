package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition;", "", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class InfiniteTransition {

    /* renamed from: a, reason: collision with root package name */
    public final MutableVector f761a = new MutableVector(new TransitionAnimationState[16], 0);
    public final MutableState b = SnapshotStateKt.f(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final MutableState d = SnapshotStateKt.f(Boolean.TRUE);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/InfiniteTransition$TransitionAnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        public Object d;
        public Object e;
        public final TwoWayConverter f;
        public final MutableState g;
        public AnimationSpec h;
        public TargetBasedAnimation i;
        public boolean j;
        public boolean k;
        public long l;

        public TransitionAnimationState(Object obj, Object obj2, TwoWayConverter twoWayConverter, InfiniteRepeatableSpec infiniteRepeatableSpec) {
            this.d = obj;
            this.e = obj2;
            this.f = twoWayConverter;
            this.g = SnapshotStateKt.f(obj);
            this.h = infiniteRepeatableSpec;
            this.i = new TargetBasedAnimation(infiniteRepeatableSpec, twoWayConverter, this.d, this.e, null);
        }

        @Override // androidx.compose.runtime.State
        /* renamed from: getValue */
        public final Object getD() {
            return ((SnapshotMutableStateImpl) this.g).getD();
        }
    }

    public InfiniteTransition(String str) {
    }

    public final void a(Composer composer, final int i) {
        ComposerImpl composerImplV = composer.v(-318043801);
        int i2 = (composerImplV.I(this) ? 4 : 2) | i;
        if (composerImplV.z(i2 & 1, (i2 & 3) != 2)) {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = SnapshotStateKt.f(null);
                composerImplV.A(objG);
            }
            MutableState mutableState = (MutableState) objG;
            if (((Boolean) ((SnapshotMutableStateImpl) this.d).getD()).booleanValue() || ((Boolean) ((SnapshotMutableStateImpl) this.b).getD()).booleanValue()) {
                composerImplV.o(1719883733);
                boolean zI = composerImplV.I(this);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new InfiniteTransition$run$1$1(mutableState, this, null);
                    composerImplV.A(objG2);
                }
                EffectsKt.e(composerImplV, this, (Function2) objG2);
                composerImplV.V(false);
            } else {
                composerImplV.o(1721270456);
                composerImplV.V(false);
            }
        } else {
            composerImplV.j();
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2<Composer, Integer, Unit>(i) { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Number) obj2).intValue();
                    int iA = RecomposeScopeImplKt.a(1);
                    this.h.a((Composer) obj, iA);
                    return Unit.f24250a;
                }
            };
        }
    }
}
