package com.adobe.marketing.mobile.internal.eventhub;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.SharedStateResolution;
import com.adobe.marketing.mobile.SharedStateResult;
import com.adobe.marketing.mobile.SharedStateStatus;
import com.adobe.marketing.mobile.services.Log;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Callable {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ EventHub e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Event g;
    public final /* synthetic */ Object h;

    public /* synthetic */ d(EventHub eventHub, String str, Event event, SharedStateResolution sharedStateResolution) {
        this.e = eventHub;
        this.f = str;
        this.g = event;
        this.h = sharedStateResolution;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        SharedStateResult sharedStateResult;
        switch (this.d) {
            case 0:
                EventHub this$0 = this.e;
                String extensionName = this.f;
                SharedStateType sharedStateType = SharedStateType.d;
                Event event = this.g;
                SharedStateResolution sharedStateResolution = (SharedStateResolution) this.h;
                EventHub eventHub = EventHub.m;
                Intrinsics.h(this$0, "this$0");
                Intrinsics.h(extensionName, "$extensionName");
                ExtensionContainer extensionContainerH = this$0.h(extensionName);
                SharedStateResult sharedStateResultA = null;
                if (extensionContainerH == null) {
                    sharedStateType.toString();
                    Log.a();
                } else {
                    SharedStateManager sharedStateManagerI = this$0.i(extensionName);
                    if (sharedStateManagerI == null) {
                        sharedStateType.toString();
                        Log.d();
                    } else {
                        Integer numG = this$0.g(event);
                        int iIntValue = numG != null ? numG.intValue() : Integer.MAX_VALUE;
                        int iOrdinal = sharedStateResolution.ordinal();
                        if (iOrdinal == 0) {
                            synchronized (sharedStateManagerI) {
                                SortedMap sortedMapTailMap = sharedStateManagerI.f13188a.descendingMap().tailMap(Integer.valueOf(iIntValue));
                                Intrinsics.g(sortedMapTailMap, "states.descendingMap().tailMap(version)");
                                Iterator it = sortedMapTailMap.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        SharedState sharedState = (SharedState) ((Map.Entry) it.next()).getValue();
                                        SharedStateStatus sharedStateStatus = sharedState.b;
                                        if (sharedStateStatus != SharedStateStatus.e) {
                                            sharedStateResult = new SharedStateResult(sharedStateStatus, sharedState.c);
                                        }
                                    } else {
                                        Map.Entry entryFirstEntry = sharedStateManagerI.f13188a.firstEntry();
                                        SharedState sharedState2 = entryFirstEntry != null ? (SharedState) entryFirstEntry.getValue() : null;
                                        sharedStateResult = (sharedState2 != null ? sharedState2.b : null) == SharedStateStatus.d ? new SharedStateResult(sharedState2.b, sharedState2.c) : new SharedStateResult(SharedStateStatus.f, null);
                                    }
                                }
                            }
                            sharedStateResultA = sharedStateResult;
                        } else {
                            if (iOrdinal != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            sharedStateResultA = sharedStateManagerI.a(iIntValue);
                        }
                        this$0.g(extensionContainerH.e);
                    }
                }
                return sharedStateResultA;
            default:
                EventHub this$02 = this.e;
                String extensionName2 = this.f;
                Map map = (Map) this.h;
                Event event2 = this.g;
                EventHub eventHub2 = EventHub.m;
                Intrinsics.h(this$02, "this$0");
                Intrinsics.h(extensionName2, "$extensionName");
                return Boolean.valueOf(this$02.a(extensionName2, map, event2));
        }
    }

    public /* synthetic */ d(EventHub eventHub, String str, Map map, Event event) {
        this.e = eventHub;
        this.f = str;
        this.h = map;
        this.g = event;
    }
}
