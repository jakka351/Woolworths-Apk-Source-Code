package com.adobe.marketing.mobile.rulesengine;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public class TemplateParser {

    /* renamed from: a, reason: collision with root package name */
    public static final DelimiterPair f13225a = new DelimiterPair("{{", "}}");

    /* renamed from: com.adobe.marketing.mobile.rulesengine.TemplateParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13226a;

        static {
            int[] iArr = new int[State.values().length];
            f13226a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13226a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13226a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static ArrayList a(String str, DelimiterPair delimiterPair) {
        int iIndexOf;
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.isEmpty()) {
            String str2 = delimiterPair.b;
            String str3 = delimiterPair.f13213a;
            int length = str.length();
            Parser parser = new Parser();
            int i = 0;
            parser.f13219a = 0;
            State state = State.d;
            parser.b = state;
            while (i < length) {
                int iOrdinal = parser.b.ordinal();
                State state2 = State.f;
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2 && str.substring(i).startsWith(str2)) {
                            arrayList.add(new SegmentToken(str.substring(str3.length() + parser.f13219a, i)));
                            parser.b = state;
                            iIndexOf = str.indexOf(str2, i);
                            i = iIndexOf + 1;
                        }
                    } else if (str.substring(i).startsWith(str3)) {
                        int i2 = parser.f13219a;
                        if (i2 != i) {
                            arrayList.add(new SegmentText(str.substring(i2, i)));
                        }
                        parser.b = state2;
                        parser.f13219a = i;
                        iIndexOf = str.indexOf(str3, i);
                        i = iIndexOf + 1;
                    }
                } else if (str.substring(i).startsWith(str3)) {
                    parser.b = state2;
                    parser.f13219a = i;
                    iIndexOf = str.indexOf(str3, i);
                    i = iIndexOf + 1;
                } else {
                    parser.b = State.e;
                    parser.f13219a = i;
                }
                i++;
            }
            int iOrdinal2 = parser.b.ordinal();
            if (iOrdinal2 == 1) {
                arrayList.add(new SegmentText(str.substring(parser.f13219a, i)));
            } else if (iOrdinal2 == 2) {
                return new ArrayList();
            }
        }
        return arrayList;
    }
}
