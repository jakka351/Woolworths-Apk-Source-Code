package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
class v4 implements Runnable {
    public void a() {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a();
        } catch (AssertionError | Exception e) {
            a4.c(e.getMessage() != null ? e.getMessage() : "Unknown error occurred");
        }
    }
}
