package kotlinx.coroutines.selects;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.selects.SelectImplementation;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class OnTimeoutKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(SelectImplementation selectImplementation, long j, Function1 function1) {
        OnTimeout onTimeout = new OnTimeout(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.d;
        TypeIntrinsics.d(3, onTimeout$selectClause$1);
        selectImplementation.k(new SelectImplementation.ClauseData(onTimeout, onTimeout$selectClause$1, new SelectClause0Impl(onTimeout, onTimeout$selectClause$1).c, SelectKt.f, (SuspendLambda) function1, null), false);
    }
}
