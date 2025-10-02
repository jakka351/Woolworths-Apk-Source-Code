package com.scandit.datacapture.core.internal.module.ui.control;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.dynatrace.android.callback.Callback;
import com.scandit.datacapture.core.Q7;
import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ToggleImageButton extends ImageButton {
    private static final Lazy d;
    private static final Lazy e;
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f18620a;
    private Function0 b;
    private Function0 c;

    static {
        new Q7(0);
        d = LazyKt.b(a.f18621a);
        e = LazyKt.b(b.f18622a);
    }

    public /* synthetic */ ToggleImageButton(Context context) {
        this(context, Q7.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: instrumented$0$new$-Landroid-content-Context-Landroid-view-ViewGroup$LayoutParams--V, reason: not valid java name */
    public static /* synthetic */ void m305x7ac5cb9(ToggleImageButton toggleImageButton, View view) {
        Callback.g(view);
        try {
            a(toggleImageButton, view);
        } finally {
            Callback.h();
        }
    }

    public final boolean c() {
        return this.f18620a;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.h(event, "event");
        if (event.getAction() == 0 && !this.f18620a) {
            this.f18620a = true;
            Function0 function0 = this.b;
            if (function0 != null) {
                function0.invoke();
            }
        } else if ((event.getAction() == 1 || event.getAction() == 3) && this.f18620a) {
            this.f18620a = false;
            Function0 function02 = this.b;
            if (function02 != null) {
                function02.invoke();
            }
        }
        return super.onTouchEvent(event);
    }

    private static final void a(ToggleImageButton this$0, View view) {
        Intrinsics.h(this$0, "this$0");
        Function0 function0 = this$0.c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleImageButton(Context context, ViewGroup.LayoutParams initialParams) {
        super(context);
        Intrinsics.h(context, "context");
        Intrinsics.h(initialParams, "initialParams");
        setLayoutParams(initialParams);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setBackground(new ColorDrawable(0));
        setPadding(0, 0, 0, 0);
        setOnClickListener(new au.com.woolworths.base.shopapp.customviews.a(this, 16));
    }

    public final void a(Function0 block) {
        Intrinsics.h(block, "block");
        this.b = block;
    }

    public final void b(Function0 block) {
        Intrinsics.h(block, "block");
        this.c = block;
    }

    public final void a(boolean z) {
        ViewExtensionsKt.runOnMainThread(this, new c(this, z));
    }

    public final void a(Bitmap bitmap) {
        ViewExtensionsKt.runOnMainThread(this, new d(bitmap, this));
    }
}
