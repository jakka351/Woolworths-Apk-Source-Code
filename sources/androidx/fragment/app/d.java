package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DefaultSpecialEffectsController.TransitionEffect transitionEffect = (DefaultSpecialEffectsController.TransitionEffect) this.e;
                if (FragmentManager.Q(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = transitionEffect.c.iterator();
                while (it.hasNext()) {
                    ((DefaultSpecialEffectsController.TransitionInfo) it.next()).f2736a.c(transitionEffect);
                }
                break;
            case 1:
                Fragment fragment2 = (Fragment) this.e;
                FragmentViewLifecycleOwner fragmentViewLifecycleOwner = fragment2.mViewLifecycleOwner;
                fragmentViewLifecycleOwner.i.a(fragment2.mSavedViewRegistryState);
                fragment2.mSavedViewRegistryState = null;
                break;
            case 2:
                Ref.ObjectRef seekCancelLambda = (Ref.ObjectRef) this.e;
                Intrinsics.h(seekCancelLambda, "$seekCancelLambda");
                Function0 function0 = (Function0) seekCancelLambda.d;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 3:
                FragmentTransition.c(4, (ArrayList) this.e);
                break;
            default:
                Iterator it2 = ((FragmentManager) this.e).o.iterator();
                while (it2.hasNext()) {
                    ((FragmentManager.OnBackStackChangedListener) it2.next()).getClass();
                }
                break;
        }
    }
}
