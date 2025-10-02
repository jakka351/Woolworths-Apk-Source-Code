package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.vd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0892vd extends FrameLayout {
    private Function2 b;
    private boolean c;
    private boolean d;
    private final ImageView e;
    private final ImageView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0892vd(Context context, final boolean z, Function2 signalStatusModeEnabled) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(signalStatusModeEnabled, "signalStatusModeEnabled");
        this.b = signalStatusModeEnabled;
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.sc_button_status_enabled);
        imageView.setAdjustViewBounds(true);
        addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        this.e = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.sc_button_status_active);
        imageView2.setAdjustViewBounds(true);
        imageView2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        addView(imageView2, new FrameLayout.LayoutParams(-1, -1));
        this.f = imageView2;
        setContentDescription(BarcodeCountViewDefaults.INSTANCE.getStatusModeButtonContentDescription());
        setOnClickListener(new View.OnClickListener() { // from class: com.scandit.datacapture.barcode.tf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0892vd.m303x689fbbcf(this.d, z, view);
            }
        });
    }

    private static final void a(C0892vd this$0, boolean z, View view) {
        Intrinsics.h(this$0, "this$0");
        this$0.a(!this$0.c, true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-ZLkotlin-jvm-functions-Function2--V, reason: not valid java name */
    public static /* synthetic */ void m303x689fbbcf(C0892vd c0892vd, boolean z, View view) {
        Callback.g(view);
        try {
            a(c0892vd, z, view);
        } finally {
            Callback.h();
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.c) {
            setAlpha(z ? 1.0f : 0.5f);
        } else {
            this.e.setImageResource(z ? R.drawable.sc_button_status_enabled : R.drawable.sc_button_status_disabled);
        }
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            synchronized (this) {
                if (!this.d) {
                    this.d = true;
                    this.c = z;
                    this.e.animate().setDuration(300L).alpha(this.c ? 0.0f : 1.0f).withEndAction(new kf(this, 6)).start();
                    ViewPropertyAnimator duration = this.f.animate().setDuration(300L);
                    if (!this.c) {
                        f = 0.0f;
                    }
                    duration.alpha(f).start();
                    this.b.invoke(Boolean.valueOf(this.c), Boolean.valueOf(z2));
                }
            }
            return;
        }
        boolean z4 = this.c;
        this.c = !z4;
        this.e.setAlpha(!z4 ? 0.0f : 1.0f);
        this.f.setAlpha(this.c ? 1.0f : 0.0f);
        this.b.invoke(Boolean.valueOf(this.c), Boolean.valueOf(z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C0892vd this$0) {
        Intrinsics.h(this$0, "this$0");
        this$0.d = false;
    }
}
