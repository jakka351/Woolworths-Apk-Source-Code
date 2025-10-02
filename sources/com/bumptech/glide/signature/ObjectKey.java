package com.bumptech.glide.signature;

import android.support.v4.media.session.a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class ObjectKey implements Key {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13980a;

    public ObjectKey(Object obj) {
        Preconditions.c(obj, "Argument must not be null");
        this.f13980a = obj;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.f13980a.equals(((ObjectKey) obj).f13980a);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return this.f13980a.hashCode();
    }

    public final String toString() {
        return a.s(new StringBuilder("ObjectKey{object="), this.f13980a, '}');
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(this.f13980a.toString().getBytes(Key.b));
    }
}
