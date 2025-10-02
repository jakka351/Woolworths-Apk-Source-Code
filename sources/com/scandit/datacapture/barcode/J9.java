package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class J9 implements ShutterButtonWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0933y9 f17207a;
    private final Ge b;
    private Function0 c;
    private RelativeLayout d;
    private final Lazy e;

    public J9(InterfaceC0933y9 shutterButtonFactory, Ge positioner) {
        Intrinsics.h(shutterButtonFactory, "shutterButtonFactory");
        Intrinsics.h(positioner, "positioner");
        this.f17207a = shutterButtonFactory;
        this.b = positioner;
        this.e = LazyKt.b(new I9(this));
    }

    private final E9 e() {
        return (E9) this.e.getD();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void b() {
        e().getForeground().setLevel(1);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void c() {
        e().getForeground().setLevel(0);
    }

    public final Function0 d() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(ViewGroup viewGroup, G9 data) {
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.h(parent, "parent");
        Intrinsics.h(data, "data");
        this.d = parent;
        parent.addView(e());
        a(data.a());
        a();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void b(boolean z) {
        if (z) {
            e().start();
        } else {
            e().stop();
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(Function0 function0) {
        this.c = function0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a() {
        Ge ge = this.b;
        E9 e9E = e();
        RelativeLayout relativeLayout = this.d;
        if (relativeLayout != null) {
            ge.a(e9E, relativeLayout);
        } else {
            Intrinsics.p("parent");
            throw null;
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(boolean z) {
        e().setVisibility(!z ? 4 : 0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.shutterbutton.ShutterButtonWrapper
    public final void a(Function1 block) {
        Intrinsics.h(block, "block");
        ViewExtensionsKt.runOnMainThread(e(), new H9(block, this));
    }
}
