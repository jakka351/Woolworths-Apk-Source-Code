package com.scandit.datacapture.core;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class Q1 extends S1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final Q1 f18362a = new Q1();

    @Override // com.scandit.datacapture.core.S1
    public final boolean a(Object obj, Object obj2) {
        return obj.equals(obj2);
    }

    @Override // com.scandit.datacapture.core.S1
    public final int a(Object obj) {
        return obj.hashCode();
    }
}
