package com.scandit.datacapture.core.internal.sdk.utils;

import android.content.Context;
import android.util.TypedValue;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0002\u001a\u00020\u0001\u001a\u0014\u0010\u0005\u001a\u00020\u0004*\u00020\u00042\b\b\u0002\u0010\u0002\u001a\u00020\u0001¨\u0006\u0006"}, d2 = {"", "Landroid/content/Context;", "context", "pxFromDp", "", "pxFromSp", "scandit-capture-core"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class PixelExtensionsKt {
    public static final int pxFromDp(int i, @NotNull Context context) {
        Intrinsics.h(context, "context");
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static /* synthetic */ int pxFromDp$default(int i, Context context, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return pxFromDp(i, context);
    }

    public static final float pxFromSp(float f, @NotNull Context context) {
        Intrinsics.h(context, "context");
        return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ float pxFromSp$default(float f, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return pxFromSp(f, context);
    }

    public static final float pxFromDp(float f, @NotNull Context context) {
        Intrinsics.h(context, "context");
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static /* synthetic */ float pxFromDp$default(float f, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return pxFromDp(f, context);
    }
}
