package com.scandit.datacapture.core.internal.sdk.extensions;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0003\u001a\u0018\u0010\u000f\u001a\u00020\u000e*\u00020\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011\"*\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006\"*\u0010\u0007\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018Æ\u0002@Æ\u0002X\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\u0006\"\u0015\u0010\t\u001a\u00020\n*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"value", "", "isGone", "Landroid/view/View;", "(Landroid/view/View;)Z", "setGone", "(Landroid/view/View;Z)V", "isInvisible", "setInvisible", "orientation", "", "getOrientation", "(Landroid/view/View;)I", "removeFromSuperview", "", "runOnMainThread", "block", "Lkotlin/Function0;", "scandit-capture-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ViewExtensionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    public static final int getOrientation(@NotNull View view) {
        Intrinsics.h(view, "<this>");
        Context context = view.getContext();
        Intrinsics.g(context, "context");
        return ContextExtensionsKt.getOrientation(context);
    }

    public static final boolean isGone(@NotNull View view) {
        Intrinsics.h(view, "<this>");
        return view.getVisibility() == 8;
    }

    public static final boolean isInvisible(@NotNull View view) {
        Intrinsics.h(view, "<this>");
        return view.getVisibility() == 4;
    }

    public static final void removeFromSuperview(@NotNull View view) {
        Intrinsics.h(view, "<this>");
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public static final void runOnMainThread(@NotNull View view, @NotNull Function0<Unit> block) {
        Intrinsics.h(view, "<this>");
        Intrinsics.h(block, "block");
        if (Intrinsics.c(Looper.myLooper(), Looper.getMainLooper())) {
            block.invoke();
        } else {
            view.post(new androidx.compose.ui.viewinterop.a(8, block));
        }
    }

    public static final void setGone(@NotNull View view, boolean z) {
        Intrinsics.h(view, "<this>");
        view.setVisibility(z ? 8 : 0);
    }

    public static final void setInvisible(@NotNull View view, boolean z) {
        Intrinsics.h(view, "<this>");
        view.setVisibility(z ? 4 : 0);
    }
}
