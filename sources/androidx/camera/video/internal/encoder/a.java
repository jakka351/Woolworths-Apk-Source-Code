package androidx.camera.video.internal.encoder;

import android.util.Range;
import androidx.camera.video.internal.encoder.EncoderImpl;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((AtomicReference) obj).set(completer);
                return "Data closed";
            case 1:
                Range range = EncoderImpl.E;
                ((AtomicReference) obj).set(completer);
                return "acquireInputBuffer";
            case 2:
                Range range2 = EncoderImpl.E;
                ((AtomicReference) obj).set(completer);
                return "mReleasedFuture";
            case 3:
                ((AtomicReference) obj).set(completer);
                return "Terminate InputBuffer";
            default:
                EncoderImpl.ByteBufferInput byteBufferInput = (EncoderImpl.ByteBufferInput) obj;
                byteBufferInput.d.h.execute(new d(2, byteBufferInput, completer));
                return "fetchData";
        }
    }
}
