package androidx.room;

import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/room/CoroutinesRoom;", "", "Companion", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo
/* loaded from: classes.dex */
public final class CoroutinesRoom {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/CoroutinesRoom$Companion;", "", "room-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public static Flow a(RoomDatabase roomDatabase, boolean z, String[] strArr, Callable callable) {
            return FlowKt.B(new CoroutinesRoom$Companion$createFlow$1(z, roomDatabase, strArr, callable, null));
        }

        public static Object b(RoomDatabase roomDatabase, Callable callable, Continuation continuation) {
            if (roomDatabase.n() && roomDatabase.h().getWritableDatabase().l2()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getE().get(TransactionElement.f);
            return BuildersKt.f(transactionElement != null ? transactionElement.d : CoroutinesRoomKt.b(roomDatabase), new CoroutinesRoom$Companion$execute$2(callable, null), continuation);
        }

        public static Object c(RoomDatabase roomDatabase, boolean z, final CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
            if (roomDatabase.n() && roomDatabase.h().getWritableDatabase().l2()) {
                return callable.call();
            }
            TransactionElement transactionElement = (TransactionElement) continuation.getE().get(TransactionElement.f);
            CoroutineContext coroutineContextB = transactionElement != null ? transactionElement.d : z ? CoroutinesRoomKt.b(roomDatabase) : CoroutinesRoomKt.a(roomDatabase);
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
            cancellableContinuationImpl.o();
            final Job jobC = BuildersKt.c(GlobalScope.d, coroutineContextB, null, new CoroutinesRoom$Companion$execute$4$job$1(callable, cancellableContinuationImpl, null), 2);
            cancellableContinuationImpl.r(new Function1<Throwable, Unit>() { // from class: androidx.room.CoroutinesRoom$Companion$execute$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    cancellationSignal.cancel();
                    ((JobSupport) jobC).cancel((CancellationException) null);
                    return Unit.f24250a;
                }
            });
            Object objN = cancellableContinuationImpl.n();
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            return objN;
        }
    }
}
