package androidx.activity.result;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.random.Random;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ActivityResultRegistry$generateRandomNumber$1 extends Lambda implements Function0<Integer> {
    public static final ActivityResultRegistry$generateRandomNumber$1 h = new ActivityResultRegistry$generateRandomNumber$1(0);

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return Integer.valueOf(Random.e.f().nextInt(2147418112) + 65536);
    }
}
