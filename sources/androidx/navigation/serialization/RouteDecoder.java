package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/navigation/serialization/RouteDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class RouteDecoder extends AbstractDecoder {

    /* renamed from: a, reason: collision with root package name */
    public final SavedStateArgStore f3515a;
    public int b = -1;
    public String c = "";
    public final SerialModuleImpl d = SerializersModuleKt.f24879a;

    public RouteDecoder(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.f3515a = new SavedStateArgStore(bundle, linkedHashMap);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final boolean C() {
        String key = this.c;
        SavedStateArgStore savedStateArgStore = this.f3515a;
        savedStateArgStore.getClass();
        Intrinsics.h(key, "key");
        NavType navType = (NavType) savedStateArgStore.b.get(key);
        return (navType != null ? navType.a(savedStateArgStore.f3517a, key) : null) != null;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Object E(DeserializationStrategy deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        return H();
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder
    public final Object G() {
        return H();
    }

    public final Object H() {
        String key = this.c;
        SavedStateArgStore savedStateArgStore = this.f3515a;
        savedStateArgStore.getClass();
        Intrinsics.h(key, "key");
        NavType navType = (NavType) savedStateArgStore.b.get(key);
        Object objA = navType != null ? navType.a(savedStateArgStore.f3517a, key) : null;
        if (objA != null) {
            return objA;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.c).toString());
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    /* renamed from: a */
    public final SerializersModule getB() {
        return this.d;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final void h() {
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public final int u(SerialDescriptor descriptor) {
        String key;
        SavedStateArgStore savedStateArgStore;
        Intrinsics.h(descriptor, "descriptor");
        int i = this.b;
        do {
            i++;
            if (i >= descriptor.getC()) {
                return -1;
            }
            key = descriptor.g(i);
            savedStateArgStore = this.f3515a;
            savedStateArgStore.getClass();
            Intrinsics.h(key, "key");
        } while (!savedStateArgStore.f3517a.containsKey(key));
        this.b = i;
        this.c = key;
        return i;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public final Decoder v(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (RouteSerializerKt.d(descriptor)) {
            this.c = descriptor.g(0);
            this.b = 0;
        }
        return this;
    }
}
