package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import YU.a;
import com.salesforce.marketingcloud.messages.iam.j;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt$asList$3;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class BinaryVersion {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f24485a;
    public final int b;
    public final int c;
    public final int d;
    public final List e;

    @SourceDebugExtension
    public static final class Companion {
    }

    public BinaryVersion(int... numbers) {
        List listG0;
        Intrinsics.h(numbers, "numbers");
        this.f24485a = numbers;
        Integer numL = ArraysKt.L(0, numbers);
        this.b = numL != null ? numL.intValue() : -1;
        Integer numL2 = ArraysKt.L(1, numbers);
        this.c = numL2 != null ? numL2.intValue() : -1;
        Integer numL3 = ArraysKt.L(2, numbers);
        this.d = numL3 != null ? numL3.intValue() : -1;
        if (numbers.length <= 3) {
            listG0 = EmptyList.d;
        } else {
            if (numbers.length > 1024) {
                throw new IllegalArgumentException(a.l(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), numbers.length, JwtParser.SEPARATOR_CHAR));
            }
            listG0 = CollectionsKt.G0(new ArraysKt___ArraysJvmKt$asList$3(numbers).subList(3, numbers.length));
        }
        this.e = listG0;
    }

    public final boolean a(int i, int i2, int i3) {
        int i4 = this.b;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.c;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.d >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        BinaryVersion binaryVersion = (BinaryVersion) obj;
        return this.b == binaryVersion.b && this.c == binaryVersion.c && this.d == binaryVersion.d && Intrinsics.c(this.e, binaryVersion.e);
    }

    public final int hashCode() {
        int i = this.b;
        int i2 = (i * 31) + this.c + i;
        int i3 = (i2 * 31) + this.d + i2;
        return this.e.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.f24485a) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? j.h : CollectionsKt.M(arrayList, ".", null, null, null, 62);
    }
}
