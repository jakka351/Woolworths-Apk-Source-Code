package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class EmptySignature implements Key {

    /* renamed from: a, reason: collision with root package name */
    public static final EmptySignature f13979a = new EmptySignature();

    public final String toString() {
        return "EmptySignature";
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
    }
}
