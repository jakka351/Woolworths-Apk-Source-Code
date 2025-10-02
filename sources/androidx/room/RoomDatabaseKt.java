package androidx.room;

import java.util.concurrent.RejectedExecutionException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.internal.ThreadLocalElement;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RoomDatabaseKt {
    public static final Object a(final RoomDatabase roomDatabase, Function1 function1, Continuation continuation) {
        TransactionExecutor transactionExecutor;
        final RoomDatabaseKt$withTransaction$transactionBlock$1 roomDatabaseKt$withTransaction$transactionBlock$1 = new RoomDatabaseKt$withTransaction$transactionBlock$1(roomDatabase, function1, null);
        TransactionElement transactionElement = (TransactionElement) continuation.getE().get(TransactionElement.f);
        ContinuationInterceptor continuationInterceptor = transactionElement != null ? transactionElement.d : null;
        if (continuationInterceptor != null) {
            return BuildersKt.f(continuationInterceptor, roomDatabaseKt$withTransaction$transactionBlock$1, continuation);
        }
        final CoroutineContext e = continuation.getE();
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        try {
            transactionExecutor = roomDatabase.c;
        } catch (RejectedExecutionException e2) {
            cancellableContinuationImpl.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        if (transactionExecutor == null) {
            Intrinsics.p("internalTransactionExecutor");
            throw null;
        }
        transactionExecutor.execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1

            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1", f = "RoomDatabaseExt.kt", l = {103}, m = "invokeSuspend")
            /* renamed from: androidx.room.RoomDatabaseKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
            final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int p;
                public /* synthetic */ Object q;
                public final /* synthetic */ RoomDatabase r;
                public final /* synthetic */ CancellableContinuationImpl s;
                public final /* synthetic */ Function2 t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(RoomDatabase roomDatabase, CancellableContinuationImpl cancellableContinuationImpl, Function2 function2, Continuation continuation) {
                    super(2, continuation);
                    this.r = roomDatabase;
                    this.s = cancellableContinuationImpl;
                    this.t = function2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.r, this.s, this.t, continuation);
                    anonymousClass1.q = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Continuation continuation;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                    int i = this.p;
                    if (i == 0) {
                        ResultKt.b(obj);
                        CoroutineContext.Element element = ((CoroutineScope) this.q).getE().get(ContinuationInterceptor.Key.d);
                        Intrinsics.e(element);
                        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
                        TransactionElement transactionElement = new TransactionElement(continuationInterceptor);
                        CoroutineContext coroutineContextPlus = continuationInterceptor.plus(transactionElement).plus(new ThreadLocalElement(Integer.valueOf(System.identityHashCode(transactionElement)), this.r.j));
                        CancellableContinuationImpl cancellableContinuationImpl = this.s;
                        this.q = cancellableContinuationImpl;
                        this.p = 1;
                        obj = BuildersKt.f(coroutineContextPlus, this.t, this);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        continuation = cancellableContinuationImpl;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        continuation = (Continuation) this.q;
                        ResultKt.b(obj);
                    }
                    continuation.resumeWith(obj);
                    return Unit.f24250a;
                }
            }

            @Override // java.lang.Runnable
            public final void run() throws DispatchException {
                CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                try {
                    BuildersKt.d(e.minusKey(ContinuationInterceptor.Key.d), new AnonymousClass1(roomDatabase, cancellableContinuationImpl2, roomDatabaseKt$withTransaction$transactionBlock$1, null));
                } catch (Throwable th) {
                    cancellableContinuationImpl2.cancel(th);
                }
            }
        });
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
