package com.scandit.datacapture.barcode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.dynatrace.android.callback.Callback;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class X6 extends ListView implements AbsListView.OnScrollListener {
    private Function1 b;
    private List c;
    private final W6 d;
    private final View.OnClickListener e;

    public /* synthetic */ X6(Context context) {
        this(context, null, 0);
    }

    private static final void a(X6 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-util-AttributeSet-I-V, reason: not valid java name */
    public static /* synthetic */ void m291x4de12e11(X6 x6, View view) {
        Callback.g(view);
        try {
            a(x6, view);
        } finally {
            Callback.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        if (getChildCount() != 0 && getFirstVisiblePosition() <= 0) {
            View childAt = getChildAt(0);
            Intrinsics.g(childAt, "getChildAt(0)");
            if (((int) ev.getY()) < childAt.getTop()) {
                return false;
            }
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        Function1 function1 = this.b;
        if (function1 != null) {
            int paddingTop = 0;
            if (getChildCount() != 0) {
                View childAt = getChildAt(0);
                Intrinsics.g(childAt, "getChildAt(0)");
                paddingTop = getPaddingTop() + ((childAt.getHeight() * getFirstVisiblePosition()) - childAt.getTop());
            }
            function1.invoke(Integer.valueOf(paddingTop));
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.c = EmptyList.d;
        W6 w6 = new W6(this);
        this.d = w6;
        this.e = new lf(this, 1);
        setAdapter((ListAdapter) w6);
        setVerticalFadingEdgeEnabled(true);
        setClipChildren(false);
        setClipToPadding(false);
        setStackFromBottom(true);
        setVerticalScrollBarEnabled(false);
        setDivider(null);
        int i2 = S5.j;
        setDividerHeight(G5.b());
        setSelector(context.getDrawable(android.R.color.transparent));
        setFadingEdgeLength(G5.b());
        setPadding(G5.b(), G5.b(), G5.b(), G5.b());
        setOnScrollListener(this);
    }

    public final void a(Function1 function1) {
        this.b = function1;
    }

    public final List a() {
        return this.c;
    }

    public final void a(List value) {
        Intrinsics.h(value, "value");
        this.c = value;
        this.d.notifyDataSetChanged();
    }
}
