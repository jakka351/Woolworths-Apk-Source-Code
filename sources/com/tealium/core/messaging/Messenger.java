package com.tealium.core.messaging;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.EventListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/messaging/Messenger;", "Ljava/util/EventListener;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public abstract class Messenger<T extends EventListener> {

    /* renamed from: a, reason: collision with root package name */
    public final KClass f19152a;

    public Messenger(KClass listener) {
        Intrinsics.h(listener, "listener");
        this.f19152a = listener;
    }

    public abstract void a(Listener listener);
}
