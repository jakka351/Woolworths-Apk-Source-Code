package com.swrve.sdk;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;
import com.swrve.sdk.SwrveLogger;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.localstorage.InMemoryLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import com.swrve.sdk.rest.RESTClient;
import java.lang.ref.WeakReference;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import timber.log.Timber;

/* loaded from: classes.dex */
public class Swrve extends SwrveBase<ISwrve, SwrveConfig> implements ISwrve {
    public static final /* synthetic */ int r0 = 0;
    public final SwrveGoogleUtil q0;

    public Swrve(Application application, int i, String str, SwrveConfig swrveConfig) {
        SwrveLogger.SwrveLoggerTree swrveLoggerTree;
        this.J = -1;
        this.K = -1;
        int i2 = 0;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.a0 = new SwrveCampaignInfluence();
        this.d0 = Collections.synchronizedList(new ArrayList());
        this.f0 = "";
        new HashSet();
        boolean z = swrveConfig.e;
        SwrveLogger.b = z;
        if (!z && (swrveLoggerTree = SwrveLogger.c) != null) {
            Timber.f27013a.getClass();
            ArrayList arrayList = Timber.b;
            synchronized (arrayList) {
                if (!arrayList.remove(swrveLoggerTree)) {
                    throw new IllegalArgumentException(Intrinsics.m(swrveLoggerTree, "Cannot uproot tree which is not planted: ").toString());
                }
                Object[] array = arrayList.toArray(new Timber.Tree[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                Timber.c = (Timber.Tree[]) array;
            }
        }
        if (i <= 0 || SwrveHelper.p(str)) {
            SwrveHelper.r("Please setup a correct appId and apiKey");
            throw null;
        }
        this.h = i;
        this.i = str;
        this.l = swrveConfig;
        Context applicationContext = application.getApplicationContext();
        this.e = new WeakReference(applicationContext);
        this.d = new WeakReference(application);
        RESTClient rESTClient = new RESTClient();
        this.t = rESTClient;
        SwrveAssetsManagerImp swrveAssetsManagerImp = new SwrveAssetsManagerImp();
        swrveAssetsManagerImp.f19039a = new HashSet();
        this.F = swrveAssetsManagerImp;
        this.q = 30000L;
        InMemoryLocalStorage inMemoryLocalStorage = new InMemoryLocalStorage();
        inMemoryLocalStorage.f19084a = new HashMap();
        inMemoryLocalStorage.b = new HashMap();
        this.s = new SwrveMultiLayerLocalStorage(inMemoryLocalStorage);
        this.p = Executors.newSingleThreadExecutor();
        this.v = Executors.newSingleThreadExecutor();
        this.w = Executors.newSingleThreadExecutor();
        this.u = Executors.newSingleThreadExecutor();
        this.x = Executors.newSingleThreadExecutor();
        this.y = Executors.newSingleThreadExecutor();
        this.j = new SwrveProfileManager(applicationContext, i, str, swrveConfig, rESTClient);
        a0(new o(this, i2));
        this.g = null;
        try {
            this.g = applicationContext.getPackageManager().getPackageInfo(applicationContext.getPackageName(), 0).versionName;
        } catch (Exception e) {
            SwrveLogger.c("Couldn't get app version from PackageManager. Please provide the app version manually through the config object.", e, new Object[0]);
        }
        int i3 = this.h;
        try {
            swrveConfig.a(i3);
        } catch (MalformedURLException e2) {
            SwrveLogger.c(YU.a.d(i3, "Couldn't generate urls for appId:"), e2, new Object[0]);
        }
        String str2 = SwrveHelper.f19056a;
        Locale locale = Locale.getDefault();
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (!SwrveHelper.p(locale.getCountry())) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
        if (!SwrveHelper.p(locale.getVariant())) {
            sb.append('-');
            sb.append(locale.getVariant());
        }
        this.k = sb.toString();
        Application application2 = (Application) this.d.get();
        if (application2 != null) {
            application2.registerActivityLifecycleCallbacks(this);
            SwrveLogger.e("SwrveSDK registered ActivityLifecycleCallbacks.", new Object[0]);
        }
        SwrveCommon.f19047a = this;
        this.q0 = new SwrveGoogleUtil(application, this.j.b());
    }

    @Override // com.swrve.sdk.SwrveBase
    public final String E0(Context context) {
        return SwrveHelper.k(context);
    }

    @Override // com.swrve.sdk.ISwrve
    public final void j(String str) {
        l0(new a(1, this, getUserId(), str));
    }

    @Override // com.swrve.sdk.SwrveBase
    public final void v0() {
        FirebaseMessaging firebaseMessaging;
        final String userId = getUserId();
        final SwrveGoogleUtil swrveGoogleUtil = this.q0;
        final SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
        SwrveConfig swrveConfig = this.l;
        boolean z = swrveConfig.k;
        swrveConfig.getClass();
        swrveGoogleUtil.getClass();
        if (z) {
            try {
                String strC = swrveMultiLayerLocalStorage.c(userId, "RegistrationId");
                if (SwrveHelper.p(strC)) {
                    strC = "";
                }
                if (!SwrveHelper.p(strC)) {
                    swrveGoogleUtil.c = strC;
                    return;
                }
                try {
                    Store store = FirebaseMessaging.m;
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(FirebaseApp.d());
                    }
                } catch (IllegalStateException e) {
                    SwrveLogger.c("SwrveSDK cannot get instance of FirebaseMessaging and therefore cannot get token registration id.", e, new Object[0]);
                    firebaseMessaging = null;
                }
                if (firebaseMessaging != null) {
                    firebaseMessaging.d().addOnSuccessListener(new OnSuccessListener() { // from class: com.swrve.sdk.i
                        @Override // com.google.android.gms.tasks.OnSuccessListener
                        public final void onSuccess(Object obj) {
                            SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage2 = swrveMultiLayerLocalStorage;
                            String str = userId;
                            String str2 = (String) obj;
                            SwrveGoogleUtil swrveGoogleUtil2 = swrveGoogleUtil;
                            swrveGoogleUtil2.getClass();
                            if (SwrveHelper.p(str2)) {
                                return;
                            }
                            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                            try {
                                executorServiceNewSingleThreadExecutor.execute(new j(swrveGoogleUtil2, swrveMultiLayerLocalStorage2, str, str2));
                            } finally {
                                executorServiceNewSingleThreadExecutor.shutdown();
                            }
                        }
                    }).addOnFailureListener(new com.google.firebase.remoteconfig.a(5));
                }
            } catch (Exception e2) {
                SwrveLogger.c("SwrveSDK: Couldn't obtain the registration token id", e2, new Object[0]);
            }
        }
    }

    @Override // com.swrve.sdk.SwrveBase
    public final void x0(JSONObject jSONObject) {
        this.q0.a(jSONObject);
    }
}
