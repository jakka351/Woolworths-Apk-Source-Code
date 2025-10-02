package com.google.firebase.firestore.core;

import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.core.SyncEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class EventManager implements SyncEngine.SyncEngineCallback {

    /* renamed from: a, reason: collision with root package name */
    public final SyncEngine f15447a;
    public final HashSet c = new HashSet();
    public OnlineState d = OnlineState.d;
    public final HashMap b = new HashMap();

    /* renamed from: com.google.firebase.firestore.core.EventManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15448a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ListenerRemovalAction.values().length];
            b = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ListenerSetupAction.values().length];
            f15448a = iArr2;
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15448a[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15448a[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class ListenOptions {

        /* renamed from: a, reason: collision with root package name */
        public boolean f15449a;
        public boolean b;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ListenerRemovalAction {
        public static final ListenerRemovalAction d;
        public static final ListenerRemovalAction e;
        public static final ListenerRemovalAction f;
        public static final ListenerRemovalAction g;
        public static final /* synthetic */ ListenerRemovalAction[] h;

        static {
            ListenerRemovalAction listenerRemovalAction = new ListenerRemovalAction("TERMINATE_LOCAL_LISTEN_AND_REQUIRE_WATCH_DISCONNECTION", 0);
            d = listenerRemovalAction;
            ListenerRemovalAction listenerRemovalAction2 = new ListenerRemovalAction("TERMINATE_LOCAL_LISTEN_ONLY", 1);
            e = listenerRemovalAction2;
            ListenerRemovalAction listenerRemovalAction3 = new ListenerRemovalAction("REQUIRE_WATCH_DISCONNECTION_ONLY", 2);
            f = listenerRemovalAction3;
            ListenerRemovalAction listenerRemovalAction4 = new ListenerRemovalAction("NO_ACTION_REQUIRED", 3);
            g = listenerRemovalAction4;
            h = new ListenerRemovalAction[]{listenerRemovalAction, listenerRemovalAction2, listenerRemovalAction3, listenerRemovalAction4};
        }

        public static ListenerRemovalAction valueOf(String str) {
            return (ListenerRemovalAction) Enum.valueOf(ListenerRemovalAction.class, str);
        }

        public static ListenerRemovalAction[] values() {
            return (ListenerRemovalAction[]) h.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class ListenerSetupAction {
        public static final ListenerSetupAction d;
        public static final ListenerSetupAction e;
        public static final ListenerSetupAction f;
        public static final ListenerSetupAction g;
        public static final /* synthetic */ ListenerSetupAction[] h;

        static {
            ListenerSetupAction listenerSetupAction = new ListenerSetupAction("INITIALIZE_LOCAL_LISTEN_AND_REQUIRE_WATCH_CONNECTION", 0);
            d = listenerSetupAction;
            ListenerSetupAction listenerSetupAction2 = new ListenerSetupAction("INITIALIZE_LOCAL_LISTEN_ONLY", 1);
            e = listenerSetupAction2;
            ListenerSetupAction listenerSetupAction3 = new ListenerSetupAction("REQUIRE_WATCH_CONNECTION_ONLY", 2);
            f = listenerSetupAction3;
            ListenerSetupAction listenerSetupAction4 = new ListenerSetupAction("NO_ACTION_REQUIRED", 3);
            g = listenerSetupAction4;
            h = new ListenerSetupAction[]{listenerSetupAction, listenerSetupAction2, listenerSetupAction3, listenerSetupAction4};
        }

        public static ListenerSetupAction valueOf(String str) {
            return (ListenerSetupAction) Enum.valueOf(ListenerSetupAction.class, str);
        }

        public static ListenerSetupAction[] values() {
            return (ListenerSetupAction[]) h.clone();
        }
    }

    public static class QueryListenersInfo {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f15450a = new ArrayList();
        public ViewSnapshot b;
    }

    public EventManager(SyncEngine syncEngine) {
        this.f15447a = syncEngine;
        syncEngine.m = this;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        boolean z = false;
        while (it.hasNext()) {
            ViewSnapshot viewSnapshot = (ViewSnapshot) it.next();
            QueryListenersInfo queryListenersInfo = (QueryListenersInfo) this.b.get(viewSnapshot.f15473a);
            if (queryListenersInfo != null) {
                Iterator it2 = queryListenersInfo.f15450a.iterator();
                while (it2.hasNext()) {
                    if (((QueryListener) it2.next()).b(viewSnapshot)) {
                        z = true;
                    }
                }
                queryListenersInfo.b = viewSnapshot;
            }
        }
        if (z) {
            b();
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((EventListener) it.next()).a(null, null);
        }
    }
}
