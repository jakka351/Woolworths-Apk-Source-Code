package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind;", "Lkotlinx/serialization/descriptors/SerialKind;", "SEALED", "OPEN", "Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes.dex */
public abstract class PolymorphicKind extends SerialKind {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind$OPEN;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class OPEN extends PolymorphicKind {

        /* renamed from: a, reason: collision with root package name */
        public static final OPEN f24760a = new OPEN();
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/PolymorphicKind$SEALED;", "Lkotlinx/serialization/descriptors/PolymorphicKind;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class SEALED extends PolymorphicKind {

        /* renamed from: a, reason: collision with root package name */
        public static final SEALED f24761a = new SEALED();
    }
}
