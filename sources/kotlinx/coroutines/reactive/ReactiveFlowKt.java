package kotlinx.coroutines.reactive;

import java.util.ServiceLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-reactive"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class ReactiveFlowKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ContextInjector[] f24736a = (ContextInjector[]) SequencesKt.x(SequencesKt.b(ServiceLoader.load(ContextInjector.class, ContextInjector.class.getClassLoader()).iterator())).toArray(new ContextInjector[0]);
}
