package com.adobe.marketing.mobile.services.caching;

import java.io.FileInputStream;
import java.util.Map;

/* loaded from: classes.dex */
public interface CacheResult {
    FileInputStream getData();

    Map getMetadata();
}
