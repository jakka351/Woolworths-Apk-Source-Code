package com.scandit.datacapture.core;

import android.os.Handler;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.ui.animation.SpringAnimation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class I1 implements V2 {

    /* renamed from: a, reason: collision with root package name */
    private final Lazy f18327a;
    private final Lazy b;
    private final Lazy c;
    private boolean d;
    private final Lazy e;
    private final Lazy f;
    private final Lazy g;

    public I1(ViewGroup container) {
        Intrinsics.h(container, "container");
        this.f18327a = LazyKt.b(new E1(container));
        this.b = LazyKt.b(new F1(this));
        this.c = LazyKt.b(new B1(this));
        this.d = true;
        this.e = LazyKt.b(new A1(this));
        this.f = LazyKt.b(new H1(this));
        this.g = LazyKt.b(C1.f18302a);
    }

    private static int a(float f) {
        return (int) (f * 255);
    }

    public final TextView b() {
        return (TextView) this.f18327a.getD();
    }

    public static final float a(I1 i1) {
        return ((Number) i1.b.getD()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(I1 this$0) {
        Intrinsics.h(this$0, "this$0");
        ((SpringAnimation) this$0.e.getD()).animateToFinalPosition(1.0f);
    }

    public final void c() {
        ((Handler) this.g.getD()).postDelayed(new com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.f(this, 2), 200L);
        SpringAnimation springAnimation = (SpringAnimation) this.f.getD();
        ViewGroup.LayoutParams layoutParams = b().getLayoutParams();
        springAnimation.animateToFinalPosition((layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null) != null ? r1.topMargin : 0);
        if (this.d) {
            return;
        }
        ((SpringAnimation) this.e.getD()).skipToEnd();
        ((SpringAnimation) this.f.getD()).skipToEnd();
    }

    private final int a() {
        return ((Number) this.c.getD()).intValue();
    }

    public final void a(Function0 then) {
        Intrinsics.h(then, "then");
        ((Handler) this.g.getD()).removeCallbacksAndMessages(null);
        ((SpringAnimation) this.e.getD()).animateToFinalPosition(BitmapDescriptorFactory.HUE_RED);
        SpringAnimation springAnimation = (SpringAnimation) this.f.getD();
        springAnimation.animateToFinalPosition(((Number) this.b.getD()).floatValue());
        springAnimation.addEndListener(new G1(springAnimation, new D1(then)));
        if (this.d) {
            return;
        }
        ((SpringAnimation) this.e.getD()).skipToEnd();
        ((SpringAnimation) this.f.getD()).skipToEnd();
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0283  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.scandit.datacapture.core.internal.module.ui.NativeHintStyle r14) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.I1.a(com.scandit.datacapture.core.internal.module.ui.NativeHintStyle):void");
    }
}
