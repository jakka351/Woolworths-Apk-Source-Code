package kotlin.random;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/random/AbstractPlatformRandom;", "Lkotlin/random/Random;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class AbstractPlatformRandom extends Random {
    @Override // kotlin.random.Random
    public final int a(int i) {
        return RandomKt.e(f().nextInt(), i);
    }

    @Override // kotlin.random.Random
    public final double b() {
        return f().nextDouble();
    }

    @Override // kotlin.random.Random
    public final int d() {
        return f().nextInt();
    }

    public abstract java.util.Random f();

    public final float g() {
        return f().nextFloat();
    }
}
