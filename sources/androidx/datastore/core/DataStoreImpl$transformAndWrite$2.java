package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2", f = "DataStoreImpl.kt", l = {330, 331, 337}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataStoreImpl$transformAndWrite$2 extends SuspendLambda implements Function1<Continuation<Object>, Object> {
    public Object p;
    public int q;
    public final /* synthetic */ DataStoreImpl r;
    public final /* synthetic */ CoroutineContext s;
    public final /* synthetic */ SuspendLambda t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$transformAndWrite$2(DataStoreImpl dataStoreImpl, CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.r = dataStoreImpl;
        this.s = coroutineContext;
        this.t = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DataStoreImpl$transformAndWrite$2(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((DataStoreImpl$transformAndWrite$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r8.q
            androidx.datastore.core.DataStoreImpl r2 = r8.r
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L27
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L17
            java.lang.Object r0 = r8.p
            kotlin.ResultKt.b(r9)
            return r0
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            java.lang.Object r1 = r8.p
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            kotlin.ResultKt.b(r9)
            goto L4f
        L27:
            kotlin.ResultKt.b(r9)
            goto L37
        L2b:
            kotlin.ResultKt.b(r9)
            r8.q = r5
            java.lang.Object r9 = androidx.datastore.core.DataStoreImpl.f(r2, r5, r8)
            if (r9 != r0) goto L37
            goto L6f
        L37:
            r1 = r9
            androidx.datastore.core.Data r1 = (androidx.datastore.core.Data) r1
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r9 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
            kotlin.coroutines.jvm.internal.SuspendLambda r6 = r8.t
            r7 = 0
            r9.<init>(r6, r1, r7)
            r8.p = r1
            r8.q = r4
            kotlin.coroutines.CoroutineContext r4 = r8.s
            java.lang.Object r9 = kotlinx.coroutines.BuildersKt.f(r4, r9, r8)
            if (r9 != r0) goto L4f
            goto L6f
        L4f:
            java.lang.Object r4 = r1.b
            if (r4 == 0) goto L58
            int r4 = r4.hashCode()
            goto L59
        L58:
            r4 = 0
        L59:
            int r6 = r1.c
            if (r4 != r6) goto L71
            java.lang.Object r1 = r1.b
            boolean r1 = kotlin.jvm.internal.Intrinsics.c(r1, r9)
            if (r1 != 0) goto L70
            r8.p = r9
            r8.q = r3
            java.lang.Object r1 = r2.j(r9, r5, r8)
            if (r1 != r0) goto L70
        L6f:
            return r0
        L70:
            return r9
        L71:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data in DataStore was mutated but DataStore is only compatible with Immutable types."
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$transformAndWrite$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
