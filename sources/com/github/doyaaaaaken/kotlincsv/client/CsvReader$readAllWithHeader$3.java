package com.github.doyaaaaaken.kotlincsv.client;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "", "", "Lcom/github/doyaaaaaken/kotlincsv/client/CsvFileReader;", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
final class CsvReader$readAllWithHeader$3 extends Lambda implements Function1<CsvFileReader, List<? extends Map<String, ? extends String>>> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CsvFileReader open = (CsvFileReader) obj;
        Intrinsics.h(open, "$this$open");
        return SequencesKt.x(open.b());
    }
}
