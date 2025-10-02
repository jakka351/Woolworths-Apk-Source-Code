package com.scandit.datacapture.barcode.count.ui.overlay;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class c extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final c f17550a = new c();

    public c() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return "This overlay's mode and view are attached to different data capture contexts!";
    }
}
