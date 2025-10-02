package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class Charsets {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f14860a = StandardCharsets.US_ASCII;
    public static final Charset b;

    static {
        Charset charset = StandardCharsets.ISO_8859_1;
        b = StandardCharsets.UTF_8;
        Charset charset2 = StandardCharsets.UTF_16BE;
        Charset charset3 = StandardCharsets.UTF_16LE;
        Charset charset4 = StandardCharsets.UTF_16;
    }
}
