package com.skydoves.balloon.overlay;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonOverlayAnimation;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonOverlayAnimation {
    public static final BalloonOverlayAnimation d;
    public static final /* synthetic */ BalloonOverlayAnimation[] e;

    /* JADX INFO: Fake field, exist only in values array */
    BalloonOverlayAnimation EF0;

    static {
        BalloonOverlayAnimation balloonOverlayAnimation = new BalloonOverlayAnimation("NONE", 0);
        BalloonOverlayAnimation balloonOverlayAnimation2 = new BalloonOverlayAnimation("FADE", 1);
        d = balloonOverlayAnimation2;
        e = new BalloonOverlayAnimation[]{balloonOverlayAnimation, balloonOverlayAnimation2};
    }

    public static BalloonOverlayAnimation valueOf(String str) {
        return (BalloonOverlayAnimation) Enum.valueOf(BalloonOverlayAnimation.class, str);
    }

    public static BalloonOverlayAnimation[] values() {
        return (BalloonOverlayAnimation[]) e.clone();
    }
}
