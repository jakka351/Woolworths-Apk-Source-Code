package com.adobe.marketing.mobile.launch.rulesengine.download;

import androidx.work.d;
import com.adobe.marketing.mobile.launch.rulesengine.download.RulesLoadResult;
import com.adobe.marketing.mobile.services.HttpConnecting;
import com.adobe.marketing.mobile.services.Log;
import com.adobe.marketing.mobile.services.NetworkCallback;
import com.adobe.marketing.mobile.util.TimeUtils;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements NetworkCallback, Continuation, OnSuccessListener {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(int i, Object obj, Object obj2, Object obj3) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
    }

    @Override // com.adobe.marketing.mobile.services.NetworkCallback
    public void b(HttpConnecting httpConnecting) throws ParseException {
        RulesLoadResult rulesLoadResultA;
        RulesLoader rulesLoader = (RulesLoader) this.e;
        String str = (String) this.f;
        d dVar = (d) this.g;
        String str2 = rulesLoader.f13203a;
        RulesLoadResult.Reason reason = RulesLoadResult.Reason.i;
        if (httpConnecting == null) {
            Log.c();
            rulesLoadResultA = new RulesLoadResult(null, reason);
        } else {
            int iB = httpConnecting.b();
            if (iB == 200) {
                InputStream inputStreamC = httpConnecting.c();
                HashMap map = new HashMap();
                String strA = httpConnecting.a("Last-Modified");
                TimeZone timeZone = TimeZone.getTimeZone("GMT");
                Locale locale = Locale.US;
                Date dateC = TimeUtils.c(strA, timeZone);
                map.put("Last-Modified", dateC == null ? String.valueOf(new Date(0L).getTime()) : String.valueOf(dateC.getTime()));
                String strA2 = httpConnecting.a("ETag");
                if (strA2 == null) {
                    strA2 = "";
                }
                map.put("ETag", strA2);
                rulesLoadResultA = rulesLoader.a(str, inputStreamC, map);
            } else if (iB != 304) {
                httpConnecting.b();
                Log.c();
                rulesLoadResultA = new RulesLoadResult(null, reason);
            } else {
                rulesLoadResultA = new RulesLoadResult(null, RulesLoadResult.Reason.h);
            }
        }
        if (httpConnecting != null) {
            httpConnecting.close();
        }
        dVar.a(rulesLoadResultA);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = (RolloutsStateSubscriptionsHandler) this.e;
        Task task = (Task) this.f;
        RolloutsStateSubscriber rolloutsStateSubscriber = (RolloutsStateSubscriber) this.g;
        try {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (configContainer != null) {
                rolloutsStateSubscriptionsHandler.c.execute(new com.google.firebase.remoteconfig.internal.rollouts.a(rolloutsStateSubscriber, rolloutsStateSubscriptionsHandler.b.a(configContainer), 1));
            }
        } catch (FirebaseRemoteConfigException e) {
            android.util.Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws IOException {
        int i = this.d;
        URL url = null;
        Object obj = this.g;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj2;
                CancellationTokenSource cancellationTokenSource = (CancellationTokenSource) obj;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (atomicBoolean.getAndSet(true)) {
                    cancellationTokenSource.cancel();
                }
                return Tasks.forResult(null);
            default:
                ConfigRealtimeHttpClient configRealtimeHttpClient = (ConfigRealtimeHttpClient) obj3;
                Task task2 = (Task) obj2;
                Task task3 = (Task) obj;
                int[] iArr = ConfigRealtimeHttpClient.s;
                if (!task2.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task2.getException()));
                }
                try {
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task3.getException()));
                    }
                    try {
                        url = new URL(configRealtimeHttpClient.c(configRealtimeHttpClient.n));
                    } catch (MalformedURLException unused) {
                        android.util.Log.e("FirebaseRemoteConfig", "URL is malformed");
                    }
                    URLConnection uRLConnectionOpenConnection = url.openConnection();
                    Callback.v(uRLConnectionOpenConnection);
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    configRealtimeHttpClient.i(httpURLConnection, (String) task3.getResult(), ((InstallationTokenResult) task2.getResult()).b());
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e));
                }
        }
    }
}
