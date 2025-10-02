package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Lifecycle r;
    public final /* synthetic */ Lifecycle.State s;
    public final /* synthetic */ SuspendLambda t;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Ref.ObjectRef p;
        public Ref.ObjectRef q;
        public CoroutineScope r;
        public int s;
        public final /* synthetic */ Lifecycle t;
        public final /* synthetic */ Lifecycle.State u;
        public final /* synthetic */ CoroutineScope v;
        public final /* synthetic */ SuspendLambda w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineScope coroutineScope, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.t = lifecycle;
            this.u = state;
            this.v = coroutineScope;
            this.w = (SuspendLambda) function2;
        }

        /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.t, this.u, this.v, this.w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:40:? A[SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                int r1 = r14.s
                r2 = 0
                kotlin.Unit r3 = kotlin.Unit.f24250a
                androidx.lifecycle.Lifecycle r4 = r14.t
                r5 = 1
                if (r1 == 0) goto L22
                if (r1 != r5) goto L1a
                kotlin.jvm.internal.Ref$ObjectRef r1 = r14.q
                kotlin.jvm.internal.Ref$ObjectRef r5 = r14.p
                kotlin.ResultKt.b(r15)     // Catch: java.lang.Throwable -> L16
                goto L75
            L16:
                r0 = move-exception
                r15 = r0
                goto L8b
            L1a:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L22:
                kotlin.ResultKt.b(r15)
                androidx.lifecycle.Lifecycle$State r15 = r4.getD()
                androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.d
                if (r15 != r1) goto L2e
                goto L87
            L2e:
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                androidx.lifecycle.Lifecycle$State r15 = r14.u     // Catch: java.lang.Throwable -> L88
                kotlinx.coroutines.CoroutineScope r9 = r14.v     // Catch: java.lang.Throwable -> L88
                kotlin.coroutines.jvm.internal.SuspendLambda r13 = r14.w     // Catch: java.lang.Throwable -> L88
                r14.p = r8     // Catch: java.lang.Throwable -> L88
                r14.q = r1     // Catch: java.lang.Throwable -> L88
                r14.r = r9     // Catch: java.lang.Throwable -> L88
                r14.s = r5     // Catch: java.lang.Throwable -> L88
                kotlinx.coroutines.CancellableContinuationImpl r11 = new kotlinx.coroutines.CancellableContinuationImpl     // Catch: java.lang.Throwable -> L88
                kotlin.coroutines.Continuation r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.b(r14)     // Catch: java.lang.Throwable -> L88
                r11.<init>(r5, r6)     // Catch: java.lang.Throwable -> L88
                r11.o()     // Catch: java.lang.Throwable -> L88
                androidx.lifecycle.Lifecycle$Event$Companion r5 = androidx.lifecycle.Lifecycle.Event.INSTANCE     // Catch: java.lang.Throwable -> L88
                r5.getClass()     // Catch: java.lang.Throwable -> L88
                androidx.lifecycle.Lifecycle$Event r7 = androidx.lifecycle.Lifecycle.Event.Companion.b(r15)     // Catch: java.lang.Throwable -> L88
                androidx.lifecycle.Lifecycle$Event r10 = androidx.lifecycle.Lifecycle.Event.Companion.a(r15)     // Catch: java.lang.Throwable -> L88
                kotlinx.coroutines.sync.MutexImpl r12 = kotlinx.coroutines.sync.MutexKt.a()     // Catch: java.lang.Throwable -> L88
                androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r6 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L88
                r6.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L88
                r1.d = r6     // Catch: java.lang.Throwable -> L88
                r4.a(r6)     // Catch: java.lang.Throwable -> L88
                java.lang.Object r15 = r11.n()     // Catch: java.lang.Throwable -> L88
                if (r15 != r0) goto L74
                return r0
            L74:
                r5 = r8
            L75:
                java.lang.Object r15 = r5.d
                kotlinx.coroutines.Job r15 = (kotlinx.coroutines.Job) r15
                if (r15 == 0) goto L7e
                r15.cancel(r2)
            L7e:
                java.lang.Object r15 = r1.d
                androidx.lifecycle.LifecycleEventObserver r15 = (androidx.lifecycle.LifecycleEventObserver) r15
                if (r15 == 0) goto L87
                r4.c(r15)
            L87:
                return r3
            L88:
                r0 = move-exception
                r15 = r0
                r5 = r8
            L8b:
                java.lang.Object r0 = r5.d
                kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
                if (r0 == 0) goto L94
                r0.cancel(r2)
            L94:
                java.lang.Object r0 = r1.d
                androidx.lifecycle.LifecycleEventObserver r0 = (androidx.lifecycle.LifecycleEventObserver) r0
                if (r0 == 0) goto L9d
                r4.c(r0)
            L9d:
                throw r15
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(Lifecycle lifecycle, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.r = lifecycle;
        this.s = state;
        this.t = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.r, this.s, this.t, continuation);
        repeatOnLifecycleKt$repeatOnLifecycle$3.q = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            DefaultScheduler defaultScheduler = Dispatchers.f24691a;
            MainCoroutineDispatcher mainCoroutineDispatcherT = MainDispatcherLoader.f24726a.T();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, coroutineScope, this.t, null);
            this.p = 1;
            if (BuildersKt.f(mainCoroutineDispatcherT, anonymousClass1, this) == coroutineSingletons) {
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
