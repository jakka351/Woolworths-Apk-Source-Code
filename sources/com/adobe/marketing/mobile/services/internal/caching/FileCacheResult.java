package com.adobe.marketing.mobile.services.internal.caching;

import com.adobe.marketing.mobile.services.caching.CacheResult;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
class FileCacheResult implements CacheResult {

    /* renamed from: a, reason: collision with root package name */
    public final File f13245a;
    public final HashMap b;

    public FileCacheResult(File file, HashMap map) {
        this.f13245a = file;
        this.b = map;
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheResult
    public final FileInputStream getData() {
        try {
            return new FileInputStream(this.f13245a);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adobe.marketing.mobile.services.caching.CacheResult
    public final Map getMetadata() {
        return this.b;
    }
}
