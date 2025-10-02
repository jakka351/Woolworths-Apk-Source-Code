package com.dynatrace.android.callback;

import com.medallia.digital.mobilesdk.l3;

/* loaded from: classes4.dex */
public class TextViewHelper {
    public static boolean a(int i) {
        int i2 = i & l3.b;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static boolean b(int i) {
        return (i & l3.b) == 145;
    }
}
