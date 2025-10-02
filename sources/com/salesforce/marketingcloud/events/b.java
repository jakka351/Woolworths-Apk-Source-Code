package com.salesforce.marketingcloud.events;

import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b implements Event {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f16877a;

    @NotNull
    private final Map<String, Object> b;

    @NotNull
    private final Event.Producer c;

    public b(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull Event.Producer producer) {
        Intrinsics.h(name, "name");
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(producer, "producer");
        this.f16877a = name;
        this.b = attributes;
        this.c = producer;
    }

    @NotNull
    public final Map<String, Object> a() {
        return this.b;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public Map<String, Object> attributes() {
        return this.b;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public Event.Producer getProducer() {
        return this.c;
    }

    @Override // com.salesforce.marketingcloud.events.Event
    @NotNull
    public String name() {
        return this.f16877a;
    }

    public /* synthetic */ b(String str, Map map, Event.Producer producer, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? EmptyMap.d : map, (i & 4) != 0 ? Event.Producer.PUSH : producer);
    }
}
