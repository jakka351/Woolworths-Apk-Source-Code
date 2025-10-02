package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.json.JsonGeneratorImpl;
import com.fasterxml.jackson.core.util.Separators;

/* loaded from: classes4.dex */
public interface PrettyPrinter {
    public static final Separators r3 = new Separators();
    public static final SerializedString s3 = new SerializedString(" ");

    void a(JsonGeneratorImpl jsonGeneratorImpl, int i);

    void b(JsonGeneratorImpl jsonGeneratorImpl);

    void c(JsonGenerator jsonGenerator);

    void d(JsonGeneratorImpl jsonGeneratorImpl, int i);

    void f(JsonGeneratorImpl jsonGeneratorImpl);

    void g(JsonGeneratorImpl jsonGeneratorImpl);

    void h(JsonGeneratorImpl jsonGeneratorImpl);

    void i(JsonGeneratorImpl jsonGeneratorImpl);

    void j(JsonGeneratorImpl jsonGeneratorImpl);

    void k(JsonGeneratorImpl jsonGeneratorImpl);
}
