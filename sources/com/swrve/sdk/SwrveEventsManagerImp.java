package com.swrve.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.localstorage.LocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import com.swrve.sdk.rest.IRESTClient;
import com.swrve.sdk.rest.IRESTResponseListener;
import com.swrve.sdk.rest.RESTClient;
import com.swrve.sdk.rest.RESTResponse;
import com.swrve.sdk.rest.RESTResponseLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes.dex */
public class SwrveEventsManagerImp implements SwrveEventsManager {
    public static final Object h = new Object();
    public static boolean i = true;

    /* renamed from: a, reason: collision with root package name */
    public final Context f19052a;
    public final SwrveConfigBase b;
    public final IRESTClient c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* renamed from: com.swrve.sdk.SwrveEventsManagerImp$1, reason: invalid class name */
    class AnonymousClass1 implements IPostBatchRequestListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkedHashMap f19053a;

        public AnonymousClass1(LinkedHashMap linkedHashMap) {
            this.f19053a = linkedHashMap;
        }
    }

    public SwrveEventsManagerImp(Context context, SwrveConfig swrveConfig, RESTClient rESTClient, String str, String str2, String str3, String str4) {
        this.f19052a = context;
        this.b = swrveConfig;
        this.c = rESTClient;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final void a(RESTResponse rESTResponse, int i2) {
        RESTResponseLog rESTResponseLog;
        String strValueOf = String.valueOf(rESTResponse.f19107a);
        Gson gson = new Gson();
        synchronized (h) {
            try {
                SharedPreferences sharedPreferences = this.f19052a.getSharedPreferences("EVENT_SEND_RESPONSE_LOG", 0);
                String string = sharedPreferences.getString(strValueOf, null);
                if (string == null) {
                    rESTResponseLog = new RESTResponseLog(rESTResponse.f19107a, i2, 1, System.currentTimeMillis(), rESTResponse.b, rESTResponse.c);
                } else {
                    RESTResponseLog rESTResponseLog2 = (RESTResponseLog) gson.f(string, new TypeToken<RESTResponseLog>() { // from class: com.swrve.sdk.SwrveEventsManagerImp.3
                    }.getType());
                    rESTResponseLog = new RESTResponseLog(rESTResponse.f19107a, rESTResponseLog2.b + i2, rESTResponseLog2.c + 1, System.currentTimeMillis(), rESTResponse.b, rESTResponse.c);
                }
                sharedPreferences.edit().putString(strValueOf, gson.j(rESTResponseLog)).apply();
                i = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int b(LinkedHashMap linkedHashMap) {
        JSONException jSONException;
        final int size;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (linkedHashMap.isEmpty()) {
            return 0;
        }
        SwrveLogger.e("Sending queued events", new Object[0]);
        try {
            localStorage = null;
            for (final LocalStorage localStorage : linkedHashMap.keySet()) {
                linkedHashMap2.putAll((Map) linkedHashMap.get(localStorage));
            }
            size = linkedHashMap2.size();
            try {
                final String strC = EventHelper.c(linkedHashMap2, this.d, this.e, this.f, this.g);
                SwrveLogger.e("Sending %s events to Swrve", Integer.valueOf(linkedHashMap2.size()));
                final AnonymousClass1 anonymousClass1 = new AnonymousClass1(linkedHashMap);
                this.c.a(this.b.f19078a + "/1/batch", strC, new IRESTResponseListener() { // from class: com.swrve.sdk.SwrveEventsManagerImp.2
                    @Override // com.swrve.sdk.rest.IRESTResponseListener
                    public final void a(Exception exc) {
                        SwrveLogger.c("Error posting batch of events. postData:%s", exc, strC);
                    }

                    /* JADX WARN: Type inference failed for: r6v9, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
                    @Override // com.swrve.sdk.rest.IRESTResponseListener
                    public final void b(RESTResponse rESTResponse) {
                        Map<String, ?> all;
                        int i2 = rESTResponse.f19107a;
                        String str = SwrveHelper.f19056a;
                        boolean z = true;
                        if (i2 >= 400 && i2 < 500) {
                            SwrveEventsManagerImp.this.a(rESTResponse, size);
                            int i3 = rESTResponse.f19107a;
                            z = true ^ (i3 == 429);
                            SwrveLogger.d("Error sending events to Swrve. responseCode: %s\tresponseBody:%s", Integer.valueOf(i3), rESTResponse.b);
                        } else if (SwrveHelper.v(i2)) {
                            SwrveEventsManagerImp swrveEventsManagerImp = SwrveEventsManagerImp.this;
                            LocalStorage localStorage2 = localStorage;
                            if (SwrveEventsManagerImp.i) {
                                SharedPreferences sharedPreferences = swrveEventsManagerImp.f19052a.getSharedPreferences("EVENT_SEND_RESPONSE_LOG", 0);
                                synchronized (SwrveEventsManagerImp.h) {
                                    all = sharedPreferences.getAll();
                                    sharedPreferences.edit().clear().apply();
                                    SwrveEventsManagerImp.i = false;
                                }
                                try {
                                    ArrayList arrayList = new ArrayList();
                                    Gson gson = new Gson();
                                    Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
                                    while (it.hasNext()) {
                                        RESTResponseLog rESTResponseLog = (RESTResponseLog) gson.f((String) it.next().getValue(), new TypeToken<RESTResponseLog>() { // from class: com.swrve.sdk.SwrveEventsManagerImp.4
                                        }.getType());
                                        HashMap map = new HashMap();
                                        map.put("code", String.valueOf(rESTResponseLog.f19108a));
                                        map.put("events_count", String.valueOf(rESTResponseLog.b));
                                        map.put("request_count", String.valueOf(rESTResponseLog.c));
                                        map.put("body", rESTResponseLog.d);
                                        map.put("headers", rESTResponseLog.e);
                                        map.put("time", String.valueOf(rESTResponseLog.f));
                                        HashMap map2 = new HashMap();
                                        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "Swrve.RestResponseLog");
                                        ?? r6 = SwrveCommon.f19047a;
                                        arrayList.add(EventHelper.b("event", map2, map, r6 == 0 ? 0 : r6.p(), System.currentTimeMillis()));
                                    }
                                    if (localStorage2 != null) {
                                        swrveEventsManagerImp.c(arrayList, localStorage2);
                                    }
                                } catch (Exception e) {
                                    SwrveLogger.c("Error sending rest response logs.", e, new Object[0]);
                                }
                            }
                            SwrveLogger.e("Events sent to Swrve", new Object[0]);
                        } else {
                            int i4 = rESTResponse.f19107a;
                            if (i4 >= 500) {
                                SwrveLogger.d("Error sending events to Swrve. Wil retry. responseCode: %s\tresponseBody:%s", Integer.valueOf(i4), rESTResponse.b);
                                z = false;
                            } else {
                                SwrveEventsManagerImp.this.a(rESTResponse, size);
                                SwrveLogger.d("Error sending events to Swrve. responseCode: %s\tresponseBody:%s", Integer.valueOf(rESTResponse.f19107a), rESTResponse.b);
                            }
                        }
                        AnonymousClass1 anonymousClass12 = (AnonymousClass1) anonymousClass1;
                        LinkedHashMap linkedHashMap3 = anonymousClass12.f19053a;
                        if (!z) {
                            SwrveLogger.d("Batch of events could not be sent, retrying", new Object[0]);
                            return;
                        }
                        for (LocalStorage localStorage3 : linkedHashMap3.keySet()) {
                            localStorage3.e(SwrveEventsManagerImp.this.d, ((LinkedHashMap) linkedHashMap3.get(localStorage3)).keySet());
                        }
                    }
                });
                return size;
            } catch (JSONException e) {
                jSONException = e;
                SwrveLogger.c("Unable to generate event batch, and send events", jSONException, new Object[0]);
                return size;
            }
        } catch (JSONException e2) {
            jSONException = e2;
            size = 0;
        }
    }

    public final int c(List list, LocalStorage localStorage) {
        int iB;
        if (list == null || list.size() == 0) {
            return 0;
        }
        synchronized (SwrveMultiLayerLocalStorage.d) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                linkedHashMap.put(Long.valueOf(localStorage.c(this.d, str)), str);
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put(localStorage, linkedHashMap);
            iB = b(linkedHashMap2);
        }
        return iB;
    }
}
