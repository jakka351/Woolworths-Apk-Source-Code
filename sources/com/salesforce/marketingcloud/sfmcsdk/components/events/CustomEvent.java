package com.salesforce.marketingcloud.sfmcsdk.components.events;

import android.support.v4.media.session.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0014\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005H\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CustomEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", k.a.h, "", "", "producer", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "category", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "(Ljava/lang/String;Ljava/util/Map;Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;)V", "getCategory", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "getProducer", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "toString", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomEvent extends Event {

    @NotNull
    private final Map<String, Object> attributes;

    @NotNull
    private final Event.Category category;

    @NotNull
    private final String name;

    @NotNull
    private final Event.Producer producer;

    public /* synthetic */ CustomEvent(String str, Map map, Event.Producer producer, Event.Category category, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i & 4) != 0 ? Event.Producer.SFMC_SDK : producer, (i & 8) != 0 ? Event.Category.ENGAGEMENT : category);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    public Map<String, Object> attributes() {
        return this.attributes;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    public Event.Category getCategory() {
        return this.category;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    public Event.Producer getProducer() {
        return this.producer;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    /* renamed from: name, reason: from getter */
    public String getName() {
        return this.name;
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CustomEvent(name='");
        sb.append(this.name);
        sb.append("', producer=");
        sb.append(getProducer());
        sb.append(", category=");
        sb.append(getCategory());
        sb.append(", attributes=");
        return a.u(sb, this.attributes, ')');
    }

    public CustomEvent(@NotNull String name, @NotNull Map<String, ? extends Object> attributes, @NotNull Event.Producer producer, @NotNull Event.Category category) {
        Intrinsics.h(name, "name");
        Intrinsics.h(attributes, "attributes");
        Intrinsics.h(producer, "producer");
        Intrinsics.h(category, "category");
        this.name = name;
        this.attributes = attributes;
        this.producer = producer;
        this.category = category;
    }
}
