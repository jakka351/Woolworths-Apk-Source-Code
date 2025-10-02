package net.yslibrary.android.keyboardvisibilityevent;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnet/yslibrary/android/keyboardvisibilityevent/KeyboardVisibilityEvent;", "", "keyboardvisibilityevent_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes8.dex */
public final class KeyboardVisibilityEvent {
    public static View a(Activity activity) {
        View viewFindViewById = activity.findViewById(android.R.id.content);
        Intrinsics.g(viewFindViewById, "activity.findViewById(android.R.id.content)");
        View rootView = ((ViewGroup) viewFindViewById).getRootView();
        Intrinsics.g(rootView, "getContentRoot(activity).rootView");
        return rootView;
    }
}
