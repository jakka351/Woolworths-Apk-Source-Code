package com.salesforce.marketingcloud.sfmcsdk.components.events;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.events.Event;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\fH\u0016J\b\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/EngagementEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "(Ljava/lang/String;)V", "category", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "getCategory", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "setCategory", "(Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;)V", k.a.h, "", "", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CartEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/CatalogEvent;", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/OrderEvent;", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EngagementEvent extends Event {

    @NotNull
    private Event.Category category;

    @NotNull
    private final String name;

    public /* synthetic */ EngagementEvent(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    public Map<String, Object> attributes() {
        return EmptyMap.d;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    public Event.Category getCategory() {
        return this.category;
    }

    @Override // com.salesforce.marketingcloud.sfmcsdk.components.events.Event
    @NotNull
    /* renamed from: name, reason: from getter */
    public String getName() {
        return this.name;
    }

    public void setCategory(@NotNull Event.Category category) {
        Intrinsics.h(category, "<set-?>");
        this.category = category;
    }

    private EngagementEvent(String str) {
        this.name = str;
        this.category = Event.Category.ENGAGEMENT;
    }
}
