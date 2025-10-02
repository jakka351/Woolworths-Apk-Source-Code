package androidx.activity;

import android.window.BackEvent;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@RequiresApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/Api34Impl;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Api34Impl {
    public static float a(BackEvent backEvent) {
        Intrinsics.h(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public static int b(BackEvent backEvent) {
        Intrinsics.h(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public static float c(BackEvent backEvent) {
        Intrinsics.h(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public static float d(BackEvent backEvent) {
        Intrinsics.h(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
