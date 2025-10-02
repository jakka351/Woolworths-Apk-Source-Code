package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.config.ConfigurationConstants;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.PerfSession;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new AnonymousClass1();
    public final String d;
    public final Timer e;
    public boolean f;

    /* renamed from: com.google.firebase.perf.session.PerfSession$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<PerfSession> {
        @Override // android.os.Parcelable.Creator
        public final PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    public PerfSession(String str, Clock clock) {
        this.f = false;
        this.d = str;
        this.e = new Timer();
    }

    public static com.google.firebase.perf.v1.PerfSession[] b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        com.google.firebase.perf.v1.PerfSession[] perfSessionArr = new com.google.firebase.perf.v1.PerfSession[list.size()];
        com.google.firebase.perf.v1.PerfSession perfSessionA = ((PerfSession) list.get(0)).a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            com.google.firebase.perf.v1.PerfSession perfSessionA2 = ((PerfSession) list.get(i)).a();
            if (z || !((PerfSession) list.get(i)).f) {
                perfSessionArr[i] = perfSessionA2;
            } else {
                perfSessionArr[0] = perfSessionA2;
                perfSessionArr[i] = perfSessionA;
                z = true;
            }
        }
        if (!z) {
            perfSessionArr[0] = perfSessionA;
        }
        return perfSessionArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.firebase.perf.session.PerfSession c(java.lang.String r9) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)
            com.google.firebase.perf.session.PerfSession r0 = new com.google.firebase.perf.session.PerfSession
            com.google.firebase.perf.util.Clock r1 = new com.google.firebase.perf.util.Clock
            r1.<init>()
            r0.<init>(r9, r1)
            com.google.firebase.perf.config.ConfigResolver r9 = com.google.firebase.perf.config.ConfigResolver.e()
            boolean r1 = r9.q()
            if (r1 == 0) goto Lce
            double r1 = java.lang.Math.random()
            java.lang.Class<com.google.firebase.perf.config.ConfigurationConstants$SessionsSamplingRate> r3 = com.google.firebase.perf.config.ConfigurationConstants.SessionsSamplingRate.class
            monitor-enter(r3)
            com.google.firebase.perf.config.ConfigurationConstants$SessionsSamplingRate r4 = com.google.firebase.perf.config.ConfigurationConstants.SessionsSamplingRate.f15687a     // Catch: java.lang.Throwable -> L2f
            if (r4 != 0) goto L32
            com.google.firebase.perf.config.ConfigurationConstants$SessionsSamplingRate r4 = new com.google.firebase.perf.config.ConfigurationConstants$SessionsSamplingRate     // Catch: java.lang.Throwable -> L2f
            r4.<init>()     // Catch: java.lang.Throwable -> L2f
            com.google.firebase.perf.config.ConfigurationConstants.SessionsSamplingRate.f15687a = r4     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            r9 = move-exception
            goto Lcc
        L32:
            com.google.firebase.perf.config.ConfigurationConstants$SessionsSamplingRate r4 = com.google.firebase.perf.config.ConfigurationConstants.SessionsSamplingRate.f15687a     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r3)
            com.google.firebase.perf.util.Optional r3 = r9.i(r4)
            boolean r5 = r3.b()
            if (r5 == 0) goto L54
            java.lang.Object r3 = r3.a()
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r5 = r5 / r7
            boolean r3 = com.google.firebase.perf.config.ConfigResolver.r(r5)
            if (r3 == 0) goto L54
            goto Lc6
        L54:
            com.google.firebase.perf.config.RemoteConfigManager r3 = r9.f15670a
            java.lang.String r5 = "fpr_vc_session_sampling_rate"
            com.google.firebase.perf.util.Optional r3 = r3.getDouble(r5)
            boolean r5 = r3.b()
            if (r5 == 0) goto L8e
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            boolean r5 = com.google.firebase.perf.config.ConfigResolver.r(r5)
            if (r5 == 0) goto L8e
            com.google.firebase.perf.config.DeviceCacheManager r9 = r9.c
            java.lang.String r4 = "com.google.firebase.perf.SessionSamplingRate"
            java.lang.Object r5 = r3.a()
            java.lang.Double r5 = (java.lang.Double) r5
            double r5 = r5.doubleValue()
            r9.d(r5, r4)
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc6
        L8e:
            com.google.firebase.perf.util.Optional r3 = r9.b(r4)
            boolean r4 = r3.b()
            if (r4 == 0) goto Lb3
            java.lang.Object r4 = r3.a()
            java.lang.Double r4 = (java.lang.Double) r4
            double r4 = r4.doubleValue()
            boolean r4 = com.google.firebase.perf.config.ConfigResolver.r(r4)
            if (r4 == 0) goto Lb3
            java.lang.Object r9 = r3.a()
            java.lang.Double r9 = (java.lang.Double) r9
            double r5 = r9.doubleValue()
            goto Lc6
        Lb3:
            com.google.firebase.perf.config.RemoteConfigManager r9 = r9.f15670a
            boolean r9 = r9.isLastFetchFailed()
            if (r9 == 0) goto Lc1
            r5 = 4532020583610935537(0x3ee4f8b588e368f1, double:1.0E-5)
            goto Lc6
        Lc1:
            r5 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
        Lc6:
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 >= 0) goto Lce
            r9 = 1
            goto Lcf
        Lcc:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2f
            throw r9
        Lce:
            r9 = 0
        Lcf:
            r0.f = r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.PerfSession.c(java.lang.String):com.google.firebase.perf.session.PerfSession");
    }

    public final com.google.firebase.perf.v1.PerfSession a() {
        PerfSession.Builder builderP = com.google.firebase.perf.v1.PerfSession.P();
        builderP.p();
        com.google.firebase.perf.v1.PerfSession.L((com.google.firebase.perf.v1.PerfSession) builderP.e, this.d);
        if (this.f) {
            builderP.p();
            com.google.firebase.perf.v1.PerfSession.M((com.google.firebase.perf.v1.PerfSession) builderP.e);
        }
        return (com.google.firebase.perf.v1.PerfSession) builderP.m();
    }

    public final boolean d() {
        ConfigurationConstants.SessionsMaxDurationMinutes sessionsMaxDurationMinutes;
        long jLongValue;
        long minutes = TimeUnit.MICROSECONDS.toMinutes(this.e.a());
        ConfigResolver configResolverE = ConfigResolver.e();
        configResolverE.getClass();
        synchronized (ConfigurationConstants.SessionsMaxDurationMinutes.class) {
            try {
                if (ConfigurationConstants.SessionsMaxDurationMinutes.f15684a == null) {
                    ConfigurationConstants.SessionsMaxDurationMinutes.f15684a = new ConfigurationConstants.SessionsMaxDurationMinutes();
                }
                sessionsMaxDurationMinutes = ConfigurationConstants.SessionsMaxDurationMinutes.f15684a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Optional optionalJ = configResolverE.j(sessionsMaxDurationMinutes);
        if (!optionalJ.b() || ((Long) optionalJ.a()).longValue() <= 0) {
            Optional<Long> optional = configResolverE.f15670a.getLong("fpr_session_max_duration_min");
            if (!optional.b() || ((Long) optional.a()).longValue() <= 0) {
                Optional optionalC = configResolverE.c(sessionsMaxDurationMinutes);
                jLongValue = (!optionalC.b() || ((Long) optionalC.a()).longValue() <= 0) ? 240L : ((Long) optionalC.a()).longValue();
            } else {
                configResolverE.c.e(((Long) optional.a()).longValue(), "com.google.firebase.perf.SessionsMaxDurationMinutes");
                jLongValue = ((Long) optional.a()).longValue();
            }
        } else {
            jLongValue = ((Long) optionalJ.a()).longValue();
        }
        return minutes > jLongValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.e, 0);
    }

    public PerfSession(Parcel parcel) {
        this.f = false;
        this.d = parcel.readString();
        this.f = parcel.readByte() != 0;
        this.e = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
