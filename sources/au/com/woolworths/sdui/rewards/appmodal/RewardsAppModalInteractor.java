package au.com.woolworths.sdui.rewards.appmodal;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.coroutineutils.DispatcherProvider;
import au.com.woolworths.rewards.base.info.FeatureInfoBulletItem;
import au.com.woolworths.rewards.base.info.FeatureInfoHeading;
import au.com.woolworths.rewards.base.info.FeatureInfoItem;
import au.com.woolworths.rewards.base.info.FeatureInfoTextItem;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.PolymorphicModuleBuilder;
import kotlinx.serialization.modules.SerialModuleImpl;
import kotlinx.serialization.modules.SerializersModuleBuilder;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/sdui/rewards/appmodal/RewardsAppModalInteractor;", "", "rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RewardsAppModalInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final DispatcherProvider f10013a;
    public final SerialModuleImpl b;
    public final Json c;

    public RewardsAppModalInteractor(DispatcherProvider dispatchers) {
        Intrinsics.h(dispatchers, "dispatchers");
        this.f10013a = dispatchers;
        SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        PolymorphicModuleBuilder polymorphicModuleBuilder = new PolymorphicModuleBuilder(reflectionFactory.b(FeatureInfoItem.class));
        polymorphicModuleBuilder.a(reflectionFactory.b(FeatureInfoHeading.class), FeatureInfoHeading.INSTANCE.serializer());
        polymorphicModuleBuilder.a(reflectionFactory.b(FeatureInfoTextItem.class), FeatureInfoTextItem.INSTANCE.serializer());
        polymorphicModuleBuilder.a(reflectionFactory.b(FeatureInfoBulletItem.class), FeatureInfoBulletItem.INSTANCE.serializer());
        Iterator it = polymorphicModuleBuilder.b.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            KClass kClass = (KClass) pair.d;
            KSerializer kSerializer = (KSerializer) pair.e;
            Intrinsics.f(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<Base of kotlinx.serialization.modules.PolymorphicModuleBuilder>");
            Intrinsics.f(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            serializersModuleBuilder.g(polymorphicModuleBuilder.f24876a, kClass, kSerializer);
        }
        this.b = serializersModuleBuilder.f();
        this.c = JsonKt.a(new b(this, 2));
    }
}
