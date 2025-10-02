package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/BalloonAnimation;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonAnimation {
    public static final BalloonAnimation d;
    public static final BalloonAnimation e;
    public static final /* synthetic */ BalloonAnimation[] f;

    /* JADX INFO: Fake field, exist only in values array */
    BalloonAnimation EF0;

    static {
        BalloonAnimation balloonAnimation = new BalloonAnimation("NONE", 0);
        BalloonAnimation balloonAnimation2 = new BalloonAnimation("ELASTIC", 1);
        BalloonAnimation balloonAnimation3 = new BalloonAnimation("FADE", 2);
        d = balloonAnimation3;
        BalloonAnimation balloonAnimation4 = new BalloonAnimation("CIRCULAR", 3);
        e = balloonAnimation4;
        f = new BalloonAnimation[]{balloonAnimation, balloonAnimation2, balloonAnimation3, balloonAnimation4, new BalloonAnimation("OVERSHOOT", 4)};
    }

    public static BalloonAnimation valueOf(String str) {
        return (BalloonAnimation) Enum.valueOf(BalloonAnimation.class, str);
    }

    public static BalloonAnimation[] values() {
        return (BalloonAnimation[]) f.clone();
    }
}
