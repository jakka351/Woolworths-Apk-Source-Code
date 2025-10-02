package com.tealium.core;

import com.tealium.core.messaging.LibrarySettingsUpdatedListener;
import com.tealium.core.settings.LibrarySettings;
import com.tealium.core.validation.DispatchValidator;
import com.tealium.dispatcher.Dispatcher;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/ModuleManager;", "Lcom/tealium/core/messaging/LibrarySettingsUpdatedListener;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class ModuleManager implements LibrarySettingsUpdatedListener {

    /* renamed from: a, reason: collision with root package name */
    public final Map f19125a;

    public ModuleManager() {
        int iH = MapsKt.h(CollectionsKt.s(EmptyList.d, 10));
        Map mapSynchronizedMap = Collections.synchronizedMap(MapsKt.s(new LinkedHashMap(iH < 16 ? 16 : iH)));
        Intrinsics.g(mapSynchronizedMap, "synchronizedMap(\n       …me }.toMutableMap()\n    )");
        this.f19125a = mapSynchronizedMap;
    }

    @Override // com.tealium.core.messaging.LibrarySettingsUpdatedListener
    public final void C(LibrarySettings settings) {
        Intrinsics.h(settings, "settings");
        if (settings.g) {
            synchronized (this.f19125a) {
                Iterator it = this.f19125a.entrySet().iterator();
                while (it.hasNext()) {
                    ((Module) ((Map.Entry) it.next()).getValue()).setEnabled(false);
                }
            }
            return;
        }
        Module moduleB = b("Collect");
        if (moduleB == null) {
            moduleB = b("COLLECT_DISPATCHER");
        }
        if (moduleB != null) {
            moduleB.setEnabled(settings.f19178a);
        }
        Module moduleB2 = b("TagManagement");
        if (moduleB2 == null) {
            moduleB2 = b("TAG_MANAGEMENT_DISPATCHER");
        }
        if (moduleB2 == null) {
            return;
        }
        moduleB2.setEnabled(settings.b);
    }

    public final Module b(String str) {
        Module module;
        synchronized (this.f19125a) {
            module = (Module) this.f19125a.get(str);
        }
        return module;
    }

    public final Set c(Class clazz) {
        Set setL0;
        Intrinsics.h(clazz, "clazz");
        synchronized (this.f19125a) {
            setL0 = CollectionsKt.L0(CollectionsKt.A(this.f19125a.values(), clazz));
        }
        return setL0;
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Class cls : CollectionsKt.R(Collector.class, DispatchValidator.class, Dispatcher.class)) {
                Set<Module> setC = c(cls);
                JSONObject jSONObject2 = new JSONObject();
                for (Module module : setC) {
                    jSONObject2.put(module.getF(), module.getG() ? "enabled" : "disabled");
                }
                jSONObject.put(cls.getSimpleName(), jSONObject2);
            }
        } catch (Exception unused) {
        }
        String string = jSONObject.toString(4);
        Intrinsics.g(string, "json.toString(4)");
        return string;
    }
}
