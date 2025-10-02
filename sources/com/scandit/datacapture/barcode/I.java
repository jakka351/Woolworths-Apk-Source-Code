package com.scandit.datacapture.barcode;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Size;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    private final float f17188a;
    private final float b;
    private final int c;
    private Size d;
    private final SharedPreferences e;

    public I(Context context, float f, float f2, int i) {
        Intrinsics.h(context, "context");
        this.f17188a = f;
        this.b = f2;
        this.c = i;
        this.d = new Size(0, 0);
        this.e = context.getSharedPreferences("com.scandit.barcode.count_shutter_button", 0);
    }

    public final void a(Size size) {
        Intrinsics.h(size, "<set-?>");
        this.d = size;
    }

    public final float b() {
        float f = this.e.getFloat("barcode-count-floating-shutter-y-location", this.b);
        float height = this.d.getHeight() - this.c;
        return f > height ? height : f;
    }

    public final float a() {
        float f = this.e.getFloat("barcode-count-floating-shutter-x-location", this.f17188a);
        float width = this.d.getWidth() - this.c;
        return f > width ? width : f;
    }

    public final void b(float f) {
        this.e.edit().putFloat("barcode-count-floating-shutter-y-location", f).apply();
    }

    public final void a(float f) {
        this.e.edit().putFloat("barcode-count-floating-shutter-x-location", f).apply();
    }
}
