package com.apollographql.apollo.api.http;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"apollo-api"}, k = 2, mv = {2, 0, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class HttpHeaders {
    public static final String a(String str, List list) {
        Object next;
        Intrinsics.h(list, "<this>");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.y(((HttpHeader) next).f13528a, str, true)) {
                break;
            }
        }
        HttpHeader httpHeader = (HttpHeader) next;
        if (httpHeader != null) {
            return httpHeader.b;
        }
        return null;
    }
}
