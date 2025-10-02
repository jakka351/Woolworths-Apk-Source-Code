package com.xwray.groupie;

import androidx.camera.core.impl.b;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes7.dex */
class GroupUtils {
    public static Item a(int i, Collection collection) {
        Iterator it = collection.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Group group = (Group) it.next();
            int iA = group.a() + i2;
            if (iA > i) {
                return group.getItem(i - i2);
            }
            i2 = iA;
        }
        throw new IndexOutOfBoundsException(b.j(i, i2, "Wanted item at ", " but there are only ", " items"));
    }

    public static int b(Collection collection) {
        Iterator it = collection.iterator();
        int iA = 0;
        while (it.hasNext()) {
            iA += ((Group) it.next()).a();
        }
        return iA;
    }
}
