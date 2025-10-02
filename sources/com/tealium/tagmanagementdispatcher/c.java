package com.tealium.tagmanagementdispatcher;

import com.tealium.core.messaging.Listener;
import com.tealium.core.messaging.Messenger;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes6.dex */
public final class c extends Messenger<WebViewExceptionListener> {
    public c(Exception exc) {
        super(Reflection.f24268a.b(WebViewExceptionListener.class));
    }

    @Override // com.tealium.core.messaging.Messenger
    public final void a(Listener listener) {
        WebViewExceptionListener listener2 = (WebViewExceptionListener) listener;
        Intrinsics.h(listener2, "listener");
        listener2.t();
    }
}
