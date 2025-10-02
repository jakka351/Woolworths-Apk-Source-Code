package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DefaultLifecycleObserver extends LifecycleObserver {
    default void onCreate(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
    }

    default void onDestroy(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
    }

    default void onPause(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
    }

    default void onResume(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
    }

    default void onStart(LifecycleOwner owner) {
        Intrinsics.h(owner, "owner");
    }

    default void onStop(LifecycleOwner lifecycleOwner) {
    }
}
