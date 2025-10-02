package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.unsigned.UArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
@SourceDebugExtension
/* loaded from: classes.dex */
class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    public static final void b(Object[] objArr, StringBuilder sb, ArrayList arrayList) {
        if (arrayList.contains(objArr)) {
            sb.append("[...]");
            return;
        }
        arrayList.add(objArr);
        sb.append('[');
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (i != 0) {
                sb.append(", ");
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else if (obj instanceof Object[]) {
                b((Object[]) obj, sb, arrayList);
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                Intrinsics.g(string, "toString(...)");
                sb.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                Intrinsics.g(string2, "toString(...)");
                sb.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                Intrinsics.g(string3, "toString(...)");
                sb.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                Intrinsics.g(string4, "toString(...)");
                sb.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                Intrinsics.g(string5, "toString(...)");
                sb.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                Intrinsics.g(string6, "toString(...)");
                sb.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                Intrinsics.g(string7, "toString(...)");
                sb.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                Intrinsics.g(string8, "toString(...)");
                sb.append(string8);
            } else if (obj instanceof UByteArray) {
                sb.append(UArraysKt.e(((UByteArray) obj).getD()));
            } else if (obj instanceof UShortArray) {
                sb.append(UArraysKt.g(((UShortArray) obj).getD()));
            } else if (obj instanceof UIntArray) {
                sb.append(UArraysKt.f(((UIntArray) obj).getD()));
            } else if (obj instanceof ULongArray) {
                sb.append(UArraysKt.h(((ULongArray) obj).d));
            } else {
                sb.append(obj.toString());
            }
        }
        sb.append(']');
        arrayList.remove(CollectionsKt.I(arrayList));
    }
}
