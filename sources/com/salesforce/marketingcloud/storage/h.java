package com.salesforce.marketingcloud.storage;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.messages.inbox.InboxMessage;
import java.util.Date;
import java.util.List;

@SuppressLint
/* loaded from: classes6.dex */
public interface h {

    public enum a {
        UNREAD,
        READ,
        DELETED,
        NOT_DELETED
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f17067a;

        @Nullable
        public final String b;

        @Nullable
        public final Date c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public b(@NonNull String str, @Nullable String str2, @Nullable Date date, boolean z, boolean z2, boolean z3) {
            this.f17067a = str;
            this.b = str2;
            this.c = date;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    int a(@NonNull a aVar);

    int a(@NonNull List<String> list);

    @Nullable
    InboxMessage a(@NonNull String str, @NonNull com.salesforce.marketingcloud.util.c cVar);

    @NonNull
    List<InboxMessage> a(@NonNull com.salesforce.marketingcloud.util.c cVar, a aVar);

    void a(@NonNull InboxMessage inboxMessage, @NonNull com.salesforce.marketingcloud.util.c cVar);

    void b();

    void b(@NonNull String[] strArr);

    void c(@NonNull String str);

    void d(@NonNull String str);

    boolean e(@NonNull String str);

    @Nullable
    b f(@NonNull String str);

    int h();

    @NonNull
    List<b> i();

    void j();

    List<InboxMessage> n(@NonNull com.salesforce.marketingcloud.util.c cVar);
}
