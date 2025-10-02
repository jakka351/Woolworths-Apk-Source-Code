package com.scandit.datacapture.barcode;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class R3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ S3 f17285a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R3(S3 s3) {
        super(0);
        this.f17285a = s3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (!this.f17285a.d) {
            S3 s3 = this.f17285a;
            s3.addView(S3.b(s3), new FrameLayout.LayoutParams(-1, -1));
            S3.b(this.f17285a).bringToFront();
            this.f17285a.d = true;
        }
        return Unit.f24250a;
    }
}
