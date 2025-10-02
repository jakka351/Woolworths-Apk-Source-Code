package com.swrve.sdk;

/* loaded from: classes.dex */
final class SwrveRunnables {

    /* renamed from: com.swrve.sdk.SwrveRunnables$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        public final /* synthetic */ Runnable d;

        public AnonymousClass1(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.d.run();
            } catch (Exception e) {
                SwrveLogger.c("Error executing runnable: ", e, new Object[0]);
            }
        }
    }
}
