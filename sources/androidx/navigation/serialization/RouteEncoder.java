package androidx.navigation.serialization;

import androidx.annotation.RestrictTo;
import androidx.navigation.CollectionNavType;
import androidx.navigation.NavType;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/navigation/serialization/RouteEncoder;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/serialization/encoding/AbstractEncoder;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
/* loaded from: classes2.dex */
public final class RouteEncoder<T> extends AbstractEncoder {

    /* renamed from: a, reason: collision with root package name */
    public final KSerializer f3516a;
    public final LinkedHashMap b;
    public final SerialModuleImpl c = SerializersModuleKt.f24879a;
    public final LinkedHashMap d = new LinkedHashMap();
    public int e = -1;

    public RouteEncoder(KSerializer kSerializer, LinkedHashMap linkedHashMap) {
        this.f3516a = kSerializer;
        this.b = linkedHashMap;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final boolean H(SerialDescriptor descriptor, int i) {
        Intrinsics.h(descriptor, "descriptor");
        this.e = i;
        return true;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    public final void I(Object value) {
        Intrinsics.h(value, "value");
        J(value);
    }

    public final void J(Object obj) {
        String strG = this.f3516a.getB().g(this.e);
        NavType navType = (NavType) this.b.get(strG);
        if (navType == null) {
            throw new IllegalStateException(YU.a.h("Cannot find NavType for argument ", strG, ". Please provide NavType through typeMap.").toString());
        }
        this.d.put(strG, navType instanceof CollectionNavType ? ((CollectionNavType) navType).h(obj) : CollectionsKt.Q(navType.f(obj)));
    }

    @Override // kotlinx.serialization.encoding.Encoder
    /* renamed from: a */
    public final SerializersModule getF24851a() {
        return this.c;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void e(SerializationStrategy serializer, Object obj) {
        Intrinsics.h(serializer, "serializer");
        J(obj);
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final Encoder j(SerialDescriptor descriptor) {
        Intrinsics.h(descriptor, "descriptor");
        if (RouteSerializerKt.d(descriptor)) {
            this.e = 0;
        }
        return this;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public final void z() {
        J(null);
    }
}
