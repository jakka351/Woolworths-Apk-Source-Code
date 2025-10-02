package com.google.firebase.perf.util;

/* loaded from: classes6.dex */
public class Constants {

    /* loaded from: classes.dex */
    public enum CounterNames {
        /* JADX INFO: Fake field, exist only in values array */
        TRACE_EVENT_RATE_LIMITED("_fstec"),
        /* JADX INFO: Fake field, exist only in values array */
        NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
        /* JADX INFO: Fake field, exist only in values array */
        TRACE_STARTED_NOT_STOPPED("_tsns"),
        /* JADX INFO: Fake field, exist only in values array */
        FRAMES_TOTAL("_fr_tot"),
        /* JADX INFO: Fake field, exist only in values array */
        FRAMES_SLOW("_fr_slo"),
        /* JADX INFO: Fake field, exist only in values array */
        FRAMES_FROZEN("_fr_fzn");

        public final String d;

        CounterNames(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    /* loaded from: classes.dex */
    public enum TraceNames {
        /* JADX INFO: Fake field, exist only in values array */
        APP_START_TRACE_NAME("_as"),
        /* JADX INFO: Fake field, exist only in values array */
        ON_CREATE_TRACE_NAME("_astui"),
        /* JADX INFO: Fake field, exist only in values array */
        ON_START_TRACE_NAME("_astfd"),
        /* JADX INFO: Fake field, exist only in values array */
        ON_RESUME_TRACE_NAME("_asti"),
        /* JADX INFO: Fake field, exist only in values array */
        FOREGROUND_TRACE_NAME("_fs"),
        /* JADX INFO: Fake field, exist only in values array */
        BACKGROUND_TRACE_NAME("_bs");

        public final String d;

        TraceNames(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }
}
