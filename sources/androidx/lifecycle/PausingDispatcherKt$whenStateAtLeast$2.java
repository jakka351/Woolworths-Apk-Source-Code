package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.jvm.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Lifecycle r;
    public final /* synthetic */ Lifecycle.State s;
    public final /* synthetic */ SuspendLambda t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = lifecycle;
        this.s = state;
        this.t = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.r, this.s, this.t, continuation);
        pausingDispatcherKt$whenStateAtLeast$2.q = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r8v8, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        LifecycleController lifecycleController;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lifecycleController = (LifecycleController) this.q;
            try {
                ResultKt.b(obj);
                lifecycleController.a();
                return obj;
            } catch (Throwable th) {
                th = th;
                lifecycleController.a();
                throw th;
            }
        }
        ResultKt.b(obj);
        Job job = (Job) ((CoroutineScope) this.q).getE().get(Job.Key.d);
        if (job == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        PausingDispatcher pausingDispatcher = new PausingDispatcher();
        LifecycleController lifecycleController2 = new LifecycleController(this.r, this.s, pausingDispatcher.f, job);
        try {
            ?? r8 = this.t;
            this.q = lifecycleController2;
            this.p = 1;
            obj = BuildersKt.f(pausingDispatcher, r8, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            lifecycleController = lifecycleController2;
            lifecycleController.a();
            return obj;
        } catch (Throwable th2) {
            th = th2;
            lifecycleController = lifecycleController2;
            lifecycleController.a();
            throw th;
        }
    }
}
