package com.airbnb.epoxy;

import java.util.HashMap;

/* loaded from: classes4.dex */
class ViewTypeManager {
    public static final HashMap b = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public EpoxyModel f13326a;

    public static int a(EpoxyModel epoxyModel) {
        int iN = epoxyModel.n();
        if (iN != 0) {
            return iN;
        }
        Class<?> cls = epoxyModel.getClass();
        HashMap map = b;
        Integer numValueOf = (Integer) map.get(cls);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf((-map.size()) - 1);
            map.put(cls, numValueOf);
        }
        return numValueOf.intValue();
    }
}
