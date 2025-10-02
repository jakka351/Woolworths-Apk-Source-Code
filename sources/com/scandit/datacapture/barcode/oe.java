package com.scandit.datacapture.barcode;

import android.content.Context;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class oe extends LinearLayout {
    private static final int i = PixelExtensionsKt.pxFromDp$default(-2, (Context) null, 1, (Object) null);
    private static final int j = PixelExtensionsKt.pxFromDp$default(-5, (Context) null, 1, (Object) null);
    private EnumC0754ne b;
    private final ImageView c;
    private final ImageView d;
    private final ImageView e;
    private ViewPropertyAnimator f;
    private ViewPropertyAnimator g;
    private ViewPropertyAnimator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oe(Context context) {
        super(context, null, 0);
        Intrinsics.h(context, "context");
        this.b = EnumC0754ne.UP;
        setOrientation(1);
        ImageView imageView = new ImageView(context);
        addView(imageView);
        this.c = imageView;
        ImageView imageView2 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i, 0, 0);
        imageView2.setLayoutParams(layoutParams);
        addView(imageView2);
        this.d = imageView2;
        ImageView imageView3 = new ImageView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, j, 0, 0);
        imageView3.setLayoutParams(layoutParams2);
        addView(imageView3);
        this.e = imageView3;
    }

    public final void a(EnumC0754ne enumC0754ne) {
        Intrinsics.h(enumC0754ne, "<set-?>");
        this.b = enumC0754ne;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.g;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = this.h;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        this.f = null;
        this.g = null;
        this.h = null;
    }

    public final void a() {
        ViewPropertyAnimator viewPropertyAnimator = this.f;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.g;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        ViewPropertyAnimator viewPropertyAnimator3 = this.h;
        if (viewPropertyAnimator3 != null) {
            viewPropertyAnimator3.cancel();
        }
        int iOrdinal = this.b.ordinal();
        long j2 = 667;
        long j3 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            j3 = 667;
            j2 = 0;
        }
        this.f = a(this.c, j2);
        this.g = a(this.d, 333L);
        this.h = a(this.e, j3);
    }

    private final ViewPropertyAnimator a(View view, long j2) {
        view.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = view.animate().setDuration(1667L).setInterpolator(new LinearInterpolator()).alpha(BitmapDescriptorFactory.HUE_RED).setStartDelay(j2).withEndAction(new cf(2, this, view));
        viewPropertyAnimatorWithEndAction.start();
        return viewPropertyAnimatorWithEndAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(oe this$0, View this_with) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.h(this_with, "$this_with");
        this$0.a(this_with, 0L);
    }

    public final void a(int i2, int i3, int i4) {
        this.c.setImageResource(i2);
        this.d.setImageResource(i3);
        this.e.setImageResource(i4);
    }
}
