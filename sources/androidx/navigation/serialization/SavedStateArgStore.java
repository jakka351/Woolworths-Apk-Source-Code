package androidx.navigation.serialization;

import android.os.Bundle;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/serialization/SavedStateArgStore;", "Landroidx/navigation/serialization/ArgStore;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class SavedStateArgStore extends ArgStore {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3517a;
    public final LinkedHashMap b;

    public SavedStateArgStore(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.f3517a = bundle;
        this.b = linkedHashMap;
    }
}
