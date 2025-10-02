package com.google.firebase.crashlytics.internal.persistence;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.serialization.CrashlyticsReportJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class CrashlyticsReportPersistence {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final CrashlyticsReportJsonTransform g = new CrashlyticsReportJsonTransform();
    public static final androidx.compose.foundation.lazy.layout.a h = new androidx.compose.foundation.lazy.layout.a(3);
    public static final a i = new a();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15387a = new AtomicInteger(0);
    public final FileStore b;
    public final SettingsController c;
    public final CrashlyticsAppQualitySessionsSubscriber d;

    public CrashlyticsReportPersistence(FileStore fileStore, SettingsController settingsController, CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber) {
        this.b = fileStore;
        this.c = settingsController;
        this.d = crashlyticsAppQualitySessionsSubscriber;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i2 = fileInputStream.read(bArr);
                if (i2 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        FileStore fileStore = this.b;
        arrayList.addAll(FileStore.e(fileStore.f.listFiles()));
        arrayList.addAll(FileStore.e(fileStore.g.listFiles()));
        androidx.compose.foundation.lazy.layout.a aVar = h;
        Collections.sort(arrayList, aVar);
        List listE = FileStore.e(fileStore.e.listFiles());
        Collections.sort(listE, aVar);
        arrayList.addAll(listE);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(FileStore.e(this.b.d.list())).descendingSet();
    }

    public final void d(CrashlyticsReport.Session.Event event, String str, boolean z) {
        FileStore fileStore = this.b;
        int i2 = this.c.d().f15395a.f15397a;
        g.getClass();
        try {
            f(fileStore.b(str, YU.a.h("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f15387a.getAndIncrement())), z ? "_" : "")), CrashlyticsReportJsonTransform.f15383a.encode(event));
        } catch (IOException e2) {
            Logger.f15258a.f(e2, "Could not persist event for session " + str);
        }
        b bVar = new b(0);
        fileStore.getClass();
        File file = new File(fileStore.d, str);
        file.mkdirs();
        List<File> listE = FileStore.e(file.listFiles(bVar));
        Collections.sort(listE, new androidx.browser.trusted.a(7));
        int size = listE.size();
        for (File file2 : listE) {
            if (size <= i2) {
                return;
            }
            FileStore.d(file2);
            size--;
        }
    }
}
