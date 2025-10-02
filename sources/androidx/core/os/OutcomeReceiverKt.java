package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.z;
import kotlin.Metadata;
import kotlinx.coroutines.CancellableContinuationImpl;

@RequiresApi
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OutcomeReceiverKt {
    public static final OutcomeReceiver a(CancellableContinuationImpl cancellableContinuationImpl) {
        return z.g(new ContinuationOutcomeReceiver(cancellableContinuationImpl));
    }
}
