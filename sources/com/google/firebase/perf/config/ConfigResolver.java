package com.google.firebase.perf.config;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.ImmutableBundle;
import com.google.firebase.perf.util.Optional;

/* loaded from: classes.dex */
public class ConfigResolver {
    public static final AndroidLogger d = AndroidLogger.e();
    public static volatile ConfigResolver e;

    /* renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f15670a = RemoteConfigManager.getInstance();
    public ImmutableBundle b = new ImmutableBundle();
    public final DeviceCacheManager c = DeviceCacheManager.b();

    public static synchronized ConfigResolver e() {
        try {
            if (e == null) {
                e = new ConfigResolver();
            }
        } catch (Throwable th) {
            throw th;
        }
        return e;
    }

    public static boolean n(long j) {
        return j >= 0;
    }

    public static boolean o(String str) {
        if (!str.trim().isEmpty()) {
            for (String str2 : str.split(";")) {
                if (str2.trim().equals("22.0.1")) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean p(long j) {
        return j >= 0;
    }

    public static boolean r(double d2) {
        return 0.0d <= d2 && d2 <= 1.0d;
    }

    public final Optional a(ConfigurationFlag configurationFlag) {
        DeviceCacheManager deviceCacheManager = this.c;
        String strA = configurationFlag.a();
        if (strA == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.c.a("Key is null when getting boolean value on device cache.");
            return new Optional();
        }
        if (deviceCacheManager.f15691a == null) {
            deviceCacheManager.c(DeviceCacheManager.a());
            if (deviceCacheManager.f15691a == null) {
                return new Optional();
            }
        }
        if (!deviceCacheManager.f15691a.contains(strA)) {
            return new Optional();
        }
        try {
            return new Optional(Boolean.valueOf(deviceCacheManager.f15691a.getBoolean(strA, false)));
        } catch (ClassCastException e2) {
            DeviceCacheManager.c.b("Key %s from sharedPreferences has type other than long: %s", strA, e2.getMessage());
            return new Optional();
        }
    }

    public final Optional b(ConfigurationFlag configurationFlag) {
        DeviceCacheManager deviceCacheManager = this.c;
        String strA = configurationFlag.a();
        if (strA == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.c.a("Key is null when getting double value on device cache.");
            return new Optional();
        }
        if (deviceCacheManager.f15691a == null) {
            deviceCacheManager.c(DeviceCacheManager.a());
            if (deviceCacheManager.f15691a == null) {
                return new Optional();
            }
        }
        if (!deviceCacheManager.f15691a.contains(strA)) {
            return new Optional();
        }
        try {
            try {
                return new Optional(Double.valueOf(Double.longBitsToDouble(deviceCacheManager.f15691a.getLong(strA, 0L))));
            } catch (ClassCastException unused) {
                return new Optional(Double.valueOf(Float.valueOf(deviceCacheManager.f15691a.getFloat(strA, BitmapDescriptorFactory.HUE_RED)).doubleValue()));
            }
        } catch (ClassCastException e2) {
            DeviceCacheManager.c.b("Key %s from sharedPreferences has type other than double: %s", strA, e2.getMessage());
            return new Optional();
        }
    }

    public final Optional c(ConfigurationFlag configurationFlag) {
        DeviceCacheManager deviceCacheManager = this.c;
        String strA = configurationFlag.a();
        if (strA == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.c.a("Key is null when getting long value on device cache.");
            return new Optional();
        }
        if (deviceCacheManager.f15691a == null) {
            deviceCacheManager.c(DeviceCacheManager.a());
            if (deviceCacheManager.f15691a == null) {
                return new Optional();
            }
        }
        if (!deviceCacheManager.f15691a.contains(strA)) {
            return new Optional();
        }
        try {
            return new Optional(Long.valueOf(deviceCacheManager.f15691a.getLong(strA, 0L)));
        } catch (ClassCastException e2) {
            DeviceCacheManager.c.b("Key %s from sharedPreferences has type other than long: %s", strA, e2.getMessage());
            return new Optional();
        }
    }

    public final Optional d(ConfigurationFlag configurationFlag) {
        DeviceCacheManager deviceCacheManager = this.c;
        String strA = configurationFlag.a();
        if (strA == null) {
            deviceCacheManager.getClass();
            DeviceCacheManager.c.a("Key is null when getting String value on device cache.");
            return new Optional();
        }
        if (deviceCacheManager.f15691a == null) {
            deviceCacheManager.c(DeviceCacheManager.a());
            if (deviceCacheManager.f15691a == null) {
                return new Optional();
            }
        }
        if (!deviceCacheManager.f15691a.contains(strA)) {
            return new Optional();
        }
        try {
            return new Optional(deviceCacheManager.f15691a.getString(strA, ""));
        } catch (ClassCastException e2) {
            DeviceCacheManager.c.b("Key %s from sharedPreferences has type other than String: %s", strA, e2.getMessage());
            return new Optional();
        }
    }

    public final boolean f() {
        ConfigurationConstants.ExperimentTTID experimentTTIDD = ConfigurationConstants.ExperimentTTID.d();
        Optional optionalH = h(experimentTTIDD);
        if (optionalH.b()) {
            return ((Boolean) optionalH.a()).booleanValue();
        }
        Optional<Boolean> optional = this.f15670a.getBoolean("fpr_experiment_app_start_ttid");
        if (optional.b()) {
            this.c.g("com.google.firebase.perf.ExperimentTTID", ((Boolean) optional.a()).booleanValue());
            return ((Boolean) optional.a()).booleanValue();
        }
        Optional optionalA = a(experimentTTIDD);
        if (optionalA.b()) {
            return ((Boolean) optionalA.a()).booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        ConfigurationConstants.CollectionDeactivated collectionDeactivated;
        ConfigurationConstants.CollectionEnabled collectionEnabled;
        synchronized (ConfigurationConstants.CollectionDeactivated.class) {
            try {
                if (ConfigurationConstants.CollectionDeactivated.f15671a == null) {
                    ConfigurationConstants.CollectionDeactivated.f15671a = new ConfigurationConstants.CollectionDeactivated();
                }
                collectionDeactivated = ConfigurationConstants.CollectionDeactivated.f15671a;
            } finally {
            }
        }
        Optional optionalH = h(collectionDeactivated);
        if ((optionalH.b() ? (Boolean) optionalH.a() : Boolean.FALSE).booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (ConfigurationConstants.CollectionEnabled.class) {
            try {
                if (ConfigurationConstants.CollectionEnabled.f15672a == null) {
                    ConfigurationConstants.CollectionEnabled.f15672a = new ConfigurationConstants.CollectionEnabled();
                }
                collectionEnabled = ConfigurationConstants.CollectionEnabled.f15672a;
            } finally {
            }
        }
        Optional optionalA = a(collectionEnabled);
        if (optionalA.b()) {
            return (Boolean) optionalA.a();
        }
        Optional optionalH2 = h(collectionEnabled);
        if (optionalH2.b()) {
            return (Boolean) optionalH2.a();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.perf.util.Optional h(com.google.firebase.perf.config.ConfigurationFlag r3) {
        /*
            r2 = this;
            com.google.firebase.perf.util.ImmutableBundle r0 = r2.b
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f15720a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
            return r3
        L1e:
            android.os.Bundle r0 = r0.f15720a     // Catch: java.lang.ClassCastException -> L34
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L34
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L34
            if (r0 != 0) goto L2e
            com.google.firebase.perf.util.Optional r0 = new com.google.firebase.perf.util.Optional     // Catch: java.lang.ClassCastException -> L34
            r0.<init>()     // Catch: java.lang.ClassCastException -> L34
            return r0
        L2e:
            com.google.firebase.perf.util.Optional r1 = new com.google.firebase.perf.util.Optional     // Catch: java.lang.ClassCastException -> L34
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L34
            return r1
        L34:
            r0 = move-exception
            com.google.firebase.perf.logging.AndroidLogger r1 = com.google.firebase.perf.util.ImmutableBundle.b
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Metadata key %s contains type other than boolean: %s"
            r1.b(r0, r3)
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.ConfigResolver.h(com.google.firebase.perf.config.ConfigurationFlag):com.google.firebase.perf.util.Optional");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.perf.util.Optional i(com.google.firebase.perf.config.ConfigurationFlag r3) {
        /*
            r2 = this;
            com.google.firebase.perf.util.ImmutableBundle r0 = r2.b
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f15720a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
            return r3
        L1e:
            android.os.Bundle r0 = r0.f15720a
            java.lang.Object r0 = r0.get(r3)
            if (r0 != 0) goto L2c
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
            return r3
        L2c:
            boolean r1 = r0 instanceof java.lang.Float
            if (r1 == 0) goto L40
            java.lang.Float r0 = (java.lang.Float) r0
            double r0 = r0.doubleValue()
            java.lang.Double r3 = java.lang.Double.valueOf(r0)
            com.google.firebase.perf.util.Optional r0 = new com.google.firebase.perf.util.Optional
            r0.<init>(r3)
            return r0
        L40:
            boolean r1 = r0 instanceof java.lang.Double
            if (r1 == 0) goto L4c
            java.lang.Double r0 = (java.lang.Double) r0
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>(r0)
            return r3
        L4c:
            com.google.firebase.perf.logging.AndroidLogger r0 = com.google.firebase.perf.util.ImmutableBundle.b
            java.lang.String r1 = "Metadata key %s contains type other than double: %s"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0.b(r1, r3)
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.ConfigResolver.i(com.google.firebase.perf.config.ConfigurationFlag):com.google.firebase.perf.util.Optional");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.os.BaseBundle, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.google.firebase.perf.util.Optional] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.firebase.perf.util.Optional] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.google.firebase.perf.util.Optional] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.firebase.perf.util.Optional j(com.google.firebase.perf.config.ConfigurationFlag r3) {
        /*
            r2 = this;
            com.google.firebase.perf.util.ImmutableBundle r0 = r2.b
            java.lang.String r3 = r3.b()
            if (r3 == 0) goto L12
            android.os.Bundle r1 = r0.f15720a
            boolean r1 = r1.containsKey(r3)
            if (r1 == 0) goto L15
            r1 = 1
            goto L16
        L12:
            r0.getClass()
        L15:
            r1 = 0
        L16:
            if (r1 != 0) goto L1e
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
            goto L4b
        L1e:
            android.os.Bundle r0 = r0.f15720a     // Catch: java.lang.ClassCastException -> L36
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.ClassCastException -> L36
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.ClassCastException -> L36
            if (r0 != 0) goto L2f
            com.google.firebase.perf.util.Optional r0 = new com.google.firebase.perf.util.Optional     // Catch: java.lang.ClassCastException -> L36
            r0.<init>()     // Catch: java.lang.ClassCastException -> L36
            r3 = r0
            goto L4b
        L2f:
            com.google.firebase.perf.util.Optional r1 = new com.google.firebase.perf.util.Optional     // Catch: java.lang.ClassCastException -> L36
            r1.<init>(r0)     // Catch: java.lang.ClassCastException -> L36
            r3 = r1
            goto L4b
        L36:
            r0 = move-exception
            com.google.firebase.perf.logging.AndroidLogger r1 = com.google.firebase.perf.util.ImmutableBundle.b
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Metadata key %s contains type other than int: %s"
            r1.b(r0, r3)
            com.google.firebase.perf.util.Optional r3 = new com.google.firebase.perf.util.Optional
            r3.<init>()
        L4b:
            boolean r0 = r3.b()
            if (r0 == 0) goto L66
            java.lang.Object r3 = r3.a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            long r0 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            com.google.firebase.perf.util.Optional r0 = new com.google.firebase.perf.util.Optional
            r0.<init>(r3)
            goto L6b
        L66:
            com.google.firebase.perf.util.Optional r0 = new com.google.firebase.perf.util.Optional
            r0.<init>()
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.ConfigResolver.j(com.google.firebase.perf.config.ConfigurationFlag):com.google.firebase.perf.util.Optional");
    }

    public final long k() {
        ConfigurationConstants.RateLimitSec rateLimitSec;
        synchronized (ConfigurationConstants.RateLimitSec.class) {
            try {
                if (ConfigurationConstants.RateLimitSec.f15679a == null) {
                    ConfigurationConstants.RateLimitSec.f15679a = new ConfigurationConstants.RateLimitSec();
                }
                rateLimitSec = ConfigurationConstants.RateLimitSec.f15679a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Optional optionalM = m(rateLimitSec);
        if (optionalM.b() && ((Long) optionalM.a()).longValue() > 0) {
            this.c.e(((Long) optionalM.a()).longValue(), "com.google.firebase.perf.TimeLimitSec");
            return ((Long) optionalM.a()).longValue();
        }
        Optional optionalC = c(rateLimitSec);
        if (!optionalC.b() || ((Long) optionalC.a()).longValue() <= 0) {
            return 600L;
        }
        return ((Long) optionalC.a()).longValue();
    }

    public final Optional l(ConfigurationFlag configurationFlag) {
        return this.f15670a.getDouble(configurationFlag.c());
    }

    public final Optional m(ConfigurationFlag configurationFlag) {
        return this.f15670a.getLong(configurationFlag.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Le
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto Le0
        Le:
            java.lang.Class<com.google.firebase.perf.config.ConfigurationConstants$SdkEnabled> r0 = com.google.firebase.perf.config.ConfigurationConstants.SdkEnabled.class
            monitor-enter(r0)
            com.google.firebase.perf.config.ConfigurationConstants$SdkEnabled r3 = com.google.firebase.perf.config.ConfigurationConstants.SdkEnabled.f15681a     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L20
            com.google.firebase.perf.config.ConfigurationConstants$SdkEnabled r3 = new com.google.firebase.perf.config.ConfigurationConstants$SdkEnabled     // Catch: java.lang.Throwable -> L1d
            r3.<init>()     // Catch: java.lang.Throwable -> L1d
            com.google.firebase.perf.config.ConfigurationConstants.SdkEnabled.f15681a = r3     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r1 = move-exception
            goto Le1
        L20:
            com.google.firebase.perf.config.ConfigurationConstants$SdkEnabled r3 = com.google.firebase.perf.config.ConfigurationConstants.SdkEnabled.f15681a     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            com.google.firebase.perf.util.Optional r0 = r6.a(r3)
            com.google.firebase.perf.config.RemoteConfigManager r3 = r6.f15670a
            java.lang.String r4 = "fpr_enabled"
            com.google.firebase.perf.util.Optional r3 = r3.getBoolean(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto L61
            com.google.firebase.perf.config.RemoteConfigManager r4 = r6.f15670a
            boolean r4 = r4.isLastFetchFailed()
            if (r4 == 0) goto L3f
            r0 = r1
            goto L73
        L3f:
            java.lang.Object r3 = r3.a()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r4 = r0.b()
            if (r4 == 0) goto L51
            java.lang.Object r0 = r0.a()
            if (r0 == r3) goto L5c
        L51:
            com.google.firebase.perf.config.DeviceCacheManager r0 = r6.c
            java.lang.String r4 = "com.google.firebase.perf.SdkEnabled"
            boolean r5 = r3.booleanValue()
            r0.g(r4, r5)
        L5c:
            boolean r0 = r3.booleanValue()
            goto L73
        L61:
            boolean r3 = r0.b()
            if (r3 == 0) goto L72
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L73
        L72:
            r0 = r2
        L73:
            if (r0 == 0) goto Ldc
            java.lang.Class<com.google.firebase.perf.config.ConfigurationConstants$SdkDisabledVersions> r0 = com.google.firebase.perf.config.ConfigurationConstants.SdkDisabledVersions.class
            monitor-enter(r0)
            com.google.firebase.perf.config.ConfigurationConstants$SdkDisabledVersions r3 = com.google.firebase.perf.config.ConfigurationConstants.SdkDisabledVersions.f15680a     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L86
            com.google.firebase.perf.config.ConfigurationConstants$SdkDisabledVersions r3 = new com.google.firebase.perf.config.ConfigurationConstants$SdkDisabledVersions     // Catch: java.lang.Throwable -> L84
            r3.<init>()     // Catch: java.lang.Throwable -> L84
            com.google.firebase.perf.config.ConfigurationConstants.SdkDisabledVersions.f15680a = r3     // Catch: java.lang.Throwable -> L84
            goto L86
        L84:
            r1 = move-exception
            goto Lda
        L86:
            com.google.firebase.perf.config.ConfigurationConstants$SdkDisabledVersions r3 = com.google.firebase.perf.config.ConfigurationConstants.SdkDisabledVersions.f15680a     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)
            com.google.firebase.perf.util.Optional r0 = r6.d(r3)
            com.google.firebase.perf.config.RemoteConfigManager r3 = r6.f15670a
            java.lang.String r4 = "fpr_disabled_android_versions"
            com.google.firebase.perf.util.Optional r3 = r3.getString(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto Lbf
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r0.b()
            if (r4 == 0) goto Lb3
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto Lba
        Lb3:
            com.google.firebase.perf.config.DeviceCacheManager r0 = r6.c
            java.lang.String r4 = "com.google.firebase.perf.SdkDisabledVersions"
            r0.f(r4, r3)
        Lba:
            boolean r0 = o(r3)
            goto Ld6
        Lbf:
            boolean r3 = r0.b()
            if (r3 == 0) goto Ld0
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = o(r0)
            goto Ld6
        Ld0:
            java.lang.String r0 = ""
            boolean r0 = o(r0)
        Ld6:
            if (r0 != 0) goto Ldc
            r0 = r2
            goto Ldd
        Lda:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            throw r1
        Ldc:
            r0 = r1
        Ldd:
            if (r0 == 0) goto Le0
            return r2
        Le0:
            return r1
        Le1:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.ConfigResolver.q():boolean");
    }
}
