package com.google.android.datatransport.runtime.backends;

import com.google.auto.value.AutoValue;

@AutoValue
/* loaded from: classes.dex */
public abstract class BackendResponse {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Status {
        public static final Status d;
        public static final Status e;
        public static final Status f;
        public static final Status g;
        public static final /* synthetic */ Status[] h;

        static {
            Status status = new Status("OK", 0);
            d = status;
            Status status2 = new Status("TRANSIENT_ERROR", 1);
            e = status2;
            Status status3 = new Status("FATAL_ERROR", 2);
            f = status3;
            Status status4 = new Status("INVALID_PAYLOAD", 3);
            g = status4;
            h = new Status[]{status, status2, status3, status4};
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) h.clone();
        }
    }

    public static BackendResponse a() {
        return new AutoValue_BackendResponse(Status.f, -1L);
    }

    public static BackendResponse d() {
        return new AutoValue_BackendResponse(Status.g, -1L);
    }

    public static BackendResponse e(long j) {
        return new AutoValue_BackendResponse(Status.d, j);
    }

    public static BackendResponse f() {
        return new AutoValue_BackendResponse(Status.e, -1L);
    }

    public abstract long b();

    public abstract Status c();
}
