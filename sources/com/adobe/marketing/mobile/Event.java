package com.adobe.marketing.mobile;

import YU.a;
import com.adobe.marketing.mobile.internal.util.MapExtensionsKt;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.util.EventDataUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Event {

    /* renamed from: a, reason: collision with root package name */
    public String f13158a;
    public String b;
    public String c;
    public String d;
    public Map e;
    public long f;
    public String g;
    public String h;
    public String[] i;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Event f13159a;
        public boolean b;

        public Builder(String str, String str2, String str3, String[] strArr) {
            Event event = new Event();
            this.f13159a = event;
            event.f13158a = str;
            event.b = UUID.randomUUID().toString();
            event.d = str2;
            event.c = str3;
            event.g = null;
            event.h = null;
            event.i = strArr;
            this.b = false;
        }

        public final Event a() {
            e();
            this.b = true;
            Event event = this.f13159a;
            if (event.d == null || event.c == null) {
                return null;
            }
            if (event.f == 0) {
                event.f = System.currentTimeMillis();
            }
            return event;
        }

        public final void b(Event event) {
            e();
            if (event == null) {
                throw new NullPointerException("parentEvent cannot be null");
            }
            this.f13159a.h = event.b;
        }

        public final void c(Event event) {
            e();
            if (event == null) {
                throw new NullPointerException("requestEvent is null");
            }
            String str = event.b;
            e();
            this.f13159a.g = str;
            b(event);
        }

        public final void d(Map map) {
            e();
            try {
                this.f13159a.e = EventDataUtils.b(0, map);
            } catch (Exception unused) {
                Log.d();
            }
        }

        public final void e() {
            if (this.b) {
                throw new UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
        }
    }

    public final Event a(HashMap map) {
        Builder builder = new Builder(this.f13158a, this.d, this.c, this.i);
        builder.d(map);
        Event eventA = builder.a();
        eventA.b = this.b;
        eventA.f = this.f;
        eventA.g = this.g;
        return eventA;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{\n    class: Event,\n    name: ");
        sb.append(this.f13158a);
        sb.append(",\n    uniqueIdentifier: ");
        sb.append(this.b);
        sb.append(",\n    source: ");
        sb.append(this.c);
        sb.append(",\n    type: ");
        sb.append(this.d);
        sb.append(",\n    responseId: ");
        sb.append(this.g);
        sb.append(",\n    parentId: ");
        sb.append(this.h);
        sb.append(",\n    timestamp: ");
        sb.append(this.f);
        sb.append(",\n    data: ");
        Map map = this.e;
        sb.append(map == null ? "{}" : MapExtensionsKt.b(map));
        sb.append(",\n    mask: ");
        return a.o(sb, Arrays.toString(this.i), ",\n}");
    }
}
