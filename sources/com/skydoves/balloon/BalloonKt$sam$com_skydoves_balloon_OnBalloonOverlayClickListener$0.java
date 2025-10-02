package com.skydoves.balloon;

import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonKt$sam$com_skydoves_balloon_OnBalloonOverlayClickListener$0 implements OnBalloonOverlayClickListener, FunctionAdapter {
    public final /* synthetic */ Function0 d;

    public BalloonKt$sam$com_skydoves_balloon_OnBalloonOverlayClickListener$0(Function0 function) {
        Intrinsics.h(function, "function");
        this.d = function;
    }

    @Override // com.skydoves.balloon.OnBalloonOverlayClickListener
    public final /* synthetic */ void a() {
        this.d.invoke();
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OnBalloonOverlayClickListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(this.d, ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
