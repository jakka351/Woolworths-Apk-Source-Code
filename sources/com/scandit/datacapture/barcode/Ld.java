package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.count.ui.view.BarcodeCountStatus;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Ld extends FrameLayout {
    private static final int e = PixelExtensionsKt.pxFromDp$default(16, (Context) null, 1, (Object) null);
    private boolean b;
    private ImageView c;
    private ImageView d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ld(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        a();
        b();
        a(false);
    }

    private final void b() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_ic_status_none);
        imageView.setAdjustViewBounds(true);
        imageView.setAlpha(BitmapDescriptorFactory.HUE_RED);
        imageView.setScaleX(BitmapDescriptorFactory.HUE_RED);
        imageView.setScaleY(BitmapDescriptorFactory.HUE_RED);
        this.d = imageView;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        View view = this.d;
        if (view != null) {
            addView(view, layoutParams);
        } else {
            Intrinsics.p("statusIcon");
            throw null;
        }
    }

    private final void a() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_ic_status_none);
        imageView.setAdjustViewBounds(true);
        this.c = imageView;
        int i = e;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        View view = this.c;
        if (view != null) {
            addView(view, layoutParams);
        } else {
            Intrinsics.p("baseIcon");
            throw null;
        }
    }

    public final void c(boolean z) {
        a(true, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(View view, boolean z, boolean z2, Function0 onCompletion) {
        Intrinsics.h(view, "$view");
        Intrinsics.h(onCompletion, "$onCompletion");
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            view.animate().setInterpolator(new LinearInterpolator()).setDuration(200L).scaleX(f).scaleY(f).withEndAction(new af(1, onCompletion)).start();
        } else {
            view.setScaleX(f);
            view.setScaleY(f);
        }
    }

    public final void a(BarcodeCountStatus status) {
        Intrinsics.h(status, "status");
        this.b = status != BarcodeCountStatus.NONE;
        post(new cf(1, this, status));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Ld this$0, BarcodeCountStatus status) {
        int i;
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(status, "$status");
        ImageView imageView = this$0.d;
        if (imageView != null) {
            switch (Hd.f17186a[status.ordinal()]) {
                case 1:
                    i = R.drawable.sc_ic_status_not_available;
                    break;
                case 2:
                    i = R.drawable.sc_ic_status_expired;
                    break;
                case 3:
                    i = R.drawable.sc_ic_status_fragile;
                    break;
                case 4:
                    i = R.drawable.sc_ic_status_quality_check;
                    break;
                case 5:
                    i = R.drawable.sc_ic_status_low_stock;
                    break;
                case 6:
                    i = R.drawable.sc_ic_status_wrong;
                    break;
                case 7:
                    i = R.drawable.sc_ic_status_none;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            imageView.setImageResource(i);
            return;
        }
        Intrinsics.p("statusIcon");
        throw null;
    }

    public final void b(boolean z) {
        a((View) this, true, z, (Function0) new Id(this, z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(View view, boolean z, boolean z2, Function0 onCompletion) {
        Intrinsics.h(view, "$view");
        Intrinsics.h(onCompletion, "$onCompletion");
        float f = z ? 1.0f : BitmapDescriptorFactory.HUE_RED;
        if (z2) {
            view.animate().setInterpolator(new LinearInterpolator()).setDuration(200L).alpha(f).withEndAction(new af(2, onCompletion)).start();
        } else {
            view.setAlpha(f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(boolean z, boolean z2) {
        if (this.b) {
            ImageView imageView = this.d;
            if (imageView != null) {
                a((View) imageView, z, z2, (Function0) Jd.f17210a);
                ImageView imageView2 = this.d;
                if (imageView2 != null) {
                    a(imageView2, z, z2, (Function0) Kd.f17219a);
                    return;
                } else {
                    Intrinsics.p("statusIcon");
                    throw null;
                }
            }
            Intrinsics.p("statusIcon");
            throw null;
        }
    }

    public final void a(boolean z) {
        a((View) this, false, z, (Function0) Jd.f17210a);
        a(false, z);
    }

    private final boolean a(View view, boolean z, boolean z2, Function0 function0) {
        return post(new hf(view, z, z2, function0, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    private final boolean a(ImageView imageView, boolean z, boolean z2, Function0 function0) {
        return post(new hf(imageView, z, z2, function0, 0));
    }
}
