package com.google.crypto.tink;

import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.KeysetInfo;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class Util {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f14986a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static KeysetInfo a(Keyset keyset) {
        KeysetInfo.Builder builderNewBuilder = KeysetInfo.newBuilder();
        builderNewBuilder.o(keyset.getPrimaryKeyId());
        for (Keyset.Key key : keyset.getKeyList()) {
            KeysetInfo.KeyInfo.Builder builderNewBuilder2 = KeysetInfo.KeyInfo.newBuilder();
            builderNewBuilder2.q(key.getKeyData().getTypeUrl());
            builderNewBuilder2.p(key.getStatus());
            builderNewBuilder2.o(key.getOutputPrefixType());
            builderNewBuilder2.m(key.getKeyId());
            builderNewBuilder.m((KeysetInfo.KeyInfo) builderNewBuilder2.p1());
        }
        return (KeysetInfo) builderNewBuilder.p1();
    }
}
