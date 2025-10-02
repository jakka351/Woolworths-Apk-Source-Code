package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider;", "", "Argless", "WithTypeArguments", "Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class ContextualProvider {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$Argless;", "Lkotlinx/serialization/modules/ContextualProvider;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Argless extends ContextualProvider {

        /* renamed from: a, reason: collision with root package name */
        public final KSerializer f24874a;

        public Argless(KSerializer kSerializer) {
            this.f24874a = kSerializer;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public final KSerializer a(List typeArgumentsSerializers) {
            Intrinsics.h(typeArgumentsSerializers, "typeArgumentsSerializers");
            return this.f24874a;
        }

        /* renamed from: b, reason: from getter */
        public final KSerializer getF24874a() {
            return this.f24874a;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Argless) && Intrinsics.c(((Argless) obj).f24874a, this.f24874a);
        }

        public final int hashCode() {
            return this.f24874a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/ContextualProvider$WithTypeArguments;", "Lkotlinx/serialization/modules/ContextualProvider;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WithTypeArguments extends ContextualProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f24875a;

        public WithTypeArguments(Function1 provider) {
            Intrinsics.h(provider, "provider");
            this.f24875a = provider;
        }

        @Override // kotlinx.serialization.modules.ContextualProvider
        public final KSerializer a(List typeArgumentsSerializers) {
            Intrinsics.h(typeArgumentsSerializers, "typeArgumentsSerializers");
            return (KSerializer) this.f24875a.invoke(typeArgumentsSerializers);
        }

        /* renamed from: b, reason: from getter */
        public final Function1 getF24875a() {
            return this.f24875a;
        }
    }

    public abstract KSerializer a(List list);
}
