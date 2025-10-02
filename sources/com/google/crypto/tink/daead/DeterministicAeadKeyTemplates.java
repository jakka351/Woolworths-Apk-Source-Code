package com.google.crypto.tink.daead;

import com.google.crypto.tink.proto.AesSivKeyFormat;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.proto.OutputPrefixType;

@Deprecated
/* loaded from: classes6.dex */
public final class DeterministicAeadKeyTemplates {
    static {
        AesSivKeyFormat.Builder builderNewBuilder = AesSivKeyFormat.newBuilder();
        builderNewBuilder.g();
        ((AesSivKeyFormat) builderNewBuilder.e).setKeySize(64);
        AesSivKeyFormat aesSivKeyFormat = (AesSivKeyFormat) builderNewBuilder.p1();
        KeyTemplate.Builder builderNewBuilder2 = KeyTemplate.newBuilder();
        builderNewBuilder2.p(aesSivKeyFormat.toByteString());
        new AesSivKeyManager();
        builderNewBuilder2.o("type.googleapis.com/google.crypto.tink.AesSivKey");
        builderNewBuilder2.m(OutputPrefixType.TINK);
    }
}
