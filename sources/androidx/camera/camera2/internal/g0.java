package androidx.camera.camera2.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class g0 implements CallbackToFutureAdapter.Resolver {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ g0(Object obj, boolean z, int i) {
        this.d = i;
        this.f = obj;
        this.e = z;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        switch (this.d) {
            case 0:
                FocusMeteringControl focusMeteringControl = (FocusMeteringControl) this.f;
                focusMeteringControl.b.execute(new h0(focusMeteringControl, this.e, completer));
                return "enableExternalFlashAeMode";
            default:
                TorchControl torchControl = (TorchControl) this.f;
                Executor executor = torchControl.d;
                boolean z = this.e;
                executor.execute(new h0(torchControl, completer, z));
                return "enableTorch: " + z;
        }
    }
}
