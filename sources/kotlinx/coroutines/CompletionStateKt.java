package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class CompletionStateKt {
    public static final Object a(Object obj) {
        return obj instanceof CompletedExceptionally ? ResultKt.a(((CompletedExceptionally) obj).f24689a) : obj;
    }
}
