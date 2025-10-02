package me.oriient.internal.services.cachedDataProvider;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.rest.HttpRequestBody;
import me.oriient.internal.services.retryOperation.RetryOperation;

/* loaded from: classes7.dex */
public final class b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25063a;
    public /* synthetic */ Object b;
    public final /* synthetic */ CachedDataProviderImpl c;
    public final /* synthetic */ String d;
    public final /* synthetic */ HttpRequestBody e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CachedDataProviderImpl cachedDataProviderImpl, String str, HttpRequestBody httpRequestBody, Continuation continuation) {
        super(2, continuation);
        this.c = cachedDataProviderImpl;
        this.d = str;
        this.e = httpRequestBody;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        b bVar = new b(this.c, this.d, this.e, continuation);
        bVar.b = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((RetryOperation) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
    
        if (r1.operationFailed(r9) == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r9.f25063a
            r2 = 2
            r3 = 1
            java.lang.String r4 = "CachedDataProvider"
            if (r1 == 0) goto L27
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r9.b
            me.oriient.internal.infra.utils.core.Outcome r0 = (me.oriient.internal.infra.utils.core.Outcome) r0
            kotlin.ResultKt.b(r10)
            goto Lf9
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            java.lang.Object r1 = r9.b
            me.oriient.internal.services.retryOperation.RetryOperation r1 = (me.oriient.internal.services.retryOperation.RetryOperation) r1
            kotlin.ResultKt.b(r10)
            goto L6a
        L27:
            kotlin.ResultKt.b(r10)
            java.lang.Object r10 = r9.b
            r1 = r10
            me.oriient.internal.services.retryOperation.RetryOperation r1 = (me.oriient.internal.services.retryOperation.RetryOperation) r1
            me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl r10 = r9.c
            me.oriient.internal.infra.utils.core.Logger r10 = me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$getLogger(r10)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "refresh() called ("
            r5.<init>(r6)
            int r6 = r1.getTryNumber()
            r5.append(r6)
            r6 = 41
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r10.d(r4, r5)
            me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl r10 = r9.c
            me.oriient.internal.infra.rest.RestService r10 = me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$getRestService$p(r10)
            me.oriient.internal.services.cachedDataProvider.a r5 = new me.oriient.internal.services.cachedDataProvider.a
            java.lang.String r6 = r9.d
            me.oriient.internal.infra.rest.HttpRequestBody r7 = r9.e
            r5.<init>(r6, r7)
            r9.b = r1
            r9.f25063a = r3
            java.lang.Object r10 = r10.postReturningString(r5, r9)
            if (r10 != r0) goto L6a
            goto Lf8
        L6a:
            me.oriient.internal.infra.utils.core.Outcome r10 = (me.oriient.internal.infra.utils.core.Outcome) r10
            me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl r3 = r9.c
            boolean r5 = r10 instanceof me.oriient.internal.infra.utils.core.Outcome.Success
            if (r5 == 0) goto Lca
            r5 = r10
            me.oriient.internal.infra.utils.core.Outcome$Success r5 = (me.oriient.internal.infra.utils.core.Outcome.Success) r5
            java.lang.Object r5 = r5.getValue()
            me.oriient.internal.infra.rest.HttpResponse$StringResponse r5 = (me.oriient.internal.infra.rest.HttpResponse.StringResponse) r5
            java.lang.String r5 = r5.getString()
            me.oriient.internal.infra.utils.core.Logger r6 = me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$getLogger(r3)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "refresh: received new data: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            r6.d(r4, r7)
            kotlin.reflect.KType r6 = r3.getType()
            java.lang.Object r6 = me.oriient.internal.infra.serializerJson.JsonSerializationKt.parseAsJsonOrNull(r5, r6)
            me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$setData$p(r3, r6)
            java.lang.Object r6 = r3.getData()
            if (r6 == 0) goto Lc1
            java.util.List r7 = me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$getListeners$p(r3)
            java.util.List r7 = me.oriient.internal.infra.utils.core.ExtensionsKt.copyOf(r7)
            java.util.Iterator r7 = r7.iterator()
        Lb1:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lc1
            java.lang.Object r8 = r7.next()
            me.oriient.internal.services.cachedDataProvider.DataListener r8 = (me.oriient.internal.services.cachedDataProvider.DataListener) r8
            r8.onDataChanged(r6)
            goto Lb1
        Lc1:
            java.lang.Object r6 = r3.getData()
            if (r6 == 0) goto Lca
            me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$save(r3, r5)
        Lca:
            me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl r3 = r9.c
            boolean r5 = r10 instanceof me.oriient.internal.infra.utils.core.Outcome.Failure
            if (r5 == 0) goto Lf9
            r5 = r10
            me.oriient.internal.infra.utils.core.Outcome$Failure r5 = (me.oriient.internal.infra.utils.core.Outcome.Failure) r5
            java.lang.Exception r5 = r5.getValue()
            me.oriient.internal.infra.utils.core.OriientError r5 = (me.oriient.internal.infra.utils.core.OriientError) r5
            me.oriient.internal.infra.utils.core.Logger r3 = me.oriient.internal.services.cachedDataProvider.CachedDataProviderImpl.access$getLogger(r3)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "refresh: failed to get data: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r3.d(r4, r5)
            r9.b = r10
            r9.f25063a = r2
            java.lang.Object r10 = r1.operationFailed(r9)
            if (r10 != r0) goto Lf9
        Lf8:
            return r0
        Lf9:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: me.oriient.internal.services.cachedDataProvider.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
