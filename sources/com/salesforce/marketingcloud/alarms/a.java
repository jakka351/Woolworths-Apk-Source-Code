package com.salesforce.marketingcloud.alarms;

import android.annotation.SuppressLint;
import androidx.annotation.CheckResult;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import com.medallia.digital.mobilesdk.l8;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final String f16834a;
    private final long b;
    private final double c;
    private final long d;

    @NonNull
    private final String e;
    private final int f;
    private final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.salesforce.marketingcloud.alarms.a$a, reason: collision with other inner class name */
    public static abstract class EnumC0346a {
        public static final EnumC0346a b = new C0347a();
        public static final EnumC0346a c = new b();
        public static final EnumC0346a d = new c();
        public static final EnumC0346a e = new d();
        public static final EnumC0346a f = new e();
        public static final EnumC0346a g = new f();
        public static final EnumC0346a h = new g();
        public static final EnumC0346a i = new h();
        public static final EnumC0346a j = new i();
        private static final /* synthetic */ EnumC0346a[] k = a();

        /* renamed from: a, reason: collision with root package name */
        private final int f16835a;

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$a, reason: collision with other inner class name */
        public enum C0347a extends EnumC0346a {
            public /* synthetic */ C0347a() {
                this("REGISTRATION", 0, 909100);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new i(c());
            }

            private C0347a(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$b */
        public enum b extends EnumC0346a {
            public /* synthetic */ b() {
                this("ET_ANALYTICS", 1, 909102);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new b(c());
            }

            private b(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$c */
        public enum c extends EnumC0346a {
            public /* synthetic */ c() {
                this("FETCH_REGION_MESSAGES_DAILY", 2, 909111);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new f(c());
            }

            private c(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$d */
        public enum d extends EnumC0346a {
            public /* synthetic */ d() {
                this("FETCH_PUSH_TOKEN", 3, 909108);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new h(c());
            }

            private d(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$e */
        public enum e extends EnumC0346a {
            public /* synthetic */ e() {
                this("UPDATE_INBOX_MESSAGE_STATUS", 4, 909110);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new j(c());
            }

            private e(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$f */
        public enum f extends EnumC0346a {
            public /* synthetic */ f() {
                this("SYNC", 5, 909112);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new g(c());
            }

            private f(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$g */
        public enum g extends EnumC0346a {
            public /* synthetic */ g() {
                this("IAM_IMAGE_BATCH", 6, 909113);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new e(c());
            }

            private g(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$h */
        public enum h extends EnumC0346a {
            public /* synthetic */ h() {
                this("DEVICE_STATS", 7, 909114);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new c(c());
            }

            private h(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$i */
        public enum i extends EnumC0346a {
            public /* synthetic */ i() {
                this("EVENTS", 8, 909115);
            }

            @Override // com.salesforce.marketingcloud.alarms.a.EnumC0346a
            public a b() {
                return new d(c());
            }

            private i(String str, int i, int i2) {
                super(i, i2, 0, str);
            }
        }

        @VisibleForTesting
        /* renamed from: com.salesforce.marketingcloud.alarms.a$a$j */
        public static class j {

            /* renamed from: a, reason: collision with root package name */
            static final int f16836a = 909115;
            static final int b = 909114;
            static final int c = 909113;
            static final int d = 909112;
            static final int e = 909110;
            static final int f = 909109;
            static final int g = 909108;
            static final int h = 909111;
            static final int i = 909102;
            static final int j = 909101;
            static final int k = 909100;
        }

        public /* synthetic */ EnumC0346a(int i2, int i3, int i4, String str) {
            this(str, i2, i3);
        }

        public static EnumC0346a valueOf(String str) {
            return (EnumC0346a) Enum.valueOf(EnumC0346a.class, str);
        }

        public static EnumC0346a[] values() {
            return (EnumC0346a[]) k.clone();
        }

        @CheckResult
        @Deprecated
        public boolean a(@NonNull com.salesforce.marketingcloud.storage.j jVar) {
            return true;
        }

        public abstract a b();

        public int c() {
            return this.f16835a;
        }

        private EnumC0346a(String str, int i2, int i3) {
            this.f16835a = i3;
        }

        private static /* synthetic */ EnumC0346a[] a() {
            return new EnumC0346a[]{b, c, d, e, f, g, h, i, j};
        }
    }

    public static final class b extends a {
        public b(int i) {
            this(i, "et_etanalytic_alarm_created_date", "et_etanalytic_next_alarm_interval", l8.b.b, 2.0d, 86400000L, true);
        }

        private b(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    public static final class c extends a {
        public c(int i) {
            super(i, "et_device_stats_alarm_created_date", "et_device_stats_alarm_interval", l8.b.b, 2.0d, 86400000L, false);
        }
    }

    public static final class d extends a {
        public d(int i) {
            super(i, "et_events_alarm_created_date", "et_events_alarm_interval", l8.b.b, 2.0d, 86400000L, false);
        }
    }

    public static final class e extends a {
        public e(int i) {
            super(i, "et_iam_image_cache_route_alarm_created_date", "et_iam_image_cache_route_alarm_interval", l8.b.b, 2.0d, 86400000L, false);
        }
    }

    public static final class f extends a {
        public f(int i) {
            this(i, "et_fetch_background_beacon_messages_alarm_created_date", "et_fetch_background_beacon_messages_next_alarm_interval", 86400000L, 1.0d, 86400000L, false);
        }

        private f(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    public static final class g extends a {
        public g(int i) {
            super(i, "et_sync_route_alarm_created_date", "et_sync_route_alarm_interval", l8.b.b, 2.0d, 86400000L, false);
        }
    }

    public static final class h extends a {
        public h(int i) {
            this(i, "et_register_for_remote_notifications_alarm_created_date", "et_register_for_remote_notifications_next_alarm_interval", l8.b.b, 2.0d, 86400000L, false);
        }

        private h(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    public static final class i extends a {
        public i(int i) {
            this(i, "et_registration_alarm_created_date", "et_registration_next_alarm_interval", l8.b.b, 2.0d, 86400000L, false);
        }

        private i(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    public static final class j extends a {
        public j(int i) {
            this(i, "et_update_inbox_message_status_alarm_created_date", "et_update_inbox_message_status_next_alarm_interval", l8.b.b, 2.0d, 86400000L, true);
        }

        private j(int i, String str, String str2, long j, double d, long j2, boolean z) {
            super(i, str, str2, j, d, j2, z);
        }
    }

    @VisibleForTesting
    public a(@IntRange int i2, @NonNull @Size String str, @NonNull @Size String str2, @IntRange long j2, @FloatRange double d2, @IntRange long j3, boolean z) {
        this.f = i2;
        this.e = str;
        this.f16834a = str2;
        this.b = j2;
        this.c = d2;
        this.d = j3;
        this.g = z;
    }

    @NonNull
    public final String a() {
        return this.e;
    }

    public final int b() {
        return this.f;
    }

    @NonNull
    public final String c() {
        return this.f16834a;
    }

    public final long d() {
        return this.b;
    }

    public final double e() {
        return this.c;
    }

    public final long f() {
        return this.d;
    }

    public final boolean g() {
        return this.g;
    }
}
