package com.scandit.datacapture.barcode;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class re extends LinearLayout {
    private static final Lazy e = LazyKt.b(qe.f17984a);
    private final ImageView b;
    private final oe c;
    private final TextView d;

    public /* synthetic */ re(Context context) {
        this(context, null, 0);
    }

    private final ImageView b(Context context) {
        ImageView imageView = new ImageView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = PixelExtensionsKt.pxFromDp$default(10, (Context) null, 1, (Object) null);
        imageView.setLayoutParams(layoutParams);
        setGravity(17);
        imageView.setAdjustViewBounds(true);
        return imageView;
    }

    private static TextView c(Context context) {
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(((Number) e.getD()).intValue(), -2);
        layoutParams.setMarginStart(48);
        layoutParams.setMarginEnd(48);
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(17);
        M.a(textView);
        return textView;
    }

    public final void a() {
        pe userGuidanceState = pe.Hidden;
        Intrinsics.h(userGuidanceState, "userGuidanceState");
        a(userGuidanceState, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setOrientation(1);
        ImageView imageViewB = b(context);
        addView(imageViewB);
        this.b = imageViewB;
        oe oeVarA = a(context);
        addView(oeVarA);
        this.c = oeVarA;
        TextView textViewC = c(context);
        addView(textViewC);
        this.d = textViewC;
    }

    private static oe a(Context context) {
        Intrinsics.h(context, "context");
        oe oeVar = new oe(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = PixelExtensionsKt.pxFromDp$default(10, (Context) null, 1, (Object) null);
        oeVar.setLayoutParams(layoutParams);
        oeVar.setGravity(17);
        return oeVar;
    }

    public final void a(pe userGuidanceState, String text) {
        Intrinsics.h(userGuidanceState, "userGuidanceState");
        Intrinsics.h(text, "text");
        int iOrdinal = userGuidanceState.ordinal();
        if (iOrdinal == 0) {
            setVisibility(8);
        } else if (iOrdinal == 1) {
            setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.c.a(R.drawable.sc_ic_move_away_top, R.drawable.sc_ic_move_away_mid, R.drawable.sc_ic_move_away_bot);
            this.c.a(EnumC0754ne.DOWN);
        } else if (iOrdinal == 2) {
            setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(0);
            this.c.a(R.drawable.sc_ic_move_closer_top, R.drawable.sc_ic_move_closer_mid, R.drawable.sc_ic_move_closer_bot);
            this.c.a(EnumC0754ne.UP);
        } else if (iOrdinal == 3) {
            setVisibility(0);
            this.b.setVisibility(0);
            this.c.setVisibility(8);
            this.b.setImageResource(R.drawable.sc_ic_tap_anywhere);
        } else if (iOrdinal == 4) {
            setVisibility(0);
            this.b.setVisibility(8);
            this.c.setVisibility(8);
        }
        this.d.setText(text);
        this.c.a();
    }
}
