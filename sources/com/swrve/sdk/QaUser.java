package com.swrve.sdk;

import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTClient;
import com.swrve.sdk.rest.RESTResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class QaUser {
    public static QaUser p;
    public ScheduledExecutorService b;
    public int d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public boolean k;
    public boolean l;
    public ExecutorService m;
    public static final Object o = new Object();
    public static final RESTClient q = new RESTClient(15000);

    /* renamed from: a, reason: collision with root package name */
    public final List f19037a = Collections.synchronizedList(new ArrayList());
    public boolean c = false;
    public final Runnable n = new Runnable() { // from class: com.swrve.sdk.QaUser.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                QaUser qaUser = QaUser.this;
                Object obj = QaUser.o;
                qaUser.i();
            } catch (Exception e) {
                SwrveLogger.c("QaUser error in runnable trying to flush log queue.", e, new Object[0]);
            }
        }
    };

    /* loaded from: classes6.dex */
    public class RESTResponseListener implements IRESTResponseListener {

        /* renamed from: a, reason: collision with root package name */
        public String f19038a;

        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void a(Exception exc) {
            SwrveLogger.c("QaUser request to %s failed", exc, this.f19038a);
        }

        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void b(RESTResponse rESTResponse) {
            String str = this.f19038a;
            int i = rESTResponse.f19107a;
            String str2 = rESTResponse.b;
            if (SwrveHelper.v(i)) {
                SwrveLogger.g("QaUser request to %s sent with response code %s: %s", str, Integer.valueOf(i), str2);
            } else {
                SwrveLogger.d("QaUser request to %s failed with error code %s: %s", str, Integer.valueOf(i), str2);
            }
        }
    }

    public static void h(String str, String str2, String str3) throws JSONException {
        try {
            QaUser qaUserJ = j();
            if (qaUserJ.k) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("asset_name", str);
                jSONObject.put("image_url", str2);
                jSONObject.put("reason", str3);
                qaUserJ.m("asset-failed-to-download", jSONObject.toString());
            }
        } catch (Exception e) {
            SwrveLogger.c("Error trying to queue asset-failed-to-download qalogevent.", e, new Object[0]);
        }
    }

    public static QaUser j() {
        synchronized (o) {
            try {
                if (p == null) {
                    QaUser qaUser = new QaUser();
                    p = qaUser;
                    qaUser.k();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p;
    }

    public static boolean l() {
        try {
            return j().k;
        } catch (Exception e) {
            SwrveLogger.c("Error calling QaUser.isLoggingEnabled", e, new Object[0]);
            return false;
        }
    }

    public static void o() {
        try {
            synchronized (o) {
                try {
                    QaUser qaUser = p;
                    if (qaUser != null && qaUser.m != null) {
                        qaUser.i();
                        p.m.shutdown();
                        p.b.shutdown();
                    }
                    QaUser qaUser2 = new QaUser();
                    p = qaUser2;
                    qaUser2.k();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            SwrveLogger.c("Error updating qauser singleton", e, new Object[0]);
        }
    }

    public static void p(ArrayList arrayList) {
        try {
            j().g(arrayList);
        } catch (Exception e) {
            SwrveLogger.c("Error trying to queue wrapped event qalogevent.", e, new Object[0]);
        }
    }

    public final void a(String str, String str2, String str3, int i, String str4, int i2, boolean z) throws JSONException {
        if (this.k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaign_id", i);
            jSONObject.put("variant_id", i2);
            jSONObject.put("unresolved_url", str2);
            jSONObject.put("has_fallback", z);
            jSONObject.put("reason", str4);
            if (SwrveHelper.o(str3)) {
                jSONObject.put("image_url", str3);
            }
            if (SwrveHelper.o(str)) {
                jSONObject.put("asset_name", str);
            }
            m("asset-failed-to-display", jSONObject.toString());
        }
    }

    public final void b(int i, int i2, String str, String str2, String str3) throws JSONException {
        if (this.k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaign_id", i);
            jSONObject.put("variant_id", i2);
            jSONObject.put("button_name", str);
            jSONObject.put("action_type", str2);
            jSONObject.put("action_value", str3);
            m("campaign-button-clicked", jSONObject.toString());
        }
    }

    public final void c(String str, String str2, HashMap map, Map map2, boolean z) throws JSONException {
        if (this.k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_name", str);
            jSONObject.put("event_payload", map2 == null ? new JSONObject() : new JSONObject(map2));
            jSONObject.put("displayed", z);
            jSONObject.put("reason", str2);
            JSONArray jSONArray = new JSONArray();
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                QaCampaignInfo qaCampaignInfo = (QaCampaignInfo) ((Map.Entry) it.next()).getValue();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", qaCampaignInfo.f19036a);
                jSONObject2.put("variant_id", qaCampaignInfo.b);
                jSONObject2.put("type", qaCampaignInfo.c);
                jSONObject2.put("displayed", qaCampaignInfo.d);
                jSONObject2.put("reason", qaCampaignInfo.e);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("campaigns", jSONArray);
            m("campaign-triggered", jSONObject.toString());
        }
    }

    public final void d(String str, String str2, Map map) {
        if (this.k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event_name", str);
            jSONObject.put("event_payload", map == null ? new JSONObject() : new JSONObject(map));
            jSONObject.put("displayed", false);
            jSONObject.put("reason", str2);
            jSONObject.put("campaigns", new JSONArray());
            m("campaign-triggered", jSONObject.toString());
        }
    }

    public final void e(ArrayList arrayList) throws JSONException {
        if (this.k) {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                QaCampaignInfo qaCampaignInfo = (QaCampaignInfo) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", qaCampaignInfo.f19036a);
                jSONObject2.put("variant_id", qaCampaignInfo.b);
                jSONObject2.put("type", qaCampaignInfo.c);
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("campaigns", jSONArray);
            m("campaigns-downloaded", jSONObject.toString());
        }
    }

    public final void f(int i, int i2, String str) throws JSONException {
        if (this.k) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaign_id", i);
            jSONObject.put("variant_id", i2);
            jSONObject.put("unresolved_data", str);
            jSONObject.put("reason", "Failed to resolve personalization");
            m("embedded-personalization-failed", jSONObject.toString());
        }
    }

    public final void g(ArrayList arrayList) throws JSONException {
        String string;
        if (this.k) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = new JSONObject((String) it.next());
                JSONObject jSONObject2 = new JSONObject();
                if (jSONObject.has("type")) {
                    jSONObject2.put("type", jSONObject.getString("type"));
                    jSONObject.remove("type");
                }
                if (jSONObject.has("seqnum")) {
                    jSONObject2.put("seqnum", jSONObject.getLong("seqnum"));
                    jSONObject.remove("seqnum");
                }
                if (jSONObject.has("time")) {
                    jSONObject2.put("client_time", jSONObject.getLong("time"));
                    jSONObject.remove("time");
                }
                if (jSONObject.has("payload")) {
                    string = jSONObject.getJSONObject("payload").toString();
                    jSONObject.remove("payload");
                } else {
                    string = "{}";
                }
                jSONObject2.put("payload", string);
                jSONObject2.put("parameters", jSONObject);
                m("event", jSONObject2.toString());
            }
        }
    }

    public final void i() throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.f19037a) {
            try {
                if (this.f19037a.size() > 0) {
                    Iterator it = this.f19037a.iterator();
                    long j = 0;
                    while (it.hasNext()) {
                        linkedHashMap.put(Long.valueOf(j), (String) it.next());
                        j = 1 + j;
                    }
                    this.f19037a.clear();
                } else {
                    this.c = true;
                    ScheduledExecutorService scheduledExecutorService = this.b;
                    if (scheduledExecutorService != null) {
                        scheduledExecutorService.shutdown();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (linkedHashMap.size() > 0) {
            final String strC = EventHelper.c(linkedHashMap, this.f, this.h, this.i, this.j);
            final String str = this.g;
            synchronized (this) {
                this.m.execute(new Runnable(this) { // from class: com.swrve.sdk.QaUser.2
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        String str2 = strC;
                        SwrveLogger.g("QaUser request with body:\n %s", str2);
                        RESTClient rESTClient = QaUser.q;
                        RESTResponseListener rESTResponseListener = new RESTResponseListener();
                        String str3 = str;
                        rESTResponseListener.f19038a = str3;
                        rESTClient.a(str3, str2, rESTResponseListener);
                    }
                });
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void k() {
        try {
            ?? r3 = SwrveCommon.f19047a;
            String userId = r3.getUserId();
            this.f = userId;
            String strD = r3.d(userId);
            if (SwrveHelper.p(strD)) {
                this.k = false;
                this.l = false;
            } else {
                try {
                    JSONObject jSONObject = new JSONObject(strD);
                    if (jSONObject.has("logging")) {
                        this.k = jSONObject.optBoolean("logging", false);
                    }
                    if (jSONObject.has("reset_device_state")) {
                        this.l = jSONObject.optBoolean("reset_device_state", false);
                    }
                } catch (Exception e) {
                    SwrveLogger.c("SwrveSDK problem with decoding qauser json: %s", e, strD);
                }
            }
            if (!this.k) {
                ScheduledExecutorService scheduledExecutorService = this.b;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdown();
                    return;
                }
                return;
            }
            this.d = r3.getAppId();
            this.e = r3.getApiKey();
            this.g = r3.A();
            this.h = r3.getAppVersion();
            this.m = Executors.newSingleThreadExecutor();
            this.i = SwrveHelper.e(this.d, this.e, this.f);
            this.j = r3.getDeviceId();
            n();
        } catch (Exception e2) {
            SwrveLogger.c("Error trying to init QaUser.", e2, new Object[0]);
        }
    }

    public final void m(String str, String str2) {
        try {
            String strH = EventHelper.h(System.currentTimeMillis(), str, str2);
            List list = this.f19037a;
            if (list != null) {
                list.add(strH);
                synchronized (this.f19037a) {
                    try {
                        if (this.c) {
                            n();
                            this.c = false;
                        }
                    } finally {
                    }
                }
            }
        } catch (Exception e) {
            SwrveLogger.c("Error trying to queue qalogevent.", e, new Object[0]);
        }
    }

    public final void n() {
        try {
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(5);
            this.b = scheduledExecutorServiceNewScheduledThreadPool;
            scheduledExecutorServiceNewScheduledThreadPool.scheduleAtFixedRate(this.n, 0L, 4000L, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            SwrveLogger.c("Error trying to schedule repeating qalogqueue flush.", e, new Object[0]);
        }
    }
}
