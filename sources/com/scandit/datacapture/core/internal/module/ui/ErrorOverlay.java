package com.scandit.datacapture.core.internal.module.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.scandit.datacapture.core.U1;
import com.scandit.datacapture.core.internal.sdk.utils.PixelExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ErrorOverlay extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final U1 f18592a;

    public /* synthetic */ ErrorOverlay(Context context) {
        this(context, null, 0);
    }

    public final void a(String string) {
        Intrinsics.h(string, "string");
        this.f18592a.setText(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.h(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        setBackgroundColor(1996488704);
        U1 u1 = new U1(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        u1.setGravity(17);
        u1.setLayoutParams(layoutParams);
        u1.setTextAlignment(4);
        u1.setTextColor(-1);
        u1.setBackgroundColor(0);
        int iPxFromDp$default = PixelExtensionsKt.pxFromDp$default(20, (Context) null, 1, (Object) null);
        u1.setPadding(iPxFromDp$default, iPxFromDp$default, iPxFromDp$default, iPxFromDp$default);
        u1.setTextSize(25.0f);
        u1.setAlpha(0.5f);
        this.f18592a = u1;
        addView(u1);
    }
}
