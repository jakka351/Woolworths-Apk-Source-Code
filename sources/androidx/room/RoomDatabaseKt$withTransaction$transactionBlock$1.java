package androidx.room;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.RoomDatabaseKt$withTransaction$transactionBlock$1", f = "RoomDatabaseExt.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class RoomDatabaseKt$withTransaction$transactionBlock$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RoomDatabase r;
    public final /* synthetic */ SuspendLambda s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RoomDatabaseKt$withTransaction$transactionBlock$1(RoomDatabase roomDatabase, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.r = roomDatabase;
        this.s = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(this.r, this.s, continuation);
        roomDatabaseKt$withTransaction$transactionBlock$1.q = obj;
        return roomDatabaseKt$withTransaction$transactionBlock$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabaseKt$withTransaction$transactionBlock$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.coroutines.intrinsics.CoroutineSingletons] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        TransactionElement transactionElement;
        TransactionElement transactionElement2 = CoroutineSingletons.d;
        int i = this.p;
        RoomDatabase roomDatabase = this.r;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                CoroutineContext.Element element = ((CoroutineScope) this.q).getE().get(TransactionElement.f);
                Intrinsics.e(element);
                TransactionElement transactionElement3 = (TransactionElement) element;
                transactionElement3.e.incrementAndGet();
                try {
                    roomDatabase.c();
                    try {
                        ?? r1 = this.s;
                        this.q = transactionElement3;
                        this.p = 1;
                        Object objInvoke = r1.invoke(this);
                        if (objInvoke == transactionElement2) {
                            return transactionElement2;
                        }
                        transactionElement = transactionElement3;
                        obj = objInvoke;
                    } catch (Throwable th2) {
                        th = th2;
                        roomDatabase.l();
                        throw th;
                    }
                } catch (Throwable th3) {
                    transactionElement2 = transactionElement3;
                    th = th3;
                    if (transactionElement2.e.decrementAndGet() >= 0) {
                        throw th;
                    }
                    throw new IllegalStateException("Transaction was never started or was already released.");
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                transactionElement = (TransactionElement) this.q;
                try {
                    ResultKt.b(obj);
                } catch (Throwable th4) {
                    th = th4;
                    roomDatabase.l();
                    throw th;
                }
            }
            roomDatabase.r();
            roomDatabase.l();
            if (transactionElement.e.decrementAndGet() >= 0) {
                return obj;
            }
            throw new IllegalStateException("Transaction was never started or was already released.");
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
