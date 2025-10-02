package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Build;
import androidx.camera.core.impl.b;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsTasks;
import com.google.firebase.crashlytics.internal.concurrency.CrashlyticsWorkers;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.medallia.digital.mobilesdk.q2;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SettingsController implements SettingsProvider {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15398a;
    public final SettingsRequest b;
    public final SettingsJsonParser c;
    public final SystemCurrentTimeProvider d;
    public final CachedSettingsIo e;
    public final DefaultSettingsSpiCall f;
    public final DataCollectionArbiter g;
    public final AtomicReference h;
    public final AtomicReference i;

    /* renamed from: com.google.firebase.crashlytics.internal.settings.SettingsController$1, reason: invalid class name */
    class AnonymousClass1 implements SuccessContinuation<Void, Void> {
        public final /* synthetic */ CrashlyticsWorkers d;

        public AnonymousClass1(CrashlyticsWorkers crashlyticsWorkers) {
            this.d = crashlyticsWorkers;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Void r10) throws Throwable {
            FileWriter fileWriter;
            JSONObject jSONObject = (JSONObject) this.d.c.d.submit(new Callable() { // from class: com.google.firebase.crashlytics.internal.settings.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    SettingsController settingsController = SettingsController.this;
                    DefaultSettingsSpiCall defaultSettingsSpiCall = settingsController.f;
                    SettingsRequest settingsRequest = settingsController.b;
                    String str = defaultSettingsSpiCall.f15394a;
                    Logger logger = Logger.f15258a;
                    CrashlyticsWorkers.b();
                    try {
                        HashMap mapB = DefaultSettingsSpiCall.b(settingsRequest);
                        HttpGetRequest httpGetRequest = new HttpGetRequest(str, mapB);
                        httpGetRequest.c("User-Agent", "Crashlytics Android SDK/20.0.1");
                        httpGetRequest.c("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                        DefaultSettingsSpiCall.a(httpGetRequest, settingsRequest);
                        logger.b("Requesting settings from ".concat(str), null);
                        logger.e("Settings query params were: " + mapB);
                        return defaultSettingsSpiCall.c(httpGetRequest.b());
                    } catch (IOException e) {
                        logger.c(e, "Settings request failed.");
                        return null;
                    }
                }
            }).get();
            FileWriter fileWriter2 = null;
            if (jSONObject != null) {
                SettingsController settingsController = SettingsController.this;
                Settings settingsA = settingsController.c.a(jSONObject);
                CachedSettingsIo cachedSettingsIo = settingsController.e;
                long j = settingsA.c;
                cachedSettingsIo.getClass();
                Logger logger = Logger.f15258a;
                logger.e("Writing settings to cache file...");
                try {
                    jSONObject.put("expires_at", j);
                    fileWriter = new FileWriter(cachedSettingsIo.f15393a);
                } catch (Exception e) {
                    e = e;
                    fileWriter = null;
                } catch (Throwable th) {
                    th = th;
                    CommonUtils.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Throwable th2) {
                        th = th2;
                        fileWriter2 = fileWriter;
                        CommonUtils.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    logger.c(e, "Failed to cache settings");
                    CommonUtils.b(fileWriter, "Failed to close settings writer.");
                    logger.b("Loaded settings: " + jSONObject.toString(), null);
                    String str = settingsController.b.f;
                    SharedPreferences.Editor editorEdit = settingsController.f15398a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    settingsController.h.set(settingsA);
                    ((TaskCompletionSource) settingsController.i.get()).trySetResult(settingsA);
                    return Tasks.forResult(null);
                }
                CommonUtils.b(fileWriter, "Failed to close settings writer.");
                logger.b("Loaded settings: " + jSONObject.toString(), null);
                String str2 = settingsController.b.f;
                SharedPreferences.Editor editorEdit2 = settingsController.f15398a.getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                editorEdit2.putString("existing_instance_identifier", str2);
                editorEdit2.apply();
                settingsController.h.set(settingsA);
                ((TaskCompletionSource) settingsController.i.get()).trySetResult(settingsA);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, SettingsRequest settingsRequest, SystemCurrentTimeProvider systemCurrentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, DefaultSettingsSpiCall defaultSettingsSpiCall, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.i = new AtomicReference(new TaskCompletionSource());
        this.f15398a = context;
        this.b = settingsRequest;
        this.d = systemCurrentTimeProvider;
        this.c = settingsJsonParser;
        this.e = cachedSettingsIo;
        this.f = defaultSettingsSpiCall;
        this.g = dataCollectionArbiter;
        atomicReference.set(DefaultSettingsJsonTransform.b(systemCurrentTimeProvider));
    }

    public static SettingsController a(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) throws Resources.NotFoundException {
        String strD = idManager.d();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        SettingsJsonParser settingsJsonParser = new SettingsJsonParser(systemCurrentTimeProvider);
        CachedSettingsIo cachedSettingsIo = new CachedSettingsIo(fileStore);
        Locale locale = Locale.US;
        DefaultSettingsSpiCall defaultSettingsSpiCall = new DefaultSettingsSpiCall(YU.a.h("https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/", str, "/settings"), httpRequestFactory);
        String str4 = Build.MANUFACTURER;
        String str5 = IdManager.h;
        String strO = b.o(str4.replaceAll(str5, ""), q2.c, Build.MODEL.replaceAll(str5, ""));
        String strReplaceAll = Build.VERSION.INCREMENTAL.replaceAll(str5, "");
        String strReplaceAll2 = Build.VERSION.RELEASE.replaceAll(str5, "");
        int iD = CommonUtils.d(context, "com.google.firebase.crashlytics.mapping_file_id", "string");
        if (iD == 0) {
            iD = CommonUtils.d(context, "com.crashlytics.android.build_id", "string");
        }
        String[] strArr = {iD != 0 ? context.getResources().getString(iD) : null, str, str3, str2};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            String str6 = strArr[i];
            if (str6 != null) {
                arrayList.add(str6.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
        }
        String string = sb.toString();
        return new SettingsController(context, new SettingsRequest(str, strO, strReplaceAll, strReplaceAll2, idManager, string.length() > 0 ? CommonUtils.h(string) : null, str3, str2, (strD != null ? DeliveryMechanism.APP_STORE : DeliveryMechanism.DEVELOPER).d), systemCurrentTimeProvider, settingsJsonParser, cachedSettingsIo, defaultSettingsSpiCall, dataCollectionArbiter);
    }

    public final Settings b(SettingsCacheBehavior settingsCacheBehavior) throws Throwable {
        Logger logger = Logger.f15258a;
        Settings settings = null;
        try {
            if (!SettingsCacheBehavior.e.equals(settingsCacheBehavior)) {
                JSONObject jSONObjectA = this.e.a();
                if (jSONObjectA != null) {
                    Settings settingsA = this.c.a(jSONObjectA);
                    logger.b("Loaded cached settings: " + jSONObjectA.toString(), null);
                    this.d.getClass();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (!SettingsCacheBehavior.f.equals(settingsCacheBehavior) && settingsA.c < jCurrentTimeMillis) {
                        logger.e("Cached settings have expired.");
                        return null;
                    }
                    try {
                        logger.e("Returning cached settings.");
                        return settingsA;
                    } catch (Exception e) {
                        e = e;
                        settings = settingsA;
                        logger.c(e, "Failed to get cached settings");
                        return settings;
                    }
                }
                logger.b("No cached settings data found.", null);
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final Task c() {
        return ((TaskCompletionSource) this.i.get()).getTask();
    }

    public final Settings d() {
        return (Settings) this.h.get();
    }

    public final Task e(CrashlyticsWorkers crashlyticsWorkers) throws Throwable {
        Task task;
        Settings settingsB;
        SettingsCacheBehavior settingsCacheBehavior = SettingsCacheBehavior.d;
        AtomicReference atomicReference = this.i;
        AtomicReference atomicReference2 = this.h;
        if (this.f15398a.getSharedPreferences("com.google.firebase.crashlytics", 0).getString("existing_instance_identifier", "").equals(this.b.f) && (settingsB = b(settingsCacheBehavior)) != null) {
            atomicReference2.set(settingsB);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(settingsB);
            return Tasks.forResult(null);
        }
        Settings settingsB2 = b(SettingsCacheBehavior.f);
        if (settingsB2 != null) {
            atomicReference2.set(settingsB2);
            ((TaskCompletionSource) atomicReference.get()).trySetResult(settingsB2);
        }
        DataCollectionArbiter dataCollectionArbiter = this.g;
        Task task2 = dataCollectionArbiter.h.getTask();
        synchronized (dataCollectionArbiter.c) {
            task = dataCollectionArbiter.d.getTask();
        }
        return CrashlyticsTasks.a(task2, task).onSuccessTask(crashlyticsWorkers.f15286a, new AnonymousClass1(crashlyticsWorkers));
    }
}
