package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;

/* loaded from: classes6.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    private static final int f17177a = PixelExtensionsKt.pxFromDp$default(82, (Context) null, 1, (Object) null);
    private static final int b = PixelExtensionsKt.pxFromDp$default(62, (Context) null, 1, (Object) null);
    private static final int c = PixelExtensionsKt.pxFromDp$default(140, (Context) null, 1, (Object) null);
    private static final int d;
    private static final int e;
    private static final int f;
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;

    static {
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(32, (Context) null, 1, (Object) null);
        d = iPxFromDp$default;
        int iPxFromDp$default2 = PixelExtensionsKt.pxFromDp$default(48, (Context) null, 1, (Object) null);
        e = iPxFromDp$default2;
        int iPxFromDp$default3 = (iPxFromDp$default2 - PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null)) / 2;
        f = iPxFromDp$default3;
        g = PixelExtensionsKt.pxFromDp$default(20, (Context) null, 1, (Object) null);
        h = iPxFromDp$default + iPxFromDp$default3;
        i = PixelExtensionsKt.pxFromDp$default(28, (Context) null, 1, (Object) null);
        j = View.generateViewId();
        k = View.generateViewId();
    }

    public static int a() {
        return b;
    }

    public static int b() {
        return f17177a;
    }

    public static int c() {
        return j;
    }

    public static int d() {
        return k;
    }

    public static int e() {
        return d;
    }

    public static int f() {
        return e;
    }

    public static int g() {
        return c;
    }

    public static int h() {
        return f;
    }

    public static int i() {
        return i;
    }

    public static int j() {
        return g;
    }

    public static int k() {
        return h;
    }
}
