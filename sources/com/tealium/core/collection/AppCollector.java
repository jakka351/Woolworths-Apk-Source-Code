package com.tealium.core.collection;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Debug;
import android.os.Process;
import com.salesforce.marketingcloud.storage.db.k;
import com.tealium.core.Collector;
import com.tealium.core.CollectorFactory;
import com.tealium.core.Logger;
import com.tealium.core.TealiumContext;
import com.tealium.core.persistence.Expiry;
import com.tealium.core.persistence.f0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/collection/AppCollector;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/collection/AppData;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class AppCollector implements Collector, AppData {

    @NotNull
    public static final String MODULE_VERSION = "1.6.0";
    public static final Companion g = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public boolean f19133a;
    public final ActivityManager b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tealium/core/collection/AppCollector$Companion;", "Lcom/tealium/core/CollectorFactory;", "", "MODULE_VERSION", "Ljava/lang/String;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements CollectorFactory {
        @Override // com.tealium.core.CollectorFactory
        public final Collector a(TealiumContext context) {
            Intrinsics.h(context, "context");
            return new AppCollector(context.f19130a.f19129a, context.c);
        }
    }

    public AppCollector(Context context, f0 f0Var) throws PackageManager.NameNotFoundException {
        String string;
        Intrinsics.h(context, "context");
        this.f19133a = true;
        Object systemService = context.getApplicationContext().getSystemService("activity");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
        }
        this.b = (ActivityManager) systemService;
        String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.g(packageName, "context.applicationContext.packageName");
        this.c = packageName;
        if (context.getApplicationInfo().labelRes != 0) {
            string = context.getString(context.getApplicationInfo().labelRes);
            Intrinsics.g(string, "context.getString(contex…applicationInfo.labelRes)");
        } else {
            string = context.getApplicationInfo().nonLocalizedLabel.toString();
        }
        this.d = string;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.g(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
        this.e = String.valueOf(packageInfo.versionCode);
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        Intrinsics.g(packageInfo2, "context.packageManager.g…o(context.packageName, 0)");
        String str = packageInfo2.versionName;
        this.f = str == null ? "" : str;
        Logger.Companion companion = Logger.f19124a;
        String strG = f0Var.G("app_uuid");
        if (strG == null) {
            strG = androidx.constraintlayout.core.state.a.h("it");
            f0Var.J("app_uuid", strG, Expiry.b);
        }
        companion.b("Tealium-1.6.0", "Fetching App UUID: ".concat(strG));
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getF19133a() {
        return this.f19133a;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getC() {
        return "AppData";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        Pair pair = new Pair("app_rdns", this.c);
        Pair pair2 = new Pair("app_name", this.d);
        Pair pair3 = new Pair(k.a.q, this.f);
        Pair pair4 = new Pair("app_build", this.e);
        long totalPss = 0;
        try {
            Debug.MemoryInfo[] processMemoryInfo = this.b.getProcessMemoryInfo(new int[]{new Integer[]{Integer.valueOf(Process.myPid())}[0].intValue()});
            Intrinsics.g(processMemoryInfo, "activityManager.getProce…ryInfo(pids.toIntArray())");
            for (Debug.MemoryInfo memoryInfo : processMemoryInfo) {
                totalPss += memoryInfo.getTotalPss();
            }
            totalPss /= 1024;
        } catch (Exception unused) {
        }
        return MapsKt.j(pair, pair2, pair3, pair4, new Pair("app_memory_usage", new Long(totalPss)));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.f19133a = z;
    }
}
