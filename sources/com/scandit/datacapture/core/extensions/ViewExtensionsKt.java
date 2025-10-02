package com.scandit.datacapture.core.extensions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroid/view/View;", "", "hideImages", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class ViewExtensionsKt {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0046, code lost:
    
        if (((r3 != null ? r3.getCurrent() : null) instanceof android.graphics.drawable.BitmapDrawable) != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final boolean a(android.view.View r5) {
        /*
            android.graphics.drawable.Drawable r0 = r5.getBackground()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L9
            goto L27
        L9:
            boolean r3 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r3 == 0) goto Le
            goto L22
        Le:
            boolean r3 = r0 instanceof android.graphics.drawable.DrawableContainer
            if (r3 == 0) goto L15
            android.graphics.drawable.DrawableContainer r0 = (android.graphics.drawable.DrawableContainer) r0
            goto L16
        L15:
            r0 = r2
        L16:
            if (r0 == 0) goto L1d
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            goto L1e
        L1d:
            r0 = r2
        L1e:
            boolean r0 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L27
        L22:
            r5.setBackground(r2)
            r0 = r1
            goto L28
        L27:
            r0 = 0
        L28:
            android.graphics.drawable.Drawable r3 = r5.getForeground()
            if (r3 != 0) goto L2f
            goto L4c
        L2f:
            boolean r4 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r4 == 0) goto L34
            goto L48
        L34:
            boolean r4 = r3 instanceof android.graphics.drawable.DrawableContainer
            if (r4 == 0) goto L3b
            android.graphics.drawable.DrawableContainer r3 = (android.graphics.drawable.DrawableContainer) r3
            goto L3c
        L3b:
            r3 = r2
        L3c:
            if (r3 == 0) goto L43
            android.graphics.drawable.Drawable r3 = r3.getCurrent()
            goto L44
        L43:
            r3 = r2
        L44:
            boolean r3 = r3 instanceof android.graphics.drawable.BitmapDrawable
            if (r3 == 0) goto L4c
        L48:
            r5.setForeground(r2)
            return r1
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scandit.datacapture.core.extensions.ViewExtensionsKt.a(android.view.View):boolean");
    }

    public static final boolean hideImages(@NotNull View view) {
        Intrinsics.h(view, "<this>");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(view);
        boolean z = false;
        while (!arrayDeque.isEmpty()) {
            View view2 = (View) arrayDeque.removeLast();
            if (!Intrinsics.c(view2.getTag(), "com.scandit.datacapture.core.overlay.keep")) {
                if (a(view2)) {
                    z = true;
                }
                if (view2 instanceof ImageView) {
                    view2.setVisibility(4);
                    ((ImageView) view2).setImageDrawable(null);
                    view2.setBackgroundResource(0);
                    z = true;
                } else if (view2 instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view2;
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        Intrinsics.g(childAt, "view.getChildAt(index)");
                        arrayDeque.addLast(childAt);
                    }
                }
            }
        }
        if (z) {
            a.f18493a.a();
        }
        return z;
    }
}
