package com.scandit.datacapture.barcode.internal.module.count.ui.toolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.barcode.J;
import com.scandit.datacapture.barcode.K;
import com.scandit.datacapture.barcode.L;
import com.scandit.datacapture.barcode.R;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountToolbarDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BarcodeCountToolbarViewHolder {
    private static final int q = PixelExtensionsKt.pxFromDp$default(30, (Context) null, 1, (Object) null);
    private static final int r = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);
    private static final int s = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);
    private static final int t = PixelExtensionsKt.pxFromDp$default(36, (Context) null, 1, (Object) null);

    /* renamed from: a, reason: collision with root package name */
    private K f17720a;
    private final View b;
    private final View c;
    private final View d;
    private final LinearLayout e;
    private final J f;
    private final J g;
    private final J h;
    private final J i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final BarcodeCountToolbarDefaults p;

    public BarcodeCountToolbarViewHolder(Context context, ViewGroup viewGroup, L initialState) {
        Intrinsics.h(context, "context");
        Intrinsics.h(initialState, "initialState");
        this.k = initialState.a();
        this.l = initialState.c();
        this.m = initialState.d();
        this.n = initialState.b();
        this.p = new BarcodeCountToolbarDefaults();
        final int i = 0;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sc_barcode_count_toolbar, viewGroup, false);
        Intrinsics.g(viewInflate, "from(context)\n          …ar, containerView, false)");
        this.b = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.expand_button);
        Intrinsics.g(viewFindViewById, "rootView.findViewById(R.id.expand_button)");
        this.c = viewFindViewById;
        a();
        viewFindViewById.setOnClickListener(new View.OnClickListener(this) { // from class: com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.e
            public final /* synthetic */ BarcodeCountToolbarViewHolder e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        BarcodeCountToolbarViewHolder.m298x10b2da45(this.e, view);
                        break;
                    default:
                        BarcodeCountToolbarViewHolder.m299xf65e36c6(this.e, view);
                        break;
                }
            }
        });
        View viewFindViewById2 = viewInflate.findViewById(R.id.collapse_button);
        Intrinsics.g(viewFindViewById2, "rootView.findViewById(R.id.collapse_button)");
        this.d = viewFindViewById2;
        final int i2 = 1;
        viewFindViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: com.scandit.datacapture.barcode.internal.module.count.ui.toolbar.e
            public final /* synthetic */ BarcodeCountToolbarViewHolder e;

            {
                this.e = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        BarcodeCountToolbarViewHolder.m298x10b2da45(this.e, view);
                        break;
                    default:
                        BarcodeCountToolbarViewHolder.m299xf65e36c6(this.e, view);
                        break;
                }
            }
        });
        View viewFindViewById3 = viewInflate.findViewById(R.id.button_container);
        Intrinsics.g(viewFindViewById3, "rootView.findViewById(R.id.button_container)");
        this.e = (LinearLayout) viewFindViewById3;
        int i3 = R.drawable.sc_ic_audio_feedback_selector;
        String string = context.getString(R.string.sc_barcodeCount_toolbar_audio_off);
        Intrinsics.g(string, "context.getString(R.stri…eCount_toolbar_audio_off)");
        String string2 = context.getString(R.string.sc_barcodeCount_toolbar_audio_on);
        Intrinsics.g(string2, "context.getString(R.stri…deCount_toolbar_audio_on)");
        this.f = a(context, i3, string, string2, this.k, new a(this));
        int i4 = R.drawable.sc_ic_haptic_feedback_selector;
        String string3 = context.getString(R.string.sc_barcodeCount_toolbar_haptic_off);
        Intrinsics.g(string3, "context.getString(R.stri…Count_toolbar_haptic_off)");
        String string4 = context.getString(R.string.sc_barcodeCount_toolbar_haptic_on);
        Intrinsics.g(string4, "context.getString(R.stri…eCount_toolbar_haptic_on)");
        this.g = a(context, i4, string3, string4, this.l, new b(this));
        int i5 = R.drawable.sc_ic_strap_mode;
        String string5 = context.getString(R.string.sc_barcodeCount_toolbar_strap_mode);
        Intrinsics.g(string5, "context.getString(R.stri…Count_toolbar_strap_mode)");
        this.h = a(context, i5, string5, this.m, new c(this));
        int i6 = R.drawable.sc_ic_color_filter;
        String string6 = context.getString(R.string.sc_barcodeCount_toolbar_color_filter);
        Intrinsics.g(string6, "context.getString(R.stri…unt_toolbar_color_filter)");
        this.i = a(context, i6, string6, this.n, new d(this));
        d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-view-ViewGroup-Lcom-scandit-datacapture-barcode-L--V, reason: not valid java name */
    public static /* synthetic */ void m298x10b2da45(BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder, View view) {
        Callback.g(view);
        try {
            a(barcodeCountToolbarViewHolder, view);
        } finally {
            Callback.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$1$new$-Landroid-content-Context-Landroid-view-ViewGroup-Lcom-scandit-datacapture-barcode-L--V, reason: not valid java name */
    public static /* synthetic */ void m299xf65e36c6(BarcodeCountToolbarViewHolder barcodeCountToolbarViewHolder, View view) {
        Callback.g(view);
        try {
            b(barcodeCountToolbarViewHolder, view);
        } finally {
            Callback.h();
        }
    }

    public final void f(String str) {
        J j = this.i;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.colorSchemeOnButtonText(context);
        }
        j.c(str);
    }

    public final void h(String str) {
        J j = this.g;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.vibrationOffButtonText(context);
        }
        j.b(str);
    }

    public final void i(String str) {
        J j = this.g;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.vibrationOnButtonText(context);
        }
        j.c(str);
    }

    public final void j(String str) {
        J j = this.h;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.strapModeButtonContentDescription(context);
        }
        j.a(str);
    }

    public final void k(String str) {
        J j = this.h;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.strapModeOffButtonText(context);
        }
        j.b(str);
    }

    public final void l(String str) {
        J j = this.h;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.strapModeOnButtonText(context);
        }
        j.c(str);
    }

    public final void e(String str) {
        J j = this.i;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.colorSchemeOffButtonText(context);
        }
        j.b(str);
    }

    public final void g(String str) {
        J j = this.g;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.vibrationButtonContentDescription(context);
        }
        j.a(str);
    }

    public final void a(K k) {
        this.f17720a = k;
    }

    public final K b() {
        return this.f17720a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(BarcodeCountToolbarViewHolder this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.c.setVisibility(this$0.j ? 8 : 0);
        this$0.d.setVisibility(this$0.j ? 0 : 8);
        this$0.e.setVisibility(this$0.j ? 0 : 8);
        this$0.f.a(this$0.k);
        this$0.g.a(this$0.l);
        this$0.h.a(this$0.m);
        this$0.i.a(this$0.n);
    }

    public final void a(boolean z) {
        if (z == this.o) {
            return;
        }
        this.o = z;
        a();
    }

    public final void b(String str) {
        J j = this.f;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.audioOffButtonText(context);
        }
        j.b(str);
    }

    public final View c() {
        return this.b;
    }

    public final void d(String str) {
        J j = this.i;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.colorSchemeButtonContentDescription(context);
        }
        j.a(str);
    }

    public final void c(String str) {
        J j = this.f;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.audioOnButtonText(context);
        }
        j.c(str);
    }

    private static final void b(BarcodeCountToolbarViewHolder this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.j = false;
        this$0.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        this.b.post(new f(this, 0));
    }

    public final void a(String str) {
        J j = this.f;
        if (str == null) {
            BarcodeCountToolbarDefaults barcodeCountToolbarDefaults = this.p;
            Context context = this.b.getContext();
            Intrinsics.g(context, "rootView.context");
            str = barcodeCountToolbarDefaults.audioButtonContentDescription(context);
        }
        j.a(str);
    }

    public final void b(boolean z) {
        this.b.setVisibility(z ? 0 : 4);
    }

    private static final void a(BarcodeCountToolbarViewHolder this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.j = true;
        this$0.d();
    }

    public final void a() {
        int i;
        View view = this.c;
        int i2 = q;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        layoutParams.gravity = 17;
        if (this.o) {
            i = t;
        } else {
            i = s;
        }
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = r;
        view.setLayoutParams(layoutParams);
    }

    private final J a(Context context, int i, String str, boolean z, Function0 function0) {
        return a(context, i, str, str, z, function0);
    }

    private final J a(Context context, int i, String str, String str2, boolean z, Function0 function0) {
        J j = new J(context, this.e);
        j.a(i);
        j.c(str);
        j.b(str2);
        j.a(z);
        j.a(function0);
        this.e.addView(j.a());
        return j;
    }

    public final void a(L state) {
        Intrinsics.h(state, "state");
        this.k = state.a();
        this.l = state.c();
        this.m = state.d();
        this.n = state.b();
        d();
    }
}
