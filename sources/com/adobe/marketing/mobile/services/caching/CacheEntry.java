package com.adobe.marketing.mobile.services.caching;

import java.io.ByteArrayInputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class CacheEntry {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayInputStream f13242a;
    public final HashMap b;

    public CacheEntry(ByteArrayInputStream byteArrayInputStream, CacheExpiry cacheExpiry, Map map) {
        this.f13242a = byteArrayInputStream;
        this.b = map == null ? new HashMap() : new HashMap(map);
    }
}
