package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.dynatrace.android.compose.SwipeableComposeCallback;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SwipeableKt$swipeable$3$4$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    public /* synthetic */ CoroutineScope p;
    public /* synthetic */ float q;
    public final /* synthetic */ SwipeableState r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", l = {611}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$4$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ SwipeableState q;
        public final /* synthetic */ float r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, SwipeableState swipeableState, Continuation continuation) {
            super(2, continuation);
            this.q = swipeableState;
            this.r = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.r, this.q, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            Unit unit = Unit.f24250a;
            if (i == 0) {
                ResultKt.b(obj);
                final float f = this.r;
                this.p = 1;
                final SwipeableState swipeableState = this.q;
                swipeableState.getClass();
                try {
                    Object objCollect = swipeableState.j.collect(new FlowCollector() { // from class: androidx.compose.material.SwipeableState$performFling$2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            Map map = (Map) obj2;
                            SwipeableState swipeableState2 = swipeableState;
                            Float fB = SwipeableKt.b(((SnapshotMutableStateImpl) swipeableState2.c).getD(), map);
                            Intrinsics.e(fB);
                            float fFloatValue = fB.floatValue();
                            Object obj3 = map.get(new Float(SwipeableKt.a(swipeableState2.e.getD().floatValue(), fFloatValue, map.keySet(), (Function2) ((SnapshotMutableStateImpl) swipeableState2.m).getD(), f, ((SnapshotMutableFloatStateImpl) swipeableState2.n).a())));
                            Unit unit2 = Unit.f24250a;
                            if (obj3 == null || !((Boolean) swipeableState2.b.invoke(obj3)).booleanValue()) {
                                Object objA = swipeableState2.a(fFloatValue, swipeableState2.f1332a, continuation);
                                if (objA == CoroutineSingletons.d) {
                                    return objA;
                                }
                            } else {
                                Object objCollect2 = swipeableState2.j.collect(new SwipeableState$animateTo$2(obj3, swipeableState2, swipeableState2.f1332a), continuation);
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.d;
                                if (objCollect2 != coroutineSingletons2) {
                                    objCollect2 = unit2;
                                }
                                if (objCollect2 == coroutineSingletons2) {
                                    return objCollect2;
                                }
                            }
                            return unit2;
                        }
                    }, this);
                    if (objCollect == coroutineSingletons) {
                        SwipeableComposeCallback.a(swipeableState);
                    } else {
                        SwipeableComposeCallback.a(swipeableState);
                        objCollect = unit;
                    }
                    if (objCollect == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } catch (Throwable th) {
                    SwipeableComposeCallback.a(swipeableState);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$4$1(SwipeableState swipeableState, Continuation continuation) {
        super(3, continuation);
        this.r = swipeableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        SwipeableKt$swipeable$3$4$1 swipeableKt$swipeable$3$4$1 = new SwipeableKt$swipeable$3$4$1(this.r, (Continuation) obj3);
        swipeableKt$swipeable$3$4$1.p = (CoroutineScope) obj;
        swipeableKt$swipeable$3$4$1.q = fFloatValue;
        Unit unit = Unit.f24250a;
        swipeableKt$swipeable$3$4$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        BuildersKt.c(this.p, null, null, new AnonymousClass1(this.q, this.r, null), 3);
        return Unit.f24250a;
    }
}
