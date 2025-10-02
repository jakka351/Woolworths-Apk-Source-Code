package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.Size;
import android.view.View;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountScreenRatioForUi;
import com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0692k0 implements BarcodeCountViewUiLayoutHelper {
    private static final int e = PixelExtensionsKt.pxFromDp$default(25, (Context) null, 1, (Object) null);
    private static final int f = PixelExtensionsKt.pxFromDp$default(39, (Context) null, 1, (Object) null);
    private static final int g;
    private static final int h;
    private static final int i;
    private static final int j;
    private static final int k;
    private static final Lazy l;
    private static final Lazy m;
    private static final int n;
    private static final int o;
    private static final int p;
    private static final int q;

    /* renamed from: a, reason: collision with root package name */
    public View f17826a;
    private Size b = new Size(0, 0);
    private Integer c;
    private Integer d;

    static {
        int iG = H.g() / 2;
        g = iG;
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(80, (Context) null, 1, (Object) null);
        h = iPxFromDp$default;
        i = iG - (iPxFromDp$default / 2);
        j = PixelExtensionsKt.pxFromDp$default(100, (Context) null, 1, (Object) null);
        k = PixelExtensionsKt.pxFromDp$default(200, (Context) null, 1, (Object) null);
        l = LazyKt.b(C0660i0.f17702a);
        m = LazyKt.b(C0644h0.f17692a);
        n = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);
        o = PixelExtensionsKt.pxFromDp$default(360, (Context) null, 1, (Object) null);
        p = PixelExtensionsKt.pxFromDp$default(32, (Context) null, 1, (Object) null);
        q = PixelExtensionsKt.pxFromDp$default(480, (Context) null, 1, (Object) null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final void a(RelativeLayout relativeLayout) {
        Intrinsics.h(relativeLayout, "<set-?>");
        this.f17826a = relativeLayout;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final int b() {
        int height;
        int height2;
        int iIntValue;
        Integer num = this.c;
        if (num != null) {
            return num.intValue();
        }
        View view = this.f17826a;
        if (view == null) {
            Intrinsics.p("container");
            throw null;
        }
        Context context = view.getContext();
        Intrinsics.g(context, "container.context");
        if (AbstractC0682j6.a(context)) {
            View view2 = this.f17826a;
            if (view2 == null) {
                Intrinsics.p("container");
                throw null;
            }
            height = view2.getWidth();
            height2 = this.b.getWidth();
        } else {
            View view3 = this.f17826a;
            if (view3 == null) {
                Intrinsics.p("container");
                throw null;
            }
            height = view3.getHeight();
            height2 = this.b.getHeight();
        }
        int i2 = height - height2;
        int i3 = AbstractC0676j0.f17818a[g().ordinal()];
        if (i3 == 1) {
            iIntValue = (i2 - i) + ((Number) l.getD()).intValue();
        } else if (i3 == 2) {
            iIntValue = (i2 - H.g()) / 2;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((i2 / 2) - H.g()) / 2;
        }
        this.c = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final void c() {
        this.c = null;
        this.d = null;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final Size d() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final int e() {
        View view = this.f17826a;
        if (view == null) {
            Intrinsics.p("container");
            throw null;
        }
        Context context = view.getContext();
        Intrinsics.g(context, "container.context");
        return AbstractC0682j6.a(context) ? f : e;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final int f() {
        int height = this.b.getHeight();
        int i2 = q;
        if (height > i2) {
            return p;
        }
        int height2 = this.b.getHeight();
        int i3 = o;
        if (height2 < i3) {
            return n;
        }
        int height3 = this.b.getHeight();
        float f2 = p;
        float f3 = n;
        float f4 = i3;
        return (int) ((((f2 - f3) / (i2 - f4)) * (height3 - f4)) + f3);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final BarcodeCountScreenRatioForUi g() {
        int height;
        int height2;
        View view = this.f17826a;
        if (view == null) {
            Intrinsics.p("container");
            throw null;
        }
        Context context = view.getContext();
        Intrinsics.g(context, "container.context");
        if (AbstractC0682j6.a(context)) {
            View view2 = this.f17826a;
            if (view2 == null) {
                Intrinsics.p("container");
                throw null;
            }
            height = view2.getWidth();
            height2 = this.b.getWidth();
        } else {
            View view3 = this.f17826a;
            if (view3 == null) {
                Intrinsics.p("container");
                throw null;
            }
            height = view3.getHeight();
            height2 = this.b.getHeight();
        }
        int i2 = height - height2;
        if (i2 < 0 || i2 >= j) {
            return (i2 >= k || j > i2) ? BarcodeCountScreenRatioForUi.LARGE : BarcodeCountScreenRatioForUi.MEDIUM;
        }
        return BarcodeCountScreenRatioForUi.SMALL;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final int h() {
        int iIntValue;
        Integer num = this.d;
        if (num != null) {
            return num.intValue();
        }
        int i2 = AbstractC0676j0.f17818a[g().ordinal()];
        if (i2 == 1) {
            iIntValue = ((Number) l.getD()).intValue() + h + ((Number) m.getD()).intValue();
        } else {
            if (i2 != 2 && i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iIntValue = ((Number) m.getD()).intValue();
        }
        this.d = Integer.valueOf(iIntValue);
        return iIntValue;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final void a(Size previewSize) {
        Intrinsics.h(previewSize, "previewSize");
        this.b = previewSize;
        c();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.count.ui.wrappers.BarcodeCountViewUiLayoutHelper
    public final int a() {
        return (b() + g) - (H.a() - (PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null) / 2));
    }
}
