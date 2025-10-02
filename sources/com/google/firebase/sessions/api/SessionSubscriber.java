package com.google.firebase.sessions.api;

import androidx.camera.core.impl.b;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber;", "", "Name", "SessionDetails", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SessionSubscriber {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Name {
        public static final Name d;
        public static final Name e;
        public static final /* synthetic */ Name[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            Name name = new Name("CRASHLYTICS", 0);
            d = name;
            Name name2 = new Name("PERFORMANCE", 1);
            e = name2;
            Name[] nameArr = {name, name2, new Name("MATT_SAYS_HI", 2)};
            f = nameArr;
            g = EnumEntriesKt.a(nameArr);
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) f.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/api/SessionSubscriber$SessionDetails;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SessionDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f15834a;

        public SessionDetails(String sessionId) {
            Intrinsics.h(sessionId, "sessionId");
            this.f15834a = sessionId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SessionDetails) && Intrinsics.c(this.f15834a, ((SessionDetails) obj).f15834a);
        }

        public final int hashCode() {
            return this.f15834a.hashCode();
        }

        public final String toString() {
            return b.r(new StringBuilder("SessionDetails(sessionId="), this.f15834a, ')');
        }
    }

    boolean a();

    void b();

    void c(SessionDetails sessionDetails);
}
