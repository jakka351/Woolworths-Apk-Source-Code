package com.scandit.datacapture.barcode.internal.sdk;

import com.scandit.datacapture.barcode.internal.module.tracking.capture.TrackedObject;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeTrackedObject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeTrackedObject f17802a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeTrackedObject nativeTrackedObject) {
        super(0);
        this.f17802a = nativeTrackedObject;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new TrackedObject(this.f17802a);
    }
}
