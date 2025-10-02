package com.google.flatbuffers;

import com.google.flatbuffers.Utf8Old;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements Supplier {
    @Override // java.util.function.Supplier
    public final Object get() {
        int i = Utf8Old.f15912a;
        Utf8Old.Cache cache = new Utf8Old.Cache();
        Charset charset = StandardCharsets.UTF_8;
        charset.newEncoder();
        charset.newDecoder();
        return cache;
    }
}
