package com.salesforce.marketingcloud.events;

import java.util.Map;
import kotlin.collections.EmptyMap;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class a implements Event {
    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public Map<String, Object> attributes() {
        return EmptyMap.d;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public String name() {
        return "$appOpen";
    }
}
