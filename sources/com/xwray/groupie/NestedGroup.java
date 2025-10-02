package com.xwray.groupie;

import YU.a;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class NestedGroup implements Group, GroupDataObserver {
    public final GroupDataObservable d = new GroupDataObservable();

    public static class GroupDataObservable {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23759a = new ArrayList();

        public final void a(NestedGroup nestedGroup, int i, int i2) {
            ArrayList arrayList = this.f23759a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((GroupDataObserver) arrayList.get(size)).f(nestedGroup, i, i2);
            }
        }

        public final void b(Group group, int i, int i2, Object obj) {
            ArrayList arrayList = this.f23759a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((GroupDataObserver) arrayList.get(size)).c(group, i, i2, obj);
            }
        }

        public final void c(NestedGroup nestedGroup, int i, int i2) {
            ArrayList arrayList = this.f23759a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((GroupDataObserver) arrayList.get(size)).g(nestedGroup, i, i2);
            }
        }

        public final void d(NestedGroup nestedGroup, int i, int i2) {
            ArrayList arrayList = this.f23759a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((GroupDataObserver) arrayList.get(size)).b(nestedGroup, i, i2);
            }
        }
    }

    @Override // com.xwray.groupie.Group
    public final int a() {
        int iA = 0;
        for (int i = 0; i < i(); i++) {
            iA += h(i).a();
        }
        return iA;
    }

    public void b(NestedGroup nestedGroup, int i, int i2) {
        this.d.d(this, j(nestedGroup) + i, i2);
    }

    public void c(Group group, int i, int i2, Object obj) {
        this.d.b(this, j(group) + i, i2, obj);
    }

    @Override // com.xwray.groupie.Group
    public final void d(Section section) {
        GroupDataObservable groupDataObservable = this.d;
        synchronized (groupDataObservable.f23759a) {
            groupDataObservable.f23759a.remove(groupDataObservable.f23759a.indexOf(section));
        }
    }

    @Override // com.xwray.groupie.Group
    public final void e(GroupDataObserver groupDataObserver) {
        GroupDataObservable groupDataObservable = this.d;
        synchronized (groupDataObservable.f23759a) {
            try {
                if (groupDataObservable.f23759a.contains(groupDataObserver)) {
                    throw new IllegalStateException("Observer " + groupDataObserver + " is already registered.");
                }
                groupDataObservable.f23759a.add(groupDataObserver);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(NestedGroup nestedGroup, int i, int i2) {
        int iJ = j(nestedGroup);
        this.d.a(this, i + iJ, iJ + i2);
    }

    public void g(NestedGroup nestedGroup, int i, int i2) {
        this.d.c(this, j(nestedGroup) + i, i2);
    }

    @Override // com.xwray.groupie.Group
    public final Item getItem(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i()) {
            Group groupH = h(i2);
            int iA = groupH.a() + i3;
            if (iA > i) {
                return groupH.getItem(i - i3);
            }
            i2++;
            i3 = iA;
        }
        StringBuilder sbR = a.r(i, "Wanted item at ", " but there are only ");
        sbR.append(a());
        sbR.append(" items");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public abstract Group h(int i);

    public abstract int i();

    public final int j(Group group) {
        int iK = k(group);
        int iA = 0;
        for (int i = 0; i < iK; i++) {
            iA += h(i).a();
        }
        return iA;
    }

    public abstract int k(Group group);

    public final void l(int i, int i2) {
        this.d.c(this, i, i2);
    }

    public final void m(int i, int i2) {
        this.d.d(this, i, i2);
    }
}
