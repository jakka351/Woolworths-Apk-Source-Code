package com.bumptech.glide.request;

/* loaded from: classes4.dex */
public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);

        public final boolean d;

        RequestState(boolean z) {
            this.d = z;
        }
    }

    boolean a();

    void b(Request request);

    boolean e(Request request);

    boolean f(Request request);

    void g(Request request);

    RequestCoordinator getRoot();

    boolean i(Request request);
}
