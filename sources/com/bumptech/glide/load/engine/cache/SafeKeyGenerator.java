package com.bumptech.glide.load.engine.cache;

import androidx.core.util.Pools;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import com.bumptech.glide.util.pool.FactoryPools;
import com.bumptech.glide.util.pool.StateVerifier;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class SafeKeyGenerator {

    /* renamed from: a, reason: collision with root package name */
    public final LruCache f13840a = new LruCache(1000);
    public final Pools.Pool b = FactoryPools.a(10, new AnonymousClass1());

    /* renamed from: com.bumptech.glide.load.engine.cache.SafeKeyGenerator$1, reason: invalid class name */
    public class AnonymousClass1 implements FactoryPools.Factory<PoolableDigestContainer> {
        @Override // com.bumptech.glide.util.pool.FactoryPools.Factory
        public final Object create() {
            try {
                return new PoolableDigestContainer(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static final class PoolableDigestContainer implements FactoryPools.Poolable {
        public final MessageDigest d;
        public final StateVerifier e = StateVerifier.a();

        public PoolableDigestContainer(MessageDigest messageDigest) {
            this.d = messageDigest;
        }

        @Override // com.bumptech.glide.util.pool.FactoryPools.Poolable
        public final StateVerifier c() {
            return this.e;
        }
    }

    public final String a(Key key) {
        String str;
        synchronized (this.f13840a) {
            str = (String) this.f13840a.g(key);
        }
        if (str == null) {
            Object objA = this.b.a();
            Preconditions.c(objA, "Argument must not be null");
            PoolableDigestContainer poolableDigestContainer = (PoolableDigestContainer) objA;
            try {
                key.updateDiskCacheKey(poolableDigestContainer.d);
                byte[] bArrDigest = poolableDigestContainer.d.digest();
                char[] cArr = Util.b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b = bArrDigest[i];
                        int i2 = i * 2;
                        char[] cArr2 = Util.f13989a;
                        cArr[i2] = cArr2[(b & 255) >>> 4];
                        cArr[i2 + 1] = cArr2[b & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                this.b.b(poolableDigestContainer);
            }
        }
        synchronized (this.f13840a) {
            this.f13840a.j(key, str);
        }
        return str;
    }
}
