package com.github.doyaaaaaken.kotlincsv.client;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/client/BufferedLineReader;", "", "Companion", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BufferedLineReader {

    /* renamed from: a, reason: collision with root package name */
    public final Reader f14344a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/client/BufferedLineReader$Companion;", "", "", "BOM", "C", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
    }

    public BufferedLineReader(Reader br) {
        Intrinsics.h(br, "br");
        this.f14344a = br;
    }
}
