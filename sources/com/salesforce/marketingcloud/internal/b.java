package com.salesforce.marketingcloud.internal;

import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f16920a = new a(null);

    public static final class a {
        private a() {
        }

        @JvmStatic
        @Nullable
        public final String a(@NotNull InboxMessage message) {
            Intrinsics.h(message, "message");
            return message.getMessageHash();
        }

        @JvmStatic
        @Nullable
        public final String b(@NotNull InboxMessage message) {
            Intrinsics.h(message, "message");
            return message.getRequestId();
        }

        @JvmStatic
        public final void c(@NotNull InboxMessage message, boolean z) {
            Intrinsics.h(message, "message");
            message.m217read(z);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull InboxMessage message, boolean z) {
            Intrinsics.h(message, "message");
            message.m199deleted(z);
        }

        @JvmStatic
        public final void b(@NotNull InboxMessage message, boolean z) {
            Intrinsics.h(message, "message");
            message.m214dirty(z);
        }

        @JvmStatic
        public final int c(@NotNull InboxMessage message) {
            Intrinsics.h(message, "message");
            return message.getViewCount();
        }
    }

    @JvmStatic
    @Nullable
    public static final String a(@NotNull InboxMessage inboxMessage) {
        return f16920a.a(inboxMessage);
    }

    @JvmStatic
    @Nullable
    public static final String b(@NotNull InboxMessage inboxMessage) {
        return f16920a.b(inboxMessage);
    }

    @JvmStatic
    public static final void c(@NotNull InboxMessage inboxMessage, boolean z) {
        f16920a.c(inboxMessage, z);
    }

    @JvmStatic
    public static final void a(@NotNull InboxMessage inboxMessage, boolean z) {
        f16920a.a(inboxMessage, z);
    }

    @JvmStatic
    public static final void b(@NotNull InboxMessage inboxMessage, boolean z) {
        f16920a.b(inboxMessage, z);
    }

    @JvmStatic
    public static final int c(@NotNull InboxMessage inboxMessage) {
        return f16920a.c(inboxMessage);
    }
}
