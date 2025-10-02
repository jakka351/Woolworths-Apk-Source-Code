package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"epoxy-adapter_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ActivityRecyclerPoolKt {
    public static final boolean a(Context context) {
        Context baseContext;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return true;
            }
            return activity.isDestroyed();
        }
        ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
        if (contextWrapper == null || (baseContext = contextWrapper.getBaseContext()) == null) {
            return false;
        }
        return a(baseContext);
    }
}
