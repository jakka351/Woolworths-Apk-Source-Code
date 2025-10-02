package com.google.firebase.sessions;

import java.util.Locale;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/SessionGenerator;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionGenerator {

    /* renamed from: a, reason: collision with root package name */
    public final TimeProvider f15821a;
    public final UuidGenerator b;

    public SessionGenerator(TimeProvider timeProvider, UuidGenerator uuidGenerator) {
        Intrinsics.h(timeProvider, "timeProvider");
        Intrinsics.h(uuidGenerator, "uuidGenerator");
        this.f15821a = timeProvider;
        this.b = uuidGenerator;
    }

    public final SessionDetails a(SessionDetails sessionDetails) {
        String str;
        String string = this.b.next().toString();
        Intrinsics.g(string, "toString(...)");
        String lowerCase = StringsKt.Q(string, "-", "", false).toLowerCase(Locale.ROOT);
        Intrinsics.g(lowerCase, "toLowerCase(...)");
        return new SessionDetails(this.f15821a.a().b, lowerCase, (sessionDetails == null || (str = sessionDetails.b) == null) ? lowerCase : str, sessionDetails != null ? sessionDetails.c + 1 : 0);
    }
}
