package com.dynatrace.android.callback;

import android.view.MenuItem;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.conf.Configuration;
import com.dynatrace.android.agent.conf.InstrumentationFlavor;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import java.net.HttpURLConnection;
import java.util.HashSet;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
final class CallbackCore {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14140a;
    public static final AtomicBoolean b;
    public static Configuration c;
    public static final WeakHashMap d;
    public static volatile DTXAutoAction e;
    public static volatile ListenerActionType f;

    public static class ConnRegistration extends Thread {
        public static final HashSet e = new HashSet();
        public HttpURLConnection d;

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: Exception -> 0x0066, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0066, blocks: (B:3:0x0001, B:6:0x000e, B:11:0x001e, B:14:0x0025, B:15:0x002d, B:17:0x0033, B:19:0x004b, B:21:0x004f, B:24:0x0068, B:28:0x0085, B:12:0x001f, B:13:0x0024), top: B:53:0x0001, inners: #2 }] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.dynatrace.android.callback.CbWebReqTracker a() {
            /*
                r6 = this;
                r0 = 0
                java.util.WeakHashMap r1 = com.dynatrace.android.callback.CallbackCore.d     // Catch: java.lang.Exception -> L66
                java.net.HttpURLConnection r2 = r6.d     // Catch: java.lang.Exception -> L66
                java.lang.Object r2 = r1.get(r2)     // Catch: java.lang.Exception -> L66
                com.dynatrace.android.callback.CbWebReqTracker r2 = (com.dynatrace.android.callback.CbWebReqTracker) r2     // Catch: java.lang.Exception -> L66
                if (r2 == 0) goto Le
                return r2
            Le:
                java.net.HttpURLConnection r2 = r6.d     // Catch: java.lang.Exception -> L66
                if (r2 != 0) goto L14
            L12:
                r2 = r0
                goto L1c
            L14:
                java.lang.String r3 = com.dynatrace.android.agent.Dynatrace.f14076a     // Catch: java.lang.Exception -> L12
                java.lang.String r3 = "x-dynatrace"
                java.lang.String r2 = r2.getRequestProperty(r3)     // Catch: java.lang.Exception -> L12
            L1c:
                if (r2 == 0) goto L91
                monitor-enter(r1)     // Catch: java.lang.Exception -> L66
                java.util.WeakHashMap r3 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L83
                r3.<init>(r1)     // Catch: java.lang.Throwable -> L83
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                java.util.Set r1 = r3.entrySet()     // Catch: java.lang.Exception -> L66
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L66
            L2d:
                boolean r3 = r1.hasNext()     // Catch: java.lang.Exception -> L66
                if (r3 == 0) goto La3
                java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> L66
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Exception -> L66
                java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Exception -> L66
                com.dynatrace.android.callback.CbWebReqTracker r4 = (com.dynatrace.android.callback.CbWebReqTracker) r4     // Catch: java.lang.Exception -> L66
                com.dynatrace.android.agent.WebReqTag r4 = r4.d     // Catch: java.lang.Exception -> L66
                java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L66
                boolean r4 = r4.equals(r2)     // Catch: java.lang.Exception -> L66
                if (r4 == 0) goto L2d
                boolean r1 = com.dynatrace.android.agent.Global.f14077a     // Catch: java.lang.Exception -> L66
                if (r1 == 0) goto L68
                java.lang.String r1 = com.dynatrace.android.callback.CallbackCore.f14140a     // Catch: java.lang.Exception -> L66
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L66
                r4.<init>()     // Catch: java.lang.Exception -> L66
                java.lang.String r5 = "replace tracking for tag "
                r4.append(r5)     // Catch: java.lang.Exception -> L66
                r4.append(r2)     // Catch: java.lang.Exception -> L66
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Exception -> L66
                com.dynatrace.android.agent.util.Utility.h(r1, r2)     // Catch: java.lang.Exception -> L66
                goto L68
            L66:
                r1 = move-exception
                goto L86
            L68:
                java.util.WeakHashMap r1 = com.dynatrace.android.callback.CallbackCore.d     // Catch: java.lang.Exception -> L66
                java.lang.Object r2 = r3.getKey()     // Catch: java.lang.Exception -> L66
                r1.remove(r2)     // Catch: java.lang.Exception -> L66
                java.net.HttpURLConnection r2 = r6.d     // Catch: java.lang.Exception -> L66
                java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Exception -> L66
                com.dynatrace.android.callback.CbWebReqTracker r4 = (com.dynatrace.android.callback.CbWebReqTracker) r4     // Catch: java.lang.Exception -> L66
                r1.put(r2, r4)     // Catch: java.lang.Exception -> L66
                java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Exception -> L66
                com.dynatrace.android.callback.CbWebReqTracker r1 = (com.dynatrace.android.callback.CbWebReqTracker) r1     // Catch: java.lang.Exception -> L66
                return r1
            L83:
                r2 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
                throw r2     // Catch: java.lang.Exception -> L66
            L86:
                boolean r2 = com.dynatrace.android.agent.Global.f14077a
                if (r2 == 0) goto L91
                java.lang.String r2 = com.dynatrace.android.callback.CallbackCore.f14140a
                java.lang.String r3 = "can't access tracking state"
                com.dynatrace.android.agent.util.Utility.g(r1, r2, r3)
            L91:
                java.util.HashSet r1 = com.dynatrace.android.callback.CallbackCore.ConnRegistration.e
                java.net.HttpURLConnection r2 = r6.d
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                boolean r2 = r1.contains(r2)
                if (r2 == 0) goto La4
            La3:
                return r0
            La4:
                java.net.HttpURLConnection r2 = r6.d
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.add(r2)
                r1 = 0
            Lb2:
                int r2 = r1 + 1
                r3 = 3
                if (r1 > r3) goto Lc5
                java.net.HttpURLConnection r1 = r6.d     // Catch: java.lang.Exception -> Lbe
                com.dynatrace.android.callback.CbWebReqTracker r0 = com.dynatrace.android.callback.CallbackCore.a(r1)     // Catch: java.lang.Exception -> Lbe
                goto Lc5
            Lbe:
                r3 = 100
                java.lang.Thread.sleep(r3)     // Catch: java.lang.InterruptedException -> Lc3
            Lc3:
                r1 = r2
                goto Lb2
            Lc5:
                java.util.HashSet r1 = com.dynatrace.android.callback.CallbackCore.ConnRegistration.e
                java.net.HttpURLConnection r2 = r6.d
                int r2 = r2.hashCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r1.remove(r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.callback.CallbackCore.ConnRegistration.a():com.dynatrace.android.callback.CbWebReqTracker");
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            a();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class ListenerActionType {
        public static final ListenerActionType d;
        public static final ListenerActionType e;
        public static final ListenerActionType f;
        public static final ListenerActionType g;
        public static final ListenerActionType h;
        public static final ListenerActionType i;
        public static final ListenerActionType j;
        public static final /* synthetic */ ListenerActionType[] k;

        static {
            ListenerActionType listenerActionType = new ListenerActionType("Clicked", 0);
            d = listenerActionType;
            ListenerActionType listenerActionType2 = new ListenerActionType("ItemClicked", 1);
            e = listenerActionType2;
            ListenerActionType listenerActionType3 = new ListenerActionType("ItemSelected", 2);
            f = listenerActionType3;
            ListenerActionType listenerActionType4 = new ListenerActionType("MenuItemClick", 3);
            g = listenerActionType4;
            ListenerActionType listenerActionType5 = new ListenerActionType("OptionsItemSelected", 4);
            h = listenerActionType5;
            ListenerActionType listenerActionType6 = new ListenerActionType("PageSelected", 5);
            i = listenerActionType6;
            ListenerActionType listenerActionType7 = new ListenerActionType("SwipeToRefresh", 6);
            j = listenerActionType7;
            k = new ListenerActionType[]{listenerActionType, listenerActionType2, listenerActionType3, listenerActionType4, listenerActionType5, listenerActionType6, listenerActionType7};
        }

        public static ListenerActionType valueOf(String str) {
            return (ListenerActionType) Enum.valueOf(ListenerActionType.class, str);
        }

        public static ListenerActionType[] values() {
            return (ListenerActionType[]) k.clone();
        }
    }

    static {
        boolean z = Global.f14077a;
        f14140a = "dtxCallbackCore";
        b = new AtomicBoolean(false);
        c = new Configuration("", "", "", 500, 60000, true, true, true, true, true, new String[0], new String[0], true, InstrumentationFlavor.PLAIN, true);
        d = new WeakHashMap();
        e = null;
        f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.dynatrace.android.callback.CbWebReqTracker a(java.net.HttpURLConnection r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.callback.CallbackCore.a(java.net.HttpURLConnection):com.dynatrace.android.callback.CbWebReqTracker");
    }

    public static void b(ListenerActionType listenerActionType) {
        e(listenerActionType, "Initiate " + listenerActionType.toString());
    }

    public static void c(ListenerActionType listenerActionType, MenuItem menuItem) {
        String strConcat;
        if (menuItem == null) {
            b(listenerActionType);
            return;
        }
        c.getClass();
        CharSequence title = menuItem.getTitle();
        if (title == null || title.length() <= 0) {
            strConcat = "Touch on ".concat(menuItem.getClass().getSimpleName());
        } else {
            strConcat = "Touch on " + ((Object) title);
        }
        e(listenerActionType, strConcat);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(com.dynatrace.android.callback.CallbackCore.ListenerActionType r4, android.view.View r5) {
        /*
            if (r5 != 0) goto L6
            b(r4)
            return
        L6:
            com.dynatrace.android.agent.conf.Configuration r0 = com.dynatrace.android.callback.CallbackCore.c
            r0.getClass()
            java.lang.CharSequence r0 = r5.getContentDescription()
            java.lang.String r1 = "Touch on "
            if (r0 == 0) goto L26
            int r2 = r0.length()
            if (r2 <= 0) goto L26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L66
        L26:
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 == 0) goto L5a
            r0 = r5
            android.widget.TextView r0 = (android.widget.TextView) r0
            int r2 = r0.getInputType()
            boolean r3 = com.dynatrace.android.callback.TextViewHelper.a(r2)
            if (r3 != 0) goto L57
            boolean r2 = com.dynatrace.android.callback.TextViewHelper.b(r2)
            if (r2 == 0) goto L3e
            goto L57
        L3e:
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L5a
            int r2 = r0.length()
            if (r2 <= 0) goto L5a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            goto L66
        L57:
            java.lang.String r5 = "Touch on ****"
            goto L66
        L5a:
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r5 = r1.concat(r5)
        L66:
            e(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.callback.CallbackCore.d(com.dynatrace.android.callback.CallbackCore$ListenerActionType, android.view.View):void");
    }

    public static void e(ListenerActionType listenerActionType, String str) {
        if (Global.f14077a) {
            Utility.h(f14140a, "onUA: " + listenerActionType + " entry=true actionName=" + str);
        }
        if (e != null && f != listenerActionType) {
            e.B(0);
            e = null;
            f = null;
        }
        if (e == null && Global.b.get()) {
            e = DTXAutoAction.w(str, Session.c(false), AdkSettings.l.c);
            f = listenerActionType;
        }
        if (Global.f14077a) {
            Utility.h(f14140a, "onUA: " + listenerActionType + " entry=true");
        }
    }

    public static void f(ListenerActionType listenerActionType) {
        if (Global.f14077a) {
            Utility.h(f14140a, "onUA: " + listenerActionType + " entry=false");
        }
        if (e == null || f != listenerActionType) {
            return;
        }
        DTXAutoAction dTXAutoAction = e;
        dTXAutoAction.B(DTXAutoAction.G);
        dTXAutoAction.y();
        e = null;
        f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void g(com.dynatrace.android.callback.ConnStateParms r28) {
        /*
            Method dump skipped, instructions count: 1229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.callback.CallbackCore.g(com.dynatrace.android.callback.ConnStateParms):void");
    }
}
