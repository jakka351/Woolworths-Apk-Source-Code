package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import YU.a;
import io.jsonwebtoken.JwtParser;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes7.dex */
public final class ClassMapperLite {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24492a = CollectionsKt.M(CollectionsKt.R('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
    public static final LinkedHashMap b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listR = CollectionsKt.R("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA = ProgressionUtilKt.a(0, listR.size() - 1, 2);
        if (iA >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f24492a;
                sb.append(str);
                sb.append('/');
                sb.append((String) listR.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listR.get(i2));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(a.o(sb2, (String) listR.get(i), "Array"), "[" + ((String) listR.get(i2)));
                if (i == iA) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f24492a + "/Unit", "V");
        a("Any", "java/lang/Object", linkedHashMap);
        a("Nothing", "java/lang/Void", linkedHashMap);
        a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : CollectionsKt.R("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(str2, "java/lang/" + str2, linkedHashMap);
        }
        for (String str3 : CollectionsKt.R("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(a.A("collections/", str3), "java/util/" + str3, linkedHashMap);
            a("collections/Mutable" + str3, "java/util/" + str3, linkedHashMap);
        }
        a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i3 = 0; i3 < 23; i3++) {
            String strD = a.d(i3, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f24492a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i3);
            a(strD, sb3.toString(), linkedHashMap);
            a("reflect/KFunction" + i3, str4 + "/reflect/KFunction", linkedHashMap);
        }
        for (String str5 : CollectionsKt.R("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(a.g(str5, ".Companion"), androidx.constraintlayout.core.state.a.l(new StringBuilder(), f24492a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        b = linkedHashMap;
    }

    public static final void a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f24492a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        Intrinsics.h(classId, "classId");
        String str = (String) b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + StringsKt.R(classId, JwtParser.SEPARATOR_CHAR, '$') + ';';
    }
}
