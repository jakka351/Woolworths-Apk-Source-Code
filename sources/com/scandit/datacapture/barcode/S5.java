package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindItem;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes6.dex */
public final class S5 extends RelativeLayout {
    private static final Lazy g;
    private static final Lazy h;
    private static final Lazy i;
    public static final /* synthetic */ int j = 0;
    private List b;
    private final TextView c;
    private final X6 d;
    private final C0877ud e;
    private boolean f;

    static {
        new G5(0);
        g = LazyKt.b(D5.f17133a);
        h = LazyKt.b(E5.f17146a);
        i = LazyKt.b(F5.f17158a);
    }

    public /* synthetic */ S5(Context context) {
        this(context, null, 0);
    }

    private final void f() {
        View view = this.d;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.c.getId());
        layoutParams.addRule(12);
        view.setLayoutParams(layoutParams);
        addView(view);
        View view2 = this.e;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(3, this.c.getId());
        layoutParams2.addRule(12);
        view2.setLayoutParams(layoutParams2);
        addView(view2);
        View view3 = this.c;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, ((Number) g.getD()).intValue());
        layoutParams3.addRule(10, -1);
        layoutParams3.addRule(14, -1);
        view3.setLayoutParams(layoutParams3);
        addView(view3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-util-AttributeSet-I-V, reason: not valid java name */
    public static /* synthetic */ void m285x4de12e11(S5 s5, View view) {
        Callback.g(view);
        try {
            a(s5, view);
        } finally {
            Callback.h();
        }
    }

    public final List d() {
        return this.b;
    }

    public final void e() {
        this.d.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S5(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.h(context, "context");
        this.b = EmptyList.d;
        TextView textView = new TextView(context);
        textView.setId(R.id.sc_collapse_button);
        textView.setBackground(context.getDrawable(R.drawable.sc_collapse_button_background));
        textView.setText(R.string.sc_barcode_find_collapse_cards);
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(context.getDrawable(R.drawable.sc_arrow_down), (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setCompoundDrawablePadding(G5.a());
        textView.setPadding(G5.a(), 0, G5.a(), 0);
        textView.setGravity(16);
        textView.setOnClickListener(new df(this, 7));
        textView.setVisibility(4);
        this.c = textView;
        X6 x6 = new X6(context);
        x6.a(new M5(this));
        x6.setVisibility(4);
        this.d = x6;
        C0877ud c0877ud = new C0877ud(context);
        c0877ud.a(new R5(c0877ud, this));
        c0877ud.setVisibility(0);
        this.e = c0877ud;
        this.f = true;
        f();
    }

    public final void a(List value) {
        Intrinsics.h(value, "value");
        this.b = value;
        this.e.a(value);
        this.d.a(value);
    }

    private static final void a(S5 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        if (this$0.f) {
            return;
        }
        this$0.a(true, true);
    }

    public final void a(boolean z, boolean z2) {
        if (z == this.f) {
            return;
        }
        if (!z2) {
            if (z) {
                this.f = true;
                this.d.setVisibility(8);
                this.e.setVisibility(0);
                this.e.a(true);
                this.c.setVisibility(4);
                return;
            }
            this.f = false;
            this.d.setSelection(0);
            this.d.scrollTo(0, 0);
            this.d.setVisibility(0);
            this.e.setVisibility(8);
            this.e.a(false);
            return;
        }
        if (z) {
            a(0, H5.f17181a);
            return;
        }
        this.c.setVisibility(0);
        this.c.setAlpha(BitmapDescriptorFactory.HUE_RED);
        TextView textView = this.c;
        float height = getHeight();
        int i2 = C5.j;
        textView.setTranslationY(height - B5.a());
        this.d.setSelection(0);
        this.d.scrollTo(0, 0);
        float fC = this.e.c();
        TextView textView2 = this.c;
        this.e.a(new K5(AbstractC0611f.b(textView2, C0527b.a(AbstractC0511a.a(textView2), 1.0f, fC))), new L5(this));
    }

    public final void a(BarcodeFindItem item) {
        Intrinsics.h(item, "item");
        Iterator it = this.b.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.c(((C0914x5) it.next()).c(), item)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 <= 0) {
            a(true, true);
        } else if (!this.f) {
            a(i2, new O5(this, item));
        } else {
            this.e.a(i2, new Q5(this, item));
        }
    }

    private final void a(int i2, Function0 function0) {
        int top;
        this.d.setVisibility(8);
        this.e.setVisibility(0);
        int firstVisiblePosition = this.d.getFirstVisiblePosition();
        int lastVisiblePosition = this.d.getLastVisiblePosition();
        X6 x6 = this.d;
        if (x6.getChildCount() == 0) {
            top = 0;
        } else {
            View childAt = x6.getChildAt(0);
            Intrinsics.g(childAt, "getChildAt(0)");
            top = childAt.getTop() - x6.getPaddingTop();
        }
        TextView view = this.c;
        Intrinsics.h(view, "view");
        C0527b c0527b = new C0527b(view.getAlpha(), view.getElevation(), view.getScaleX(), view.getTranslationY());
        float height = getHeight();
        int i3 = C5.j;
        Function1 function1B = AbstractC0611f.b(this.c, C0527b.a(c0527b, BitmapDescriptorFactory.HUE_RED, height - B5.a()));
        this.d.fling(0);
        this.e.a(new IntRange(firstVisiblePosition, lastVisiblePosition, 1), top, i2, new I5(function1B), new J5(this, function0));
    }

    public final void a(String str) {
        TextView textView = this.c;
        if (str == null) {
            str = getContext().getString(R.string.sc_barcode_find_collapse_cards);
        }
        textView.setText(str);
    }
}
