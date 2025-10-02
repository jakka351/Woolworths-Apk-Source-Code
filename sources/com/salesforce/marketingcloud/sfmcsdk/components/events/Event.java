package com.salesforce.marketingcloud.sfmcsdk.components.events;

import androidx.constraintlayout.core.state.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.sfmcsdk.SFMCSdk;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u000eH&J\b\u0010\u000f\u001a\u00020\bH&J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event;", "", "()V", "category", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "getCategory", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "id", "", "producer", "Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "getProducer", "()Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", k.a.h, "", AppMeasurementSdk.ConditionalUserProperty.NAME, "toJson", "Lorg/json/JSONObject;", "track", "", "Category", "Producer", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class Event {

    @JvmField
    @NotNull
    public final String id = a.h("randomUUID().toString()");

    @NotNull
    private final Producer producer = Producer.SFMC_SDK;

    @NotNull
    private final Category category = Category.ENGAGEMENT;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Category;", "", "(Ljava/lang/String;I)V", "APPLICATION", "ENGAGEMENT", "IDENTITY", "SYSTEM", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Category {
        APPLICATION,
        ENGAGEMENT,
        IDENTITY,
        SYSTEM
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/salesforce/marketingcloud/sfmcsdk/components/events/Event$Producer;", "", "(Ljava/lang/String;I)V", "APP", "SFMC_SDK", "PUSH", "CDP", "sfmcsdk_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public enum Producer {
        APP,
        SFMC_SDK,
        PUSH,
        CDP
    }

    @NotNull
    public abstract Map<String, Object> attributes();

    @NotNull
    public Category getCategory() {
        return this.category;
    }

    @NotNull
    public Producer getProducer() {
        return this.producer;
    }

    @NotNull
    public abstract String name();

    @NotNull
    public final JSONObject toJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, name());
        jSONObject.put("id", this.id);
        jSONObject.put("producer", getProducer());
        jSONObject.put("category", getCategory());
        JSONObject jSONObject2 = new JSONObject();
        Iterator<T> it = attributes().entrySet().iterator();
        while (it.hasNext()) {
            final Map.Entry entry = (Map.Entry) it.next();
            try {
                Object value = entry.getValue();
                if (value instanceof SFMCSdkEvent) {
                    jSONObject2.put((String) entry.getKey(), ((SFMCSdkEvent) entry.getValue()).toJson());
                } else {
                    boolean z = true;
                    if (!(value instanceof Number ? true : value instanceof String ? true : value instanceof Character)) {
                        z = value instanceof Boolean;
                    }
                    if (z) {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    } else {
                        jSONObject2.put((String) entry.getKey(), entry.getValue());
                    }
                }
            } catch (Exception unused) {
                SFMCSdkLogger.INSTANCE.w(jSONObject2.getClass().getName(), new Function0<String>() { // from class: com.salesforce.marketingcloud.sfmcsdk.components.events.Event$toJson$1$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final String invoke() {
                        return "Could not convert attribute (" + entry + ") to JSON.";
                    }
                });
            }
        }
        jSONObject.put(k.a.h, jSONObject2);
        return jSONObject;
    }

    public final void track() {
        SFMCSdk.INSTANCE.track(this);
    }
}
