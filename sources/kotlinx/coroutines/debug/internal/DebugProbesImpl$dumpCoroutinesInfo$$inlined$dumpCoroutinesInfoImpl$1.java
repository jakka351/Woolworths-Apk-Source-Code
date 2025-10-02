package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DebugProbesImpl$dumpCoroutinesInfo$$inlined$dumpCoroutinesInfoImpl$1 implements Function1<DebugProbesImpl.CoroutineOwner<?>, DebugCoroutineInfo> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ConcurrentWeakMap concurrentWeakMap = DebugProbesImpl.f24704a;
        ((DebugProbesImpl.CoroutineOwner) obj).getClass();
        throw null;
    }
}
