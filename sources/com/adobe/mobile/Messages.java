package com.adobe.mobile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes4.dex */
final class Messages {

    /* renamed from: a, reason: collision with root package name */
    public static MessageFullScreen f13272a = null;
    public static int c = -1;
    public static int d = -1;
    public static Message e;
    public static final Object b = new Object();
    public static final Object f = new Object();

    /* renamed from: com.adobe.mobile.Messages$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() throws InterruptedException {
            while (!ReferrerHandler.f13278a) {
                try {
                    Thread.sleep(100L);
                } catch (Exception e) {
                    StaticMethods.K("Data Callback - Data Callback Queue Is Interrupted(%s)", e.getMessage());
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Messages$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: com.adobe.mobile.Messages$3$1, reason: invalid class name */
        class AnonymousClass1 implements Callable<Map<String, Object>> {
            @Override // java.util.concurrent.Callable
            public final Map<String, Object> call() {
                return new HashMap(Lifecycle.j());
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = MobileConfig.b().A;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            FutureTask futureTask = new FutureTask(new AnonymousClass1());
            StaticMethods.i().execute(futureTask);
            try {
                Map map = (Map) futureTask.get();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Message message = (Message) it.next();
                    if (message.m(null, null, map)) {
                        message.n();
                    }
                }
            } catch (Exception e) {
                StaticMethods.J("Lifecycle - Unable to get context data (%s)", e.getMessage());
            }
        }
    }

    /* renamed from: com.adobe.mobile.Messages$4, reason: invalid class name */
    final class AnonymousClass4 implements Runnable {
        public final /* synthetic */ Map d;
        public final /* synthetic */ Map e;
        public final /* synthetic */ Map f;

        public AnonymousClass4(Map map, Map map2, Map map3) {
            this.d = map;
            this.e = map2;
            this.f = map3;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = !StaticMethods.e ? MobileConfig.b().y : null;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            Map map = this.d;
            if (map != null && map.containsKey("pev2") && map.get("pev2").toString().equals("ADBINTERNAL:In-App Message")) {
                return;
            }
            HashMap mapB = Messages.b(this.e);
            HashMap mapB2 = Messages.b(map);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                if (message.m(mapB2, mapB, this.f)) {
                    message.n();
                    return;
                }
            }
        }
    }

    /* renamed from: com.adobe.mobile.Messages$5, reason: invalid class name */
    final class AnonymousClass5 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            ArrayList arrayList = MobileConfig.b().y;
            if (arrayList == null || arrayList.size() <= 0) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Message) it.next()).f = false;
            }
        }
    }

    public enum MessageShowRule {
        MESSAGE_SHOW_RULE_UNKNOWN(0),
        MESSAGE_SHOW_RULE_ALWAYS(1),
        MESSAGE_SHOW_RULE_ONCE(2),
        MESSAGE_SHOW_RULE_UNTIL_CLICK(3);

        public final int d;

        MessageShowRule(int i2) {
            this.d = i2;
        }
    }

    public static MessageFullScreen a(String str) {
        ArrayList arrayList = !StaticMethods.e ? MobileConfig.b().y : null;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Message message = (Message) it.next();
                String str2 = message.f13268a;
                if (str2 != null && str2.equals(str) && (message instanceof MessageFullScreen)) {
                    return (MessageFullScreen) message;
                }
            }
        }
        return null;
    }

    public static HashMap b(Map map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            map2.put(((String) entry.getKey()).toLowerCase(), entry.getValue());
        }
        return map2;
    }

    public static void c(Message message) {
        synchronized (f) {
            e = message;
        }
    }
}
