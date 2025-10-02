package com.google.firebase.heartbeatinfo;

/* loaded from: classes.dex */
public interface HeartBeatInfo {

    public enum HeartBeat {
        NONE(0),
        /* JADX INFO: Fake field, exist only in values array */
        SDK(1),
        GLOBAL(2),
        /* JADX INFO: Fake field, exist only in values array */
        COMBINED(3);

        public final int d;

        HeartBeat(int i) {
            this.d = i;
        }
    }

    HeartBeat b();
}
