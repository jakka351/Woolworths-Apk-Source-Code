package au.com.woolworths.android.onesite.utils.coroutines;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.YieldKt;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.utils.coroutines.ControlledRunner$joinPreviousOrRun$3", f = "ControlledRunner.kt", l = {172, SubsamplingScaleImageView.ORIENTATION_180, 185}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ControlledRunner$joinPreviousOrRun$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ControlledRunner r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ControlledRunner$joinPreviousOrRun$3(ControlledRunner controlledRunner, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.r = controlledRunner;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ControlledRunner$joinPreviousOrRun$3 controlledRunner$joinPreviousOrRun$3 = new ControlledRunner$joinPreviousOrRun$3(this.r, this.s, continuation);
        controlledRunner$joinPreviousOrRun$3.q = obj;
        return controlledRunner$joinPreviousOrRun$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ControlledRunner$joinPreviousOrRun$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Deferred deferred;
        ControlledRunner controlledRunner = this.r;
        AtomicReference atomicReference = controlledRunner.f4601a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        int i2 = 1;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            CoroutineStart coroutineStart = CoroutineStart.d;
            Deferred deferredA = BuildersKt.a(coroutineScope, null, new ControlledRunner$joinPreviousOrRun$3$newTask$1(this.s, null), 1);
            ((JobSupport) deferredA).invokeOnCompletion(new a(controlledRunner, deferredA, i2));
            deferred = deferredA;
        } else {
            if (i == 1) {
                ResultKt.b(obj);
                return obj;
            }
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return obj;
            }
            deferred = (Deferred) this.q;
            ResultKt.b(obj);
        }
        while (true) {
            if (atomicReference.compareAndSet(null, deferred)) {
                this.q = null;
                this.p = 3;
                Object objAwait = deferred.await(this);
                if (objAwait == coroutineSingletons) {
                    break;
                }
                return objAwait;
            }
            if (atomicReference.get() != null) {
                Deferred deferred2 = (Deferred) atomicReference.get();
                if (deferred2 != null) {
                    deferred.cancel((CancellationException) null);
                    this.q = null;
                    this.p = 1;
                    Object objAwait2 = deferred2.await(this);
                    if (objAwait2 == coroutineSingletons) {
                        break;
                    }
                    return objAwait2;
                }
                this.q = deferred;
                this.p = 2;
                if (YieldKt.a(this) == coroutineSingletons) {
                    break;
                }
            }
        }
        return coroutineSingletons;
    }
}
