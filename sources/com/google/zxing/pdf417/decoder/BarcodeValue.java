package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class BarcodeValue {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f16200a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry entry : this.f16200a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == iIntValue) {
                arrayList.add(entry.getKey());
            }
        }
        return PDF417Common.a(arrayList);
    }

    public final void b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f16200a;
        Integer num = (Integer) map.get(numValueOf);
        if (num == null) {
            num = 0;
        }
        map.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }
}
