package au.com.woolworths.compose.utils.modifier;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements LifecycleEventObserver {
    public final /* synthetic */ int d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ o(MutableState mutableState, int i) {
        this.d = i;
        this.e = mutableState;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        switch (this.d) {
            case 0:
                this.e.setValue(Boolean.valueOf(event != Lifecycle.Event.ON_PAUSE));
                break;
            default:
                if (event == Lifecycle.Event.ON_PAUSE || event == Lifecycle.Event.ON_STOP) {
                    this.e.setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
    }
}
