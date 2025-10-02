package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0005\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind;", "", "ENUM", "CONTEXTUAL", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/PrimitiveKind;", "Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public abstract class SerialKind {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind$CONTEXTUAL;", "Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ExperimentalSerializationApi
    public static final class CONTEXTUAL extends SerialKind {

        /* renamed from: a, reason: collision with root package name */
        public static final CONTEXTUAL f24772a = new CONTEXTUAL();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialKind$ENUM;", "Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @ExperimentalSerializationApi
    /* loaded from: classes7.dex */
    public static final class ENUM extends SerialKind {

        /* renamed from: a, reason: collision with root package name */
        public static final ENUM f24773a = new ENUM();
    }

    public final int hashCode() {
        return toString().hashCode();
    }

    public final String toString() {
        String strB = Reflection.f24268a.b(getClass()).B();
        Intrinsics.e(strB);
        return strB;
    }
}
