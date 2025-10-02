package com.airbnb.epoxy;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker;", "", "Companion", "DataObserver", "Listener", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class EpoxyVisibilityTracker {
    public RecyclerView f;
    public RecyclerView.Adapter g;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final a f13320a = new a(this);
    public final SparseArray b = new SparseArray();
    public final ArrayList c = new ArrayList();
    public final Listener d = new Listener();
    public final DataObserver e = new DataObserver();
    public final HashMap h = new HashMap();
    public final boolean j = true;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Companion;", "", "", "DEBUG_LOG", "Z", "", "TAG", "Ljava/lang/String;", "", "TAG_ID", "I", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$DataObserver;", "Landroidx/recyclerview/widget/RecyclerView$AdapterDataObserver;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class DataObserver extends RecyclerView.AdapterDataObserver {
        public DataObserver() {
        }

        public static boolean g(RecyclerView recyclerView) {
            return recyclerView == null || !(recyclerView.getAdapter() instanceof BaseEpoxyAdapter);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void a() {
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (g(epoxyVisibilityTracker.f)) {
                return;
            }
            epoxyVisibilityTracker.b.clear();
            epoxyVisibilityTracker.c.clear();
            epoxyVisibilityTracker.i = true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void d(int i, int i2) {
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (g(epoxyVisibilityTracker.f)) {
                return;
            }
            Iterator it = epoxyVisibilityTracker.c.iterator();
            while (it.hasNext()) {
                EpoxyVisibilityItem epoxyVisibilityItem = (EpoxyVisibilityItem) it.next();
                int i3 = epoxyVisibilityItem.b;
                if (i3 >= i) {
                    epoxyVisibilityTracker.i = true;
                    epoxyVisibilityItem.b = i3 + i2;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void e(int i, int i2) {
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (g(epoxyVisibilityTracker.f) || g(epoxyVisibilityTracker.f)) {
                return;
            }
            Iterator it = epoxyVisibilityTracker.c.iterator();
            while (it.hasNext()) {
                EpoxyVisibilityItem epoxyVisibilityItem = (EpoxyVisibilityItem) it.next();
                int i3 = epoxyVisibilityItem.b;
                if (i3 == i) {
                    epoxyVisibilityItem.b = (i2 - i) + i3;
                    epoxyVisibilityTracker.i = true;
                } else if (i < i2) {
                    if (i + 1 <= i3 && i3 <= i2) {
                        epoxyVisibilityItem.b = i3 - 1;
                        epoxyVisibilityTracker.i = true;
                    }
                } else if (i > i2 && i2 <= i3 && i3 < i) {
                    epoxyVisibilityItem.b = i3 + 1;
                    epoxyVisibilityTracker.i = true;
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void f(int i, int i2) {
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (g(epoxyVisibilityTracker.f)) {
                return;
            }
            Iterator it = epoxyVisibilityTracker.c.iterator();
            while (it.hasNext()) {
                EpoxyVisibilityItem epoxyVisibilityItem = (EpoxyVisibilityItem) it.next();
                int i3 = epoxyVisibilityItem.b;
                if (i3 >= i) {
                    epoxyVisibilityTracker.i = true;
                    epoxyVisibilityItem.b = i3 + (-i2);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/airbnb/epoxy/EpoxyVisibilityTracker$Listener;", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "Landroid/view/View$OnLayoutChangeListener;", "Landroidx/recyclerview/widget/RecyclerView$OnChildAttachStateChangeListener;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Listener extends RecyclerView.OnScrollListener implements View.OnLayoutChangeListener, RecyclerView.OnChildAttachStateChangeListener {
        public Listener() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void b(View child) {
            Intrinsics.h(child, "child");
            boolean z = child instanceof RecyclerView;
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (z) {
                epoxyVisibilityTracker.h.remove((RecyclerView) child);
            }
            if (!epoxyVisibilityTracker.i) {
                epoxyVisibilityTracker.d(child, true);
            } else {
                epoxyVisibilityTracker.c(child);
                epoxyVisibilityTracker.i = false;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void c(View child) {
            Intrinsics.h(child, "child");
            boolean z = child instanceof RecyclerView;
            EpoxyVisibilityTracker epoxyVisibilityTracker = EpoxyVisibilityTracker.this;
            if (z) {
                epoxyVisibilityTracker.f((RecyclerView) child);
            }
            epoxyVisibilityTracker.d(child, false);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void d(RecyclerView recyclerView, int i, int i2) {
            EpoxyVisibilityTracker.this.b(true);
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View recyclerView, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            Intrinsics.h(recyclerView, "recyclerView");
            EpoxyVisibilityTracker.this.b(true);
        }
    }

    public final void a(RecyclerView recyclerView) {
        Intrinsics.h(recyclerView, "recyclerView");
        this.f = recyclerView;
        Listener listener = this.d;
        recyclerView.k(listener);
        recyclerView.addOnLayoutChangeListener(listener);
        recyclerView.j(listener);
        recyclerView.setTag(com.woolworths.R.id.epoxy_visibility_tracker, this);
    }

    public final void b(boolean z) {
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        if (!z || itemAnimator == null) {
            c(null);
            return;
        }
        boolean zK = itemAnimator.k();
        a aVar = this.f13320a;
        if (zK) {
            itemAnimator.b.add(aVar);
        } else {
            aVar.a();
        }
        if (zK) {
            c(null);
        }
    }

    public final void c(View view) {
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter != null && !Intrinsics.c(this.g, adapter)) {
            RecyclerView.Adapter adapter2 = this.g;
            DataObserver dataObserver = this.e;
            if (adapter2 != null) {
                adapter2.F(dataObserver);
            }
            adapter.D(dataObserver);
            this.g = adapter;
        }
        if (view != null) {
            d(view, true);
        }
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null && childAt != view) {
                d(childAt, false);
            }
        }
    }

    public final void d(View view, boolean z) {
        RecyclerView recyclerView = this.f;
        if (recyclerView == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolderO = (view.getParent() == null || view.getParent() == recyclerView) ? recyclerView.O(view) : null;
        if (viewHolderO instanceof EpoxyViewHolder) {
            EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) viewHolderO;
            epoxyViewHolder.c();
            EpoxyHolder epoxyHolder = epoxyViewHolder.c;
            e(recyclerView, view, z, epoxyViewHolder);
            if (epoxyHolder instanceof ModelGroupHolder) {
                Iterator it = ((ModelGroupHolder) epoxyHolder).b.iterator();
                while (it.hasNext()) {
                    EpoxyViewHolder epoxyViewHolder2 = (EpoxyViewHolder) it.next();
                    View view2 = epoxyViewHolder2.itemView;
                    if (view2 instanceof RecyclerView) {
                        if (z) {
                            this.h.remove((RecyclerView) view2);
                        } else {
                            f((RecyclerView) view2);
                        }
                    }
                    View view3 = epoxyViewHolder2.itemView;
                    Intrinsics.g(view3, "groupChildHolder.itemView");
                    e(recyclerView, view3, z, epoxyViewHolder2);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(androidx.recyclerview.widget.RecyclerView r12, android.view.View r13, boolean r14, com.airbnb.epoxy.EpoxyViewHolder r15) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyVisibilityTracker.e(androidx.recyclerview.widget.RecyclerView, android.view.View, boolean, com.airbnb.epoxy.EpoxyViewHolder):void");
    }

    public final void f(RecyclerView recyclerView) {
        EpoxyVisibilityTracker epoxyVisibilityTracker = (EpoxyVisibilityTracker) recyclerView.getTag(com.woolworths.R.id.epoxy_visibility_tracker);
        if (epoxyVisibilityTracker == null) {
            epoxyVisibilityTracker = new EpoxyVisibilityTracker();
            epoxyVisibilityTracker.a(recyclerView);
        }
        this.h.put(recyclerView, epoxyVisibilityTracker);
    }
}
