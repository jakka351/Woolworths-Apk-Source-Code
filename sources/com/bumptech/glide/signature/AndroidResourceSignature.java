package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public final class AndroidResourceSignature implements Key {

    /* renamed from: a, reason: collision with root package name */
    public final int f13977a;
    public final Key c;

    public AndroidResourceSignature(int i, Key key) {
        this.f13977a = i;
        this.c = key;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof AndroidResourceSignature) {
            AndroidResourceSignature androidResourceSignature = (AndroidResourceSignature) obj;
            if (this.f13977a == androidResourceSignature.f13977a && this.c.equals(androidResourceSignature.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        return Util.i(this.f13977a, this.c);
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        this.c.updateDiskCacheKey(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f13977a).array());
    }
}
