package kotlin.reflect.jvm.internal.impl.metadata.builtins;

import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.IntRange;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;

/* loaded from: classes7.dex */
public final class BuiltInsBinaryVersion extends BinaryVersion {
    public static final BuiltInsBinaryVersion f = new BuiltInsBinaryVersion(1, 0, 7);

    @SourceDebugExtension
    public static final class Companion {
        public static BuiltInsBinaryVersion a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            IntRange intRange = new IntRange(1, dataInputStream.readInt(), 1);
            ArrayList arrayList = new ArrayList(CollectionsKt.s(intRange, 10));
            IntProgressionIterator it = intRange.iterator();
            while (it.f) {
                it.nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrF0 = CollectionsKt.F0(arrayList);
            return new BuiltInsBinaryVersion(Arrays.copyOf(iArrF0, iArrF0.length));
        }
    }

    static {
        new BuiltInsBinaryVersion(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuiltInsBinaryVersion(int... numbers) {
        super(Arrays.copyOf(numbers, numbers.length));
        Intrinsics.h(numbers, "numbers");
    }
}
