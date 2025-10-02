package com.scandit.datacapture.barcode;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class He {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f17187a;
    private final Handler b;

    public He(ViewGroup container) {
        Intrinsics.h(container, "container");
        this.f17187a = container;
        this.b = new Handler(Looper.getMainLooper());
    }

    public final ViewGroup a() {
        return this.f17187a;
    }

    public final void a(Function0 creator, View view) {
        Intrinsics.h(creator, "creator");
        if (view == null) {
            View view2 = (View) creator.invoke();
            if (view2 != null) {
                this.f17187a.addView(view2);
                return;
            }
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        this.f17187a.addView(view);
    }

    public final View b(Function1 action) {
        Intrinsics.h(action, "action");
        Context context = this.f17187a.getContext();
        Intrinsics.g(context, "container.context");
        return (View) action.invoke(context);
    }

    public final void a(Function1 action) {
        Intrinsics.h(action, "action");
        this.b.post(new cf(0, action, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function1 action, He this$0) {
        Intrinsics.h(action, "$action");
        Intrinsics.h(this$0, "this$0");
        action.invoke(this$0.f17187a);
    }
}
