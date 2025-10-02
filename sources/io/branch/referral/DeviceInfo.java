package io.branch.referral;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import io.branch.coroutines.DeviceSignalsKt;
import io.branch.referral.ServerRequest;
import io.branch.referral.SystemObserver;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class DeviceInfo {

    /* renamed from: a, reason: collision with root package name */
    public final SystemObserverInstance f23858a;
    public final Context b;

    /* renamed from: io.branch.referral.DeviceInfo$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass1 implements Continuation<String> {
        @Override // kotlin.coroutines.Continuation
        /* renamed from: getContext */
        public final CoroutineContext getE() {
            return EmptyCoroutineContext.d;
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(Object obj) {
            if (obj != null) {
                Branch.o = (String) obj;
                throw null;
            }
            Branch.i().e.m(ServerRequest.PROCESS_WAIT_LOCK.h);
            Branch.i().e.k("onUserAgentStringFetchFinished");
        }
    }

    public class SystemObserverInstance extends SystemObserver {
    }

    public DeviceInfo(Context context) {
        this.b = context;
        SystemObserverInstance systemObserverInstance = new SystemObserverInstance();
        systemObserverInstance.f23866a = null;
        systemObserverInstance.b = 0;
        this.f23858a = systemObserverInstance;
    }

    public static DeviceInfo c() {
        Branch branchI = Branch.i();
        if (branchI == null) {
            return null;
        }
        return branchI.c;
    }

    public static boolean d(String str) {
        return TextUtils.isEmpty(str) || str.equals("bnc_no_value");
    }

    public final String a() {
        String str;
        Context context = this.b;
        if (context != null) {
            try {
                str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e) {
                BranchLogger.b("Caught Exception, error obtaining AppVersion " + e.getMessage());
            }
        } else {
            str = "";
        }
        return TextUtils.isEmpty(str) ? "bnc_no_value" : str;
    }

    public final SystemObserver.UniqueId b() {
        String strJ;
        boolean z = Branch.p;
        SystemObserver.UniqueId uniqueId = new SystemObserver.UniqueId();
        uniqueId.b = !z;
        uniqueId.f23867a = "bnc_no_value";
        boolean zIsEmpty = TextUtils.isEmpty(c().f23858a.f23866a);
        Context context = this.b;
        String string = (context == null || z || !zIsEmpty) ? null : Settings.Secure.getString(context.getContentResolver(), nnlllnn.nnlllln.w007700770077www);
        if (string == null) {
            if (z) {
                strJ = UUID.randomUUID().toString();
            } else {
                strJ = PrefHelper.d(context).j("bnc_randomly_generated_uuid");
                if (TextUtils.isEmpty(strJ) || strJ.equals("bnc_no_value")) {
                    strJ = UUID.randomUUID().toString();
                    PrefHelper.d(context).p("bnc_randomly_generated_uuid", strJ);
                }
            }
            string = strJ;
            uniqueId.b = false;
        }
        uniqueId.f23867a = string;
        return uniqueId;
    }

    public final void e(final JSONObject jSONObject) {
        BranchLogger.e("setPostUserAgent " + Thread.currentThread().getName());
        try {
            if (TextUtils.isEmpty(Branch.o)) {
                DeviceSignalsKt.a(this.b, new Continuation<String>() { // from class: io.branch.referral.DeviceInfo.2
                    @Override // kotlin.coroutines.Continuation
                    /* renamed from: getContext */
                    public final CoroutineContext getE() {
                        return EmptyCoroutineContext.d;
                    }

                    @Override // kotlin.coroutines.Continuation
                    public final void resumeWith(Object obj) throws JSONException {
                        if (obj != null) {
                            Branch.o = (String) obj;
                            try {
                                jSONObject.put("user_agent", Branch.o);
                            } catch (JSONException e) {
                                c.z(e, new StringBuilder("Caught JSONException "));
                            }
                        }
                        Branch.i().e.m(ServerRequest.PROCESS_WAIT_LOCK.h);
                        Branch.i().e.k("getUserAgentAsync resumeWith");
                    }
                });
                return;
            }
            BranchLogger.e("userAgent was cached: " + Branch.o);
            jSONObject.put("user_agent", Branch.o);
            Branch.i().e.m(ServerRequest.PROCESS_WAIT_LOCK.h);
            Branch.i().e.k("setPostUserAgent");
        } catch (Exception e) {
            BranchLogger.f("Caught exception trying to set userAgent " + e.getMessage());
        }
    }
}
