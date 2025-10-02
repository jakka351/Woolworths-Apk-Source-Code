package io.noties.markwon;

import io.noties.markwon.MarkwonPlugin;
import io.noties.markwon.core.CorePlugin;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
class RegistryImpl implements MarkwonPlugin.Registry {

    /* renamed from: a, reason: collision with root package name */
    public final List f24196a;
    public final ArrayList b;
    public final HashSet c = new HashSet(3);

    public RegistryImpl(ArrayList arrayList) {
        this.f24196a = arrayList;
        this.b = new ArrayList(arrayList.size());
    }

    @Override // io.noties.markwon.MarkwonPlugin.Registry
    public final MarkwonPlugin a() {
        return d();
    }

    @Override // io.noties.markwon.MarkwonPlugin.Registry
    public final void b(MarkwonPlugin.Action action) {
        action.a(d());
    }

    public final void c(MarkwonPlugin markwonPlugin) {
        ArrayList arrayList = this.b;
        if (arrayList.contains(markwonPlugin)) {
            return;
        }
        HashSet hashSet = this.c;
        if (hashSet.contains(markwonPlugin)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + hashSet);
        }
        hashSet.add(markwonPlugin);
        markwonPlugin.a(this);
        hashSet.remove(markwonPlugin);
        if (arrayList.contains(markwonPlugin)) {
            return;
        }
        if (CorePlugin.class.isAssignableFrom(markwonPlugin.getClass())) {
            arrayList.add(0, markwonPlugin);
        } else {
            arrayList.add(markwonPlugin);
        }
    }

    public final MarkwonPlugin d() {
        MarkwonPlugin markwonPlugin;
        MarkwonPlugin markwonPlugin2;
        Iterator it = this.b.iterator();
        while (true) {
            markwonPlugin = null;
            if (!it.hasNext()) {
                markwonPlugin2 = null;
                break;
            }
            markwonPlugin2 = (MarkwonPlugin) it.next();
            if (CorePlugin.class.isAssignableFrom(markwonPlugin2.getClass())) {
                break;
            }
        }
        if (markwonPlugin2 != null) {
            return markwonPlugin2;
        }
        List list = this.f24196a;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            MarkwonPlugin markwonPlugin3 = (MarkwonPlugin) it2.next();
            if (CorePlugin.class.isAssignableFrom(markwonPlugin3.getClass())) {
                markwonPlugin = markwonPlugin3;
                break;
            }
        }
        if (markwonPlugin != null) {
            c(markwonPlugin);
            return markwonPlugin;
        }
        throw new IllegalStateException("Requested plugin is not added: " + CorePlugin.class.getName() + ", plugins: " + list);
    }
}
