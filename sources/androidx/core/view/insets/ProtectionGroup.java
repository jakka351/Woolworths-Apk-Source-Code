package androidx.core.view.insets;

import androidx.core.graphics.Insets;
import androidx.core.view.insets.SystemBarStateMonitor;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class ProtectionGroup implements SystemBarStateMonitor.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2521a = new ArrayList();
    public final SystemBarStateMonitor b;
    public int c;
    public boolean d;

    public ProtectionGroup(SystemBarStateMonitor systemBarStateMonitor, ArrayList arrayList) {
        f(arrayList, false);
        f(arrayList, true);
        ArrayList arrayList2 = systemBarStateMonitor.b;
        if (!arrayList2.contains(this)) {
            arrayList2.add(this);
            a(systemBarStateMonitor.c, systemBarStateMonitor.d);
            c(systemBarStateMonitor.e);
        }
        this.b = systemBarStateMonitor;
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void a(Insets insets, Insets insets2) {
        ArrayList arrayList = this.f2521a;
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        ((Protection) arrayList.get(size)).getClass();
        throw null;
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void b() {
        ArrayList arrayList = this.f2521a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Protection) arrayList.get(size)).getClass();
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void c(int i) {
        ArrayList arrayList = this.f2521a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((Protection) arrayList.get(size)).a(i);
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void d() {
        int i = this.c;
        boolean z = i > 0;
        int i2 = i - 1;
        this.c = i2;
        if (z && i2 == 0) {
            ArrayList arrayList = this.f2521a;
            int size = arrayList.size() - 1;
            if (size < 0) {
                return;
            }
            ((Protection) arrayList.get(size)).getClass();
            throw null;
        }
    }

    @Override // androidx.core.view.insets.SystemBarStateMonitor.Callback
    public final void e() {
        this.c++;
    }

    public final void f(List list, boolean z) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protection protection = (Protection) list.get(i);
            protection.getClass();
            if ((protection instanceof ColorProtection) == z) {
                Object obj = protection.f2520a;
                if (obj != null) {
                    throw new IllegalStateException(protection + " is already controlled by " + obj);
                }
                protection.f2520a = this;
                this.f2521a.add(protection);
            }
        }
    }
}
