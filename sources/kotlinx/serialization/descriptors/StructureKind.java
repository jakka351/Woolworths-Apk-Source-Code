package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "CLASS", "LIST", "MAP", "OBJECT", "Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public abstract class StructureKind extends SerialKind {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$CLASS;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CLASS extends StructureKind {

        /* renamed from: a, reason: collision with root package name */
        public static final CLASS f24774a = new CLASS();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$LIST;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LIST extends StructureKind {

        /* renamed from: a, reason: collision with root package name */
        public static final LIST f24775a = new LIST();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$MAP;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class MAP extends StructureKind {

        /* renamed from: a, reason: collision with root package name */
        public static final MAP f24776a = new MAP();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/StructureKind$OBJECT;", "Lkotlinx/serialization/descriptors/StructureKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class OBJECT extends StructureKind {

        /* renamed from: a, reason: collision with root package name */
        public static final OBJECT f24777a = new OBJECT();
    }
}
