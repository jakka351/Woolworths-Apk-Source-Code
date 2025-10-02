package kotlin.collections;

import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* loaded from: classes.dex */
public class ArraysKt___ArraysKt extends ArraysKt___ArraysJvmKt {
    public static final void c(Object[] objArr, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, Function1 function1) {
        Intrinsics.h(objArr, "<this>");
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : objArr) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            StringsKt.l(sb, obj, function1);
        }
        sb.append(charSequence3);
    }

    public static final void d(Object[] objArr, HashSet hashSet) {
        Intrinsics.h(objArr, "<this>");
        for (Object obj : objArr) {
            hashSet.add(obj);
        }
    }
}
