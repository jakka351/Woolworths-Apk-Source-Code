package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.MainCoroutineDispatcher;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class MainDispatchersKt {
    public static final boolean a(MainCoroutineDispatcher mainCoroutineDispatcher) {
        return mainCoroutineDispatcher.T() instanceof MissingMainCoroutineDispatcher;
    }
}
