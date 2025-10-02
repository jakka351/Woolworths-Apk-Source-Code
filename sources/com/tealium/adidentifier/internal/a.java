package com.tealium.adidentifier.internal;

import com.tealium.core.messaging.ExternalMessenger;
import com.tealium.core.messaging.Listener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class a extends ExternalMessenger<b> {
    public final String b;
    public final Boolean c;

    public a(String str, Boolean bool) {
        super(Reflection.f24268a.b(b.class));
        this.b = str;
        this.c = bool;
    }

    @Override // com.tealium.core.messaging.Messenger
    public final void a(Listener listener) {
        b listener2 = (b) listener;
        Intrinsics.h(listener2, "listener");
        listener2.u(this.b, this.c);
    }
}
