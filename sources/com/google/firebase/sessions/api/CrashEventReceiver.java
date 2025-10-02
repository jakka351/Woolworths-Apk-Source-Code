package com.google.firebase.sessions.api;

import com.google.firebase.FirebaseApp;
import com.google.firebase.sessions.FirebaseSessionsComponent;
import com.google.firebase.sessions.SharedSessionRepository;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/api/CrashEventReceiver;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CrashEventReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static SharedSessionRepository f15831a;

    public static final void a() {
        try {
            if (f15831a == null) {
                SharedSessionRepository sharedSessionRepositoryB = ((FirebaseSessionsComponent) FirebaseApp.d().b(FirebaseSessionsComponent.class)).b();
                Intrinsics.h(sharedSessionRepositoryB, "<set-?>");
                f15831a = sharedSessionRepositoryB;
            }
            SharedSessionRepository sharedSessionRepository = f15831a;
            if (sharedSessionRepository == null) {
                Intrinsics.p("sharedSessionRepository");
                throw null;
            }
            if (sharedSessionRepository.b()) {
                SharedSessionRepository sharedSessionRepository2 = f15831a;
                if (sharedSessionRepository2 != null) {
                    sharedSessionRepository2.c();
                } else {
                    Intrinsics.p("sharedSessionRepository");
                    throw null;
                }
            }
        } catch (Exception unused) {
        }
    }
}
