package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.res.TypedArrayUtils;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class TransitionSet extends Transition {
    public ArrayList I;
    public boolean J;
    public int K;
    public boolean L;
    public int M;
    public Transition[] N;

    public static class TransitionSetListener extends TransitionListenerAdapter {
        public TransitionSet d;

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void g(Transition transition) {
            TransitionSet transitionSet = this.d;
            if (transitionSet.L) {
                return;
            }
            transitionSet.P();
            transitionSet.L = true;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        public final void i(Transition transition) {
            TransitionSet transitionSet = this.d;
            int i = transitionSet.K - 1;
            transitionSet.K = i;
            if (i == 0) {
                transitionSet.L = false;
                transitionSet.o();
            }
            transition.D(this);
        }
    }

    public TransitionSet() {
        this.I = new ArrayList();
        this.J = true;
        this.L = false;
        this.M = 0;
    }

    @Override // androidx.transition.Transition
    public final void B(View view) {
        super.B(view);
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.I.get(i)).B(view);
        }
    }

    @Override // androidx.transition.Transition
    public final void C() {
        this.B = 0L;
        TransitionListenerAdapter transitionListenerAdapter = new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.2
            @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
            public final void k(Transition transition) {
                TransitionSet transitionSet = TransitionSet.this;
                transitionSet.I.remove(transition);
                if (transitionSet.u()) {
                    return;
                }
                transitionSet.A(transitionSet, Transition.TransitionNotification.c, false);
                transitionSet.u = true;
                transitionSet.A(transitionSet, Transition.TransitionNotification.b, false);
            }
        };
        for (int i = 0; i < this.I.size(); i++) {
            Transition transition = (Transition) this.I.get(i);
            transition.a(transitionListenerAdapter);
            transition.C();
            long j = transition.B;
            if (this.J) {
                this.B = Math.max(this.B, j);
            } else {
                long j2 = this.B;
                transition.D = j2;
                this.B = j2 + j;
            }
        }
    }

    @Override // androidx.transition.Transition
    public final Transition D(Transition.TransitionListener transitionListener) {
        super.D(transitionListener);
        return this;
    }

    @Override // androidx.transition.Transition
    public final void E(View view) {
        for (int i = 0; i < this.I.size(); i++) {
            ((Transition) this.I.get(i)).E(view);
        }
        this.i.remove(view);
    }

    @Override // androidx.transition.Transition
    public final void G(View view) {
        super.G(view);
        Transition[] transitionArr = this.N;
        this.N = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.I.size()];
        }
        Transition[] transitionArr2 = (Transition[]) this.I.toArray(transitionArr);
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            transitionArr2[i].G(view);
        }
        Arrays.fill(transitionArr2, (Object) null);
        this.N = transitionArr2;
    }

    @Override // androidx.transition.Transition
    public final void H() {
        if (this.I.isEmpty()) {
            P();
            o();
            return;
        }
        TransitionSetListener transitionSetListener = new TransitionSetListener();
        transitionSetListener.d = this;
        Iterator it = this.I.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).a(transitionSetListener);
        }
        this.K = this.I.size();
        if (this.J) {
            Iterator it2 = this.I.iterator();
            while (it2.hasNext()) {
                ((Transition) it2.next()).H();
            }
            return;
        }
        for (int i = 1; i < this.I.size(); i++) {
            Transition transition = (Transition) this.I.get(i - 1);
            final Transition transition2 = (Transition) this.I.get(i);
            transition.a(new TransitionListenerAdapter() { // from class: androidx.transition.TransitionSet.1
                @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
                public final void i(Transition transition3) {
                    transition2.H();
                    transition3.D(this);
                }
            });
        }
        Transition transition3 = (Transition) this.I.get(0);
        if (transition3 != null) {
            transition3.H();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // androidx.transition.Transition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void I(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionSet.I(long, long):void");
    }

    @Override // androidx.transition.Transition
    public final void K(Transition.EpicenterCallback epicenterCallback) {
        this.z = epicenterCallback;
        this.M |= 8;
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.I.get(i)).K(epicenterCallback);
        }
    }

    @Override // androidx.transition.Transition
    public final void M(PathMotion pathMotion) {
        super.M(pathMotion);
        this.M |= 4;
        if (this.I != null) {
            for (int i = 0; i < this.I.size(); i++) {
                ((Transition) this.I.get(i)).M(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void N(TransitionPropagation transitionPropagation) {
        this.y = transitionPropagation;
        this.M |= 2;
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.I.get(i)).N(transitionPropagation);
        }
    }

    @Override // androidx.transition.Transition
    public final void O(long j) {
        this.e = j;
    }

    @Override // androidx.transition.Transition
    public final String Q(String str) {
        String strQ = super.Q(str);
        for (int i = 0; i < this.I.size(); i++) {
            StringBuilder sbT = YU.a.t(strQ, "\n");
            sbT.append(((Transition) this.I.get(i)).Q(str + "  "));
            strQ = sbT.toString();
        }
        return strQ;
    }

    public final void R(Transition transition) {
        this.I.add(transition);
        transition.l = this;
        long j = this.f;
        if (j >= 0) {
            transition.J(j);
        }
        if ((this.M & 1) != 0) {
            transition.L(this.g);
        }
        if ((this.M & 2) != 0) {
            transition.N(this.y);
        }
        if ((this.M & 4) != 0) {
            transition.M(this.A);
        }
        if ((this.M & 8) != 0) {
            transition.K(this.z);
        }
    }

    public final Transition S(int i) {
        if (i < 0 || i >= this.I.size()) {
            return null;
        }
        return (Transition) this.I.get(i);
    }

    @Override // androidx.transition.Transition
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void J(long j) {
        ArrayList arrayList;
        this.f = j;
        if (j < 0 || (arrayList = this.I) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.I.get(i)).J(j);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public final void L(TimeInterpolator timeInterpolator) {
        this.M |= 1;
        ArrayList arrayList = this.I;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.I.get(i)).L(timeInterpolator);
            }
        }
        this.g = timeInterpolator;
    }

    public final void V(int i) {
        if (i == 0) {
            this.J = true;
        } else {
            if (i != 1) {
                throw new AndroidRuntimeException(YU.a.d(i, "Invalid parameter for TransitionSet ordering: "));
            }
            this.J = false;
        }
    }

    @Override // androidx.transition.Transition
    public final void b(View view) {
        for (int i = 0; i < this.I.size(); i++) {
            ((Transition) this.I.get(i)).b(view);
        }
        this.i.add(view);
    }

    @Override // androidx.transition.Transition
    public final void cancel() {
        super.cancel();
        Transition[] transitionArr = this.N;
        this.N = null;
        if (transitionArr == null) {
            transitionArr = new Transition[this.I.size()];
        }
        Transition[] transitionArr2 = (Transition[]) this.I.toArray(transitionArr);
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            transitionArr2[i].cancel();
        }
        Arrays.fill(transitionArr2, (Object) null);
        this.N = transitionArr2;
    }

    @Override // androidx.transition.Transition
    public final void d(TransitionValues transitionValues) {
        if (y(transitionValues.b)) {
            Iterator it = this.I.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.y(transitionValues.b)) {
                    transition.d(transitionValues);
                    transitionValues.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    public final void f(TransitionValues transitionValues) {
        super.f(transitionValues);
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.I.get(i)).f(transitionValues);
        }
    }

    @Override // androidx.transition.Transition
    public final void g(TransitionValues transitionValues) {
        if (y(transitionValues.b)) {
            Iterator it = this.I.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.y(transitionValues.b)) {
                    transition.g(transitionValues);
                    transitionValues.c.add(transition);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: j */
    public final Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.I = new ArrayList();
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            Transition transitionClone = ((Transition) this.I.get(i)).clone();
            transitionSet.I.add(transitionClone);
            transitionClone.l = transitionSet;
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    public final void m(ViewGroup viewGroup, TransitionValuesMaps transitionValuesMaps, TransitionValuesMaps transitionValuesMaps2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.e;
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) this.I.get(i);
            if (j > 0 && (this.J || i == 0)) {
                long j2 = transition.e;
                if (j2 > 0) {
                    transition.O(j2 + j);
                } else {
                    transition.O(j);
                }
            }
            transition.m(viewGroup, transitionValuesMaps, transitionValuesMaps2, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    public final boolean u() {
        for (int i = 0; i < this.I.size(); i++) {
            if (((Transition) this.I.get(i)).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.transition.Transition
    public final boolean v() {
        int size = this.I.size();
        for (int i = 0; i < size; i++) {
            if (!((Transition) this.I.get(i)).v()) {
                return false;
            }
        }
        return true;
    }

    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = new ArrayList();
        this.J = true;
        this.L = false;
        this.M = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Styleable.g);
        V(TypedArrayUtils.d(typedArrayObtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        typedArrayObtainStyledAttributes.recycle();
    }
}
