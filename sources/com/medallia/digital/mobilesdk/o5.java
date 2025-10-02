package com.medallia.digital.mobilesdk;

import java.util.Comparator;

/* loaded from: classes.dex */
class o5 implements Comparator<String> {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f16624a;

    public o5(boolean z) {
        this.f16624a = z;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(String str, String str2) throws NumberFormatException {
        double d = Double.parseDouble(str);
        double d2 = Double.parseDouble(str2);
        return this.f16624a ? Double.compare(d, d2) : Double.compare(d2, d);
    }
}
