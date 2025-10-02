package nl.dionsegijn.konfetti.core.emitter;

import YU.a;
import android.graphics.Rect;
import java.util.Random;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.Rotation;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lnl/dionsegijn/konfetti/core/emitter/PartyEmitter;", "Lnl/dionsegijn/konfetti/core/emitter/BaseEmitter;", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PartyEmitter extends BaseEmitter {

    /* renamed from: a, reason: collision with root package name */
    public final EmitterConfig f26643a;
    public final float b;
    public final Random c;
    public float d;
    public float e;

    public PartyEmitter(EmitterConfig emitterConfig, float f) {
        Random random = new Random();
        Intrinsics.h(emitterConfig, "emitterConfig");
        this.f26643a = emitterConfig;
        this.b = f;
        this.c = random;
    }

    public final Position.Absolute a(Position position, Rect rect) {
        if (position instanceof Position.Absolute) {
            Position.Absolute absolute = (Position.Absolute) position;
            return new Position.Absolute(absolute.f26637a, absolute.b);
        }
        if (position instanceof Position.Relative) {
            Position.Relative relative = (Position.Relative) position;
            return new Position.Absolute(rect.width() * ((float) relative.f26638a), rect.height() * ((float) relative.b));
        }
        if (!(position instanceof Position.between)) {
            throw new NoWhenBranchMatchedException();
        }
        Position.between betweenVar = (Position.between) position;
        Position.Absolute absoluteA = a(betweenVar.f26639a, rect);
        Position.Absolute absoluteA2 = a(betweenVar.b, rect);
        Random random = this.c;
        float fNextFloat = random.nextFloat();
        float f = absoluteA2.f26637a;
        float f2 = absoluteA.f26637a;
        float fA = a.a(f, f2, fNextFloat, f2);
        float fNextFloat2 = random.nextFloat();
        float f3 = absoluteA2.b;
        float f4 = absoluteA.b;
        return new Position.Absolute(fA, a.a(f3, f4, fNextFloat2, f4));
    }

    public final float b(Rotation rotation) {
        rotation.getClass();
        return (((this.c.nextFloat() * 2.0f) - 1.0f) * 0.5f) + 1.0f;
    }
}
