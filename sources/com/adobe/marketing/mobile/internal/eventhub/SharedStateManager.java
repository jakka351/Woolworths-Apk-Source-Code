package com.adobe.marketing.mobile.internal.eventhub;

import androidx.compose.ui.platform.i;
import com.adobe.marketing.mobile.SharedStateResult;
import com.adobe.marketing.mobile.SharedStateStatus;
import com.adobe.marketing.mobile.services.Log;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateManager;", "", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SharedStateManager {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f13188a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/SharedStateManager$Companion;", "", "", "VERSION_LATEST", "I", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    public SharedStateManager(String name) {
        Intrinsics.h(name, "name");
        i.a(')', "SharedStateManager(", name);
        this.f13188a = new TreeMap();
    }

    public final synchronized SharedStateResult a(int i) {
        SharedState sharedState;
        try {
            Map.Entry entryFloorEntry = this.f13188a.floorEntry(Integer.valueOf(i));
            SharedState sharedState2 = entryFloorEntry != null ? (SharedState) entryFloorEntry.getValue() : null;
            if (sharedState2 != null) {
                return new SharedStateResult(sharedState2.b, sharedState2.c);
            }
            Map.Entry entryFirstEntry = this.f13188a.firstEntry();
            return (entryFirstEntry == null || (sharedState = (SharedState) entryFirstEntry.getValue()) == null) ? new SharedStateResult(SharedStateStatus.f, null) : new SharedStateResult(sharedState.b, sharedState.c);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final boolean b(int i, SharedState sharedState) {
        Integer numValueOf = Integer.valueOf(i);
        TreeMap treeMap = this.f13188a;
        if (treeMap.ceilingEntry(numValueOf) != null) {
            Log.c();
            return false;
        }
        treeMap.put(Integer.valueOf(i), sharedState);
        return true;
    }
}
