package com.bumptech.glide.load;

import YU.a;
import android.text.TextUtils;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class Option<T> {
    public static final CacheKeyUpdater e = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final Object f13782a;
    public final CacheKeyUpdater b;
    public final String c;
    public volatile byte[] d;

    /* renamed from: com.bumptech.glide.load.Option$1, reason: invalid class name */
    public class AnonymousClass1 implements CacheKeyUpdater<Object> {
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface CacheKeyUpdater<T> {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public Option(String str, Object obj, CacheKeyUpdater cacheKeyUpdater) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.c = str;
        this.f13782a = obj;
        this.b = cacheKeyUpdater;
    }

    public static Option a(Object obj, String str) {
        return new Option(str, obj, e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.c.equals(((Option) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return a.o(new StringBuilder("Option{key='"), this.c, "'}");
    }
}
