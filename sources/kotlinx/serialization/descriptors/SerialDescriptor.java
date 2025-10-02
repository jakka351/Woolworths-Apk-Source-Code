package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/descriptors/SerialDescriptor;", "", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SerialDescriptor {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    boolean b();

    int c(String str);

    SerialDescriptor d(int i);

    int e();

    SerialKind f();

    String g(int i);

    List getAnnotations();

    List h(int i);

    String i();

    boolean isInline();

    boolean j(int i);
}
