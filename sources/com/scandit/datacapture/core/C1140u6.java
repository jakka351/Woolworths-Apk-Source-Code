package com.scandit.datacapture.core;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.u6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1140u6 extends C6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140u6(String message) {
        super(new IOException(message), 0);
        Intrinsics.h(message, "message");
    }
}
