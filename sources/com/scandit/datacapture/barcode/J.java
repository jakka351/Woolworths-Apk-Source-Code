package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class J {
    private static final int g = Color.parseColor("#FBC02C");
    private static final int h = Color.parseColor("#FFFFFF");

    /* renamed from: a, reason: collision with root package name */
    private final View f17200a;
    private final ImageView b;
    private final TextView c;
    private String d;
    private String e;
    private boolean f;

    public J(Context context, LinearLayout linearLayout) {
        Intrinsics.h(context, "context");
        this.d = "";
        this.e = "";
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sc_barcode_count_toolbar_item, (ViewGroup) linearLayout, false);
        Intrinsics.g(viewInflate, "from(context)\n          …em, containerView, false)");
        this.f17200a = viewInflate;
        View viewFindViewById = viewInflate.findViewById(R.id.icon);
        Intrinsics.g(viewFindViewById, "rootView.findViewById(R.id.icon)");
        this.b = (ImageView) viewFindViewById;
        View viewFindViewById2 = viewInflate.findViewById(R.id.title);
        Intrinsics.g(viewFindViewById2, "rootView.findViewById(R.id.title)");
        this.c = (TextView) viewFindViewById2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$a$-Lkotlin-jvm-functions-Function0--V, reason: not valid java name */
    public static /* synthetic */ void m274instrumented$0$a$LkotlinjvmfunctionsFunction0V(Function0 function0, View view) {
        Callback.g(view);
        try {
            a(function0, view);
        } finally {
            Callback.h();
        }
    }

    public final void b(String value) {
        Intrinsics.h(value, "value");
        this.e = value;
        b();
    }

    public final void c(String value) {
        Intrinsics.h(value, "value");
        this.d = value;
        b();
    }

    public final View a() {
        return this.f17200a;
    }

    private final void b() {
        if (this.f) {
            this.b.setSelected(true);
            ImageView imageView = this.b;
            int i = g;
            imageView.setColorFilter(i);
            this.c.setTextColor(i);
            this.c.setText(this.d);
            return;
        }
        this.b.setSelected(false);
        ImageView imageView2 = this.b;
        int i2 = h;
        imageView2.setColorFilter(i2);
        this.c.setTextColor(i2);
        this.c.setText(this.e);
    }

    public final void a(int i) {
        this.b.setImageResource(i);
        b();
    }

    public final void a(String value) {
        Intrinsics.h(value, "value");
        this.c.setContentDescription(value);
    }

    public final void a(boolean z) {
        this.f = z;
        b();
    }

    public final void a(Function0 listener) {
        Intrinsics.h(listener, "listener");
        this.f17200a.setOnClickListener(new df(listener, 5));
    }

    private static final void a(Function0 listener, View view) {
        Intrinsics.h(listener, "$listener");
        listener.invoke();
    }
}
