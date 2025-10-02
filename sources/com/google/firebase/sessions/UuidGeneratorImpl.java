package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/UuidGeneratorImpl;", "Lcom/google/firebase/sessions/UuidGenerator;", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UuidGeneratorImpl implements UuidGenerator {

    /* renamed from: a, reason: collision with root package name */
    public static final UuidGeneratorImpl f15830a = new UuidGeneratorImpl();

    @Override // com.google.firebase.sessions.UuidGenerator
    public final UUID next() {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.g(uuidRandomUUID, "randomUUID(...)");
        return uuidRandomUUID;
    }
}
