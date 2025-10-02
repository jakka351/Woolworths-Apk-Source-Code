package androidx.paging;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, 61, 61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SingleRunner$runInIsolation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ SingleRunner r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Function1 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.r = singleRunner;
        this.s = i;
        this.t = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.r, this.s, this.t, continuation);
        singleRunner$runInIsolation$2.q = obj;
        return singleRunner$runInIsolation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleRunner$runInIsolation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0081, code lost:
    
        if (r0.a(r2, r8) != r1) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.paging.SingleRunner$Holder] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v7, types: [kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            androidx.paging.SingleRunner r0 = r8.r
            androidx.paging.SingleRunner$Holder r0 = r0.f3588a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r8.p
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3e
            if (r2 == r6) goto L36
            if (r2 == r5) goto L2c
            if (r2 == r4) goto L27
            if (r2 == r3) goto L1e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            java.lang.Object r0 = r8.q
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            kotlin.ResultKt.b(r9)
            goto L90
        L27:
            kotlin.ResultKt.b(r9)
            goto L91
        L2c:
            java.lang.Object r2 = r8.q
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlin.ResultKt.b(r9)     // Catch: java.lang.Throwable -> L34
            goto L78
        L34:
            r9 = move-exception
            goto L84
        L36:
            java.lang.Object r2 = r8.q
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlin.ResultKt.b(r9)
            goto L63
        L3e:
            kotlin.ResultKt.b(r9)
            java.lang.Object r9 = r8.q
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            kotlin.coroutines.CoroutineContext r9 = r9.getE()
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key.d
            kotlin.coroutines.CoroutineContext$Element r9 = r9.get(r2)
            if (r9 == 0) goto L94
            kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
            r8.q = r9
            r8.p = r6
            int r2 = r8.s
            java.lang.Object r2 = r0.b(r2, r9, r8)
            if (r2 != r1) goto L60
            goto L8e
        L60:
            r7 = r2
            r2 = r9
            r9 = r7
        L63:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L91
            kotlin.jvm.functions.Function1 r9 = r8.t     // Catch: java.lang.Throwable -> L34
            r8.q = r2     // Catch: java.lang.Throwable -> L34
            r8.p = r5     // Catch: java.lang.Throwable -> L34
            java.lang.Object r9 = r9.invoke(r8)     // Catch: java.lang.Throwable -> L34
            if (r9 != r1) goto L78
            goto L8e
        L78:
            r9 = 0
            r8.q = r9
            r8.p = r4
            java.lang.Object r9 = r0.a(r2, r8)
            if (r9 != r1) goto L91
            goto L8e
        L84:
            r8.q = r9
            r8.p = r3
            java.lang.Object r0 = r0.a(r2, r8)
            if (r0 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r0 = r9
        L90:
            throw r0
        L91:
            kotlin.Unit r9 = kotlin.Unit.f24250a
            return r9
        L94:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Internal error. coroutineScope should've created a job."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SingleRunner$runInIsolation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
