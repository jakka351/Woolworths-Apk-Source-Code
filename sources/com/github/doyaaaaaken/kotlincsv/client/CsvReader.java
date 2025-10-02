package com.github.doyaaaaaken.kotlincsv.client;

import com.github.doyaaaaaken.kotlincsv.dsl.context.CsvReaderContext;
import com.github.doyaaaaaken.kotlincsv.dsl.context.ICsvReaderContext;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/client/CsvReader;", "Lcom/github/doyaaaaaken/kotlincsv/dsl/context/ICsvReaderContext;", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CsvReader implements ICsvReaderContext {

    /* renamed from: a, reason: collision with root package name */
    public final CsvReaderContext f14346a = new CsvReaderContext();
    public final Charset b = Charset.forName("UTF-8");

    public final List a(String data) {
        Intrinsics.h(data, "data");
        Charset charsetCode = this.b;
        Intrinsics.g(charsetCode, "charsetCode");
        byte[] bytes = data.getBytes(charsetCode);
        Intrinsics.g(bytes, "this as java.lang.String).getBytes(charset)");
        ReaderJvmImpl readerJvmImpl = new ReaderJvmImpl(new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bytes), charsetCode), 8192));
        CsvReader$readAllWithHeader$1 csvReader$readAllWithHeader$1 = CsvReader$readAllWithHeader$1.h;
        CsvFileReader csvFileReader = new CsvFileReader(this.f14346a, readerJvmImpl);
        BufferedLineReader bufferedLineReader = csvFileReader.b;
        try {
            Object objInvoke = csvReader$readAllWithHeader$1.invoke(csvFileReader);
            bufferedLineReader.f14344a.close();
            return (List) objInvoke;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedLineReader.f14344a.close();
                } catch (Throwable th3) {
                    ExceptionsKt.a(th, th3);
                }
                throw th2;
            }
        }
    }
}
