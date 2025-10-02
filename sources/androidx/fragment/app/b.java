package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ SpecialEffectsController.Operation e;
    public final /* synthetic */ DefaultSpecialEffectsController.TransitionEffect f;

    public /* synthetic */ b(SpecialEffectsController.Operation operation, DefaultSpecialEffectsController.TransitionEffect transitionEffect, int i) {
        this.d = i;
        this.e = operation;
        this.f = transitionEffect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                SpecialEffectsController.Operation operation = this.e;
                Intrinsics.h(operation, "$operation");
                DefaultSpecialEffectsController.TransitionEffect this$0 = this.f;
                Intrinsics.h(this$0, "this$0");
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation + " has completed");
                }
                operation.c(this$0);
                break;
            default:
                SpecialEffectsController.Operation operation2 = this.e;
                Intrinsics.h(operation2, "$operation");
                DefaultSpecialEffectsController.TransitionEffect this$02 = this.f;
                Intrinsics.h(this$02, "this$0");
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "Transition for operation " + operation2 + " has completed");
                }
                operation2.c(this$02);
                break;
        }
    }
}
