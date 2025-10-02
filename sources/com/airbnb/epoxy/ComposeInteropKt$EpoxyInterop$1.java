package com.airbnb.epoxy;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ComposeInteropKt$EpoxyInterop$1 extends Lambda implements Function1<Context, FrameLayout> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        Intrinsics.h(context, "context");
        new FrameLayout(context);
        throw null;
    }
}
