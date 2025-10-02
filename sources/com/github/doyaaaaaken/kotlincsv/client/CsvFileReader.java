package com.github.doyaaaaaken.kotlincsv.client;

import com.github.doyaaaaaken.kotlincsv.dsl.context.CsvReaderContext;
import com.github.doyaaaaaken.kotlincsv.parser.CsvParser;
import com.github.doyaaaaaken.kotlincsv.util.CSVFieldNumDifferentException;
import com.github.doyaaaaaken.kotlincsv.util.MalformedCSVException;
import com.woolworths.scanlibrary.domain.productsearch.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.EmptySequence;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.sequences.TransformingIndexedSequence;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/github/doyaaaaaken/kotlincsv/client/CsvFileReader;", "", "kotlin-csv"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CsvFileReader {

    /* renamed from: a, reason: collision with root package name */
    public final CsvReaderContext f14345a;
    public final BufferedLineReader b;
    public long c;
    public final CsvParser d;

    public CsvFileReader(CsvReaderContext csvReaderContext, ReaderJvmImpl reader) {
        Intrinsics.h(reader, "reader");
        this.f14345a = csvReaderContext;
        this.b = new BufferedLineReader(reader);
        this.d = new CsvParser();
    }

    public final FilteringSequence a(Integer num) {
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.d = num;
        return SequencesKt.h(new TransformingIndexedSequence(SequencesKt.n(new Function0<List<? extends String>>() { // from class: com.github.doyaaaaaken.kotlincsv.client.CsvFileReader$readAllAsSequence$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.c();
            }
        }), new Function2<Integer, List<? extends String>, List<? extends String>>() { // from class: com.github.doyaaaaaken.kotlincsv.client.CsvFileReader$readAllAsSequence$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Number) obj).intValue();
                List row = (List) obj2;
                Intrinsics.h(row, "row");
                Ref.ObjectRef objectRef2 = objectRef;
                if (objectRef2.d == null) {
                    objectRef2.d = Integer.valueOf(row.size());
                }
                Integer num2 = (Integer) objectRef2.d;
                int iIntValue2 = num2 != null ? num2.intValue() : row.size();
                int size = row.size();
                CsvFileReader csvFileReader = this;
                if (size > iIntValue2) {
                    CsvReaderContext csvReaderContext = csvFileReader.f14345a;
                    CsvReaderContext csvReaderContext2 = csvFileReader.f14345a;
                    csvReaderContext.getClass();
                    csvReaderContext2.getClass();
                    csvReaderContext2.getClass();
                    throw new CSVFieldNumDifferentException(iIntValue2, row.size(), iIntValue + 1);
                }
                if (iIntValue2 == row.size()) {
                    return row;
                }
                CsvReaderContext csvReaderContext3 = csvFileReader.f14345a;
                CsvReaderContext csvReaderContext4 = csvFileReader.f14345a;
                csvReaderContext3.getClass();
                csvReaderContext4.getClass();
                csvReaderContext4.getClass();
                throw new CSVFieldNumDifferentException(iIntValue2, row.size(), iIntValue + 1);
            }
        }), new a(26));
    }

    public final Sequence b() {
        String str;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        List listC = c();
        if (listC == null) {
            return EmptySequence.f24658a;
        }
        objectRef.d = listC;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listC.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            str = (String) it.next();
            if (linkedHashSet.contains(str)) {
                break;
            }
            linkedHashSet.add(str);
        }
        if (str == null) {
            return SequencesKt.r(a(Integer.valueOf(((List) objectRef.d).size())), new Function1<List<? extends String>, Map<String, ? extends String>>() { // from class: com.github.doyaaaaaken.kotlincsv.client.CsvFileReader$readAllWithHeaderAsSequence$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List fields = (List) obj;
                    Intrinsics.h(fields, "fields");
                    return MapsKt.p(CollectionsKt.Q0((Iterable) objectRef.d, fields));
                }
            });
        }
        throw new MalformedCSVException(YU.a.h("header '", str, "' is duplicated. please consider to use 'autoRenameDuplicateHeaders' option."));
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List c() {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.doyaaaaaken.kotlincsv.client.CsvFileReader.c():java.util.List");
    }
}
