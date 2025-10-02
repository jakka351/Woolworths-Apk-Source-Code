package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ SpecialEffectsController.Effect g;

    public /* synthetic */ a(Object obj, Object obj2, SpecialEffectsController.Effect effect, int i) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = effect;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ViewGroup container = (ViewGroup) this.e;
                View view = (View) this.f;
                DefaultSpecialEffectsController.AnimationEffect this$0 = (DefaultSpecialEffectsController.AnimationEffect) this.g;
                Intrinsics.h(container, "$container");
                Intrinsics.h(this$0, "this$0");
                container.endViewTransition(view);
                this$0.c.f2736a.c(this$0);
                break;
            default:
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.e;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) this.f;
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.g;
                FragmentTransition.a(operation.c, operation2.c, transitionEffect.o, transitionEffect.n);
                break;
        }
    }
}
