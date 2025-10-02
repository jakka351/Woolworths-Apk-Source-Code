package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import com.scandit.datacapture.core.ui.style.Brush;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G extends FrameLayout implements InterfaceC0530b2 {
    private TrackedBarcode b;
    private EnumC0813r9 c;
    private EnumC0668i8 d;
    private Function3 e;
    private ImageView f;
    private Ke g;
    private Function2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.c = EnumC0813r9.UNKNOWN;
        this.d = EnumC0668i8.NOT_USING_LIST;
        this.e = F.f17154a;
        this.h = E.f17142a;
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new df(this, 4));
        c();
        b();
    }

    private static final void a(G this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        TrackedBarcode trackedBarcode = this$0.b;
        if (trackedBarcode != null) {
            ((F) this$0.e).invoke(trackedBarcode, this$0.c, this$0.d);
        }
    }

    private final void c() {
        Context context = getContext();
        Intrinsics.g(context, "context");
        this.g = new Ke(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        View view = this.g;
        if (view == null) {
            Intrinsics.p("warningBackground");
            throw null;
        }
        addView(view, layoutParams);
        if (this.g != null) {
            return;
        }
        Intrinsics.p("warningBackground");
        throw null;
    }

    private final void d() {
        Brush brush = (Brush) this.h.invoke(this.c, this.d);
        ImageView imageView = this.f;
        if (imageView == null) {
            Intrinsics.p("dot");
            throw null;
        }
        imageView.setColorFilter(brush != null ? brush.getFillColor() : 0, PorterDuff.Mode.SRC_IN);
        Ke ke = this.g;
        if (ke != null) {
            ke.setVisibility((this.c != EnumC0813r9.UNSCANNED || brush == null) ? 8 : 0);
        } else {
            Intrinsics.p("warningBackground");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-util-AttributeSet-I-V, reason: not valid java name */
    public static /* synthetic */ void m272x4de12e11(G g, View view) {
        Callback.g(view);
        try {
            a(g, view);
        } finally {
            Callback.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ke ke = this.g;
        if (ke != null) {
            ke.c();
        } else {
            Intrinsics.p("warningBackground");
            throw null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Ke ke = this.g;
        if (ke != null) {
            ke.d();
        } else {
            Intrinsics.p("warningBackground");
            throw null;
        }
    }

    private final void b() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_ic_barcode_dot);
        imageView.setAdjustViewBounds(true);
        this.f = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        View view = this.f;
        if (view != null) {
            addView(view, layoutParams);
        } else {
            Intrinsics.p("dot");
            throw null;
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0530b2
    public final void a(TrackedBarcode trackedBarcode) {
        this.b = trackedBarcode;
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0530b2
    public final void a(EnumC0813r9 value) {
        Intrinsics.h(value, "value");
        this.c = value;
        d();
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0530b2
    public final void a(EnumC0668i8 value) {
        Intrinsics.h(value, "value");
        this.d = value;
        d();
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0530b2
    public final void a(NativeBarcodeCountBasicOverlayColorScheme value) {
        Intrinsics.h(value, "value");
        Ke ke = this.g;
        if (ke != null) {
            ke.a(value);
            d();
        } else {
            Intrinsics.p("warningBackground");
            throw null;
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0530b2
    public final void a() {
        d();
    }

    public final void a(Function2 function2) {
        Intrinsics.h(function2, "<set-?>");
        this.h = function2;
    }
}
