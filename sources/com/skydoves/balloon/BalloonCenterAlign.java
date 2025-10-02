package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/skydoves/balloon/BalloonCenterAlign;", "", "Companion", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BalloonCenterAlign {
    public static final /* synthetic */ BalloonCenterAlign[] d = {new BalloonCenterAlign("START", 0), new BalloonCenterAlign("END", 1), new BalloonCenterAlign("TOP", 2), new BalloonCenterAlign("BOTTOM", 3)};

    /* JADX INFO: Fake field, exist only in values array */
    BalloonCenterAlign EF5;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/BalloonCenterAlign$Companion;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[BalloonCenterAlign.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }
    }

    public static BalloonCenterAlign valueOf(String str) {
        return (BalloonCenterAlign) Enum.valueOf(BalloonCenterAlign.class, str);
    }

    public static BalloonCenterAlign[] values() {
        return (BalloonCenterAlign[]) d.clone();
    }
}
