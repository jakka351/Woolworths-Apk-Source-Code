package com.scandit.datacapture.core;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class M6 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final M6 f18346a = new M6();

    public M6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(((Number) obj).byteValue())}, 1));
    }
}
