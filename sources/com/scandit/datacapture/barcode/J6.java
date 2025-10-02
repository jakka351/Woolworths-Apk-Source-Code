package com.scandit.datacapture.barcode;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J6 extends RelativeLayout {
    private final View b;
    private final TextView c;

    public /* synthetic */ J6(Context context) {
        this(context, null, 0);
    }

    public final void a(String str) {
        if (str == null) {
            this.c.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
        } else {
            this.c.setText(str);
        }
    }

    public final void b(boolean z) {
        if (z) {
            this.c.setVisibility(0);
        } else {
            this.c.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        View view = new View(context, attributeSet, i);
        view.setBackground(view.getResources().getDrawable(R.drawable.sc_button_exit_ripple, context.getTheme()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        view.setLayoutParams(layoutParams);
        this.b = view;
        TextView textView = new TextView(context);
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setMaxWidth(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        textView.setMaxLines(1);
        textView.setHyphenationFrequency(0);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(12);
        layoutParams2.addRule(14);
        textView.setLayoutParams(layoutParams2);
        this.c = textView;
        setClickable(true);
        setFocusable(true);
        setContentDescription(context.getString(R.string.sc_button_exit_contentDescription));
        addView(view);
        addView(textView);
    }

    public final void a(boolean z) {
        if (z) {
            this.b.getBackground().setLevel(1);
        } else {
            this.b.getBackground().setLevel(0);
        }
    }
}
