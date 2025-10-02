package com.skydoves.balloon;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonKt$sam$com_skydoves_balloon_OnBalloonOutsideTouchListener$0 implements OnBalloonOutsideTouchListener, FunctionAdapter {
    public final /* synthetic */ Function2 d;

    public BalloonKt$sam$com_skydoves_balloon_OnBalloonOutsideTouchListener$0(Function2 function2) {
        this.d = function2;
    }

    @Override // com.skydoves.balloon.OnBalloonOutsideTouchListener
    public final /* synthetic */ void a(View view, MotionEvent motionEvent) {
        this.d.invoke(view, motionEvent);
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OnBalloonOutsideTouchListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(this.d, ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
