package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.RequiresOptIn;
import androidx.camera.core.impl.b;
import androidx.collection.ArraySet;
import androidx.collection.IndexBasedArrayIterator;
import androidx.collection.LongSparseArray;
import androidx.core.util.Preconditions;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<FragmentViewHolder> implements StatefulAdapter {
    public final Lifecycle g;
    public final FragmentManager h;
    public final LongSparseArray i;
    public final LongSparseArray j;
    public final LongSparseArray k;
    public FragmentMaxLifecycleEnforcer l;
    public final FragmentEventDispatcher m;
    public boolean n;
    public boolean o;

    public static abstract class DataSetChangeObserver extends RecyclerView.AdapterDataObserver {
        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void b(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void c(int i, int i2, Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            a();
        }
    }

    @RequiresOptIn
    public @interface ExperimentalFragmentStateAdapterApi {
    }

    public static class FragmentEventDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public CopyOnWriteArrayList f3824a;

        public static void b(List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((FragmentTransactionCallback.OnPostEventListener) it.next()).getClass();
            }
        }

        public final ArrayList a() {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f3824a.iterator();
            while (it.hasNext()) {
                ((FragmentTransactionCallback) it.next()).getClass();
                arrayList.add(FragmentTransactionCallback.f3828a);
            }
            return arrayList;
        }
    }

    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a, reason: collision with root package name */
        public ViewPager2.OnPageChangeCallback f3825a;
        public RecyclerView.AdapterDataObserver b;
        public LifecycleEventObserver c;
        public ViewPager2 d;
        public long e = -1;

        public FragmentMaxLifecycleEnforcer() {
        }

        public static ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public final void b(boolean z) {
            int currentItem;
            Fragment fragment2;
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            FragmentEventDispatcher fragmentEventDispatcher = fragmentStateAdapter.m;
            LongSparseArray longSparseArray = fragmentStateAdapter.i;
            FragmentManager fragmentManager = fragmentStateAdapter.h;
            if (fragmentManager.U() || this.d.getScrollState() != 0 || longSparseArray.f() || fragmentStateAdapter.i() == 0 || (currentItem = this.d.getCurrentItem()) >= fragmentStateAdapter.i()) {
                return;
            }
            long j = fragmentStateAdapter.j(currentItem);
            if ((j != this.e || z) && (fragment2 = (Fragment) longSparseArray.c(j)) != null && fragment2.isAdded()) {
                this.e = j;
                FragmentTransaction fragmentTransactionE = fragmentManager.e();
                ArrayList arrayList = new ArrayList();
                Fragment fragment3 = null;
                for (int i = 0; i < longSparseArray.j(); i++) {
                    long jG = longSparseArray.g(i);
                    Fragment fragment4 = (Fragment) longSparseArray.k(i);
                    if (fragment4.isAdded()) {
                        if (jG != this.e) {
                            fragmentTransactionE.l(fragment4, Lifecycle.State.g);
                            arrayList.add(fragmentEventDispatcher.a());
                        } else {
                            fragment3 = fragment4;
                        }
                        fragment4.setMenuVisibility(jG == this.e);
                    }
                }
                if (fragment3 != null) {
                    fragmentTransactionE.l(fragment3, Lifecycle.State.h);
                    arrayList.add(fragmentEventDispatcher.a());
                }
                if (fragmentTransactionE.h()) {
                    return;
                }
                fragmentTransactionE.f();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    List list = (List) it.next();
                    fragmentEventDispatcher.getClass();
                    FragmentEventDispatcher.b(list);
                }
            }
        }
    }

    public static abstract class FragmentTransactionCallback {

        /* renamed from: a, reason: collision with root package name */
        public static final OnPostEventListener f3828a = new AnonymousClass1();

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentTransactionCallback$1, reason: invalid class name */
        public class AnonymousClass1 implements OnPostEventListener {
        }

        public interface OnPostEventListener {
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getD());
    }

    public static void G(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void A(RecyclerView.ViewHolder viewHolder) {
        L((FragmentViewHolder) viewHolder);
        J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void C(RecyclerView.ViewHolder viewHolder) {
        Long lK = K(((FrameLayout) ((FragmentViewHolder) viewHolder).itemView).getId());
        if (lK != null) {
            M(lK.longValue());
            this.k.i(lK.longValue());
        }
    }

    public boolean H(long j) {
        return j >= 0 && j < ((long) i());
    }

    public abstract Fragment I(int i);

    public final void J() {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        Fragment fragment2;
        View view;
        if (!this.o || this.h.U()) {
            return;
        }
        ArraySet arraySet = new ArraySet(0);
        int i = 0;
        while (true) {
            longSparseArray = this.i;
            int iJ = longSparseArray.j();
            longSparseArray2 = this.k;
            if (i >= iJ) {
                break;
            }
            long jG = longSparseArray.g(i);
            if (!H(jG)) {
                arraySet.add(Long.valueOf(jG));
                longSparseArray2.i(jG);
            }
            i++;
        }
        if (!this.n) {
            this.o = false;
            for (int i2 = 0; i2 < longSparseArray.j(); i2++) {
                long jG2 = longSparseArray.g(i2);
                if (longSparseArray2.e(jG2) < 0 && ((fragment2 = (Fragment) longSparseArray.c(jG2)) == null || (view = fragment2.getView()) == null || view.getParent() == null)) {
                    arraySet.add(Long.valueOf(jG2));
                }
            }
        }
        Iterator it = arraySet.iterator();
        while (true) {
            IndexBasedArrayIterator indexBasedArrayIterator = (IndexBasedArrayIterator) it;
            if (!indexBasedArrayIterator.hasNext()) {
                return;
            } else {
                M(((Long) indexBasedArrayIterator.next()).longValue());
            }
        }
    }

    public final Long K(int i) {
        Long lValueOf = null;
        int i2 = 0;
        while (true) {
            LongSparseArray longSparseArray = this.k;
            if (i2 >= longSparseArray.j()) {
                return lValueOf;
            }
            if (((Integer) longSparseArray.k(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(longSparseArray.g(i2));
            }
            i2++;
        }
    }

    public final void L(final FragmentViewHolder fragmentViewHolder) {
        final Fragment fragment2 = (Fragment) this.i.c(fragmentViewHolder.getItemId());
        if (fragment2 == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        final FrameLayout frameLayout = (FrameLayout) fragmentViewHolder.itemView;
        View view = fragment2.getView();
        if (!fragment2.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zIsAdded = fragment2.isAdded();
        FragmentManager fragmentManager = this.h;
        if (zIsAdded && view == null) {
            fragmentManager.e0(new FragmentManager.FragmentLifecycleCallbacks(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
                @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
                public final void e(FragmentManager fragmentManager2, Fragment fragment3, View view2) {
                    if (fragment3 == fragment2) {
                        fragmentManager2.u0(this);
                        FragmentStateAdapter.G(view2, frameLayout);
                    }
                }
            }, false);
            return;
        }
        if (fragment2.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                G(view, frameLayout);
                return;
            }
            return;
        }
        if (fragment2.isAdded()) {
            G(view, frameLayout);
            return;
        }
        if (fragmentManager.U()) {
            if (fragmentManager.K) {
                return;
            }
            this.g.a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                    if (fragmentStateAdapter.h.U()) {
                        return;
                    }
                    lifecycleOwner.getD().c(this);
                    FragmentViewHolder fragmentViewHolder2 = fragmentViewHolder;
                    if (((FrameLayout) fragmentViewHolder2.itemView).isAttachedToWindow()) {
                        fragmentStateAdapter.L(fragmentViewHolder2);
                    }
                }
            });
            return;
        }
        fragmentManager.e0(new FragmentManager.FragmentLifecycleCallbacks(this) { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.2
            @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
            public final void e(FragmentManager fragmentManager2, Fragment fragment3, View view2) {
                if (fragment3 == fragment2) {
                    fragmentManager2.u0(this);
                    FragmentStateAdapter.G(view2, frameLayout);
                }
            }
        }, false);
        FragmentEventDispatcher fragmentEventDispatcher = this.m;
        fragmentEventDispatcher.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = fragmentEventDispatcher.f3824a.iterator();
        while (it.hasNext()) {
            ((FragmentTransactionCallback) it.next()).getClass();
            arrayList.add(FragmentTransactionCallback.f3828a);
        }
        try {
            fragment2.setMenuVisibility(false);
            FragmentTransaction fragmentTransactionE = fragmentManager.e();
            fragmentTransactionE.g(0, fragment2, "f" + fragmentViewHolder.getItemId(), 1);
            fragmentTransactionE.l(fragment2, Lifecycle.State.g);
            fragmentTransactionE.f();
            this.l.b(false);
        } finally {
            FragmentEventDispatcher.b(arrayList);
        }
    }

    public final void M(long j) {
        ViewParent parent;
        LongSparseArray longSparseArray = this.i;
        Fragment fragment2 = (Fragment) longSparseArray.c(j);
        if (fragment2 == null) {
            return;
        }
        if (fragment2.getView() != null && (parent = fragment2.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zH = H(j);
        LongSparseArray longSparseArray2 = this.j;
        if (!zH) {
            longSparseArray2.i(j);
        }
        if (!fragment2.isAdded()) {
            longSparseArray.i(j);
            return;
        }
        FragmentManager fragmentManager = this.h;
        if (fragmentManager.U()) {
            this.o = true;
            return;
        }
        boolean zIsAdded = fragment2.isAdded();
        FragmentTransactionCallback.OnPostEventListener onPostEventListener = FragmentTransactionCallback.f3828a;
        FragmentEventDispatcher fragmentEventDispatcher = this.m;
        if (zIsAdded && H(j)) {
            fragmentEventDispatcher.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = fragmentEventDispatcher.f3824a.iterator();
            while (it.hasNext()) {
                ((FragmentTransactionCallback) it.next()).getClass();
                arrayList.add(onPostEventListener);
            }
            Fragment.SavedState savedStateL0 = fragmentManager.l0(fragment2);
            FragmentEventDispatcher.b(arrayList);
            longSparseArray2.h(j, savedStateL0);
        }
        fragmentEventDispatcher.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = fragmentEventDispatcher.f3824a.iterator();
        while (it2.hasNext()) {
            ((FragmentTransactionCallback) it2.next()).getClass();
            arrayList2.add(onPostEventListener);
        }
        try {
            FragmentTransaction fragmentTransactionE = fragmentManager.e();
            fragmentTransactionE.i(fragment2);
            fragmentTransactionE.f();
            longSparseArray.i(j);
        } finally {
            FragmentEventDispatcher.b(arrayList2);
        }
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final Bundle a() {
        LongSparseArray longSparseArray = this.i;
        int iJ = longSparseArray.j();
        LongSparseArray longSparseArray2 = this.j;
        Bundle bundle = new Bundle(longSparseArray2.j() + iJ);
        for (int i = 0; i < longSparseArray.j(); i++) {
            long jG = longSparseArray.g(i);
            Fragment fragment2 = (Fragment) longSparseArray.c(jG);
            if (fragment2 != null && fragment2.isAdded()) {
                this.h.d0(bundle, fragment2, b.k(jG, "f#"));
            }
        }
        for (int i2 = 0; i2 < longSparseArray2.j(); i2++) {
            long jG2 = longSparseArray2.g(i2);
            if (H(jG2)) {
                bundle.putParcelable(b.k(jG2, "s#"), (Parcelable) longSparseArray2.c(jG2));
            }
        }
        return bundle;
    }

    @Override // androidx.viewpager2.adapter.StatefulAdapter
    public final void d(Parcelable parcelable) throws NumberFormatException {
        LongSparseArray longSparseArray = this.j;
        if (longSparseArray.f()) {
            LongSparseArray longSparseArray2 = this.i;
            if (longSparseArray2.f()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                for (String str : bundle.keySet()) {
                    if (str.startsWith("f#") && str.length() > 2) {
                        longSparseArray2.h(Long.parseLong(str.substring(2)), this.h.K(bundle, str));
                    } else {
                        if (!str.startsWith("s#") || str.length() <= 2) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(str));
                        }
                        long j = Long.parseLong(str.substring(2));
                        Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                        if (H(j)) {
                            longSparseArray.h(j, savedState);
                        }
                    }
                }
                if (longSparseArray2.f()) {
                    return;
                }
                this.o = true;
                this.n = true;
                J();
                final Handler handler = new Handler(Looper.getMainLooper());
                final Runnable runnable = new Runnable() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
                        fragmentStateAdapter.n = false;
                        fragmentStateAdapter.J();
                    }
                };
                this.g.a(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            handler.removeCallbacks(runnable);
                            lifecycleOwner.getD().c(this);
                        }
                    }
                });
                handler.postDelayed(runnable, 10000L);
                return;
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long j(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void u(RecyclerView recyclerView) {
        Preconditions.b(this.l == null);
        final FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.l = fragmentMaxLifecycleEnforcer;
        ViewPager2 viewPager2A = FragmentMaxLifecycleEnforcer.a(recyclerView);
        fragmentMaxLifecycleEnforcer.d = viewPager2A;
        ViewPager2.OnPageChangeCallback onPageChangeCallback = new ViewPager2.OnPageChangeCallback() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.1
            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void a(int i) {
                FragmentMaxLifecycleEnforcer.this.b(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public final void c(int i) {
                FragmentMaxLifecycleEnforcer.this.b(false);
            }
        };
        fragmentMaxLifecycleEnforcer.f3825a = onPageChangeCallback;
        viewPager2A.c(onPageChangeCallback);
        DataSetChangeObserver dataSetChangeObserver = new DataSetChangeObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.2
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.DataSetChangeObserver, androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public final void a() {
                FragmentMaxLifecycleEnforcer.this.b(true);
            }
        };
        fragmentMaxLifecycleEnforcer.b = dataSetChangeObserver;
        D(dataSetChangeObserver);
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                FragmentMaxLifecycleEnforcer.this.b(false);
            }
        };
        fragmentMaxLifecycleEnforcer.c = lifecycleEventObserver;
        this.g.a(lifecycleEventObserver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void v(RecyclerView.ViewHolder viewHolder, int i) {
        FragmentViewHolder fragmentViewHolder = (FragmentViewHolder) viewHolder;
        long itemId = fragmentViewHolder.getItemId();
        int id = ((FrameLayout) fragmentViewHolder.itemView).getId();
        Long lK = K(id);
        LongSparseArray longSparseArray = this.k;
        if (lK != null && lK.longValue() != itemId) {
            M(lK.longValue());
            longSparseArray.i(lK.longValue());
        }
        longSparseArray.h(itemId, Integer.valueOf(id));
        long j = j(i);
        LongSparseArray longSparseArray2 = this.i;
        if (longSparseArray2.e(j) < 0) {
            Fragment fragmentI = I(i);
            fragmentI.setInitialSavedState((Fragment.SavedState) this.j.c(j));
            longSparseArray2.h(j, fragmentI);
        }
        if (((FrameLayout) fragmentViewHolder.itemView).isAttachedToWindow()) {
            L(fragmentViewHolder);
        }
        J();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder x(ViewGroup viewGroup, int i) {
        int i2 = FragmentViewHolder.f3829a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new FragmentViewHolder(frameLayout);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void y(RecyclerView recyclerView) {
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = this.l;
        fragmentMaxLifecycleEnforcer.getClass();
        FragmentMaxLifecycleEnforcer.a(recyclerView).g(fragmentMaxLifecycleEnforcer.f3825a);
        FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
        fragmentStateAdapter.F(fragmentMaxLifecycleEnforcer.b);
        fragmentStateAdapter.g.c(fragmentMaxLifecycleEnforcer.c);
        fragmentMaxLifecycleEnforcer.d = null;
        this.l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean z(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    public FragmentStateAdapter(Fragment fragment2) {
        this(fragment2.getChildFragmentManager(), fragment2.getD());
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.i = new LongSparseArray((Object) null);
        this.j = new LongSparseArray((Object) null);
        this.k = new LongSparseArray((Object) null);
        FragmentEventDispatcher fragmentEventDispatcher = new FragmentEventDispatcher();
        fragmentEventDispatcher.f3824a = new CopyOnWriteArrayList();
        this.m = fragmentEventDispatcher;
        this.n = false;
        this.o = false;
        this.h = fragmentManager;
        this.g = lifecycle;
        E(true);
    }
}
