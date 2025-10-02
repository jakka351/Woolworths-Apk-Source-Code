package androidx.lifecycle.internal;

import androidx.activity.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/internal/SavedStateHandleImpl;", "", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SavedStateHandleImpl {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f2809a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final c e = new c(this, 2);

    public SavedStateHandleImpl(Map map) {
        this.f2809a = MapsKt.s(map);
    }

    public final void a(Object obj, String key) {
        Intrinsics.h(key, "key");
        this.f2809a.put(key, obj);
        MutableStateFlow mutableStateFlow = (MutableStateFlow) this.c.get(key);
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(obj);
        }
        MutableStateFlow mutableStateFlow2 = (MutableStateFlow) this.d.get(key);
        if (mutableStateFlow2 != null) {
            mutableStateFlow2.setValue(obj);
        }
    }
}
