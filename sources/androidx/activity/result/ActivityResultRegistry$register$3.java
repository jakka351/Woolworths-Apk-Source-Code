package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/activity/result/ActivityResultRegistry$register$3", "Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityResultRegistry$register$3 extends ActivityResultLauncher<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ActivityResultRegistry f80a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ActivityResultContract c;

    public ActivityResultRegistry$register$3(ActivityResultRegistry activityResultRegistry, String str, ActivityResultContract activityResultContract) {
        this.f80a = activityResultRegistry;
        this.b = str;
        this.c = activityResultContract;
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void a(Object obj, ActivityOptionsCompat activityOptionsCompat) {
        ActivityResultRegistry activityResultRegistry = this.f80a;
        ArrayList arrayList = activityResultRegistry.d;
        LinkedHashMap linkedHashMap = activityResultRegistry.b;
        String str = this.b;
        Object obj2 = linkedHashMap.get(str);
        ActivityResultContract activityResultContract = this.c;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int iIntValue = ((Number) obj2).intValue();
        arrayList.add(str);
        try {
            activityResultRegistry.c(iIntValue, activityResultContract, obj, activityOptionsCompat);
        } catch (Exception e) {
            arrayList.remove(str);
            throw e;
        }
    }

    @Override // androidx.activity.result.ActivityResultLauncher
    public final void b() {
        this.f80a.g(this.b);
    }
}
