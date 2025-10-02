package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/airbnb/epoxy/ModelGroupHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "Companion", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ModelGroupHolder extends EpoxyHolder {
    public static final HelperAdapter h = new HelperAdapter();

    /* renamed from: a, reason: collision with root package name */
    public final ViewParent f13323a;
    public final ArrayList b;
    public final RecyclerView.RecycledViewPool c;
    public ViewGroup d;
    public ViewGroup e;
    public Object f;
    public EpoxyModelGroup g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/airbnb/epoxy/ModelGroupHolder$Companion;", "", "Lcom/airbnb/epoxy/HelperAdapter;", "HELPER_ADAPTER", "Lcom/airbnb/epoxy/HelperAdapter;", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static RecyclerView.RecycledViewPool a(ViewParent viewParent) {
            RecyclerView.RecycledViewPool recycledViewPool = null;
            while (recycledViewPool == null) {
                if (viewParent instanceof RecyclerView) {
                    recycledViewPool = ((RecyclerView) viewParent).getRecycledViewPool();
                } else {
                    ViewParent parent = viewParent.getParent();
                    recycledViewPool = parent != null ? a(parent) : new LocalGroupRecycledViewPool();
                }
            }
            return recycledViewPool;
        }
    }

    public ModelGroupHolder(ViewParent modelGroupParent) {
        Intrinsics.h(modelGroupParent, "modelGroupParent");
        this.f13323a = modelGroupParent;
        this.b = new ArrayList(4);
        this.c = Companion.a(modelGroupParent);
    }

    public static void b(ViewGroup viewGroup, ArrayList arrayList) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                b((ViewGroup) childAt, arrayList);
            } else if (childAt instanceof ViewStub) {
                arrayList.add(new ViewStubData(viewGroup, (ViewStub) childAt, i));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.epoxy.EpoxyHolder
    public final void a(View itemView) {
        EmptyList emptyList;
        Intrinsics.h(itemView, "itemView");
        if (!(itemView instanceof ViewGroup)) {
            throw new IllegalStateException("The layout provided to EpoxyModelGroup must be a ViewGroup");
        }
        ViewGroup viewGroup = (ViewGroup) itemView;
        this.d = viewGroup;
        View viewFindViewById = viewGroup.findViewById(com.woolworths.R.id.epoxy_model_group_child_container);
        ViewGroup viewGroup2 = viewFindViewById instanceof ViewGroup ? (ViewGroup) viewFindViewById : null;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        }
        this.e = viewGroup;
        if (viewGroup.getChildCount() != 0) {
            ViewGroup viewGroup3 = this.e;
            if (viewGroup3 == null) {
                Intrinsics.p("childContainer");
                throw null;
            }
            ArrayList arrayList = new ArrayList(4);
            b(viewGroup3, arrayList);
            boolean zIsEmpty = arrayList.isEmpty();
            emptyList = arrayList;
            if (zIsEmpty) {
                throw new IllegalStateException("No view stubs found. If viewgroup is not empty it must contain ViewStubs.");
            }
        } else {
            emptyList = EmptyList.d;
        }
        this.f = emptyList;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.List] */
    public final void c(int i) {
        Object obj = this.f;
        if (obj == null) {
            Intrinsics.p("stubs");
            throw null;
        }
        if (((Collection) obj).isEmpty()) {
            ViewGroup viewGroup = this.e;
            if (viewGroup == null) {
                Intrinsics.p("childContainer");
                throw null;
            }
            viewGroup.removeViewAt(i);
        } else {
            ?? r0 = this.f;
            if (r0 == 0) {
                Intrinsics.p("stubs");
                throw null;
            }
            ViewStubData viewStubData = (ViewStubData) r0.get(i);
            viewStubData.a();
            viewStubData.f13325a.addView(viewStubData.b, viewStubData.c);
        }
        Object objRemove = this.b.remove(i);
        Intrinsics.g(objRemove, "viewHolders.removeAt(modelPosition)");
        EpoxyViewHolder epoxyViewHolder = (EpoxyViewHolder) objRemove;
        epoxyViewHolder.c();
        epoxyViewHolder.f13318a.A(epoxyViewHolder.e());
        epoxyViewHolder.f13318a = null;
        this.c.d(epoxyViewHolder);
    }
}
