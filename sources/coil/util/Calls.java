package coil.util;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* renamed from: coil.util.-Calls, reason: invalid class name */
/* loaded from: classes4.dex */
public final class Calls {
    public static final Object a(Call call, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.o();
        ContinuationCallback continuationCallback = new ContinuationCallback(call, cancellableContinuationImpl);
        FirebasePerfOkHttpClient.enqueue(call, continuationCallback);
        cancellableContinuationImpl.r(continuationCallback);
        Object objN = cancellableContinuationImpl.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return objN;
    }
}
