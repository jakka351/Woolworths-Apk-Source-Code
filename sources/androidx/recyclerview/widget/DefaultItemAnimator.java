package androidx.recyclerview.widget;

import YU.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class DefaultItemAnimator extends SimpleItemAnimator {
    public static TimeInterpolator s;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;
    public final ArrayList q;
    public final ArrayList r;

    public static class ChangeInfo {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f3655a;
        public RecyclerView.ViewHolder b;
        public int c;
        public int d;
        public int e;
        public int f;

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeInfo{oldHolder=");
            sb.append(this.f3655a);
            sb.append(", newHolder=");
            sb.append(this.b);
            sb.append(", fromX=");
            sb.append(this.c);
            sb.append(", fromY=");
            sb.append(this.d);
            sb.append(", toX=");
            sb.append(this.e);
            sb.append(", toY=");
            return a.l(sb, this.f, '}');
        }
    }

    public static class MoveInfo {

        /* renamed from: a, reason: collision with root package name */
        public RecyclerView.ViewHolder f3656a;
        public int b;
        public int c;
        public int d;
        public int e;
    }

    public DefaultItemAnimator() {
        this.f3685a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = true;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.r = new ArrayList();
    }

    public static void s(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((RecyclerView.ViewHolder) arrayList.get(size)).itemView.animate().cancel();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean g(RecyclerView.ViewHolder viewHolder, List list) {
        return !list.isEmpty() || f(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void i(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((MoveInfo) arrayList.get(size)).f3656a == viewHolder) {
                view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                h(viewHolder);
                arrayList.remove(size);
            }
        }
        u(this.k, viewHolder);
        if (this.h.remove(viewHolder)) {
            view.setAlpha(1.0f);
            h(viewHolder);
        }
        if (this.i.remove(viewHolder)) {
            view.setAlpha(1.0f);
            q(viewHolder);
            h(viewHolder);
        }
        ArrayList arrayList2 = this.n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            u(arrayList3, viewHolder);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((MoveInfo) arrayList5.get(size4)).f3656a == viewHolder) {
                    view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    h(viewHolder);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(viewHolder)) {
                view.setAlpha(1.0f);
                q(viewHolder);
                h(viewHolder);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.q.remove(viewHolder);
        this.o.remove(viewHolder);
        this.r.remove(viewHolder);
        this.p.remove(viewHolder);
        t();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void j() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            MoveInfo moveInfo = (MoveInfo) arrayList.get(size);
            View view = moveInfo.f3656a.itemView;
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            view.setTranslationX(BitmapDescriptorFactory.HUE_RED);
            h(moveInfo.f3656a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            h((RecyclerView.ViewHolder) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) arrayList3.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            q(viewHolder);
            h(viewHolder);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList4.get(size4);
            RecyclerView.ViewHolder viewHolder2 = changeInfo.f3655a;
            if (viewHolder2 != null) {
                v(changeInfo, viewHolder2);
            }
            RecyclerView.ViewHolder viewHolder3 = changeInfo.b;
            if (viewHolder3 != null) {
                v(changeInfo, viewHolder3);
            }
        }
        arrayList4.clear();
        if (k()) {
            ArrayList arrayList5 = this.m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    MoveInfo moveInfo2 = (MoveInfo) arrayList6.get(size6);
                    View view2 = moveInfo2.f3656a.itemView;
                    view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    view2.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                    h(moveInfo2.f3656a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) arrayList8.get(size8);
                    viewHolder4.itemView.setAlpha(1.0f);
                    q(viewHolder4);
                    h(viewHolder4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    ChangeInfo changeInfo2 = (ChangeInfo) arrayList10.get(size10);
                    RecyclerView.ViewHolder viewHolder5 = changeInfo2.f3655a;
                    if (viewHolder5 != null) {
                        v(changeInfo2, viewHolder5);
                    }
                    RecyclerView.ViewHolder viewHolder6 = changeInfo2.b;
                    if (viewHolder6 != null) {
                        v(changeInfo2, viewHolder6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            s(this.q);
            s(this.p);
            s(this.o);
            s(this.r);
            ArrayList arrayList11 = this.b;
            int size11 = arrayList11.size();
            for (int i = 0; i < size11; i++) {
                ((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) arrayList11.get(i)).a();
            }
            arrayList11.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final boolean k() {
        return (this.i.isEmpty() && this.k.isEmpty() && this.j.isEmpty() && this.h.isEmpty() && this.p.isEmpty() && this.q.isEmpty() && this.o.isEmpty() && this.r.isEmpty() && this.m.isEmpty() && this.l.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public final void l() {
        long j = this.d;
        ArrayList arrayList = this.h;
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.j;
        boolean zIsEmpty2 = arrayList2.isEmpty();
        ArrayList arrayList3 = this.k;
        boolean zIsEmpty3 = arrayList3.isEmpty();
        ArrayList arrayList4 = this.i;
        boolean zIsEmpty4 = arrayList4.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            final RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) it.next();
            final View view = viewHolder.itemView;
            final ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
            this.q.add(viewHolder);
            viewPropertyAnimatorAnimate.setDuration(j).alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.4
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    viewPropertyAnimatorAnimate.setListener(null);
                    view.setAlpha(1.0f);
                    DefaultItemAnimator defaultItemAnimator = this;
                    RecyclerView.ViewHolder viewHolder2 = viewHolder;
                    defaultItemAnimator.h(viewHolder2);
                    defaultItemAnimator.q.remove(viewHolder2);
                    defaultItemAnimator.t();
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    this.r(viewHolder);
                }
            }).start();
            arrayList = arrayList;
        }
        arrayList.clear();
        if (!zIsEmpty2) {
            final ArrayList arrayList5 = new ArrayList();
            arrayList5.addAll(arrayList2);
            this.m.add(arrayList5);
            arrayList2.clear();
            Runnable runnable = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.1
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList6 = arrayList5;
                    Iterator it2 = arrayList6.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                        if (!zHasNext) {
                            arrayList6.clear();
                            defaultItemAnimator.m.remove(arrayList6);
                            return;
                        }
                        MoveInfo moveInfo = (MoveInfo) it2.next();
                        final RecyclerView.ViewHolder viewHolder2 = moveInfo.f3656a;
                        int i = moveInfo.b;
                        int i2 = moveInfo.c;
                        int i3 = moveInfo.d;
                        int i4 = moveInfo.e;
                        defaultItemAnimator.getClass();
                        final View view2 = viewHolder2.itemView;
                        final int i5 = i3 - i;
                        final int i6 = i4 - i2;
                        if (i5 != 0) {
                            view2.animate().translationX(BitmapDescriptorFactory.HUE_RED);
                        }
                        if (i6 != 0) {
                            view2.animate().translationY(BitmapDescriptorFactory.HUE_RED);
                        }
                        final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view2.animate();
                        defaultItemAnimator.p.add(viewHolder2);
                        viewPropertyAnimatorAnimate2.setDuration(defaultItemAnimator.e).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.6
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationCancel(Animator animator) {
                                int i7 = i5;
                                View view3 = view2;
                                if (i7 != 0) {
                                    view3.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                                }
                                if (i6 != 0) {
                                    view3.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                }
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationEnd(Animator animator) {
                                viewPropertyAnimatorAnimate2.setListener(null);
                                DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                                defaultItemAnimator2.h(viewHolder3);
                                defaultItemAnimator2.p.remove(viewHolder3);
                                defaultItemAnimator2.t();
                            }

                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public final void onAnimationStart(Animator animator) {
                                DefaultItemAnimator.this.getClass();
                            }
                        }).start();
                    }
                }
            };
            if (zIsEmpty) {
                runnable.run();
            } else {
                View view2 = ((MoveInfo) arrayList5.get(0)).f3656a.itemView;
                WeakHashMap weakHashMap = ViewCompat.f2488a;
                view2.postOnAnimationDelayed(runnable, j);
            }
        }
        if (!zIsEmpty3) {
            final ArrayList arrayList6 = new ArrayList();
            arrayList6.addAll(arrayList3);
            this.n.add(arrayList6);
            arrayList3.clear();
            Runnable runnable2 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.2
                @Override // java.lang.Runnable
                public final void run() {
                    ArrayList arrayList7 = arrayList6;
                    Iterator it2 = arrayList7.iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                        if (!zHasNext) {
                            arrayList7.clear();
                            defaultItemAnimator.n.remove(arrayList7);
                            return;
                        }
                        final ChangeInfo changeInfo = (ChangeInfo) it2.next();
                        ArrayList arrayList8 = defaultItemAnimator.r;
                        long j2 = defaultItemAnimator.f;
                        RecyclerView.ViewHolder viewHolder2 = changeInfo.f3655a;
                        final View view3 = viewHolder2 == null ? null : viewHolder2.itemView;
                        RecyclerView.ViewHolder viewHolder3 = changeInfo.b;
                        final View view4 = viewHolder3 != null ? viewHolder3.itemView : null;
                        if (view3 != null) {
                            final ViewPropertyAnimator duration = view3.animate().setDuration(j2);
                            arrayList8.add(changeInfo.f3655a);
                            duration.translationX(changeInfo.e - changeInfo.c);
                            duration.translationY(changeInfo.f - changeInfo.d);
                            duration.alpha(BitmapDescriptorFactory.HUE_RED).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.7
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    duration.setListener(null);
                                    View view5 = view3;
                                    view5.setAlpha(1.0f);
                                    view5.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                                    view5.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                    ChangeInfo changeInfo2 = changeInfo;
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo2.f3655a;
                                    DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                    defaultItemAnimator2.h(viewHolder4);
                                    defaultItemAnimator2.r.remove(changeInfo2.f3655a);
                                    defaultItemAnimator2.t();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo.f3655a;
                                    DefaultItemAnimator.this.getClass();
                                }
                            }).start();
                        }
                        if (view4 != null) {
                            final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view4.animate();
                            arrayList8.add(changeInfo.b);
                            viewPropertyAnimatorAnimate2.translationX(BitmapDescriptorFactory.HUE_RED).translationY(BitmapDescriptorFactory.HUE_RED).setDuration(j2).alpha(1.0f).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.8
                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationEnd(Animator animator) {
                                    viewPropertyAnimatorAnimate2.setListener(null);
                                    View view5 = view4;
                                    view5.setAlpha(1.0f);
                                    view5.setTranslationX(BitmapDescriptorFactory.HUE_RED);
                                    view5.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                                    ChangeInfo changeInfo2 = changeInfo;
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo2.b;
                                    DefaultItemAnimator defaultItemAnimator2 = DefaultItemAnimator.this;
                                    defaultItemAnimator2.h(viewHolder4);
                                    defaultItemAnimator2.r.remove(changeInfo2.b);
                                    defaultItemAnimator2.t();
                                }

                                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                                public final void onAnimationStart(Animator animator) {
                                    RecyclerView.ViewHolder viewHolder4 = changeInfo.b;
                                    DefaultItemAnimator.this.getClass();
                                }
                            }).start();
                        }
                    }
                }
            };
            if (zIsEmpty) {
                runnable2.run();
            } else {
                View view3 = ((ChangeInfo) arrayList6.get(0)).f3655a.itemView;
                WeakHashMap weakHashMap2 = ViewCompat.f2488a;
                view3.postOnAnimationDelayed(runnable2, j);
            }
        }
        if (zIsEmpty4) {
            return;
        }
        final ArrayList arrayList7 = new ArrayList();
        arrayList7.addAll(arrayList4);
        this.l.add(arrayList7);
        arrayList4.clear();
        Runnable runnable3 = new Runnable() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.3
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList8 = arrayList7;
                Iterator it2 = arrayList8.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    final DefaultItemAnimator defaultItemAnimator = DefaultItemAnimator.this;
                    if (!zHasNext) {
                        arrayList8.clear();
                        defaultItemAnimator.l.remove(arrayList8);
                        return;
                    }
                    final RecyclerView.ViewHolder viewHolder2 = (RecyclerView.ViewHolder) it2.next();
                    defaultItemAnimator.getClass();
                    final View view4 = viewHolder2.itemView;
                    final ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view4.animate();
                    defaultItemAnimator.o.add(viewHolder2);
                    viewPropertyAnimatorAnimate2.alpha(1.0f).setDuration(defaultItemAnimator.c).setListener(new AnimatorListenerAdapter() { // from class: androidx.recyclerview.widget.DefaultItemAnimator.5
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                            view4.setAlpha(1.0f);
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            viewPropertyAnimatorAnimate2.setListener(null);
                            DefaultItemAnimator defaultItemAnimator2 = defaultItemAnimator;
                            RecyclerView.ViewHolder viewHolder3 = viewHolder2;
                            defaultItemAnimator2.q(viewHolder3);
                            defaultItemAnimator2.h(viewHolder3);
                            defaultItemAnimator2.o.remove(viewHolder3);
                            defaultItemAnimator2.t();
                        }

                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            defaultItemAnimator.getClass();
                        }
                    }).start();
                }
            }
        };
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnable3.run();
            return;
        }
        if (zIsEmpty) {
            j = 0;
        }
        long jMax = Math.max(!zIsEmpty2 ? this.e : 0L, zIsEmpty3 ? 0L : this.f) + j;
        View view4 = ((RecyclerView.ViewHolder) arrayList7.get(0)).itemView;
        WeakHashMap weakHashMap3 = ViewCompat.f2488a;
        view4.postOnAnimationDelayed(runnable3, jMax);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public void m(RecyclerView.ViewHolder viewHolder) {
        w(viewHolder);
        viewHolder.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.i.add(viewHolder);
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean n(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return o(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        w(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            w(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i5);
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        ChangeInfo changeInfo = new ChangeInfo();
        changeInfo.f3655a = viewHolder;
        changeInfo.b = viewHolder2;
        changeInfo.c = i;
        changeInfo.d = i2;
        changeInfo.e = i3;
        changeInfo.f = i4;
        this.k.add(changeInfo);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public final boolean o(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        w(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            h(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        MoveInfo moveInfo = new MoveInfo();
        moveInfo.f3656a = viewHolder;
        moveInfo.b = translationX;
        moveInfo.c = translationY;
        moveInfo.d = i3;
        moveInfo.e = i4;
        this.j.add(moveInfo);
        return true;
    }

    @Override // androidx.recyclerview.widget.SimpleItemAnimator
    public void p(RecyclerView.ViewHolder viewHolder) {
        w(viewHolder);
        this.h.add(viewHolder);
    }

    public final void t() {
        if (k()) {
            return;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((RecyclerView.ItemAnimator.ItemAnimatorFinishedListener) arrayList.get(i)).a();
        }
        arrayList.clear();
    }

    public final void u(ArrayList arrayList, RecyclerView.ViewHolder viewHolder) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = (ChangeInfo) arrayList.get(size);
            if (v(changeInfo, viewHolder) && changeInfo.f3655a == null && changeInfo.b == null) {
                arrayList.remove(changeInfo);
            }
        }
    }

    public final boolean v(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        if (changeInfo.b == viewHolder) {
            changeInfo.b = null;
        } else {
            if (changeInfo.f3655a != viewHolder) {
                return false;
            }
            changeInfo.f3655a = null;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(BitmapDescriptorFactory.HUE_RED);
        viewHolder.itemView.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        h(viewHolder);
        return true;
    }

    public final void w(RecyclerView.ViewHolder viewHolder) {
        if (s == null) {
            s = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(s);
        i(viewHolder);
    }
}
