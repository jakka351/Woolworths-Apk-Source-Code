package io.branch.referral.util;

import android.content.Context;
import android.text.TextUtils;
import au.com.woolworths.checkout.models.CouponResponse;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import io.branch.indexing.BranchUniversalObject;
import io.branch.referral.Branch;
import io.branch.referral.BranchLogger;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import io.branch.referral.ServerRequestLogEvent;
import io.branch.referral.ServerResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class BranchEvent {

    /* renamed from: a, reason: collision with root package name */
    public final String f23873a;
    public final boolean b;
    public final HashMap c;
    public final JSONObject d;
    public final JSONObject e;
    public final ArrayList f;

    /* renamed from: io.branch.referral.util.BranchEvent$1, reason: invalid class name */
    class AnonymousClass1 extends ServerRequestLogEvent {
        @Override // io.branch.referral.ServerRequestLogEvent, io.branch.referral.ServerRequest
        public final void d(int i, String str) {
        }

        @Override // io.branch.referral.ServerRequestLogEvent, io.branch.referral.ServerRequest
        public final void h(ServerResponse serverResponse, Branch branch) {
        }
    }

    public interface BranchLogEventCallback {
    }

    public BranchEvent(BRANCH_STANDARD_EVENT branch_standard_event) {
        this(branch_standard_event.d);
    }

    public final void a(BranchUniversalObject... branchUniversalObjectArr) {
        Collections.addAll(this.f, branchUniversalObjectArr);
    }

    public final void b(String str, String str2) throws JSONException {
        try {
            this.e.put(str, str2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(Object obj, String str) {
        JSONObject jSONObject = this.d;
        if (obj == null) {
            jSONObject.remove(str);
            return;
        }
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void d(Context context) {
        Defines.RequestPath requestPath = this.b ? Defines.RequestPath.TrackStandardEvent : Defines.RequestPath.TrackCustomEvent;
        if (Branch.i() != null) {
            String str = this.f23873a;
            HashMap map = this.c;
            JSONObject jSONObject = this.d;
            JSONObject jSONObject2 = this.e;
            ArrayList arrayList = this.f;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, requestPath);
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                if (jSONObject2.length() > 0) {
                    jSONObject3.put("custom_data", jSONObject2);
                }
                if (jSONObject.length() > 0) {
                    jSONObject3.put("event_data", jSONObject);
                }
                if (map.size() > 0) {
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject3.put((String) entry.getKey(), entry.getValue());
                    }
                }
                if (arrayList.size() > 0) {
                    JSONArray jSONArray = new JSONArray();
                    jSONObject3.put("content_items", jSONArray);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(((BranchUniversalObject) it.next()).a());
                    }
                }
                anonymousClass1.j(jSONObject3);
            } catch (JSONException e) {
                c.z(e, new StringBuilder("Caught JSONException "));
            }
            anonymousClass1.n(jSONObject3);
            BranchLogger.e("Preparing V2 event, user agent is " + Branch.o);
            if (TextUtils.isEmpty(Branch.o)) {
                anonymousClass1.e.add(ServerRequest.PROCESS_WAIT_LOCK.h);
            }
            Branch.i().e.f(anonymousClass1);
        }
    }

    public final void e(String str) {
        c(str, "affiliation");
    }

    public final void f(String str) {
        c(str, CouponResponse.Discount.COUPON);
    }

    public final void g(CurrencyType currencyType) {
        c(currencyType.d, "currency");
    }

    public final void h(String str) {
        c(str, lqlqqlq.mmm006Dm006Dm);
    }

    public final void i(double d) {
        c(Double.valueOf(d), "revenue");
    }

    public final void j(String str) {
        c(str, "search_query");
    }

    public final void k(double d) {
        c(Double.valueOf(d), "tax");
    }

    public BranchEvent(String str) {
        this.c = new HashMap();
        this.d = new JSONObject();
        this.e = new JSONObject();
        this.f23873a = str;
        BRANCH_STANDARD_EVENT[] branch_standard_eventArrValues = BRANCH_STANDARD_EVENT.values();
        int length = branch_standard_eventArrValues.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (str.equals(branch_standard_eventArrValues[i].d)) {
                z = true;
                break;
            }
            i++;
        }
        this.b = z;
        this.f = new ArrayList();
    }
}
