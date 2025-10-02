package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.camera.core.processing.f;
import androidx.core.os.CancellationSignal;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransitionImpl;
import androidx.fragment.app.c;
import androidx.fragment.app.d;
import androidx.transition.Transition;
import androidx.transition.TransitionManager;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public class FragmentTransitionSupport extends FragmentTransitionImpl {
    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void a(View view, Object obj) {
        ((Transition) obj).b(view);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void b(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.I.size();
            while (i < size) {
                b(transitionSet.S(i), arrayList);
                i++;
            }
            return;
        }
        if (FragmentTransitionImpl.k(transition.h) && FragmentTransitionImpl.k(transition.i)) {
            int size2 = arrayList.size();
            while (i < size2) {
                transition.b((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void c(Object obj) {
        ((TransitionSeekController) obj).e();
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void d(Object obj, c cVar) {
        ((TransitionSeekController) obj).j(cVar);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void e(ViewGroup viewGroup, Object obj) {
        TransitionManager.a(viewGroup, (Transition) obj);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean g(Object obj) {
        return obj instanceof Transition;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object h(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object i(ViewGroup viewGroup, Object obj) {
        Transition transition = (Transition) obj;
        ArrayList arrayList = TransitionManager.c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!transition.v()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        Transition transitionClone = transition.clone();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.R(transitionClone);
        TransitionManager.c(viewGroup, transitionSet);
        viewGroup.setTag(com.woolworths.R.id.transition_current_scene, null);
        TransitionManager.MultiListener multiListener = new TransitionManager.MultiListener();
        multiListener.d = transitionSet;
        multiListener.e = viewGroup;
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
        viewGroup.invalidate();
        Transition.SeekController seekController = new Transition.SeekController(transitionSet);
        transitionSet.C = seekController;
        transitionSet.a(seekController);
        return transitionSet.C;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean l() {
        return true;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final boolean m(Object obj) {
        boolean zV = ((Transition) obj).v();
        if (!zV) {
            Log.v("FragmentManager", "Predictive back not available for AndroidX Transition " + obj + ". Please enable seeking support for the designated transition by overriding isSeekingSupported().");
        }
        return zV;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object n(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.R(transition);
            transitionSet.R(transition2);
            transitionSet.V(1);
            transition = transitionSet;
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet2 = new TransitionSet();
        if (transition != null) {
            transitionSet2.R(transition);
        }
        transitionSet2.R(transition3);
        return transitionSet2;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object o(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.R((Transition) obj);
        }
        transitionSet.R((Transition) obj2);
        return transitionSet;
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void p(Object obj, final View view, final ArrayList arrayList) {
        ((Transition) obj).a(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.2
            @Override // androidx.transition.Transition.TransitionListener
            public final void a() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void d() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void g(Transition transition) {
                transition.D(this);
                transition.a(this);
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void i(Transition transition) {
                transition.D(this);
                view.setVisibility(8);
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((View) arrayList2.get(i)).setVisibility(0);
                }
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void k(Transition transition) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void q(Object obj, final Object obj2, final ArrayList arrayList, final Object obj3, final ArrayList arrayList2) {
        ((Transition) obj).a(new TransitionListenerAdapter() { // from class: androidx.transition.FragmentTransitionSupport.3
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void g(Transition transition) {
                FragmentTransitionSupport fragmentTransitionSupport = FragmentTransitionSupport.this;
                Object obj4 = obj2;
                if (obj4 != null) {
                    fragmentTransitionSupport.z(obj4, arrayList, null);
                }
                Object obj5 = obj3;
                if (obj5 != null) {
                    fragmentTransitionSupport.z(obj5, arrayList2, null);
                }
            }

            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void i(Transition transition) {
                transition.D(this);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void r(Object obj, float f) {
        TransitionSeekController transitionSeekController = (TransitionSeekController) obj;
        if (transitionSeekController.isReady()) {
            long jC = (long) (f * transitionSeekController.c());
            if (jC == 0) {
                jC = 1;
            }
            if (jC == transitionSeekController.c()) {
                jC = transitionSeekController.c() - 1;
            }
            transitionSeekController.h(jC);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void s(View view, Object obj) {
        if (view != null) {
            final Rect rect = new Rect();
            FragmentTransitionImpl.j(rect, view);
            ((Transition) obj).K(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.1
                @Override // androidx.transition.Transition.EpicenterCallback
                public final Rect a() {
                    return rect;
                }
            });
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void t(Object obj, final Rect rect) {
        ((Transition) obj).K(new Transition.EpicenterCallback() { // from class: androidx.transition.FragmentTransitionSupport.5
            @Override // androidx.transition.Transition.EpicenterCallback
            public final Rect a() {
                Rect rect2 = rect;
                if (rect2.isEmpty()) {
                    return null;
                }
                return rect2;
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void u(Fragment fragment2, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        v(obj, cancellationSignal, null, runnable);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void v(Object obj, CancellationSignal cancellationSignal, d dVar, final Runnable runnable) {
        Transition transition = (Transition) obj;
        f fVar = new f(3, dVar, transition, runnable);
        synchronized (cancellationSignal) {
            while (cancellationSignal.d) {
                try {
                    try {
                        cancellationSignal.wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (cancellationSignal.b != fVar) {
                cancellationSignal.b = fVar;
                if (cancellationSignal.f2440a) {
                    fVar.a();
                }
            }
        }
        transition.a(new Transition.TransitionListener() { // from class: androidx.transition.FragmentTransitionSupport.4
            @Override // androidx.transition.Transition.TransitionListener
            public final void a() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void d() {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void g(Transition transition2) {
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void i(Transition transition2) {
                runnable.run();
            }

            @Override // androidx.transition.Transition.TransitionListener
            public final void k(Transition transition2) {
            }
        });
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void w(Object obj, View view, ArrayList arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        ArrayList arrayList2 = transitionSet.i;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            FragmentTransitionImpl.f((View) arrayList.get(i), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(transitionSet, arrayList);
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final void x(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            ArrayList arrayList3 = transitionSet.i;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            z(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.FragmentTransitionImpl
    public final Object y(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.R((Transition) obj);
        return transitionSet;
    }

    public final void z(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int size = transitionSet.I.size();
            while (i < size) {
                z(transitionSet.S(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (FragmentTransitionImpl.k(transition.h)) {
            ArrayList arrayList3 = transition.i;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    transition.b((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    transition.E((View) arrayList.get(size3));
                }
            }
        }
    }
}
