package com.google.firebase.messaging.reporting;

/* loaded from: classes6.dex */
public final class MessagingClientEventExtension {

    /* renamed from: a, reason: collision with root package name */
    public final MessagingClientEvent f15663a;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public MessagingClientEvent f15664a = null;

        public final MessagingClientEventExtension a() {
            return new MessagingClientEventExtension(this.f15664a);
        }

        public final void b(MessagingClientEvent messagingClientEvent) {
            this.f15664a = messagingClientEvent;
        }
    }

    static {
        new Builder().a();
    }

    public MessagingClientEventExtension(MessagingClientEvent messagingClientEvent) {
        this.f15663a = messagingClientEvent;
    }

    public static Builder a() {
        return new Builder();
    }
}
