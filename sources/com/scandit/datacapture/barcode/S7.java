package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class S7 extends RelativeLayout {
    private final View b;
    private final TextView c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S7(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        View view = new View(context, attributeSet, i);
        view.setBackground(view.getResources().getDrawable(R.drawable.sc_button_list_ripple, context.getTheme()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null), PixelExtensionsKt.pxFromDp$default(40, (Context) null, 1, (Object) null));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        view.setLayoutParams(layoutParams);
        view.setId(View.generateViewId());
        this.b = view;
        TextView textView = new TextView(context);
        textView.setBackground(textView.getResources().getDrawable(R.drawable.sc_button_list_badge, context.getTheme()));
        textView.setTextSize(2, 12.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(1, (Context) null, 1, (Object) null);
        textView.setPadding(iPxFromDp$default, iPxFromDp$default, iPxFromDp$default, iPxFromDp$default);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(17, view.getId());
        layoutParams2.addRule(6, view.getId());
        textView.setLayoutParams(layoutParams2);
        textView.setVisibility(8);
        this.c = textView;
        setClickable(true);
        setFocusable(true);
        setContentDescription(BarcodeCountViewDefaults.INSTANCE.getListButtonContentDescription());
        addView(view);
        addView(textView);
    }

    public final int a() {
        Integer numI0 = StringsKt.i0(this.c.getText().toString());
        if (numI0 != null) {
            return numI0.intValue();
        }
        return 0;
    }

    public final void a(int i) {
        if (i <= 0) {
            this.c.setText("0");
            this.c.setVisibility(8);
            return;
        }
        this.c.setVisibility(0);
        String strValueOf = String.valueOf(i);
        if (strValueOf.length() > 3) {
            this.c.setText(getResources().getString(R.string.sc_button_list_badge_max, Integer.valueOf(((int) Math.pow(10.0d, 3)) - 1)));
        } else {
            this.c.setText(strValueOf);
        }
        int length = strValueOf.length();
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(length != 1 ? length != 2 ? length != 3 ? -14 : -12 : -10 : -8, (Context) null, 1, (Object) null);
        int iPxFromDp$default2 = PixelExtensionsKt.pxFromDp$default(length != 1 ? length != 2 ? length != 3 ? 38 : 27 : 20 : 18, (Context) null, 1, (Object) null);
        TextView textView = this.c;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iPxFromDp$default2, -2);
        layoutParams.setMarginStart(iPxFromDp$default);
        layoutParams.addRule(17, this.b.getId());
        layoutParams.addRule(6, this.b.getId());
        textView.setLayoutParams(layoutParams);
    }
}
