package io.branch.referral;

import YU.a;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.huawei.hms.ads.identifier.AdvertisingIdClient;
import com.medallia.digital.mobilesdk.q2;
import io.branch.coroutines.AdvertisingIdsKt;
import io.branch.coroutines.InstallReferrersKt;
import io.branch.data.InstallReferrerResult;
import io.branch.referral.Branch;
import io.branch.referral.Defines;
import io.branch.referral.DeviceInfo;
import io.branch.referral.ServerRequest;
import io.branch.referral.SystemObserver;
import io.branch.referral.network.BranchRemoteInterfaceUrlConnection;
import io.branch.referral.util.DependencyUtilsKt;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Branch {
    public static final String n = "!SDK-VERSION-STRING!:io.branch.sdk.android:library:5.12.3";
    public static String o = "";
    public static boolean p = false;
    public static boolean q = false;
    public static Branch r = null;
    public static boolean s = false;
    public static final String[] t = {"extra_launch_uri", "branch_intent"};
    public static String u = null;

    /* renamed from: a, reason: collision with root package name */
    public final BranchRemoteInterfaceUrlConnection f23845a;
    public final PrefHelper b;
    public final DeviceInfo c;
    public final Context d;
    public final ServerRequestQueue e;
    public WeakReference i;
    public BranchActivityLifecycleObserver k;
    public final TrackingController l;
    public InitSessionBuilder m;
    public final ConcurrentHashMap f = new ConcurrentHashMap();
    public INTENT_STATE g = INTENT_STATE.d;
    public SESSION_STATE h = SESSION_STATE.f;
    public boolean j = false;

    /* renamed from: io.branch.referral.Branch$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* renamed from: io.branch.referral.Branch$2, reason: invalid class name */
    class AnonymousClass2 implements SystemObserver.InstallReferrerFetchEvents {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ServerRequest f23846a;

        public AnonymousClass2(ServerRequest serverRequest) {
            this.f23846a = serverRequest;
        }

        public final void a() {
            this.f23846a.e.remove(ServerRequest.PROCESS_WAIT_LOCK.g);
            Branch.this.e.k("onInstallReferrersFinished");
        }
    }

    /* renamed from: io.branch.referral.Branch$3, reason: invalid class name */
    class AnonymousClass3 implements SystemObserver.AdsParamsFetchEvents {
        public AnonymousClass3() {
        }

        public final void a() {
            Branch branch = Branch.this;
            branch.e.m(ServerRequest.PROCESS_WAIT_LOCK.e);
            branch.e.k("onAdsParamsFetchFinished");
        }
    }

    public interface BranchLinkCreateListener {
        void e(String str, BranchError branchError);
    }

    /* loaded from: classes7.dex */
    public interface BranchLinkShareListener {
    }

    /* loaded from: classes7.dex */
    public interface BranchListResponseListener {
    }

    /* loaded from: classes7.dex */
    public interface BranchNativeLinkShareListener {
    }

    public interface BranchReferralInitListener {
        void b(JSONObject jSONObject, BranchError branchError);
    }

    /* loaded from: classes7.dex */
    public interface BranchReferralStateChangedListener {
    }

    /* loaded from: classes7.dex */
    public interface BranchUniversalReferralInitListener {
    }

    /* loaded from: classes7.dex */
    public interface ExtendedBranchLinkShareListener extends BranchLinkShareListener {
    }

    /* loaded from: classes7.dex */
    public class GetShortLinkTask extends AsyncTask<ServerRequest, Void, ServerResponse> {
        public GetShortLinkTask() {
        }

        @Override // android.os.AsyncTask
        public final ServerResponse doInBackground(ServerRequest[] serverRequestArr) {
            Branch branch = Branch.this;
            BranchRemoteInterfaceUrlConnection branchRemoteInterfaceUrlConnection = branch.f23845a;
            JSONObject jSONObject = serverRequestArr[0].f23862a;
            StringBuilder sb = new StringBuilder();
            PrefHelper prefHelper = branch.b;
            prefHelper.getClass();
            return branchRemoteInterfaceUrlConnection.c(jSONObject, a.o(sb, URLUtil.isHttpsUrl(PrefHelper.g) ? PrefHelper.g : "https://api2.branch.io/", "v1/url"), "v1/url", prefHelper.j("bnc_branch_key"));
        }
    }

    /* loaded from: classes7.dex */
    public interface IChannelProperties {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class INTENT_STATE {
        public static final INTENT_STATE d;
        public static final INTENT_STATE e;
        public static final /* synthetic */ INTENT_STATE[] f;

        static {
            INTENT_STATE intent_state = new INTENT_STATE("PENDING", 0);
            d = intent_state;
            INTENT_STATE intent_state2 = new INTENT_STATE("READY", 1);
            e = intent_state2;
            f = new INTENT_STATE[]{intent_state, intent_state2};
        }

        public static INTENT_STATE valueOf(String str) {
            return (INTENT_STATE) Enum.valueOf(INTENT_STATE.class, str);
        }

        public static INTENT_STATE[] values() {
            return (INTENT_STATE[]) f.clone();
        }
    }

    public static class InitSessionBuilder {

        /* renamed from: a, reason: collision with root package name */
        public BranchReferralInitListener f23849a;
        public boolean b;
        public Uri c;
        public boolean d;

        public final void a() throws JSONException {
            ServerRequestInitSession serverRequestRegisterInstall;
            BranchLogger.e("Session uri is " + this.c);
            BranchLogger.e("Callback is " + this.f23849a);
            BranchLogger.e("Is auto init " + this.b);
            BranchLogger.e("Is reinitializing " + this.d);
            if (Branch.s) {
                Branch.i().m = this;
                StringBuilder sb = new StringBuilder("Session initialization deferred until plugin invokes notifyNativeToInit()\nCaching Session Builder ");
                sb.append(Branch.i().m);
                sb.append("\nuri: ");
                sb.append(Branch.i().m.c);
                sb.append("\ncallback: ");
                sb.append(Branch.i().m.f23849a);
                sb.append("\nisReInitializing: ");
                sb.append(Branch.i().m.d);
                sb.append("\ndelay: 0\nisAutoInitialization: ");
                Branch.i().m.getClass();
                sb.append(Branch.i().m.b);
                sb.append("\nignoreIntent: null");
                Branch.i().m.getClass();
                BranchLogger.e(sb.toString());
                return;
            }
            Branch branchI = Branch.i();
            if (branchI == null) {
                BranchLogger.c("Branch is not setup properly, make sure to call getAutoInstance in your application class or declare BranchApp in your manifest.");
                return;
            }
            Activity activityH = branchI.h();
            ServerRequestInitSession serverRequestInitSession = null;
            Intent intent = activityH != null ? activityH.getIntent() : null;
            if (activityH != null && intent != null && activityH.getReferrer() != null) {
                PrefHelper.d(activityH).p("bnc_initial_referrer", activityH.getReferrer().toString());
            }
            Uri uri = this.c;
            if (uri != null) {
                branchI.n(uri, activityH);
            } else if (this.d && Branch.m(intent)) {
                branchI.n(intent != null ? intent.getData() : null, activityH);
            } else if (this.d) {
                BranchReferralInitListener branchReferralInitListener = this.f23849a;
                if (branchReferralInitListener != null) {
                    branchReferralInitListener.b(null, new BranchError("", -119));
                    return;
                }
                return;
            }
            BranchLogger.e("isInstantDeepLinkPossible " + branchI.j);
            if (branchI.j) {
                branchI.j = false;
                BranchReferralInitListener branchReferralInitListener2 = this.f23849a;
                if (branchReferralInitListener2 != null) {
                    branchReferralInitListener2.b(branchI.j(), null);
                }
                Branch.i().e.a("instant_dl_session", "true");
                branchI.a();
                this.f23849a = null;
            }
            BranchReferralInitListener branchReferralInitListener3 = this.f23849a;
            boolean z = this.b;
            Context context = branchI.d;
            branchI.e.getClass();
            if (Branch.i().b.f().equals("bnc_no_value")) {
                serverRequestRegisterInstall = new ServerRequestRegisterInstall(context, Defines.RequestPath.RegisterInstall, z);
                serverRequestRegisterInstall.i = branchReferralInitListener3;
                try {
                    serverRequestRegisterInstall.j(new JSONObject());
                } catch (JSONException e) {
                    c.z(e, new StringBuilder("Caught JSONException "));
                    serverRequestRegisterInstall.f = true;
                }
            } else {
                serverRequestRegisterInstall = new ServerRequestRegisterOpen(context, Defines.RequestPath.RegisterOpen, z);
                PrefHelper prefHelper = serverRequestRegisterInstall.c;
                serverRequestRegisterInstall.i = branchReferralInitListener3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("randomized_device_token", prefHelper.g());
                    jSONObject.put("randomized_bundle_token", prefHelper.f());
                    serverRequestRegisterInstall.j(jSONObject);
                } catch (JSONException e2) {
                    c.z(e2, new StringBuilder("Caught JSONException "));
                    serverRequestRegisterInstall.f = true;
                }
            }
            BranchLogger.a("Creating " + serverRequestRegisterInstall + " from init on thread " + Thread.currentThread().getName());
            StringBuilder sb2 = new StringBuilder("initializeSession ");
            sb2.append(serverRequestRegisterInstall);
            sb2.append(" delay 0");
            BranchLogger.e(sb2.toString());
            if (branchI.b.j("bnc_branch_key") == null || branchI.b.j("bnc_branch_key").equalsIgnoreCase("bnc_no_value")) {
                branchI.h = SESSION_STATE.f;
                BranchReferralInitListener branchReferralInitListener4 = serverRequestRegisterInstall.i;
                if (branchReferralInitListener4 != null) {
                    branchReferralInitListener4.b(null, new BranchError("Trouble initializing Branch.", -114));
                }
                BranchLogger.f("Warning: Please enter your branch_key in your project's manifest");
                return;
            }
            if (BranchUtil.f23857a) {
                BranchLogger.f("Warning: You are using your test app's Branch Key. Remember to change it to live Branch Key during deployment.");
            }
            Intent intent2 = branchI.h() != null ? branchI.h().getIntent() : null;
            boolean zM = Branch.m(intent2);
            SESSION_STATE session_state = branchI.h;
            BranchLogger.e("Intent: " + intent2 + " forceBranchSession: " + zM + " initState: " + session_state);
            if (session_state != SESSION_STATE.f && !zM) {
                BranchReferralInitListener branchReferralInitListener5 = serverRequestRegisterInstall.i;
                if (branchReferralInitListener5 != null) {
                    branchReferralInitListener5.b(null, new BranchError("Warning.", -118));
                    return;
                }
                return;
            }
            if (zM && intent2 != null) {
                intent2.removeExtra("branch_force_new_session");
            }
            BranchLogger.e("registerAppInit " + serverRequestRegisterInstall);
            branchI.h = SESSION_STATE.e;
            ServerRequestQueue serverRequestQueue = branchI.e;
            serverRequestQueue.getClass();
            synchronized (ServerRequestQueue.g) {
                try {
                    Iterator it = serverRequestQueue.b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ServerRequest serverRequest = (ServerRequest) it.next();
                        if (serverRequest instanceof ServerRequestInitSession) {
                            ServerRequestInitSession serverRequestInitSession2 = (ServerRequestInitSession) serverRequest;
                            if (serverRequestInitSession2.j) {
                                serverRequestInitSession = serverRequestInitSession2;
                                break;
                            }
                        }
                    }
                } finally {
                }
            }
            branchI.e.getClass();
            if (serverRequestInitSession == null || zM) {
                BranchLogger.e("Moving " + serverRequestRegisterInstall + "  to front of the queue or behind network-in-progress request");
                ServerRequestQueue serverRequestQueue2 = branchI.e;
                if (serverRequestQueue2.d == 0) {
                    serverRequestQueue2.g(serverRequestRegisterInstall, 0);
                } else {
                    serverRequestQueue2.g(serverRequestRegisterInstall, 1);
                }
            } else {
                BranchLogger.e("Retrieved " + serverRequestInitSession + " with callback " + serverRequestInitSession.i + " in queue currently");
                serverRequestInitSession.i = serverRequestRegisterInstall.i;
                BranchLogger.e(serverRequestInitSession + " now has callback " + serverRequestRegisterInstall.i);
            }
            branchI.e.getClass();
            final Context context2 = branchI.d;
            DeviceInfo deviceInfo = branchI.c;
            BranchLogger.e("initTasks " + serverRequestRegisterInstall + " ignoreWaitLocks false");
            if (branchI.g != INTENT_STATE.e) {
                serverRequestRegisterInstall.e.add(ServerRequest.PROCESS_WAIT_LOCK.f);
            }
            serverRequestRegisterInstall.e.add(ServerRequest.PROCESS_WAIT_LOCK.e);
            if (serverRequestRegisterInstall instanceof ServerRequestRegisterInstall) {
                serverRequestRegisterInstall.e.add(ServerRequest.PROCESS_WAIT_LOCK.g);
                DeviceInfo.SystemObserverInstance systemObserverInstance = deviceInfo.f23858a;
                final AnonymousClass2 anonymousClass2 = branchI.new AnonymousClass2(serverRequestRegisterInstall);
                try {
                    InstallReferrersKt.a(context2, new Continuation<InstallReferrerResult>() { // from class: io.branch.referral.SystemObserver.4
                        public final /* synthetic */ Context d;
                        public final /* synthetic */ Branch.AnonymousClass2 e;

                        public AnonymousClass4(final Context context22, final Branch.AnonymousClass2 anonymousClass22) {
                            context = context22;
                            anonymousClass2 = anonymousClass22;
                        }

                        @Override // kotlin.coroutines.Continuation
                        /* renamed from: getContext */
                        public final CoroutineContext getE() {
                            return EmptyCoroutineContext.d;
                        }

                        @Override // kotlin.coroutines.Continuation
                        public final void resumeWith(Object obj) throws UnsupportedEncodingException {
                            Context context3;
                            if (obj != null) {
                                BranchLogger.e("fetchInstallReferrer resumeWith got result: " + obj);
                                InstallReferrerResult installReferrerResult = (InstallReferrerResult) obj;
                                String str = installReferrerResult.c;
                                long j = installReferrerResult.d;
                                long j2 = installReferrerResult.b;
                                String str2 = installReferrerResult.f23842a;
                                boolean z2 = installReferrerResult.e;
                                Context context4 = context;
                                PrefHelper prefHelperD = PrefHelper.d(context4);
                                if (TextUtils.isEmpty(str2)) {
                                    context3 = context4;
                                } else {
                                    prefHelperD.getClass();
                                    if (TextUtils.isEmpty(str2)) {
                                        context3 = context4;
                                    } else {
                                        context3 = context4;
                                        prefHelperD.p("bnc_app_store_source", str2);
                                    }
                                    if (str2.equals("Meta")) {
                                        prefHelperD.b.putBoolean("bnc_is_meta_clickthrough", z2).apply();
                                    }
                                }
                                if (j > 0) {
                                    prefHelperD.n(j, "bnc_referrer_click_ts");
                                }
                                if (j2 > 0) {
                                    prefHelperD.n(j2, "bnc_install_begin_ts");
                                }
                                if (str != null) {
                                    try {
                                        String strDecode = URLDecoder.decode(str, "UTF-8");
                                        HashMap map = new HashMap();
                                        String[] strArrSplit = strDecode.split("&");
                                        prefHelperD.p("bnc_google_play_install_referrer_extras", strDecode);
                                        for (String str3 : strArrSplit) {
                                            if (!TextUtils.isEmpty(str3)) {
                                                String[] strArrSplit2 = str3.split((str3.contains("=") || !str3.contains("-")) ? "=" : "-");
                                                if (strArrSplit2.length > 1) {
                                                    map.put(URLDecoder.decode(strArrSplit2[0], "UTF-8"), URLDecoder.decode(strArrSplit2[1], "UTF-8"));
                                                }
                                            }
                                        }
                                        if (map.containsKey("link_click_id")) {
                                            String str4 = (String) map.get("link_click_id");
                                            AppStoreReferrer.f23843a = str4;
                                            prefHelperD.p("bnc_link_click_identifier", str4);
                                        }
                                        if (map.containsKey("is_full_app_conversion") && map.containsKey("referring_link")) {
                                            prefHelperD.b.putBoolean("bnc_is_full_app_conversion", Boolean.parseBoolean((String) map.get("is_full_app_conversion"))).apply();
                                            prefHelperD.p("bnc_app_link", (String) map.get("referring_link"));
                                        }
                                        if (map.containsKey("google_search_install_referrer")) {
                                            prefHelperD.p("bnc_google_search_install_identifier", (String) map.get("google_search_install_referrer"));
                                        }
                                        if (map.containsValue("play-auto-installs")) {
                                            BranchPreinstall.c(context3, map);
                                        }
                                    } catch (UnsupportedEncodingException e3) {
                                        BranchLogger.f("Caught UnsupportedEncodingException " + e3.getMessage());
                                    } catch (IllegalArgumentException e4) {
                                        BranchLogger.f("Caught IllegalArgumentException " + e4.getMessage());
                                    }
                                }
                            }
                            anonymousClass2.a();
                        }
                    });
                } catch (Exception e3) {
                    BranchLogger.b("Caught Exception SystemObserver fetchInstallReferrer " + e3.getMessage());
                    anonymousClass22.a();
                }
            }
            final DeviceInfo.SystemObserverInstance systemObserverInstance2 = deviceInfo.f23858a;
            final AnonymousClass3 anonymousClass3 = branchI.new AnonymousClass3();
            if (Build.MANUFACTURER.equalsIgnoreCase("amazon")) {
                AdvertisingIdsKt.a(context22, new Continuation<Pair<? extends Integer, ? extends String>>() { // from class: io.branch.referral.SystemObserver.3
                    public final /* synthetic */ Branch.AnonymousClass3 d;

                    public AnonymousClass3(final Branch.AnonymousClass3 anonymousClass32) {
                        anonymousClass3 = anonymousClass32;
                    }

                    @Override // kotlin.coroutines.Continuation
                    /* renamed from: getContext */
                    public final CoroutineContext getE() {
                        return EmptyCoroutineContext.d;
                    }

                    @Override // kotlin.coroutines.Continuation
                    public final void resumeWith(Object obj) {
                        DeviceInfo.SystemObserverInstance systemObserverInstance3 = systemObserverInstance;
                        Branch.AnonymousClass3 anonymousClass32 = anonymousClass3;
                        try {
                            if (obj != null) {
                                try {
                                    Pair pair = (Pair) obj;
                                    Object obj2 = pair.e;
                                    Object obj3 = pair.d;
                                    systemObserverInstance3.b = ((Integer) obj3).intValue();
                                    if (((Integer) obj3).intValue() == 0) {
                                        systemObserverInstance3.f23866a = (String) obj2;
                                    } else {
                                        systemObserverInstance3.f23866a = (String) obj2;
                                    }
                                } catch (Exception e4) {
                                    BranchLogger.b("Error in continuation: " + e4);
                                    anonymousClass32.a();
                                    return;
                                }
                            }
                            anonymousClass32.a();
                        } catch (Throwable th) {
                            anonymousClass32.a();
                            throw th;
                        }
                    }
                });
            } else if (SystemObserver.i(context22)) {
                if (DependencyUtilsKt.a("com.huawei.hms.ads.identifier.AdvertisingIdClient")) {
                    AdvertisingIdsKt.c(context22, new Continuation<AdvertisingIdClient.Info>() { // from class: io.branch.referral.SystemObserver.1
                        public final /* synthetic */ Branch.AnonymousClass3 d;

                        public AnonymousClass1(final Branch.AnonymousClass3 anonymousClass32) {
                            anonymousClass3 = anonymousClass32;
                        }

                        @Override // kotlin.coroutines.Continuation
                        /* renamed from: getContext */
                        public final CoroutineContext getE() {
                            return EmptyCoroutineContext.d;
                        }

                        @Override // kotlin.coroutines.Continuation
                        public final void resumeWith(Object obj) {
                            Branch.AnonymousClass3 anonymousClass32 = anonymousClass3;
                            try {
                                if (obj != null) {
                                    try {
                                        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                                        boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                                        String id = !zIsLimitAdTrackingEnabled ? info.getId() : null;
                                        DeviceInfo.SystemObserverInstance systemObserverInstance3 = systemObserverInstance;
                                        systemObserverInstance3.b = zIsLimitAdTrackingEnabled ? 1 : 0;
                                        systemObserverInstance3.f23866a = id;
                                    } catch (Exception e4) {
                                        BranchLogger.b("Error in continuation: " + e4);
                                        anonymousClass32.a();
                                        return;
                                    }
                                }
                                anonymousClass32.a();
                            } catch (Throwable th) {
                                anonymousClass32.a();
                                throw th;
                            }
                        }
                    });
                } else {
                    anonymousClass32.a();
                }
            } else if (DependencyUtilsKt.a("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
                AdvertisingIdsKt.b(context22, new Continuation<AdvertisingIdClient.Info>() { // from class: io.branch.referral.SystemObserver.2
                    public final /* synthetic */ Branch.AnonymousClass3 d;

                    public AnonymousClass2(final Branch.AnonymousClass3 anonymousClass32) {
                        anonymousClass3 = anonymousClass32;
                    }

                    @Override // kotlin.coroutines.Continuation
                    /* renamed from: getContext */
                    public final CoroutineContext getE() {
                        return EmptyCoroutineContext.d;
                    }

                    @Override // kotlin.coroutines.Continuation
                    public final void resumeWith(Object obj) {
                        Branch.AnonymousClass3 anonymousClass32 = anonymousClass3;
                        try {
                            if (obj != null) {
                                try {
                                    AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                                    boolean zIsLimitAdTrackingEnabled = info.isLimitAdTrackingEnabled();
                                    String id = !zIsLimitAdTrackingEnabled ? info.getId() : null;
                                    DeviceInfo.SystemObserverInstance systemObserverInstance3 = systemObserverInstance;
                                    systemObserverInstance3.b = zIsLimitAdTrackingEnabled ? 1 : 0;
                                    systemObserverInstance3.f23866a = id;
                                } catch (Exception e4) {
                                    BranchLogger.b("Error in continuation: " + e4);
                                    anonymousClass32.a();
                                    return;
                                }
                            }
                            anonymousClass32.a();
                        } catch (Throwable th) {
                            anonymousClass32.a();
                            throw th;
                        }
                    }
                });
            } else {
                anonymousClass32.a();
            }
            branchI.e.k("registerAppInit");
        }

        public final void b(BranchReferralInitListener branchReferralInitListener) {
            BranchLogger.e("InitSessionBuilder setting BranchReferralInitListener withCallback with " + branchReferralInitListener);
            this.f23849a = branchReferralInitListener;
        }
    }

    /* loaded from: classes7.dex */
    public interface LogoutStatusListener {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class SESSION_STATE {
        public static final SESSION_STATE d;
        public static final SESSION_STATE e;
        public static final SESSION_STATE f;
        public static final /* synthetic */ SESSION_STATE[] g;

        static {
            SESSION_STATE session_state = new SESSION_STATE("INITIALISED", 0);
            d = session_state;
            SESSION_STATE session_state2 = new SESSION_STATE("INITIALISING", 1);
            e = session_state2;
            SESSION_STATE session_state3 = new SESSION_STATE("UNINITIALISED", 2);
            f = session_state3;
            g = new SESSION_STATE[]{session_state, session_state2, session_state3};
        }

        public static SESSION_STATE valueOf(String str) {
            return (SESSION_STATE) Enum.valueOf(SESSION_STATE.class, str);
        }

        public static SESSION_STATE[] values() {
            return (SESSION_STATE[]) g.clone();
        }
    }

    /* loaded from: classes7.dex */
    public interface TrackingStateCallback {
    }

    public Branch(Context context) {
        this.d = context;
        this.b = PrefHelper.d(context);
        TrackingController trackingController = new TrackingController();
        trackingController.f23868a = true;
        trackingController.f23868a = PrefHelper.d(context).b("bnc_tracking_state");
        this.l = trackingController;
        this.f23845a = new BranchRemoteInterfaceUrlConnection(this);
        this.c = new DeviceInfo(context);
        new ConcurrentHashMap();
        if (ServerRequestQueue.f == null) {
            synchronized (ServerRequestQueue.class) {
                try {
                    if (ServerRequestQueue.f == null) {
                        ServerRequestQueue.f = new ServerRequestQueue(context);
                    }
                } finally {
                }
            }
        }
        this.e = ServerRequestQueue.f;
    }

    public static boolean b(JSONObject jSONObject, ActivityInfo activityInfo) {
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_keys") != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_keys").split(",")) {
                if (jSONObject.has(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean c(JSONObject jSONObject, ActivityInfo activityInfo) throws JSONException {
        int i;
        String string = null;
        try {
            if (jSONObject.has("$android_deeplink_path")) {
                string = jSONObject.getString("$android_deeplink_path");
            } else if (jSONObject.has("$deeplink_path")) {
                string = jSONObject.getString("$deeplink_path");
            }
        } catch (JSONException e) {
            BranchLogger.a(e.getMessage());
        }
        if (activityInfo.metaData.getString("io.branch.sdk.auto_link_path") != null && string != null) {
            for (String str : activityInfo.metaData.getString("io.branch.sdk.auto_link_path").split(",")) {
                String[] strArrSplit = str.trim().split("\\?")[0].split(q2.c);
                String[] strArrSplit2 = string.split("\\?")[0].split(q2.c);
                if (strArrSplit.length == strArrSplit2.length) {
                    for (0; i < strArrSplit.length && i < strArrSplit2.length; i + 1) {
                        String str2 = strArrSplit[i];
                        i = (str2.equals(strArrSplit2[i]) || str2.contains("*")) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized Branch f(Context context) {
        try {
            if (r == null) {
                if (BranchUtil.e(context)) {
                    BranchLogger.f23853a = true;
                    BranchLogger.c(n);
                }
                boolean zD = BranchUtil.d(context);
                BranchLogger.e("deferInitForPluginRuntime " + zD);
                s = zD;
                if (zD) {
                    q = zD;
                }
                BranchUtil.g(context);
                BranchUtil.h(context);
                BranchUtil.f23857a = BranchUtil.a(context);
                Branch branchK = k(context, BranchUtil.f(context));
                r = branchK;
                BranchPreinstall.b(branchK, context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return r;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static io.branch.referral.Branch g(android.content.Context r3, java.lang.String r4) {
        /*
            io.branch.referral.Branch r0 = io.branch.referral.Branch.r
            if (r0 != 0) goto L5b
            boolean r0 = io.branch.referral.BranchUtil.e(r3)
            if (r0 == 0) goto L12
            r0 = 1
            io.branch.referral.BranchLogger.f23853a = r0
            java.lang.String r0 = io.branch.referral.Branch.n
            io.branch.referral.BranchLogger.c(r0)
        L12:
            boolean r0 = io.branch.referral.BranchUtil.d(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "deferInitForPluginRuntime "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            io.branch.referral.BranchLogger.e(r1)
            io.branch.referral.Branch.s = r0
            if (r0 == 0) goto L2d
            io.branch.referral.Branch.q = r0
        L2d:
            io.branch.referral.BranchUtil.g(r3)
            io.branch.referral.BranchUtil.h(r3)
            boolean r0 = io.branch.referral.BranchUtil.a(r3)
            io.branch.referral.BranchUtil.f23857a = r0
            if (r4 == 0) goto L49
            if (r0 == 0) goto L40
            java.lang.String r0 = "key_test_"
            goto L42
        L40:
            java.lang.String r0 = "key_"
        L42:
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L49
            goto L52
        L49:
            java.lang.String r4 = "Warning, Invalid branch key passed! Branch key will be read from manifest instead!"
            io.branch.referral.BranchLogger.f(r4)
            java.lang.String r4 = io.branch.referral.BranchUtil.f(r3)
        L52:
            io.branch.referral.Branch r4 = k(r3, r4)
            io.branch.referral.Branch.r = r4
            io.branch.referral.BranchPreinstall.b(r4, r3)
        L5b:
            io.branch.referral.Branch r3 = io.branch.referral.Branch.r
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.g(android.content.Context, java.lang.String):io.branch.referral.Branch");
    }

    public static synchronized Branch i() {
        return r;
    }

    public static synchronized Branch k(Context context, String str) {
        if (r != null) {
            BranchLogger.f("Warning, attempted to reinitialize Branch SDK singleton!");
            return r;
        }
        r = new Branch(context.getApplicationContext());
        if (TextUtils.isEmpty(str)) {
            BranchLogger.f("Warning: Please enter your branch_key in your project's Manifest file!");
            r.b.m("bnc_no_value");
        } else {
            r.b.m(str);
        }
        if (context instanceof Application) {
            r.p((Application) context);
        }
        return r;
    }

    public static boolean l(Activity activity) {
        boolean z = false;
        if (activity != null && activity.getIntent() != null && activity.getIntent().getBooleanExtra("branch_used", false)) {
            z = true;
        }
        BranchLogger.e("isIntentParamsAlreadyConsumed " + z);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(android.content.Intent r4) {
        /*
            r0 = 0
            if (r4 == 0) goto La
            java.lang.String r1 = "branch_force_new_session"
            boolean r1 = r4.getBooleanExtra(r1, r0)
            goto Lb
        La:
            r1 = r0
        Lb:
            r2 = 1
            if (r1 != 0) goto L2c
            if (r4 == 0) goto L27
            java.lang.String r1 = "branch"
            java.lang.String r1 = r4.getStringExtra(r1)
            if (r1 == 0) goto L1a
            r1 = r2
            goto L1b
        L1a:
            r1 = r0
        L1b:
            java.lang.String r3 = "branch_used"
            boolean r4 = r4.getBooleanExtra(r3, r0)
            if (r1 == 0) goto L27
            if (r4 != 0) goto L27
            r4 = r2
            goto L28
        L27:
            r4 = r0
        L28:
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            return r0
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.Branch.m(android.content.Intent):boolean");
    }

    public static InitSessionBuilder o(Activity activity) {
        InitSessionBuilder initSessionBuilder = new InitSessionBuilder();
        Branch branchI = i();
        if (activity != null && (branchI.h() == null || !branchI.h().getLocalClassName().equals(activity.getLocalClassName()))) {
            branchI.i = new WeakReference(activity);
        }
        return initSessionBuilder;
    }

    public final void a() {
        Bundle bundle;
        Context context = this.d;
        JSONObject jSONObjectJ = j();
        String str = null;
        try {
            if (jSONObjectJ.has("+clicked_branch_link") && jSONObjectJ.getBoolean("+clicked_branch_link") && jSONObjectJ.length() > 0) {
                Bundle bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle2 == null || !bundle2.getBoolean("io.branch.sdk.auto_link_disable", false)) {
                    ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 129).activities;
                    int i = 1501;
                    if (activityInfoArr != null) {
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (activityInfo != null && (bundle = activityInfo.metaData) != null && ((bundle.getString("io.branch.sdk.auto_link_keys") != null || activityInfo.metaData.getString("io.branch.sdk.auto_link_path") != null) && (b(jSONObjectJ, activityInfo) || c(jSONObjectJ, activityInfo)))) {
                                str = activityInfo.name;
                                i = activityInfo.metaData.getInt("io.branch.sdk.auto_link_request_code", 1501);
                                break;
                            }
                        }
                    }
                    if (str == null || h() == null) {
                        return;
                    }
                    BranchLogger.e("deepLinkActivity " + str + " getCurrentActivity " + h());
                    Activity activityH = h();
                    Intent intent = new Intent(activityH, Class.forName(str));
                    intent.putExtra("io.branch.sdk.auto_linked", "true");
                    intent.putExtra("referring_data", jSONObjectJ.toString());
                    Iterator<String> itKeys = jSONObjectJ.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        intent.putExtra(next, jSONObjectJ.getString(next));
                    }
                    activityH.startActivityForResult(intent, i);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            BranchLogger.f("Warning: Please make sure Activity names set for auto deep link are correct!");
        } catch (ClassNotFoundException unused2) {
            BranchLogger.f("Warning: Please make sure Activity names set for auto deep link are correct! Error while looking for activity " + str);
        } catch (Exception unused3) {
        }
    }

    public final String d(ServerRequestCreateUrl serverRequestCreateUrl) throws ExecutionException, JSONException, InterruptedException, TimeoutException {
        ServerResponse serverResponse;
        boolean z = serverRequestCreateUrl.f;
        BranchLinkData branchLinkData = serverRequestCreateUrl.i;
        if (!z) {
            if (this.d.checkCallingOrSelfPermission("android.permission.INTERNET") == 0) {
                ConcurrentHashMap concurrentHashMap = this.f;
                if (concurrentHashMap.containsKey(branchLinkData)) {
                    String str = (String) concurrentHashMap.get(branchLinkData);
                    BranchLinkCreateListener branchLinkCreateListener = serverRequestCreateUrl.k;
                    if (branchLinkCreateListener != null) {
                        branchLinkCreateListener.e(str, null);
                    }
                    return str;
                }
                if (serverRequestCreateUrl.j) {
                    this.e.f(serverRequestCreateUrl);
                    return null;
                }
                try {
                    serverResponse = new GetShortLinkTask().execute(serverRequestCreateUrl).get(this.b.f23860a.getInt("bnc_timeout", 5500) + 2000, TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                    BranchLogger.a(e.getMessage());
                    serverResponse = null;
                }
                String strP = serverRequestCreateUrl.l ? serverRequestCreateUrl.p() : null;
                if (serverResponse != null && serverResponse.f23865a == 200) {
                    try {
                        strP = serverResponse.a().getString("url");
                        if (branchLinkData != null) {
                            concurrentHashMap.put(branchLinkData, strP);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                return strP;
            }
            BranchLinkCreateListener branchLinkCreateListener2 = serverRequestCreateUrl.k;
            if (branchLinkCreateListener2 != null) {
                branchLinkCreateListener2.e(null, new BranchError("Trouble creating a URL.", -102));
            }
        }
        return null;
    }

    public final Context e() {
        return this.d;
    }

    public final Activity h() {
        WeakReference weakReference = this.i;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    public final JSONObject j() {
        String strJ = this.b.j("bnc_session_params");
        if (strJ.equals("bnc_no_value")) {
            return new JSONObject();
        }
        try {
            return new JSONObject(strJ);
        } catch (JSONException unused) {
            try {
                return new JSONObject(new String(Base64.a(strJ.getBytes())));
            } catch (JSONException e) {
                e.printStackTrace();
                return new JSONObject();
            }
        }
    }

    public final void n(Uri uri, Activity activity) throws JSONException {
        String queryParameter;
        Context context = this.d;
        PrefHelper prefHelper = this.b;
        BranchLogger.e("Read params uri: " + uri + " bypassCurrentActivityIntentState: false intent state: " + this.g);
        if (this.g == INTENT_STATE.e) {
            BranchLogger.e("extractExternalUriAndIntentExtras " + uri + " " + activity);
            try {
                if (!l(activity)) {
                    if (UniversalResourceAnalyser.d == null) {
                        UniversalResourceAnalyser.d = new UniversalResourceAnalyser(context);
                    }
                    String strA = UniversalResourceAnalyser.d.a(uri.toString());
                    prefHelper.p("bnc_external_intent_uri", strA);
                    if (strA.equals(uri.toString())) {
                        Bundle extras = activity.getIntent().getExtras();
                        Set<String> setKeySet = extras.keySet();
                        if (!setKeySet.isEmpty()) {
                            JSONObject jSONObject = new JSONObject();
                            for (String str : t) {
                                if (setKeySet.contains(str)) {
                                    jSONObject.put(str, extras.get(str));
                                }
                            }
                            if (jSONObject.length() > 0) {
                                prefHelper.p("bnc_external_intent_extra", jSONObject.toString());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                BranchLogger.a(e.getMessage());
            }
            BranchLogger.e("extractBranchLinkFromIntentExtra " + activity);
            if (activity != null) {
                try {
                    if (activity.getIntent() != null && activity.getIntent().getExtras() != null && !l(activity)) {
                        Object obj = activity.getIntent().getExtras().get("branch");
                        String string = obj instanceof String ? (String) obj : obj instanceof Uri ? ((Uri) obj).toString() : null;
                        if (!TextUtils.isEmpty(string)) {
                            prefHelper.p("bnc_push_identifier", string);
                            Intent intent = activity.getIntent();
                            intent.putExtra("branch_used", true);
                            activity.setIntent(intent);
                            return;
                        }
                    }
                } catch (Exception e2) {
                    BranchLogger.a(e2.getMessage());
                }
            }
            if (activity == null || activity.getIntent() == null || (activity.getIntent().getFlags() & 1048576) == 0) {
                if (uri != null) {
                    try {
                        if (uri.isHierarchical() && (queryParameter = uri.getQueryParameter("link_click_id")) != null) {
                            prefHelper.p("bnc_link_click_identifier", queryParameter);
                            String strConcat = "link_click_id=".concat(queryParameter);
                            String string2 = uri.toString();
                            activity.getIntent().setData(Uri.parse(string2.replaceFirst(strConcat.equals(uri.getQuery()) ? "\\?".concat(strConcat) : string2.length() - strConcat.length() == string2.indexOf(strConcat) ? "&".concat(strConcat) : strConcat.concat("&"), "")));
                            activity.getIntent().putExtra("branch_used", true);
                            return;
                        }
                    } catch (Exception e3) {
                        BranchLogger.a(e3.getMessage());
                    }
                }
                if (uri == null || activity == null) {
                    return;
                }
                String scheme = uri.getScheme();
                Intent intent2 = activity.getIntent();
                if (scheme == null || intent2 == null) {
                    return;
                }
                if ((!scheme.equalsIgnoreCase("http") && !scheme.equalsIgnoreCase("https")) || TextUtils.isEmpty(uri.getHost()) || l(activity)) {
                    return;
                }
                if (UniversalResourceAnalyser.d == null) {
                    UniversalResourceAnalyser.d = new UniversalResourceAnalyser(context);
                }
                if (uri.toString().equalsIgnoreCase(UniversalResourceAnalyser.d.a(uri.toString()))) {
                    prefHelper.p("bnc_app_link", uri.toString());
                }
                intent2.putExtra("branch_used", true);
                activity.setIntent(intent2);
            }
        }
    }

    public final void p(Application application) {
        try {
            BranchActivityLifecycleObserver branchActivityLifecycleObserver = new BranchActivityLifecycleObserver();
            branchActivityLifecycleObserver.d = 0;
            branchActivityLifecycleObserver.e = new HashSet();
            this.k = branchActivityLifecycleObserver;
            application.unregisterActivityLifecycleCallbacks(branchActivityLifecycleObserver);
            application.registerActivityLifecycleCallbacks(this.k);
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
            BranchLogger.e(new BranchError("", -108).a());
        }
    }
}
