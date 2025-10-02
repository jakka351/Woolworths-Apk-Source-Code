package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationStrategy;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001\u0082\u0001\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/serialization/modules/SerializersModule;", "", "Lkotlinx/serialization/modules/SerialModuleImpl;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class SerializersModule {
    public abstract void a(SerializersModuleCollector serializersModuleCollector);

    public abstract KSerializer b(KClass kClass, List list);

    /* renamed from: c */
    public abstract boolean getF();

    public abstract DeserializationStrategy d(KClass kClass, String str);

    public abstract SerializationStrategy e(KClass kClass, Object obj);
}
