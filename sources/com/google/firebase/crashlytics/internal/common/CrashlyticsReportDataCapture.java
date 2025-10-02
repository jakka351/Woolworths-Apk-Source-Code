package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.SettingsController;
import com.google.firebase.crashlytics.internal.stacktrace.MiddleOutFallbackStrategy;
import com.google.firebase.crashlytics.internal.stacktrace.TrimmedThrowableData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public class CrashlyticsReportDataCapture {
    public static final HashMap f;
    public static final String g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f15274a;
    public final IdManager b;
    public final AppData c;
    public final MiddleOutFallbackStrategy d;
    public final SettingsController e;

    static {
        HashMap map = new HashMap();
        f = map;
        androidx.constraintlayout.core.state.a.u(5, map, "armeabi", 6, "armeabi-v7a");
        androidx.constraintlayout.core.state.a.u(9, map, "arm64-v8a", 0, "x86");
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        g = "Crashlytics Android SDK/20.0.1";
    }

    public CrashlyticsReportDataCapture(Context context, IdManager idManager, AppData appData, MiddleOutFallbackStrategy middleOutFallbackStrategy, SettingsController settingsController) {
        this.f15274a = context;
        this.b = idManager;
        this.c = appData;
        this.d = middleOutFallbackStrategy;
        this.e = settingsController;
    }

    public static CrashlyticsReport.Session.Event.Application.Execution.Exception c(TrimmedThrowableData trimmedThrowableData, int i) {
        String str = trimmedThrowableData.b;
        String str2 = trimmedThrowableData.f15402a;
        StackTraceElement[] stackTraceElementArr = trimmedThrowableData.c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        TrimmedThrowableData trimmedThrowableData2 = trimmedThrowableData.d;
        if (i >= 8) {
            TrimmedThrowableData trimmedThrowableData3 = trimmedThrowableData2;
            while (trimmedThrowableData3 != null) {
                trimmedThrowableData3 = trimmedThrowableData3.d;
                i2++;
            }
        }
        CrashlyticsReport.Session.Event.Application.Execution.Exception.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Exception.a();
        builderA.f(str);
        builderA.e(str2);
        builderA.c(d(stackTraceElementArr, 4));
        builderA.d(i2);
        if (trimmedThrowableData2 != null && i2 == 0) {
            builderA.b(c(trimmedThrowableData2, i + 1));
        }
        return builderA.a();
    }

    public static List d(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.Thread.Frame.a();
            builderA.c(i);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            builderA.e(jMax);
            builderA.f(str);
            builderA.b(fileName);
            builderA.d(lineNumber);
            arrayList.add(builderA.a());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final List a() {
        CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.Builder builderA = CrashlyticsReport.Session.Event.Application.Execution.BinaryImage.a();
        builderA.b(0L);
        builderA.d(0L);
        AppData appData = this.c;
        builderA.c(appData.e);
        builderA.e(appData.b);
        return Collections.singletonList(builderA.a());
    }

    public final CrashlyticsReport.Session.Event.Device b(int i) {
        Context context = this.f15274a;
        BatteryState batteryStateA = BatteryState.a(context);
        Float fB = batteryStateA.b();
        Double dValueOf = fB != null ? Double.valueOf(fB.doubleValue()) : null;
        int iC = batteryStateA.c();
        boolean z = false;
        if (!CommonUtils.f() && ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        long jA = CommonUtils.a(context);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        long j = jA - memoryInfo.availMem;
        if (j <= 0) {
            j = 0;
        }
        long blockSize = new StatFs(Environment.getDataDirectory().getPath()).getBlockSize();
        CrashlyticsReport.Session.Event.Device.Builder builderA = CrashlyticsReport.Session.Event.Device.a();
        builderA.b(dValueOf);
        builderA.c(iC);
        builderA.f(z);
        builderA.e(i);
        builderA.g(j);
        builderA.d((r3.getBlockCount() * blockSize) - (blockSize * r3.getAvailableBlocks()));
        return builderA.a();
    }
}
