package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.Utils;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CompoundTrimPathContent {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13355a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.f13355a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            TrimPathContent trimPathContent = (TrimPathContent) arrayList.get(size);
            ThreadLocal threadLocal = Utils.f13480a;
            if (trimPathContent != null && !trimPathContent.f13368a) {
                Utils.a(path, trimPathContent.d.k() / 100.0f, trimPathContent.e.k() / 100.0f, trimPathContent.f.k() / 360.0f);
            }
        }
    }
}
