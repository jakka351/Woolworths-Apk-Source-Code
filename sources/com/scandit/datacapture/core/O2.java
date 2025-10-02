package com.scandit.datacapture.core;

import java.io.Serializable;

/* loaded from: classes6.dex */
public abstract class O2 {
    public static final int a(int i, Serializable serializable) {
        return (i * 31) + (serializable != null ? serializable.hashCode() : 0);
    }
}
