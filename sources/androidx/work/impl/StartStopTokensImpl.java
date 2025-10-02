package androidx.work.impl;

import androidx.work.impl.model.WorkGenerationalId;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/StartStopTokensImpl;", "Landroidx/work/impl/StartStopTokens;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class StartStopTokensImpl implements StartStopTokens {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f3932a = new LinkedHashMap();

    @Override // androidx.work.impl.StartStopTokens
    public final boolean a(WorkGenerationalId workGenerationalId) {
        return this.f3932a.containsKey(workGenerationalId);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken b(WorkGenerationalId id) {
        Intrinsics.h(id, "id");
        return (StartStopToken) this.f3932a.remove(id);
    }

    @Override // androidx.work.impl.StartStopTokens
    public final StartStopToken d(WorkGenerationalId workGenerationalId) {
        LinkedHashMap linkedHashMap = this.f3932a;
        Object startStopToken = linkedHashMap.get(workGenerationalId);
        if (startStopToken == null) {
            startStopToken = new StartStopToken(workGenerationalId);
            linkedHashMap.put(workGenerationalId, startStopToken);
        }
        return (StartStopToken) startStopToken;
    }

    @Override // androidx.work.impl.StartStopTokens
    public final List remove(String workSpecId) {
        Intrinsics.h(workSpecId, "workSpecId");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = this.f3932a;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (Intrinsics.c(((WorkGenerationalId) entry.getKey()).f3985a, workSpecId)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap2.remove((WorkGenerationalId) it.next());
        }
        return CollectionsKt.G0(linkedHashMap.values());
    }
}
