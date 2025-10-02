package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.async.ByteBufferFeeder;

/* loaded from: classes4.dex */
public class NonBlockingByteBufferJsonParser extends NonBlockingUtf8JsonParserBase implements ByteBufferFeeder {
    @Override // com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
    public final byte e3() {
        throw null;
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
    public final byte f3() {
        this.r++;
        throw null;
    }

    @Override // com.fasterxml.jackson.core.json.async.NonBlockingUtf8JsonParserBase
    public final int g3() {
        this.r++;
        throw null;
    }
}
