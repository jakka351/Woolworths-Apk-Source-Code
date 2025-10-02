package com.airbnb.epoxy;

import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposeInteropKt$EpoxyInterop$2 extends Lambda implements Function1<FrameLayout, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameLayout view = (FrameLayout) obj;
        Intrinsics.h(view, "view");
        view.getChildAt(0);
        Intrinsics.f(null, "null cannot be cast to non-null type com.airbnb.epoxy.EpoxyModel<android.view.View>");
        throw null;
    }
}
