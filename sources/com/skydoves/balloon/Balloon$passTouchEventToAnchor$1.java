package com.skydoves.balloon;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "view", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "invoke", "(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Balloon$passTouchEventToAnchor$1 extends Lambda implements Function2<View, MotionEvent, Boolean> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        View view = (View) obj;
        MotionEvent event = (MotionEvent) obj2;
        Intrinsics.h(view, "view");
        Intrinsics.h(event, "event");
        view.performClick();
        new Rect();
        throw null;
    }
}
