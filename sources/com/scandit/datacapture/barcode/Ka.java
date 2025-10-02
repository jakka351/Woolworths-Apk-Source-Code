package com.scandit.datacapture.barcode;

import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class Ka {
    public static StateListDrawable a(Context context, boolean z) {
        Intrinsics.h(context, "context");
        if (z) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, context.getDrawable(R.drawable.sc_spark_scan_collapsed_pressed));
            stateListDrawable.addState(new int[0], context.getDrawable(R.drawable.sc_spark_scan_collapsed));
            return stateListDrawable;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, context.getDrawable(R.drawable.sc_spark_scan_expanded_pressed));
        stateListDrawable2.addState(new int[0], context.getDrawable(R.drawable.sc_spark_scan_expanded));
        return stateListDrawable2;
    }

    public static StateListDrawable b(Context context, boolean z) {
        Intrinsics.h(context, "context");
        if (z) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, context.getDrawable(com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_in_pressed));
            stateListDrawable.addState(new int[0], context.getDrawable(com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_in));
            return stateListDrawable;
        }
        if (z) {
            throw new NoWhenBranchMatchedException();
        }
        StateListDrawable stateListDrawable2 = new StateListDrawable();
        stateListDrawable2.addState(new int[]{android.R.attr.state_pressed}, context.getDrawable(com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_out_pressed));
        stateListDrawable2.addState(new int[0], context.getDrawable(com.scandit.datacapture.core.R.drawable.sc_ic_zoomed_out));
        return stateListDrawable2;
    }
}
