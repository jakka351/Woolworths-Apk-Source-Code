package com.skydoves.balloon;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/skydoves/balloon/ArrowOrientation;", "", "Companion", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ArrowOrientation {
    public static final ArrowOrientation d;
    public static final ArrowOrientation e;
    public static final ArrowOrientation f;
    public static final ArrowOrientation g;
    public static final /* synthetic */ ArrowOrientation[] h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/skydoves/balloon/ArrowOrientation$Companion;", "", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[ArrowOrientation.values().length];
                try {
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }
    }

    static {
        ArrowOrientation arrowOrientation = new ArrowOrientation("BOTTOM", 0);
        d = arrowOrientation;
        ArrowOrientation arrowOrientation2 = new ArrowOrientation("TOP", 1);
        e = arrowOrientation2;
        ArrowOrientation arrowOrientation3 = new ArrowOrientation("START", 2);
        f = arrowOrientation3;
        ArrowOrientation arrowOrientation4 = new ArrowOrientation("END", 3);
        g = arrowOrientation4;
        h = new ArrowOrientation[]{arrowOrientation, arrowOrientation2, arrowOrientation3, arrowOrientation4};
    }

    public static ArrowOrientation valueOf(String str) {
        return (ArrowOrientation) Enum.valueOf(ArrowOrientation.class, str);
    }

    public static ArrowOrientation[] values() {
        return (ArrowOrientation[]) h.clone();
    }
}
