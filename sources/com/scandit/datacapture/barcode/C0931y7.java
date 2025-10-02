package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayColorScheme;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.scandit.datacapture.barcode.tracking.data.TrackedBarcode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0931y7 extends FrameLayout implements InterfaceC0530b2 {
    private TrackedBarcode b;
    private EnumC0813r9 c;
    private EnumC0668i8 d;
    private NativeBarcodeCountBasicOverlayColorScheme e;
    private Function3 f;
    private ImageView g;
    private Ke h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0931y7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.c = EnumC0813r9.UNKNOWN;
        this.d = EnumC0668i8.NOT_USING_LIST;
        this.e = NativeBarcodeCountBasicOverlayColorScheme.DEFAULT;
        this.f = C0916x7.f18261a;
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new df(this, 14));
        c();
        b();
    }

    private static final void a(C0931y7 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        TrackedBarcode trackedBarcode = this$0.b;
        if (trackedBarcode != null) {
            ((C0916x7) this$0.f).invoke(trackedBarcode, this$0.c, this$0.d);
        }
    }

    private final void c() {
        Context context = getContext();
        Intrinsics.g(context, "context");
        this.h = new Ke(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        View view = this.h;
        if (view == null) {
            Intrinsics.p("warningBackground");
            throw null;
        }
        addView(view, layoutParams);
        if (this.h != null) {
            return;
        }
        Intrinsics.p("warningBackground");
        throw null;
    }

    private final void d() {
        int i;
        ImageView imageView = this.g;
        if (imageView == null) {
            Intrinsics.p(BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }
        int iOrdinal = this.c.ordinal();
        if (iOrdinal == 1) {
            int iOrdinal2 = this.d.ordinal();
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                int i2 = AbstractC0901w7.f18249a[this.e.ordinal()];
                if (i2 == 1) {
                    i = R.drawable.sc_ic_barcode_scanned;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.sc_ic_barcode_scanned_alt;
                }
            } else {
                if (iOrdinal2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                int i3 = AbstractC0901w7.f18249a[this.e.ordinal()];
                if (i3 == 1) {
                    i = R.drawable.sc_ic_barcode_not_in_list;
                } else {
                    if (i3 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = R.drawable.sc_ic_barcode_not_in_list_alt;
                }
            }
        } else if (iOrdinal != 2) {
            i = 0;
        } else {
            int i4 = AbstractC0901w7.f18249a[this.e.ordinal()];
            if (i4 == 1) {
                i = R.drawable.sc_ic_barcode_unscanned;
            } else {
                if (i4 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R.drawable.sc_ic_barcode_unscanned_alt;
            }
        }
        imageView.setImageResource(i);
        Ke ke = this.h;
        if (ke != null) {
            ke.setVisibility(this.c != EnumC0813r9.UNSCANNED ? 8 : 0);
        } else {
            Intrinsics.p("warningBackground");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-util-AttributeSet-I-V, reason: not valid java name */
    public static /* synthetic */ void m304x4de12e11(C0931y7 c0931y7, View view) {
        Callback.g(view);
        try {
            a(c0931y7, view);
        } finally {
            Callback.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Ke ke = this.h;
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
        Ke ke = this.h;
        if (ke != null) {
            ke.d();
        } else {
            Intrinsics.p("warningBackground");
            throw null;
        }
    }

    private final void b() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_ic_barcode_scanned);
        imageView.setAdjustViewBounds(true);
        this.g = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        View view = this.g;
        if (view != null) {
            addView(view, layoutParams);
        } else {
            Intrinsics.p(BarcodePickDeserializer.FIELD_ICON);
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
        this.e = value;
        Ke ke = this.h;
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
}
