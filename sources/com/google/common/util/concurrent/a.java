package com.google.common.util.concurrent;

import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ boolean a(Unsafe unsafe, AbstractFuture abstractFuture, long j, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(abstractFuture, j, obj, obj2)) {
            if (unsafe.getObject(abstractFuture, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
