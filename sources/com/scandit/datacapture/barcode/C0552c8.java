package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.c8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0552c8 extends LinearLayout {
    private int b;
    private int c;
    private final ProgressBar d;
    private final TextView e;

    public /* synthetic */ C0552c8(Context context) {
        this(context, null, 0);
    }

    public final void a(int i) {
        this.b = i;
        a();
    }

    public final void b(int i) {
        this.c = i;
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0552c8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setOrientation(0);
        setGravity(16);
        ProgressBar progressBar = new ProgressBar(context, null, android.R.attr.progressBarStyleHorizontal);
        progressBar.setIndeterminate(false);
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, PixelExtensionsKt.pxFromDp$default(7, (Context) null, 1, (Object) null), 1.0f));
        progressBar.setProgressDrawable(context.getDrawable(R.drawable.sc_progress_bar));
        addView(progressBar);
        this.d = progressBar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(PixelExtensionsKt.pxFromDp$default(36, (Context) null, 1, (Object) null), -2);
        layoutParams.leftMargin = PixelExtensionsKt.pxFromDp$default(8, (Context) null, 1, (Object) null);
        textView.setLayoutParams(layoutParams);
        textView.setGravity(8388613);
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        addView(textView);
        this.e = textView;
    }

    private final void a() {
        this.d.setMax(this.c);
        this.d.setProgress(this.b, true);
        TextView textView = this.e;
        String string = getContext().getString(R.string.sc_progressbar_count_format);
        Intrinsics.g(string, "context.getString(R.stri…progressbar_count_format)");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.B(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c)}, 2, string, textView);
    }
}
