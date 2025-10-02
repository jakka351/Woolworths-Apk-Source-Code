package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

/* loaded from: classes4.dex */
public class MultiTransformation<T> implements Transformation<T> {
    @Override // com.bumptech.glide.load.Transformation
    public final Resource a(Context context, Resource resource, int i, int i2) {
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (obj instanceof MultiTransformation) {
            throw null;
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        throw null;
    }

    @Override // com.bumptech.glide.load.Key
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        throw null;
    }
}
