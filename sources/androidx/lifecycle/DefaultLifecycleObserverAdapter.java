package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/DefaultLifecycleObserverAdapter;", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements LifecycleEventObserver {
    public final DefaultLifecycleObserver d;
    public final LifecycleEventObserver e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2784a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Lifecycle.Event.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f2784a = iArr;
        }
    }

    public DefaultLifecycleObserverAdapter(DefaultLifecycleObserver defaultLifecycleObserver, LifecycleEventObserver lifecycleEventObserver) {
        Intrinsics.h(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.d = defaultLifecycleObserver;
        this.e = lifecycleEventObserver;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void T(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i = WhenMappings.f2784a[event.ordinal()];
        DefaultLifecycleObserver defaultLifecycleObserver = this.d;
        switch (i) {
            case 1:
                defaultLifecycleObserver.onCreate(lifecycleOwner);
                break;
            case 2:
                defaultLifecycleObserver.onStart(lifecycleOwner);
                break;
            case 3:
                defaultLifecycleObserver.onResume(lifecycleOwner);
                break;
            case 4:
                defaultLifecycleObserver.onPause(lifecycleOwner);
                break;
            case 5:
                defaultLifecycleObserver.onStop(lifecycleOwner);
                break;
            case 6:
                defaultLifecycleObserver.onDestroy(lifecycleOwner);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new NoWhenBranchMatchedException();
        }
        LifecycleEventObserver lifecycleEventObserver = this.e;
        if (lifecycleEventObserver != null) {
            lifecycleEventObserver.T(lifecycleOwner, event);
        }
    }
}
