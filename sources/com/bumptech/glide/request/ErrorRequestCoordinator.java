package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes4.dex */
public final class ErrorRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13970a;
    public final RequestCoordinator b;
    public volatile Request c;
    public volatile Request d;
    public RequestCoordinator.RequestState e;
    public RequestCoordinator.RequestState f;

    public ErrorRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.f13970a = obj;
        this.b = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public final boolean a() {
        boolean z;
        synchronized (this.f13970a) {
            try {
                z = this.c.a() || this.d.a();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void b(Request request) {
        synchronized (this.f13970a) {
            try {
                if (request.equals(this.c)) {
                    this.e = RequestCoordinator.RequestState.SUCCESS;
                } else if (request.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.b;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean c() {
        boolean z;
        synchronized (this.f13970a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.f13970a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.e = requestState;
                this.c.clear();
                if (this.f != requestState) {
                    this.f = requestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean d(Request request) {
        if (request instanceof ErrorRequestCoordinator) {
            ErrorRequestCoordinator errorRequestCoordinator = (ErrorRequestCoordinator) request;
            if (this.c.d(errorRequestCoordinator.c) && this.d.d(errorRequestCoordinator.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean e(Request request) {
        boolean z;
        RequestCoordinator.RequestState requestState;
        synchronized (this.f13970a) {
            RequestCoordinator requestCoordinator = this.b;
            z = false;
            if (requestCoordinator == null || requestCoordinator.e(this)) {
                RequestCoordinator.RequestState requestState2 = this.e;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3 ? request.equals(this.c) : request.equals(this.d) && ((requestState = this.f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean f(Request request) {
        boolean z;
        synchronized (this.f13970a) {
            RequestCoordinator requestCoordinator = this.b;
            z = requestCoordinator == null || requestCoordinator.f(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void g(Request request) {
        synchronized (this.f13970a) {
            try {
                if (request.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.b;
                    if (requestCoordinator != null) {
                        requestCoordinator.g(this);
                    }
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f = requestState2;
                    this.d.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.f13970a) {
            try {
                RequestCoordinator requestCoordinator = this.b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.Request
    public final void h() {
        synchronized (this.f13970a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.e = requestState2;
                    this.c.h();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean i(Request request) {
        boolean z;
        synchronized (this.f13970a) {
            RequestCoordinator requestCoordinator = this.b;
            z = (requestCoordinator == null || requestCoordinator.i(this)) && request.equals(this.c);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z;
        synchronized (this.f13970a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f13970a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.f13970a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
                if (this.f == requestState2) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
