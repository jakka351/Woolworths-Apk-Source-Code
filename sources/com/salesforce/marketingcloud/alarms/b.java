package com.salesforce.marketingcloud.alarms;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.MCReceiver;
import com.salesforce.marketingcloud.alarms.a;
import com.salesforce.marketingcloud.f;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.storage.j;
import com.salesforce.marketingcloud.util.l;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class b extends f implements com.salesforce.marketingcloud.behaviors.b {

    @RestrictTo
    public static final String j = "com.salesforce.marketingcloud.ACTION_ALARM_WAKE_EVENT";

    @RestrictTo
    public static final String k = "com.salesforce.marketingcloud.WAKE_FOR_ALARM";
    static final String l = "pending_alarms";
    static final String m = g.a("AlarmScheduler");
    private static final long n = 0;
    private final Map<a.EnumC0346a, InterfaceC0348b> d = new HashMap();
    private final com.salesforce.marketingcloud.behaviors.c e;

    @VisibleForTesting
    BroadcastReceiver f;
    private Context g;
    private j h;
    private SharedPreferences i;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16837a;

        static {
            int[] iArr = new int[com.salesforce.marketingcloud.behaviors.a.values().length];
            f16837a = iArr;
            try {
                iArr[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16837a[com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.salesforce.marketingcloud.alarms.b$b, reason: collision with other inner class name */
    public interface InterfaceC0348b {
        void a(@NonNull a.EnumC0346a enumC0346a);
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                g.d(b.m, "Received null intent", new Object[0]);
                return;
            }
            String action = intent.getAction();
            if (action == null) {
                g.d(b.m, "Received null action", new Object[0]);
                return;
            }
            Bundle extras = intent.getExtras();
            if (extras == null) {
                g.d(b.m, "Intent had no extras", new Object[0]);
                return;
            }
            if (!action.equals(b.j)) {
                g.a(b.m, "Received unknown action: %s", action);
                return;
            }
            String string = extras.getString("com.salesforce.marketingcloud.WAKE_FOR_ALARM", null);
            if (string != null) {
                g.d(b.m, "ACTION_ALARM_WAKE_EVENT had extra: %s", string);
                try {
                    b.this.a(a.EnumC0346a.valueOf(string));
                } catch (IllegalArgumentException unused) {
                    g.e(b.m, "Woke for an unknown alarm: %s", string);
                }
            }
        }
    }

    @RestrictTo
    public b(@NonNull Context context, @NonNull j jVar, @NonNull com.salesforce.marketingcloud.behaviors.c cVar) {
        this.g = context;
        this.h = jVar;
        this.e = (com.salesforce.marketingcloud.behaviors.c) com.salesforce.marketingcloud.util.j.a(cVar, "BehaviorManager is null");
        this.i = jVar.f();
    }

    @VisibleForTesting
    public void a(a.EnumC0346a enumC0346a) {
        a(enumC0346a);
        InterfaceC0348b interfaceC0348b = this.d.get(enumC0346a);
        if (interfaceC0348b != null) {
            interfaceC0348b.a(enumC0346a);
        }
    }

    @RestrictTo
    public void b(@NonNull @Size a.EnumC0346a... enumC0346aArr) {
        for (a.EnumC0346a enumC0346a : enumC0346aArr) {
            a(enumC0346a, false);
        }
    }

    @RestrictTo
    public void c(@NonNull @Size a.EnumC0346a... enumC0346aArr) {
        for (a.EnumC0346a enumC0346a : enumC0346aArr) {
            g.a(m, "Resetting %s Alarm Interval.", enumC0346a.name());
            this.i.edit().putLong(enumC0346a.b().c(), 0L).apply();
        }
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "AlarmScheduler";
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final JSONObject componentState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            for (a.EnumC0346a enumC0346a : a.EnumC0346a.values()) {
                if (a(enumC0346a, jCurrentTimeMillis)) {
                    jSONObject2.put(enumC0346a.name(), l.a(new Date(this.i.getLong(enumC0346a.b().a(), 0L) + this.i.getLong(enumC0346a.b().c(), 0L))));
                }
            }
            jSONObject.put(l, jSONObject2);
            return jSONObject;
        } catch (JSONException e) {
            g.b(m, e, "Failed to generate Component State JSONObject.", new Object[0]);
            return jSONObject;
        }
    }

    @RestrictTo
    public void d(@NonNull @Size a.EnumC0346a... enumC0346aArr) {
        for (a.EnumC0346a enumC0346a : enumC0346aArr) {
            c(enumC0346a);
            a(enumC0346a);
            try {
                ((AlarmManager) this.g.getSystemService("alarm")).cancel(a(this.g, enumC0346a.name(), Integer.valueOf(enumC0346a.b().b())));
                g.a(m, "Reset %s alarm.", enumC0346a.name());
            } catch (Exception e) {
                g.e(m, e, "Could not cancel %s alarm.", enumC0346a.name());
            }
        }
    }

    @RestrictTo
    public void e(@NonNull a.EnumC0346a... enumC0346aArr) {
        synchronized (this.d) {
            try {
                for (a.EnumC0346a enumC0346a : enumC0346aArr) {
                    this.d.remove(enumC0346a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.salesforce.marketingcloud.behaviors.b
    public final void onBehavior(@NonNull com.salesforce.marketingcloud.behaviors.a aVar, @NonNull Bundle bundle) {
        int i = a.f16837a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            a(bundle.getLong("timestamp"));
        }
    }

    @Override // com.salesforce.marketingcloud.f, com.salesforce.marketingcloud.d
    public final void tearDown(boolean z) {
        if (z) {
            d(a.EnumC0346a.values());
        }
        Context context = this.g;
        if (context != null) {
            LocalBroadcastManager.a(context).d(this.f);
        }
        this.e.a(this);
    }

    @VisibleForTesting
    public void a(@NonNull @Size a.EnumC0346a... enumC0346aArr) {
        for (a.EnumC0346a enumC0346a : enumC0346aArr) {
            g.a(m, "Resetting %s Alarm Active Flag to FALSE", enumC0346a.name());
            this.i.edit().putLong(enumC0346a.b().a(), 0L).apply();
        }
    }

    @VisibleForTesting
    public final long b(@NonNull a.EnumC0346a enumC0346a) {
        long jE;
        long j2 = this.i.getLong(enumC0346a.b().c(), 0L);
        if (j2 == 0) {
            jE = enumC0346a.b().d();
        } else {
            jE = (long) (enumC0346a.b().e() * j2);
        }
        if (jE <= enumC0346a.b().f()) {
            return jE;
        }
        long jF = enumC0346a.b().f();
        g.a(m, "%s MAX INTERVAL exceeded. Setting interval to %s milliseconds.", enumC0346a.name(), Long.valueOf(jF));
        return jF;
    }

    @RestrictTo
    public boolean c(@NonNull a.EnumC0346a enumC0346a) {
        return enumC0346a.b().g() && a(enumC0346a, true);
    }

    private boolean a(@NonNull a.EnumC0346a enumC0346a, boolean z) {
        if (!enumC0346a.a(this.h)) {
            g.a(m, "shouldCreateAlarm() for %s Alarm was FALSE.  Aborting alarm creation.", enumC0346a.name());
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jB = b(enumC0346a);
        if (a(enumC0346a, jCurrentTimeMillis)) {
            if (z) {
                return false;
            }
            g.a(m, "%s Send Pending ... will send at %s", enumC0346a.name(), l.a(new Date(this.h.f().getLong(enumC0346a.b().a(), 0L) + jB)));
            return false;
        }
        g.a(m, "No pending %s Alarm. Creating one ...", enumC0346a.name());
        a(enumC0346a, jCurrentTimeMillis, jB);
        Context context = this.g;
        if (z) {
            jB = 1000;
        }
        a(context, enumC0346a, jB, jCurrentTimeMillis);
        return true;
    }

    @NonNull
    private static PendingIntent a(@NonNull Context context, @Nullable String str, @NonNull Integer num) {
        return PendingIntent.getBroadcast(context, num.intValue(), MCReceiver.a(context, str), l.a(134217728));
    }

    @Override // com.salesforce.marketingcloud.f
    public final void a(@NonNull InitializationStatus.a aVar) {
        this.e.a(this, EnumSet.of(com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_DEVICE_BOOT_COMPLETE, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_APP_PACKAGE_REPLACED));
        this.f = new c();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(j);
        LocalBroadcastManager.a(this.g).b(this.f, intentFilter);
    }

    @VisibleForTesting
    public final boolean a(@NonNull a.EnumC0346a enumC0346a, @IntRange long j2) {
        return this.i.getLong(enumC0346a.b().a(), 0L) > j2 - this.i.getLong(enumC0346a.b().c(), 0L);
    }

    private void a(long j2) {
        for (a.EnumC0346a enumC0346a : a.EnumC0346a.values()) {
            com.salesforce.marketingcloud.alarms.a aVarB = enumC0346a.b();
            long j3 = this.i.getLong(aVarB.a(), 0L);
            if (j3 > 0) {
                if (a(enumC0346a, j2)) {
                    a(this.g, enumC0346a, this.i.getLong(aVarB.c(), aVarB.d()), j3);
                } else {
                    a(enumC0346a);
                }
            }
        }
    }

    @SuppressLint
    @RestrictTo
    public void a(@NonNull InterfaceC0348b interfaceC0348b, @NonNull a.EnumC0346a... enumC0346aArr) {
        synchronized (this.d) {
            try {
                for (a.EnumC0346a enumC0346a : enumC0346aArr) {
                    this.d.put(enumC0346a, interfaceC0348b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(@NonNull a.EnumC0346a enumC0346a, @IntRange long j2, @IntRange long j3) {
        g.a(m, "Setting the %s Alarm Flag ...", enumC0346a.name());
        this.i.edit().putLong(enumC0346a.b().a(), j2).putLong(enumC0346a.b().c(), j3).apply();
    }

    @SuppressLint
    @VisibleForTesting
    public void a(@NonNull Context context, @NonNull a.EnumC0346a enumC0346a, @IntRange long j2, @IntRange long j3) {
        PendingIntent pendingIntentA = a(context, enumC0346a.name(), Integer.valueOf(enumC0346a.b().b()));
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        long j4 = j3 + j2;
        String strA = l.a(new Date(j4));
        try {
            if (Build.VERSION.SDK_INT < 31 || alarmManager.canScheduleExactAlarms()) {
                alarmManager.setExact(0, j4, pendingIntentA);
            } else {
                alarmManager.set(0, j4, pendingIntentA);
            }
            g.d(m, "%s Alarm scheduled to wake at %s.", enumC0346a.name(), strA);
        } catch (Exception e) {
            g.e(m, e, "Failed to schedule alarm %s for %s", enumC0346a.name(), strA);
        }
    }
}
