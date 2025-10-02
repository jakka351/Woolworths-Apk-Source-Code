package com.google.android.datatransport.runtime;

import YU.a;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.AutoValue_EventInternal;
import com.google.android.datatransport.runtime.AutoValue_SendRequest;
import com.google.android.datatransport.runtime.scheduling.Scheduler;

/* loaded from: classes.dex */
final class TransportImpl<T> implements Transport<T> {

    /* renamed from: a, reason: collision with root package name */
    public final TransportContext f14443a;
    public final String b;
    public final Encoding c;
    public final Transformer d;
    public final TransportRuntime e;

    public TransportImpl(TransportContext transportContext, String str, Encoding encoding, Transformer transformer, TransportRuntime transportRuntime) {
        this.f14443a = transportContext;
        this.b = str;
        this.c = encoding;
        this.d = transformer;
        this.e = transportRuntime;
    }

    @Override // com.google.android.datatransport.Transport
    public final void a(Event event, TransportScheduleCallback transportScheduleCallback) {
        AutoValue_SendRequest.Builder builder = new AutoValue_SendRequest.Builder();
        TransportContext transportContext = this.f14443a;
        if (transportContext == null) {
            throw new NullPointerException("Null transportContext");
        }
        builder.f14435a = transportContext;
        if (event == null) {
            throw new NullPointerException("Null event");
        }
        builder.c = event;
        String str = this.b;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        builder.b = str;
        Transformer transformer = this.d;
        if (transformer == null) {
            throw new NullPointerException("Null transformer");
        }
        builder.d = transformer;
        builder.e = this.c;
        String strG = builder.e == null ? a.g("", " encoding") : "";
        if (!strG.isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(strG));
        }
        TransportContext transportContext2 = builder.f14435a;
        String str2 = builder.b;
        Event event2 = builder.c;
        Transformer transformer2 = builder.d;
        Encoding encoding = builder.e;
        TransportRuntime transportRuntime = this.e;
        Scheduler scheduler = transportRuntime.c;
        TransportContext transportContextE = transportContext2.e(event2.d());
        AutoValue_EventInternal.Builder builder2 = (AutoValue_EventInternal.Builder) EventInternal.a();
        builder2.d = Long.valueOf(transportRuntime.f14444a.a());
        builder2.e = Long.valueOf(transportRuntime.b.a());
        builder2.k(str2);
        builder2.c = new EncodedPayload(encoding, (byte[]) transformer2.apply(event2.c()));
        builder2.b = event2.a();
        if (event2.e() != null && event2.e().a() != null) {
            builder2.g = event2.e().a();
        }
        if (event2.b() != null) {
            event2.b().getClass();
        }
        scheduler.a(transportContextE, builder2.b(), transportScheduleCallback);
    }

    @Override // com.google.android.datatransport.Transport
    public final void b(Event event) {
        a(event, new androidx.compose.ui.graphics.colorspace.a(10));
    }
}
