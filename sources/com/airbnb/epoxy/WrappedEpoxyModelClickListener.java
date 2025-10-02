package com.airbnb.epoxy;

import android.view.View;
import android.view.ViewGroup;
import com.airbnb.epoxy.EpoxyModel;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u0001*\u0004\b\u0001\u0010\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener;", "Lcom/airbnb/epoxy/EpoxyModel;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "V", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnLongClickListener;", "ClickedModelInfo", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WrappedEpoxyModelClickListener<T extends EpoxyModel<?>, V> implements View.OnClickListener, View.OnLongClickListener {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/airbnb/epoxy/WrappedEpoxyModelClickListener$ClickedModelInfo;", "", "epoxy-adapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ClickedModelInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Object f13327a;

        public ClickedModelInfo(int i, EpoxyModel model, Object obj) {
            Intrinsics.h(model, "model");
            this.f13327a = obj;
        }
    }

    public final Sequence a(View view) {
        if (!(view instanceof ViewGroup)) {
            return ArraysKt.g(new View[]{view});
        }
        final ViewGroup viewGroup = (ViewGroup) view;
        return SequencesKt.u(SequencesKt.j(new Sequence<View>(this) { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$children$1
            @Override // kotlin.sequences.Sequence
            /* renamed from: iterator */
            public final Iterator getF24664a() {
                ViewGroup viewGroup2 = viewGroup;
                Intrinsics.h(viewGroup2, "<this>");
                return new WrappedEpoxyModelClickListener$iterator$1(viewGroup2);
            }
        }, new Function1<View, Sequence<? extends View>>() { // from class: com.airbnb.epoxy.WrappedEpoxyModelClickListener$allViewsInHierarchy$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                View it = (View) obj;
                Intrinsics.h(it, "it");
                return SequencesKt.v(ArraysKt.g(new View[]{it}), it instanceof ViewGroup ? this.h.a(it) : EmptySequence.f24658a);
            }
        }), view);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.airbnb.epoxy.WrappedEpoxyModelClickListener.ClickedModelInfo b(android.view.View r8) {
        /*
            r7 = this;
            androidx.recyclerview.widget.RecyclerView r0 = com.airbnb.epoxy.ListenersUtils.a(r8)
            r1 = 0
            if (r0 != 0) goto L8
            goto L1b
        L8:
            android.view.View r2 = r0.F(r8)
            if (r2 != 0) goto L10
            r0 = r1
            goto L14
        L10:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r0.O(r2)
        L14:
            if (r0 != 0) goto L17
            goto L1b
        L17:
            boolean r2 = r0 instanceof com.airbnb.epoxy.EpoxyViewHolder
            if (r2 != 0) goto L1d
        L1b:
            r0 = r1
            goto L1f
        L1d:
            com.airbnb.epoxy.EpoxyViewHolder r0 = (com.airbnb.epoxy.EpoxyViewHolder) r0
        L1f:
            if (r0 == 0) goto L7c
            int r2 = r0.getAdapterPosition()
            r3 = -1
            if (r2 != r3) goto L29
            return r1
        L29:
            java.lang.Object r3 = r0.e()
            java.lang.String r4 = "epoxyHolder.objectToBind()"
            kotlin.jvm.internal.Intrinsics.g(r3, r4)
            boolean r4 = r3 instanceof com.airbnb.epoxy.ModelGroupHolder
            if (r4 == 0) goto L63
            com.airbnb.epoxy.ModelGroupHolder r3 = (com.airbnb.epoxy.ModelGroupHolder) r3
            java.util.ArrayList r3 = r3.b
            java.util.Iterator r3 = r3.iterator()
        L3e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L5d
            java.lang.Object r4 = r3.next()
            r5 = r4
            com.airbnb.epoxy.EpoxyViewHolder r5 = (com.airbnb.epoxy.EpoxyViewHolder) r5
            android.view.View r5 = r5.itemView
            java.lang.String r6 = "it.itemView"
            kotlin.jvm.internal.Intrinsics.g(r5, r6)
            kotlin.sequences.Sequence r5 = r7.a(r5)
            boolean r5 = kotlin.sequences.SequencesKt.c(r5, r8)
            if (r5 == 0) goto L3e
            r1 = r4
        L5d:
            com.airbnb.epoxy.EpoxyViewHolder r1 = (com.airbnb.epoxy.EpoxyViewHolder) r1
            if (r1 != 0) goto L62
            goto L63
        L62:
            r0 = r1
        L63:
            com.airbnb.epoxy.WrappedEpoxyModelClickListener$ClickedModelInfo r8 = new com.airbnb.epoxy.WrappedEpoxyModelClickListener$ClickedModelInfo
            r0.c()
            com.airbnb.epoxy.EpoxyModel r1 = r0.f13318a
            java.lang.String r3 = "holderToUse.model"
            kotlin.jvm.internal.Intrinsics.g(r1, r3)
            java.lang.Object r0 = r0.e()
            java.lang.String r3 = "holderToUse.objectToBind()"
            kotlin.jvm.internal.Intrinsics.g(r0, r3)
            r8.<init>(r2, r1, r0)
            return r8
        L7c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not find RecyclerView holder for clicked view"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.WrappedEpoxyModelClickListener.b(android.view.View):com.airbnb.epoxy.WrappedEpoxyModelClickListener$ClickedModelInfo");
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof WrappedEpoxyModelClickListener);
    }

    public final int hashCode() {
        return 0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            Intrinsics.h(view, "view");
            if (b(view) != null) {
                throw new IllegalStateException("Original click listener is null");
            }
            Callback.h();
        } catch (Throwable th) {
            Callback.h();
            throw th;
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Intrinsics.h(view, "view");
        if (b(view) == null) {
            return false;
        }
        throw new IllegalStateException("Original long click listener is null");
    }
}
