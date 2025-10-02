package com.tealium.core.events;

import com.tealium.core.Logger;
import com.tealium.core.TealiumContext;
import com.tealium.core.Transformer;
import com.tealium.core.events.a;
import com.tealium.dispatcher.Dispatch;
import com.tealium.dispatcher.TealiumEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/tealium/core/events/b;", "Lcom/tealium/core/events/TimedEvents;", "Lcom/tealium/core/Transformer;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements TimedEvents, Transformer {

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19150a;
    public boolean b = true;
    public final ArrayList c = new ArrayList();
    public final LinkedHashMap d = new LinkedHashMap();

    public b(TealiumContext tealiumContext) {
        this.f19150a = tealiumContext;
        ArrayList arrayList = tealiumContext.f19130a.n;
        if (arrayList.size() > 0) {
            Object[] array = arrayList.toArray(new EventTrigger[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            EventTrigger[] eventTriggerArr = (EventTrigger[]) array;
            EventTrigger[] trigger = (EventTrigger[]) Arrays.copyOf(eventTriggerArr, eventTriggerArr.length);
            Intrinsics.h(trigger, "trigger");
            for (EventTrigger eventTrigger : trigger) {
                this.c.add(eventTrigger);
            }
        }
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    @Override // com.tealium.core.Transformer
    public final void B(Dispatch dispatch) {
        Unit unit;
        TealiumEvent tealiumEventB;
        ArrayList arrayList = this.c;
        if (arrayList.isEmpty()) {
            return;
        }
        Logger.f19124a.b("Tealium-1.6.0", "Checking Timed Event Triggers.");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            EventTrigger eventTrigger = (EventTrigger) it.next();
            eventTrigger.getClass();
            LinkedHashMap linkedHashMap = this.d;
            a aVar = (a) linkedHashMap.get(null);
            if (aVar != null) {
                if (eventTrigger.a(dispatch)) {
                    String name = aVar.getF19149a();
                    Long b = dispatch.getC();
                    long jLongValue = b != null ? b.longValue() : System.currentTimeMillis();
                    a aVar2 = (a) linkedHashMap.get(name);
                    if (aVar2 != null) {
                        Intrinsics.h(name, "name");
                        linkedHashMap.remove(name);
                        aVar2.a(Long.valueOf(jLongValue));
                        Logger.f19124a.b("Tealium-1.6.0", "TimedEvent stopped: " + aVar2);
                    } else {
                        aVar2 = null;
                    }
                    if (aVar2 != null && (tealiumEventB = a.C0383a.b(aVar2)) != null) {
                        Logger.f19124a.b("Tealium-1.6.0", "Sending Timed Event(" + aVar2 + ")");
                        this.f19150a.a(tealiumEventB);
                    }
                }
                unit = Unit.f24250a;
            } else {
                unit = null;
            }
            if (unit == null && eventTrigger.b(dispatch)) {
                Long b2 = dispatch.getC();
                long jLongValue2 = b2 != null ? b2.longValue() : System.currentTimeMillis();
                if (!linkedHashMap.containsKey(null)) {
                    new a(null, jLongValue2);
                    throw null;
                }
                Logger.f19124a.b("Tealium-1.6.0", "TimedEvent (name) is already started; ignoring.");
            }
        }
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getC() {
        return "TimedEvents";
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.b = z;
    }
}
