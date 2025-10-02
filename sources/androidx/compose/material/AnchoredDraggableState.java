package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Companion", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@ExperimentalMaterialApi
@SourceDebugExtension
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Function1 f1233a;
    public final Function0 b;
    public final AnimationSpec c;
    public final Function1 d;
    public final MutableState g;
    public final InternalMutatorMutex e = new InternalMutatorMutex();
    public final AnchoredDraggableState$draggableState$1 f = new AnchoredDraggableState$draggableState$1(this);
    public final State h = SnapshotStateKt.d(new Function0<Object>() { // from class: androidx.compose.material.AnchoredDraggableState$targetValue$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AnchoredDraggableState anchoredDraggableState = this.h;
            Object d = ((SnapshotMutableStateImpl) anchoredDraggableState.m).getD();
            if (d != null) {
                return d;
            }
            MutableFloatState mutableFloatState = anchoredDraggableState.j;
            MutableState mutableState = anchoredDraggableState.g;
            float fA = ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
            return !Float.isNaN(fA) ? anchoredDraggableState.c(fA, BitmapDescriptorFactory.HUE_RED, ((SnapshotMutableStateImpl) mutableState).getD()) : ((SnapshotMutableStateImpl) mutableState).getD();
        }
    });
    public final State i = SnapshotStateKt.d(new Function0<Object>() { // from class: androidx.compose.material.AnchoredDraggableState$closestValue$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AnchoredDraggableState anchoredDraggableState = this.h;
            Object d = ((SnapshotMutableStateImpl) anchoredDraggableState.m).getD();
            if (d != null) {
                return d;
            }
            MutableFloatState mutableFloatState = anchoredDraggableState.j;
            MutableState mutableState = anchoredDraggableState.g;
            float fA = ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
            if (Float.isNaN(fA)) {
                return ((SnapshotMutableStateImpl) mutableState).getD();
            }
            Object d2 = ((SnapshotMutableStateImpl) mutableState).getD();
            DraggableAnchors draggableAnchorsE = anchoredDraggableState.e();
            float fC = draggableAnchorsE.c(d2);
            if (fC != fA && !Float.isNaN(fC)) {
                if (fC < fA) {
                    Object objA = draggableAnchorsE.a(fA, true);
                    if (objA != null) {
                        return objA;
                    }
                } else {
                    Object objA2 = draggableAnchorsE.a(fA, false);
                    if (objA2 != null) {
                        return objA2;
                    }
                }
            }
            return d2;
        }
    });
    public final MutableFloatState j = PrimitiveSnapshotStateKt.a(Float.NaN);
    public final State k = SnapshotStateKt.c(SnapshotStateKt.n(), new Function0<Float>() { // from class: androidx.compose.material.AnchoredDraggableState$progress$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            AnchoredDraggableState anchoredDraggableState = this.h;
            float fC = anchoredDraggableState.e().c(((SnapshotMutableStateImpl) anchoredDraggableState.g).getD());
            float fC2 = anchoredDraggableState.e().c(anchoredDraggableState.i.getD()) - fC;
            float fAbs = Math.abs(fC2);
            float f = 1.0f;
            if (!Float.isNaN(fAbs) && fAbs > 1.0E-6f) {
                float fG = (anchoredDraggableState.g() - fC) / fC2;
                if (fG < 1.0E-6f) {
                    f = BitmapDescriptorFactory.HUE_RED;
                } else if (fG <= 0.999999f) {
                    f = fG;
                }
            }
            return Float.valueOf(f);
        }
    });
    public final MutableFloatState l = PrimitiveSnapshotStateKt.a(BitmapDescriptorFactory.HUE_RED);
    public final MutableState m = SnapshotStateKt.f(null);
    public final MutableState n = SnapshotStateKt.f(new MapDraggableAnchors(EmptyMap.d));
    public final AnchoredDraggableState$anchoredDragScope$1 o = new AnchoredDragScope() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
        @Override // androidx.compose.material.AnchoredDragScope
        public final void a(float f, float f2) {
            AnchoredDraggableState anchoredDraggableState = this.f1234a;
            ((SnapshotMutableFloatStateImpl) anchoredDraggableState.j).p(f);
            ((SnapshotMutableFloatStateImpl) anchoredDraggableState.l).p(f2);
        }
    };

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.AnchoredDraggableState$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends Lambda implements Function1<Object, Boolean> {
        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.material.AnchoredDraggableState$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass2 extends Lambda implements Function1<Object, Boolean> {
        public static final AnonymousClass2 h = new AnonymousClass2(1);

        @Override // kotlin.jvm.functions.Function1
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/AnchoredDraggableState$Companion;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1] */
    public AnchoredDraggableState(Object obj, Function1 function1, Function0 function0, AnimationSpec animationSpec, Function1 function12) {
        this.f1233a = function1;
        this.b = function0;
        this.c = animationSpec;
        this.d = function12;
        this.g = SnapshotStateKt.f(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(androidx.compose.foundation.MutatePriority r7, kotlin.jvm.functions.Function3 r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            androidx.compose.material.AnchoredDraggableState r7 = r0.p
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L2b
            goto L54
        L2b:
            r8 = move-exception
            goto L97
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            kotlin.ResultKt.b(r9)
            androidx.compose.material.InternalMutatorMutex r9 = r6.e     // Catch: java.lang.Throwable -> L95
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L95
            r5 = 0
            r2.<init>(r6, r5, r8)     // Catch: java.lang.Throwable -> L95
            r0.p = r6     // Catch: java.lang.Throwable -> L95
            r0.s = r4     // Catch: java.lang.Throwable -> L95
            r9.getClass()     // Catch: java.lang.Throwable -> L91
            androidx.compose.material.InternalMutatorMutex$mutate$2 r8 = new androidx.compose.material.InternalMutatorMutex$mutate$2     // Catch: java.lang.Throwable -> L91
            r8.<init>(r7, r9, r2, r5)     // Catch: java.lang.Throwable -> L91
            java.lang.Object r7 = kotlinx.coroutines.CoroutineScopeKt.c(r8, r0)     // Catch: java.lang.Throwable -> L91
            if (r7 != r1) goto L53
            return r1
        L53:
            r7 = r6
        L54:
            androidx.compose.material.DraggableAnchors r8 = r7.e()
            androidx.compose.runtime.MutableFloatState r9 = r7.j
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r9 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r9
            float r0 = r9.a()
            java.lang.Object r8 = r8.b(r0)
            if (r8 == 0) goto L8c
            float r9 = r9.a()
            androidx.compose.material.DraggableAnchors r0 = r7.e()
            float r0 = r0.c(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L8c
            kotlin.jvm.functions.Function1 r9 = r7.d
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8c
            r7.h(r8)
        L8c:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        L8f:
            r8 = r7
            goto L93
        L91:
            r7 = move-exception
            goto L8f
        L93:
            r7 = r6
            goto L97
        L95:
            r8 = move-exception
            goto L93
        L97:
            androidx.compose.material.DraggableAnchors r9 = r7.e()
            androidx.compose.runtime.MutableFloatState r0 = r7.j
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r0 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r0
            float r1 = r0.a()
            java.lang.Object r9 = r9.b(r1)
            if (r9 == 0) goto Lcf
            float r0 = r0.a()
            androidx.compose.material.DraggableAnchors r1 = r7.e()
            float r1 = r1.c(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lcf
            kotlin.jvm.functions.Function1 r0 = r7.d
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lcf
            r7.h(r9)
        Lcf:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.a(androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(java.lang.Object r7, androidx.compose.foundation.MutatePriority r8, kotlin.jvm.functions.Function4 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.s
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            androidx.compose.material.AnchoredDraggableState r7 = r0.p
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L2c
            goto L5f
        L2c:
            r8 = move-exception
            goto La3
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.b(r10)
            androidx.compose.material.DraggableAnchors r10 = r6.e()
            boolean r10 = r10.d(r7)
            if (r10 == 0) goto Ldf
            androidx.compose.material.InternalMutatorMutex r10 = r6.e     // Catch: java.lang.Throwable -> La1
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> La1
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> La1
            r0.p = r6     // Catch: java.lang.Throwable -> La1
            r0.s = r4     // Catch: java.lang.Throwable -> La1
            r10.getClass()     // Catch: java.lang.Throwable -> L9d
            androidx.compose.material.InternalMutatorMutex$mutate$2 r7 = new androidx.compose.material.InternalMutatorMutex$mutate$2     // Catch: java.lang.Throwable -> L9d
            r7.<init>(r8, r10, r2, r5)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r7 = kotlinx.coroutines.CoroutineScopeKt.c(r7, r0)     // Catch: java.lang.Throwable -> L9d
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r7 = r6
        L5f:
            r7.i(r5)
            androidx.compose.runtime.MutableFloatState r8 = r7.j
            androidx.compose.material.DraggableAnchors r9 = r7.e()
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r8 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r8
            float r10 = r8.a()
            java.lang.Object r9 = r9.b(r10)
            if (r9 == 0) goto Le2
            float r8 = r8.a()
            androidx.compose.material.DraggableAnchors r10 = r7.e()
            float r10 = r10.c(r9)
            float r8 = r8 - r10
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r8 > 0) goto Le2
            kotlin.jvm.functions.Function1 r8 = r7.d
            java.lang.Object r8 = r8.invoke(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Le2
            r7.h(r9)
            goto Le2
        L9b:
            r8 = r7
            goto L9f
        L9d:
            r7 = move-exception
            goto L9b
        L9f:
            r7 = r6
            goto La3
        La1:
            r8 = move-exception
            goto L9f
        La3:
            r7.i(r5)
            androidx.compose.runtime.MutableFloatState r9 = r7.j
            androidx.compose.material.DraggableAnchors r10 = r7.e()
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r9 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r9
            float r0 = r9.a()
            java.lang.Object r10 = r10.b(r0)
            if (r10 == 0) goto Lde
            float r9 = r9.a()
            androidx.compose.material.DraggableAnchors r0 = r7.e()
            float r0 = r0.c(r10)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lde
            kotlin.jvm.functions.Function1 r9 = r7.d
            java.lang.Object r9 = r9.invoke(r10)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lde
            r7.h(r10)
        Lde:
            throw r8
        Ldf:
            r6.h(r7)
        Le2:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.b(java.lang.Object, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object c(float f, float f2, Object obj) {
        DraggableAnchors draggableAnchorsE = e();
        float fC = draggableAnchorsE.c(obj);
        float fFloatValue = ((Number) this.b.invoke()).floatValue();
        if (fC != f && !Float.isNaN(fC)) {
            Function1 function1 = this.f1233a;
            if (fC < f) {
                if (f2 >= fFloatValue) {
                    Object objA = draggableAnchorsE.a(f, true);
                    Intrinsics.e(objA);
                    return objA;
                }
                Object objA2 = draggableAnchorsE.a(f, true);
                Intrinsics.e(objA2);
                if (f >= Math.abs(Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(draggableAnchorsE.c(objA2) - fC)))).floatValue()) + fC)) {
                    return objA2;
                }
            } else {
                if (f2 <= (-fFloatValue)) {
                    Object objA3 = draggableAnchorsE.a(f, false);
                    Intrinsics.e(objA3);
                    return objA3;
                }
                Object objA4 = draggableAnchorsE.a(f, false);
                Intrinsics.e(objA4);
                float fAbs = Math.abs(fC - Math.abs(((Number) function1.invoke(Float.valueOf(Math.abs(fC - draggableAnchorsE.c(objA4))))).floatValue()));
                if (f >= BitmapDescriptorFactory.HUE_RED ? f <= fAbs : Math.abs(f) >= fAbs) {
                    return objA4;
                }
            }
        }
        return obj;
    }

    public final float d(float f) {
        float f2 = f(f);
        MutableFloatState mutableFloatState = this.j;
        SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) mutableFloatState;
        float fA = Float.isNaN(snapshotMutableFloatStateImpl.a()) ? BitmapDescriptorFactory.HUE_RED : snapshotMutableFloatStateImpl.a();
        ((SnapshotMutableFloatStateImpl) mutableFloatState).p(f2);
        return f2 - fA;
    }

    public final DraggableAnchors e() {
        return (DraggableAnchors) ((SnapshotMutableStateImpl) this.n).getD();
    }

    public final float f(float f) {
        SnapshotMutableFloatStateImpl snapshotMutableFloatStateImpl = (SnapshotMutableFloatStateImpl) this.j;
        return RangesKt.b((Float.isNaN(snapshotMutableFloatStateImpl.a()) ? BitmapDescriptorFactory.HUE_RED : snapshotMutableFloatStateImpl.a()) + f, e().e(), e().f());
    }

    public final float g() {
        MutableFloatState mutableFloatState = this.j;
        if (Float.isNaN(((SnapshotMutableFloatStateImpl) mutableFloatState).a())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return ((SnapshotMutableFloatStateImpl) mutableFloatState).a();
    }

    public final void h(Object obj) {
        ((SnapshotMutableStateImpl) this.g).setValue(obj);
    }

    public final void i(Object obj) {
        ((SnapshotMutableStateImpl) this.m).setValue(obj);
    }

    public final Object j(float f, ContinuationImpl continuationImpl) {
        Object d = ((SnapshotMutableStateImpl) this.g).getD();
        Object objC = c(g(), f, d);
        if (((Boolean) this.d.invoke(objC)).booleanValue()) {
            Object objD = AnchoredDraggableKt.d(this, objC, f, continuationImpl);
            if (objD == CoroutineSingletons.d) {
                return objD;
            }
        } else {
            Object objD2 = AnchoredDraggableKt.d(this, d, f, continuationImpl);
            if (objD2 == CoroutineSingletons.d) {
                return objD2;
            }
        }
        return Unit.f24250a;
    }

    public final boolean k(final Object obj) {
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.material.AnchoredDraggableState$trySnapTo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                AnchoredDraggableState anchoredDraggableState = this.h;
                AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = anchoredDraggableState.o;
                DraggableAnchors draggableAnchorsE = anchoredDraggableState.e();
                Object obj2 = obj;
                float fC = draggableAnchorsE.c(obj2);
                if (!Float.isNaN(fC)) {
                    anchoredDraggableState$anchoredDragScope$1.a(fC, BitmapDescriptorFactory.HUE_RED);
                    anchoredDraggableState.i(null);
                }
                anchoredDraggableState.h(obj2);
                return Unit.f24250a;
            }
        };
        MutexImpl mutexImpl = this.e.b;
        boolean zF = mutexImpl.f();
        if (!zF) {
            return zF;
        }
        try {
            function0.invoke();
            return zF;
        } finally {
            mutexImpl.c(null);
        }
    }

    public final void l(DraggableAnchors draggableAnchors, Object obj) {
        if (Intrinsics.c(e(), draggableAnchors)) {
            return;
        }
        ((SnapshotMutableStateImpl) this.n).setValue(draggableAnchors);
        if (k(obj)) {
            return;
        }
        i(obj);
    }
}
