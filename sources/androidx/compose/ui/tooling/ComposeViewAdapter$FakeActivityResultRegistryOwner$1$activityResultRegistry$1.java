package androidx.compose.ui.tooling;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1", "Landroidx/activity/result/ActivityResultRegistry;", "ui-tooling_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1 extends ActivityResultRegistry {
    @Override // androidx.activity.result.ActivityResultRegistry
    public final void c(int i, ActivityResultContract activityResultContract, Object obj, ActivityOptionsCompat activityOptionsCompat) {
        throw new IllegalStateException("Calling launch() is not supported in Preview");
    }
}
