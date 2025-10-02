package com.github.doyaaaaaken.kotlincsv.client;

import java.io.BufferedReader;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/client/ReaderJvmImpl;", "Lcom/github/doyaaaaaken/kotlincsv/client/Reader;", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReaderJvmImpl implements Reader {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f14347a;

    public ReaderJvmImpl(BufferedReader bufferedReader) {
        this.f14347a = bufferedReader;
    }

    @Override // com.github.doyaaaaaken.kotlincsv.client.Reader
    public final void B() throws IOException {
        this.f14347a.mark(1);
    }

    @Override // com.github.doyaaaaaken.kotlincsv.client.Reader
    public final void close() throws IOException {
        this.f14347a.close();
    }

    @Override // com.github.doyaaaaaken.kotlincsv.client.Reader
    public final int read() {
        return this.f14347a.read();
    }

    @Override // com.github.doyaaaaaken.kotlincsv.client.Reader
    public final void reset() throws IOException {
        this.f14347a.reset();
    }
}
