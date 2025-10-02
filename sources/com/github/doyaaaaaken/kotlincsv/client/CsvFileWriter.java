package com.github.doyaaaaaken.kotlincsv.client;

import com.github.doyaaaaaken.kotlincsv.dsl.context.WriteQuoteMode;
import java.io.Closeable;
import java.io.Flushable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/client/CsvFileWriter;", "Lcom/github/doyaaaaaken/kotlincsv/client/ICsvFileWriter;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CsvFileWriter implements ICsvFileWriter, Closeable, Flushable {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[WriteQuoteMode.values().length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
        }
    }

    @Override // com.github.doyaaaaaken.kotlincsv.client.ICsvFileWriter
    public final void a() {
        throw null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Flushable
    public final void flush() {
        throw null;
    }
}
