package com.scandit.datacapture.core;

import android.view.Surface;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.core.g7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C1015g7 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C1024h7 f18526a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1015g7(C1024h7 c1024h7) {
        super(0);
        this.f18526a = c1024h7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return new Surface(this.f18526a.b);
    }
}
