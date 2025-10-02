package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.q8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0797q8 implements InterfaceC0732m8 {
    private static final Lazy c = LazyKt.b(C0779p8.f17882a);
    private static final Lazy d = LazyKt.b(C0764o8.f17872a);

    /* renamed from: a, reason: collision with root package name */
    private final Context f17981a;
    private final String b;

    public C0797q8(Context context, String loadingText) {
        Intrinsics.h(context, "context");
        Intrinsics.h(loadingText, "loadingText");
        this.f17981a = context;
        this.b = loadingText;
    }

    private static final void a(View view) {
    }

    private final FrameLayout c() {
        FrameLayout frameLayout = new FrameLayout(this.f17981a);
        frameLayout.setPadding(((Number) c.getD()).intValue(), ((Number) c.getD()).intValue(), ((Number) c.getD()).intValue(), ((Number) c.getD()).intValue());
        frameLayout.setOnClickListener(new rf(1));
        frameLayout.setBackgroundColor(Color.parseColor("#66000000"));
        return frameLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$c$--Landroid-widget-FrameLayout-, reason: not valid java name */
    public static /* synthetic */ void m301instrumented$0$c$LandroidwidgetFrameLayout(View view) {
        Callback.g(view);
        try {
            a(view);
        } finally {
            Callback.h();
        }
    }

    @Override // com.scandit.datacapture.barcode.InterfaceC0732m8
    public final FrameLayout a() {
        FrameLayout frameLayoutC = c();
        LinearLayout linearLayout = new LinearLayout(this.f17981a);
        Lazy lazy = c;
        linearLayout.setPadding(((Number) lazy.getD()).intValue(), ((Number) lazy.getD()).intValue(), ((Number) lazy.getD()).intValue(), ((Number) lazy.getD()).intValue());
        linearLayout.setBackgroundColor(Color.parseColor("#CC121619"));
        linearLayout.setOrientation(0);
        linearLayout.setGravity(8388627);
        linearLayout.setElevation(((Number) d.getD()).floatValue());
        linearLayout.addView(new ProgressBar(this.f17981a), new ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(new View(this.f17981a), new ViewGroup.LayoutParams(((Number) lazy.getD()).intValue(), 0));
        TextView textView = new TextView(this.f17981a);
        textView.setText(this.b);
        textView.setTextColor(-1);
        linearLayout.addView(textView, new ViewGroup.LayoutParams(-1, -2));
        frameLayoutC.addView(linearLayout, new FrameLayout.LayoutParams(this.f17981a.getResources().getDimensionPixelSize(R.dimen.sc_loading_dialog), -2, 17));
        return frameLayoutC;
    }
}
