package androidx.work;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.lifecycle.MutableLiveData;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class OperationKt {
    public static final Operation a(ConfigurationKt$createDefaultTracer$tracer$1 tracer, String label, SerialExecutor executor, Function0 function0) {
        Intrinsics.h(tracer, "tracer");
        Intrinsics.h(label, "label");
        Intrinsics.h(executor, "executor");
        MutableLiveData mutableLiveData = new MutableLiveData(Operation.b);
        return new OperationImpl(mutableLiveData, CallbackToFutureAdapter.a(new b(executor, tracer, label, function0, mutableLiveData)));
    }
}
