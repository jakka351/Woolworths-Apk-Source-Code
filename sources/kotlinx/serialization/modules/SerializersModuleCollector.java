package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/modules/SerializersModuleCollector;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ExperimentalSerializationApi
/* loaded from: classes7.dex */
public interface SerializersModuleCollector {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    void a(KClass kClass, Function1 function1);

    void b(KClass kClass, Function1 function1);

    void c(KClass kClass, KClass kClass2, KSerializer kSerializer);

    void d(KClass kClass, KSerializer kSerializer);

    void e(KClass kClass, Function1 function1);
}
