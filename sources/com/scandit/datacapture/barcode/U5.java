package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class U5 extends LinearLayout {
    private final TextView b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        this.b = textView;
        setOrientation(0);
        setPadding(PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(12, (Context) null, 1, (Object) null));
        setBackground(getResources().getDrawable(R.drawable.sc_button_clear_ripple, context.getTheme()));
        BarcodeCountViewDefaults barcodeCountViewDefaults = BarcodeCountViewDefaults.INSTANCE;
        setContentDescription(barcodeCountViewDefaults.getClearHighlightsButtonContentDescription());
        imageView.setImageResource(R.drawable.sc_ic_clear_screen);
        imageView.setAdjustViewBounds(true);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginEnd(PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null));
        layoutParams.gravity = 16;
        addView(imageView, layoutParams);
        textView.setText(barcodeCountViewDefaults.getClearHighlightsButtonText());
        textView.setTextColor(-1);
        textView.setTextSize(2, 14.0f);
        textView.setTypeface(textView.getTypeface(), 1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 16;
        addView(textView, layoutParams2);
    }

    public final void a(String str) {
        this.b.setText(str);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.5f);
    }
}
