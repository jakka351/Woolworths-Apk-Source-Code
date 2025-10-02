package com.salesforce.marketingcloud.messages.push;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationManagerCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCService;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.alarms.b;
import com.salesforce.marketingcloud.behaviors.c;
import com.salesforce.marketingcloud.e;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.h;
import com.salesforce.marketingcloud.k;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.notifications.a;
import com.salesforce.marketingcloud.storage.j;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class a extends PushMessageManager implements e, b.InterfaceC0348b {

    @VisibleForTesting
    static final String t = "et_push_enabled";
    private static final String u = "last_push_token_refresh";
    private static final String v = "content-available";
    private static final String w = "_c";
    private static final String x = "_p";
    private static final long y = TimeUnit.HOURS.toMillis(48);
    private final Context j;
    private final com.salesforce.marketingcloud.notifications.a k;
    private final com.salesforce.marketingcloud.alarms.b l;
    private final j n;
    private final String o;
    private int q;
    private BroadcastReceiver r;
    private boolean s;
    private final Set<PushMessageManager.SilentPushListener> m = new ArraySet(0);
    private final Set<PushMessageManager.PushTokenRefreshListener> p = new ArraySet(0);

    /* renamed from: com.salesforce.marketingcloud.messages.push.a$a, reason: collision with other inner class name */
    public class C0373a extends BroadcastReceiver {
        public C0373a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(PushMessageManager.d, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(PushMessageManager.d, "Received null action", new Object[0]);
            } else if (action.equals(PushMessageManager.e)) {
                a.this.a(intent.getExtras());
            } else {
                g.a(PushMessageManager.d, "Received unknown action: %s", action);
            }
        }
    }

    public a(@NonNull Context context, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.notifications.a aVar, @NonNull com.salesforce.marketingcloud.alarms.b bVar, @Nullable String str) {
        this.j = (Context) com.salesforce.marketingcloud.util.j.a(context, "Content is null");
        this.n = (j) com.salesforce.marketingcloud.util.j.a(jVar, "Storage is null");
        this.k = (com.salesforce.marketingcloud.notifications.a) com.salesforce.marketingcloud.util.j.a(aVar, "NotificationManager is null");
        this.l = (com.salesforce.marketingcloud.alarms.b) com.salesforce.marketingcloud.util.j.a(bVar, "AlarmScheduler is null");
        this.o = str;
    }

    private void a() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(PushMessageManager.h, this.s);
        c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_CUSTOMER_PUSH_MESSAGING_TOGGLED, bundle);
    }

    private void b() {
        JSONArray jSONArrayOptJSONArray = getPushDebugInfo().optJSONArray("messagingService");
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 2) {
            return;
        }
        g.e(PushMessageManager.d, "Possible Multiple Push Provider implementation issue detected in your application. This may lead to the malfunctioning of the Push SDK.", new Object[0]);
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            int iOptInt = jSONObjectOptJSONObject.optInt("priority");
            String strOptString = jSONObjectOptJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (iOptInt > -1) {
                g.d(PushMessageManager.d, YU.a.g(strOptString, " is having higher priority than the Push SDK"), new Object[0]);
            }
        }
    }

    private void c(Map<String, String> map) {
        map.remove(w);
        map.remove(x);
        d(map);
    }

    private void d(Map<String, String> map) {
        synchronized (this.m) {
            for (PushMessageManager.SilentPushListener silentPushListener : this.m) {
                if (silentPushListener != null) {
                    try {
                        silentPushListener.silentPushReceived(map);
                    } catch (Exception e) {
                        g.b(PushMessageManager.d, e, "%s threw an exception while processing the silent push message", silentPushListener.getClass().getName());
                    }
                }
            }
        }
    }

    private void e(Map<String, String> map) {
        if (map == null || f(map)) {
            return;
        }
        c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_PUSH_RECEIVED, a(map));
        if (k.a(map)) {
            g.d(PushMessageManager.d, "Sync handler push received.", new Object[0]);
            return;
        }
        if (!isPushEnabled()) {
            g.a(PushMessageManager.d, "Push Messaging is disabled.  Ignoring message.", new Object[0]);
            return;
        }
        if (map.containsKey(v)) {
            b(map);
            return;
        }
        if (map.containsKey(w)) {
            c(map);
            return;
        }
        try {
            NotificationMessage notificationMessageA = h.a(map);
            if (TextUtils.isEmpty(notificationMessageA.alert().trim())) {
                g.a(PushMessageManager.d, "Message (%s) was received but does not have an alert message.", notificationMessageA.id());
            } else {
                this.k.a(notificationMessageA, (a.b) null);
            }
        } catch (Exception e) {
            g.b(PushMessageManager.d, e, "Unable to show push notification", new Object[0]);
        }
    }

    private boolean f(Map<String, String> map) {
        if (com.salesforce.marketingcloud.b.a(this.q, 4)) {
            g.a(PushMessageManager.d, "Blocking push message.  Received a push message when the push feature is blocked.", new Object[0]);
            return true;
        }
        if (!com.salesforce.marketingcloud.b.a(this.q, 128) || !com.salesforce.marketingcloud.messages.inbox.a.a(map)) {
            return false;
        }
        g.a(PushMessageManager.d, "Blocking push message.  Received an inbox message when the inbox feature is blocked.", new Object[0]);
        return true;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public String componentName() {
        return "PushMessageManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public JSONObject componentState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("pushEnabled", this.s);
            jSONObject.put("pushPermissionsAllowed", new NotificationManagerCompat(this.j).b.areNotificationsEnabled());
            synchronized (this.p) {
                try {
                    if (!this.p.isEmpty()) {
                        JSONArray jSONArray = new JSONArray();
                        for (PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener : this.p) {
                            if (pushTokenRefreshListener != null) {
                                jSONArray.put(pushTokenRefreshListener.getClass().getName());
                            }
                        }
                        jSONObject.put("tokenRefreshListeners", jSONArray);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            jSONObject.put("debugInfo", getPushDebugInfo());
            return jSONObject;
        } catch (JSONException e) {
            g.b(PushMessageManager.d, e, "Unable to create component state for $s", componentName());
            return jSONObject;
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i) {
        if (!com.salesforce.marketingcloud.b.a(i, 4)) {
            if (com.salesforce.marketingcloud.b.a(this.q, 4)) {
                this.q = i;
                c();
                this.l.a(this, a.EnumC0346a.e);
                enablePush();
                String str = this.o;
                if (str != null) {
                    MCService.b(this.j, str);
                    return;
                }
                return;
            }
            return;
        }
        disablePush();
        if (this.r != null) {
            LocalBroadcastManager.a(this.j).d(this.r);
        }
        com.salesforce.marketingcloud.alarms.b bVar = this.l;
        a.EnumC0346a enumC0346a = a.EnumC0346a.e;
        bVar.e(enumC0346a);
        this.l.d(enumC0346a);
        if (com.salesforce.marketingcloud.b.c(i, 4)) {
            com.salesforce.marketingcloud.storage.c cVarC = this.n.c();
            cVarC.a(com.salesforce.marketingcloud.storage.c.i);
            cVarC.a(com.salesforce.marketingcloud.storage.c.e);
        }
        this.q = i;
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public synchronized void disablePush() {
        if (this.s && !com.salesforce.marketingcloud.b.a(this.q, 4)) {
            this.s = false;
            a();
            d();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public synchronized void enablePush() {
        if (com.salesforce.marketingcloud.b.a(this.q, 4)) {
            return;
        }
        this.s = true;
        a();
        d();
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    @NonNull
    public JSONObject getPushDebugInfo() {
        try {
            return b.a(this.j, this.o, this.n.c().b(com.salesforce.marketingcloud.storage.c.e, null));
        } catch (Exception e) {
            g.b(PushMessageManager.d, e, "Unable to acquire push debug info.", new Object[0]);
            return new JSONObject();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    @Nullable
    public String getPushToken() {
        return this.n.c().b(com.salesforce.marketingcloud.storage.c.e, null);
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public boolean handleMessage(@NonNull RemoteMessage remoteMessage) {
        if (PushMessageManager.isMarketingCloudPush(remoteMessage)) {
            e(remoteMessage.getData());
            return true;
        }
        g.a(PushMessageManager.d, "Message was not sent from the Marketing Cloud.  Message ignored.", new Object[0]);
        return false;
    }

    @Override // com.salesforce.marketingcloud.e
    public void init(@NonNull InitializationStatus.a aVar, int i) {
        this.q = i;
        if (com.salesforce.marketingcloud.b.b(i, 4)) {
            this.s = this.n.f().getBoolean(t, true);
            c();
            com.salesforce.marketingcloud.alarms.b bVar = this.l;
            a.EnumC0346a enumC0346a = a.EnumC0346a.e;
            bVar.a(this, enumC0346a);
            if (this.o == null) {
                g.e(PushMessageManager.d, "No sender id was provided during initialization.  You will not receive push messages until a token is manually set.", new Object[0]);
                this.l.d(enumC0346a);
                this.n.c().a(com.salesforce.marketingcloud.storage.c.i);
                return;
            }
            b();
            if (!this.o.equals(this.n.c().b(com.salesforce.marketingcloud.storage.c.i, null))) {
                g.d(PushMessageManager.d, "Sender Id has changed.  Refresh system token.", new Object[0]);
                MCService.b(this.j, this.o);
            } else if (this.n.f().getLong(u, 0L) + y < System.currentTimeMillis()) {
                g.d(PushMessageManager.d, "Push token refresh cool down expired.  Refresh system token.", new Object[0]);
                MCService.b(this.j, this.o);
            }
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public synchronized boolean isPushEnabled() {
        return this.s;
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void registerSilentPushListener(@NonNull PushMessageManager.SilentPushListener silentPushListener) {
        if (silentPushListener == null) {
            return;
        }
        synchronized (this.m) {
            this.m.add(silentPushListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void registerTokenRefreshListener(@NonNull PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener) {
        if (pushTokenRefreshListener == null) {
            return;
        }
        synchronized (this.p) {
            this.p.add(pushTokenRefreshListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void setPushToken(@NonNull String str) {
        if (com.salesforce.marketingcloud.b.b(this.q, 4)) {
            if (str == null) {
                g.b(PushMessageManager.d, "Provided pushToken was null", new Object[0]);
                return;
            }
            if (this.o != null) {
                g.a(PushMessageManager.d, "Setting the SenderId during SDK initialization and setting the push token will cause conflicts in the system and could prevent the device from receiving push messages.", new Object[0]);
            }
            com.salesforce.marketingcloud.storage.c cVarC = this.n.c();
            cVarC.a(com.salesforce.marketingcloud.storage.c.i);
            cVarC.a(com.salesforce.marketingcloud.storage.c.e, str);
            this.l.d(a.EnumC0346a.e);
            b(str);
        }
    }

    @Override // com.salesforce.marketingcloud.d
    public void tearDown(boolean z) {
        if (this.r != null) {
            LocalBroadcastManager.a(this.j).d(this.r);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void unregisterSilentPushListener(@NonNull PushMessageManager.SilentPushListener silentPushListener) {
        synchronized (this.m) {
            this.m.remove(silentPushListener);
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public void unregisterTokenRefreshListener(@NonNull PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener) {
        synchronized (this.p) {
            this.p.remove(pushTokenRefreshListener);
        }
    }

    public static void a(@NonNull Context context, boolean z, String str, String str2) {
        LocalBroadcastManager.a(context).c(new Intent(PushMessageManager.e).putExtra(PushMessageManager.f, z).putExtra(PushMessageManager.g, str).putExtra(PushMessageManager.i, str2));
    }

    private void c() {
        this.r = new C0373a();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PushMessageManager.e);
        LocalBroadcastManager.a(this.j).b(this.r, intentFilter);
    }

    private void d() {
        j jVar = this.n;
        if (jVar != null) {
            jVar.f().edit().putBoolean(t, this.s).apply();
        }
    }

    @Override // com.salesforce.marketingcloud.messages.push.PushMessageManager
    public boolean handleMessage(@NonNull Map<String, String> map) {
        if (PushMessageManager.isMarketingCloudPush(map)) {
            e(map);
            return true;
        }
        g.a(PushMessageManager.d, "Message was not sent from the Marketing Cloud.  Message ignored.", new Object[0]);
        return false;
    }

    private static Bundle a(@NonNull Map<String, String> map) {
        Bundle bundle = new Bundle();
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        return bundle;
    }

    private void a(String str) {
        synchronized (this.p) {
            for (PushMessageManager.PushTokenRefreshListener pushTokenRefreshListener : this.p) {
                if (pushTokenRefreshListener != null) {
                    try {
                        pushTokenRefreshListener.onTokenRefreshed(str);
                    } catch (Exception e) {
                        g.b(PushMessageManager.d, e, "%s threw an exception while processing the token refresh", pushTokenRefreshListener.getClass().getName());
                    }
                }
            }
        }
    }

    @Override // com.salesforce.marketingcloud.alarms.b.InterfaceC0348b
    public void a(@NonNull a.EnumC0346a enumC0346a) {
        String str;
        if (enumC0346a != a.EnumC0346a.e || (str = this.o) == null) {
            return;
        }
        MCService.b(this.j, str);
    }

    public void a(Bundle bundle) {
        com.salesforce.marketingcloud.storage.c cVarC = this.n.c();
        if (!bundle.getBoolean(PushMessageManager.f, false)) {
            cVarC.a(com.salesforce.marketingcloud.storage.c.i);
            this.l.b(a.EnumC0346a.e);
            return;
        }
        String string = bundle.getString(PushMessageManager.i, "");
        cVarC.a(com.salesforce.marketingcloud.storage.c.e, string);
        cVarC.a(com.salesforce.marketingcloud.storage.c.i, bundle.getString(PushMessageManager.g, ""));
        b(string);
        this.l.d(a.EnumC0346a.e);
        this.n.f().edit().putLong(u, System.currentTimeMillis()).apply();
        a(string);
    }

    private void b(Map<String, String> map) {
        String str = map.get(v);
        if (str != null) {
            try {
                if (Integer.parseInt(str) == 1) {
                    d(map);
                }
            } catch (Exception e) {
                g.b(PushMessageManager.d, e, "Unable to parse content available flag: %s", str);
            }
        }
    }

    private void b(String str) {
        c.a(this.j, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_TOKEN_REFRESHED, au.com.woolworths.shop.checkout.ui.confirmation.c.g(PushMessageManager.i, str));
    }
}
