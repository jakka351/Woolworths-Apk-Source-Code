package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import com.bumptech.glide.load.engine.cache.DiskLruCacheFactory;
import java.io.File;

/* loaded from: classes4.dex */
public final class ExternalPreferredCacheDiskCacheFactory extends DiskLruCacheFactory {
    public ExternalPreferredCacheDiskCacheFactory(final Context context) {
        super(new DiskLruCacheFactory.CacheDirectoryGetter() { // from class: com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory.1
            @Override // com.bumptech.glide.load.engine.cache.DiskLruCacheFactory.CacheDirectoryGetter
            public final File a() {
                File externalCacheDir;
                Context context2 = context;
                File cacheDir = context2.getCacheDir();
                File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                return ((file == null || !file.exists()) && (externalCacheDir = context2.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? new File(externalCacheDir, "image_manager_disk_cache") : file;
            }
        }, 262144000L);
    }
}
