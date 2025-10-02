package com.tealium.lifecycle;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.tealium.core.Collector;
import com.tealium.core.Module;
import com.tealium.core.ModuleFactory;
import com.tealium.core.TealiumConfig;
import com.tealium.core.TealiumContext;
import com.tealium.core.messaging.ActivityObserverListener;
import com.tealium.dispatcher.TealiumEvent;
import com.tealium.lifecycle.a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tealium/lifecycle/Lifecycle;", "Lcom/tealium/core/Collector;", "Lcom/tealium/core/messaging/ActivityObserverListener;", "Companion", "lifecycle_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class Lifecycle implements Collector, ActivityObserverListener {

    @NotNull
    public static final String MODULE_VERSION = "1.2.0";
    public static final Companion k = new Companion();

    /* renamed from: a, reason: collision with root package name */
    public final TealiumContext f19190a;
    public final TealiumConfig b;
    public final boolean c;
    public long d;
    public long e;
    public final Handler f;
    public final b g;
    public final a h;
    public final String i;
    public boolean j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tealium/lifecycle/Lifecycle$Companion;", "Lcom/tealium/core/ModuleFactory;", "", "MODULE_NAME", "Ljava/lang/String;", "MODULE_VERSION", "lifecycle_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion implements ModuleFactory {
        @Override // com.tealium.core.ModuleFactory
        public final Module a(TealiumContext context) {
            Intrinsics.h(context, "context");
            return new Lifecycle(context);
        }
    }

    public Lifecycle(TealiumContext context) {
        Intrinsics.h(context, "context");
        this.f19190a = context;
        TealiumConfig tealiumConfig = context.f19130a;
        this.b = tealiumConfig;
        Object obj = tealiumConfig.k.get("is_lifecycle_autotracking");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        this.c = bool != null ? bool.booleanValue() : true;
        this.d = Long.MIN_VALUE;
        this.e = Long.MIN_VALUE;
        this.f = new Handler(Looper.getMainLooper());
        b bVar = new b(tealiumConfig);
        this.g = bVar;
        this.h = new a(bVar);
        this.i = "Lifecycle";
        this.j = true;
    }

    @Override // com.tealium.core.Module
    /* renamed from: A, reason: from getter */
    public final boolean getJ() {
        return this.j;
    }

    public final void E(String str, LinkedHashMap linkedHashMap, long j) {
        int i;
        int i2;
        boolean z;
        b bVar = this.g;
        long j2 = bVar.f19192a.getLong("timestamp_last_wake", Long.MIN_VALUE);
        Date date = bVar.c;
        date.setTime(j);
        bVar.i = bVar.b.format(date);
        SharedPreferences sharedPreferences = bVar.f19192a;
        sharedPreferences.edit().putLong("timestamp_last_wake", j).apply();
        if (j2 == Long.MIN_VALUE) {
            linkedHashMap.put("lifecycle_isfirstwakemonth", "true");
            linkedHashMap.put("lifecycle_isfirstwaketoday", "true");
        }
        a aVar = this.h;
        aVar.getClass();
        SharedPreferences sharedPreferences2 = aVar.f19191a.f19192a;
        String string = sharedPreferences2.getString("last_event", null);
        if (string != null) {
            i2 = 1;
            z = ("launch".equals(string) || "wake".equals(string)) && ("launch".equals(str) || "wake".equals(str));
            if (z) {
                i = 0;
                sharedPreferences2.edit().putInt("count_total_crash", sharedPreferences2.getInt("count_total_crash", 0) + 1).apply();
                sharedPreferences2.getInt("count_total_crash", 0);
            } else {
                i = 0;
            }
        } else {
            i = 0;
            i2 = 1;
            z = false;
        }
        if (z) {
            linkedHashMap.put("lifecycle_diddetectcrash", "true");
            linkedHashMap.put("lifecycle_totalcrashcount", Integer.valueOf(sharedPreferences.getInt("count_total_crash", i)));
        }
        Calendar calendar = aVar.b;
        calendar.setTimeInMillis(j2);
        int i3 = calendar.get(2);
        int i4 = i2;
        int i5 = calendar.get(i4);
        int i6 = calendar.get(5);
        calendar.setTimeInMillis(j);
        int i7 = calendar.get(2);
        int i8 = calendar.get(i4);
        int i9 = calendar.get(5);
        int i10 = (i5 == i8 && i3 == i7) ? i : 1;
        if (i10 != 0 || i6 != i9) {
            i10 |= 2;
        }
        if (((i10 & 1) == 1 ? 1 : i) != 0) {
            linkedHashMap.put("lifecycle_isfirstwakemonth", "true");
        }
        if (((i10 & 2) == 2 ? 1 : i) != 0) {
            linkedHashMap.put("lifecycle_isfirstwaketoday", "true");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F(long r11, java.util.Map r13) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tealium.lifecycle.Lifecycle.F(long, java.util.Map):void");
    }

    @Override // com.tealium.core.Module
    /* renamed from: getName, reason: from getter */
    public final String getI() {
        return this.i;
    }

    @Override // com.tealium.core.Collector
    public final Object i(Continuation continuation) {
        Unit unit;
        Unit unit2;
        Unit unit3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        a aVar = this.h;
        Calendar calendar = aVar.b;
        Date date = aVar.d;
        b bVar = aVar.f19191a;
        Date date2 = bVar.c;
        SharedPreferences sharedPreferences = bVar.f19192a;
        if (calendar.getTimeInMillis() != jCurrentTimeMillis) {
            calendar.setTimeInMillis(jCurrentTimeMillis);
        }
        Pair pair = new Pair("lifecycle_dayofweek_local", Integer.valueOf(calendar.get(7)));
        Pair pair2 = new Pair("lifecycle_dayssincelaunch", String.valueOf(a.C0395a.a(sharedPreferences.getLong("timestamp_first_launch", Long.MIN_VALUE), jCurrentTimeMillis)));
        Pair pair3 = new Pair("lifecycle_dayssincelastwake", String.valueOf(a.C0395a.a(sharedPreferences.getLong("timestamp_last_wake", Long.MIN_VALUE), jCurrentTimeMillis)));
        Pair pair4 = new Pair("lifecycle_dayssinceupdate", String.valueOf(a.C0395a.a(sharedPreferences.getLong("timestamp_update", Long.MIN_VALUE), jCurrentTimeMillis)));
        if (calendar.getTimeInMillis() != jCurrentTimeMillis) {
            calendar.setTimeInMillis(jCurrentTimeMillis);
        }
        LinkedHashMap linkedHashMapL = MapsKt.l(pair, pair2, pair3, pair4, new Pair("lifecycle_hourofday_local", String.valueOf(calendar.get(11))), new Pair("lifecycle_launchcount", Integer.valueOf(sharedPreferences.getInt("count_launch", 0))), new Pair("lifecycle_sleepcount", Integer.valueOf(sharedPreferences.getInt("count_sleep", 0))), new Pair("lifecycle_wakecount", Integer.valueOf(sharedPreferences.getInt("count_wake", 0))), new Pair("lifecycle_totalcrashcount", Integer.valueOf(sharedPreferences.getInt("count_total_crash", 0))), new Pair("lifecycle_totallaunchcount", Integer.valueOf(sharedPreferences.getInt("count_total_launch", 0))), new Pair("lifecycle_totalsleepcount", String.valueOf(sharedPreferences.getInt("count_sleep", 0))), new Pair("lifecycle_totalwakecount", String.valueOf(sharedPreferences.getInt("count_wake", 0))), new Pair("lifecycle_totalsecondsawake", String.valueOf(sharedPreferences.getInt("total_seconds_awake", 0))));
        String str = bVar.e;
        if (str != null) {
            linkedHashMapL.put("lifecycle_firstlaunchdate", str);
        } else {
            long j = sharedPreferences.getLong("timestamp_first_launch", Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                j = jCurrentTimeMillis;
            }
            date2.setTime(j);
            String str2 = bVar.b.format(date2);
            bVar.e = str2;
            if (str2 != null) {
                linkedHashMapL.put("lifecycle_firstlaunchdate", str2);
            }
        }
        String str3 = bVar.f;
        if (str3 != null) {
            linkedHashMapL.put("lifecycle_firstlaunchdate_MMDDYYYY", str3);
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyy", Locale.ROOT);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long j2 = sharedPreferences.getLong("timestamp_first_launch", Long.MIN_VALUE);
            if (j2 == Long.MIN_VALUE) {
                j2 = jCurrentTimeMillis;
            }
            date2.setTime(j2);
            String str4 = simpleDateFormat.format(date2);
            bVar.f = str4;
            if (str4 != null) {
                linkedHashMapL.put("lifecycle_firstlaunchdate_MMDDYYYY", str4);
            }
        }
        String str5 = bVar.g;
        Unit unit4 = Unit.f24250a;
        String str6 = null;
        if (str5 != null) {
            linkedHashMapL.put("lifecycle_lastlaunchdate", str5);
            unit = unit4;
        } else {
            unit = null;
        }
        if (unit == null) {
            bVar.g = aVar.a(sharedPreferences.getLong("timestamp_launch", Long.MIN_VALUE), "timestamp_last_launch");
        }
        String str7 = bVar.i;
        if (str7 != null) {
            linkedHashMapL.put("lifecycle_lastwakedate", str7);
            unit2 = unit4;
        } else {
            unit2 = null;
        }
        if (unit2 == null) {
            bVar.i = aVar.a(sharedPreferences.getLong("timestamp_launch", Long.MIN_VALUE), "timestamp_last_wake");
        }
        String str8 = bVar.h;
        if (str8 != null) {
            linkedHashMapL.put("lifecycle_lastsleepdate", str8);
            unit3 = unit4;
        } else {
            unit3 = null;
        }
        if (unit3 == null) {
            bVar.h = aVar.a(Long.MIN_VALUE, "timestamp_last_sleep");
        }
        if (sharedPreferences.getLong("timestamp_update", Long.MIN_VALUE) != Long.MIN_VALUE) {
            String str9 = bVar.d;
            if (str9 != null) {
                linkedHashMapL.put("lifecycle_updatelaunchdate", str9);
            } else {
                unit4 = null;
            }
            if (unit4 == null) {
                if (sharedPreferences.getLong("timestamp_update", Long.MIN_VALUE) != Long.MIN_VALUE) {
                    date.setTime(sharedPreferences.getLong("timestamp_update", Long.MIN_VALUE));
                    str6 = aVar.c.format(date);
                }
                bVar.d = str6;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapL.entrySet()) {
            if (!Intrinsics.c(entry.getValue(), Long.MIN_VALUE)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return MapsKt.q(MapsKt.s(linkedHashMap));
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void m(Activity activity, boolean z) {
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityPaused(Activity activity) throws PackageManager.NameNotFoundException {
        if (this.c) {
            Map mapI = MapsKt.i(new Pair("autotracked", Boolean.TRUE));
            long j = this.d;
            b bVar = this.g;
            if (j == Long.MIN_VALUE) {
                long j2 = bVar.f19192a.getLong("timestamp_last_launch", Long.MIN_VALUE);
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (j2 == Long.MIN_VALUE) {
                    j2 = jCurrentTimeMillis;
                }
                F(j2, mapI);
            }
            bVar.a("pause");
            this.e = SystemClock.elapsedRealtime();
            this.f.postDelayed(new androidx.room.b(5, this, mapI), 5000L);
        }
    }

    @Override // com.tealium.core.messaging.ActivityObserverListener
    public final void onActivityResumed(Activity activity) throws PackageManager.NameNotFoundException {
        if (this.c) {
            Map mapI = MapsKt.i(new Pair("autotracked", Boolean.TRUE));
            this.f.removeCallbacksAndMessages(null);
            long j = this.d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.d = jElapsedRealtime;
            if (j == Long.MIN_VALUE) {
                F(System.currentTimeMillis(), mapI);
                return;
            }
            if (jElapsedRealtime - this.e > 5000) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                b bVar = this.g;
                bVar.b();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.putAll(mapI);
                linkedHashMap.put("lifecycle_type", "wake");
                E("wake", linkedHashMap, jCurrentTimeMillis);
                bVar.a("wake");
                this.f19190a.a(new TealiumEvent("wake", linkedHashMap));
            }
        }
    }

    @Override // com.tealium.core.Module
    public final void setEnabled(boolean z) {
        this.j = z;
    }
}
