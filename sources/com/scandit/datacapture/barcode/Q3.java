package com.scandit.datacapture.barcode;

import android.widget.FrameLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes6.dex */
final class Q3 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f17275a;
    final /* synthetic */ S3 b;
    final /* synthetic */ String c;
    final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q3(boolean z, S3 s3, String str, boolean z2) {
        super(0);
        this.f17275a = z;
        this.b = s3;
        this.c = str;
        this.d = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f17275a) {
            ((se) S3.a(this.b)).a(this.c, this.d);
            if (!this.b.e) {
                S3 s3 = this.b;
                s3.addView(((se) S3.a(s3)).a(), new FrameLayout.LayoutParams(-2, -2, 17));
            }
        } else if (this.b.e) {
            S3 s32 = this.b;
            s32.removeView(((se) S3.a(s32)).a());
        }
        this.b.e = this.f17275a;
        return Unit.f24250a;
    }
}
