package com.tealium.dispatcher;

import com.tealium.core.JsonUtils;
import com.tealium.core.persistence.e0;
import com.tealium.core.persistence.h0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/dispatcher/b;", "Lcom/tealium/dispatcher/Dispatch;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements Dispatch {

    /* renamed from: a, reason: collision with root package name */
    public final String f19189a;
    public final Long b;
    public final JSONObject c;

    public b(e0 json) {
        Intrinsics.h(json, "json");
        this.f19189a = json.f19168a;
        this.b = json.d;
        this.c = (JSONObject) h0.b().getB().a(json.b);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final Map a() {
        return JsonUtils.Companion.b(this.c);
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final void b(Map data) throws JSONException {
        Intrinsics.h(data, "data");
        for (Map.Entry entry : data.entrySet()) {
            this.c.put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.tealium.dispatcher.Dispatch
    public final Object get() {
        return ((LinkedHashMap) a()).get("tealium_event");
    }

    @Override // com.tealium.dispatcher.Dispatch
    /* renamed from: getId, reason: from getter */
    public final String getF19189a() {
        return this.f19189a;
    }

    @Override // com.tealium.dispatcher.Dispatch
    /* renamed from: getTimestamp, reason: from getter */
    public final Long getB() {
        return this.b;
    }
}
