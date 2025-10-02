package com.scandit.datacapture.barcode;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class O3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S3 f17254a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(S3 s3) {
        super(0);
        this.f17254a = s3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f17254a.d) {
            S3 s3 = this.f17254a;
            s3.removeView(S3.b(s3));
            this.f17254a.d = false;
        }
        return Unit.f24250a;
    }
}
