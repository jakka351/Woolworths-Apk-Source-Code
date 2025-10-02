package com.adobe.mobile;

/* loaded from: classes4.dex */
final class PiiQueue extends ThirdPartyQueue {
    public static PiiQueue s;
    public static final Object t = new Object();

    public static PiiQueue q() {
        PiiQueue piiQueue;
        synchronized (t) {
            try {
                if (s == null) {
                    s = new PiiQueue();
                }
                piiQueue = s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return piiQueue;
    }

    @Override // com.adobe.mobile.ThirdPartyQueue
    public final String m() {
        return "ADBMobilePIICache.sqlite";
    }

    @Override // com.adobe.mobile.ThirdPartyQueue
    public final ThirdPartyQueue n() {
        return q();
    }

    @Override // com.adobe.mobile.ThirdPartyQueue
    public final String o() {
        return "PII";
    }
}
