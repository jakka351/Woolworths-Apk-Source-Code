package androidx.work;

import java.util.HashSet;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/work/WorkInfo;", "", "Companion", "PeriodicityInfo", "State", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkInfo {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f3908a;
    public final State b;
    public final HashSet c;
    public final Data d;
    public final Data e;
    public final int f;
    public final int g;
    public final Constraints h;
    public final long i;
    public final PeriodicityInfo j;
    public final long k;
    public final int l;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004¨\u0006\u0016"}, d2 = {"Landroidx/work/WorkInfo$Companion;", "", "", "STOP_REASON_APP_STANDBY", "I", "STOP_REASON_BACKGROUND_RESTRICTION", "STOP_REASON_CANCELLED_BY_APP", "STOP_REASON_CONSTRAINT_BATTERY_NOT_LOW", "STOP_REASON_CONSTRAINT_CHARGING", "STOP_REASON_CONSTRAINT_CONNECTIVITY", "STOP_REASON_CONSTRAINT_DEVICE_IDLE", "STOP_REASON_CONSTRAINT_STORAGE_NOT_LOW", "STOP_REASON_DEVICE_STATE", "STOP_REASON_ESTIMATED_APP_LAUNCH_TIME_CHANGED", "STOP_REASON_FOREGROUND_SERVICE_TIMEOUT", "STOP_REASON_NOT_STOPPED", "STOP_REASON_PREEMPT", "STOP_REASON_QUOTA", "STOP_REASON_SYSTEM_PROCESSING", "STOP_REASON_TIMEOUT", "STOP_REASON_UNKNOWN", "STOP_REASON_USER", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkInfo$PeriodicityInfo;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PeriodicityInfo {

        /* renamed from: a, reason: collision with root package name */
        public final long f3909a;
        public final long b;

        public PeriodicityInfo(long j, long j2) {
            this.f3909a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PeriodicityInfo.class.equals(obj.getClass())) {
                PeriodicityInfo periodicityInfo = (PeriodicityInfo) obj;
                if (periodicityInfo.f3909a == this.f3909a && periodicityInfo.b == this.b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.f3909a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PeriodicityInfo{repeatIntervalMillis=");
            sb.append(this.f3909a);
            sb.append(", flexIntervalMillis=");
            return androidx.camera.core.impl.b.q(sb, this.b, '}');
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/WorkInfo$State;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class State {
        public static final State d;
        public static final State e;
        public static final State f;
        public static final State g;
        public static final State h;
        public static final State i;
        public static final /* synthetic */ State[] j;

        static {
            State state = new State("ENQUEUED", 0);
            d = state;
            State state2 = new State("RUNNING", 1);
            e = state2;
            State state3 = new State("SUCCEEDED", 2);
            f = state3;
            State state4 = new State("FAILED", 3);
            g = state4;
            State state5 = new State("BLOCKED", 4);
            h = state5;
            State state6 = new State("CANCELLED", 5);
            i = state6;
            j = new State[]{state, state2, state3, state4, state5, state6};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) j.clone();
        }

        public final boolean a() {
            return this == f || this == g || this == i;
        }
    }

    public WorkInfo(UUID uuid, State state, HashSet hashSet, Data outputData, Data progress, int i, int i2, Constraints constraints, long j, PeriodicityInfo periodicityInfo, long j2, int i3) {
        Intrinsics.h(state, "state");
        Intrinsics.h(outputData, "outputData");
        Intrinsics.h(progress, "progress");
        this.f3908a = uuid;
        this.b = state;
        this.c = hashSet;
        this.d = outputData;
        this.e = progress;
        this.f = i;
        this.g = i2;
        this.h = constraints;
        this.i = j;
        this.j = periodicityInfo;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !WorkInfo.class.equals(obj.getClass())) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.f == workInfo.f && this.g == workInfo.g && this.f3908a.equals(workInfo.f3908a) && this.b == workInfo.b && Intrinsics.c(this.d, workInfo.d) && this.h.equals(workInfo.h) && this.i == workInfo.i && Intrinsics.c(this.j, workInfo.j) && this.k == workInfo.k && this.l == workInfo.l && this.c.equals(workInfo.c)) {
            return Intrinsics.c(this.e, workInfo.e);
        }
        return false;
    }

    public final int hashCode() {
        int iB = androidx.camera.core.impl.b.b((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.f3908a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        PeriodicityInfo periodicityInfo = this.j;
        return Integer.hashCode(this.l) + androidx.camera.core.impl.b.b((iB + (periodicityInfo != null ? periodicityInfo.hashCode() : 0)) * 31, 31, this.k);
    }

    public final String toString() {
        return "WorkInfo{id='" + this.f3908a + "', state=" + this.b + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
