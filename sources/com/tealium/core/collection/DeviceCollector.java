package com.tealium.core.collection;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Point;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.camera.core.impl.b;
import com.salesforce.marketingcloud.messages.iam.j;
import com.salesforce.marketingcloud.storage.db.k;
import com.tealium.core.Collector;
import com.tealium.core.CollectorFactory;
import com.tealium.core.TealiumContext;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/core/collection/DeviceCollector;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/collection/DeviceData;", "Companion", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class DeviceCollector implements Collector, DeviceData {

    @NotNull
    public static final String MODULE_VERSION = "1.6.0";
    public static final Companion q = new Companion();
    public static volatile DeviceCollector r;

    /* renamed from: a, reason: collision with root package name */
    public boolean f19135a = true;
    public final WindowManager b;
    public final Intent c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tealium/core/collection/DeviceCollector$Companion;", "Lcom/tealium/core/CollectorFactory;", "", "MODULE_VERSION", "Ljava/lang/String;", "Lcom/tealium/core/Collector;", "instance", "Lcom/tealium/core/Collector;", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements CollectorFactory {
        @Override // com.tealium.core.CollectorFactory
        public final Collector a(TealiumContext context) {
            DeviceCollector deviceCollector;
            Intrinsics.h(context, "context");
            DeviceCollector deviceCollector2 = DeviceCollector.r;
            if (deviceCollector2 != null) {
                return deviceCollector2;
            }
            synchronized (this) {
                deviceCollector = DeviceCollector.r;
                if (deviceCollector == null) {
                    deviceCollector = new DeviceCollector(context.f19130a.f19129a);
                    DeviceCollector.r = deviceCollector;
                }
            }
            return deviceCollector;
        }
    }

    public DeviceCollector(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
        WindowManager windowManager = (WindowManager) systemService;
        this.b = windowManager;
        Object systemService2 = context.getSystemService("uimode");
        if (systemService2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.app.UiModeManager");
        }
        UiModeManager uiModeManager = (UiModeManager) systemService2;
        Point point = new Point();
        this.c = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        String MODEL = Build.MODEL;
        Intrinsics.g(MODEL, "MODEL");
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.g(MANUFACTURER, "MANUFACTURER");
        this.d = StringsKt.W(MODEL, MANUFACTURER, false) ? MODEL : b.o(MANUFACTURER, " ", MODEL);
        this.e = MODEL;
        this.f = MANUFACTURER;
        String[] SUPPORTED_64_BIT_ABIS = Build.SUPPORTED_64_BIT_ABIS;
        Intrinsics.g(SUPPORTED_64_BIT_ABIS, "SUPPORTED_64_BIT_ABIS");
        this.g = SUPPORTED_64_BIT_ABIS.length == 0 ? "32bit" : "64bit";
        String property = System.getProperty("os.arch");
        String str = j.h;
        this.h = property == null ? j.h : property;
        windowManager.getDefaultDisplay().getSize(point);
        this.i = point.x + "x" + point.y;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        this.j = ((int) ((float) Math.ceil((double) (((float) displayMetrics.widthPixels) / displayMetrics.density)))) + "x" + ((int) ((float) Math.ceil((double) (((float) displayMetrics.heightPixels) / displayMetrics.density))));
        String property2 = System.getProperty("java.vm.version");
        this.k = property2 != null ? property2 : str;
        this.l = uiModeManager.getCurrentModeType() == 4 ? "tv" : "mobile";
        this.m = "android";
        this.n = "Android";
        String str2 = Build.VERSION.INCREMENTAL;
        this.o = str2 == null ? "" : str2;
        String str3 = Build.VERSION.RELEASE;
        this.p = str3 != null ? str3 : "";
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getF19135a() {
        return this.f19135a;
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName */
    public final String getC() {
        return "DeviceData";
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        Pair pair = new Pair("device", this.d);
        Pair pair2 = new Pair("device_model", this.e);
        Pair pair3 = new Pair("device_manufacturer", this.f);
        Pair pair4 = new Pair("device_architecture", this.g);
        Pair pair5 = new Pair("device_cputype", this.h);
        Pair pair6 = new Pair("device_resolution", this.i);
        Pair pair7 = new Pair("device_logical_resolution", this.j);
        Pair pair8 = new Pair("device_android_runtime", this.k);
        Pair pair9 = new Pair("origin", this.l);
        Pair pair10 = new Pair(k.a.b, this.m);
        Pair pair11 = new Pair("os_name", this.n);
        Pair pair12 = new Pair("device_os_build", this.o);
        Pair pair13 = new Pair("device_os_version", this.p);
        StatFs statFs = new StatFs(Environment.getRootDirectory().getPath());
        Pair pair14 = new Pair("device_free_system_storage", new Long(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()));
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        Pair pair15 = new Pair("device_free_external_storage", new Long(statFs2.getBlockSizeLong() * statFs2.getAvailableBlocksLong()));
        int rotation = this.b.getDefaultDisplay().getRotation();
        Pair pair16 = new Pair("device_orientation", rotation != 1 ? rotation != 2 ? rotation != 3 ? "Portrait" : "Landscape Left" : "Portrait UpsideDown" : "Landscape Right");
        String languageTag = Locale.getDefault().toLanguageTag();
        Intrinsics.g(languageTag, "getDefault().toLanguageTag()");
        Pair pair17 = new Pair("device_language", languageTag);
        Intent intent = this.c;
        Pair pair18 = new Pair("device_battery_percent", new Integer(MathKt.b(((intent != null ? intent.getIntExtra("level", -1) : -1) / (intent != null ? intent.getIntExtra("scale", -1) : -1)) * 100)));
        int intExtra = intent != null ? intent.getIntExtra("status", -1) : -1;
        return MapsKt.j(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, new Pair("device_ischarging", Boolean.valueOf(intExtra == 2 || intExtra == 5)));
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.f19135a = z;
    }
}
