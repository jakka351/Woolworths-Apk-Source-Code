package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.e;
                ViewGroup container = (ViewGroup) this.f;
                Intrinsics.h(container, "$container");
                Iterator it = transitionEffect.c.iterator();
                while (it.hasNext()) {
                    SpecialEffectsController.Operation operation = ((DefaultSpecialEffectsController.TransitionInfo) it.next()).f2736a;
                    View view = operation.c.getView();
                    if (view != null) {
                        operation.f2769a.a(view, container);
                    }
                }
                break;
            case 1:
                DefaultSpecialEffectsController this$0 = (DefaultSpecialEffectsController) this.e;
                SpecialEffectsController.Operation operation2 = (SpecialEffectsController.Operation) this.f;
                Intrinsics.h(this$0, "this$0");
                Intrinsics.h(operation2, "$operation");
                this$0.a(operation2);
                break;
            default:
                FragmentTransitionImpl.j((Rect) this.f, (View) this.e);
                break;
        }
    }

    public /* synthetic */ c(FragmentTransitionImpl fragmentTransitionImpl, View view, Rect rect) {
        this.d = 2;
        this.e = view;
        this.f = rect;
    }
}
