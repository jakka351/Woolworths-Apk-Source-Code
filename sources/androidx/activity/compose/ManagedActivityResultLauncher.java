package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry$register$3;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;

@StabilityInferred
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ManagedActivityResultLauncher<I, O> extends ActivityResultLauncher<I> {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityResultLauncherHolder f69a;
    public final MutableState b;

    public ManagedActivityResultLauncher(ActivityResultLauncherHolder activityResultLauncherHolder, MutableState mutableState) {
        this.f69a = activityResultLauncherHolder;
        this.b = mutableState;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        Unit unit;
        ActivityResultRegistry$register$3 activityResultRegistry$register$3 = this.f69a.f61a;
        if (activityResultRegistry$register$3 != null) {
            activityResultRegistry$register$3.a(obj, activityOptionsCompat);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void b() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}
