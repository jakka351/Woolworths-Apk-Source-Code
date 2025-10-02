package androidx.constraintlayout.compose.carousel;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "velocity", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1", f = "CarouselSwipeable.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CarouselSwipeableKt$carouselSwipeable$3$4$1 extends SuspendLambda implements Function3<CoroutineScope, Float, Continuation<? super Unit>, Object> {
    public /* synthetic */ CoroutineScope p;
    public /* synthetic */ float q;
    public final /* synthetic */ CarouselSwipeableState r;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1", f = "CarouselSwipeable.kt", l = {593}, m = "invokeSuspend")
    /* renamed from: androidx.constraintlayout.compose.carousel.CarouselSwipeableKt$carouselSwipeable$3$4$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ CarouselSwipeableState q;
        public final /* synthetic */ float r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f, CarouselSwipeableState carouselSwipeableState, Continuation continuation) {
            super(2, continuation);
            this.q = carouselSwipeableState;
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
                this.p = 1;
                final CarouselSwipeableState carouselSwipeableState = this.q;
                FlowKt__LimitKt$take$$inlined$unsafeFlow$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1 = carouselSwipeableState.i;
                final float f = this.r;
                Object objCollect = flowKt__LimitKt$take$$inlined$unsafeFlow$1.collect(new FlowCollector() { // from class: androidx.constraintlayout.compose.carousel.CarouselSwipeableState$performFling$2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        Object obj3;
                        Object obj4;
                        float fFloatValue;
                        Map map = (Map) obj2;
                        CarouselSwipeableState carouselSwipeableState2 = carouselSwipeableState;
                        Float fA = CarouselSwipeableKt.a(((SnapshotMutableStateImpl) carouselSwipeableState2.b).getD(), map);
                        Intrinsics.e(fA);
                        float fFloatValue2 = fA.floatValue();
                        float fA2 = ((SnapshotMutableFloatStateImpl) carouselSwipeableState2.d).a();
                        Set setKeySet = map.keySet();
                        Function2 function2 = (Function2) ((SnapshotMutableStateImpl) carouselSwipeableState2.l).getD();
                        float fA3 = ((SnapshotMutableFloatStateImpl) carouselSwipeableState2.m).a();
                        Set set = setKeySet;
                        ArrayList arrayList = new ArrayList();
                        for (T t : set) {
                            if (((Number) t).floatValue() <= fA2 + 0.001d) {
                                arrayList.add(t);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            obj3 = null;
                        } else {
                            obj3 = arrayList.get(0);
                            float fFloatValue3 = ((Number) obj3).floatValue();
                            int I = CollectionsKt.I(arrayList);
                            if (1 <= I) {
                                int i2 = 1;
                                while (true) {
                                    Object obj5 = arrayList.get(i2);
                                    float fFloatValue4 = ((Number) obj5).floatValue();
                                    if (Float.compare(fFloatValue3, fFloatValue4) < 0) {
                                        fFloatValue3 = fFloatValue4;
                                        obj3 = obj5;
                                    }
                                    if (i2 == I) {
                                        break;
                                    }
                                    i2++;
                                }
                            }
                        }
                        Float f2 = (Float) obj3;
                        ArrayList arrayList2 = new ArrayList();
                        for (T t2 : set) {
                            if (((Number) t2).floatValue() >= fA2 - 0.001d) {
                                arrayList2.add(t2);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            obj4 = null;
                        } else {
                            Object obj6 = arrayList2.get(0);
                            float fFloatValue5 = ((Number) obj6).floatValue();
                            int I2 = CollectionsKt.I(arrayList2);
                            if (1 <= I2) {
                                int i3 = 1;
                                while (true) {
                                    Object obj7 = arrayList2.get(i3);
                                    float fFloatValue6 = ((Number) obj7).floatValue();
                                    if (Float.compare(fFloatValue5, fFloatValue6) > 0) {
                                        obj6 = obj7;
                                        fFloatValue5 = fFloatValue6;
                                    }
                                    if (i3 == I2) {
                                        break;
                                    }
                                    i3++;
                                }
                            }
                            obj4 = obj6;
                        }
                        Float f3 = (Float) obj4;
                        List listQ = f2 == null ? CollectionsKt.S(f3) : (f3 == null || f2.floatValue() == f3.floatValue()) ? CollectionsKt.Q(f2) : CollectionsKt.R(f2, f3);
                        int size = listQ.size();
                        if (size == 0) {
                            fFloatValue = fFloatValue2;
                        } else if (size != 1) {
                            fFloatValue = ((Number) listQ.get(0)).floatValue();
                            float fFloatValue7 = ((Number) listQ.get(1)).floatValue();
                            float f4 = f;
                            if (fFloatValue2 > fA2 ? f4 > (-fA3) && fA2 > ((Number) function2.invoke(Float.valueOf(fFloatValue7), Float.valueOf(fFloatValue))).floatValue() : f4 >= fA3 || fA2 >= ((Number) function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue7))).floatValue()) {
                                fFloatValue = fFloatValue7;
                            }
                        } else {
                            fFloatValue = ((Number) listQ.get(0)).floatValue();
                        }
                        Object obj8 = map.get(new Float(fFloatValue));
                        Unit unit2 = Unit.f24250a;
                        if (obj8 == null || !Boolean.TRUE.booleanValue()) {
                            SpringSpec springSpec = SwipeableDefaults.f2258a;
                            Object objA = carouselSwipeableState2.a(fFloatValue2, continuation);
                            if (objA == CoroutineSingletons.d) {
                                return objA;
                            }
                        } else {
                            SpringSpec springSpec2 = SwipeableDefaults.f2258a;
                            Object objCollect2 = carouselSwipeableState2.i.collect(new CarouselSwipeableState$animateTo$2(obj8, carouselSwipeableState2), continuation);
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
                if (objCollect != coroutineSingletons) {
                    objCollect = unit;
                }
                if (objCollect == coroutineSingletons) {
                    return coroutineSingletons;
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
    public CarouselSwipeableKt$carouselSwipeable$3$4$1(CarouselSwipeableState carouselSwipeableState, Continuation continuation) {
        super(3, continuation);
        this.r = carouselSwipeableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        CarouselSwipeableKt$carouselSwipeable$3$4$1 carouselSwipeableKt$carouselSwipeable$3$4$1 = new CarouselSwipeableKt$carouselSwipeable$3$4$1(this.r, (Continuation) obj3);
        carouselSwipeableKt$carouselSwipeable$3$4$1.p = (CoroutineScope) obj;
        carouselSwipeableKt$carouselSwipeable$3$4$1.q = fFloatValue;
        Unit unit = Unit.f24250a;
        carouselSwipeableKt$carouselSwipeable$3$4$1.invokeSuspend(unit);
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
