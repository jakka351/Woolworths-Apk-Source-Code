package com.adobe.marketing.mobile.services;

import android.content.Context;
import com.adobe.marketing.mobile.internal.util.FileUtils;
import com.adobe.marketing.mobile.services.ServiceProvider;
import com.adobe.marketing.mobile.services.internal.context.App;
import com.adobe.marketing.mobile.util.StringUtils;
import com.medallia.digital.mobilesdk.q2;
import java.io.File;
import java.util.HashMap;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
class DataQueueService implements DataQueuing {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f13230a = new HashMap();

    public static File b() {
        ServiceProvider serviceProvider = ServiceProvider.ServiceProviderSingleton.f13239a;
        serviceProvider.getClass();
        Context contextA = App.f13247a.a();
        if (contextA == null) {
            return null;
        }
        String strD = StringsKt.D("com.adobe.module.identity") ? "com.adobe.module.identity" : androidx.camera.core.impl.b.D(q2.c, androidx.camera.core.impl.b.D("[/\\\\](\\.{2,})", androidx.camera.core.impl.b.D("\\.[/\\\\]", "com.adobe.module.identity", "\\."), "_"), "");
        File databasePath = contextA.getDatabasePath(strD);
        if (!databasePath.exists()) {
            try {
                File fileC = serviceProvider.f13238a.c();
                if (fileC != null) {
                    File file = new File(fileC, strD);
                    if (file.exists()) {
                        FileUtils.a(file, databasePath);
                    }
                }
            } catch (Exception unused) {
                Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                return databasePath;
            }
        }
        return databasePath;
    }

    @Override // com.adobe.marketing.mobile.services.DataQueuing
    public final DataQueue a() {
        if (StringUtils.a("com.adobe.module.identity")) {
            Logging logging = ServiceProvider.ServiceProviderSingleton.f13239a.e;
            return null;
        }
        DataQueue dataQueue = (DataQueue) this.f13230a.get("com.adobe.module.identity");
        if (dataQueue != null) {
            return dataQueue;
        }
        synchronized (this) {
            try {
                DataQueue dataQueue2 = (DataQueue) this.f13230a.get("com.adobe.module.identity");
                if (dataQueue2 == null) {
                    File fileB = b();
                    if (fileB == null) {
                        Logging logging2 = ServiceProvider.ServiceProviderSingleton.f13239a.e;
                        return null;
                    }
                    SQLiteDataQueue sQLiteDataQueue = new SQLiteDataQueue(fileB.getPath());
                    this.f13230a.put("com.adobe.module.identity", sQLiteDataQueue);
                    dataQueue2 = sQLiteDataQueue;
                }
                return dataQueue2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
