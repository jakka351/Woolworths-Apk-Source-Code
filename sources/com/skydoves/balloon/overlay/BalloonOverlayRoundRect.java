package com.skydoves.balloon.overlay;

import kotlin.Metadata;
import kotlin.Pair;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/overlay/BalloonOverlayRoundRect;", "Lcom/skydoves/balloon/overlay/BalloonOverlayShape;", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonOverlayRoundRect extends BalloonOverlayShape {

    /* renamed from: a, reason: collision with root package name */
    public final Pair f19024a;
    public final Pair b;

    public BalloonOverlayRoundRect(Pair pair, Pair pair2, int i) {
        pair = (i & 1) != 0 ? null : pair;
        pair2 = (i & 2) != 0 ? null : pair2;
        this.f19024a = pair;
        this.b = pair2;
    }
}
