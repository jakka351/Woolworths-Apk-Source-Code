package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/activity/ImmLeaksCleaner;", "Landroidx/lifecycle/LifecycleEventObserver;", "Cleaner", "Companion", "FailedInitialization", "ValidCleaner", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImmLeaksCleaner implements LifecycleEventObserver {
    public static final Lazy d = LazyKt.b(ImmLeaksCleaner$Companion$cleaner$2.h);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Cleaner;", "", "Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Cleaner {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$Companion;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SuppressLint
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$FailedInitialization;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class FailedInitialization extends Cleaner {

        /* renamed from: a, reason: collision with root package name */
        public static final FailedInitialization f55a = new FailedInitialization();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/ImmLeaksCleaner$ValidCleaner;", "Landroidx/activity/ImmLeaksCleaner$Cleaner;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ValidCleaner extends Cleaner {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            throw null;
        }
    }
}
