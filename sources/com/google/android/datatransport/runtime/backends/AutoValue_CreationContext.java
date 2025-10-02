package com.google.android.datatransport.runtime.backends;

import YU.a;
import android.content.Context;
import com.google.android.datatransport.runtime.time.Clock;

/* loaded from: classes.dex */
final class AutoValue_CreationContext extends CreationContext {

    /* renamed from: a, reason: collision with root package name */
    public final Context f14449a;
    public final Clock b;
    public final Clock c;
    public final String d;

    public AutoValue_CreationContext(Context context, Clock clock, Clock clock2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.f14449a = context;
        if (clock == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = clock;
        if (clock2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = clock2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Context a() {
        return this.f14449a;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final String b() {
        return this.d;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock c() {
        return this.c;
    }

    @Override // com.google.android.datatransport.runtime.backends.CreationContext
    public final Clock d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreationContext)) {
            return false;
        }
        CreationContext creationContext = (CreationContext) obj;
        return this.f14449a.equals(creationContext.a()) && this.b.equals(creationContext.d()) && this.c.equals(creationContext.c()) && this.d.equals(creationContext.b());
    }

    public final int hashCode() {
        return ((((((this.f14449a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.f14449a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return a.o(sb, this.d, "}");
    }
}
