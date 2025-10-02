package androidx.media3.common.text;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes2.dex */
public final class CueGroup {
    public static final CueGroup b = new CueGroup(ImmutableList.t());

    /* renamed from: a, reason: collision with root package name */
    public final ImmutableList f2898a;

    static {
        Util.E(0);
        Util.E(1);
    }

    public CueGroup(List list) {
        this.f2898a = ImmutableList.o(list);
    }
}
