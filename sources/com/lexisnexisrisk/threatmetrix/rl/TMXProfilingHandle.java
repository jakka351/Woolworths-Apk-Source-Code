package com.lexisnexisrisk.threatmetrix.rl;

/* loaded from: classes6.dex */
public interface TMXProfilingHandle {

    public static class Result {
        private final TMXStatusCode q0071q0071qqq;
        private final String qqq0071qqq;

        public Result(String str, TMXStatusCode tMXStatusCode) {
            this.qqq0071qqq = str;
            this.q0071q0071qqq = tMXStatusCode;
        }

        public String getSessionID() {
            return this.qqq0071qqq;
        }

        public TMXStatusCode getStatus() {
            return this.q0071q0071qqq;
        }
    }

    void cancel();

    String getSessionID();

    void sendBehavioSecData();
}
