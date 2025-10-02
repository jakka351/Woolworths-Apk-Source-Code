package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"navigation-common_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavTypeConverter_androidKt {
    public static final Class a(SerialDescriptor serialDescriptor) {
        String strQ = StringsKt.Q(serialDescriptor.getB(), "?", "", false);
        try {
            return Class.forName(strQ);
        } catch (ClassNotFoundException unused) {
            if (StringsKt.o(strQ, ".", false)) {
                return Class.forName(androidx.camera.core.impl.b.D("(\\.+)(?!.*\\.)", strQ, "\\$"));
            }
            String strG = "Cannot find class with name \"" + serialDescriptor.getB() + "\". Ensure that the serialName for this argument is the default fully qualified name";
            if (serialDescriptor.getB() instanceof SerialKind.ENUM) {
                strG = YU.a.g(strG, ".\nIf the build is minified, try annotating the Enum class with \"androidx.annotation.Keep\" to ensure the Enum is not removed.");
            }
            throw new IllegalArgumentException(strG);
        }
    }
}
