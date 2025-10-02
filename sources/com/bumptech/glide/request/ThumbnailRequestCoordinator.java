package com.bumptech.glide.request;

import com.bumptech.glide.request.RequestCoordinator;

/* loaded from: classes4.dex */
public class ThumbnailRequestCoordinator implements RequestCoordinator, Request {

    /* renamed from: a, reason: collision with root package name */
    public final RequestCoordinator f13972a;
    public final Object b;
    public volatile SingleRequest c;
    public volatile Request d;
    public RequestCoordinator.RequestState e;
    public RequestCoordinator.RequestState f;
    public boolean g;

    public ThumbnailRequestCoordinator(Object obj, RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.b = obj;
        this.f13972a = requestCoordinator;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, com.bumptech.glide.request.Request
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.a() || this.c.a();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void b(Request request) {
        synchronized (this.b) {
            try {
                if (request.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.f13972a;
                if (requestCoordinator != null) {
                    requestCoordinator.b(this);
                }
                if (!this.f.d) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean c() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.e = requestState;
            this.f = requestState;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean d(Request request) {
        if (!(request instanceof ThumbnailRequestCoordinator)) {
            return false;
        }
        ThumbnailRequestCoordinator thumbnailRequestCoordinator = (ThumbnailRequestCoordinator) request;
        if (this.c == null) {
            if (thumbnailRequestCoordinator.c != null) {
                return false;
            }
        } else if (!this.c.d(thumbnailRequestCoordinator.c)) {
            return false;
        }
        return this.d == null ? thumbnailRequestCoordinator.d == null : this.d.d(thumbnailRequestCoordinator.d);
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean e(Request request) {
        boolean z;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.f13972a;
                z = (requestCoordinator == null || requestCoordinator.e(this)) && request.equals(this.c) && !a();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean f(Request request) {
        boolean z;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.f13972a;
                z = (requestCoordinator == null || requestCoordinator.f(this)) && (request.equals(this.c) || this.e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void g(Request request) {
        synchronized (this.b) {
            try {
                if (!request.equals(this.c)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.f13972a;
                if (requestCoordinator != null) {
                    requestCoordinator.g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.f13972a;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.Request
    public final void h() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f = requestState2;
                            this.d.h();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator.RequestState requestState3 = this.e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.e = requestState4;
                            this.c.h();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean i(Request request) {
        boolean z;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.f13972a;
                z = (requestCoordinator == null || requestCoordinator.i(this)) && request.equals(this.c) && this.e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isComplete() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.Request
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.d) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
                if (!this.e.d) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
