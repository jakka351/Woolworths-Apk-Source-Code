package com.dynatrace.android.callback;

import android.view.MenuItem;
import android.view.View;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.callback.CallbackCore;
import com.dynatrace.android.callback.CbConstants;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;

/* loaded from: classes.dex */
public final class Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14139a;

    static {
        boolean z = Global.f14077a;
        f14139a = "dtxCallback";
    }

    public static InputStream a(HttpURLConnection httpURLConnection) throws IOException {
        CbConstants.WrStates wrStates = CbConstants.WrStates.f;
        if (!Global.b.get()) {
            return httpURLConnection.getInputStream();
        }
        ConnStateParms connStateParms = new ConnStateParms(httpURLConnection, CbConstants.WrMethod.d);
        try {
            try {
                w(connStateParms);
                InputStream inputStream = httpURLConnection.getInputStream();
                e(httpURLConnection, connStateParms);
                connStateParms.c = CbConstants.WrStates.e;
                w(connStateParms);
                return inputStream;
            } catch (Exception e) {
                connStateParms.e = e.toString();
                connStateParms.j = e;
                throw e;
            }
        } finally {
            e(httpURLConnection, connStateParms);
            connStateParms.c = wrStates;
            w(connStateParms);
        }
    }

    public static InputStream b(URLConnection uRLConnection) {
        return uRLConnection instanceof HttpURLConnection ? a((HttpURLConnection) uRLConnection) : uRLConnection.getInputStream();
    }

    public static OutputStream c(HttpURLConnection httpURLConnection) {
        return httpURLConnection != null ? d(httpURLConnection) : httpURLConnection.getOutputStream();
    }

    public static OutputStream d(HttpURLConnection httpURLConnection) {
        CbConstants.WrStates wrStates = CbConstants.WrStates.f;
        if (!Global.b.get()) {
            return httpURLConnection.getOutputStream();
        }
        ConnStateParms connStateParms = new ConnStateParms(httpURLConnection, CbConstants.WrMethod.e);
        try {
            try {
                w(connStateParms);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                connStateParms.c = CbConstants.WrStates.e;
                w(connStateParms);
                return outputStream;
            } catch (Exception e) {
                connStateParms.e = e.toString();
                connStateParms.j = e;
                throw e;
            }
        } finally {
            connStateParms.c = wrStates;
            w(connStateParms);
        }
    }

    public static void e(HttpURLConnection httpURLConnection, ConnStateParms connStateParms) throws IOException {
        int responseCode;
        try {
            responseCode = httpURLConnection.getResponseCode();
            try {
                connStateParms.e = httpURLConnection.getResponseMessage();
            } catch (Exception e) {
                e = e;
                if (connStateParms.e == null) {
                    connStateParms.e = e.getMessage();
                }
                connStateParms.d = responseCode;
            }
        } catch (Exception e2) {
            e = e2;
            responseCode = -1;
        }
        connStateParms.d = responseCode;
    }

    public static int f(HttpURLConnection httpURLConnection) {
        CbConstants.WrStates wrStates = CbConstants.WrStates.f;
        if (!Global.b.get()) {
            return httpURLConnection.getResponseCode();
        }
        ConnStateParms connStateParms = new ConnStateParms(httpURLConnection, CbConstants.WrMethod.f);
        int responseCode = -1;
        try {
            try {
                w(connStateParms);
                responseCode = httpURLConnection.getResponseCode();
                e(httpURLConnection, connStateParms);
                connStateParms.c = CbConstants.WrStates.e;
                w(connStateParms);
                return responseCode;
            } catch (Exception e) {
                connStateParms.e = e.toString();
                connStateParms.j = e;
                throw e;
            }
        } finally {
            connStateParms.d = responseCode;
            connStateParms.c = wrStates;
            w(connStateParms);
        }
    }

    public static void g(View view) {
        if (Global.b.get()) {
            CallbackCore.d(CallbackCore.ListenerActionType.d, view);
        }
    }

    public static void h() {
        CallbackCore.f(CallbackCore.ListenerActionType.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(android.app.Application r25) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dynatrace.android.callback.Callback.i(android.app.Application):void");
    }

    public static void j(View view) {
        if (Global.b.get()) {
            CallbackCore.d(CallbackCore.ListenerActionType.e, view);
        }
    }

    public static void k() {
        CallbackCore.f(CallbackCore.ListenerActionType.e);
    }

    public static void l(View view) {
        if (Global.b.get()) {
            CallbackCore.d(CallbackCore.ListenerActionType.f, view);
        }
    }

    public static void m() {
        CallbackCore.f(CallbackCore.ListenerActionType.f);
    }

    public static void n(MenuItem menuItem) {
        if (Global.b.get()) {
            CallbackCore.c(CallbackCore.ListenerActionType.g, menuItem);
        }
    }

    public static void o() {
        CallbackCore.f(CallbackCore.ListenerActionType.g);
    }

    public static void p(MenuItem menuItem) {
        if (Global.b.get()) {
            CallbackCore.c(CallbackCore.ListenerActionType.h, menuItem);
        }
    }

    public static void q() {
        CallbackCore.f(CallbackCore.ListenerActionType.h);
    }

    public static void r() {
        if (Global.b.get()) {
            CallbackCore.b(CallbackCore.ListenerActionType.i);
        }
    }

    public static void s() {
        CallbackCore.f(CallbackCore.ListenerActionType.i);
    }

    public static void t() {
        if (Global.b.get()) {
            CallbackCore.e(CallbackCore.ListenerActionType.j, "SwipeToRefresh");
        }
    }

    public static void u() {
        CallbackCore.f(CallbackCore.ListenerActionType.j);
    }

    public static void v(URLConnection uRLConnection) {
        if (Global.b.get() && (uRLConnection instanceof HttpURLConnection)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            String str = CallbackCore.f14140a;
            if (Dynatrace.a() && Session.a().i.a(EventType.p)) {
                CallbackCore.ConnRegistration connRegistration = new CallbackCore.ConnRegistration();
                connRegistration.d = httpURLConnection;
                connRegistration.a();
            }
        }
    }

    public static void w(ConnStateParms connStateParms) {
        try {
            CallbackCore.g(connStateParms);
        } catch (Exception e) {
            if (Global.f14077a) {
                Utility.g(e, f14139a, connStateParms.toString());
            }
        }
    }
}
