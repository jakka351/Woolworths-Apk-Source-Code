package com.medallia.digital.mobilesdk;

import com.medallia.mobile.sdk.internal.eventbus.Event;
import com.medallia.mobile.sdk.internal.eventbus.EventBus;
import com.medallia.mobile.sdk.internal.eventbus.Subscriber;
import com.medallia.mobile.sdk.internal.eventbus.Subscription;
import com.medallia.mobile.sdk.internal.eventbus.events.DFSubmitFeedback;
import com.medallia.mobile.sdk.internal.eventbus.events.DXAEvent;
import com.medallia.mobile.sdk.internal.eventbus.events.DXALeadIdUpdated;
import com.medallia.mobile.sdk.internal.eventbus.events.DXASessionIdUpdated;
import com.medallia.mobile.sdk.internal.eventbus.events.MXOEvent;
import com.medallia.mobile.sdk.internal.eventbus.events.MXOTidUpdated;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension
/* loaded from: classes.dex */
public final class x6 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final x6 f16771a;

    @NotNull
    private static final String b = "com.medallia.mobile.sdk.internal.eventbus.EventBus";
    private static boolean c;

    @Nullable
    private static Boolean d;

    @Nullable
    private static Object e;

    @NotNull
    private static final ConcurrentHashMap<String, DXAEvent<?>> f;

    @NotNull
    private static final ConcurrentHashMap<String, MXOEvent<?>> g;

    @NotNull
    private static final Set<Integer> h;

    @SourceDebugExtension
    /* loaded from: classes6.dex */
    public static final class a implements Subscriber {
        public void onEvent(@NotNull Event<?> event) {
            StringBuilder sb;
            String payload;
            Intrinsics.h(event, "event");
            if (x6.h.contains(Integer.valueOf(event.getId()))) {
                sb = new StringBuilder("DF BridgeService: Event ");
                sb.append(event.getId());
                sb.append(" was already processed with payload ");
                sb.append(event.getPayload());
            } else {
                if (event instanceof DXAEvent) {
                    x6.f.put(event.getClass().getName(), event);
                    x6.h.add(Integer.valueOf(event.getId()));
                    DXAEvent dXAEvent = (DXAEvent) event;
                    if (dXAEvent instanceof DXALeadIdUpdated) {
                        sb = new StringBuilder("DF BridgeService: Receiving DXA LeadId ");
                        payload = ((DXALeadIdUpdated) event).getPayload();
                    } else {
                        if (!(dXAEvent instanceof DXASessionIdUpdated)) {
                            return;
                        }
                        sb = new StringBuilder("DF BridgeService: Receiving DXA SessionId ");
                        payload = ((DXASessionIdUpdated) event).getPayload();
                    }
                } else {
                    if (!(event instanceof MXOEvent)) {
                        return;
                    }
                    x6.g.put(event.getClass().getName(), event);
                    x6.h.add(Integer.valueOf(event.getId()));
                    if (!(((MXOEvent) event) instanceof MXOTidUpdated)) {
                        return;
                    }
                    sb = new StringBuilder("DF BridgeService: Receiving MXO TID: ");
                    payload = ((MXOTidUpdated) event).getPayload();
                }
                sb.append(payload);
            }
            a4.e(sb.toString());
        }

        public void onSubscribe(@NotNull List<? extends Event<?>> queue, @NotNull List<? extends Event<?>> stack) {
            Intrinsics.h(queue, "queue");
            Intrinsics.h(stack, "stack");
            a4.e("DF BridgeService: onSubscribe. stack " + stack + ", queue " + queue);
            Iterator<T> it = queue.iterator();
            while (it.hasNext()) {
                onEvent((Event) it.next());
            }
            Iterator it2 = CollectionsKt.l0(stack).iterator();
            while (it2.hasNext()) {
                onEvent((Event) it2.next());
            }
        }
    }

    static {
        x6 x6Var = new x6();
        f16771a = x6Var;
        f = new ConcurrentHashMap<>();
        g = new ConcurrentHashMap<>();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        Intrinsics.g(keySetViewNewKeySet, "newKeySet(...)");
        h = keySetViewNewKeySet;
        c = x6Var.g();
    }

    private x6() {
    }

    private final /* synthetic */ <T> T a(Function0<? extends T> function0) {
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            return (T) function0.invoke();
        }
        StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
        sb.append(c ? "included" : "not included");
        sb.append(". Bridge functionality is ");
        sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    private final boolean g() throws ClassNotFoundException {
        try {
            Class.forName(b);
            return true;
        } catch (ClassNotFoundException unused) {
            a4.f("DF BridgeService: Bridge dependency is not included");
            return false;
        }
    }

    @Nullable
    public final String d() {
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            DXALeadIdUpdated dXALeadIdUpdated = (DXAEvent) f.get(DXALeadIdUpdated.class.getName());
            if (dXALeadIdUpdated != null) {
                return dXALeadIdUpdated.getPayload();
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
        sb.append(c ? "included" : "not included");
        sb.append(". Bridge functionality is ");
        sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    @Nullable
    public final String e() {
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            DXASessionIdUpdated dXASessionIdUpdated = (DXAEvent) f.get(DXASessionIdUpdated.class.getName());
            if (dXASessionIdUpdated != null) {
                return dXASessionIdUpdated.getPayload();
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
        sb.append(c ? "included" : "not included");
        sb.append(". Bridge functionality is ");
        sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    @Nullable
    public final String f() {
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            MXOTidUpdated mXOTidUpdated = (MXOEvent) g.get(MXOTidUpdated.class.getName());
            if (mXOTidUpdated != null) {
                return mXOTidUpdated.getPayload();
            }
            return null;
        }
        StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
        sb.append(c ? "included" : "not included");
        sb.append(". Bridge functionality is ");
        sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    public final boolean h() {
        return c;
    }

    public final boolean i() {
        Boolean bool = d;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final synchronized void j() {
        if (e != null) {
            a4.c("DF BridgeService: Is already subscribed");
            return;
        }
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            e = EventBus.INSTANCE.subscribe(new a());
            a4.e("DF BridgeService: Subscribed successfully");
        } else {
            StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
            sb.append(c ? "included" : "not included");
            sb.append(". Bridge functionality is ");
            sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
            String string = sb.toString();
            Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
            a4.f(string);
        }
    }

    public final synchronized void k() {
        if (e == null) {
            a4.c("DF BridgeService: Is already unsubscribed");
            return;
        }
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            Object obj = e;
            Intrinsics.f(obj, "null cannot be cast to non-null type com.medallia.mobile.sdk.internal.eventbus.Subscription");
            ((Subscription) obj).unsubscribe();
            e = null;
            a4.e("DF BridgeService: Unsubscribed successfully");
        } else {
            StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
            sb.append(c ? "included" : "not included");
            sb.append(". Bridge functionality is ");
            sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
            String string = sb.toString();
            Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
            a4.f(string);
        }
    }

    @Nullable
    public final Unit a(@NotNull String ccid) {
        Intrinsics.h(ccid, "ccid");
        if (c && Intrinsics.c(d, Boolean.TRUE)) {
            EventBus.INSTANCE.emit(new DFSubmitFeedback(ccid));
            a4.e("DF BridgeService: Emitting CCID: ".concat(ccid));
            return Unit.f24250a;
        }
        StringBuilder sb = new StringBuilder("DF BridgeService: Bridge dependency is ");
        sb.append(c ? "included" : "not included");
        sb.append(". Bridge functionality is ");
        sb.append(Intrinsics.c(d, Boolean.TRUE) ? "enabled" : "disabled");
        String string = sb.toString();
        Intrinsics.g(string, "StringBuilder().apply(builderAction).toString()");
        a4.f(string);
        return null;
    }

    public final void a(boolean z) {
        Boolean bool = d;
        if (bool != null && bool.equals(Boolean.valueOf(z))) {
            a4.c("DF BridgeService: Communication is already ".concat(z ? "enabled" : "disabled"));
        } else {
            d = Boolean.valueOf(z);
            a4.e(YU.a.o(new StringBuilder("DF BridgeService: Communication "), z ? "enabled" : "disabled", " (by the feature flag)"));
        }
    }
}
