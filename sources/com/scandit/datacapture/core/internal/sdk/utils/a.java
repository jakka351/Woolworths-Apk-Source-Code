package com.scandit.datacapture.core.internal.sdk.utils;

import com.scandit.datacapture.core.internal.sdk.capture.NativeFeatureAvailability;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final a f18772a = new a();

    public a() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return NativeFeatureAvailability.SUPPORTED;
    }
}
