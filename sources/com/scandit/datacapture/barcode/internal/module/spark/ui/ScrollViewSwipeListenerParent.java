package com.scandit.datacapture.barcode.internal.module.spark.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.scandit.datacapture.barcode.D8;
import com.scandit.datacapture.barcode.ViewOnTouchListenerC0829sa;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/scandit/datacapture/barcode/internal/module/spark/ui/ScrollViewSwipeListenerParent;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public class ScrollViewSwipeListenerParent extends FrameLayout {
    private final ViewOnTouchListenerC0829sa b;
    private Function1 c;
    private float d;
    private float e;
    private D8 f;
    private final int g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollViewSwipeListenerParent(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.h(context, "context");
    }

    /* renamed from: a, reason: from getter */
    public final Function1 getC() {
        return this.c;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev) {
        Intrinsics.h(ev, "ev");
        int action = ev.getAction();
        if (action == 0) {
            this.b.onTouch(this, ev);
            this.e = BitmapDescriptorFactory.HUE_RED;
            this.d = BitmapDescriptorFactory.HUE_RED;
            this.f = new D8(ev.getX(), ev.getY());
        } else if (action == 2) {
            D8 d8 = new D8(ev.getX(), ev.getY());
            this.d = Math.abs(d8.a() - this.f.a()) + this.d;
            float fAbs = Math.abs(d8.b() - this.f.b()) + this.e;
            this.e = fAbs;
            this.f = d8;
            float f = this.d;
            if (f > fAbs && f > this.g) {
                return true;
            }
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.h(event, "event");
        return this.b.onTouch(this, event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollViewSwipeListenerParent(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.h(context, "context");
    }

    public final void a(Function1 function1) {
        Intrinsics.h(function1, "<set-?>");
        this.c = function1;
    }

    public /* synthetic */ ScrollViewSwipeListenerParent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ScrollViewSwipeListenerParent(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        ViewOnTouchListenerC0829sa viewOnTouchListenerC0829sa = new ViewOnTouchListenerC0829sa(context);
        viewOnTouchListenerC0829sa.b(new a(this));
        this.b = viewOnTouchListenerC0829sa;
        this.c = b.f17780a;
        this.f = new D8(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
