package com.scandit.datacapture.core;

import com.scandit.datacapture.core.internal.module.ui.NativeGestureListener;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.q2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1100q2 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeGestureListener f18820a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1100q2(NativeGestureListener nativeGestureListener) {
        super(0);
        this.f18820a = nativeGestureListener;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18820a);
    }
}
