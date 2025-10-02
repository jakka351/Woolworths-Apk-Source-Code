package com.skydoves.balloon;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/skydoves/balloon/IconForm;", "", "Builder", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IconForm {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/skydoves/balloon/IconForm$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @IconFormDsl
    @SourceDebugExtension
    public static final class Builder {
        public Builder(@NotNull Context context) {
            Intrinsics.h(context, "context");
            float f = 28;
            MathKt.b(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            MathKt.b(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
            MathKt.b(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
        }
    }
}
