package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;

/* loaded from: classes6.dex */
final class f5 {
    private static f5 b;

    /* renamed from: a, reason: collision with root package name */
    protected ArrayList<e5> f16479a = new ArrayList<>();

    public static f5 a() {
        if (b == null) {
            b = new f5();
        }
        return b;
    }

    public ArrayList<e5> b() {
        ArrayList arrayListC = f1.a().c(b0.a.MediaFeedback, new Object[0]);
        this.f16479a = arrayListC;
        if (arrayListC != null) {
            return arrayListC;
        }
        return null;
    }
}
