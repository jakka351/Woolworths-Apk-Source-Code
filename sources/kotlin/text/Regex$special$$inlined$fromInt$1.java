package kotlin.text;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class Regex$special$$inlined$fromInt$1 implements Function1<RegexOption, Boolean> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FlagEnum flagEnum = (FlagEnum) ((Enum) obj);
        flagEnum.getClass();
        return Boolean.valueOf(flagEnum.getD() == 0);
    }
}
