package com.scandit.datacapture.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.extensions.AnchorExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FloatWithUnitExtensionsKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.core.t1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C1126t1 implements InterfaceC1117s1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Anchor[] f18872a;
    private static final Anchor[] b;
    private static final Anchor[] c;
    private static final Anchor[] d;

    static {
        Anchor anchor = Anchor.TOP_LEFT;
        Anchor anchor2 = Anchor.TOP_CENTER;
        Anchor anchor3 = Anchor.CENTER_LEFT;
        Anchor anchor4 = Anchor.CENTER;
        Anchor anchor5 = Anchor.BOTTOM_LEFT;
        Anchor anchor6 = Anchor.BOTTOM_CENTER;
        f18872a = new Anchor[]{anchor, anchor2, anchor3, anchor4, anchor5, anchor6};
        Anchor anchor7 = Anchor.TOP_RIGHT;
        Anchor anchor8 = Anchor.CENTER_RIGHT;
        Anchor anchor9 = Anchor.BOTTOM_RIGHT;
        b = new Anchor[]{anchor7, anchor8, anchor9};
        c = new Anchor[]{anchor7, anchor2, anchor};
        d = new Anchor[]{anchor3, anchor4, anchor8, anchor5, anchor6, anchor9};
    }

    public final void a(View view, Anchor anchor, PointWithUnit offset, Size2 containerSize) {
        Intrinsics.h(view, "view");
        Intrinsics.h(anchor, "anchor");
        Intrinsics.h(offset, "offset");
        Intrinsics.h(containerSize, "containerSize");
        Context context = view.getContext();
        Intrinsics.g(context, "view.context");
        float displayDensity = ContextExtensionsKt.getDisplayDensity(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(view.getLayoutParams());
        layoutParams.gravity = AnchorExtensionsKt.toGravity(anchor);
        FloatWithUnit x = offset.getX();
        Intrinsics.g(x, "offset.x");
        float width = containerSize.getWidth();
        if (ArraysKt.l(f18872a, anchor)) {
            layoutParams.setMarginStart((int) FloatWithUnitExtensionsKt.toPixels(x, width, displayDensity));
        }
        FloatWithUnit x2 = offset.getX();
        Intrinsics.g(x2, "offset.x");
        float width2 = containerSize.getWidth();
        if (ArraysKt.l(b, anchor)) {
            layoutParams.setMarginEnd((int) FloatWithUnitExtensionsKt.toPixels(x2, width2, displayDensity));
        }
        FloatWithUnit y = offset.getY();
        Intrinsics.g(y, "offset.y");
        float height = containerSize.getHeight();
        if (ArraysKt.l(c, anchor)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) FloatWithUnitExtensionsKt.toPixels(y, height, displayDensity);
        }
        FloatWithUnit y2 = offset.getY();
        Intrinsics.g(y2, "offset.y");
        float height2 = containerSize.getHeight();
        if (ArraysKt.l(d, anchor)) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) FloatWithUnitExtensionsKt.toPixels(y2, height2, displayDensity);
        }
        view.setLayoutParams(layoutParams);
        view.invalidate();
    }
}
