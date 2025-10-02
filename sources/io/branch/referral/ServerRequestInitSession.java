package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import io.branch.coroutines.DeviceSignalsKt;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.ServerRequest;
import io.branch.referral.UniversalResourceAnalyser;
import io.branch.referral.validators.DeepLinkRoutingValidator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class ServerRequestInitSession extends ServerRequest {
    public Branch.BranchReferralInitListener i;
    public final boolean j;

    /* renamed from: io.branch.referral.ServerRequestInitSession$1, reason: invalid class name */
    class AnonymousClass1 implements Continuation<String> {
        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public final CoroutineContext getE() {
            return EmptyCoroutineContext.d;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            if (obj != null) {
                BranchLogger.e("onInitSessionCompleted resumeWith userAgent " + obj + " on thread " + Thread.currentThread().getName());
                Branch.o = (String) obj;
            }
            Branch.i().e.m(ServerRequest.PROCESS_WAIT_LOCK.h);
            Branch.i().e.k("getUserAgentAsync resumeWith");
        }
    }

    public ServerRequestInitSession(Context context, Defines.RequestPath requestPath, boolean z) {
        super(context, requestPath);
        this.j = !z;
    }

    public static void o(Branch branch) {
        DeepLinkRoutingValidator.c(branch.i);
        Context context = branch.d;
        if (UniversalResourceAnalyser.d == null) {
            UniversalResourceAnalyser.d = new UniversalResourceAnalyser(context);
        }
        UniversalResourceAnalyser.d.getClass();
        try {
            new UniversalResourceAnalyser.UrlSkipListUpdateTask(context).a(new Void[0]);
        } catch (Exception e) {
            BranchLogger.a(e.getMessage());
        }
        if (TextUtils.isEmpty(Branch.o)) {
            DeviceSignalsKt.a(context, new AnonymousClass1());
        }
        BranchLogger.e("onInitSessionCompleted on thread " + Thread.currentThread().getName());
    }

    @Override // io.branch.referral.ServerRequest
    public void f() throws JSONException {
        PrefHelper prefHelper = this.c;
        super.f();
        JSONObject jSONObject = this.f23862a;
        try {
            if (!prefHelper.j("bnc_app_link").equals("bnc_no_value")) {
                jSONObject.put("android_app_link_url", prefHelper.j("bnc_app_link"));
            }
            if (!prefHelper.j("bnc_push_identifier").equals("bnc_no_value")) {
                jSONObject.put("push_identifier", prefHelper.j("bnc_push_identifier"));
            }
            if (!prefHelper.j("bnc_external_intent_uri").equals("bnc_no_value")) {
                jSONObject.put("external_intent_uri", prefHelper.j("bnc_external_intent_uri"));
            }
            if (!prefHelper.j("bnc_external_intent_extra").equals("bnc_no_value")) {
                jSONObject.put("external_intent_extra", prefHelper.j("bnc_external_intent_extra"));
            }
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
        }
        Branch.q = false;
    }

    @Override // io.branch.referral.ServerRequest
    public void h(ServerResponse serverResponse, Branch branch) {
        int i;
        Branch branchI = Branch.i();
        ServerRequestQueue serverRequestQueue = branchI.e;
        if (serverRequestQueue == null) {
            return;
        }
        PrefHelper prefHelper = Branch.i().b;
        synchronized (ServerRequestQueue.g) {
            i = 0;
            for (int i2 = 0; i2 < serverRequestQueue.b.size(); i2++) {
                try {
                    if (serverRequestQueue.b.get(i2) instanceof ServerRequestInitSession) {
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        boolean z = i <= 1;
        BranchLogger.e("postInitClear " + prefHelper + " can clear init data " + z);
        if (prefHelper != null && z) {
            prefHelper.p("bnc_link_click_identifier", "bnc_no_value");
            prefHelper.p("bnc_google_search_install_identifier", "bnc_no_value");
            prefHelper.p("bnc_google_play_install_referrer_extras", "bnc_no_value");
            prefHelper.p("bnc_external_intent_uri", "bnc_no_value");
            prefHelper.p("bnc_external_intent_extra", "bnc_no_value");
            prefHelper.p("bnc_app_link", "bnc_no_value");
            prefHelper.p("bnc_push_identifier", "bnc_no_value");
            prefHelper.p("bnc_install_referrer", "bnc_no_value");
            prefHelper.b.putBoolean("bnc_is_full_app_conversion", false).apply();
            prefHelper.p("bnc_initial_referrer", "bnc_no_value");
            if (prefHelper.e("bnc_previous_update_time") == 0) {
                prefHelper.n(prefHelper.e("bnc_last_known_update_time"), "bnc_previous_update_time");
            }
        }
        branchI.e.m(ServerRequest.PROCESS_WAIT_LOCK.d);
        branchI.e.k("unlockSDKInitWaitLock");
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean i() throws JSONException {
        JSONObject jSONObject = this.f23862a;
        if (!jSONObject.has("android_app_link_url") && !jSONObject.has("push_identifier") && !jSONObject.has("link_identifier")) {
            return false;
        }
        jSONObject.remove("randomized_device_token");
        jSONObject.remove("randomized_bundle_token");
        jSONObject.remove("external_intent_extra");
        jSONObject.remove("external_intent_uri");
        jSONObject.remove("latest_install_time");
        jSONObject.remove("latest_update_time");
        jSONObject.remove("first_install_time");
        jSONObject.remove("previous_update_time");
        jSONObject.remove("install_begin_ts");
        jSONObject.remove("clicked_referrer_ts");
        jSONObject.remove("hardware_id");
        jSONObject.remove("is_hardware_id_real");
        jSONObject.remove("local_ip");
        jSONObject.remove("referrer_gclid");
        jSONObject.remove("identity");
        jSONObject.remove("anon_id");
        try {
            jSONObject.put("tracking_disabled", true);
            return true;
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    @Override // io.branch.referral.ServerRequest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.ServerRequestInitSession.j(org.json.JSONObject):void");
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean k() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public final boolean l() {
        return true;
    }

    @Override // io.branch.referral.ServerRequest
    public final JSONObject m() throws JSONException {
        JSONObject jSONObjectM = super.m();
        try {
            jSONObjectM.put("INITIATED_BY_CLIENT", this.j);
            return jSONObjectM;
        } catch (JSONException e) {
            c.z(e, new StringBuilder("Caught JSONException "));
            return jSONObjectM;
        }
    }

    public ServerRequestInitSession(Defines.RequestPath requestPath, JSONObject jSONObject, Context context, boolean z) {
        super(requestPath, jSONObject, context);
        this.j = !z;
    }
}
