package androidx.compose.material;

import androidx.compose.runtime.SnapshotMutableFloatStateImpl;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.ui.unit.Density;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", l = {602}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SwipeableKt$swipeable$3$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SwipeableState q;
    public final /* synthetic */ LinkedHashMap r;
    public final /* synthetic */ ResistanceConfig s;
    public final /* synthetic */ Density t;
    public final /* synthetic */ Function2 u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeable$3$3$1(SwipeableState swipeableState, LinkedHashMap linkedHashMap, ResistanceConfig resistanceConfig, Density density, Function2 function2, float f, Continuation continuation) {
        super(2, continuation);
        this.q = swipeableState;
        this.r = linkedHashMap;
        this.s = resistanceConfig;
        this.t = density;
        this.u = function2;
        this.v = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SwipeableKt$swipeable$3$3$1(this.q, this.r, this.s, this.t, this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SwipeableKt$swipeable$3$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            SwipeableState swipeableState = this.q;
            Map mapB = swipeableState.b();
            SnapshotMutableStateImpl snapshotMutableStateImpl = (SnapshotMutableStateImpl) swipeableState.i;
            final LinkedHashMap linkedHashMap = this.r;
            snapshotMutableStateImpl.setValue(linkedHashMap);
            ((SnapshotMutableStateImpl) swipeableState.o).setValue(this.s);
            final Function2 function2 = this.u;
            final Density density = this.t;
            ((SnapshotMutableStateImpl) swipeableState.m).setValue(new Function2<Float, Float, Float>() { // from class: androidx.compose.material.SwipeableKt$swipeable$3$3$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    float fFloatValue = ((Number) obj2).floatValue();
                    float fFloatValue2 = ((Number) obj3).floatValue();
                    Float fValueOf = Float.valueOf(fFloatValue);
                    LinkedHashMap linkedHashMap2 = linkedHashMap;
                    return Float.valueOf(((ThresholdConfig) function2.invoke(MapsKt.e(fValueOf, linkedHashMap2), MapsKt.e(Float.valueOf(fFloatValue2), linkedHashMap2))).a(density, fFloatValue, fFloatValue2));
                }
            });
            ((SnapshotMutableFloatStateImpl) swipeableState.n).p(density.T1(this.v));
            this.p = 1;
            if (swipeableState.c(mapB, linkedHashMap, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
