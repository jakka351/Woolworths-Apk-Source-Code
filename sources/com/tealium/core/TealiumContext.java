package com.tealium.core;

import com.tealium.core.Logger;
import com.tealium.core.messaging.MessengerService;
import com.tealium.core.network.HttpClient;
import com.tealium.core.persistence.f0;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.test.OpenForTesting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/TealiumContext;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
@OpenForTesting
/* loaded from: classes.dex */
public final /* data */ class TealiumContext {

    /* renamed from: a, reason: collision with root package name */
    public final TealiumConfig f19130a;
    public final String b;
    public final f0 c;
    public final HttpClient d;
    public final MessengerService e;
    public final Tealium f;

    public TealiumContext(TealiumConfig tealiumConfig, String _visitorId, f0 f0Var, HttpClient httpClient, MessengerService messengerService, Tealium tealium) {
        Logger.Companion companion = Logger.f19124a;
        Intrinsics.h(_visitorId, "_visitorId");
        this.f19130a = tealiumConfig;
        this.b = _visitorId;
        this.c = f0Var;
        this.d = httpClient;
        this.e = messengerService;
        this.f = tealium;
    }

    public final void a(TealiumEvent tealiumEvent) {
        this.f.b(tealiumEvent);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TealiumContext)) {
            return false;
        }
        TealiumContext tealiumContext = (TealiumContext) obj;
        if (!this.f19130a.equals(tealiumContext.f19130a) || !Intrinsics.c(this.b, tealiumContext.b)) {
            return false;
        }
        Object obj2 = Logger.f19124a;
        return obj2.equals(obj2) && this.c.equals(tealiumContext.c) && this.d.equals(tealiumContext.d) && this.e.equals(tealiumContext.e) && this.f.equals(tealiumContext.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((Logger.f19124a.hashCode() + androidx.camera.core.impl.b.c(this.f19130a.hashCode() * 31, 31, this.b)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "TealiumContext(config=" + this.f19130a + ", _visitorId=" + this.b + ", log=" + Logger.f19124a + ", dataLayer=" + this.c + ", httpClient=" + this.d + ", events=" + this.e + ", tealium=" + this.f + ")";
    }
}
