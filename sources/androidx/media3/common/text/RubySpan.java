package androidx.media3.common.text;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class RubySpan implements LanguageFeatureSpan {
    public static final String c;
    public static final String d;

    /* renamed from: a, reason: collision with root package name */
    public final String f2900a;
    public final int b;

    static {
        int i = Util.f2928a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public RubySpan(String str, int i) {
        this.f2900a = str;
        this.b = i;
    }
}
