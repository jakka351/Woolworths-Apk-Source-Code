package com.scandit.datacapture.core.ui;

import com.scandit.datacapture.core.internal.sdk.common.NativeError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18885a = new a();

    public a() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeError it = (NativeError) obj;
        Intrinsics.h(it, "it");
        String message = it.getMessage();
        Intrinsics.g(message, "it.message");
        return message;
    }
}
