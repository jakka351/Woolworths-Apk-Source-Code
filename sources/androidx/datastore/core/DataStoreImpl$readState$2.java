package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Landroidx/datastore/core/State;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$readState$2", f = "DataStoreImpl.kt", l = {218, 226}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataStoreImpl$readState$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super State<Object>>, Object> {
    public int p;
    public final /* synthetic */ DataStoreImpl q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readState$2(DataStoreImpl dataStoreImpl, Continuation continuation) {
        super(2, continuation);
        this.q = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DataStoreImpl$readState$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$readState$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if (r7 == r2) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            androidx.datastore.core.DataStoreImpl r0 = r6.q
            androidx.datastore.core.DataStoreInMemoryCache r1 = r0.h
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r6.p
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L22
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            kotlin.ResultKt.b(r7)
            goto L45
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L20
            goto L3b
        L20:
            r7 = move-exception
            goto L48
        L22:
            kotlin.ResultKt.b(r7)
            androidx.datastore.core.State r7 = r1.a()
            boolean r7 = r7 instanceof androidx.datastore.core.Final
            if (r7 == 0) goto L32
            androidx.datastore.core.State r7 = r1.a()
            return r7
        L32:
            r6.p = r5     // Catch: java.lang.Throwable -> L20
            java.lang.Object r7 = r0.h(r6)     // Catch: java.lang.Throwable -> L20
            if (r7 != r2) goto L3b
            goto L44
        L3b:
            r6.p = r4
            r7 = 0
            java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.e(r0, r7, r6)
            if (r7 != r2) goto L45
        L44:
            return r2
        L45:
            androidx.datastore.core.State r7 = (androidx.datastore.core.State) r7
            return r7
        L48:
            androidx.datastore.core.ReadException r0 = new androidx.datastore.core.ReadException
            r1 = -1
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$readState$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
