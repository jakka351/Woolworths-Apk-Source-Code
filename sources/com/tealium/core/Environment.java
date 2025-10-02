package com.tealium.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/tealium/core/Environment;", "", "tealiumlibrary_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public enum Environment {
    /* JADX INFO: Fake field, exist only in values array */
    DEV("dev"),
    /* JADX INFO: Fake field, exist only in values array */
    QA("qa"),
    PROD("prod");

    public final String d;

    Environment(String str) {
        this.d = str;
    }
}
