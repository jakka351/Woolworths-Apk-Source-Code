package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class Quirks {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f497a;

    public Quirks(List list) {
        this.f497a = new ArrayList(list);
    }

    public static String d(Quirks quirks) {
        ArrayList arrayList = new ArrayList();
        Iterator it = quirks.f497a.iterator();
        while (it.hasNext()) {
            arrayList.add(((Quirk) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean a(Class cls) {
        Iterator it = this.f497a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((Quirk) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final Quirk b(Class cls) {
        Iterator it = this.f497a.iterator();
        while (it.hasNext()) {
            Quirk quirk = (Quirk) it.next();
            if (quirk.getClass() == cls) {
                return quirk;
            }
        }
        return null;
    }

    public final ArrayList c(Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f497a.iterator();
        while (it.hasNext()) {
            Quirk quirk = (Quirk) it.next();
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
