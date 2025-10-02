package androidx.room;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"room-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CoroutinesRoomKt {
    public static final CoroutineDispatcher a(RoomDatabase roomDatabase) {
        Map map = roomDatabase.k;
        Object objA = map.get("QueryDispatcher");
        if (objA == null) {
            objA = ExecutorsKt.a(roomDatabase.i());
            map.put("QueryDispatcher", objA);
        }
        return (CoroutineDispatcher) objA;
    }

    public static final CoroutineDispatcher b(RoomDatabase roomDatabase) {
        Map map = roomDatabase.k;
        Object objA = map.get("TransactionDispatcher");
        if (objA == null) {
            TransactionExecutor transactionExecutor = roomDatabase.c;
            if (transactionExecutor == null) {
                Intrinsics.p("internalTransactionExecutor");
                throw null;
            }
            objA = ExecutorsKt.a(transactionExecutor);
            map.put("TransactionDispatcher", objA);
        }
        return (CoroutineDispatcher) objA;
    }
}
