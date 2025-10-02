package com.scandit.datacapture.barcode;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;

/* renamed from: com.scandit.datacapture.barcode.w9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0903w9 extends FrameLayout {
    public static final /* synthetic */ int h = 0;
    private final EnumC0873u9 b;
    private final ViewOnTouchListenerC0603e7 c;
    private final ImageView d;
    private final C0653h9 e;
    private int f;
    private int g;

    public /* synthetic */ C0903w9(Context context, int i, int i2, EnumC0873u9 enumC0873u9, int i3) {
        this(context, i, i2, enumC0873u9);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        setFocusable(z);
        this.d.setAlpha(z ? 1.0f : 0.5f);
    }

    private C0903w9(Context context, int i, int i2, EnumC0873u9 enumC0873u9) {
        super(context);
        this.b = enumC0873u9;
        this.c = new ViewOnTouchListenerC0603e7();
        this.f = PixelExtensionsKt.pxFromDp$default(i2, (Context) null, 1, (Object) null);
        this.g = PixelExtensionsKt.pxFromDp$default(i, (Context) null, 1, (Object) null);
        setClickable(true);
        setFocusable(true);
        this.e = AbstractC0605e9.a(this, this.f, this.g);
        this.d = a();
        b();
    }

    private final void b() {
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0888v9(this));
    }

    public final void a(I i) {
        this.c.a(i);
    }

    public final void a(boolean z) {
        if (z) {
            this.e.start();
        } else {
            this.e.stop();
        }
    }

    private final ImageView a() {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageResource(R.drawable.sc_button_shutter);
        imageView.setAdjustViewBounds(true);
        int i = this.g;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(imageView, layoutParams);
        return imageView;
    }
}
