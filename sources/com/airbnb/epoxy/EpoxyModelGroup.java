package com.airbnb.epoxy;

import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class EpoxyModelGroup extends EpoxyModelWithHolder<ModelGroupHolder> {
    public final ArrayList n;
    public boolean o;

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$1, reason: invalid class name */
    class AnonymousClass1 implements IterateModelsCallback {
        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        public final void a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
            EpoxyModelGroup.J(epoxyViewHolder, epoxyModel);
            epoxyViewHolder.d(epoxyModel, null, Collections.EMPTY_LIST, i);
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$2, reason: invalid class name */
    class AnonymousClass2 implements IterateModelsCallback {
        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        public final void a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
            EpoxyModelGroup.J(epoxyViewHolder, epoxyModel);
            epoxyViewHolder.d(epoxyModel, null, Collections.EMPTY_LIST, i);
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$3, reason: invalid class name */
    class AnonymousClass3 implements IterateModelsCallback {
        public AnonymousClass3() {
        }

        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        public final void a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
            EpoxyModelGroup.J(epoxyViewHolder, epoxyModel);
            EpoxyModelGroup epoxyModelGroup = EpoxyModelGroup.this;
            if (i < epoxyModelGroup.n.size()) {
                EpoxyModel epoxyModel2 = (EpoxyModel) epoxyModelGroup.n.get(i);
                if (epoxyModel2.d == epoxyModel.d) {
                    epoxyViewHolder.d(epoxyModel, epoxyModel2, Collections.EMPTY_LIST, i);
                    return;
                }
            }
            epoxyViewHolder.d(epoxyModel, null, Collections.EMPTY_LIST, i);
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$4, reason: invalid class name */
    class AnonymousClass4 implements IterateModelsCallback {
        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        public final void a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
            epoxyModel.u(epoxyViewHolder.e());
        }
    }

    /* renamed from: com.airbnb.epoxy.EpoxyModelGroup$5, reason: invalid class name */
    class AnonymousClass5 implements IterateModelsCallback {
        @Override // com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback
        public final void a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i) {
            epoxyModel.v(epoxyViewHolder.e());
        }
    }

    public interface IterateModelsCallback {
        void a(EpoxyModel epoxyModel, EpoxyViewHolder epoxyViewHolder, int i);
    }

    public EpoxyModelGroup(int i, Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        boolean z = false;
        this.o = false;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Models cannot be empty");
        }
        this.n = arrayList;
        t();
        this.e = i;
        o(((EpoxyModel) arrayList.get(0)).d);
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((EpoxyModel) it.next()).y()) {
                z = true;
                break;
            }
        }
        this.o = z;
    }

    public static void J(EpoxyViewHolder epoxyViewHolder, EpoxyModel epoxyModel) {
        if (epoxyModel.f) {
            epoxyViewHolder.itemView.setVisibility(0);
        } else {
            epoxyViewHolder.itemView.setVisibility(8);
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: C */
    public final void h(EpoxyHolder epoxyHolder) throws Throwable {
        K((ModelGroupHolder) epoxyHolder, new AnonymousClass1());
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    public final EpoxyHolder D(ViewParent viewParent) {
        return new ModelGroupHolder(viewParent);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: E */
    public final void u(EpoxyHolder epoxyHolder) throws Throwable {
        K((ModelGroupHolder) epoxyHolder, new AnonymousClass4());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fe  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [com.airbnb.epoxy.EpoxyModel] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.airbnb.epoxy.EpoxyViewHolder] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void K(com.airbnb.epoxy.ModelGroupHolder r18, com.airbnb.epoxy.EpoxyModelGroup.IterateModelsCallback r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.EpoxyModelGroup.K(com.airbnb.epoxy.ModelGroupHolder, com.airbnb.epoxy.EpoxyModelGroup$IterateModelsCallback):void");
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final void v(ModelGroupHolder modelGroupHolder) throws Throwable {
        K(modelGroupHolder, new AnonymousClass5());
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void A(ModelGroupHolder modelGroupHolder) {
        ArrayList arrayList = modelGroupHolder.b;
        if (modelGroupHolder.g == null) {
            throw new IllegalStateException("Group is not bound");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            modelGroupHolder.c(arrayList.size() - 1);
        }
        modelGroupHolder.g = null;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void e(EpoxyHolder epoxyHolder, EpoxyModel epoxyModel) throws Throwable {
        ModelGroupHolder modelGroupHolder = (ModelGroupHolder) epoxyHolder;
        if (epoxyModel instanceof EpoxyModelGroup) {
            K(modelGroupHolder, ((EpoxyModelGroup) epoxyModel).new AnonymousClass3());
        } else {
            K(modelGroupHolder, new AnonymousClass1());
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof EpoxyModelGroup) && super.equals(obj)) {
            return this.n.equals(((EpoxyModelGroup) obj).n);
        }
        return false;
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final void f(EpoxyHolder epoxyHolder, List list) throws Throwable {
        K((ModelGroupHolder) epoxyHolder, new AnonymousClass2());
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void g(EpoxyModel epoxyModel, Object obj) throws Throwable {
        ModelGroupHolder modelGroupHolder = (ModelGroupHolder) obj;
        if (epoxyModel instanceof EpoxyModelGroup) {
            K(modelGroupHolder, ((EpoxyModelGroup) epoxyModel).new AnonymousClass3());
        } else {
            K(modelGroupHolder, new AnonymousClass1());
        }
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void h(Object obj) throws Throwable {
        K((ModelGroupHolder) obj, new AnonymousClass1());
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public int hashCode() {
        return this.n.hashCode() + (super.hashCode() * 31);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void i(Object obj, List list) throws Throwable {
        K((ModelGroupHolder) obj, new AnonymousClass2());
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    /* renamed from: k */
    public final int getN() {
        throw new UnsupportedOperationException("You should set a layout with layout(...) instead of using this.");
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final int m(int i, int i2, int i3) {
        return ((EpoxyModel) this.n.get(0)).z(i, i2, i3);
    }

    @Override // com.airbnb.epoxy.EpoxyModelWithHolder, com.airbnb.epoxy.EpoxyModel
    public final void u(Object obj) throws Throwable {
        K((ModelGroupHolder) obj, new AnonymousClass4());
    }

    @Override // com.airbnb.epoxy.EpoxyModel
    public final boolean y() {
        return this.o;
    }
}
