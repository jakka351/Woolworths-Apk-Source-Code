package com.bumptech.glide.signature;

import com.bumptech.glide.load.Key;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class MediaStoreSignature implements Key {
    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        messageDigest.update(ByteBuffer.allocate(12).putLong(0L).putInt(0).array());
        throw null;
    }
}
