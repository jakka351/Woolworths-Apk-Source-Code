package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.dynatrace.android.callback.Callback;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class W1 extends LinearLayout {
    private static final int e = Color.parseColor("#59595966");
    private static final Lazy f = LazyKt.b(U1.f17311a);
    private static final Lazy g = LazyKt.b(V1.f17324a);
    private List b;
    private float c;
    private Function1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        this.b = EmptyList.d;
        setHorizontalGravity(17);
        setVerticalGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(e);
        gradientDrawable.setCornerRadius(90.0f);
        setBackground(gradientDrawable);
        setShowDividers(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$b$-Ljava-util-List-F-V, reason: not valid java name */
    public static /* synthetic */ void m289instrumented$0$b$LjavautilListFV(W1 w1, View view) {
        Callback.g(view);
        try {
            a(w1, view);
        } finally {
            Callback.h();
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable state) {
        Intrinsics.h(state, "state");
        Bundle bundle = (Bundle) state;
        if (Build.VERSION.SDK_INT >= 33) {
            super.onRestoreInstanceState((Parcelable) bundle.getParcelable("superState", Parcelable.class));
        } else {
            super.onRestoreInstanceState(bundle.getParcelable("superState"));
        }
        float[] floatArray = bundle.getFloatArray("zoomLevels");
        List listI0 = floatArray != null ? ArraysKt.i0(floatArray) : null;
        float f2 = bundle.getFloat("currentZoomLevel");
        if (listI0 != null) {
            List listT0 = CollectionsKt.t0(CollectionsKt.w(listI0));
            this.b = listT0;
            b(listT0, f2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        bundle.putFloatArray("zoomLevels", CollectionsKt.D0(this.b));
        bundle.putFloat("currentZoomLevel", this.c);
        return bundle;
    }

    public final void a(Function1 function1) {
        this.d = function1;
    }

    private final void b(List list, float f2) {
        int childCount;
        int size;
        int iIntValue;
        if (list.size() > getChildCount()) {
            int size2 = list.size();
            for (int childCount2 = getChildCount(); childCount2 < size2; childCount2++) {
                Context context = getContext();
                Intrinsics.g(context, "context");
                View ne = new Ne(context);
                ne.setOnClickListener(new df(this, 10));
                addView(ne, new LinearLayout.LayoutParams(0, 0));
            }
        } else if (list.size() < getChildCount() && (size = list.size()) <= (childCount = getChildCount() - 1)) {
            while (true) {
                removeViewAt(childCount);
                if (childCount == size) {
                    break;
                } else {
                    childCount--;
                }
            }
        }
        int size3 = list.size();
        for (int i = 0; i < size3; i++) {
            View childAt = getChildAt(i);
            Intrinsics.f(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.camera.ZoomButton");
            Ne ne2 = (Ne) childAt;
            float fFloatValue = ((Number) list.get(i)).floatValue();
            ne2.a(fFloatValue);
            boolean z = Math.abs(fFloatValue - f2) < 0.001f;
            ne2.setSelected(z);
            if (z) {
                this.c = fFloatValue;
            }
        }
        if (list.size() == 2) {
            iIntValue = ((Number) f.getD()).intValue();
        } else {
            iIntValue = ((Number) g.getD()).intValue();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setAlpha(0);
        shapeDrawable.setIntrinsicWidth(iIntValue);
        shapeDrawable.setIntrinsicHeight(iIntValue);
        setDividerDrawable(shapeDrawable);
    }

    public final void a(List zoomLevels, float f2) {
        Intrinsics.h(zoomLevels, "zoomLevels");
        List listT0 = CollectionsKt.t0(CollectionsKt.w(zoomLevels));
        this.b = listT0;
        b(listT0, f2);
    }

    private static final void a(W1 this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Intrinsics.f(view, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.camera.ZoomButton");
        Ne ne = (Ne) view;
        int childCount = this$0.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this$0.getChildAt(i);
            Intrinsics.f(childAt, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.find.ui.camera.ZoomButton");
            Ne ne2 = (Ne) childAt;
            ne2.setSelected(ne2.equals(ne));
        }
        this$0.c = ne.a();
        Function1 function1 = this$0.d;
        if (function1 != null) {
            function1.invoke(Float.valueOf(ne.a()));
        }
    }
}
