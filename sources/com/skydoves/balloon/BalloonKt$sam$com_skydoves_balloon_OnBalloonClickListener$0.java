package com.skydoves.balloon;

import android.view.View;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0 implements OnBalloonClickListener, FunctionAdapter {
    public final /* synthetic */ Function1 d;

    public BalloonKt$sam$com_skydoves_balloon_OnBalloonClickListener$0(Function1 function1) {
        this.d = function1;
    }

    @Override // com.skydoves.balloon.OnBalloonClickListener
    public final /* synthetic */ void a(View view) {
        this.d.invoke(view);
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof OnBalloonClickListener) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.c(this.d, ((FunctionAdapter) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
