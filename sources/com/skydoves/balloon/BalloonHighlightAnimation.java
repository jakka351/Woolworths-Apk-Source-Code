package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/BalloonHighlightAnimation;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonHighlightAnimation {
    public static final BalloonHighlightAnimation d;
    public static final /* synthetic */ BalloonHighlightAnimation[] e;

    static {
        BalloonHighlightAnimation balloonHighlightAnimation = new BalloonHighlightAnimation("NONE", 0);
        d = balloonHighlightAnimation;
        e = new BalloonHighlightAnimation[]{balloonHighlightAnimation, new BalloonHighlightAnimation("HEARTBEAT", 1), new BalloonHighlightAnimation("SHAKE", 2), new BalloonHighlightAnimation("BREATH", 3), new BalloonHighlightAnimation("ROTATE", 4)};
    }

    public static BalloonHighlightAnimation valueOf(String str) {
        return (BalloonHighlightAnimation) Enum.valueOf(BalloonHighlightAnimation.class, str);
    }

    public static BalloonHighlightAnimation[] values() {
        return (BalloonHighlightAnimation[]) e.clone();
    }
}
