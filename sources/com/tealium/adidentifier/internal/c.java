package com.tealium.adidentifier.internal;

import com.tealium.core.messaging.ExternalMessenger;
import com.tealium.core.messaging.Listener;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes.dex */
public final class c extends ExternalMessenger<b> {
    public final String b;
    public final Integer c;

    public c(String str, Integer num) {
        super(Reflection.f24268a.b(b.class));
        this.b = str;
        this.c = num;
    }

    @Override // com.tealium.core.messaging.Messenger
    public final void a(Listener listener) {
        b listener2 = (b) listener;
        Intrinsics.h(listener2, "listener");
        listener2.l(this.c, this.b);
    }
}
