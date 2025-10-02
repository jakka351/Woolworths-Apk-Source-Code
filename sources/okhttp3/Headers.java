package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.text.StringsKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/Headers;", "", "Lkotlin/Pair;", "", "Builder", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class Headers implements Iterable<Pair<? extends String, ? extends String>>, KMappedMarker {
    public static final Companion e = new Companion(0);
    public static final Headers f = new Headers(new String[0]);
    public final String[] d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/Headers$Builder;", "", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f26682a = new ArrayList(20);

        public final void a(String name, String value) {
            Intrinsics.h(name, "name");
            Intrinsics.h(value, "value");
            _HeadersCommonKt.b(name);
            _HeadersCommonKt.c(value, name);
            _HeadersCommonKt.a(this, name, value);
        }

        public final void b(String str) {
            int iB = StringsKt.B(str, ':', 1, 4);
            if (iB != -1) {
                String strSubstring = str.substring(0, iB);
                Intrinsics.g(strSubstring, "substring(...)");
                String strSubstring2 = str.substring(iB + 1);
                Intrinsics.g(strSubstring2, "substring(...)");
                c(strSubstring, strSubstring2);
                return;
            }
            if (str.charAt(0) != ':') {
                c("", str);
                return;
            }
            String strSubstring3 = str.substring(1);
            Intrinsics.g(strSubstring3, "substring(...)");
            c("", strSubstring3);
        }

        public final void c(String name, String value) {
            Intrinsics.h(name, "name");
            Intrinsics.h(value, "value");
            _HeadersCommonKt.a(this, name, value);
        }

        public final void d(String name, String value) {
            Intrinsics.h(name, "name");
            Intrinsics.h(value, "value");
            _HeadersCommonKt.b(name);
            c(name, value);
        }

        public final Headers e() {
            return new Headers((String[]) this.f26682a.toArray(new String[0]));
        }

        public final String f(String name) {
            Intrinsics.h(name, "name");
            ArrayList arrayList = this.f26682a;
            int size = arrayList.size() - 2;
            int iA = ProgressionUtilKt.a(size, 0, -2);
            if (iA > size) {
                return null;
            }
            while (!name.equalsIgnoreCase((String) arrayList.get(size))) {
                if (size == iA) {
                    return null;
                }
                size -= 2;
            }
            return (String) arrayList.get(size + 1);
        }

        public final void g(String name) {
            Intrinsics.h(name, "name");
            int i = 0;
            while (true) {
                ArrayList arrayList = this.f26682a;
                if (i >= arrayList.size()) {
                    return;
                }
                if (name.equalsIgnoreCase((String) arrayList.get(i))) {
                    arrayList.remove(i);
                    arrayList.remove(i);
                    i -= 2;
                }
                i += 2;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/Headers$Companion;", "", "<init>", "()V", "Lokhttp3/Headers;", "EMPTY", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        public static Headers a(String... strArr) {
            String[] inputNamesAndValues = (String[]) Arrays.copyOf(strArr, strArr.length);
            Intrinsics.h(inputNamesAndValues, "inputNamesAndValues");
            if (inputNamesAndValues.length % 2 != 0) {
                throw new IllegalArgumentException("Expected alternating header names and values");
            }
            String[] strArr2 = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
            int length = strArr2.length;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (strArr2[i2] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i2] = StringsKt.k0(inputNamesAndValues[i2]).toString();
            }
            int iA = ProgressionUtilKt.a(0, strArr2.length - 1, 2);
            if (iA >= 0) {
                while (true) {
                    String str = strArr2[i];
                    String str2 = strArr2[i + 1];
                    _HeadersCommonKt.b(str);
                    _HeadersCommonKt.c(str2, str);
                    if (i == iA) {
                        break;
                    }
                    i += 2;
                }
            }
            return new Headers(strArr2);
        }

        private Companion() {
        }
    }

    public Headers(String[] namesAndValues) {
        Intrinsics.h(namesAndValues, "namesAndValues");
        this.d = namesAndValues;
    }

    public final String b(String str) {
        String[] namesAndValues = this.d;
        Intrinsics.h(namesAndValues, "namesAndValues");
        int length = namesAndValues.length - 2;
        int iA = ProgressionUtilKt.a(length, 0, -2);
        if (iA > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(namesAndValues[length])) {
            if (length == iA) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public final String d(int i) {
        String str = (String) ArraysKt.M(i * 2, this.d);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Headers) {
            return Arrays.equals(this.d, ((Headers) obj).d);
        }
        return false;
    }

    public final Builder g() {
        Builder builder = new Builder();
        CollectionsKt.j(builder.f26682a, this.d);
        return builder;
    }

    public final TreeMap h() {
        StringsKt.z();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            Locale locale = Locale.US;
            String strM = androidx.constraintlayout.core.state.a.m(locale, "US", strD, locale, "toLowerCase(...)");
            List arrayList = (List) treeMap.get(strM);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(strM, arrayList);
            }
            arrayList.add(i(i));
        }
        return treeMap;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d);
    }

    public final String i(int i) {
        String str = (String) ArraysKt.M((i * 2) + 1, this.d);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    @Override // java.lang.Iterable
    public final Iterator<Pair<? extends String, ? extends String>> iterator() {
        int size = size();
        Pair[] pairArr = new Pair[size];
        for (int i = 0; i < size; i++) {
            pairArr[i] = new Pair(d(i), i(i));
        }
        return ArrayIteratorKt.a(pairArr);
    }

    public final List j(String name) {
        Intrinsics.h(name, "name");
        int size = size();
        List listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            if (name.equalsIgnoreCase(d(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.g(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? EmptyList.d : listUnmodifiableList;
    }

    public final int size() {
        return this.d.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String strD = d(i);
            String strI = i(i);
            sb.append(strD);
            sb.append(": ");
            if (_UtilCommonKt.m(strD)) {
                strI = "██";
            }
            sb.append(strI);
            sb.append("\n");
        }
        return sb.toString();
    }
}
