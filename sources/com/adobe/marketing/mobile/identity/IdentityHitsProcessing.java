package com.adobe.marketing.mobile.identity;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.EventCoder;
import com.adobe.marketing.mobile.services.DataEntity;
import com.adobe.marketing.mobile.services.HitProcessing;
import com.adobe.marketing.mobile.services.HttpConnecting;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NetworkCallback;
import com.adobe.marketing.mobile.services.NetworkRequest;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.util.StreamUtils;
import java.util.ArrayList;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class IdentityHitsProcessing implements HitProcessing {

    /* renamed from: a, reason: collision with root package name */
    public final IdentityExtension f13169a;

    public IdentityHitsProcessing(IdentityExtension identityExtension) {
        this.f13169a = identityExtension;
    }

    public static IdentityResponseObject b(JSONObject jSONObject) {
        IdentityResponseObject identityResponseObject = new IdentityResponseObject();
        identityResponseObject.e = 600L;
        identityResponseObject.f13170a = jSONObject.optString("d_blob", null);
        identityResponseObject.d = jSONObject.optString("error_msg", null);
        identityResponseObject.b = jSONObject.optString("d_mid", null);
        int iOptInt = jSONObject.optInt("dcs_region", -1);
        identityResponseObject.c = iOptInt != -1 ? Integer.toString(iOptInt) : null;
        identityResponseObject.e = jSONObject.optLong("id_sync_ttl", 600L);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("d_optout");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                try {
                    arrayList.add(jSONArrayOptJSONArray.getString(i));
                } catch (JSONException unused) {
                    Log.a();
                }
            }
            identityResponseObject.f = arrayList;
        }
        return identityResponseObject;
    }

    @Override // com.adobe.marketing.mobile.services.HitProcessing
    public final void a(DataEntity dataEntity, final au.com.woolworths.product.details.epoxy.a aVar) {
        final IdentityHit identityHit;
        try {
            JSONObject jSONObject = new JSONObject(dataEntity.c);
            identityHit = new IdentityHit(jSONObject.getString("URL"), EventCoder.a(jSONObject.getString("EVENT")));
        } catch (JSONException unused) {
            identityHit = null;
        }
        if (identityHit == null) {
            aVar.d(true);
            return;
        }
        String str = identityHit.f13168a;
        if (str == null || identityHit.b == null) {
            Log.a();
            aVar.d(true);
        } else {
            Log.a();
            ArrayList arrayList = NetworkConnectionUtil.f13171a;
            ServiceProvider.a().b.a(new NetworkRequest(str, androidx.constraintlayout.core.state.a.r(RequestBuilder.CONTENT_TYPE, "application/x-www-form-urlencoded"), 2, 2), new NetworkCallback() { // from class: com.adobe.marketing.mobile.identity.b
                @Override // com.adobe.marketing.mobile.services.NetworkCallback
                public final void b(HttpConnecting httpConnecting) {
                    Event event = identityHit.b;
                    IdentityExtension identityExtension = this.d.f13169a;
                    au.com.woolworths.product.details.epoxy.a aVar2 = aVar;
                    if (httpConnecting == null) {
                        Log.a();
                        aVar2.d(false);
                        return;
                    }
                    if (httpConnecting.b() == 200) {
                        try {
                            IdentityResponseObject identityResponseObjectB = IdentityHitsProcessing.b(new JSONObject(StreamUtils.a(httpConnecting.c())));
                            Log.c();
                            identityExtension.p(identityResponseObjectB, event);
                            aVar2.d(true);
                        } catch (JSONException unused2) {
                            Log.a();
                            aVar2.d(false);
                        }
                    } else if (NetworkConnectionUtil.f13171a.contains(Integer.valueOf(httpConnecting.b()))) {
                        httpConnecting.b();
                        Log.a();
                        aVar2.d(false);
                    } else {
                        httpConnecting.b();
                        Log.a();
                        identityExtension.p(null, event);
                        aVar2.d(true);
                    }
                    httpConnecting.close();
                }
            });
        }
    }
}
