package com.scandit.datacapture.barcode;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final class V6 implements ExitButtonWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Ge f17325a;
    private Function0 b;
    private RelativeLayout c;
    private final Lazy d;

    public V6(H6 factory, Ge positioner) {
        Intrinsics.h(factory, "factory");
        Intrinsics.h(positioner, "positioner");
        this.f17325a = positioner;
        this.d = LazyKt.b(new T6(factory, this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(ViewGroup viewGroup, L6 data) {
        RelativeLayout parent = (RelativeLayout) viewGroup;
        Intrinsics.h(parent, "parent");
        Intrinsics.h(data, "data");
        this.c = parent;
        parent.addView((J6) this.d.getD());
        J6 j6 = (J6) this.d.getD();
        a(data.a());
        j6.b(false);
        j6.a(true);
        a();
    }

    public final Function0 b() {
        return this.b;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(Function0 function0) {
        this.b = function0;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(Function1 block) {
        Intrinsics.h(block, "block");
        ViewExtensionsKt.runOnMainThread((J6) this.d.getD(), new U6(block, this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a(boolean z) {
        ((J6) this.d.getD()).setVisibility(!z ? 4 : 0);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.ui.exitbutton.ExitButtonWrapper
    public final void a() {
        Ge ge = this.f17325a;
        J6 j6 = (J6) this.d.getD();
        RelativeLayout relativeLayout = this.c;
        if (relativeLayout != null) {
            ge.a(j6, relativeLayout);
        } else {
            Intrinsics.p("parent");
            throw null;
        }
    }
}
