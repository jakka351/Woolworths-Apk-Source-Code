package kotlinx.serialization.internal;

import androidx.compose.ui.platform.i;
import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AbstractPolymorphicSerializerKt {
    public static final void a(KClass baseClass, String str) {
        String string;
        Intrinsics.h(baseClass, "baseClass");
        String str2 = "in the polymorphic scope of '" + baseClass.B() + '\'';
        if (str == null) {
            string = i.a(JwtParser.SEPARATOR_CHAR, "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbV = YU.a.v("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            androidx.constraintlayout.core.state.a.B(sbV, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbV.append(baseClass.B());
            sbV.append("' has to be sealed and '@Serializable'.");
            string = sbV.toString();
        }
        throw new SerializationException(string);
    }
}
