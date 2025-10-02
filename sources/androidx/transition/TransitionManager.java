package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.collection.ArrayMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionManager {

    /* renamed from: a, reason: collision with root package name */
    public static final AutoTransition f3794a = new AutoTransition();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static class MultiListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public Transition d;
        public ViewGroup e;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:105:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:137:0x02b8  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x02e2  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02e8  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01d9 A[EDGE_INSN: B:161:0x01d9->B:88:0x01d9 BREAK  A[LOOP:1: B:19:0x0083->B:87:0x01d0], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0205  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean onPreDraw() {
            /*
                Method dump skipped, instructions count: 803
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionManager.MultiListener.onPreDraw():boolean");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.e;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            TransitionManager.c.remove(viewGroup);
            ArrayList arrayList = (ArrayList) TransitionManager.b().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).G(viewGroup);
                }
            }
            this.d.i(true);
        }
    }

    public static void a(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (transition == null) {
            transition = f3794a;
        }
        Transition transitionClone = transition.clone();
        c(viewGroup, transitionClone);
        viewGroup.setTag(com.woolworths.R.id.transition_current_scene, null);
        MultiListener multiListener = new MultiListener();
        multiListener.d = transitionClone;
        multiListener.e = viewGroup;
        viewGroup.addOnAttachStateChangeListener(multiListener);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(multiListener);
    }

    public static ArrayMap b() {
        ArrayMap arrayMap;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (arrayMap = (ArrayMap) weakReference.get()) != null) {
            return arrayMap;
        }
        ArrayMap arrayMap2 = new ArrayMap(0);
        threadLocal.set(new WeakReference(arrayMap2));
        return arrayMap2;
    }

    public static void c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).B(viewGroup);
            }
        }
        if (transition != null) {
            transition.h(viewGroup, true);
        }
        if (((Scene) viewGroup.getTag(com.woolworths.R.id.transition_current_scene)) != null) {
            throw null;
        }
    }
}
