package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Ja extends RelativeLayout {
    private final ImageView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ja(Context context) {
        super(context);
        Intrinsics.h(context, "context");
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Gc.h(), Gc.h());
        layoutParams.addRule(13);
        addView(imageView, layoutParams);
    }

    public final void a(StateListDrawable drawable) {
        Intrinsics.h(drawable, "drawable");
        this.b.setImageDrawable(drawable);
    }

    public final void a(boolean z) {
        int iH;
        if (z) {
            iH = Gc.g();
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            iH = Gc.h();
        }
        ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
        layoutParams.width = iH;
        layoutParams.height = iH;
    }
}
