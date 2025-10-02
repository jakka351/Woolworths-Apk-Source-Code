package com.swrve.sdk.localstorage;

import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public interface LocalStorage {
    SwrveCacheItem a(String str, String str2);

    void b(String str, String str2, String str3);

    long c(String str, String str2);

    void d(String str, String str2, String str3, String str4);

    void e(String str, Set set);

    LinkedHashMap f(Integer num, String str);
}
