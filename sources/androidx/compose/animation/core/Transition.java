package androidx.compose.animation.core;

import androidx.annotation.RestrictTo;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableLongStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "DeferredAnimation", "Segment", "SegmentImpl", "TransitionAnimationState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class Transition<S> {

    /* renamed from: a, reason: collision with root package name */
    public final TransitionState f776a;
    public final Transition b;
    public final String c;
    public final MutableState d;
    public final MutableState e;
    public final MutableLongState f = SnapshotLongStateKt.a(0);
    public final MutableLongState g = SnapshotLongStateKt.a(Long.MIN_VALUE);
    public final MutableState h;
    public final SnapshotStateList i;
    public final SnapshotStateList j;
    public final MutableState k;
    public final State l;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "", "DeferredAnimationData", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @RestrictTo
    @SourceDebugExtension
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* renamed from: a, reason: collision with root package name */
        public final TwoWayConverter f777a;
        public final MutableState b = SnapshotStateKt.f(null);

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {
            public final TransitionAnimationState d;
            public Function1 e;
            public Lambda f;

            /* JADX WARN: Multi-variable type inference failed */
            public DeferredAnimationData(TransitionAnimationState transitionAnimationState, Function1 function1, Function1 function12) {
                this.d = transitionAnimationState;
                this.e = function1;
                this.f = (Lambda) function12;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            /* JADX WARN: Type inference failed for: r1v5, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
            public final void b(Segment segment) {
                Object objInvoke = this.f.invoke(segment.getB());
                boolean zI = Transition.this.i();
                TransitionAnimationState transitionAnimationState = this.d;
                if (zI) {
                    transitionAnimationState.B(this.f.invoke(segment.getF778a()), objInvoke, (FiniteAnimationSpec) this.e.invoke(segment));
                } else {
                    transitionAnimationState.C(objInvoke, (FiniteAnimationSpec) this.e.invoke(segment));
                }
            }

            @Override // androidx.compose.runtime.State
            /* renamed from: getValue */
            public final Object getD() {
                b(Transition.this.f());
                return ((SnapshotMutableStateImpl) this.d.m).getD();
            }
        }

        public DeferredAnimation(TwoWayConverter twoWayConverter, String str) {
            this.f777a = twoWayConverter;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final DeferredAnimationData a(Function1 function1, Function1 function12) {
            MutableState mutableState = this.b;
            DeferredAnimationData deferredAnimationData = (DeferredAnimationData) ((SnapshotMutableStateImpl) mutableState).getD();
            Transition transition = Transition.this;
            if (deferredAnimationData == null) {
                Object objInvoke = function12.invoke(transition.f776a.a());
                Object objInvoke2 = function12.invoke(transition.f776a.a());
                TwoWayConverter twoWayConverter = this.f777a;
                AnimationVector animationVector = (AnimationVector) twoWayConverter.a().invoke(objInvoke2);
                animationVector.d();
                TransitionAnimationState transitionAnimationState = new TransitionAnimationState(objInvoke, animationVector, twoWayConverter);
                deferredAnimationData = new DeferredAnimationData(transitionAnimationState, function1, function12);
                ((SnapshotMutableStateImpl) mutableState).setValue(deferredAnimationData);
                transition.i.add(transitionAnimationState);
            }
            deferredAnimationData.f = (Lambda) function12;
            deferredAnimationData.e = function1;
            deferredAnimationData.b(transition.f());
            return deferredAnimationData;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface Segment<S> {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        default boolean c(Object obj, Object obj2) {
            return obj.equals(getF778a()) && obj2.equals(getB());
        }

        /* renamed from: f */
        Object getB();

        /* renamed from: h */
        Object getF778a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/animation/core/Transition$SegmentImpl;", "S", "Landroidx/compose/animation/core/Transition$Segment;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SegmentImpl<S> implements Segment<S> {

        /* renamed from: a, reason: collision with root package name */
        public final Object f778a;
        public final Object b;

        public SegmentImpl(Object obj, Object obj2) {
            this.f778a = obj;
            this.b = obj2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Segment)) {
                return false;
            }
            Segment segment = (Segment) obj;
            return Intrinsics.c(this.f778a, segment.getF778a()) && Intrinsics.c(this.b, segment.getB());
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        /* renamed from: f, reason: from getter */
        public final Object getB() {
            return this.b;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        /* renamed from: h, reason: from getter */
        public final Object getF778a() {
            return this.f778a;
        }

        public final int hashCode() {
            Object obj = this.f778a;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            Object obj2 = this.b;
            return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/runtime/State;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @Stable
    @SourceDebugExtension
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {
        public final TwoWayConverter d;
        public final MutableState e;
        public final MutableState f;
        public final MutableState g;
        public SeekableTransitionState.SeekingAnimationState h;
        public TargetBasedAnimation i;
        public final MutableState j;
        public final MutableFloatState k;
        public boolean l;
        public final MutableState m;
        public AnimationVector n;
        public final MutableLongState o;
        public boolean p;
        public final SpringSpec q;

        /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object, java.util.Map] */
        public TransitionAnimationState(Object obj, AnimationVector animationVector, TwoWayConverter twoWayConverter) {
            this.d = twoWayConverter;
            MutableState mutableStateF = SnapshotStateKt.f(obj);
            this.e = mutableStateF;
            Object objInvoke = null;
            MutableState mutableStateF2 = SnapshotStateKt.f(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7));
            this.f = mutableStateF2;
            this.g = SnapshotStateKt.f(new TargetBasedAnimation((FiniteAnimationSpec) ((SnapshotMutableStateImpl) mutableStateF2).getD(), twoWayConverter, obj, ((SnapshotMutableStateImpl) mutableStateF).getD(), animationVector));
            this.j = SnapshotStateKt.f(Boolean.TRUE);
            this.k = PrimitiveSnapshotStateKt.a(-1.0f);
            this.m = SnapshotStateKt.f(obj);
            this.n = animationVector;
            this.o = SnapshotLongStateKt.a(b().c());
            Float f = (Float) VisibilityThresholdsKt.b.get(twoWayConverter);
            if (f != null) {
                float fFloatValue = f.floatValue();
                AnimationVector animationVector2 = (AnimationVector) twoWayConverter.a().invoke(obj);
                int iB = animationVector2.b();
                for (int i = 0; i < iB; i++) {
                    animationVector2.e(fFloatValue, i);
                }
                objInvoke = this.d.b().invoke(animationVector2);
            }
            this.q = AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, objInvoke, 3);
        }

        public final void B(Object obj, Object obj2, FiniteAnimationSpec finiteAnimationSpec) {
            ((SnapshotMutableStateImpl) this.e).setValue(obj2);
            ((SnapshotMutableStateImpl) this.f).setValue(finiteAnimationSpec);
            if (Intrinsics.c(b().d, obj) && Intrinsics.c(b().c, obj2)) {
                return;
            }
            v(obj, false);
        }

        public final void C(Object obj, FiniteAnimationSpec finiteAnimationSpec) {
            if (this.l) {
                TargetBasedAnimation targetBasedAnimation = this.i;
                if (Intrinsics.c(obj, targetBasedAnimation != null ? targetBasedAnimation.c : null)) {
                    return;
                }
            }
            MutableState mutableState = this.e;
            boolean zC = Intrinsics.c(((SnapshotMutableStateImpl) mutableState).getD(), obj);
            MutableFloatState mutableFloatState = this.k;
            if (zC && ((SnapshotMutableFloatStateImpl) mutableFloatState).a() == -1.0f) {
                return;
            }
            ((SnapshotMutableStateImpl) mutableState).setValue(obj);
            ((SnapshotMutableStateImpl) this.f).setValue(finiteAnimationSpec);
            SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
            Object d = snapshotMutableFloatStateImpl.a() == -3.0f ? obj : ((SnapshotMutableStateImpl) this.m).getD();
            MutableState mutableState2 = this.j;
            v(d, !((Boolean) ((SnapshotMutableStateImpl) mutableState2).getD()).booleanValue());
            ((SnapshotMutableStateImpl) mutableState2).setValue(Boolean.valueOf(snapshotMutableFloatStateImpl.a() == -3.0f));
            if (snapshotMutableFloatStateImpl.a() >= BitmapDescriptorFactory.HUE_RED) {
                t(b().e((long) (snapshotMutableFloatStateImpl.a() * b().c())));
            } else if (snapshotMutableFloatStateImpl.a() == -3.0f) {
                t(obj);
            }
            this.l = false;
            ((SnapshotMutableFloatStateImpl) mutableFloatState).p(-1.0f);
        }

        public final TargetBasedAnimation b() {
            return (TargetBasedAnimation) ((SnapshotMutableStateImpl) this.g).getD();
        }

        @Override // androidx.compose.runtime.State
        /* renamed from: getValue */
        public final Object getD() {
            return ((SnapshotMutableStateImpl) this.m).getD();
        }

        public final void o(long j) {
            if (((SnapshotMutableFloatStateImpl) this.k).a() == -1.0f) {
                this.p = true;
                if (Intrinsics.c(b().c, b().d)) {
                    t(b().c);
                } else {
                    t(b().e(j));
                    this.n = b().g(j);
                }
            }
        }

        public final void t(Object obj) {
            ((SnapshotMutableStateImpl) this.m).setValue(obj);
        }

        public final String toString() {
            return "current value: " + ((SnapshotMutableStateImpl) this.m).getD() + ", target: " + ((SnapshotMutableStateImpl) this.e).getD() + ", spec: " + ((FiniteAnimationSpec) ((SnapshotMutableStateImpl) this.f).getD());
        }

        public final void v(Object obj, boolean z) {
            TargetBasedAnimation targetBasedAnimation = this.i;
            Object obj2 = targetBasedAnimation != null ? targetBasedAnimation.c : null;
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) this.e;
            boolean zC = Intrinsics.c(obj2, snapshotMutableStateImpl.getD());
            MutableLongState mutableLongState = this.o;
            MutableState mutableState = this.g;
            FiniteAnimationSpec finiteAnimationSpec = this.q;
            if (zC) {
                ((SnapshotMutableStateImpl) mutableState).setValue(new TargetBasedAnimation(finiteAnimationSpec, this.d, obj, obj, this.n.c()));
                this.l = true;
                ((SnapshotMutableLongStateImpl) mutableLongState).z(b().c());
                return;
            }
            MutableState mutableState2 = this.f;
            if (!z || this.p || (((FiniteAnimationSpec) ((SnapshotMutableStateImpl) mutableState2).getD()) instanceof SpringSpec)) {
                finiteAnimationSpec = (FiniteAnimationSpec) ((SnapshotMutableStateImpl) mutableState2).getD();
            }
            Transition transition = Transition.this;
            long jE = transition.e();
            MutableState mutableState3 = transition.h;
            ((SnapshotMutableStateImpl) mutableState).setValue(new TargetBasedAnimation(jE <= 0 ? finiteAnimationSpec : new StartDelayAnimationSpec(finiteAnimationSpec, transition.e()), this.d, obj, snapshotMutableStateImpl.getD(), this.n));
            ((SnapshotMutableLongStateImpl) mutableLongState).z(b().c());
            this.l = false;
            ((SnapshotMutableStateImpl) mutableState3).setValue(Boolean.TRUE);
            if (transition.i()) {
                SnapshotStateList snapshotStateList = transition.i;
                int size = snapshotStateList.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i);
                    jMax = Math.max(jMax, ((SnapshotMutableLongStateImpl) transitionAnimationState.o).e());
                    transitionAnimationState.o(0L);
                }
                ((SnapshotMutableStateImpl) mutableState3).setValue(Boolean.FALSE);
            }
        }
    }

    public Transition(TransitionState transitionState, Transition transition, String str) {
        this.f776a = transitionState;
        this.b = transition;
        this.c = str;
        this.d = SnapshotStateKt.f(transitionState.a());
        this.e = SnapshotStateKt.f(new SegmentImpl(transitionState.a(), transitionState.a()));
        Boolean bool = Boolean.FALSE;
        this.h = SnapshotStateKt.f(bool);
        this.i = new SnapshotStateList();
        this.j = new SnapshotStateList();
        this.k = SnapshotStateKt.f(bool);
        this.l = SnapshotStateKt.d(new Function0<Long>() { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Long.valueOf(this.h.b());
            }
        });
        transitionState.d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(final int r11, androidx.compose.runtime.Composer r12, final java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Transition.a(int, androidx.compose.runtime.Composer, java.lang.Object):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long b() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        long jMax = 0;
        for (int i = 0; i < size; i++) {
            jMax = Math.max(jMax, ((SnapshotMutableLongStateImpl) ((TransitionAnimationState) snapshotStateList.get(i)).o).e());
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            jMax = Math.max(jMax, ((Transition) snapshotStateList2.get(i2)).b());
        }
        return jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i);
            transitionAnimationState.i = null;
            transitionAnimationState.h = null;
            transitionAnimationState.l = false;
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            if (((TransitionAnimationState) snapshotStateList.get(i)).h != null) {
                return true;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((Transition) snapshotStateList2.get(i2)).d()) {
                return true;
            }
        }
        return false;
    }

    public final long e() {
        Transition transition = this.b;
        return transition != null ? transition.e() : this.f.e();
    }

    public final Segment f() {
        return (Segment) ((SnapshotMutableStateImpl) this.e).getD();
    }

    public final Object g() {
        return ((SnapshotMutableStateImpl) this.d).getD();
    }

    public final long h() {
        return ((Number) this.l.getD()).longValue();
    }

    public final boolean i() {
        return ((Boolean) ((SnapshotMutableStateImpl) this.k).getD()).booleanValue();
    }

    public final void j(long j, boolean z) {
        MutableLongState mutableLongState = this.g;
        long jE = ((SnapshotMutableLongStateImpl) mutableLongState).e();
        TransitionState transitionState = this.f776a;
        if (jE == Long.MIN_VALUE) {
            ((SnapshotMutableLongStateImpl) mutableLongState).z(j);
            ((SnapshotMutableStateImpl) transitionState.f785a).setValue(Boolean.TRUE);
        } else if (!((Boolean) ((SnapshotMutableStateImpl) transitionState.f785a).getD()).booleanValue()) {
            ((SnapshotMutableStateImpl) transitionState.f785a).setValue(Boolean.TRUE);
        }
        ((SnapshotMutableStateImpl) this.h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        boolean z2 = true;
        for (int i = 0; i < size; i++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i);
            MutableState mutableState = transitionAnimationState.j;
            MutableState mutableState2 = transitionAnimationState.j;
            if (!((Boolean) ((SnapshotMutableStateImpl) mutableState).getD()).booleanValue()) {
                long jC = z ? transitionAnimationState.b().c() : j;
                transitionAnimationState.t(transitionAnimationState.b().e(jC));
                transitionAnimationState.n = transitionAnimationState.b().g(jC);
                if (transitionAnimationState.b().b(jC)) {
                    ((SnapshotMutableStateImpl) mutableState2).setValue(Boolean.TRUE);
                }
            }
            if (!((Boolean) ((SnapshotMutableStateImpl) mutableState2).getD()).booleanValue()) {
                z2 = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition transition = (Transition) snapshotStateList2.get(i2);
            MutableState mutableState3 = transition.d;
            TransitionState transitionState2 = transition.f776a;
            if (!Intrinsics.c(((SnapshotMutableStateImpl) mutableState3).getD(), transitionState2.a())) {
                transition.j(j, z);
            }
            if (!Intrinsics.c(((SnapshotMutableStateImpl) transition.d).getD(), transitionState2.a())) {
                z2 = false;
            }
        }
        if (z2) {
            k();
        }
    }

    public final void k() {
        ((SnapshotMutableLongStateImpl) this.g).z(Long.MIN_VALUE);
        TransitionState transitionState = this.f776a;
        if (transitionState instanceof MutableTransitionState) {
            transitionState.c(((SnapshotMutableStateImpl) this.d).getD());
        }
        p(0L);
        ((SnapshotMutableStateImpl) transitionState.f785a).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) snapshotStateList.get(i)).k();
        }
    }

    public final void l(float f) {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i);
            transitionAnimationState.getClass();
            if (f == -4.0f || f == -5.0f) {
                TargetBasedAnimation targetBasedAnimation = transitionAnimationState.i;
                if (targetBasedAnimation != null) {
                    transitionAnimationState.b().h(targetBasedAnimation.c);
                    transitionAnimationState.h = null;
                    transitionAnimationState.i = null;
                }
                Object obj = f == -4.0f ? transitionAnimationState.b().d : transitionAnimationState.b().c;
                transitionAnimationState.b().h(obj);
                transitionAnimationState.b().i(obj);
                transitionAnimationState.t(obj);
                ((SnapshotMutableLongStateImpl) transitionAnimationState.o).z(transitionAnimationState.b().c());
            } else {
                ((SnapshotMutableFloatStateImpl) transitionAnimationState.k).p(f);
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).l(f);
        }
    }

    public final void m(Object obj, Object obj2) {
        ((SnapshotMutableLongStateImpl) this.g).z(Long.MIN_VALUE);
        TransitionState transitionState = this.f776a;
        ((SnapshotMutableStateImpl) transitionState.f785a).setValue(Boolean.FALSE);
        boolean zI = i();
        MutableState mutableState = this.d;
        if (!zI || !Intrinsics.c(transitionState.a(), obj) || !Intrinsics.c(((SnapshotMutableStateImpl) mutableState).getD(), obj2)) {
            if (!Intrinsics.c(transitionState.a(), obj) && (transitionState instanceof MutableTransitionState)) {
                transitionState.c(obj);
            }
            ((SnapshotMutableStateImpl) mutableState).setValue(obj2);
            ((SnapshotMutableStateImpl) this.k).setValue(Boolean.TRUE);
            ((SnapshotMutableStateImpl) this.e).setValue(new SegmentImpl(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.j;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) snapshotStateList.get(i);
            Intrinsics.f(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.i()) {
                transition.m(transition.f776a.a(), ((SnapshotMutableStateImpl) transition.d).getD());
            }
        }
        SnapshotStateList snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((TransitionAnimationState) snapshotStateList2.get(i2)).o(0L);
        }
    }

    public final void n(long j) {
        MutableLongState mutableLongState = this.g;
        if (((SnapshotMutableLongStateImpl) mutableLongState).e() == Long.MIN_VALUE) {
            ((SnapshotMutableLongStateImpl) mutableLongState).z(j);
        }
        p(j);
        ((SnapshotMutableStateImpl) this.h).setValue(Boolean.FALSE);
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((TransitionAnimationState) snapshotStateList.get(i)).o(j);
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition transition = (Transition) snapshotStateList2.get(i2);
            if (!Intrinsics.c(((SnapshotMutableStateImpl) transition.d).getD(), transition.f776a.a())) {
                transition.n(j);
            }
        }
    }

    public final void o(SeekableTransitionState.SeekingAnimationState seekingAnimationState) {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i);
            MutableState mutableState = transitionAnimationState.m;
            if (!Intrinsics.c(transitionAnimationState.b().c, transitionAnimationState.b().d)) {
                transitionAnimationState.i = transitionAnimationState.b();
                transitionAnimationState.h = seekingAnimationState;
            }
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
            ((SnapshotMutableStateImpl) transitionAnimationState.g).setValue(new TargetBasedAnimation(transitionAnimationState.q, transitionAnimationState.d, snapshotMutableStateImpl.getD(), snapshotMutableStateImpl.getD(), transitionAnimationState.n.c()));
            ((SnapshotMutableLongStateImpl) transitionAnimationState.o).z(transitionAnimationState.b().c());
            transitionAnimationState.l = true;
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).o(seekingAnimationState);
        }
    }

    public final void p(long j) {
        if (this.b == null) {
            ((SnapshotMutableLongStateImpl) this.f).z(j);
        }
    }

    public final void q() {
        TargetBasedAnimation targetBasedAnimation;
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            TransitionAnimationState transitionAnimationState = (TransitionAnimationState) snapshotStateList.get(i);
            SeekableTransitionState.SeekingAnimationState seekingAnimationState = transitionAnimationState.h;
            if (seekingAnimationState != null && (targetBasedAnimation = transitionAnimationState.i) != null) {
                long jC = MathKt.c(seekingAnimationState.g * seekingAnimationState.d);
                Object objE = targetBasedAnimation.e(jC);
                if (transitionAnimationState.l) {
                    transitionAnimationState.b().i(objE);
                }
                transitionAnimationState.b().h(objE);
                ((SnapshotMutableLongStateImpl) transitionAnimationState.o).z(transitionAnimationState.b().c());
                if (((SnapshotMutableFloatStateImpl) transitionAnimationState.k).a() == -2.0f || transitionAnimationState.l) {
                    transitionAnimationState.t(objE);
                } else {
                    transitionAnimationState.o(Transition.this.e());
                }
                if (jC >= seekingAnimationState.g) {
                    transitionAnimationState.h = null;
                    transitionAnimationState.i = null;
                } else {
                    seekingAnimationState.c = false;
                }
            }
        }
        SnapshotStateList snapshotStateList2 = this.j;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((Transition) snapshotStateList2.get(i2)).q();
        }
    }

    public final void r(Object obj) {
        MutableState mutableState = this.d;
        SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) mutableState;
        if (Intrinsics.c(snapshotMutableStateImpl.getD(), obj)) {
            return;
        }
        ((SnapshotMutableStateImpl) this.e).setValue(new SegmentImpl(snapshotMutableStateImpl.getD(), obj));
        TransitionState transitionState = this.f776a;
        if (!Intrinsics.c(transitionState.a(), snapshotMutableStateImpl.getD())) {
            transitionState.c(snapshotMutableStateImpl.getD());
        }
        ((SnapshotMutableStateImpl) mutableState).setValue(obj);
        if (((SnapshotMutableLongStateImpl) this.g).e() == Long.MIN_VALUE) {
            ((SnapshotMutableStateImpl) this.h).setValue(Boolean.TRUE);
        }
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            ((SnapshotMutableFloatStateImpl) ((TransitionAnimationState) snapshotStateList.get(i)).k).p(-2.0f);
        }
    }

    public final String toString() {
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((TransitionAnimationState) snapshotStateList.get(i)) + ", ";
        }
        return str;
    }
}
