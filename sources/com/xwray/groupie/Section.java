package com.xwray.groupie;

import YU.a;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListUpdateCallback;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocationItemHeader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class Section extends NestedGroup {
    public PickUpLocationItemHeader e;
    public final ArrayList f;
    public boolean g;
    public boolean h;
    public final ListUpdateCallback i;

    public Section() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = false;
        this.h = true;
        this.i = new ListUpdateCallback() { // from class: com.xwray.groupie.Section.1
            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void a(int i, int i2, Object obj) {
                Section section = Section.this;
                section.d.b(section, section.o() + i, i2, obj);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void b(int i, int i2) {
                Section section = Section.this;
                section.m(section.o() + i, i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void c(int i, int i2) {
                Section section = Section.this;
                int iO = section.o();
                section.d.a(section, i + iO, iO + i2);
            }

            @Override // androidx.recyclerview.widget.ListUpdateCallback
            public final void d(int i, int i2) {
                Section section = Section.this;
                section.l(section.o() + i, i2);
            }
        };
        this.e = null;
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Group) it.next()).e(this);
        }
        int iO = o() + GroupUtils.b(this.f);
        arrayList2.addAll(arrayList);
        l(iO, GroupUtils.b(arrayList));
        p();
    }

    @Override // com.xwray.groupie.NestedGroup, com.xwray.groupie.GroupDataObserver
    public final void b(NestedGroup nestedGroup, int i, int i2) {
        super.b(nestedGroup, i, i2);
        p();
    }

    @Override // com.xwray.groupie.NestedGroup, com.xwray.groupie.GroupDataObserver
    public final void g(NestedGroup nestedGroup, int i, int i2) {
        super.g(nestedGroup, i, i2);
        p();
    }

    @Override // com.xwray.groupie.NestedGroup
    public final Group h(int i) {
        if (n() > 0 && i == 0) {
            return this.e;
        }
        int iN = i - n();
        ArrayList arrayList = this.f;
        if (iN != arrayList.size()) {
            return (Group) arrayList.get(iN);
        }
        StringBuilder sbR = a.r(iN, "Wanted group at position ", " but there are only ");
        sbR.append(i());
        sbR.append(" groups");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    @Override // com.xwray.groupie.NestedGroup
    public final int i() {
        return this.f.size() + n();
    }

    @Override // com.xwray.groupie.NestedGroup
    public final int k(Group group) {
        if (n() > 0 && group == this.e) {
            return 0;
        }
        int iN = n();
        ArrayList arrayList = this.f;
        int iIndexOf = arrayList.indexOf(group);
        if (iIndexOf >= 0) {
            return iN + iIndexOf;
        }
        arrayList.size();
        return -1;
    }

    public final int n() {
        return (this.e == null || !this.h) ? 0 : 1;
    }

    public final int o() {
        if (n() == 0) {
            return 0;
        }
        this.e.getClass();
        return 1;
    }

    public final void p() {
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty() && GroupUtils.b(arrayList) != 0) {
            if (this.h) {
                return;
            }
            this.h = true;
            l(0, o());
            l(o() + GroupUtils.b(arrayList), 0);
            return;
        }
        if (this.g) {
            if (this.h) {
                int iO = o();
                this.h = false;
                m(0, iO);
                return;
            }
            return;
        }
        if (this.h) {
            return;
        }
        this.h = true;
        l(0, o());
        l(o() + GroupUtils.b(arrayList), 0);
    }

    public final void q(Collection collection) {
        ArrayList arrayList = this.f;
        DiffUtil.DiffResult diffResultA = DiffUtil.a(new DiffCallback(new ArrayList(arrayList), collection), true);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Group) it.next()).d(this);
        }
        arrayList.clear();
        arrayList.addAll(collection);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            ((Group) it2.next()).e(this);
        }
        diffResultA.b(this.i);
        p();
    }
}
