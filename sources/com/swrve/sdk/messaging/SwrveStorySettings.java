package com.swrve.sdk.messaging;

/* loaded from: classes6.dex */
public class SwrveStorySettings {

    /* renamed from: a, reason: collision with root package name */
    public int f19103a;
    public LastPageProgression b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public int h;
    public int i;
    public boolean j;
    public SwrveStoryDismissButton k;
    public long l;
    public String m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class LastPageProgression {
        public static final LastPageProgression d;
        public static final LastPageProgression e;
        public static final LastPageProgression f;
        public static final /* synthetic */ LastPageProgression[] g;

        static {
            LastPageProgression lastPageProgression = new LastPageProgression("DISMISS", 0);
            d = lastPageProgression;
            LastPageProgression lastPageProgression2 = new LastPageProgression("STOP", 1);
            e = lastPageProgression2;
            LastPageProgression lastPageProgression3 = new LastPageProgression("LOOP", 2);
            f = lastPageProgression3;
            g = new LastPageProgression[]{lastPageProgression, lastPageProgression2, lastPageProgression3};
        }

        public static LastPageProgression valueOf(String str) {
            return (LastPageProgression) Enum.valueOf(LastPageProgression.class, str);
        }

        public static LastPageProgression[] values() {
            return (LastPageProgression[]) g.clone();
        }
    }
}
