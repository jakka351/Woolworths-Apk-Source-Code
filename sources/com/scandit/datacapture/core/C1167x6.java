package com.scandit.datacapture.core;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.x6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1167x6 extends C6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1167x6(String from, String to) {
        super(new IllegalStateException("Request was routed from \"" + from + "\" to \"" + to + '\"'), 0);
        Intrinsics.h(from, "from");
        Intrinsics.h(to, "to");
    }
}
