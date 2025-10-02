package androidx.compose.ui.window;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AndroidDialog_androidKt$Dialog$dialogId$1 extends Lambda implements Function0<UUID> {
    public static final AndroidDialog_androidKt$Dialog$dialogId$1 h = new AndroidDialog_androidKt$Dialog$dialogId$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return UUID.randomUUID();
    }
}
