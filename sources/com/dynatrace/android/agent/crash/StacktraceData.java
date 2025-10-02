package com.dynatrace.android.agent.crash;

/* loaded from: classes4.dex */
public class StacktraceData {

    /* renamed from: a, reason: collision with root package name */
    public final String f14111a;
    public final String b;
    public final String c;
    public final PlatformType d;

    public StacktraceData(String str, String str2, String str3, PlatformType platformType) {
        this.f14111a = str;
        this.b = str2;
        this.c = str3;
        this.d = platformType;
    }

    public final String a() {
        return this.f14111a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final PlatformType d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            StacktraceData stacktraceData = (StacktraceData) obj;
            String str = stacktraceData.c;
            String str2 = stacktraceData.b;
            String str3 = stacktraceData.f14111a;
            String str4 = this.f14111a;
            if (str4 == null ? str3 != null : !str4.equals(str3)) {
                return false;
            }
            String str5 = this.b;
            if (str5 == null ? str2 != null : !str5.equals(str2)) {
                return false;
            }
            String str6 = this.c;
            if (str6 == null ? str != null : !str6.equals(str)) {
                return false;
            }
            if (this.d == stacktraceData.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f14111a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        PlatformType platformType = this.d;
        return iHashCode3 + (platformType != null ? platformType.hashCode() : 0);
    }

    public final String toString() {
        return "StacktraceData{name='" + this.f14111a + "', reason='" + this.b + "', stacktrace='" + this.c + "', type=" + this.d + '}';
    }
}
